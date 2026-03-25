package com.geetest.deepknow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f391a;
    private static volatile ExecutorService b;
    private static volatile ScheduledExecutorService c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static c a() {
        if (f391a == null) {
            synchronized (c.class) {
                if (f391a == null) {
                    f391a = new c();
                    b = Executors.newFixedThreadPool(5);
                    c = Executors.newScheduledThreadPool(3);
                }
            }
        }
        return f391a;
    }

    public void a(Runnable runnable) {
        if (runnable != null) {
            try {
                b.execute(runnable);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Future a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        try {
            return c.scheduleAtFixedRate(runnable, j, j2, timeUnit);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
