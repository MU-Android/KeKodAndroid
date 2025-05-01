package io.mu.entrypoints

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class CameraComponent2 : DefaultLifecycleObserver{

    override fun onStart(owner: LifecycleOwner) {
        super.onResume(owner)
        startCamera()
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        stopCamera()
    }

    fun startCamera(){
        Log.e("CameraComponent2Log", "startCamera")
    }

    fun stopCamera(){
        Log.e("CameraComponent2Log", "stopCamera")
    }
}