package com.huangbop.takeout;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends ActionBarActivity {
  private Button btnGetMoney;
  private TextView tvGetMoney;
  private Button btnLoseMoney;
  private EditText etInit;
  private int money = 0;
  private Button btnSwitch;

  private Button btnChange;
  private ImageView ivChange;
  private int[] imageIDs = {
          R.drawable.a,
          R.drawable.b,
          R.drawable.c,
          R.drawable.d,
          R.drawable.e,
  };
  private int imageIndex = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

//    our code
    tvGetMoney = (TextView)findViewById(R.id.tvGetMoney);
    btnGetMoney = (Button)findViewById(R.id.btnGetMoney);
    btnLoseMoney = (Button)findViewById(R.id.btnLoseMoney);
    btnSwitch = (Button)findViewById(R.id.btnSwitch);
    etInit = (EditText)findViewById(R.id.etInit);

    btnChange = (Button) findViewById(R.id.btnChange);
    ivChange = (ImageView) findViewById(R.id.ivChange);

    Picasso.with(this)
            .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
            .into(ivChange);

    btnGetMoney.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String strInit = etInit.getText().toString().trim();
        int iInit = Integer.parseInt(strInit);
        if (money == iInit) {
          Toast.makeText(MainActivity.this, "you have archive the goal", Toast.LENGTH_SHORT).show();
        } else {
          money++;
          tvGetMoney.setText("You clicked " + money + " times.");
        }
      }
    });

    btnLoseMoney.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        if (money == 0) {
          Toast.makeText(MainActivity.this, "These is no money, please don't clicked more.", Toast.LENGTH_SHORT).show();
        } else {
          money--;
          tvGetMoney.setText("You clicked " + money + " times.");
        }
      }
    });

    btnChange.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
//        imageIndex++;
//        if (imageIndex > 4)
//          imageIndex = 0;
//        ivChange.setImageResource(imageIDs[imageIndex]);
        Picasso.with(MainActivity.this)
                .load("https://cms-assets.tutsplus.com/uploads/users/21/posts/19431/featured_image/CodeFeature.jpg")
                .into(ivChange);

      }

    });


    btnSwitch.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
      }

    });



  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
