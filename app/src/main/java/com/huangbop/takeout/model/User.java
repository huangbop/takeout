package com.huangbop.takeout.model;

import cn.bmob.v3.BmobUser;

/**
 * Created by Administrator on 2015/3/12.
 */
public class User extends BmobUser {
  private String phone;

  public String getPhone() {
    return phone;
  }

  public void setPhone(String p) {
    phone = p;
  }


}
