package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanDetailContentStateVariant;

/* JADX INFO: renamed from: o.Asx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3812Asx {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public RecurringBuyPlanDetailContentStateVariant KWHzl;
    public C3843Atb OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3812Asx copy$default(C3812Asx c3812Asx, RecurringBuyPlanDetailContentStateVariant recurringBuyPlanDetailContentStateVariant, C3843Atb c3843Atb, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recurringBuyPlanDetailContentStateVariant = c3812Asx.KWHzl;
        }
        if ((i & 2) != 0) {
            c3843Atb = c3812Asx.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = c3812Asx.AEQbTJ;
        }
        return c3812Asx.OLrzqt(recurringBuyPlanDetailContentStateVariant, c3843Atb, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailContentStateVariant EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3843Atb KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3812Asx OLrzqt(@NotNull RecurringBuyPlanDetailContentStateVariant recurringBuyPlanDetailContentStateVariant, @NotNull C3843Atb c3843Atb, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailContentStateVariant, "");
        Intrinsics.checkNotNullParameter(c3843Atb, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3812Asx(recurringBuyPlanDetailContentStateVariant, c3843Atb, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3812Asx)) {
            return false;
        }
        C3812Asx c3812Asx = (C3812Asx) obj;
        return this.KWHzl == c3812Asx.KWHzl && Intrinsics.EZpvd(this.OLrzqt, c3812Asx.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c3812Asx.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailContentState(variant=" + this.KWHzl + ", item=" + this.OLrzqt + ", errorMessage=" + this.AEQbTJ + ")";
    }

    public C3812Asx(@NotNull RecurringBuyPlanDetailContentStateVariant recurringBuyPlanDetailContentStateVariant, @NotNull C3843Atb c3843Atb, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(recurringBuyPlanDetailContentStateVariant, "");
        Intrinsics.checkNotNullParameter(c3843Atb, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = recurringBuyPlanDetailContentStateVariant;
        this.OLrzqt = c3843Atb;
        this.AEQbTJ = str;
    }
}
