package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AWz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2729AWz {
    public static final int $stable = 8;
    public java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2729AWz copy$default(C2729AWz c2729AWz, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2729AWz.EZpvd;
        }
        return c2729AWz.OLrzqt(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2729AWz OLrzqt(java.lang.String str) {
        return new C2729AWz(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2729AWz) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((C2729AWz) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ShortLinkMeta(deeplink=" + this.EZpvd + ")";
    }

    public C2729AWz(java.lang.String str) {
        this.EZpvd = str;
    }
}
