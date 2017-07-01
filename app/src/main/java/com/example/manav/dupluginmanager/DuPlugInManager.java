package com.example.manav.dupluginmanager;

import android.app.Application;
import android.content.Context;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by manav on 7/1/17.
 */

public class DuPlugInManager extends Application {

        public static RefWatcher getRefWatcher(Context context) {
            DuPlugInManager application = (DuPlugInManager) context.getApplicationContext();
            return application.refWatcher;
        }

        private RefWatcher refWatcher;

        @Override public void onCreate() {
            super.onCreate();
            FirebaseDatabase.getInstance().setPersistenceEnabled(false);
            if (LeakCanary.isInAnalyzerProcess(this)) {
                // This process is dedicated to LeakCanary for heap analysis.
                // You should not init your app in this process.
                return;
            }
            refWatcher = LeakCanary.install(this);
        }
    }


