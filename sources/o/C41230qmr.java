package o;

import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.time.filter.PeriodEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qmr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41230qmr {
    public final ChargeGroupVo AEQbTJ;
    public final PeriodEnum KWHzl;
    public final java.util.List<InterfaceC41641que> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qmr */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41230qmr copy$default(C41230qmr c41230qmr, java.util.List list, ChargeGroupVo chargeGroupVo, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41230qmr.OLrzqt;
        }
        if ((i & 2) != 0) {
            chargeGroupVo = c41230qmr.AEQbTJ;
        }
        if ((i & 4) != 0) {
            periodEnum = c41230qmr.KWHzl;
        }
        return c41230qmr.EZpvd(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41230qmr EZpvd(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41230qmr(list, chargeGroupVo, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChargeGroupVo OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41230qmr)) {
            return false;
        }
        C41230qmr c41230qmr = (C41230qmr) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c41230qmr.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c41230qmr.AEQbTJ) && this.KWHzl == c41230qmr.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GetMarketDiscoverSpotUpVosPayload(spotVoList=" + this.OLrzqt + ", chargeGroupVo=" + this.AEQbTJ + ", period=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41230qmr(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull ChargeGroupVo chargeGroupVo, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(chargeGroupVo, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.OLrzqt = list;
        this.AEQbTJ = chargeGroupVo;
        this.KWHzl = periodEnum;
    }
}
