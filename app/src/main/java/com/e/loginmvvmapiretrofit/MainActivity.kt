package com.e.loginmvvmapiretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAction()
    }

    fun initAction() {
        btn_login.setOnClickListener {
            val intent = Intent(this, MainDashboard::class.java)
            startActivity(intent)
            login()
        }
    }

    fun login() {
        val request = UserRequest()
        request.account = et_email.text.toString().trim()
        request.password = et_password.text.toString().trim()

        val retro = Retro().getRetroClientInstance().create(UserApi::class.java)
        retro.login(request).enqueue(object : Callback<UserResponse> {
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                val user = response.body()
//                Log.e("token", user!!.data?.fcm_token.toString())
//                Log.e("email", user!!.data?.account.toString())

//                val intent() = Intent(this, MainDashboard::class.java)
//                startActivity(intent)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                Log.e("Error", t.message.toString())
            }
        })
    }

}