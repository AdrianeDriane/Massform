package com.adrianedilao.massform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adrianedilao.massform.databinding.ActivityWeightConverterBinding

class WeightConverterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWeightConverterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWeightConverterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener { calculateConversion() }
    }

    private fun calculateConversion(){
        val weight = binding.weightFromTextInputEditText.text.toString().toDoubleOrNull()
        val roundedWeight: Double
        val weightA: Double

        if (weight == null) {
            displayConversion(0.0)
        } else {
            weightA = weight.toDouble()

            roundedWeight = when (binding.rgConversionOptions.checkedRadioButtonId){
                R.id.rb_option_lbs_to_kg -> { kotlin.math.ceil((weightA * 0.45)) }
                else -> { kotlin.math.ceil((weightA * 2.20))}
            }
            displayConversion(roundedWeight)
        }
    }

    private fun displayConversion(weight: Double){
        when (binding.rgConversionOptions.checkedRadioButtonId){
            R.id.rb_option_lbs_to_kg -> {
                binding.conversionResultTextView.text = getString(R.string.kg_unit, weight.toString())
            }
            R.id.rb_option_kg_to_lbs -> {
                binding.conversionResultTextView.text = getString(R.string.lbs_unit, weight.toString())
            }
        }
    }

}