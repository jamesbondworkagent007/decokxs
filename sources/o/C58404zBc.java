package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58404zBc {
    public static final int $stable = 8;
    public java.lang.Boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58404zBc copy$default(C58404zBc c58404zBc, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = c58404zBc.AEQbTJ;
        }
        return c58404zBc.OLrzqt(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58404zBc OLrzqt(java.lang.Boolean bool) {
        return new C58404zBc(bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58404zBc) && Intrinsics.EZpvd(this.AEQbTJ, ((C58404zBc) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Boolean bool = this.AEQbTJ;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Extensions(credProps=" + this.AEQbTJ + ")";
    }

    public C58404zBc(java.lang.Boolean bool) {
        this.AEQbTJ = bool;
    }
}
