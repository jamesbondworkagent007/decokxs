package o;

import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iPh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23949iPh {
    public final java.util.List<java.util.List<InvestKLineDataPoint>> AEQbTJ;
    public final java.util.List<java.util.List<InvestKLineDataPoint>> KWHzl;
    public final java.util.List<java.util.List<InvestKLineDataPoint>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iPh */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C23949iPh copy$default(C23949iPh c23949iPh, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c23949iPh.OLrzqt;
        }
        if ((i & 2) != 0) {
            list2 = c23949iPh.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list3 = c23949iPh.KWHzl;
        }
        return c23949iPh.EZpvd(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<InvestKLineDataPoint>> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<InvestKLineDataPoint>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23949iPh EZpvd(@NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list, @NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list2, @NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new C23949iPh(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<InvestKLineDataPoint>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23949iPh)) {
            return false;
        }
        C23949iPh c23949iPh = (C23949iPh) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c23949iPh.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c23949iPh.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c23949iPh.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestKLineDataSet(normalDataPoints=" + this.OLrzqt + ", bonusDataPoints=" + this.AEQbTJ + ", normalDataPointsDuringBonus=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint>> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends java.util.List<com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C23949iPh(@NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list, @NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list2, @NotNull java.util.List<? extends java.util.List<InvestKLineDataPoint>> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.OLrzqt = list;
        this.AEQbTJ = list2;
        this.KWHzl = list3;
    }
}
