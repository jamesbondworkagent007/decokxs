package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qTL {
    public static final qTL copydefault = new qTL();

    private qTL() {
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("OKMarket_Tickers", str + " " + str2);
    }

    public static /* synthetic */ void w$default(qTL qtl, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        qtl.OLrzqt(str, str2, th);
    }

    public final void OLrzqt(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.OLrzqt("OKMarket_Tickers", str + " " + str2, th);
    }

    public static /* synthetic */ void e$default(qTL qtl, java.lang.String str, java.lang.String str2, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        qtl.AEQbTJ(str, str2, th);
    }

    public final void AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.AEQbTJ("OKMarket_Tickers", str + " " + str2, th);
    }
}
