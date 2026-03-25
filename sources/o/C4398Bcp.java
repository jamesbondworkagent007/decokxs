package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Bcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4398Bcp {
    public static final int $stable = 8;
    public java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C4398Bcp copy$default(C4398Bcp c4398Bcp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4398Bcp.KWHzl;
        }
        return c4398Bcp.EZpvd(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4398Bcp EZpvd(java.lang.String str) {
        return new C4398Bcp(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4398Bcp) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((C4398Bcp) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SymmetricSignConfig(customKey=" + this.KWHzl + ")";
    }

    public C4398Bcp(java.lang.String str) {
        this.KWHzl = str;
    }
}
