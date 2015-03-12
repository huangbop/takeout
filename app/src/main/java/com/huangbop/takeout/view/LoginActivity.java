package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.huangbop.takeout.R;
import com.huangbop.takeout.model.User;
import com.huangbop.takeout.view.BaseActivity;

import java.net.Inet4Address;

import cn.bmob.v3.listener.SaveListener;


public class LoginActivity extends BaseActivity {

  private Button btnLogin;
  private Button btnRegister;
  private EditText etUser;
  private EditText etPassword;

  private String user;
  private String password;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);


    findViews();

    setListener();


  }



  private void setListener() {

    btnLogin.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        user = etUser.getText().toString();
        password = etPassword.getText().toString();
        if (user.equals("") || password.equals("")) {
          toast("must type in text");
        } else {
          User theUser = new User();
          theUser.setUsername(user);
          theUser.setPassword(password);
          theUser.setPhone("15871379625");
          theUser.login(LoginActivity.this, new SaveListener() {
            @Override
            public void onSuccess() {
              toast("Login seccess");
              Intent toMain = new Intent(LoginActivity.this, MainActivity.class);
              startActivity(toMain);
              finish();
            }

            @Override
            public void onFailure(int i, String s) {
              toast("Login failed." + s);
            }
          });
        }

      }
    });

    btnRegister.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent toRegister = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(toRegister);
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
