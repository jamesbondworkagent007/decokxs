package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class eFN {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public java.util.List<eFL> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eFN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ eFN copy$default(eFN efn, java.lang.String str, java.lang.String str2, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = efn.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = efn.KWHzl;
        }
        if ((i & 4) != 0) {
            z = efn.OLrzqt;
        }
        if ((i & 8) != 0) {
            list = efn.copydefault;
        }
        return efn.OLrzqt(str, str2, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<eFL> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eFN OLrzqt(java.lang.String str, java.lang.String str2, boolean z, java.util.List<eFL> list) {
        return new eFN(str, str2, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eFN)) {
            return false;
        }
        eFN efn = (eFN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) efn.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) efn.KWHzl) && this.OLrzqt == efn.OLrzqt && Intrinsics.EZpvd(this.copydefault, efn.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.util.List<eFL> list = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HardWareSelectConnectTypeUI(imageRes=" + this.EZpvd + ", des=" + this.KWHzl + ", showHowToConnect=" + this.OLrzqt + ", connectTypeList=" + this.copydefault + ")";
    }

    public eFN(java.lang.String str, java.lang.String str2, boolean z, java.util.List<eFL> list) {
        this.EZpvd = str;
        this.KWHzl = str2;
        this.OLrzqt = z;
        this.copydefault = list;
    }
}
