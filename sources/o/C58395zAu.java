package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58395zAu {
    public static final int $stable = 8;
    public C3086AfM AEQbTJ;
    public java.lang.Boolean KWHzl;
    public java.lang.String OLrzqt;
    public java.util.List<C58391zAq> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zAu */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58395zAu copy$default(C58395zAu c58395zAu, java.lang.String str, java.util.List list, java.lang.Boolean bool, C3086AfM c3086AfM, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58395zAu.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c58395zAu.copydefault;
        }
        if ((i & 4) != 0) {
            bool = c58395zAu.KWHzl;
        }
        if ((i & 8) != 0) {
            c3086AfM = c58395zAu.AEQbTJ;
        }
        return c58395zAu.copydefault(str, list, bool, c3086AfM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58391zAq> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3086AfM copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58395zAu copydefault(java.lang.String str, java.util.List<C58391zAq> list, java.lang.Boolean bool, C3086AfM c3086AfM) {
        return new C58395zAu(str, list, bool, c3086AfM);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58395zAu)) {
            return false;
        }
        C58395zAu c58395zAu = (C58395zAu) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58395zAu.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c58395zAu.copydefault) && Intrinsics.EZpvd(this.KWHzl, c58395zAu.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c58395zAu.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.util.List<C58391zAq> list = this.copydefault;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        C3086AfM c3086AfM = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c3086AfM != null ? c3086AfM.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConsentResponse(embeddedTosUrl=" + this.OLrzqt + ", consents=" + this.copydefault + ", needSwitchSite=" + this.KWHzl + ", switchSiteInfo=" + this.AEQbTJ + ")";
    }

    public C58395zAu(java.lang.String str, java.util.List<C58391zAq> list, java.lang.Boolean bool, C3086AfM c3086AfM) {
        this.OLrzqt = str;
        this.copydefault = list;
        this.KWHzl = bool;
        this.AEQbTJ = c3086AfM;
    }
}
