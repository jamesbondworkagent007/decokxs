package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CT extends java.io.Closeable {
    java.lang.Object AEQbTJ(@NotNull CQ cq, long j, @NotNull Continuation<? super Unit> continuation);

    int AYXKKw();

    boolean copydefault(java.lang.Throwable th);

    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object write$default(CT ct, CQ cq, long j, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i & 2) != 0) {
                j = cq.AhwBna();
            }
            return ct.AEQbTJ(cq, j, continuation);
        }
    }
}
