package com.example.exchangecryptocurrency.presentation

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
            CoinItem("coin2",377f, R.drawable.coin,0.5f,),
            CoinItem("coin3",377f, R.drawable.coin,0.5f,),
        )

        recyclerView = findViewById(R.id.coinsList)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = CoinItemAdapter(itemList)
        recyclerView.adapter = adapter

        //val list = DataList()
        //Log.d("XXXX",list.toString())
    }
}