package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41597qtn {
    public final java.util.List<InterfaceC41641que> AEQbTJ;
    public final SortBy AYXKKw;
    public final boolean EZpvd;
    public final ChargeGroupVo KWHzl;
    public final CategoryGroupVo OLrzqt;
    public final boolean copydefault;
    public final PeriodEnum djBIcL;
    public final SortOrder valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CategoryGroupVo KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortBy OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41597qtn copydefault(@NotNull CategoryGroupVo categoryGroupVo, ChargeGroupVo chargeGroupVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull java.util.List<? extends InterfaceC41641que> list, boolean z, boolean z2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41597qtn(categoryGroupVo, chargeGroupVo, sortBy, sortOrder, list, z, z2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41597qtn)) {
            return false;
        }
        C41597qtn c41597qtn = (C41597qtn) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c41597qtn.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c41597qtn.KWHzl) && this.AYXKKw == c41597qtn.AYXKKw && this.valueOf == c41597qtn.valueOf && Intrinsics.EZpvd(this.AEQbTJ, c41597qtn.AEQbTJ) && this.copydefault == c41597qtn.copydefault && this.EZpvd == c41597qtn.EZpvd && this.djBIcL == c41597qtn.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        ChargeGroupVo chargeGroupVo = this.KWHzl;
        return (((((((((((((iHashCode * 31) + (chargeGroupVo == null ? 0 : chargeGroupVo.hashCode())) * 31) + this.AYXKKw.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41597qtn(@NotNull CategoryGroupVo categoryGroupVo, ChargeGroupVo chargeGroupVo, @NotNull SortBy sortBy, @NotNull SortOrder sortOrder, @NotNull java.util.List<? extends InterfaceC41641que> list, boolean z, boolean z2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        Intrinsics.checkNotNullParameter(sortBy, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.OLrzqt = categoryGroupVo;
        this.KWHzl = chargeGroupVo;
        this.AYXKKw = sortBy;
        this.valueOf = sortOrder;
        this.AEQbTJ = list;
        this.copydefault = z;
        this.EZpvd = z2;
        this.djBIcL = periodEnum;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (r12v0 com.okinc.market.quotation.ui.model.CategoryGroupVo)
  (r13v0 com.okinc.market.quotation.ui.model.ChargeGroupVo)
  (r14v0 com.okinc.market.quotation.ui.model.SortBy)
  (r15v0 com.okinc.market.quotation.ui.model.SortOrder)
  (r16v0 java.util.List)
  (r17v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r18v0 boolean))
  (wrap:com.okinc.market.time.filter.PeriodEnum:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:34) com.okinc.market.time.filter.PeriodEnum.RANKING_PERIOD_1D com.okinc.market.time.filter.PeriodEnum) : (r19v0 com.okinc.market.time.filter.PeriodEnum))
 A[MD:(com.okinc.market.quotation.ui.model.CategoryGroupVo, com.okinc.market.quotation.ui.model.ChargeGroupVo, com.okinc.market.quotation.ui.model.SortBy, com.okinc.market.quotation.ui.model.SortOrder, java.util.List<? extends o.que>, boolean, boolean, com.okinc.market.time.filter.PeriodEnum):void (m)] (LINE:26) call: o.qtn.<init>(com.okinc.market.quotation.ui.model.CategoryGroupVo, com.okinc.market.quotation.ui.model.ChargeGroupVo, com.okinc.market.quotation.ui.model.SortBy, com.okinc.market.quotation.ui.model.SortOrder, java.util.List, boolean, boolean, com.okinc.market.time.filter.PeriodEnum):void type: THIS */
    public /* synthetic */ C41597qtn(CategoryGroupVo categoryGroupVo, ChargeGroupVo chargeGroupVo, SortBy sortBy, SortOrder sortOrder, java.util.List list, boolean z, boolean z2, PeriodEnum periodEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(categoryGroupVo, chargeGroupVo, sortBy, sortOrder, list, z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? PeriodEnum.RANKING_PERIOD_1D : periodEnum);
    }

    public java.lang.String toString() {
        return "SubscribeSpotVosPayload(category=" + this.OLrzqt + ", charge=" + this.KWHzl + ", sortBy=" + this.AYXKKw + ", sortOrder=" + this.valueOf + ", allSpotVoListSize=" + this.AEQbTJ.size() + ", isEnableWsTickers=" + this.copydefault + ", isEnableTickers=" + this.EZpvd + ", period=" + this.djBIcL + ")";
    }
}
