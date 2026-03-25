package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.Trend;

/* JADX INFO: renamed from: o.AtE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3820AtE {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public boolean KWHzl;
    public Trend OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3820AtE copy$default(C3820AtE c3820AtE, java.lang.String str, Trend trend, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3820AtE.copydefault;
        }
        if ((i & 2) != 0) {
            trend = c3820AtE.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c3820AtE.KWHzl;
        }
        if ((i & 8) != 0) {
            z2 = c3820AtE.AEQbTJ;
        }
        return c3820AtE.KWHzl(str, trend, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Trend AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3820AtE KWHzl(@NotNull java.lang.String str, @NotNull Trend trend, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trend, "");
        return new C3820AtE(str, trend, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3820AtE)) {
            return false;
        }
        C3820AtE c3820AtE = (C3820AtE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3820AtE.copydefault) && this.OLrzqt == c3820AtE.OLrzqt && this.KWHzl == c3820AtE.KWHzl && this.AEQbTJ == c3820AtE.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailPnlBlock(title=" + this.copydefault + ", trend=" + this.OLrzqt + ", hasValue=" + this.KWHzl + ", hasAveragePrice=" + this.AEQbTJ + ")";
    }

    public C3820AtE(@NotNull java.lang.String str, @NotNull Trend trend, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(trend, "");
        this.copydefault = str;
        this.OLrzqt = trend;
        this.KWHzl = z;
        this.AEQbTJ = z2;
    }
}
