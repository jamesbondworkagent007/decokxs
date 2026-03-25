package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.AbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2883AbV {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C2883AbV copy$default(C2883AbV c2883AbV, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2883AbV.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = c2883AbV.copydefault;
        }
        return c2883AbV.OLrzqt(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2883AbV OLrzqt(java.lang.String str, boolean z) {
        return new C2883AbV(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2883AbV)) {
            return false;
        }
        C2883AbV c2883AbV = (C2883AbV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2883AbV.AEQbTJ) && this.copydefault == c2883AbV.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RegisterEmailInputState(email=" + this.AEQbTJ + ", isNextButtonEnabled=" + this.copydefault + ")";
    }

    public C2883AbV(java.lang.String str, boolean z) {
        this.AEQbTJ = str;
        this.copydefault = z;
    }
}
