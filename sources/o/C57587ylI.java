package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57587ylI {
    public static /* synthetic */ void log$default(java.lang.Exception exc, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "exception";
        }
        EZpvd(exc, str);
    }

    public static final void EZpvd(@NotNull java.lang.Exception exc, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.util.Log.getStackTraceString(exc);
    }

    public static /* synthetic */ void log$default(java.lang.Throwable th, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "exception";
        }
        KWHzl(th, str);
    }

    public static final void KWHzl(@NotNull java.lang.Throwable th, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.util.Log.getStackTraceString(th);
    }
}
