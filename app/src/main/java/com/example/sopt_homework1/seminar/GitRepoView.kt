package com.example.sopt_homework1.seminar

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R

class GitRepoView (view : View) : RecyclerView.ViewHolder(view){
    val ctnRvItem: View = view.findViewById(R.id.ctnRvItem)
    val txtRvItemName: TextView = view.findViewById(R.id.txtRvItemName)
    val txtRvItemDescription: TextView = view.findViewById(R.id.txtRvItemDescription)
    val txtRvItemLanguage: TextView = view.findViewById(R.id.txtRvItemLanguge)
    val imgRvItemLanguageColor: ImageView = view.findViewById(R.id.imgRvItemLanguageColor)

    fun bind(data: GitRepoItem){
        txtRvItemName.text = data.name
        txtRvItemDescription.text = data.desc
        txtRvItemLanguage.text = data.language
    }
}

/*
어댑터: 인터페이스를 변경시켜줌, a를 넣어주면 b로 변경해주는 것
RecyclerView.Adapter: 데이터를 ViewHolder로 변경시켜줌
context는 문맥 같은것.
<>는 뷰홀더를 사용자가 정의하는 뷰홀더이다. 어떤 뷰홀더를 개발할지 모르니깐 <>안에 우리가 어떤뷰홀더로 개발할
건지 알려주는 내용이다.
어댑터는 데이터를 list로 가지고 있다.
아이템전체에 대한 뭔가를 해야하는데, 우리가 만든 데이터클래스를 리스트로 가져오는것이다.
onCreateViewHolder은 반드시 오버라이딩을 해줘야하고, 우리가 만든 로직을 뱉어냄



 */