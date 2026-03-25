package com.engagelab.privates.common.component;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.engagelab.privates.common.binder.MTMessenger;
import com.engagelab.privates.common.log.MTCommonLog;

/* JADX INFO: loaded from: classes2.dex */
public class MTCommonService extends Service {
    private static final String TAG = "MTCommonService";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return MTMessenger.getInstance().getBinder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public void onCreate() {
        MTCommonLog.i(TAG, "onService create");
        MTMessenger.getInstance().initOnRemoteProcess(getApplicationContext());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final void onDestroy() {
        MTCommonLog.i(TAG, "onService destroy");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
