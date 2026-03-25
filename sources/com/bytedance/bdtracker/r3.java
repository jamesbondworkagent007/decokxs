package com.bytedance.bdtracker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class r3 extends BroadcastReceiver {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            i5.b = i5.a(context);
        }
    }
}
