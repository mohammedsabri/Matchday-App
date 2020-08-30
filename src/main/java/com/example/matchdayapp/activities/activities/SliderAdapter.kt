package com.example.matchdayapp.activities.activities

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.matchdayapp.R

class SliderAdapter : PagerAdapter {
    var context: Context
    var items: IntArray
    lateinit var inflator: LayoutInflater

    constructor(context: Context, items:IntArray): super(){
        this.context = context
        this.items = items


    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean =
        view == `object` as RelativeLayout



        override fun getCount(): Int = items.size


        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val image: ImageView
            inflator = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view: View = inflator.inflate(R.layout.slider_item, container, false)
            image = view.findViewById(R.id.slider_image)
            image.setBackgroundResource(items[position])
            container!!.addView(view)
            return view
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            container!!.removeView(`object` as RelativeLayout)
        }
    }

