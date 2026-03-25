package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sRZ {
    public final C44486sRp OLrzqt;

    @yCM
    public sRZ(@NotNull C44486sRp c44486sRp) {
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        this.OLrzqt = c44486sRp;
    }

    public static /* synthetic */ java.lang.Object execute$default(sRZ srz, java.lang.String str, long j, long j2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = Long.MAX_VALUE;
        }
        return srz.AEQbTJ(str, j3, j2, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, long j, long j2, @NotNull Continuation<? super java.lang.Integer> continuation) {
        return this.OLrzqt.EZpvd(str, j2, j, continuation);
    }
}
