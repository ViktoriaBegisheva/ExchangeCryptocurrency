package com.example.exchangecryptocurrency.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exchangecryptocurrency.R
import com.example.exchangecryptocurrency.databinding.ActivityCoinInfoBinding

class CoinInfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoinInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getIntExtra("image",0)
        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val change = intent.getStringExtra("change")

        val fragment = CoinInfoFragment()
        val bundle = Bundle()
        bundle.putInt("image", image)
        bundle.putString("name", name)
        bundle.putString("price", price.toString())
        bundle.putString("change", change.toString())
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_coin_container, fragment)
            .commit()
    }
}
