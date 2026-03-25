package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class AGF {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.Integer djBIcL;
    public java.lang.Integer gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AGF EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.String str6, java.lang.Integer num2, java.lang.String str7, java.lang.String str8) {
        return new AGF(str, str2, str3, str4, str5, num, str6, num2, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AGF)) {
            return false;
        }
        AGF agf = (AGF) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) agf.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) agf.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) agf.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) agf.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) agf.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, agf.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) agf.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, agf.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) agf.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) agf.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AYXKKw;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.valueOf;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.copydefault;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.AhwBna;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.Integer num = this.gEmmrt;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        java.lang.String str6 = this.AEQbTJ;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        java.lang.Integer num2 = this.djBIcL;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str7 = this.KWHzl;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.EZpvd;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SingleTokenListRequest(chainId=" + this.OLrzqt + ", userUniqueId=" + this.AYXKKw + ", walletId=" + this.valueOf + ", accountId=" + this.copydefault + ", userWalletAddress=" + this.AhwBna + ", tokenType=" + this.gEmmrt + ", inputContent=" + this.AEQbTJ + ", searchType=" + this.djBIcL + ", groupId=" + this.KWHzl + ", minAmountThreshold=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer valueOf() {
        return this.djBIcL;
    }

    public AGF(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.String str6, java.lang.Integer num2, java.lang.String str7, java.lang.String str8) {
        this.OLrzqt = str;
        this.AYXKKw = str2;
        this.valueOf = str3;
        this.copydefault = str4;
        this.AhwBna = str5;
        this.gEmmrt = num;
        this.AEQbTJ = str6;
        this.djBIcL = num2;
        this.KWHzl = str7;
        this.EZpvd = str8;
    }
}
