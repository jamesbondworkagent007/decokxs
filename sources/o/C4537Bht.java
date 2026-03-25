package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4537Bht {
    public static final int $stable = 8;
    public java.util.List<C4536Bhs> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bht */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4537Bht copy$default(C4537Bht c4537Bht, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c4537Bht.copydefault;
        }
        return c4537Bht.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4536Bhs> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4537Bht OLrzqt(@NotNull java.util.List<C4536Bhs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C4537Bht(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4537Bht) && Intrinsics.EZpvd(this.copydefault, ((C4537Bht) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketCapResult(data=" + this.copydefault + ")";
    }

    public C4537Bht(@NotNull java.util.List<C4536Bhs> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }
}
