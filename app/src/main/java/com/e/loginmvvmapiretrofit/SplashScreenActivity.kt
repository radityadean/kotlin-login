package com.e.loginmvvmapiretrofit

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    var isStarted = false
    var progressStatus = 0
    var handler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        iv_splash_screen.alpha = 0f
        iv_splash_screen.animate().setDuration(2000).alpha(1f).withEndAction {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

//        handler = Handler(Handler.Callback {
//            if (isStarted) {
//                progressStatus++
//            }
//            progressBarHorizontal.progress = progressStatus
//            textViewHorizontalProgress.text = "${progressStatus}${progressBarHorizontal.max}"
//            handler?.sendEmptyMessageDelayed(0, 100)
//            true
//        })

        handler?.sendEmptyMessage(0)

        fun horizontalDeterminate(view: View) {
            isStarted = !isStarted
        }

    }
}