package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59400zgN<T> {
    public abstract java.lang.Object KWHzl(T t, @NotNull Continuation<? super Unit> continuation);

    public abstract java.lang.Object KWHzl(@NotNull java.util.Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation);

    public final java.lang.Object AEQbTJ(@NotNull Sequence<? extends T> sequence, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = KWHzl((java.util.Iterator) sequence.iterator(), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
