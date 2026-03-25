package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Aas, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2853Aas {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public boolean KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2853Aas copy$default(C2853Aas c2853Aas, java.lang.String str, boolean z, java.lang.String str2, int i, boolean z2, boolean z3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c2853Aas.gEmmrt;
        }
        if ((i2 & 2) != 0) {
            z = c2853Aas.OLrzqt;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            str2 = c2853Aas.EZpvd;
        }
        java.lang.String str3 = str2;
        if ((i2 & 8) != 0) {
            i = c2853Aas.copydefault;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z2 = c2853Aas.AEQbTJ;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            z3 = c2853Aas.KWHzl;
        }
        return c2853Aas.AEQbTJ(str, z4, str3, i3, z5, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2853Aas AEQbTJ(java.lang.String str, boolean z, java.lang.String str2, int i, boolean z2, boolean z3) {
        return new C2853Aas(str, z, str2, i, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2853Aas)) {
            return false;
        }
        C2853Aas c2853Aas = (C2853Aas) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c2853Aas.gEmmrt) && this.OLrzqt == c2853Aas.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2853Aas.EZpvd) && this.copydefault == c2853Aas.copydefault && this.AEQbTJ == c2853Aas.AEQbTJ && this.KWHzl == c2853Aas.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.gEmmrt;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str2 = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProfileListInput(residenceCountry=" + this.gEmmrt + ", hasKycCompany=" + this.OLrzqt + ", kycLevelString=" + this.EZpvd + ", kycState=" + this.copydefault + ", isWalletConnectLinked=" + this.AEQbTJ + ", isAbleToBindWalletAccounts=" + this.KWHzl + ")";
    }

    public C2853Aas(java.lang.String str, boolean z, java.lang.String str2, int i, boolean z2, boolean z3) {
        this.gEmmrt = str;
        this.OLrzqt = z;
        this.EZpvd = str2;
        this.copydefault = i;
        this.AEQbTJ = z2;
        this.KWHzl = z3;
    }
}
