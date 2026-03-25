package com.bytedance.bdtracker;

import android.util.Log;
import com.bytedance.applog.log.IAppLogLogger;
import com.bytedance.applog.log.LoggerImpl;

/* JADX INFO: loaded from: classes2.dex */
public class x5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f300a;
    public final String b;
    public final String c = Log.getStackTraceString(new RuntimeException("origin stacktrace"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public x5(Runnable runnable, String str) {
        this.f300a = runnable;
        this.b = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f300a.run();
        } catch (Throwable th) {
            IAppLogLogger iAppLogLoggerGlobal = LoggerImpl.global();
            StringBuilder sbA = a.a("Oaid#Thread:");
            sbA.append(this.b);
            sbA.append(" exception\n");
            sbA.append(this.c);
            iAppLogLoggerGlobal.error(1, sbA.toString(), th, new Object[0]);
        }
    }
}
