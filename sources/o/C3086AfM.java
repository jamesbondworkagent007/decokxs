package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AfM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3086AfM {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3086AfM copy$default(C3086AfM c3086AfM, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c3086AfM.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c3086AfM.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = c3086AfM.copydefault;
        }
        if ((i & 8) != 0) {
            str4 = c3086AfM.KWHzl;
        }
        return c3086AfM.copydefault(str, str2, str3, str4);
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
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3086AfM copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new C3086AfM(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3086AfM)) {
            return false;
        }
        C3086AfM c3086AfM = (C3086AfM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3086AfM.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3086AfM.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3086AfM.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3086AfM.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SwitchSiteInfo(userSite=" + this.AEQbTJ + ", domain=" + this.OLrzqt + ", cefiWsDomain=" + this.copydefault + ", defiWsDomain=" + this.KWHzl + ")";
    }

    public C3086AfM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.AEQbTJ = str;
        this.OLrzqt = str2;
        this.copydefault = str3;
        this.KWHzl = str4;
    }
}
