package com.example.sopt_homework1.practice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R

class PracticeAdapter(private  val context: Context) : RecyclerView.Adapter<PracitceViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PracitceViewHolder {
        val View = LayoutInflater.from(context).inflate(R.layout.rv_item_pr, parent, false)
        return PracitceViewHolder(View)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: PracitceViewHolder, position: Int) {
        holder.bind(data[position])
    }

    var data = listOf<PracticeItem>()
}