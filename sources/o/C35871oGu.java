package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35871oGu {
    public final InterfaceC44177sGd AEQbTJ;

    @yCM
    public C35871oGu(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.AEQbTJ = interfaceC44177sGd;
    }

    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objGEmmrt = this.AEQbTJ.gEmmrt(continuation);
        return objGEmmrt == C56442yFn.copydefault() ? objGEmmrt : Unit.INSTANCE;
    }
}
