package com.example.fragmentkt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment3 : Fragment() {

    //ctrl + o키누르면 오버라이드 메소드 가능
    //메인에서 oncreate첫실행처럼 fragment도 생명주기 있다.
    //return문 지우기
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.frag3, container, false) //xml과 메인문 연결인 setcontentView의 fragment버젼

        return view

    }
}