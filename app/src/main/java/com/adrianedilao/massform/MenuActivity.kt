package com.adrianedilao.massform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrianedilao.massform.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.workoutAOptionButton.setOnClickListener {
            //open new activity full of workout a
            val intent = Intent(this, AWorkoutActivity::class.java)
            startActivity(intent)
        }

        binding.workoutBOptionButton.setOnClickListener {
            val intent = Intent(this, BWorkoutActivity::class.java)
            startActivity(intent)
        }

        binding.weightConverterOptionButton.setOnClickListener {
            //open weight converter activity
            val intent = Intent(this, WeightConverterActivity::class.java)
            startActivity(intent)
        }
    }
}