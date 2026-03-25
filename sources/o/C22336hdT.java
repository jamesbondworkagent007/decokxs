package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.hdT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22336hdT {
    public java.lang.String KWHzl;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hdT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22336hdT copy$default(C22336hdT c22336hdT, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c22336hdT.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c22336hdT.copydefault;
        }
        return c22336hdT.OLrzqt(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22336hdT OLrzqt(java.lang.String str, java.util.List<java.lang.String> list) {
        return new C22336hdT(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.util.List<java.lang.String> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22336hdT)) {
            return false;
        }
        C22336hdT c22336hdT = (C22336hdT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c22336hdT.KWHzl) && Intrinsics.EZpvd(this.copydefault, c22336hdT.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.util.List<java.lang.String> list = this.copydefault;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BlackListParam(key=" + this.KWHzl + ", blackListTypes=" + this.copydefault + ")";
    }

    public C22336hdT(java.lang.String str, java.util.List<java.lang.String> list) {
        this.KWHzl = str;
        this.copydefault = list;
    }
}
