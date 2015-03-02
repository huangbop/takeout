package com.huangbop.takeout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2015/3/2.
 */
public class IndexActivity extends Activity {

  private Button btnIndex0;
  private Button btnIndex1;
  private Button btnIndex2;
  private ButtonListener listener;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_index);

    listener = new ButtonListener();

    findButtons();

    setClickListener();

  }

  private void setClickListener() {
    btnIndex0.setOnClickListener(listener);
    btnIndex1.setOnClickListener(listener);
    btnIndex2.setOnClickListener(listener);
  }

  private void findButtons() {
    btnIndex0 = (Button) findViewById(R.id.btnIndex0);
    btnIndex1 = (Button) findViewById(R.id.btnIndex1);
    btnIndex2 = (Button) findViewById(R.id.btnIndex2);
  }

  private class ButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
      switch (v.getId()) {
        case R.id.btnIndex0:
          Intent intent0 = new Intent(IndexActivity.this, MainActivity.class);
          startActivity(intent0);
          break;

        case R.id.btnIndex1:
          Intent intent1 = new Intent(IndexActivity.this, SecondActivity.class);
          startActivity(intent1);
          break;

        case R.id.btnIndex2:
          Intent intent2 = new Intent(IndexActivity.this, LifeCycle.class);
          startActivity(intent2);
          break;


      }

    }
  }



}
