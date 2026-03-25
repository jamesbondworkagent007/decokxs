package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JL {
    public final C5233Jv EZpvd;
    public final C5214Jc KWHzl;

    public JL(@NotNull C5214Jc c5214Jc) {
        Intrinsics.checkNotNullParameter(c5214Jc, "");
        this.KWHzl = c5214Jc;
        this.EZpvd = C5235Jx.AEQbTJ.EZpvd(c5214Jc);
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objKWHzl = new JA(this.KWHzl, this.EZpvd).KWHzl(continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
