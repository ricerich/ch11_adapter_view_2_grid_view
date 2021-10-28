package com.example.ch11_adapter_view_2_grid_view

import android.app.AlertDialog
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class MyGridAdapter(var context: Context) : BaseAdapter() {

    var posterID = arrayOf(
        R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
        R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
        R.drawable.mov09, R.drawable.mov10,
        R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
        R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
        R.drawable.mov09, R.drawable.mov10,
        R.drawable.mov01, R.drawable.mov02, R.drawable.mov03, R.drawable.mov04,
        R.drawable.mov05, R.drawable.mov06, R.drawable.mov07, R.drawable.mov08,
        R.drawable.mov09, R.drawable.mov10
    )

    var posterTitle = arrayOf("써니", "완득이", "괴물", "라디오스타", "비열한거리",
                              "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처",
                              "써니", "완득이", "괴물", "라디오스타", "비열한거리",
                              "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처",
                              "써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처", "써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "웰컴투동막골", "헬보이", "빽투더퓨처")

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var imageview = ImageView(context)
        imageview.layoutParams = ViewGroup.LayoutParams(200, 300)
        imageview.scaleType = ImageView.ScaleType.FIT_CENTER
        imageview.setPadding(5, 5, 5, 5)

        imageview.setImageResource(posterID[p0])

        imageview.setOnClickListener {
            var dialogView = View.inflate(context, R.layout.dialog1, null)
            var dlg = AlertDialog.Builder(context)
            var ivPoster = dialogView.findViewById<ImageView>(R.id.ivPoster)
            ivPoster.setImageResource(posterID[p0])
//            dlg.setTitle("큰 포스터")
            dlg.setTitle(posterTitle[p0])
//            dlg.setIcon(R.mipmap.ic_launcher)
            dlg.setIcon(R.drawable.movie_icon)
            dlg.setView(dialogView)
            dlg.setNegativeButton("닫기", null)
            dlg.show()
        }

        return imageview
    }
    override fun getItem(p0: Int): Any {
        return 0
    }
    override fun getItemId(p0: Int): Long {
        return 0
    }
    override fun getCount(): Int {
        return posterID.size
    }
}