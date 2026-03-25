package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanListContentStateVariant;

/* JADX INFO: renamed from: o.AtN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3829AtN {
    public static final int $stable = 8;
    public RecurringBuyPlanListContentStateVariant AEQbTJ;
    public java.lang.String OLrzqt;
    public java.util.List<C3903Auj> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AtN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C3829AtN copy$default(C3829AtN c3829AtN, RecurringBuyPlanListContentStateVariant recurringBuyPlanListContentStateVariant, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recurringBuyPlanListContentStateVariant = c3829AtN.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list = c3829AtN.copydefault;
        }
        if ((i & 4) != 0) {
            str = c3829AtN.OLrzqt;
        }
        return c3829AtN.AEQbTJ(recurringBuyPlanListContentStateVariant, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3829AtN AEQbTJ(@NotNull RecurringBuyPlanListContentStateVariant recurringBuyPlanListContentStateVariant, @NotNull java.util.List<C3903Auj> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanListContentStateVariant, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3829AtN(recurringBuyPlanListContentStateVariant, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C3903Auj> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanListContentStateVariant copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3829AtN)) {
            return false;
        }
        C3829AtN c3829AtN = (C3829AtN) obj;
        return this.AEQbTJ == c3829AtN.AEQbTJ && Intrinsics.EZpvd(this.copydefault, c3829AtN.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3829AtN.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanListContentState(variant=" + this.AEQbTJ + ", items=" + this.copydefault + ", errorMessage=" + this.OLrzqt + ")";
    }

    public C3829AtN(@NotNull RecurringBuyPlanListContentStateVariant recurringBuyPlanListContentStateVariant, @NotNull java.util.List<C3903Auj> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanListContentStateVariant, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = recurringBuyPlanListContentStateVariant;
        this.copydefault = list;
        this.OLrzqt = str;
    }
}
