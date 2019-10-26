package com.example.sopt_homework1.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt_homework1.R
import com.example.sopt_homework1.practice.PracticeAdapter
import com.example.sopt_homework1.practice.PracticeItem
import com.example.sopt_homework1.seminar.GitRepoAdapter
import com.example.sopt_homework1.seminar.GitRepoItem

class RecyclerActivity : AppCompatActivity() {

    private lateinit var rvMainGitRepo: RecyclerView
    private lateinit var gitRepoAdapter: GitRepoAdapter
    private lateinit var practiceAdapter: PracticeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_avtivity)
        //initGitRepoList()
        initPracticeList()
    }

    private fun initGitRepoList(){

        rvMainGitRepo = findViewById(R.id.rvMainGitRepo)

        gitRepoAdapter = GitRepoAdapter(this)

        rvMainGitRepo.adapter = gitRepoAdapter

        rvMainGitRepo.layoutManager = LinearLayoutManager(this)

        gitRepoAdapter.data = listOf(
            GitRepoItem(
                name = "SoptStagram",
                desc = "IT 창업 동아리 SOPT 안드로이드 교육 프로젝트",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "artic_android",
                desc = "Forked from artic_development/artic_android",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "CalculatorWithEspresso",
                desc = "UI Test with Espresso + Unit Test Calculator",
                language = "Kotlin",
                languageColor = 0
            ),
            GitRepoItem(
                name = "problemSovingGuZongMan",
                desc = "프로그래밍 대회에서 배우는 알고리즘 문제해결전략 공부하자",
                language = "Java",
                languageColor = 1
            )
        )

        gitRepoAdapter.notifyDataSetChanged()
    }

    private fun initPracticeList(){
        rvMainGitRepo = findViewById(R.id.rvMainGitRepo)
        practiceAdapter = PracticeAdapter(this)
        rvMainGitRepo.adapter = practiceAdapter
        rvMainGitRepo.layoutManager = LinearLayoutManager(this)

        practiceAdapter.data = listOf(
            PracticeItem(
            pro = R.drawable.im,
            id = "id칸입니다",
            name = "name칸입니다",
            info = R.drawable.im
        ),
        PracticeItem(
            pro = R.drawable.im,
            id = "id칸입니다",
            name = "name칸입니다",
            info = R.drawable.im
        ),
        PracticeItem(
            pro = R.drawable.im,
            id = "id칸입니다",
            name = "name칸입니다",
            info = R.drawable.im
        ),
        PracticeItem(
            pro = R.drawable.im,
            id = "id칸입니다",
            name = "name칸입니다",
            info = R.drawable.im
        ),
            PracticeItem(
                pro = R.drawable.im,
                id = "id칸입니다",
                name = "name칸입니다",
                info = R.drawable.im
            ),
            PracticeItem(
                pro = R.drawable.im,
                id = "id칸입니다",
                name = "name칸입니다",
                info = R.drawable.im
            ),
            PracticeItem(
                pro = R.drawable.im,
                id = "id칸입니다",
                name = "name칸입니다",
                info = R.drawable.im
            ),
            PracticeItem(
                pro = R.drawable.im,
                id = "id칸입니다",
                name = "name칸입니다",
                info = R.drawable.im
            ),
            PracticeItem(
                pro = R.drawable.im,
                id = "id칸입니다",
                name = "name칸입니다",
                info = R.drawable.im
            )
        )
        practiceAdapter.notifyDataSetChanged()
    }
}
