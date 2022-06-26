package com.list.organik.view

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.list.organik.R
import com.list.organik.model.Product
import java.math.BigDecimal

class FormProductActivity :
    AppCompatActivity(R.layout.activity_form_product) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val btnSave = findViewById<Button>(R.id.btn_save)
        btnSave.setOnClickListener {
            //valor do titulo no forms
            val fieldFormTitle = findViewById<EditText>(R.id.title_form)
            val titleGenerated = fieldFormTitle.text.toString()

            //valor da descricao no forms
            val fieldFormProduct = findViewById<EditText>(R.id.description_form)
            val productGenerated = fieldFormProduct.text.toString()

            //valor do preco total no forms
            val fieldFormPriceText = findViewById<EditText>(R.id.price_form)
            val textGenerated = fieldFormPriceText.text.toString()

            //valida se vem vazio/em branco para evitar erro ao clicar sem valor
            val newPrice = if (textGenerated.isBlank()) {
                BigDecimal.ZERO
            } else {
                BigDecimal(textGenerated)
            }
            //cria novo produto
            val newProduct = Product(
                title = titleGenerated,
                products = productGenerated,
                price = newPrice
            )
            Log.i("FormProduct", "onCreate: $newProduct")
        }
    }

}