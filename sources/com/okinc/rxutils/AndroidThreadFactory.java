package com.okinc.rxutils;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import o.yAV;

/* JADX INFO: loaded from: classes11.dex */
public final class AndroidThreadFactory extends AtomicLong implements ThreadFactory {
    final int androidThreadPriority;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    public AndroidThreadFactory(String str) {
        this(str, 5, false);
    }

    public AndroidThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public AndroidThreadFactory(String str, int i, boolean z) {
        this(str, i, 0, z);
    }

    public AndroidThreadFactory(String str, int i, int i2) {
        this(str, i, i2, false);
    }

    public AndroidThreadFactory(String str, int i, int i2, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
        this.androidThreadPriority = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        String str = this.prefix + '-' + incrementAndGet();
        Thread application = this.nonBlocking ? new Application(runnable, str) : new Thread(new Runnable() { // from class: o.udH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                this.copydefault.lambda$newThread$0(runnable);
            }
        }, str);
        application.setPriority(this.priority);
        application.setDaemon(true);
        return application;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$newThread$0(Runnable runnable) {
        Process.setThreadPriority(this.androidThreadPriority);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "AndroidThreadFactory[" + this.prefix + "]";
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application extends Thread implements yAV {
        public Application(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}
