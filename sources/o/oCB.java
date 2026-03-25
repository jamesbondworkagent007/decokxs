package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCB {
    public final InterfaceC44375sNm copydefault;

    @yCM
    public oCB(@NotNull InterfaceC44375sNm interfaceC44375sNm) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        this.copydefault = interfaceC44375sNm;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) {
        return this.copydefault.copydefault(str, continuation);
    }
}
