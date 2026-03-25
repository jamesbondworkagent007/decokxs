package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AsB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3764AsB {
    public static final int $stable = 8;
    public C3769AsG EZpvd;
    public java.util.List<C3769AsG> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AsB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3764AsB copy$default(C3764AsB c3764AsB, C3769AsG c3769AsG, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3769AsG = c3764AsB.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c3764AsB.copydefault;
        }
        return c3764AsB.copydefault(c3769AsG, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3769AsG AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3769AsG> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3764AsB copydefault(@NotNull C3769AsG c3769AsG, @NotNull java.util.List<C3769AsG> list) {
        Intrinsics.checkNotNullParameter(c3769AsG, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C3764AsB(c3769AsG, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3764AsB)) {
            return false;
        }
        C3764AsB c3764AsB = (C3764AsB) obj;
        return Intrinsics.EZpvd(this.EZpvd, c3764AsB.EZpvd) && Intrinsics.EZpvd(this.copydefault, c3764AsB.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailFrequency(selectedOption=" + this.EZpvd + ", availableOptions=" + this.copydefault + ")";
    }

    public C3764AsB(@NotNull C3769AsG c3769AsG, @NotNull java.util.List<C3769AsG> list) {
        Intrinsics.checkNotNullParameter(c3769AsG, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = c3769AsG;
        this.copydefault = list;
    }
}
