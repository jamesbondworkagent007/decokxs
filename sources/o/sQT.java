package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sQT {
    public final java.lang.Long KWHzl;
    public final java.lang.Long OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ sQT copy$default(sQT sqt, java.lang.Long l, java.lang.Long l2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = sqt.OLrzqt;
        }
        if ((i & 2) != 0) {
            l2 = sqt.KWHzl;
        }
        return sqt.OLrzqt(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final sQT OLrzqt(java.lang.Long l, java.lang.Long l2) {
        return new sQT(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sQT)) {
            return false;
        }
        sQT sqt = (sQT) obj;
        return Intrinsics.EZpvd(this.OLrzqt, sqt.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, sqt.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.OLrzqt;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.Long l2 = this.KWHzl;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MessageTimeRange(minSentTime=" + this.OLrzqt + ", maxSentTime=" + this.KWHzl + ")";
    }

    public sQT(java.lang.Long l, java.lang.Long l2) {
        this.OLrzqt = l;
        this.KWHzl = l2;
    }
}
