package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.dex.RiskControlLevel;

/* JADX INFO: renamed from: o.AzP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4147AzP {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<C2296AGh> AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.util.List<C2296AGh> OLrzqt;
    public java.lang.String copydefault;
    public C2298AGj djBIcL;
    public RiskControlLevel gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2296AGh> AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2298AGj AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4147AzP EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<C2296AGh> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.List<C2296AGh> list2, C2298AGj c2298AGj, @NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        return new C4147AzP(str, list, str2, str3, str4, str5, list2, c2298AGj, riskControlLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2296AGh> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4147AzP)) {
            return false;
        }
        C4147AzP c4147AzP = (C4147AzP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4147AzP.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c4147AzP.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4147AzP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4147AzP.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c4147AzP.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c4147AzP.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, c4147AzP.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c4147AzP.djBIcL) && this.gEmmrt == c4147AzP.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskControlLevel gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        int iHashCode6 = this.AhwBna.hashCode();
        int iHashCode7 = this.AYXKKw.hashCode();
        C2298AGj c2298AGj = this.djBIcL;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c2298AGj == null ? 0 : c2298AGj.hashCode())) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinRisk(buyTaxes=" + this.KWHzl + ", contractAnalysis=" + this.OLrzqt + ", highRiskNum=" + this.AEQbTJ + ", lowRiskNum=" + this.EZpvd + ", middleRiskNum=" + this.copydefault + ", sellTaxes=" + this.AhwBna + ", swapAnalysis=" + this.AYXKKw + ", riskBannerData=" + this.djBIcL + ", riskControlLevel=" + this.gEmmrt + ")";
    }

    public C4147AzP(@NotNull java.lang.String str, @NotNull java.util.List<C2296AGh> list, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.util.List<C2296AGh> list2, C2298AGj c2298AGj, @NotNull RiskControlLevel riskControlLevel) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(riskControlLevel, "");
        this.KWHzl = str;
        this.OLrzqt = list;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.AhwBna = str5;
        this.AYXKKw = list2;
        this.djBIcL = c2298AGj;
        this.gEmmrt = riskControlLevel;
    }
}
