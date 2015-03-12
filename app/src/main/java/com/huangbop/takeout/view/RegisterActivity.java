package com.huangbop.takeout.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bmob.BTPFileResponse;
import com.huangbop.takeout.R;
import com.huangbop.takeout.model.User;
import com.huangbop.takeout.view.BaseActivity;

import cn.bmob.v3.listener.SaveListener;

/**
 * Created by Administrator on 2015/3/11.
 */
public class RegisterActivity extends BaseActivity {

  private EditText etUser;
  private EditText etPassword;
  private Button btnRegister;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_register);

    etUser = (EditText) findViewById(R.id.etUser);
    etPassword = (EditText) findViewById(R.id.etPassword);
    btnRegister = (Button) findViewById(R.id.btnRegister);

    btnRegister.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        String user = etUser.getText().toString();
        String password = etPassword.getText().toString();

        if (user.equals("") || password.equals("")) {
          toast("must type something");
        } else {
          User theUser = new User();
          theUser.setUsername(user);
          theUser.setPassword(password);
          theUser.setPhone("15871379625");
          theUser.signUp(RegisterActivity.this, new SaveListener() {
            @Override
            public void onSuccess() {
              toast("Register successed.");
              Intent toLogin = new Intent(RegisterActivity.this, LoginActivity.class);
              startActivity(toLogin);
              finish();
            }

            @Override
            public void onFailure(int i, String s) {
              toast("Register failed " + s);
            }
          });

        }

      }
    });

  }

}
