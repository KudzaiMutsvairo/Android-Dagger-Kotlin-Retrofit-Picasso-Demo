package com.kudzai.mutswairo.daggerkotlinpractice1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.TransformationUtils.centerCrop
import com.bumptech.glide.request.RequestOptions
import com.kudzai.mutswairo.daggerkotlinpractice1.R
import com.kudzai.mutswairo.daggerkotlinpractice1.model.Item
import com.kudzai.mutswairo.daggerkotlinpractice1.model.Response
import kotlinx.android.synthetic.main.view_item.view.*

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {
    private var listData : List<Item>? = null

    fun setUpdatedData(listData : List<Item>){
        this.listData = listData
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listData?.get(position)!!)
    }

    override fun getItemCount(): Int {
        if (listData == null) return 0
        else return listData?.size!!
    }

    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        val imageView = view.imageView
        val tvName = view.tvName
        val tvDescription = view.tvDescription

        fun bind(data : Item){
            tvDescription.text = data.description
            tvName.text = data.name

            //Using Glide to retrieve and set the imageView
            Glide.with(imageView)
                .load(data.owner.avatar_url)
                .apply(RequestOptions.centerCropTransform())
                .into(imageView)
        }
    }
}