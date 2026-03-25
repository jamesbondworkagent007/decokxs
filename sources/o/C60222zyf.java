package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zyf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C60222zyf {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60222zyf copy$default(C60222zyf c60222zyf, boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c60222zyf.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = c60222zyf.valueOf;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            z3 = c60222zyf.EZpvd;
        }
        boolean z5 = z3;
        if ((i & 8) != 0) {
            str = c60222zyf.copydefault;
        }
        java.lang.String str4 = str;
        if ((i & 16) != 0) {
            str2 = c60222zyf.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 32) != 0) {
            str3 = c60222zyf.OLrzqt;
        }
        return c60222zyf.OLrzqt(z, z4, z5, str4, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60222zyf OLrzqt(boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new C60222zyf(z, z2, z3, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60222zyf)) {
            return false;
        }
        C60222zyf c60222zyf = (C60222zyf) obj;
        return this.KWHzl == c60222zyf.KWHzl && this.valueOf == c60222zyf.valueOf && this.EZpvd == c60222zyf.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c60222zyf.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c60222zyf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c60222zyf.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode2 = java.lang.Boolean.hashCode(this.valueOf);
        int iHashCode3 = java.lang.Boolean.hashCode(this.EZpvd);
        java.lang.String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AccountConnectState(isLinkFlow=" + this.KWHzl + ", supportsCrossSiteBinding=" + this.valueOf + ", hasBoundAccount=" + this.EZpvd + ", boundAccountEmail=" + this.copydefault + ", boundAccountSite=" + this.AEQbTJ + ", currentUserLoginName=" + this.OLrzqt + ")";
    }

    public C60222zyf(boolean z, boolean z2, boolean z3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.KWHzl = z;
        this.valueOf = z2;
        this.EZpvd = z3;
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.OLrzqt = str3;
    }
}
