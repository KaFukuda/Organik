package com.list.organik

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.list.organik.dao.ProductDao
import com.list.organik.data.ProductData.getProducts
import com.list.organik.view.FormProductActivity
import com.list.organik.viewmodel.ListProductsAdapter

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        val recyclerView: RecyclerView = findViewById(R.id.list_products)
        val dao = ProductDao()
        recyclerView.adapter = ListProductsAdapter(
            context = this, products = dao.getAllProducts()
        )
        // acao para alterar a tela a partir do fab
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            val intent = Intent(this, FormProductActivity::class.java)
            startActivity(intent)
        }
        //Uma das formas de mostrar os dados na tela
        //recyclerView.layoutManager = LinearLayoutManager(this)
    }
}