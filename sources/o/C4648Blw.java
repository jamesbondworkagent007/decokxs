package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Blw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C4648Blw {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.util.List<BjD> KWHzl;
    public java.util.List<BkU> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Blw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4648Blw copy$default(C4648Blw c4648Blw, java.lang.String str, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c4648Blw.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c4648Blw.KWHzl;
        }
        if ((i & 4) != 0) {
            list2 = c4648Blw.copydefault;
        }
        return c4648Blw.KWHzl(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BjD> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4648Blw KWHzl(java.lang.String str, @NotNull java.util.List<BjD> list, java.util.List<BkU> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C4648Blw(str, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<BkU> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4648Blw)) {
            return false;
        }
        C4648Blw c4648Blw = (C4648Blw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c4648Blw.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c4648Blw.KWHzl) && Intrinsics.EZpvd(this.copydefault, c4648Blw.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        java.util.List<BkU> list = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SearchDexVosResult(keyword=" + this.AEQbTJ + ", chainGroups=" + this.KWHzl + ", voList=" + this.copydefault + ")";
    }

    public C4648Blw(java.lang.String str, @NotNull java.util.List<BjD> list, java.util.List<BkU> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.KWHzl = list;
        this.copydefault = list2;
    }
}
