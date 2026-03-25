package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25904jKr {
    public final java.util.List<C25908jKv> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jKr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C25904jKr copy$default(C25904jKr c25904jKr, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c25904jKr.copydefault;
        }
        return c25904jKr.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C25908jKv> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25904jKr KWHzl(@NotNull java.util.List<C25908jKv> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C25904jKr(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25904jKr) && Intrinsics.EZpvd(this.copydefault, ((C25904jKr) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HappenedFundFeeOverViewVo(items=" + this.copydefault + ")";
    }

    public C25904jKr(@NotNull java.util.List<C25908jKv> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }
}
