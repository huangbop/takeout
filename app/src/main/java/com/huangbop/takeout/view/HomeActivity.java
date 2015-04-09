package com.huangbop.takeout.view;

import android.os.Bundle;
import android.widget.ListView;

import com.huangbop.takeout.R;
import com.huangbop.takeout.model.Delicious;

import java.io.File;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.datatype.BmobFile;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.UploadFileListener;

public class HomeActivity extends BaseActivity {



  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);




  }



}
