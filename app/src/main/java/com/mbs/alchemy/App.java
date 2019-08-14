package com.mbs.alchemy;

import android.app.Application;
import com.mbs.alchemy.common.AlchemyApp;
import com.mbs.alchemy.common.AlchemyOptions;

/**
 * App class.
 *
 * @author Lucas Cheung.
 * @date 2019-07-13.
 */
public class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    AlchemyApp.initializeApp(
        this,
        AlchemyOptions.newBuilder("LsSCTt5lcJ2dUxjeqLi3K9vgF06s1PdZI1OD6p1i")
            .channel("myshop")
            .build());
  }
}
