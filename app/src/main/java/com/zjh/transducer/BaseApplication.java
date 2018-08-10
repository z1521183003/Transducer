package com.zjh.transducer;

import android.app.Application;
import android.content.Context;

/**
 * 作者 : 张建宏
 * 创建时间 ：2018-08-10 13:14
 * 说明 ：Application基类
 */
public class BaseApplication extends Application {
    private Context context;
    
    @Override
    public void onCreate() {
        super.onCreate();
        //获取全局context
        context = getApplicationContext();
    }
    
    public Context getContext() {
        return context;
    }
}
