package o;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class pJM {
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.pJP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return pJM.KWHzl();
        }
    });

    public static final java.lang.String AEQbTJ(long j) {
        double d = j;
        if (d >= 1.073741824E9d) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format(java.util.Locale.US, "%.2fGB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d / 1.073741824E9d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return str;
        }
        if (d >= 1048576.0d) {
            C56529yIt c56529yIt2 = C56529yIt.KWHzl;
            java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "%.2fMB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d / 1048576.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            return str2;
        }
        if (d >= 1024.0d) {
            C56529yIt c56529yIt3 = C56529yIt.KWHzl;
            java.lang.String str3 = java.lang.String.format(java.util.Locale.US, "%.0fKB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d / 1024.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "");
            return str3;
        }
        return j + "B";
    }

    public static final ExecutorCoroutineDispatcher copydefault() {
        return (ExecutorCoroutineDispatcher) KWHzl.getValue();
    }

    public static final ExecutorCoroutineDispatcher KWHzl() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new ThreadFactoryC6748aVI("Monitor.Lifecycle", null, false, null, 14, null));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "");
        return ExecutorsKt.from(executorServiceNewFixedThreadPool);
    }
}
