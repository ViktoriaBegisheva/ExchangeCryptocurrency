package com.example.exchangecryptocurrency.presentation

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangecryptocurrency.R
import com.example.exchangecryptocurrency.domain.CoinItem

class CoinItemAdapter (private val coinsList: List<CoinItem>): RecyclerView.Adapter<CoinItemViewHolder>() {

    companion object {
        const val TAG = "XXXXX"
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinItemViewHolder {
        val itemLayout = R.layout.coin_item

        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(itemLayout, parent, false)

        return CoinItemViewHolder(view)
    }

    //var clickListener: ((view: View, item: CoinItem)->Unit  )? = null
    override fun onBindViewHolder(holder: CoinItemViewHolder, position: Int) {
        val coinItem = coinsList[position]
        holder.bind(coinItem)
    }

    override fun getItemCount(): Int = coinsList.size
//
//    var swipeListener: ((item: CoinItem) -> Unit)? = null
//    var simpleItemTouchCallback: ItemTouchHelper.SimpleCallback = object :
//        ItemTouchHelper.SimpleCallback(
//            0,
//            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
////                    or ItemTouchHelper.DOWN or ItemTouchHelper.UP
//        ) {
//        override fun onMove(
//            recyclerView: RecyclerView,
//            viewHolder: RecyclerView.ViewHolder,
//            target: RecyclerView.ViewHolder
//        ): Boolean {
//            return false
//        }
//
//        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, swipeDir: Int) {
//            val position = viewHolder.adapterPosition
//            val shopItem = getItem(position)
//            swipeListener?.invoke(shopItem)
//        }
//    }
//

}