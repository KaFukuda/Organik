package com.list.organik

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.list.organik.data.ProductData.getProducts
import com.list.organik.viewmodel.ListProductsAdapter

class MainActivity : Activity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val recyclerView: RecyclerView = findViewById(R.id.list_products)
            recyclerView.adapter = ListProductsAdapter(
                context = this, products = getProducts()
            )
            //Uma das formas de mostrar os dados na tela
            //recyclerView.layoutManager = LinearLayoutManager(this)
        }
    }