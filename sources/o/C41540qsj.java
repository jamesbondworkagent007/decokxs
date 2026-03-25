package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesTypeEnum;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41540qsj {
    public final boolean AEQbTJ;
    public final SortBy AYXKKw;
    public final FuturesTypeEnum AhwBna;
    public final PeriodEnum EZpvd;
    public final CategoryGroupVo KWHzl;
    public final C41467qrP OLrzqt;
    public final boolean copydefault;
    public final SortOrder djBIcL;
    public final FuturesUnitVo gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP AYXKKw() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesUnitVo EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FuturesTypeEnum KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryGroupVo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41540qsj OLrzqt(@NotNull CategoryGroupVo categoryGroupVo, @NotNull FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull C41467qrP c41467qrP, boolean z, boolean z2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41540qsj(categoryGroupVo, futuresTypeEnum, futuresUnitVo, sortBy, sortOrder, c41467qrP, z, z2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortBy copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41540qsj)) {
            return false;
        }
        C41540qsj c41540qsj = (C41540qsj) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41540qsj.KWHzl) && this.AhwBna == c41540qsj.AhwBna && Intrinsics.EZpvd(this.gEmmrt, c41540qsj.gEmmrt) && this.AYXKKw == c41540qsj.AYXKKw && this.djBIcL == c41540qsj.djBIcL && Intrinsics.EZpvd(this.OLrzqt, c41540qsj.OLrzqt) && this.copydefault == c41540qsj.copydefault && this.AEQbTJ == c41540qsj.AEQbTJ && this.EZpvd == c41540qsj.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum gEmmrt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AhwBna.hashCode();
        FuturesUnitVo futuresUnitVo = this.gEmmrt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (futuresUnitVo == null ? 0 : futuresUnitVo.hashCode())) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode();
    }

    public C41540qsj(@NotNull CategoryGroupVo categoryGroupVo, @NotNull FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull C41467qrP c41467qrP, boolean z, boolean z2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(futuresTypeEnum, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(c41467qrP, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.KWHzl = categoryGroupVo;
        this.AhwBna = futuresTypeEnum;
        this.gEmmrt = futuresUnitVo;
        this.AYXKKw = sortBy;
        this.djBIcL = sortOrder;
        this.OLrzqt = c41467qrP;
        this.copydefault = z;
        this.AEQbTJ = z2;
        this.EZpvd = periodEnum;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r13v0 com.okinc.market.quotation.ui.model.CategoryGroupVo)
  (r14v0 com.okinc.market.quotation.ui.model.FuturesTypeEnum)
  (r15v0 com.okinc.market.quotation.ui.model.FuturesUnitVo)
  (r16v0 com.okinc.market.quotation.ui.model.SortBy)
  (r17v0 com.okinc.market.quotation.ui.model.SortOrder)
  (r18v0 o.qrP)
  (r19v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:com.okinc.market.time.filter.PeriodEnum:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:36) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1D com.okinc.market.time.filter.PeriodEnum) : (r21v0 com.okinc.market.time.filter.PeriodEnum))
 A[MD:(com.okinc.market.quotation.ui.model.CategoryGroupVo, com.okinc.market.quotation.ui.model.FuturesTypeEnum, com.okinc.market.quotation.ui.model.FuturesUnitVo, com.okinc.market.quotation.ui.model.SortBy, com.okinc.market.quotation.ui.model.SortOrder, o.qrP, boolean, boolean, com.okinc.market.time.filter.PeriodEnum):void (m)] (LINE:27) call: o.qsj.<init>(com.okinc.market.quotation.ui.model.CategoryGroupVo, com.okinc.market.quotation.ui.model.FuturesTypeEnum, com.okinc.market.quotation.ui.model.FuturesUnitVo, com.okinc.market.quotation.ui.model.SortBy, com.okinc.market.quotation.ui.model.SortOrder, o.qrP, boolean, boolean, com.okinc.market.time.filter.PeriodEnum):void type: THIS */
    public /* synthetic */ C41540qsj(CategoryGroupVo categoryGroupVo, FuturesTypeEnum futuresTypeEnum, FuturesUnitVo futuresUnitVo, SortBy sortBy, SortOrder sortOrder, C41467qrP c41467qrP, boolean z, boolean z2, PeriodEnum periodEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(categoryGroupVo, futuresTypeEnum, futuresUnitVo, sortBy, sortOrder, c41467qrP, z, (i & 128) != 0 ? true : z2, (i & 256) != 0 ? PeriodEnum.RANKING_PERIOD_1D : periodEnum);
    }

    public java.lang.String toString() {
        java.lang.String strAhwBna = this.KWHzl.AhwBna();
        FuturesTypeEnum futuresTypeEnum = this.AhwBna;
        FuturesUnitVo futuresUnitVo = this.gEmmrt;
        return "SubscribeFuturesVosPayload(category=" + strAhwBna + ", type=" + futuresTypeEnum + ", unit=" + (futuresUnitVo != null ? futuresUnitVo.KWHzl() : null) + ", sortBy=" + this.AYXKKw + ", sortOrder=" + this.djBIcL + ", isEnableWsTickers=" + this.copydefault + ", isEnableTickers=" + this.AEQbTJ + ", period=" + this.EZpvd + ")";
    }
}
