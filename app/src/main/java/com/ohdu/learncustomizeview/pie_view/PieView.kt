package com.ohdu.learncustomizeview.pie_view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import kotlin.math.min

/**
 * @author: lcc
 * @date: 2020/11/5
 * @GitHub: lidaryl@163.com
 * @email: lidaryl@163.com
 * @description: 饼状图
 *
 */

class PieView : View {

    private var w = 0f
    private var h = 0f

    //圆半径
    private var r = 0f
    private var _data: List<PieData>? = null

    //开始点
    private var mStartAngle = 0f
    var data
        get() = _data
        set(value) {
            _data = value
            invalidate()
        }

    private val mPaint by lazy {
        Paint()
    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributes: AttributeSet?) : this(context, attributes, 0)
    constructor(context: Context, attributes: AttributeSet?, defStyle: Int) : super(
        context,
        attributes,
        defStyle
    )

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        this.w = w.toFloat()
        this.h = h.toFloat()
        r = (min(w, h) / 2 * 0.8).toFloat()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        _data?.let {
            //移动画布到屏幕中心
            canvas?.translate(w / 2, h / 2)
            val rectF = RectF(-r, -r, r, r)
            it.forEach { pieData ->
                mPaint.color = pieData.color
                canvas?.drawArc(rectF, mStartAngle, pieData.percentage, true, mPaint)
                mStartAngle += pieData.percentage
            }
        }
    }
}