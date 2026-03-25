package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AGp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C2304AGp {
    public static final int $stable = 8;
    public java.util.List<C2300AGl> KWHzl;
    public java.util.List<C2300AGl> OLrzqt;
    public java.util.List<C2300AGl> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AGp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2304AGp copy$default(C2304AGp c2304AGp, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2304AGp.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = c2304AGp.copydefault;
        }
        if ((i & 4) != 0) {
            list3 = c2304AGp.OLrzqt;
        }
        return c2304AGp.OLrzqt(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2300AGl> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2300AGl> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2304AGp OLrzqt(@NotNull java.util.List<C2300AGl> list, @NotNull java.util.List<C2300AGl> list2, @NotNull java.util.List<C2300AGl> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C2304AGp(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2300AGl> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2304AGp)) {
            return false;
        }
        C2304AGp c2304AGp = (C2304AGp) obj;
        return Intrinsics.EZpvd(this.KWHzl, c2304AGp.KWHzl) && Intrinsics.EZpvd(this.copydefault, c2304AGp.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c2304AGp.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RiskLevelData(highRiskList=" + this.KWHzl + ", lowRiskList=" + this.copydefault + ", middleRiskList=" + this.OLrzqt + ")";
    }

    public C2304AGp(@NotNull java.util.List<C2300AGl> list, @NotNull java.util.List<C2300AGl> list2, @NotNull java.util.List<C2300AGl> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.KWHzl = list;
        this.copydefault = list2;
        this.OLrzqt = list3;
    }
}
