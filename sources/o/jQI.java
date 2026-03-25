package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class jQI {
    public final java.util.List<jQH> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jQI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jQI copy$default(jQI jqi, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = jqi.copydefault;
        }
        return jqi.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<jQH> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jQI copydefault(@NotNull java.util.List<jQH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new jQI(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jQI) && Intrinsics.EZpvd(this.copydefault, ((jQI) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LiquidityPoolChartConfigUIModel(periodConfigs=" + this.copydefault + ")";
    }

    public jQI(@NotNull java.util.List<jQH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }
}
