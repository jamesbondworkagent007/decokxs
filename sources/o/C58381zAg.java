package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.zAg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C58381zAg {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C58381zAg copy$default(C58381zAg c58381zAg, java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c58381zAg.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = c58381zAg.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c58381zAg.copydefault;
        }
        return c58381zAg.OLrzqt(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58381zAg OLrzqt(java.lang.String str, java.lang.String str2, boolean z) {
        return new C58381zAg(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58381zAg)) {
            return false;
        }
        C58381zAg c58381zAg = (C58381zAg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c58381zAg.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58381zAg.KWHzl) && this.copydefault == c58381zAg.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChangePasswordResult(nextStep=" + this.AEQbTJ + ", business=" + this.KWHzl + ", isSuccess=" + this.copydefault + ")";
    }

    public C58381zAg(java.lang.String str, java.lang.String str2, boolean z) {
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.copydefault = z;
    }
}
