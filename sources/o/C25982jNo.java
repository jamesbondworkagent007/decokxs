package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25982jNo {
    public final double AEQbTJ;
    public final double EZpvd;
    public final double KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final double djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25982jNo AEQbTJ(double d, double d2, double d3, double d4, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C25982jNo(d, d2, d3, d4, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25982jNo)) {
            return false;
        }
        C25982jNo c25982jNo = (C25982jNo) obj;
        return java.lang.Double.compare(this.KWHzl, c25982jNo.KWHzl) == 0 && java.lang.Double.compare(this.EZpvd, c25982jNo.EZpvd) == 0 && java.lang.Double.compare(this.djBIcL, c25982jNo.djBIcL) == 0 && java.lang.Double.compare(this.AEQbTJ, c25982jNo.AEQbTJ) == 0 && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c25982jNo.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c25982jNo.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((java.lang.Double.hashCode(this.KWHzl) * 31) + java.lang.Double.hashCode(this.EZpvd)) * 31) + java.lang.Double.hashCode(this.djBIcL)) * 31) + java.lang.Double.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartAvgPriceUiModel(avgPrice=" + this.KWHzl + ", positionAmount=" + this.EZpvd + ", unrealizedProfit=" + this.djBIcL + ", realizedProfit=" + this.AEQbTJ + ", pnlRate=" + this.OLrzqt + ", filterAddress=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double valueOf() {
        return this.djBIcL;
    }

    public C25982jNo(double d, double d2, double d3, double d4, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = d;
        this.EZpvd = d2;
        this.djBIcL = d3;
        this.AEQbTJ = d4;
        this.OLrzqt = str;
        this.copydefault = str2;
    }
}
