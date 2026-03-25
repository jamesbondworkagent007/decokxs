package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50029uzh {
    public static final C50029uzh EZpvd = new C50029uzh();
    public static final android.os.Handler AEQbTJ = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final int copydefault = 8;

    private C50029uzh() {
    }

    public final boolean AEQbTJ(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        return AEQbTJ.post(runnable);
    }

    public final boolean copydefault(@NotNull java.lang.Runnable runnable, long j) {
        Intrinsics.checkNotNullParameter(runnable, "");
        return AEQbTJ.postDelayed(runnable, j);
    }

    public final void KWHzl(@NotNull java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "");
        android.os.Handler handler = AEQbTJ;
        if (handler != null) {
            handler.removeCallbacks(runnable);
        }
    }
}
