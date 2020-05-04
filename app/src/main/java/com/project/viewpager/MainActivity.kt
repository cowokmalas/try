package com.project.viewpager

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_main.adapter=MyPagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(vp_main)

        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()

    }


}

