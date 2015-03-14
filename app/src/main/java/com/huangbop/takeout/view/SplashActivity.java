package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.huangbop.takeout.R;

/**
 * Created by Administrator on 2015/3/10.
 */
public class SplashActivity extends BaseActivity {

  private KenBurnsView bgView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash);

//  splash bg
    bgView = (KenBurnsView) findViewById(R.id.bgView);
    AlphaAnimation alpha = new AlphaAnimation(1.0f, 1.0f);
    alpha.setDuration(2000);
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

  }

}
