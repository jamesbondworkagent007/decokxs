package com.bytedance.bdtracker;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.applog.log.LoggerImpl;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class c6<SERVICE, RESULT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f148a = new CountDownLatch(1);
    public final Intent b;
    public final b<SERVICE, RESULT> c;
    public final Context d;

    public class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f149a;
        public final b<SERVICE, RESULT> b;
        public SERVICE c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public a(c6 c6Var, CountDownLatch countDownLatch, b<SERVICE, RESULT> bVar) {
            this.f149a = countDownLatch;
            this.b = bVar;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LoggerImpl.global().debug(1, "Oaid#ServiceBlockBinder#onServiceConnected " + componentName, new Object[0]);
            try {
                this.c = (SERVICE) ((com.bytedance.dr.impl.a) this.b).a(iBinder);
                try {
                    this.f149a.countDown();
                } catch (Exception e) {
                    LoggerImpl.global().error(1, "Oaid#count down failed", e, new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    LoggerImpl.global().error(1, "Oaid#ServiceBlockBinder#onServiceConnected", th, new Object[0]);
                    try {
                        this.f149a.countDown();
                    } catch (Exception e2) {
                        LoggerImpl.global().error(1, "Oaid#count down failed", e2, new Object[0]);
                    }
                } catch (Throwable th2) {
                    try {
                        this.f149a.countDown();
                    } catch (Exception e3) {
                        LoggerImpl.global().error(1, "Oaid#count down failed", e3, new Object[0]);
                    }
                    throw th2;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            LoggerImpl.global().debug(1, "Oaid#ServiceBlockBinder#onServiceDisconnected" + componentName, new Object[0]);
            try {
                this.f149a.countDown();
            } catch (Exception e) {
                LoggerImpl.global().error(1, "Oaid#countDown failed", e, new Object[0]);
            }
        }
    }

    public interface b<T, RESULT> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public c6(Context context, Intent intent, b<SERVICE, RESULT> bVar) {
        this.d = context;
        this.b = intent;
        this.c = bVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void a(c6<SERVICE, RESULT>.a aVar) {
        if (aVar != null) {
            try {
                this.d.unbindService(aVar);
            } catch (Throwable th) {
                LoggerImpl.global().error(1, "Oaid#Release connection failed", th, new Object[0]);
            }
        }
    }
}
