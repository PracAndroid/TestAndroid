package com.example.recycler_prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList= arrayListOf<Profile>(
            Profile(R.drawable.profile, "이상훈", 30, "무직"),
            Profile(R.drawable.profile, "Lee", 30, "무직"),
            Profile(R.drawable.profile, "Hong", 30, "무직"),
            Profile(R.drawable.profile, "Sam", 30, "무직"),
            Profile(R.drawable.profile, "Kein", 30, "무직"),
            Profile(R.drawable.profile, "Marry", 30, "무직"),
            Profile(R.drawable.profile, "Heaven", 30, "무직"),
            Profile(R.drawable.profile, "Demon", 30, "무직"),
            Profile(R.drawable.profile, "이상훈", 30, "무직"),
            Profile(R.drawable.profile, "이상훈", 30, "무직"),
            Profile(R.drawable.profile, "이상훈", 30, "무직"),
            Profile(R.drawable.profile, "이상훈", 30, "무직")
        )

        rv.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv.setHasFixedSize(true)
        rv.adapter=ProfileAdapter(profileList)
    }
}