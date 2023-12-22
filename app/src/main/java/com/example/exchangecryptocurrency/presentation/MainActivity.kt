package com.example.exchangecryptocurrency.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangecryptocurrency.R
import com.example.exchangecryptocurrency.domain.CoinItem
//import com.example.exchangecryptocurrency.data.DataList

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemList = listOf(
            CoinItem("coin1",377f, R.drawable.coin,0.5f,),
            CoinItem("coin2",27f, R.drawable.coin,0.2f,),
            CoinItem("coin3",0.6732f, R.drawable.coin,0.9f,),
        )

        recyclerView = findViewById(R.id.coinsList)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CoinItemAdapter(itemList) { item ->
            showInfoFragment(item)
        }

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    private fun showInfoFragment(coinItem: CoinItem) {

        val intent = Intent(this, CoinInfoActivity::class.java)
        intent.putExtra("image", coinItem.image)
        intent.putExtra("name", coinItem.name)
        intent.putExtra("price", coinItem.price.toString())
        intent.putExtra("change", coinItem.change.toString())
        startActivity(intent)

    }
        //val list = DataList()
        //Log.d("XXXX",list.toString())

}