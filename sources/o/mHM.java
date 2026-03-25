package o;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.utils.RecurringBuyPlanOrderStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mHM extends OKCRListItem {
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final long copydefault;
    public final java.lang.String djBIcL;
    public final RecurringBuyPlanOrderStatus gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyPlanOrderStatus AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mHM copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatus, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new mHM(str, str2, j, recurringBuyPlanOrderStatus, z, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mHM)) {
            return false;
        }
        mHM mhm = (mHM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) mhm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) mhm.AhwBna) && this.copydefault == mhm.copydefault && this.gEmmrt == mhm.gEmmrt && this.KWHzl == mhm.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) mhm.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) mhm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) mhm.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public java.lang.String getId() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.OLrzqt.hashCode() * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Long.hashCode(this.copydefault)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecurringBuyPlanOrderListItem(id=" + this.OLrzqt + ", orderNo=" + this.AhwBna + ", createDate=" + this.copydefault + ", status=" + this.gEmmrt + ", hasBaseAmount=" + this.KWHzl + ", baseCurrencyIcon=" + this.EZpvd + ", baseAmountText=" + this.AEQbTJ + ", quoteAmountText=" + this.djBIcL + ")";
    }

    public mHM(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull RecurringBuyPlanOrderStatus recurringBuyPlanOrderStatus, boolean z, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(recurringBuyPlanOrderStatus, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.OLrzqt = str;
        this.AhwBna = str2;
        this.copydefault = j;
        this.gEmmrt = recurringBuyPlanOrderStatus;
        this.KWHzl = z;
        this.EZpvd = str3;
        this.AEQbTJ = str4;
        this.djBIcL = str5;
    }
}
