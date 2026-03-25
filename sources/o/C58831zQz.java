package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C58831zQz {
    public static final int $stable = 8;
    public java.util.List<C3082AfI> EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zQz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58831zQz copy$default(C58831zQz c58831zQz, boolean z, java.util.List list, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c58831zQz.copydefault;
        }
        if ((i & 2) != 0) {
            list = c58831zQz.EZpvd;
        }
        if ((i & 4) != 0) {
            str = c58831zQz.KWHzl;
        }
        if ((i & 8) != 0) {
            str2 = c58831zQz.OLrzqt;
        }
        return c58831zQz.KWHzl(z, list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3082AfI> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58831zQz KWHzl(boolean z, @NotNull java.util.List<C3082AfI> list, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C58831zQz(z, list, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
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
        if (!(obj instanceof C58831zQz)) {
            return false;
        }
        C58831zQz c58831zQz = (C58831zQz) obj;
        return this.copydefault == c58831zQz.copydefault && Intrinsics.EZpvd(this.EZpvd, c58831zQz.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c58831zQz.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c58831zQz.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OkxPasskeyCrossDeviceSyncState(isLoading=" + this.copydefault + ", deviceList=" + this.EZpvd + ", business=" + this.KWHzl + ", violatedPrecondition=" + this.OLrzqt + ")";
    }

    public C58831zQz(boolean z, @NotNull java.util.List<C3082AfI> list, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.EZpvd = list;
        this.KWHzl = str;
        this.OLrzqt = str2;
    }
}
