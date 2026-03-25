package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ABH {
    public static final int $stable = 8;
    public java.util.List<C2165ABg> AEQbTJ;
    public java.lang.String OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ABH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ABH copy$default(ABH abh, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = abh.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = abh.copydefault;
        }
        if ((i & 4) != 0) {
            str = abh.OLrzqt;
        }
        return abh.KWHzl(list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2165ABg> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ABH KWHzl(@NotNull java.util.List<C2165ABg> list, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ABH(list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ABH)) {
            return false;
        }
        ABH abh = (ABH) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, abh.AEQbTJ) && this.copydefault == abh.copydefault && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) abh.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        java.lang.String str = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexPoolInfoState(pools=" + this.AEQbTJ + ", isLoading=" + this.copydefault + ", errorMessage=" + this.OLrzqt + ")";
    }

    public ABH(@NotNull java.util.List<C2165ABg> list, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.copydefault = z;
        this.OLrzqt = str;
    }
}
