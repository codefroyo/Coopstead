package com.codefroyo.coopstead

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainIndeterminateProgressBar.visibility = View.INVISIBLE
        Handler().postDelayed({
            mainIndeterminateProgressBar.visibility = View.VISIBLE
            Handler().postDelayed({
                val intent = Intent(this,Landing::class.java)
                startActivity(intent)
                finish()
            },2000)
        },1000)

    }
}
