package com.example.calculaterapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculaterapp.databinding.ActivityMainBinding
import java.text.NumberFormat


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root



        setContentView(view)

        var number=binding.FirstNumber.text
        var number1=binding.SecoundNumber.text
        val total =binding.total


        binding.add.setOnClickListener {
            total.text=  getString(R.string.total,add(number.toString().toDouble(),number1.toString().toDouble()))
        }
        binding.sub.setOnClickListener {
            total.text =   getString(R.string.total,sub(number.toString().toDouble(),number1.toString().toDouble()))

        }
        binding.div.setOnClickListener {
            total.text = getString(R.string.total,div(number.toString().toDouble(),number1.toString().toDouble()))
        }
//        }
    }
    private  fun add(number: Double ,number1:Double):String{
        val total = number+number1
        return total.toString()

    }
    private fun sub(number: Double ,number1:Double):String{
        val total = number-number1
        return total.toString()
    }
    private fun div(number: Double ,number1:Double):String{
        val total = number/number1
        return total.toString()
    }
}