package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AQp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C2564AQp {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public AbstractC2499AOc KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2564AQp copy$default(C2564AQp c2564AQp, java.lang.String str, java.lang.String str2, AbstractC2499AOc abstractC2499AOc, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2564AQp.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = c2564AQp.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            abstractC2499AOc = c2564AQp.KWHzl;
        }
        AbstractC2499AOc abstractC2499AOc2 = abstractC2499AOc;
        if ((i & 8) != 0) {
            z = c2564AQp.copydefault;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str3 = c2564AQp.OLrzqt;
        }
        return c2564AQp.copydefault(str, str4, abstractC2499AOc2, z2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC2499AOc EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2564AQp copydefault(java.lang.String str, java.lang.String str2, AbstractC2499AOc abstractC2499AOc, boolean z, java.lang.String str3) {
        return new C2564AQp(str, str2, abstractC2499AOc, z, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2564AQp)) {
            return false;
        }
        C2564AQp c2564AQp = (C2564AQp) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c2564AQp.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2564AQp.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c2564AQp.KWHzl) && this.copydefault == c2564AQp.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2564AQp.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        AbstractC2499AOc abstractC2499AOc = this.KWHzl;
        int iHashCode3 = abstractC2499AOc == null ? 0 : abstractC2499AOc.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str3 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SharePreviewCommon(previewTitle=" + this.EZpvd + ", previewContent=" + this.AEQbTJ + ", previewIcon=" + this.KWHzl + ", editable=" + this.copydefault + ", previewBottomTips=" + this.OLrzqt + ")";
    }

    public C2564AQp(java.lang.String str, java.lang.String str2, AbstractC2499AOc abstractC2499AOc, boolean z, java.lang.String str3) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = abstractC2499AOc;
        this.copydefault = z;
        this.OLrzqt = str3;
    }
}
