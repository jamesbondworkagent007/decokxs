package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCC {
    public final InterfaceC44375sNm AEQbTJ;

    @yCM
    public oCC(@NotNull InterfaceC44375sNm interfaceC44375sNm) {
        Intrinsics.checkNotNullParameter(interfaceC44375sNm, "");
        this.AEQbTJ = interfaceC44375sNm;
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Long> continuation) {
        return this.AEQbTJ.AEQbTJ(str, continuation);
    }
}
