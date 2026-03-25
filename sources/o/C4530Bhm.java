package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4530Bhm {
    public static final int $stable = 8;
    public java.util.List<C4525Bhh> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bhm */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4530Bhm copy$default(C4530Bhm c4530Bhm, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c4530Bhm.KWHzl;
        }
        return c4530Bhm.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4525Bhh> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4530Bhm copydefault(@NotNull java.util.List<C4525Bhh> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C4530Bhm(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4530Bhm) && Intrinsics.EZpvd(this.KWHzl, ((C4530Bhm) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CoinNewsResult(contentDataList=" + this.KWHzl + ")";
    }

    public C4530Bhm(@NotNull java.util.List<C4525Bhh> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }
}
