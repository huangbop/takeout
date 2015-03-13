package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.huangbop.takeout.R;
import com.huangbop.takeout.view.BaseActivity;

/**
 * Created by Administrator on 2015/3/11.
 */
public class MainActivity extends BaseActivity {

  private ImageButton btnHome;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    btnHome = (ImageButton) findViewById(R.id.btnHome);


    btnHome.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

        Intent toHome = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(toHome);

      }
    });

  }
}
