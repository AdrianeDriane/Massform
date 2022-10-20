package com.adrianedilao.massform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrianedilao.massform.adapter.ExerciseCardAdapter
import com.adrianedilao.massform.data.Datasource
import com.adrianedilao.massform.databinding.ActivityBworkoutBinding

class BWorkoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBworkoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBworkoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = Datasource().loadWorkoutB()

        binding.bworkoutRecyclerView.adapter = ExerciseCardAdapter(applicationContext, myDataSet)

        binding.bworkoutRecyclerView.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}