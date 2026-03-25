package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41516qsL {
    public final java.util.List<InterfaceC41641que> AEQbTJ;
    public final PeriodEnum KWHzl;
    public final java.util.Map<java.lang.String, PeriodTickersPo> OLrzqt;
    public final java.util.Map<java.lang.String, TickersData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qsL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41516qsL copy$default(C41516qsL c41516qsL, java.util.List list, java.util.Map map, java.util.Map map2, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41516qsL.AEQbTJ;
        }
        if ((i & 2) != 0) {
            map = c41516qsL.OLrzqt;
        }
        if ((i & 4) != 0) {
            map2 = c41516qsL.copydefault;
        }
        if ((i & 8) != 0) {
            periodEnum = c41516qsL.KWHzl;
        }
        return c41516qsL.AEQbTJ(list, map, map2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41516qsL AEQbTJ(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull java.util.Map<java.lang.String, PeriodTickersPo> map, @NotNull java.util.Map<java.lang.String, TickersData> map2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41516qsL(list, map, map2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41641que> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, TickersData> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, PeriodTickersPo> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41516qsL)) {
            return false;
        }
        C41516qsL c41516qsL = (C41516qsL) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c41516qsL.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c41516qsL.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c41516qsL.copydefault) && this.KWHzl == c41516qsL.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.que> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41516qsL(@NotNull java.util.List<? extends InterfaceC41641que> list, @NotNull java.util.Map<java.lang.String, PeriodTickersPo> map, @NotNull java.util.Map<java.lang.String, TickersData> map2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.AEQbTJ = list;
        this.OLrzqt = map;
        this.copydefault = map2;
        this.KWHzl = periodEnum;
    }

    public java.lang.String toString() {
        return "ApplySpotPeriodTickersPayload(period=" + this.KWHzl + ", periodTickersSize=" + this.OLrzqt.size() + ", cupTickersSize=" + this.copydefault.size() + ", spotVoListSize=" + this.AEQbTJ.size() + ")";
    }
}
