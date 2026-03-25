package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37654oxs {
    public final oGB AEQbTJ;
    public final oGM copydefault;

    @yCM
    public C37654oxs(@NotNull oGM ogm, @NotNull oGB ogb) {
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ogb, "");
        this.copydefault = ogm;
        this.AEQbTJ = ogb;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.String> continuation) {
        java.lang.String strAEQbTJ = this.copydefault.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        return this.AEQbTJ.EZpvd(C37659oxx.AEQbTJ(strAEQbTJ), continuation);
    }
}
