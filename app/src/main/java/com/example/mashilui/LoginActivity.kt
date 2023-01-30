package com.example.mashilui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mashilui.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //컨텐츠 뷰를 바인딩으로 변경, 즉 결합한 xml파일로 변경
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        binding.activity = this@LoginActivity
    }

    fun signInbtnClick() {
        val intent = Intent(applicationContext, SignInActivity::class.java)
        startActivity(intent)
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}