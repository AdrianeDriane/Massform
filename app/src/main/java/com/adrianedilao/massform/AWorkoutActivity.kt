package com.adrianedilao.massform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrianedilao.massform.adapter.ExerciseCardAdapter
import com.adrianedilao.massform.data.Datasource
import com.adrianedilao.massform.databinding.ActivityAworkoutBinding

class AWorkoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAworkoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAworkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = Datasource().loadWorkoutA()

        binding.aworkoutRecyclerView.adapter = ExerciseCardAdapter(applicationContext, myDataSet)

        binding.aworkoutRecyclerView.setHasFixedSize(true)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}