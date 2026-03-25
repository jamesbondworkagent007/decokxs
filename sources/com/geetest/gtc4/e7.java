package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public final class e7 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f442a;
    public final b7 b;
    public final d7 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e7(Context context, b7 b7Var, d7 d7Var) {
        if (context instanceof Application) {
            this.f442a = (Application) context;
        } else {
            this.f442a = (Application) context.getApplicationContext();
        }
        this.b = b7Var;
        this.c = d7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Application application;
        String strA;
        try {
            try {
                try {
                    this.c.getClass();
                    strA = d7.a(iBinder);
                } catch (Exception unused) {
                    this.b.b.countDown();
                    application = this.f442a;
                }
                if (TextUtils.isEmpty(strA)) {
                    throw new IllegalStateException("getDeviceId failed");
                }
                b7 b7Var = this.b;
                b7Var.f427a.set(strA);
                b7Var.b.countDown();
                application = this.f442a;
                application.unbindService(this);
            } catch (Throwable th) {
                try {
                    this.f442a.unbindService(this);
                } catch (Exception unused2) {
                }
                throw th;
            }
        } catch (Exception unused3) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
