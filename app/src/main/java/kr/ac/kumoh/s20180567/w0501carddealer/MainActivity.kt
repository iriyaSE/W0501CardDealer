package kr.ac.kumoh.s20180567.w0501carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.ac.kumoh.s20180567.w0501carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        getCardName(29)
        binding.card1.setImageResource(R.drawable.c_10_of_clubs)
    }

    private fun getCardName(c: Int): String {
        Log.i("getCardName(): ", c.toString())
        var shape = when ( c / 13 ) {
            0 -> "spades"
            1 -> "diamonds"
            2 -> "hearts"
            3 -> "clubs"
            else -> "error"
        }
        val number = when (c % 13) {
            in 1..9 -> (c % 13 + 1).toString()
            else -> "error"
        }
        return "c_ace_of_spades"
    }
}