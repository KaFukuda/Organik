package com.list.organik.dao

import com.list.organik.model.Product

class ProductDao {

    fun add(product: Product){
        products.add(product)
    }

    fun getAllProducts() : List<Product>{
        return products.toList()
    }

    companion object {
        private val products = mutableListOf<Product>()
    }
}