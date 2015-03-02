package com.huangbop.takeout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/3/2.
 */
public class LifeCycle extends Activity {

  private int count = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (savedInstanceState != null) {
      count = savedInstanceState.getInt("count");
      Toast.makeText(this, "current count is" + count, Toast.LENGTH_SHORT).show();
    }

    setContentView(R.layout.activity_lifecycle);
    Log.i("LifeCycle", "onCreate finished.");

  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    outState.putInt("count", count);

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

    count++;

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
