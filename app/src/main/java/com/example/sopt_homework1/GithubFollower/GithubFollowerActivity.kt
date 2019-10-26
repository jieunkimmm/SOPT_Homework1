package com.example.sopt_homework1.GithubFollower

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R
import com.example.sopt_homework1.practice.PracticeAdapter
import com.example.sopt_homework1.seminar.GitRepoAdapter

class GithubFollowerActivity : AppCompatActivity() {
    private lateinit var rvFollowerMain: RecyclerView
    private lateinit var githubAdapter: GithubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gitgub_follower)
        FollowerList()
    }

    private fun FollowerList(){

        rvFollowerMain = findViewById(R.id.ItemList)
        githubAdapter = GithubAdapter(this)
        rvFollowerMain.adapter = githubAdapter
        rvFollowerMain.layoutManager = LinearLayoutManager(this)

        githubAdapter.data = listOf(
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            ),
            GithubItem(
                pic = R.drawable.im,
                id = "id를 입력받은 칸",
                name = "팔로워의 name을 입력받은 칸",
                addfow = R.drawable.im
            )

        )
        githubAdapter.notifyDataSetChanged()
    }
}
