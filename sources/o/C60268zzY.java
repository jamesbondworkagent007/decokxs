package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zzY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C60268zzY {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C60268zzY copy$default(C60268zzY c60268zzY, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c60268zzY.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c60268zzY.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c60268zzY.AEQbTJ;
        }
        return c60268zzY.copydefault(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C60268zzY copydefault(java.lang.String str, java.lang.String str2, boolean z) {
        return new C60268zzY(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60268zzY)) {
            return false;
        }
        C60268zzY c60268zzY = (C60268zzY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c60268zzY.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c60268zzY.KWHzl) && this.AEQbTJ == c60268zzY.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChangePasswordJourneyState(business=" + this.OLrzqt + ", sessionId=" + this.KWHzl + ", isLoading=" + this.AEQbTJ + ")";
    }

    public C60268zzY(java.lang.String str, java.lang.String str2, boolean z) {
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.AEQbTJ = z;
    }
}
