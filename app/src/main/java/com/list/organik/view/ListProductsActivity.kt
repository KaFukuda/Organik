package com.list.organik.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.list.organik.R
import com.list.organik.dao.ProductDao
import com.list.organik.viewmodel.ListProductsAdapter

class ListProductsActivity : AppCompatActivity(R.layout.activity_list_products) {

    private val dao = ProductDao()
    private val adapter = ListProductsAdapter(
        context = this, products = dao.getAllProducts()
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configRecyclerView() //executa uma única vez
        configFab() //executa uma única vez
    }

    override fun onResume() {
        super.onResume()
        adapter.updateInfos(dao.getAllProducts())
    }

    private fun configFab() {
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            sendDataToFormProduct()
        }
    }

    private fun configRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.list_products)
        recyclerView.adapter = adapter
    }

    private fun sendDataToFormProduct() {
        val intent = Intent(this, FormProductActivity::class.java)
        startActivity(intent)
    }
}

//Uma das formas de mostrar os dados na tela
//recyclerView.layoutManager = LinearLayoutManager(this)