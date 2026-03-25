package com.engagelab.privates.common.binder;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes14.dex */
public class MTMessengerConnection implements ServiceConnection {
    private final Context context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MTMessengerConnection(Context context) {
        this.context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MTMessenger.getInstance().onServiceConnected(this.context, iBinder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        MTMessenger.getInstance().onServiceDisconnected(this.context);
    }
}
