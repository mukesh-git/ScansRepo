package com.mukesh.myapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.mukesh.myapplication.R
import com.mukesh.myapplication.databinding.ScansListItemBinding
import com.mukesh.myapplication.model.ScanItem
import com.mukesh.myapplication.model.ScansModel

class ScansAdapter : RecyclerView.Adapter<ScansAdapter.ScansViewHolder>() {
    var data: ScansModel? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScansViewHolder {
        val binding: ScansListItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.scans_list_item,
            parent,
            false
        )
        return ScansViewHolder(binding)
    }

    override fun getItemCount() = data?.itemsList?.size ?: 0


    override fun onBindViewHolder(holder: ScansViewHolder, position: Int) {
        holder.bindData(data?.itemsList?.get(position))
    }

    class ScansViewHolder(val binding: ScansListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindData(scanItem: ScanItem?) {
            binding.scanItem = scanItem
        }

    }

}
