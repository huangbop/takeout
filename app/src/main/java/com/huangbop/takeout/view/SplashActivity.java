package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.Transition;
import com.huangbop.takeout.R;

import cn.bmob.v3.Bmob;

/**
 * Created by Administrator on 2015/3/10.
 */
public class SplashActivity extends BaseActivity {

  private static final String APPID = "e9c72808f8555c8d7846a13a50e907a6";

  private KenBurnsView bgView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

//    Bmob
    Bmob.initialize(this, APPID);

//  bg
    bgView = (KenBurnsView) findViewById(R.id.bgView);
    bgView.setImageResource(R.drawable.bg);
//    bgView.
    bgView.setTransitionListener(new KenBurnsView.TransitionListener() {
      @Override
      public void onTransitionStart(Transition transition) {

      }

      @Override
      public void onTransitionEnd(Transition transition) {
        Intent intent;
        intent = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
      }
    });

//


  }




}