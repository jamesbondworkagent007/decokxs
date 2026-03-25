package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class hMT {
    public final java.util.List<hMR> EZpvd;
    public final java.lang.Integer KWHzl;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hMT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ hMT copy$default(hMT hmt, java.lang.Integer num, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = hmt.KWHzl;
        }
        if ((i & 2) != 0) {
            z = hmt.copydefault;
        }
        if ((i & 4) != 0) {
            list = hmt.EZpvd;
        }
        return hmt.OLrzqt(num, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<hMR> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hMT OLrzqt(java.lang.Integer num, boolean z, java.util.List<hMR> list) {
        return new hMT(num, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hMT)) {
            return false;
        }
        hMT hmt = (hMT) obj;
        return Intrinsics.EZpvd(this.KWHzl, hmt.KWHzl) && this.copydefault == hmt.copydefault && Intrinsics.EZpvd(this.EZpvd, hmt.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.KWHzl;
        int iHashCode = num == null ? 0 : num.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        java.util.List<hMR> list = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExecutionHistoryViewParam(executionHistoryShowMaxNum=" + this.KWHzl + ", showExecutionHistoryMaxNum=" + this.copydefault + ", executionHistoryList=" + this.EZpvd + ")";
    }

    public hMT(java.lang.Integer num, boolean z, java.util.List<hMR> list) {
        this.KWHzl = num;
        this.copydefault = z;
        this.EZpvd = list;
    }
}
