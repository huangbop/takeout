package com.huangbop.takeout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends BaseActivity {

  private Button btnLogin;
  private Button btnRegister;
  private EditText etUser;
  private EditText etPassword;
  private Context ctx;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);

    ctx = this;

    findViews();

    setListener();

  }

  private void setListener() {
    btnLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(ctx, MainActivity.class);
        startActivity(i);
        finish();
      }
    });

    btnRegister.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent i = new Intent(ctx, RegisterActivity.class);
        startActivity(i);
      }
    });

  }

  private void findViews() {
    btnLogin = (Button) findViewById(R.id.btnLogin);
    btnRegister = (Button) findViewById(R.id.btnRegister);
    etUser = (EditText) findViewById(R.id.etUser);
    etPassword = (EditText) findViewById(R.id.etPassword);

  }


}
