package com.myapp

import android.app.Activity
import android.os.Bundle

class MainActivity extends Activity {

  override def onPostCreate(savedInstanceState: Bundle) {
    super.onPostCreate(savedInstanceState)
    setContentView(R.layout.main)
  }

}
