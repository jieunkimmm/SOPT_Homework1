package com.example.sopt_homework1.seminar

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R

// : 은 자바에서 extends랑 같은 것
class GitRepoAdapter(private val context: Context) : RecyclerView.Adapter<GitRepoView>(){
    // Adapter는 VIewHolder로 변경할 data를 가지고 있는다.
    var data = listOf<GitRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoView {
        val View = LayoutInflater.from(context).inflate(R.layout.rv_item_repository, parent, false)
        return GitRepoView(View)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: GitRepoView, position: Int) {
        holder.bind(data[position])
    }

}