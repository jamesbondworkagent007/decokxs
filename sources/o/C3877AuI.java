package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanOrderListContentStateVariant;

/* JADX INFO: renamed from: o.AuI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3877AuI {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public RecurringBuyPlanOrderListContentStateVariant KWHzl;
    public java.util.List<C3952Avg> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AuI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3877AuI copy$default(C3877AuI c3877AuI, RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recurringBuyPlanOrderListContentStateVariant = c3877AuI.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c3877AuI.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = c3877AuI.AEQbTJ;
        }
        return c3877AuI.copydefault(recurringBuyPlanOrderListContentStateVariant, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3952Avg> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanOrderListContentStateVariant OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3877AuI copydefault(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant, @NotNull java.util.List<C3952Avg> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListContentStateVariant, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3877AuI(recurringBuyPlanOrderListContentStateVariant, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3877AuI)) {
            return false;
        }
        C3877AuI c3877AuI = (C3877AuI) obj;
        return this.KWHzl == c3877AuI.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c3877AuI.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3877AuI.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanOrderListContentState(variant=" + this.KWHzl + ", items=" + this.OLrzqt + ", errorMessage=" + this.AEQbTJ + ")";
    }

    public C3877AuI(@NotNull RecurringBuyPlanOrderListContentStateVariant recurringBuyPlanOrderListContentStateVariant, @NotNull java.util.List<C3952Avg> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderListContentStateVariant, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = recurringBuyPlanOrderListContentStateVariant;
        this.OLrzqt = list;
        this.AEQbTJ = str;
    }
}
