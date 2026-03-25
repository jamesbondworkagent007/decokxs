package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.plx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39104plx {
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39104plx copy$default(C39104plx c39104plx, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39104plx.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c39104plx.KWHzl;
        }
        return c39104plx.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39104plx EZpvd(java.lang.String str, java.lang.String str2) {
        return new C39104plx(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39104plx)) {
            return false;
        }
        C39104plx c39104plx = (C39104plx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c39104plx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c39104plx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UpdateMarketCoinBean(instId=" + this.OLrzqt + ", instType=" + this.KWHzl + ")";
    }

    public C39104plx(java.lang.String str, java.lang.String str2) {
        this.OLrzqt = str;
        this.KWHzl = str2;
    }
}
