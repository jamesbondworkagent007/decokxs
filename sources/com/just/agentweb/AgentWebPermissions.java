package com.just.agentweb;

import android.os.Build;

/* JADX INFO: loaded from: classes17.dex */
public class AgentWebPermissions {
    public static final String ACTION_CAMERA = "Camera";
    public static final String ACTION_LOCATION = "Location";
    public static final String ACTION_STORAGE = "Storage";
    public static final String[] CAMERA = {"android.permission.CAMERA"};
    public static final String[] LOCATION = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] STORAGE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            STORAGE = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"};
        } else if (i >= 29) {
            STORAGE = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        } else {
            STORAGE = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
    }
}
