package com.list.organik.viewmodel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.list.organik.R
import com.list.organik.model.Product

class ListProductsAdapter(
    private val context : Context,
    private val products : List<Product>
) : RecyclerView.Adapter<ListProductsAdapter.ViewHolder>() {

    //classe interna que só sera usada aqui
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun vinculate(productItem: Product) {
            val name = itemView.findViewById<TextView>(R.id.title)
            name.text = productItem.title
            val product = itemView.findViewById<TextView>(R.id.products)
            product.text = productItem.products
            val priceItem = itemView.findViewById<TextView>(R.id.price)
            priceItem.text = productItem.price.toPlainString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //cria a ref , responsavel por fazer o bind das views
        val inflater = LayoutInflater.from(context) // criado o context no construtor pq nao acha no this
        val view = inflater.inflate(R.layout.product_item, parent, false) //cria a view exclusiva
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //indica para o adapter o q esta colocando: item e a posicao
        val productItem = products[position]
        holder.vinculate(productItem)
    }

    //tamanho da lista
    override fun getItemCount(): Int = products.size

}