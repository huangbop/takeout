package com.huangbop.takeout.view;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/3/11.
 */
public class BaseActivity extends Activity {

  public void toast(String msg) {
    Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
  }

}

