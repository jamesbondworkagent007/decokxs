package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ABf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2164ABf {
    public static final int $stable = 8;
    public C2159ABa AEQbTJ;
    public java.util.List<C2163ABe> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ABf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2164ABf copy$default(C2164ABf c2164ABf, java.util.List list, C2159ABa c2159ABa, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2164ABf.EZpvd;
        }
        if ((i & 2) != 0) {
            c2159ABa = c2164ABf.AEQbTJ;
        }
        return c2164ABf.copydefault(list, c2159ABa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2163ABe> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2159ABa OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2164ABf copydefault(@NotNull java.util.List<C2163ABe> list, C2159ABa c2159ABa) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2164ABf(list, c2159ABa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2164ABf)) {
            return false;
        }
        C2164ABf c2164ABf = (C2164ABf) obj;
        return Intrinsics.EZpvd(this.EZpvd, c2164ABf.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, c2164ABf.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        C2159ABa c2159ABa = this.AEQbTJ;
        return (iHashCode * 31) + (c2159ABa == null ? 0 : c2159ABa.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexLiquidityChartData(results=" + this.EZpvd + ", chartConfig=" + this.AEQbTJ + ")";
    }

    public C2164ABf(@NotNull java.util.List<C2163ABe> list, C2159ABa c2159ABa) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
        this.AEQbTJ = c2159ABa;
    }
}
