package com.adrianedilao.massform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.adrianedilao.massform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val givenUsername = "Adriane"
        val givenPassword = "password123"
        var username: String
        var password: String

        binding.loginButton.setOnClickListener {
            username = binding.usernameTextInputEditText.text.toString()
            password = binding.passwordTextInputEditText.text.toString()

            when {
                username.isEmpty() -> {
                    //username is empty error
                    binding.usernameTextInputEditText.error = getString(R.string.username_empty_error)
                }
                username.length < 4 || username.length > 16 -> {
                    //username length error
                    binding.usernameTextInputEditText.error = getString(R.string.username_length_error)
                }
                password.isEmpty() -> {
                    //password is empty error
                    binding.passwordTextInputEditText.error = getString(R.string.password_empty_error)
                }
                password.length < 8 || password.length > 32 -> {
                    //password length error
                    binding.passwordTextInputEditText.error = getString(R.string.password_length_error)
                }
                else -> {
                    if (username == givenUsername) {
                        if (password == givenPassword) {
                            //if username & password is correct, login success
                            Toast.makeText(this, getString(R.string.successful_login_toast), Toast.LENGTH_LONG)
                                .show()
                            val intent = Intent(this, MenuActivity::class.java)
                            startActivity(intent)
                        } else {
                            //if username or password incorrect, show toast
                            Toast.makeText(this, R.string.invalid_login_toast, Toast.LENGTH_LONG).show()
                        }
                    } else {
                        //if username or password incorrect, show toast
                        Toast.makeText(this, R.string.invalid_login_toast, Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }
}