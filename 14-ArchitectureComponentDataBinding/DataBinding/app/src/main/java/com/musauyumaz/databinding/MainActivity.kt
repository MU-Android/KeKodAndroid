package com.musauyumaz.databinding

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.musauyumaz.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var txtHello: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()


        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
//        val binding2 : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        setContentView(binding.root)

        val helloMessage: String? = null
        binding.helloMessage = helloMessage

//        val isHelloMessageVisible = helloMessage?.let {
//            View.VISIBLE
//        } ?: run {
//            View.GONE
//        }
//
//        binding.isHelloMessageVisible = isHelloMessageVisible

        findViewById<TextView>(R.id.txtHello).text = null
    }
}