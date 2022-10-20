package com.adrianedilao.massform.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Exercise (@DrawableRes val imageResourceId: Int, @StringRes val workoutResourceId: Int, @StringRes val targetResourceId: Int)