package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4136AzE {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4136AzE KWHzl(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C4136AzE(str, str2, str3, str4, str5, str6, str7, str8, str9, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4136AzE)) {
            return false;
        }
        C4136AzE c4136AzE = (C4136AzE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c4136AzE.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4136AzE.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c4136AzE.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c4136AzE.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c4136AzE.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c4136AzE.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c4136AzE.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c4136AzE.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c4136AzE.gEmmrt) && this.AhwBna == c4136AzE.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.valueOf;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AYXKKw;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.djBIcL;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.gEmmrt;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BridgeSupportChainInfo(chainId=" + this.OLrzqt + ", chainLogo=" + this.AEQbTJ + ", chainName=" + this.EZpvd + ", chainSymbol=" + this.copydefault + ", createTime=" + this.KWHzl + ", mainId=" + this.valueOf + ", isDel=" + this.AYXKKw + ", modifyTime=" + this.djBIcL + ", sortCrossBridge=" + this.gEmmrt + ", supportLinkDapp=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AYXKKw;
    }

    public C4136AzE(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = str;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.KWHzl = str5;
        this.valueOf = str6;
        this.AYXKKw = str7;
        this.djBIcL = str8;
        this.gEmmrt = str9;
        this.AhwBna = z;
    }
}
