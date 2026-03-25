package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes21.dex */
public final class f4 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e4 f447a;
    public final CountDownLatch b;
    public IBinder c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f4(CountDownLatch countDownLatch) {
        this.b = countDownLatch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f447a = null;
        this.c = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.c = iBinder;
            this.b.countDown();
        } catch (Throwable unused) {
        }
    }
}
