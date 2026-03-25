package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCL {
    public final sGF AEQbTJ;

    @yCM
    public oCL(@NotNull sGF sgf) {
        Intrinsics.checkNotNullParameter(sgf, "");
        this.AEQbTJ = sgf;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.Long> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objAEQbTJ = this.AEQbTJ.AEQbTJ(str, list, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }
}
