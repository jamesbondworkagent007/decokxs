package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56378yDd<T, R> {
    public final yHO<AbstractC56383yDi<T, R>, T, Continuation<? super R>, java.lang.Object> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHO<AbstractC56383yDi<T, R>, T, Continuation<? super R>, java.lang.Object> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yHO<? super o.yDi<T, R>, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56378yDd(@NotNull yHO<? super AbstractC56383yDi<T, R>, ? super T, ? super Continuation<? super R>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        this.OLrzqt = yho;
    }
}
