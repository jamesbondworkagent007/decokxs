package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Tt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5490Tt {
    public static final C5490Tt copydefault = new C5490Tt();

    private C5490Tt() {
    }

    public static final int copydefault(@NotNull AbstractRunnableC5485To abstractRunnableC5485To, @NotNull AbstractRunnableC5485To abstractRunnableC5485To2) {
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To, "");
        Intrinsics.EZpvd((java.lang.Object) abstractRunnableC5485To2, "");
        if (abstractRunnableC5485To.AYXKKw() < abstractRunnableC5485To2.AYXKKw()) {
            return 1;
        }
        if (abstractRunnableC5485To.AYXKKw() <= abstractRunnableC5485To2.AYXKKw() && abstractRunnableC5485To.KWHzl() >= abstractRunnableC5485To2.KWHzl()) {
            return abstractRunnableC5485To.KWHzl() > abstractRunnableC5485To2.KWHzl() ? 1 : 0;
        }
        return -1;
    }

    public static final void copydefault() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        Intrinsics.AEQbTJ(mainLooper, "");
        if (threadCurrentThread != mainLooper.getThread()) {
            throw new java.lang.RuntimeException("AnchorsManager#start should be invoke on MainThread!");
        }
    }
}
