package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class BkU {
    public static final int $stable = 8;
    public java.lang.Double AEQbTJ;
    public boolean AYXKKw;
    public java.lang.Double AhwBna;
    public java.lang.String DbNXlk;
    public java.lang.String EZpvd;
    public BjJ KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public boolean isConnected;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BjJ KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BkU OLrzqt(@NotNull BjJ bjJ, java.lang.Double d, java.lang.Double d2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(bjJ, "");
        return new BkU(bjJ, d, d2, str, str2, str3, str4, z, str5, z2, z3, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BkU)) {
            return false;
        }
        BkU bkU = (BkU) obj;
        return Intrinsics.EZpvd(this.KWHzl, bkU.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, bkU.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, bkU.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) bkU.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) bkU.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) bkU.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bkU.DbNXlk) && this.AYXKKw == bkU.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) bkU.valueOf) && this.isConnected == bkU.isConnected && this.copydefault == bkU.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) bkU.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) bkU.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.Double d = this.AEQbTJ;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.AhwBna;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        java.lang.String str = this.fetchVPNInfo;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.djBIcL;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.gEmmrt;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.DbNXlk;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        int iHashCode8 = java.lang.Boolean.hashCode(this.AYXKKw);
        java.lang.String str5 = this.valueOf;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        int iHashCode10 = java.lang.Boolean.hashCode(this.isConnected);
        int iHashCode11 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str6 = this.EZpvd;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.OLrzqt;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuotationDexItemVo(dexInstrument=" + this.KWHzl + ", changeRatioValue=" + this.AEQbTJ + ", priceValue=" + this.AhwBna + ", turnoverValue=" + this.fetchVPNInfo + ", marketCapValue=" + this.djBIcL + ", liquidity=" + this.gEmmrt + ", sortTag=" + this.DbNXlk + ", isWatching=" + this.AYXKKw + ", searchKeyword=" + this.valueOf + ", verified=" + this.isConnected + ", boosted=" + this.copydefault + ", boostPercentage=" + this.EZpvd + ", boostRate=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        return this.AYXKKw;
    }

    public BkU(@NotNull BjJ bjJ, java.lang.Double d, java.lang.Double d2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, boolean z2, boolean z3, java.lang.String str6, java.lang.String str7) {
        Intrinsics.checkNotNullParameter(bjJ, "");
        this.KWHzl = bjJ;
        this.AEQbTJ = d;
        this.AhwBna = d2;
        this.fetchVPNInfo = str;
        this.djBIcL = str2;
        this.gEmmrt = str3;
        this.DbNXlk = str4;
        this.AYXKKw = z;
        this.valueOf = str5;
        this.isConnected = z2;
        this.copydefault = z3;
        this.EZpvd = str6;
        this.OLrzqt = str7;
    }
}
