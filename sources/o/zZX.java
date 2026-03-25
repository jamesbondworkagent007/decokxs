package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes25.dex */
public final class zZX {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public java.util.List<C58412zBk> KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.zZX */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zZX copy$default(zZX zzx, boolean z, boolean z2, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = zzx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = zzx.copydefault;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = zzx.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = zzx.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            list = zzx.KWHzl;
        }
        return zzx.EZpvd(z, z3, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zZX EZpvd(boolean z, boolean z2, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C58412zBk> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new zZX(z, z2, str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58412zBk> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zZX)) {
            return false;
        }
        zZX zzx = (zZX) obj;
        return this.AEQbTJ == zzx.AEQbTJ && this.copydefault == zzx.copydefault && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) zzx.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) zzx.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, zzx.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode3 = this.EZpvd.hashCode();
        java.lang.String str = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Popup(show=" + this.AEQbTJ + ", dismissible=" + this.copydefault + ", title=" + this.EZpvd + ", content=" + this.OLrzqt + ", items=" + this.KWHzl + ")";
    }

    public zZX(boolean z, boolean z2, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.List<C58412zBk> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = list;
    }
}
