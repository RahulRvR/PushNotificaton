package com.rvr.vijayr.pushnotification;

import android.app.Application;

import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.UAirship;

/**
 * Created by vijayr on 11/23/14.
 * Copyright (C) 2014 Elsevier
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        AirshipConfigOptions options = AirshipConfigOptions.loadDefaultOptions(this);


// Take off initializes the services
        UAirship.takeOff(this, options);
        UAirship.takeOff(this, options);
        UAirship.shared().getPushManager().setUserNotificationsEnabled(true);
    }
}
