package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCF {
    public final sGF KWHzl;

    @yCM
    public oCF(@NotNull sGF sgf) {
        Intrinsics.checkNotNullParameter(sgf, "");
        this.KWHzl = sgf;
    }

    public final java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            throw new java.lang.IllegalArgumentException("ChannelId is null or blank");
        }
        java.lang.Object objKWHzl = this.KWHzl.KWHzl(str, continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}
