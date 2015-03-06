package com.huangbop.takeout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.listener.SaveListener;


public class DataActivity extends ActionBarActivity {


  private TextView tvMsg;

  private Button btnCreate;

  FootBaller footBaller;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_data);

    Bmob.initialize(this, "e9c72808f8555c8d7846a13a50e907a6");


    tvMsg = (TextView) findViewById(R.id.tvMsg);

    Intent intent = this.getIntent();

    Bundle bundle = intent.getExtras();

    tvMsg.setText(bundle.getString("msg") + bundle.getInt("value"));

    btnCreate = (Button) findViewById(R.id.btnCreate);

    btnCreate.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        footBaller = new FootBaller();

        footBaller.setAge(10);
        footBaller.setName("C Ro");
        footBaller.save(DataActivity.this, new SaveListener() {
          @Override
          public void onSuccess() {

            Toast.makeText(DataActivity.this, "OK", Toast.LENGTH_SHORT).show();
          }

          @Override
          public void onFailure(int i, String s) {
            Toast.makeText(DataActivity.this, "Failed.", Toast.LENGTH_SHORT).show();
          }
        });


      }
    });

  }



}
