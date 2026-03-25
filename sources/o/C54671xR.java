package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54671xR implements InterfaceC54563xN {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54671xR copy$default(C54671xR c54671xR, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c54671xR.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c54671xR.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str3 = c54671xR.copydefault;
        }
        return c54671xR.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54671xR OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new C54671xR(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC54563xN
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54671xR)) {
            return false;
        }
        C54671xR c54671xR = (C54671xR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54671xR.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c54671xR.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c54671xR.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "XmlError(requestId=" + this.KWHzl + ", code=" + this.AEQbTJ + ", message=" + this.copydefault + ')';
    }

    public C54671xR(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
    }
}
