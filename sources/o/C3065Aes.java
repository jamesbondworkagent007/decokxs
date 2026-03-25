package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Aes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3065Aes {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3065Aes copy$default(C3065Aes c3065Aes, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3065Aes.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c3065Aes.KWHzl;
        }
        if ((i & 4) != 0) {
            str3 = c3065Aes.copydefault;
        }
        if ((i & 8) != 0) {
            str4 = c3065Aes.OLrzqt;
        }
        return c3065Aes.EZpvd(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3065Aes EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new C3065Aes(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3065Aes)) {
            return false;
        }
        C3065Aes c3065Aes = (C3065Aes) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3065Aes.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3065Aes.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3065Aes.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3065Aes.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ResponseData(clientDataJson=" + this.AEQbTJ + ", authenticatorData=" + this.KWHzl + ", signature=" + this.copydefault + ", userHandle=" + this.OLrzqt + ")";
    }

    public C3065Aes(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.copydefault = str3;
        this.OLrzqt = str4;
    }
}
