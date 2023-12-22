package com.example.exchangecryptocurrency.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangecryptocurrency.R
import com.example.exchangecryptocurrency.domain.CoinItem

class CoinItemAdapter (private val coinsList: List<CoinItem>, private val onItemClick: (CoinItem) -> Unit): RecyclerView.Adapter<CoinItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinItemViewHolder {
        val itemLayout = R.layout.coin_item

        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(itemLayout, parent, false)

        return CoinItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoinItemViewHolder, position: Int) {
        val coinItem = coinsList[position]
        holder.bind(coinItem)
        holder.itemView.setOnClickListener {
            onItemClick(coinItem)
            Log.d("ItemAdapter", "Item clicked: ${coinItem.name}")
        }
    }

    override fun getItemCount(): Int = coinsList.size

}