package com.example.mashilui

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mashilui.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //컨텐츠 뷰를 바인딩으로 변경, 즉 결합한 xml파일로 변경
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_in)
        binding.activity = this@SignInActivity

        binding.checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                binding.btnSignInNext.background.setTint(Color.parseColor("#3E83EB"))
                binding.btnSignInNext.setTextColor(Color.parseColor("#FFFFFF"))
                binding.btnSignInNext.isEnabled = true
            } else {
                binding.btnSignInNext.background.setTint(Color.parseColor("#F0F0F0"))
                binding.btnSignInNext.setTextColor(Color.parseColor("#000000"))
                binding.btnSignInNext.isEnabled = false
            }
        }
    }

    fun closeBtnClick() {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun nextBtnClick() {
        val pw = binding.signInPassword.text.toString()
        val id = binding.signInUsername.text.toString()

        if(pw.length < 6 || id.length < 4 || !id[0].isLetter()) {
            showMessage("로그인 아이디 혹은 패스워드가 잘못되었습니다.")
            return
        }
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}