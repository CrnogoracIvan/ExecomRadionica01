package com.example.ivancrnogorac.execomraddionica01;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Ivan Crnogorac on 4/29/2017.
 */

public class WorkshopApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
