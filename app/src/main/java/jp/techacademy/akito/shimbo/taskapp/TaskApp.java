package jp.techacademy.akito.shimbo.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by Develop on 2017/03/26.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Realm.init(this);
    }
}
