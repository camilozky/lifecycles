package com.globant.lyfecycles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.authentication.log_in


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.authentication)
        Log.d("LifeCycles", "onCreate")
        println("onCreate")
        log_in.setOnClickListener {
            startActivity(Intent(this, WinnerBeerActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycles", "onStart")
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycles", "onResume")
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycles", "onPause")
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycles", "onStop")
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycles", "onDestroy")
        println("onDestroy")
    }
}
