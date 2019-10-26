package com.example.sopt_homework1.GithubFollower

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R
import kotlinx.android.synthetic.main.rv_item_pr.view.*

class GithubViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val ConstItem: View = view.findViewById(R.id.follower_layout)
    val ivItemPic: ImageView = view.findViewById(R.id.follower_pic)
    val tvItemId: TextView = view.findViewById(R.id.follower_id)
    val tvItemName: TextView = view.findViewById(R.id.follwer_name)
    val ivItemAddFollwer: ImageView = view.findViewById(R.id.add_follower)

    fun bind(data: GithubItem){
        ivItemPic.setImageResource(data.pic)
        tvItemId.text = data.id
        tvItemName.text = data.name
        ivItemAddFollwer.setImageResource(data.addfow)
    }

}