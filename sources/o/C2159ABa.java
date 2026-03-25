package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ABa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2159ABa {
    public static final int $stable = 8;
    public java.util.List<C2161ABc> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ABa */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2159ABa copy$default(C2159ABa c2159ABa, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c2159ABa.copydefault;
        }
        return c2159ABa.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C2161ABc> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C2159ABa KWHzl(@NotNull java.util.List<C2161ABc> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C2159ABa(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2159ABa) && Intrinsics.EZpvd(this.copydefault, ((C2159ABa) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DexLiquidityChartConfig(periodConfigs=" + this.copydefault + ")";
    }

    public C2159ABa(@NotNull java.util.List<C2161ABc> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }
}
