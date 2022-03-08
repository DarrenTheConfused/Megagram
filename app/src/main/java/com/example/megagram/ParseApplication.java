package com.example.megagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GRhP3PBYD2OiXz66z1ZCF80Bs5nzK9ugnXNQBfUW")
                .clientKey("ocPl51vLJ2MN2HOZI8BQkugODsJoQnHZgho76GSD")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
