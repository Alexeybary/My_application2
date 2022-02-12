package com.example.my_appication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my_appication2.ui.main.MainActivity4Fragment

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity4_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainActivity4Fragment.newInstance())
                .commitNow()
        }
    }
}