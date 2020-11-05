package com.ohdu.learncustomizeview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ohdu.learncustomizeview.pie_view.PieActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startPie(view: View) {
        startActivity(Intent(this, PieActivity::class.java))
    }
}