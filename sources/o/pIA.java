package o;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class pIA {
    public java.lang.Thread AEQbTJ;
    public final android.content.Context EZpvd;
    public java.lang.Throwable KWHzl;
    public Thread.UncaughtExceptionHandler copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context AEQbTJ() {
        return this.EZpvd;
    }

    public void EZpvd(java.lang.Throwable th) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable KWHzl() {
        return this.KWHzl;
    }

    public abstract void KWHzl(java.lang.Throwable th);

    public abstract void OLrzqt(@NotNull java.lang.Throwable th);

    public abstract void copydefault(java.lang.Thread thread, java.lang.Throwable th);

    public pIA(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.copydefault = java.lang.Thread.getDefaultUncaughtExceptionHandler();
    }

    public final void AEQbTJ(java.lang.Thread thread, java.lang.Throwable th) {
        this.AEQbTJ = thread;
        this.KWHzl = th;
        C38002pIp.Companion.iwGUEr().OLrzqt(false);
        try {
            copydefault(thread, th);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void copydefault(java.lang.Throwable th) {
        try {
            KWHzl(th);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        try {
            OLrzqt(th);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void AYXKKw(java.lang.Throwable th) {
        try {
            EZpvd(th);
        } catch (java.lang.Throwable th2) {
            th2.printStackTrace();
        }
    }
}
