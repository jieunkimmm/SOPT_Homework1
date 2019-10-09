package com.example.sopt_homework1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    var signup_id: EditText? = null
    var signup_pw: EditText? = null
    var sign_up: Button? = null
    var login: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin_layout)
        signup_id = findViewById(R.id.signup_id)
        signup_pw = findViewById(R.id.signup_pw)
        sign_up = findViewById(R.id.signIn_signupBt)
        login = findViewById(R.id.signIn_LoginBt)



        login?.setOnClickListener(){
            if(signup_id?.text.toString().isEmpty() || signup_pw?.text.toString().isEmpty()){
                //사용자에게 실패메시지를 보여준다
                Toast.makeText(this, "아이디나 비밀번호를 입력해주세요.", Toast.LENGTH_SHORT).show()
            }
            else{
                //다음 화면으로 넘어가기

            }
        }

        sign_up?.setOnClickListener(){

            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            intent.putExtra("login_id", signup_id?.text.toString())
            intent.putExtra("login_pw", signup_pw?.text.toString())
            startActivityForResult(intent,3000)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){
            when (requestCode) {
                3000 -> {
                    if (data!!.hasExtra("signup_id") && data!!.hasExtra("signup_pw")){
                        val userid = data!!.getStringExtra("signup_id")
                        val userpw = data!!.getStringExtra("signup_pw")

                        signup_id?.setText(userid)
                        signup_pw?.setText(userpw)
                    }
                    else{
                        Toast.makeText(this, "aa", Toast.LENGTH_SHORT).show()

                    }

                }
            }
        }
    }
}
