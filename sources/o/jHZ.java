package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class jHZ {
    public jHW EZpvd;
    public final java.util.List<C25833jIa> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jHZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ jHZ copy$default(jHZ jhz, java.util.List list, jHW jhw, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = jhz.copydefault;
        }
        if ((i & 2) != 0) {
            jhw = jhz.EZpvd;
        }
        return jhz.OLrzqt(list, jhw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C25833jIa> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jHW EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jHZ OLrzqt(@NotNull java.util.List<C25833jIa> list, @NotNull jHW jhw) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(jhw, "");
        return new jHZ(list, jhw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jHZ)) {
            return false;
        }
        jHZ jhz = (jHZ) obj;
        return Intrinsics.EZpvd(this.copydefault, jhz.copydefault) && Intrinsics.EZpvd(this.EZpvd, jhz.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ChartDataContainer(dataPoints=" + this.copydefault + ", config=" + this.EZpvd + ")";
    }

    public jHZ(@NotNull java.util.List<C25833jIa> list, @NotNull jHW jhw) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(jhw, "");
        this.copydefault = list;
        this.EZpvd = jhw;
    }
}
