package com.huangbop.takeout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/3/2.
 */
public class LifeCycle extends Activity {

  private int count = 0;
  private EditText etSend;
  private Button btnSend;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (savedInstanceState != null) {
      count = savedInstanceState.getInt("count");
      Toast.makeText(this, "current count is" + count, Toast.LENGTH_SHORT).show();
    }

    setContentView(R.layout.activity_lifecycle);
    Log.i("LifeCycle", "onCreate finished.");

    etSend = (EditText) findViewById(R.id.etSend);
    btnSend = (Button) findViewById(R.id.btnSend);

    btnSend.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String strMsg = etSend.getText().toString().trim();
        Intent intent = new Intent();

        Bundle bundle = new Bundle();
        bundle.putString("msg", strMsg);
        bundle.putInt("value", 10);

        intent.putExtras(bundle);
        intent.setClass(LifeCycle.this, DataActivity.class);
        startActivity(intent);
      }
    });


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
