package com.huangbop.takeout;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2015/3/6.
 */
public class FootBaller extends BmobObject {

  private String name;
  private int age;

  void setName(String _name) {
    name = _name;
  }

  void setAge(int _age) {

    age = _age;
  }

}
