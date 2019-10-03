package com.example.sopt_homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.signup_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_layout)

        val signup_id: EditText = findViewById(R.id.signup_id)
        val signup_pw: EditText = findViewById(R.id.signup_pw)
        val signin: Button = findViewById(R.id.signin)
        val login: Button = findViewById(R.id.login)

        login.setOnClickListener(){
            if(signup_id.text.toString() == null || signup_pw.text.toString() == null){
                //사용자에게 실패메시지를 보여준다
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else{
                //다음 화면으로 넘어가기
                val intent = Intent(this@MainActivity, SignUpActivity::class.java)
                intent.putExtra("login_id", signup_id.text.toString())
                intent.putExtra("login_pw", signup_pw.text.toString())
                startActivity(intent)
            }
        }

        signin.setOnClickListener(){

        }
    }
}
