package io.mu.entrypoints

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class CameraComponent : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun startCamera(){
        Log.e("CameraComponentLog", "startCamera")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stopCamera(){
        Log.e("CameraComponentLog", "stopCamera")
    }
}