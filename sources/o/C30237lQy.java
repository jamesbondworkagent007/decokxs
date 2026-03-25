package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lQy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30237lQy {
    public final java.util.List<mHM> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lQy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C30237lQy copy$default(C30237lQy c30237lQy, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c30237lQy.copydefault;
        }
        if ((i & 2) != 0) {
            list = c30237lQy.OLrzqt;
        }
        return c30237lQy.AEQbTJ(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C30237lQy AEQbTJ(boolean z, @NotNull java.util.List<mHM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C30237lQy(z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<mHM> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30237lQy)) {
            return false;
        }
        C30237lQy c30237lQy = (C30237lQy) obj;
        return this.copydefault == c30237lQy.copydefault && Intrinsics.EZpvd(this.OLrzqt, c30237lQy.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.copydefault) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailOrdersUiModel(shouldShowViewAllButton=" + this.copydefault + ", placedOrders=" + this.OLrzqt + ")";
    }

    public C30237lQy(boolean z, @NotNull java.util.List<mHM> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = z;
        this.OLrzqt = list;
    }
}
