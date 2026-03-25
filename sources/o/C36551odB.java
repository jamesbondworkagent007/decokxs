package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.odB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36551odB {
    public final java.lang.Long KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C36551odB copy$default(C36551odB c36551odB, java.lang.String str, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c36551odB.copydefault;
        }
        if ((i & 2) != 0) {
            l = c36551odB.KWHzl;
        }
        return c36551odB.OLrzqt(str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C36551odB OLrzqt(java.lang.String str, java.lang.Long l) {
        return new C36551odB(str, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36551odB)) {
            return false;
        }
        C36551odB c36551odB = (C36551odB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c36551odB.copydefault) && Intrinsics.EZpvd(this.KWHzl, c36551odB.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Long l = this.KWHzl;
        return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GroupAnnouncementBanner(notice=" + this.copydefault + ", editTime=" + this.KWHzl + ")";
    }

    public C36551odB(java.lang.String str, java.lang.Long l) {
        this.copydefault = str;
        this.KWHzl = l;
    }
}
