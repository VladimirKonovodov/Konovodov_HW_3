package com.applications.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timestamp = 12825216
        val post = Post(
            1,
            "Konovodov V.A.",
            "23 August 2020",
            "First post in your network!",
            timestamp,
            5,
            true
        )

        contentTv.text = post.content
        //startDateTv.text = post.date
        startDateTv.text = post.publishedAgo()
        postAuthor.text = post.author
        if (post.likeByMe) {
            likeImageBtn.setImageResource(R.drawable.ic_favorite_active)
            likeCounter.setTextColor(getColor(R.color.likeColor))

        }


    }
}