package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54644xQ implements InterfaceC54563xN {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final C54671xR OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54644xQ copy$default(C54644xQ c54644xQ, C54671xR c54671xR, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c54671xR = c54644xQ.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c54644xQ.copydefault;
        }
        return c54644xQ.KWHzl(c54671xR, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54644xQ KWHzl(C54671xR c54671xR, java.lang.String str) {
        return new C54644xQ(c54671xR, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54644xQ)) {
            return false;
        }
        C54644xQ c54644xQ = (C54644xQ) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c54644xQ.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c54644xQ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        C54671xR c54671xR = this.OLrzqt;
        int iHashCode = c54671xR == null ? 0 : c54671xR.hashCode();
        java.lang.String str = this.copydefault;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "XmlErrorResponse(error=" + this.OLrzqt + ", requestId=" + this.copydefault + ')';
    }

    public C54644xQ(C54671xR c54671xR, java.lang.String str) {
        this.OLrzqt = c54671xR;
        this.copydefault = str;
        this.EZpvd = c54671xR != null ? c54671xR.copydefault() : null;
        this.AEQbTJ = c54671xR != null ? c54671xR.AEQbTJ() : null;
    }
}
