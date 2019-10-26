package com.example.sopt_homework1.GithubFollower

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R

class GithubAdapter(private val context: Context) : RecyclerView.Adapter<GithubViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
        val View = LayoutInflater.from(context).inflate(R.layout.activity_github_item, parent, false)
        return GithubViewHolder(View)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        holder.bind(data[position])
    }

    var data = listOf<GithubItem>()
}