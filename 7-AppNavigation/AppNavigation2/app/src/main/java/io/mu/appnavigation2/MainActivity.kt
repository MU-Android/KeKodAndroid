package io.mu.appnavigation2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        getNavControllerViaFragmentSupportFragmentManager()
//        getNavControllerViaViewSupportFragmentManager()

        getNavControllerViaFragmentFindViewById()
//        getNavControllerViaViewFindViewById()
    }

    override fun onResume() {
        super.onResume()

        getNavControllerViaViewFindViewById()
    }

    fun getNavControllerViaFragmentSupportFragmentManager(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController
    }

    fun getNavControllerViaViewSupportFragmentManager(){
        val navHostFragmentView = supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        val navControllerView = navHostFragmentView.navController
    }

    fun getNavControllerViaFragmentFindViewById(){
        val navHostFragment = findViewById<View>(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
    }

    fun getNavControllerViaViewFindViewById(){
        val navHostFragmentView = findViewById<View>(R.id.navHostFragmentView)
        val navControllerView = navHostFragmentView.findNavController()
    }


}