package com.list.organik.data

import com.list.organik.model.Product
import java.math.BigDecimal

object ProductData {
    fun getProducts(): List<Product> {
        return listOf(
            Product(
                title = "Cesta Frutas",
                products = "Maçã, banana e uva",
                price = BigDecimal("24.99")
            ),
            Product(
                title = "Cesta Frutas 2",
                products = "Maçã, banana e uva",
                price = BigDecimal("24.99")
            ),

            Product(
                title = "Cesta Frutas 3",
                products = "Maçã, banana e uva",
                price = BigDecimal("24.99")
            ),
            Product(
                title = "Cesta Frutas 4",
                products = "Maçã, banana e uva",
                price = BigDecimal("24.99")
            )
        )

    }
}