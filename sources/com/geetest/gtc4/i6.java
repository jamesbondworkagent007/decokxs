package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class i6 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f462a;
    public final i3 b;
    public final h6 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i6(Context context, i3 i3Var, h6 h6Var) {
        if (context instanceof Application) {
            this.f462a = context;
        } else {
            this.f462a = context.getApplicationContext();
        }
        this.b = i3Var;
        this.c = h6Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, Intent intent, i3 i3Var, h6 h6Var) {
        i6 i6Var = new i6(context, i3Var, h6Var);
        try {
            if (!i6Var.f462a.bindService(intent, i6Var, 1)) {
                throw new e6("Service binding failed");
            }
            Objects.toString(intent);
        } catch (Exception unused) {
            i6Var.b.b.countDown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String strA;
        componentName.getClassName();
        try {
            try {
                try {
                    strA = this.c.a(iBinder);
                } catch (Throwable th) {
                    try {
                        this.f462a.unbindService(this);
                        componentName.getClassName();
                    } catch (Exception unused) {
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                this.b.b.countDown();
                this.f462a.unbindService(this);
            }
            if (strA == null || strA.isEmpty()) {
                throw new e6("OAID/AAID acquire failed");
            }
            i3 i3Var = this.b;
            i3Var.f460a.set(strA);
            i3Var.b.countDown();
            this.f462a.unbindService(this);
            componentName.getClassName();
        } catch (Exception unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClassName();
    }
}
