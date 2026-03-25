package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.AtA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3816AtA {
    public static final int $stable = 8;
    public java.util.List<C3952Avg> AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AtA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3816AtA copy$default(C3816AtA c3816AtA, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3816AtA.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c3816AtA.AEQbTJ;
        }
        return c3816AtA.AEQbTJ(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3952Avg> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3816AtA AEQbTJ(boolean z, @NotNull java.util.List<C3952Avg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C3816AtA(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3816AtA)) {
            return false;
        }
        C3816AtA c3816AtA = (C3816AtA) obj;
        return this.KWHzl == c3816AtA.KWHzl && Intrinsics.EZpvd(this.AEQbTJ, c3816AtA.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.KWHzl) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailOrders(shouldShowViewAllButton=" + this.KWHzl + ", placedOrders=" + this.AEQbTJ + ")";
    }

    public C3816AtA(boolean z, @NotNull java.util.List<C3952Avg> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = z;
        this.AEQbTJ = list;
    }
}
