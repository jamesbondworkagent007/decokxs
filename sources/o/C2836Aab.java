package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.Aab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2836Aab {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<java.lang.String> KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Aab */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2836Aab copy$default(C2836Aab c2836Aab, java.lang.String str, java.util.List list, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c2836Aab.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c2836Aab.KWHzl;
        }
        if ((i & 4) != 0) {
            str2 = c2836Aab.OLrzqt;
        }
        return c2836Aab.KWHzl(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2836Aab KWHzl(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        return new C2836Aab(str, list, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2836Aab)) {
            return false;
        }
        C2836Aab c2836Aab = (C2836Aab) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c2836Aab.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c2836Aab.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c2836Aab.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.util.List<java.lang.String> list = this.KWHzl;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PreConditionResponse(userSiteChipTitle=" + this.AEQbTJ + ", availableSocialTypes=" + this.KWHzl + ", flow=" + this.OLrzqt + ")";
    }

    public C2836Aab(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        this.AEQbTJ = str;
        this.KWHzl = list;
        this.OLrzqt = str2;
    }
}
