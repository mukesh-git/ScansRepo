package com.mukesh.myapplication.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mukesh.myapplication.R
import com.mukesh.myapplication.adapter.ScansAdapter
import com.mukesh.myapplication.databinding.ActivityMainBinding
import com.mukesh.myapplication.viewmodel.ScansViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ScansViewModel
    private lateinit var scansAdapter: ScansAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ScansViewModel::class.java)
        downloadAndSetData()
    }

    private fun downloadAndSetData() {
        viewModel.downloadData().observe(this, Observer { scansModel ->
            scansAdapter.data = scansModel
            if(binding.rvScans.adapter == null) {
                scansAdapter = ScansAdapter()
                binding.rvScans.adapter = scansAdapter
            } else {
                binding.rvScans.adapter?.notifyDataSetChanged()
            }
        })
    }
}