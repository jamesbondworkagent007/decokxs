package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.gsC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21033gsC {
    public final java.lang.String AEQbTJ;
    public final boolean AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C21033gsC copy$default(C21033gsC c21033gsC, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c21033gsC.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c21033gsC.OLrzqt;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c21033gsC.EZpvd;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c21033gsC.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            z = c21033gsC.AhwBna;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = c21033gsC.KWHzl;
        }
        return c21033gsC.OLrzqt(str, str6, str7, str8, z2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21033gsC OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5) {
        return new C21033gsC(str, str2, str3, str4, z, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21033gsC)) {
            return false;
        }
        C21033gsC c21033gsC = (C21033gsC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c21033gsC.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c21033gsC.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c21033gsC.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c21033gsC.copydefault) && this.AhwBna == c21033gsC.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c21033gsC.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.copydefault;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.AhwBna);
        java.lang.String str5 = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReceivePriceInfo(digitalPriceValue=" + this.AEQbTJ + ", digitalPriceUnit=" + this.OLrzqt + ", currencyValue=" + this.EZpvd + ", currencySign=" + this.copydefault + ", isCurrencyFirst=" + this.AhwBna + ", currencyIosCode=" + this.KWHzl + ")";
    }

    public C21033gsC(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.EZpvd = str3;
        this.copydefault = str4;
        this.AhwBna = z;
        this.KWHzl = str5;
    }
}
