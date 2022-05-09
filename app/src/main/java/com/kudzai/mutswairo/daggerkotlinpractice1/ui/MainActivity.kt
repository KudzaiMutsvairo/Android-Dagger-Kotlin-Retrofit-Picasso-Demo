package com.kudzai.mutswairo.daggerkotlinpractice1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.kudzai.mutswairo.daggerkotlinpractice1.R
import com.kudzai.mutswairo.daggerkotlinpractice1.model.Response
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerViewAdapter: RecyclerViewAdapter
    private lateinit var mainViewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        initViewModel()
    }

    init {
        recyclerViewAdapter = RecyclerViewAdapter()
        }

    private fun initRecyclerView() {
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = RecyclerViewAdapter()
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        recyclerview.addItemDecoration(decoration)
        recyclerview.adapter = recyclerViewAdapter
    }

    private fun initViewModel(){

        mainViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mainViewModel.getLiveDataObservable().observe(this
        ) { t ->
            if (t != null) {
                recyclerViewAdapter.setUpdatedData(t.items)
                recyclerViewAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this@MainActivity, "Error retrieving data", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        mainViewModel.makeApiCall()
        //mainViewModel.makeApicall()
    }
}