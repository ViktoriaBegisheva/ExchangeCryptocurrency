package com.example.exchangecryptocurrency.presentation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangecryptocurrency.R
import com.example.exchangecryptocurrency.domain.CoinItem

class CoinItemViewHolder(view: View):
    RecyclerView.ViewHolder(view) {
    private val image: ImageView = view.findViewById(R.id.imageViewCoin)
    private val name: TextView = view.findViewById(R.id.nameCoin)
    private val price: TextView = view.findViewById(R.id.priceCoin)
    private val cardView: CardView = view.findViewById(R.id.cardView_coinItem)

    fun bind(coin: CoinItem){
        image.setImageResource(coin.image)
        name.text = coin.name
        price.text = coin.price.toString()
    }
    }