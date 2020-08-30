package com.example.matchdayapp.activities.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.matchdayapp.R
import kotlinx.android.synthetic.main.activity_image.*
import me.kaelaela.verticalviewpager.transforms.DefaultTransformer

class ImageActivity : AppCompatActivity() {


    var images: IntArray = intArrayOf(
        R.drawable.liverpool,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.player,

    )
    var sliderAdapter: SliderAdapter =
        SliderAdapter(this, images)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)




        vertical_viewpaper.adapter = sliderAdapter
        vertical_viewpaper.setPageTransformer(false, DefaultTransformer())
    }

}







