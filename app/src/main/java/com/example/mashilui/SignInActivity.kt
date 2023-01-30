package com.example.mashilui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mashilui.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //바인딩 클래스의 inflate() 메서드를 호출해 binding이라는 이름으로 인스턴스를 생성
        val binding = ActivitySignInBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //컨텐츠 뷰를 바인딩으로 변경, 즉 결합한 xml파일로 변경
        setContentView(binding.root)
    }
}