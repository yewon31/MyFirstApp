package com.coding404.myfirstapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coding404.myfirstapp.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding : ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //툴바 설정
        setSupportActionBar(binding.quizToolbar) //툴바 활성화
        supportActionBar?.title = "MyFirstToolBar"
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //뒤로가기 버튼 활성화

        //뒤로가기 이벤트 -> 안드로이드가 제공해주는 네비게이션 클릭 상속
        binding.quizToolbar.setNavigationOnClickListener {
            //onBackPressed() //예전버전에서 뒤로가기
            onBackPressedDispatcher.onBackPressed()
        }
    }


    //툴바 메뉴 활성화
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu) //xml로 만들 메뉴 활성화
        return super.onCreateOptionsMenu(menu)
    }

    //툴바 메뉴 이벤트 - 클릭한 아이템 메뉴가 매개변수로 들어옴
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId ) {
            R.id.menu1 -> {
                Toast.makeText(this, "메뉴1실행", Toast.LENGTH_SHORT).show()
            }
            R.id.menu2 -> {
                Toast.makeText(this, "메뉴2실행", Toast.LENGTH_SHORT).show()
            }
            R.id.menu3 -> {
                Toast.makeText(this, "메뉴3실행", Toast.LENGTH_SHORT).show()
            }
            R.id.menu4 -> {
                Toast.makeText(this, "메뉴4실행", Toast.LENGTH_SHORT).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }





}