package com.adrianedilao.massform.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.adrianedilao.massform.R
import com.adrianedilao.massform.model.Exercise

class ExerciseCardAdapter (
    private val context: Context,
    private val dataset: List<Exercise>): RecyclerView.Adapter<ExerciseCardAdapter.ExerciseCardViewHolder>() {

        class ExerciseCardViewHolder(view: View): RecyclerView.ViewHolder(view){
            val imageView: ImageView = view.findViewById(R.id.workout_image)
            val workoutNameTextView: TextView = view.findViewById(R.id.workout_name)
            val workoutTargetTextVIew: TextView = view.findViewById(R.id.workout_target)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseCardViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.workout_item, parent, false)
        return ExerciseCardViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ExerciseCardViewHolder, position: Int) {
        val workoutItem = dataset[position]
        holder.imageView.setImageResource(workoutItem.imageResourceId)
        holder.workoutNameTextView.text = context.resources.getString(workoutItem.workoutResourceId)
        holder.workoutTargetTextVIew.text = context.resources.getString(workoutItem.targetResourceId)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}