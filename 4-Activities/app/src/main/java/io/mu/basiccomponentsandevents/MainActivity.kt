package io.mu.basiccomponentsandevents

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnOpenSettingsActivity: Button
    lateinit var btnOpenSettingsActivity2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        initView()
        initEvent()


    }

    fun initView() {
        btnOpenSettingsActivity = findViewById<Button>(R.id.btnOpenSettingsActivity)
        btnOpenSettingsActivity2 = findViewById<Button>(R.id.btnOpenSettingsActivity2)
    }

    fun initEvent() {
        btnOpenSettingsActivity.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        btnOpenSettingsActivity.setOnClickListener(this)
        btnOpenSettingsActivity2.setOnClickListener(this)

        btnOpenSettingsActivity.setOnClickListener(::openSettingsActivity)
        btnOpenSettingsActivity2.setOnClickListener(::openSettingsActivity3)

        btnOpenSettingsActivity.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(this@MainActivity, SettingsActivity::class.java)
                startActivity(intent)
            }
        })

        val onClickListener = {view: View? ->
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        btnOpenSettingsActivity.setOnClickListener(onClickListener)


        val onClickListener2 = fun(view: View?){
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        btnOpenSettingsActivity.setOnClickListener(onClickListener2)
    }

    private fun openSettingsActivity(view: View?){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
    private fun openSettingsActivity3(view: View?){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.btnOpenSettingsActivity -> {
               val intent = Intent(this, SettingsActivity::class.java)
               startActivity(intent)
           }
           R.id.btnOpenSettingsActivity2 -> {
               val intent = Intent(this, SettingsActivity::class.java)
               startActivity(intent)
           }
       }
    }

    fun openSettingsActivity2(view: View?){
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }
}


