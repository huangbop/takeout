package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.RandomTransitionGenerator;
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
    bgView.setTransitionGenerator(new RandomTransitionGenerator(20000, new DecelerateInterpolator()));
    AlphaAnimation alpha = new AlphaAnimation(1.0f, 1.0f);
    alpha.setDuration(3000);
    bgView.setAnimation(alpha);
    alpha.setAnimationListener(new Animation.AnimationListener() {
      @Override
      public void onAnimationStart(Animation animation) {

      }

      @Override
      public void onAnimationEnd(Animation animation) {
        bgView.pause();
        Intent toMain = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(toMain);
        finish();
      }

      @Override
      public void onAnimationRepeat(Animation animation) {

      }
    });



//


  }




}
