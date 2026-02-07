package com.applifecyclemanager

import com.facebook.react.bridge.ReactApplicationContext

class AppLifecycleManagerModule(reactContext: ReactApplicationContext) :
  NativeAppLifecycleManagerSpec(reactContext) {

  override fun multiply(a: Double, b: Double): Double {
    return a * b
  }

  companion object {
    const val NAME = NativeAppLifecycleManagerSpec.NAME
  }
}
