package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.xG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C54373xG {
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C54373xG copy$default(C54373xG c54373xG, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c54373xG.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c54373xG.AEQbTJ;
        }
        return c54373xG.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54373xG OLrzqt(java.lang.String str, java.lang.String str2) {
        return new C54373xG(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54373xG)) {
            return false;
        }
        C54373xG c54373xG = (C54373xG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c54373xG.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c54373xG.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Ec2QueryError(code=" + this.KWHzl + ", message=" + this.AEQbTJ + ')';
    }

    public C54373xG(java.lang.String str, java.lang.String str2) {
        this.KWHzl = str;
        this.AEQbTJ = str2;
    }
}
