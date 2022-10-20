package com.adrianedilao.massform.data

import com.adrianedilao.massform.R
import com.adrianedilao.massform.model.Exercise

class Datasource {
    fun loadWorkoutA(): List<Exercise>{
        return listOf<Exercise>(
            Exercise(R.drawable.upper1pic, R.string.upper1, R.string.upper1target),
            Exercise(R.drawable.upper2pic, R.string.upper2, R.string.upper2target),
            Exercise(R.drawable.upper3pic, R.string.upper3, R.string.upper3target),
            Exercise(R.drawable.upper4pic, R.string.upper4, R.string.upper4target),
            Exercise(R.drawable.upper5pic, R.string.upper5, R.string.upper5target),
            Exercise(R.drawable.upper6pic, R.string.upper6, R.string.upper6target),
            Exercise(R.drawable.upper7pic, R.string.upper7, R.string.upper7target)
        )
    }

    fun loadWorkoutB(): List<Exercise>{
        return listOf<Exercise>(
            Exercise(R.drawable.lower1pic, R.string.lower1, R.string.lower1target),
            Exercise(R.drawable.lower2pic, R.string.lower2, R.string.lower2target),
            Exercise(R.drawable.lower3pic, R.string.lower3, R.string.lower3target),
            Exercise(R.drawable.lower4pic, R.string.lower4, R.string.lower4target),
            Exercise(R.drawable.lower5pic, R.string.lower5, R.string.lower5target),
            Exercise(R.drawable.lower6pic, R.string.lower6, R.string.lower6target)
        )
    }
}