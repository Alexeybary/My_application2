package com.example.my_appication2

import android.graphics.drawable.Drawable
import android.graphics.drawable.DrawableContainer
import android.graphics.drawable.VectorDrawable
import java.util.Vector

var current_number: Int = -1
var images = listOf(
    R.drawable.a01,
    R.drawable.a02,
    R.drawable.a03,
    R.drawable.a04,
//    R.drawable.a05,
//    R.drawable.a06,
//    R.drawable.a07,
//    R.drawable.a08,
//    R.drawable.a09,
//    R.drawable.a10,
//    R.drawable.a11,
//    R.drawable.a12,
//    R.drawable.a13,
//    R.drawable.a14,
//    R.drawable.a15,
//    R.drawable.a16,
//    R.drawable.a17,
//    R.drawable.a18,
//    R.drawable.a19,
//    R.drawable.a20,
//    R.drawable.a21,
//    R.drawable.a22,
//    R.drawable.a23,
//    R.drawable.a24,
//    R.drawable.a25,
//    R.drawable.a26,
//    R.drawable.a27,
//    R.drawable.a28,
//    R.drawable.a29,
//    R.drawable.a30,
//    R.drawable.a31,
//    R.drawable.a32,
//    R.drawable.a33,
//    R.drawable.a34,
//    R.drawable.a35,
//    R.drawable.a36,
//    R.drawable.a37,
//    R.drawable.a38,
//    R.drawable.a39,
//    R.drawable.a40,
//    R.drawable.a41,
//    R.drawable.a42,
)
var x: Int = 0

fun get_name(): Int {
    x = (0..3).random()
    while (x == current_number) {
        x = (0..3).random()
    }
    current_number = x
    return images[x]
}
