package com.huangbop.takeout.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import cn.bmob.v3.Bmob;

/**
 * Created by Administrator on 2015/3/11.
 */
public class BaseActivity extends FragmentActivity {

  private static final String APPID = "e9c72808f8555c8d7846a13a50e907a6";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    //    Bmob
    Bmob.initialize(this, APPID);

  }

  public void toast(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
  }

}

