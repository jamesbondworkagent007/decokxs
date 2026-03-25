package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2829AaU {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<zAL> EZpvd;
    public C58404zBc KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.AaU */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2829AaU copy$default(C2829AaU c2829AaU, C58404zBc c58404zBc, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c58404zBc = c2829AaU.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c2829AaU.AEQbTJ;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = c2829AaU.OLrzqt;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c2829AaU.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            list = c2829AaU.EZpvd;
        }
        return c2829AaU.AEQbTJ(c58404zBc, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2829AaU AEQbTJ(C58404zBc c58404zBc, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<zAL> list) {
        return new C2829AaU(c58404zBc, str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<zAL> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58404zBc copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2829AaU)) {
            return false;
        }
        C2829AaU c2829AaU = (C2829AaU) obj;
        return Intrinsics.EZpvd(this.KWHzl, c2829AaU.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2829AaU.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2829AaU.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2829AaU.copydefault) && Intrinsics.EZpvd(this.EZpvd, c2829AaU.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C58404zBc c58404zBc = this.KWHzl;
        int iHashCode = c58404zBc == null ? 0 : c58404zBc.hashCode();
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.util.List<zAL> list = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PublicKey(extensions=" + this.KWHzl + ", userVerification=" + this.AEQbTJ + ", challenge=" + this.OLrzqt + ", rpId=" + this.copydefault + ", allowCredentials=" + this.EZpvd + ")";
    }

    public C2829AaU(C58404zBc c58404zBc, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<zAL> list) {
        this.KWHzl = c58404zBc;
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.EZpvd = list;
    }
}
