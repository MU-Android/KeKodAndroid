package io.mu.entrypoints

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtHelloWorld: TextView
    private val cameraComponent = CameraComponent()
    private val cameraComponent2 = CameraComponent2()
    private val cameraComponent3 = CameraComponent3()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.e("MainActivityLog", "onCreate1")
        setContentView(R.layout.activity_main)
        Log.e("MainActivityLog", "onCreate2")
        defaultFunc()

        txtHelloWorld = findViewById(R.id.txtHelloWorld)

        txtHelloWorld.setOnClickListener {
            txtHelloWorld.text = "Hello Musa!"
        }

        lifecycle.addObserver(cameraComponent)
        lifecycle.addObserver(cameraComponent2)
        lifecycle.addObserver(cameraComponent3)
    }

    override fun onStart() {
        super.onStart()

        Log.e("MainActivityLog", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e("MainActivityLog", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e("MainActivityLog", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.e("MainActivityLog", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e("MainActivityLog", "onDestroy")
        lifecycle.removeObserver(cameraComponent)
        lifecycle.removeObserver(cameraComponent2)
        lifecycle.removeObserver(cameraComponent3)
    }

    override fun onContentChanged() {
        super.onContentChanged()

        Log.e("MainActivityLog", "onContentChanged")
    }

    override fun onRestart() {
        super.onRestart()

        Log.e("MainActivityLog", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        Log.e("MainActivityLog", "onSaveInstanceState")

        outState.run {
            putString(TEXT_VIEW_KEY, txtHelloWorld.text.toString())
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Log.e("MainActivityLog", "onRestoreInstanceState")

        txtHelloWorld.text = savedInstanceState.getString("TEXT_VIEW_KEY")
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()

        Log.e("MainActivityLog", "onUserLeaveHint")
    }

    override fun onBackPressed() {
        super.onBackPressed()

        Log.e("MainActivityLog", "onBackPressed")
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)

        Log.e("MainActivityLog", "onNewIntent")
    }

    override fun onUserInteraction() {
        super.onUserInteraction()

        Log.e("MainActivityLog", "onUserInteraction")
    }

    companion object {
        const val TEXT_VIEW_KEY = "TEXT_VIEW_KEY"
    }

    private fun defaultFunc() {
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}