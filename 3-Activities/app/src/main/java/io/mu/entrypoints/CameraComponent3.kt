package io.mu.entrypoints

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class CameraComponent3 : LifecycleEventObserver{
    override fun onStateChanged(
        source: LifecycleOwner,
        event: Lifecycle.Event
    ) {
        when(event){
            Lifecycle.Event.ON_START -> startCamera()
            Lifecycle.Event.ON_STOP -> stopCamera()
            else -> Unit
        }
    }

    fun startCamera(){
        Log.e("CameraComponent3Log", "startCamera")
    }

    fun stopCamera(){
        Log.e("CameraComponent3Log", "stopCamera")
    }
}