package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.buy_sell.RecurringBuyPlanOrderStatus;
import uniffi.buy_sell.RecurringBuyPlanOrderStatusTag;

/* JADX INFO: renamed from: o.Avg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3952Avg {
    public static final int $stable = 8;
    public long AEQbTJ;
    public java.lang.String AYXKKw;
    public boolean AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public RecurringBuyPlanOrderStatusTag djBIcL;
    public RecurringBuyPlanOrderStatus gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanOrderStatusTag AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3952Avg EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus, @NotNull RecurringBuyPlanOrderStatusTag recurringBuyPlanOrderStatusTag, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatus, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatusTag, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C3952Avg(str, j, str2, recurringBuyPlanOrderStatus, recurringBuyPlanOrderStatusTag, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3952Avg)) {
            return false;
        }
        C3952Avg c3952Avg = (C3952Avg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c3952Avg.AYXKKw) && this.AEQbTJ == c3952Avg.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c3952Avg.EZpvd) && this.gEmmrt == c3952Avg.gEmmrt && this.djBIcL == c3952Avg.djBIcL && this.AhwBna == c3952Avg.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c3952Avg.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c3952Avg.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c3952Avg.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.AYXKKw.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanOrderListItem(orderNo=" + this.AYXKKw + ", createDate=" + this.AEQbTJ + ", formattedCreateDate=" + this.EZpvd + ", status=" + this.gEmmrt + ", statusTag=" + this.djBIcL + ", hasBaseAmount=" + this.AhwBna + ", baseCurrencyIconUrl=" + this.KWHzl + ", formattedBaseAmount=" + this.copydefault + ", formattedQuoteAmount=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanOrderStatus valueOf() {
        return this.gEmmrt;
    }

    public C3952Avg(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus, @NotNull RecurringBuyPlanOrderStatusTag recurringBuyPlanOrderStatusTag, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatus, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatusTag, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.AYXKKw = str;
        this.AEQbTJ = j;
        this.EZpvd = str2;
        this.gEmmrt = recurringBuyPlanOrderStatus;
        this.djBIcL = recurringBuyPlanOrderStatusTag;
        this.AhwBna = z;
        this.KWHzl = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
    }
}
