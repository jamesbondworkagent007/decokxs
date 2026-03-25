package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23722iGx {
    public final java.lang.String AEQbTJ;
    public final java.lang.String OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23722iGx copy$default(C23722iGx c23722iGx, int i, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c23722iGx.copydefault;
        }
        if ((i2 & 2) != 0) {
            str = c23722iGx.OLrzqt;
        }
        if ((i2 & 4) != 0) {
            str2 = c23722iGx.AEQbTJ;
        }
        return c23722iGx.copydefault(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23722iGx copydefault(int i, java.lang.String str, java.lang.String str2) {
        return new C23722iGx(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23722iGx)) {
            return false;
        }
        C23722iGx c23722iGx = (C23722iGx) obj;
        return this.copydefault == c23722iGx.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23722iGx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c23722iGx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.copydefault);
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ListHeaderQuery(tabId=" + this.copydefault + ", itemKey=" + this.OLrzqt + ", totalTokenAmount=" + this.AEQbTJ + ")";
    }

    public C23722iGx(int i, java.lang.String str, java.lang.String str2) {
        this.copydefault = i;
        this.OLrzqt = str;
        this.AEQbTJ = str2;
    }
}
