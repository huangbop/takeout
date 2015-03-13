package com.huangbop.takeout.model;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by Administrator on 2015/3/13.
 */
public class Delicious extends BmobObject {

  private String description;
  private BmobFile picture;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BmobFile getPicture() {
    return picture;
  }

  public void setPicture(BmobFile picture) {
    this.picture = picture;
  }

}
