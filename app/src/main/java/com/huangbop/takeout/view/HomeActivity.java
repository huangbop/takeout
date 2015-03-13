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

  private ListView lvHome;
  private BmobFile file;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    lvHome = (ListView) findViewById(R.id.lvHome);

    final Delicious delicious = new Delicious();
    delicious.setDescription("aaa");

    file = new BmobFile(new File("/storage/emulated/0/emacs/etc/images/splash.png"));
    file.upload(this, new UploadFileListener() {
      @Override
      public void onSuccess() {
        toast("upload successed.");
        delicious.setPicture(file);
        delicious.save(HomeActivity.this);
      }

      @Override
      public void onFailure(int i, String s) {
        toast("upload failed." + s);
      }
    });


    fillListContents();


  }

  private void fillListContents() {

    BmobQuery<Delicious> query = new BmobQuery<Delicious>();
    query.findObjects(this, new FindListener<Delicious>() {
      @Override
      public void onSuccess(List<Delicious> deliciouses) {
        toast("Successed, the size is: " + deliciouses.size());
      }

      @Override
      public void onError(int i, String s) {
        toast("Failed." + s);
      }
    });



  }


}
