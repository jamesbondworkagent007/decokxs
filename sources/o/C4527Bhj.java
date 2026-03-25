package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Bhj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C4527Bhj {
    public static final int $stable = 8;
    public java.util.List<C4523Bhf> EZpvd;
    public java.util.List<? extends java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.Bhj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4527Bhj copy$default(C4527Bhj c4527Bhj, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c4527Bhj.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = c4527Bhj.copydefault;
        }
        return c4527Bhj.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C4523Bhf> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<java.util.List<java.lang.String>> */
    public final java.util.List<java.util.List<java.lang.String>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C4527Bhj EZpvd(@NotNull java.util.List<C4523Bhf> list, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C4527Bhj(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4527Bhj)) {
            return false;
        }
        C4527Bhj c4527Bhj = (C4527Bhj) obj;
        return Intrinsics.EZpvd(this.EZpvd, c4527Bhj.EZpvd) && Intrinsics.EZpvd(this.copydefault, c4527Bhj.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BuySellMarkerResult(data=" + this.EZpvd + ", orderInfoArray=" + this.copydefault + ")";
    }

    public C4527Bhj(@NotNull java.util.List<C4523Bhf> list, @NotNull java.util.List<? extends java.util.List<java.lang.String>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.EZpvd = list;
        this.copydefault = list2;
    }
}
