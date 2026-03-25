package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pUX implements pUW {
    public static pUW AEQbTJ;
    public static final pUX OLrzqt = new pUX();
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull pUW puw) {
        Intrinsics.checkNotNullParameter(puw, "");
        AEQbTJ = puw;
    }

    private pUX() {
    }

    @Override // o.pUW
    public void AEQbTJ(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUW puw = AEQbTJ;
        if (puw != null) {
            puw.AEQbTJ(th);
        }
    }

    @Override // o.pUW
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUW puw = AEQbTJ;
        if (puw != null) {
            puw.KWHzl(str);
        }
    }
}
