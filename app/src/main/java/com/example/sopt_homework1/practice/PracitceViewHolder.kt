package com.example.sopt_homework1.practice

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R

class PracitceViewHolder (view : View) : RecyclerView.ViewHolder(view){
    val constItem: View = view.findViewById(R.id.constItem)
    val ivPrItemPro: ImageView = view.findViewById(R.id.iv_pr_item_pro)
    val tvPrItemId: TextView = view.findViewById(R.id.tv_pr_item_id)
    val tvPrItemName: TextView = view.findViewById(R.id.tv_pr_item_name)
    val ivPrItemInfo: ImageView = view.findViewById(R.id.iv_pr_item_info)

    fun bind(data: PracticeItem){
        ivPrItemPro.setImageResource(data.pro)
        tvPrItemId.text = data.id
        tvPrItemName.text = data.name
        ivPrItemInfo.setImageResource(data.info)
    }
}