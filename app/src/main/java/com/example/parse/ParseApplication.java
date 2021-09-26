package com.example.parse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register Parse
        ParseObject.registerSubclass(Post.class);


        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("rZhbEqtH1N4i666KsZ2U8rhsVDZkSg6pwvP4E5Rh")
                .clientKey("pPR0iV0RtscGbRTjrx2ujqzsKGCTFApuT4ZN0VSM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
