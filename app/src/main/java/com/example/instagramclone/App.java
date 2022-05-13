package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tZj728jhY8qMfmwM0lc0m7jxlIYJsMJST00AVkN2")
                .clientKey("o6VVMKAwo8lMDdwfCOonZgcing7Nwmr4yZHXrrrO")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
