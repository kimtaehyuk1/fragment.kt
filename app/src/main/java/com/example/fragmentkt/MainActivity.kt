package com.example.fragmentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //지금까지 코딩은 fragment뼈대만 장면들과 그 장면들에 연결된 코틀린(내용 코딩부분)

        //알트 엔트 해서 fun만들어주기
        setFrag(0)

        btn_fragment1.setOnClickListener {
            setFrag(0)
        }

        btn_fragment2.setOnClickListener {
            setFrag(1)
        }

        btn_fragment3.setOnClickListener {
            setFrag(2)
        }


    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction() //Fragment 교체 구현할수 있는 관리되는,오른쪽껀 교체시작
        when(fragNum)
        {
            0 -> {
                   ft.replace(R.id.main_frame, fragment1()).commit()//메인 엑티비티 안에서 프레그먼트 조각들이 교체 //대체해라 왼쪽에서 오른쪽으로 후 저장
            }
            1 -> {
                ft.replace(R.id.main_frame, fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, fragment3()).commit()
            }
        }

    }
}