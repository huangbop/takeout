package com.huangbop.takeout;

import android.app.Activity;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

import java.util.logging.Handler;

import cn.bmob.v3.Bmob;

/**
 * Created by Administrator on 2015/3/10.
 */
public class SplashActivity extends Activity {

  private static final String APPID = "e9c72808f8555c8d7846a13a50e907a6";


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

    Bmob.initialize(this, APPID);

    ImageView bgview = (ImageView) findViewById(R.id.bgView);
    bgview.setBackgroundResource(R.drawable.bg);

    TranslateAnimation trans = new TranslateAnimation(0, 120, 0, 120);
    trans.setDuration(5000);
    bgview.setAnimation(trans);





  }




}
