package com.coding404.myfirstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coding404.myfirstapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //QuizActivity에서 넘어온 값을 받아서 화면에 출력.
        val name = intent.getStringExtra("name")
        val collectCnt = intent.getIntExtra("collectCnt", 0)

        binding.resultTv.text = "이름: $name\n총 $collectCnt 문제 정답입니다"
        binding.resultBtn.setOnClickListener {
            finish()
        }



    }
}