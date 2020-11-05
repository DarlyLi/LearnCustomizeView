package com.ohdu.learncustomizeview.pie_view

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ohdu.learncustomizeview.R

/**
 * @author: lcc
 * @date: 2020/11/5
 * @GitHub: lidaryl@163.com
 * @email: lidaryl@163.com
 * @description:
 *
 */
class PieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_view)
        val data = arrayListOf<PieData>()
        data.add(PieData("1", 1f, 45f, Color.BLACK))
        data.add(PieData("2", 2f, 145f, Color.RED))
        data.add(PieData("3", 3f, 10f, Color.YELLOW))
        data.add(PieData("4", 4f, 40f, Color.GREEN))
        data.add(PieData("5", 5f, 20f, Color.GRAY))
        data.add(PieData("6", 6f, 100f, Color.BLUE))
        findViewById<PieView>(R.id.pieView).data = data
    }

}