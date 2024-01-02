package com.example.dicerollar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dicerollar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.diceImage.setOnClickListener {
            diceRoll()
        }
        binding.rollButton.setOnClickListener {
            diceRoll()
        }
    }

    private fun diceRoll() {
        var randomNo = (1..6).random()
        var imageDice : Int
        when (randomNo) {
            1 -> {
                imageDice = R.drawable.dice_1
            }
            2 -> {
                imageDice = R.drawable.dice_2
            }
            3 -> {
                imageDice = R.drawable.dice_3
            }
            4 -> {
                imageDice = R.drawable.dice_4
            }
            5 -> {
                imageDice = R.drawable.dice_5
            }
            else -> {
                imageDice = R.drawable.dice_6
            }
        }
        binding.diceImage.setImageResource(imageDice)

        Toast.makeText(this, "Dice is Rolled", Toast.LENGTH_SHORT).show()
    }

}