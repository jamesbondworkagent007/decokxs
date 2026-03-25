package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FX {
    public static final FZ KWHzl(@NotNull CoroutineContext coroutineContext) {
        FZ fzAEQbTJ;
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        FY fy = (FY) coroutineContext.get(FY.KWHzl);
        return (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null) ? FZ.AYXKKw.OLrzqt() : fzAEQbTJ;
    }
}
