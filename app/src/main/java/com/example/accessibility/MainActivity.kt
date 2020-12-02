package com.example.accessibility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bLogin.setOnClickListener {
            bLogin.visibility = GONE
            pbLogin.visibility = VISIBLE

            // TODO: Disable inputs
            Handler().postDelayed({
                bLogin.visibility = VISIBLE
                pbLogin.visibility = GONE

                // TODO: Enable inputs
            }, 2000)
        }
    }
}