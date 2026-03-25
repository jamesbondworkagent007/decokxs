package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mhl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32660mhl {
    public static final void EZpvd(@NotNull java.lang.String str, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        function0.invoke();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis() - jCurrentTimeMillis;
        if (jCurrentTimeMillis2 > 16) {
            pUU.valueOf("Monitor.ANR", "For task " + str + " takes " + jCurrentTimeMillis2 + "ms on thread " + java.lang.Thread.currentThread());
        }
    }
}
