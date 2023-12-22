package com.example.exchangecryptocurrency.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.exchangecryptocurrency.databinding.FragmentCoinInfoBinding

class CoinInfoFragment : Fragment() {

    private lateinit var binding: FragmentCoinInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoinInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val image = it.getInt("image")
            val name = it.getString("name", "")
            val price = it.getString("price", "")
            val change = it.getString("change", "")

            binding.imageInfo.setImageResource(image)
            binding.nameInfo.text = "${name.uppercase()} / USD"
            binding.priceInfo.text = "${binding.priceInfo.text.toString()}${price}"
            binding.changeInfo.text = "${binding.changeInfo.text.toString()}${change} %"
            Log.d("FFFFF", binding.nameInfo.text.toString())
            Log.d("FFFFF", binding.priceInfo.text.toString())
            Log.d("FFFFF", binding.changeInfo.text.toString())
        }
    }

}
