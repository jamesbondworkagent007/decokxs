package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanDetailStatusChangeType;

/* JADX INFO: renamed from: o.AtD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C3819AtD {
    public static final int $stable = 8;
    public boolean AEQbTJ;
    public RecurringBuyPlanDetailStatusChangeType AYXKKw;
    public boolean EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public C3812Asx copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3819AtD copy$default(C3819AtD c3819AtD, C3812Asx c3812Asx, java.lang.String str, boolean z, java.lang.String str2, boolean z2, RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c3812Asx = c3819AtD.copydefault;
        }
        if ((i & 2) != 0) {
            str = c3819AtD.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            z = c3819AtD.AEQbTJ;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            str2 = c3819AtD.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            z2 = c3819AtD.EZpvd;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            recurringBuyPlanDetailStatusChangeType = c3819AtD.AYXKKw;
        }
        return c3819AtD.OLrzqt(c3812Asx, str3, z3, str4, z4, recurringBuyPlanDetailStatusChangeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3812Asx EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanDetailStatusChangeType KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3819AtD OLrzqt(@NotNull C3812Asx c3812Asx, @NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeType) {
        Intrinsics.checkNotNullParameter(c3812Asx, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C3819AtD(c3812Asx, str, z, str2, z2, recurringBuyPlanDetailStatusChangeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3819AtD)) {
            return false;
        }
        C3819AtD c3819AtD = (C3819AtD) obj;
        return Intrinsics.EZpvd(this.copydefault, c3819AtD.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3819AtD.KWHzl) && this.AEQbTJ == c3819AtD.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3819AtD.OLrzqt) && this.EZpvd == c3819AtD.EZpvd && this.AYXKKw == c3819AtD.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.OLrzqt;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = java.lang.Boolean.hashCode(this.EZpvd);
        RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeType = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (recurringBuyPlanDetailStatusChangeType != null ? recurringBuyPlanDetailStatusChangeType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanDetailState(content=" + this.copydefault + ", planId=" + this.KWHzl + ", isFromResultPage=" + this.AEQbTJ + ", previousStatus=" + this.OLrzqt + ", isUpdatingPlan=" + this.EZpvd + ", statusChangeType=" + this.AYXKKw + ")";
    }

    public C3819AtD(@NotNull C3812Asx c3812Asx, @NotNull java.lang.String str, boolean z, java.lang.String str2, boolean z2, RecurringBuyPlanDetailStatusChangeType recurringBuyPlanDetailStatusChangeType) {
        Intrinsics.checkNotNullParameter(c3812Asx, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = c3812Asx;
        this.KWHzl = str;
        this.AEQbTJ = z;
        this.OLrzqt = str2;
        this.EZpvd = z2;
        this.AYXKKw = recurringBuyPlanDetailStatusChangeType;
    }
}
