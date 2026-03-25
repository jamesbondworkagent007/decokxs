package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AtC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3818AtC {
    public static final int $stable = 8;
    public C3820AtE AEQbTJ;
    public C3820AtE KWHzl;
    public C3820AtE OLrzqt;
    public C3820AtE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3818AtC copy$default(C3818AtC c3818AtC, C3820AtE c3820AtE, C3820AtE c3820AtE2, C3820AtE c3820AtE3, C3820AtE c3820AtE4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3820AtE = c3818AtC.OLrzqt;
        }
        if ((i & 2) != 0) {
            c3820AtE2 = c3818AtC.KWHzl;
        }
        if ((i & 4) != 0) {
            c3820AtE3 = c3818AtC.copydefault;
        }
        if ((i & 8) != 0) {
            c3820AtE4 = c3818AtC.AEQbTJ;
        }
        return c3818AtC.AEQbTJ(c3820AtE, c3820AtE2, c3820AtE3, c3820AtE4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3818AtC AEQbTJ(@NotNull C3820AtE c3820AtE, @NotNull C3820AtE c3820AtE2, @NotNull C3820AtE c3820AtE3, @NotNull C3820AtE c3820AtE4) {
        Intrinsics.checkNotNullParameter(c3820AtE, "");
        Intrinsics.checkNotNullParameter(c3820AtE2, "");
        Intrinsics.checkNotNullParameter(c3820AtE3, "");
        Intrinsics.checkNotNullParameter(c3820AtE4, "");
        return new C3818AtC(c3820AtE, c3820AtE2, c3820AtE3, c3820AtE4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3820AtE EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3820AtE KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3820AtE OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3820AtE copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3818AtC)) {
            return false;
        }
        C3818AtC c3818AtC = (C3818AtC) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c3818AtC.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c3818AtC.KWHzl) && Intrinsics.EZpvd(this.copydefault, c3818AtC.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c3818AtC.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPnl(averagePrice=" + this.OLrzqt + ", currentPrice=" + this.KWHzl + ", totalPaymentAmount=" + this.copydefault + ", performance=" + this.AEQbTJ + ")";
    }

    public C3818AtC(@NotNull C3820AtE c3820AtE, @NotNull C3820AtE c3820AtE2, @NotNull C3820AtE c3820AtE3, @NotNull C3820AtE c3820AtE4) {
        Intrinsics.checkNotNullParameter(c3820AtE, "");
        Intrinsics.checkNotNullParameter(c3820AtE2, "");
        Intrinsics.checkNotNullParameter(c3820AtE3, "");
        Intrinsics.checkNotNullParameter(c3820AtE4, "");
        this.OLrzqt = c3820AtE;
        this.KWHzl = c3820AtE2;
        this.copydefault = c3820AtE3;
        this.AEQbTJ = c3820AtE4;
    }
}
