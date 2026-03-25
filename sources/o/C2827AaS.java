package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2827AaS {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2827AaS copy$default(C2827AaS c2827AaS, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2827AaS.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c2827AaS.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = c2827AaS.copydefault;
        }
        return c2827AaS.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2827AaS KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new C2827AaS(str, str2, str3);
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
        if (!(obj instanceof C2827AaS)) {
            return false;
        }
        C2827AaS c2827AaS = (C2827AaS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2827AaS.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2827AaS.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c2827AaS.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterAccount(email=" + this.AEQbTJ + ", phone=" + this.OLrzqt + ", areaCode=" + this.copydefault + ")";
    }

    public C2827AaS(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
    }
}
