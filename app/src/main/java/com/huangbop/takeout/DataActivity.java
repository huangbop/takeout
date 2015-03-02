package com.huangbop.takeout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import android.widget.Toast;


public class DataActivity extends ActionBarActivity {


  private TextView tvMsg;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_data);

    tvMsg = (TextView) findViewById(R.id.tvMsg);

    Intent intent = this.getIntent();

    String strMsg = intent.getStringExtra("msg");

    tvMsg.setText(strMsg);

  }






}
