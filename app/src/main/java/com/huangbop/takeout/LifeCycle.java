package com.huangbop.takeout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2015/3/2.
 */
public class LifeCycle extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.activity_lifecycle);
    Log.i("LifeCycle", "onCreate finished.");

  }

  @Override
  protected void onPause() {
    super.onPause();

    Log.w("LifeCycle", "onPause finished.");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.e("LifeCycle", "onStart finished.");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("LifeCycle", "onResume finished.");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.wtf("LifeCycle", "onStop finished.");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.e("LifeCycle", "onDestroy finished.");
  }

  @Override
  protected void onRestart() {
    super.onRestart();

    Log.d("LifeCycle", "onRestart finished.");
  }
}
