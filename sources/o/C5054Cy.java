package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Cy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5054Cy {
    public final java.lang.Throwable EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5054Cy copy$default(C5054Cy c5054Cy, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            th = c5054Cy.EZpvd;
        }
        return c5054Cy.AEQbTJ(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5054Cy AEQbTJ(java.lang.Throwable th) {
        return new C5054Cy(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Throwable OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5054Cy) && Intrinsics.EZpvd(this.EZpvd, ((C5054Cy) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Throwable th = this.EZpvd;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClosedSentinel(cause=" + this.EZpvd + ')';
    }

    public C5054Cy(java.lang.Throwable th) {
        this.EZpvd = th;
    }
}
