package com.example.bpduajava

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.bpdua.R

class ProductListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)
        init()
    }

    private fun init() {
        findViewById<View>(R.id.image_setting_account).setOnClickListener { }
    }
}