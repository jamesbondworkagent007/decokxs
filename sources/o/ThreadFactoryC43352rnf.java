package o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ThreadFactoryC43352rnf implements ThreadFactory {
    public final AtomicInteger EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.ThreadGroup copydefault;

    public ThreadFactoryC43352rnf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.EZpvd = new AtomicInteger(0);
        this.copydefault = new java.lang.ThreadGroup("OKNet");
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        return new java.lang.Thread(this.copydefault, runnable, this.OLrzqt + "-" + this.EZpvd.getAndIncrement(), 0L);
    }
}
