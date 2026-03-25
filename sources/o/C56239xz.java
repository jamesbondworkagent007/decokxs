package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56239xz implements InterfaceC56186xy {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C56239xz copy$default(C56239xz c56239xz, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c56239xz.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c56239xz.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = c56239xz.AEQbTJ;
        }
        return c56239xz.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56239xz AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new C56239xz(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56186xy
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56186xy
    public java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56239xz)) {
            return false;
        }
        C56239xz c56239xz = (C56239xz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c56239xz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c56239xz.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c56239xz.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ErrorDetails(code=" + this.copydefault + ", message=" + this.EZpvd + ", requestId=" + this.AEQbTJ + ')';
    }

    public C56239xz(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
    }
}
