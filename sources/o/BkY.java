package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class BkY {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public BlF AhwBna;
    public java.lang.Double AkhnZx;
    public java.lang.String DbNXlk;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.Double copydefault;
    public java.lang.String djBIcL;
    public boolean fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String isConnected;
    public java.lang.Double valueOf;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BkY copydefault(@NotNull BlF blF, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z2, java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(blF, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BkY(blF, str, str2, str3, z, str4, d, d2, d3, str5, str6, str7, z2, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BkY)) {
            return false;
        }
        BkY bkY = (BkY) obj;
        return Intrinsics.EZpvd(this.AhwBna, bkY.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) bkY.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) bkY.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) bkY.djBIcL) && this.fetchVPNInfo == bkY.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) bkY.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, bkY.copydefault) && Intrinsics.EZpvd(this.valueOf, bkY.valueOf) && Intrinsics.EZpvd(this.AkhnZx, bkY.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) bkY.values) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) bkY.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) bkY.isConnected) && this.EZpvd == bkY.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) bkY.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) bkY.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlF gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AhwBna.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.gEmmrt.hashCode();
        int iHashCode4 = this.djBIcL.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.fetchVPNInfo);
        int iHashCode6 = this.AEQbTJ.hashCode();
        java.lang.Double d = this.copydefault;
        int iHashCode7 = d == null ? 0 : d.hashCode();
        java.lang.Double d2 = this.valueOf;
        int iHashCode8 = d2 == null ? 0 : d2.hashCode();
        java.lang.Double d3 = this.AkhnZx;
        int iHashCode9 = d3 == null ? 0 : d3.hashCode();
        java.lang.String str2 = this.values;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.DbNXlk;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.isConnected;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        int iHashCode13 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.String str5 = this.AYXKKw;
        int iHashCode14 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.OLrzqt;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str6 == null ? 0 : str6.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "QuotationSpotItemVo(rawInstrument=" + this.AhwBna + ", iconUrl=" + this.KWHzl + ", name=" + this.gEmmrt + ", quote=" + this.djBIcL + ", showLeverage=" + this.fetchVPNInfo + ", leverage=" + this.AEQbTJ + ", changeRatioValue=" + this.copydefault + ", priceValue=" + this.valueOf + ", subPriceValue=" + this.AkhnZx + ", volumeValue=" + this.values + ", turnoverValue=" + this.DbNXlk + ", sortTag=" + this.isConnected + ", isWatching=" + this.EZpvd + ", searchKeyword=" + this.AYXKKw + ", marketCap=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Double values() {
        return this.AkhnZx;
    }

    public BkY(@NotNull BlF blF, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z2, java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(blF, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AhwBna = blF;
        this.KWHzl = str;
        this.gEmmrt = str2;
        this.djBIcL = str3;
        this.fetchVPNInfo = z;
        this.AEQbTJ = str4;
        this.copydefault = d;
        this.valueOf = d2;
        this.AkhnZx = d3;
        this.values = str5;
        this.DbNXlk = str6;
        this.isConnected = str7;
        this.EZpvd = z2;
        this.AYXKKw = str8;
        this.OLrzqt = str9;
    }
}
