package o;

import com.okinc.market.quotation.data.model.PeriodTickersPo;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41458qrG {
    public final PeriodEnum AEQbTJ;
    public final java.util.Map<java.lang.String, PeriodTickersPo> EZpvd;
    public final java.util.List<InterfaceC41638qub> KWHzl;
    public final java.util.Map<java.lang.String, TickersData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qrG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41458qrG copy$default(C41458qrG c41458qrG, java.util.List list, java.util.Map map, java.util.Map map2, PeriodEnum periodEnum, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41458qrG.KWHzl;
        }
        if ((i & 2) != 0) {
            map = c41458qrG.EZpvd;
        }
        if ((i & 4) != 0) {
            map2 = c41458qrG.copydefault;
        }
        if ((i & 8) != 0) {
            periodEnum = c41458qrG.AEQbTJ;
        }
        return c41458qrG.AEQbTJ(list, map, map2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41458qrG AEQbTJ(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull java.util.Map<java.lang.String, PeriodTickersPo> map, @NotNull java.util.Map<java.lang.String, TickersData> map2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        return new C41458qrG(list, map, map2, periodEnum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, TickersData> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PeriodEnum KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, PeriodTickersPo> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41458qrG)) {
            return false;
        }
        C41458qrG c41458qrG = (C41458qrG) obj;
        return Intrinsics.EZpvd(this.KWHzl, c41458qrG.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c41458qrG.EZpvd) && Intrinsics.EZpvd(this.copydefault, c41458qrG.copydefault) && this.AEQbTJ == c41458qrG.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41458qrG(@NotNull java.util.List<? extends InterfaceC41638qub> list, @NotNull java.util.Map<java.lang.String, PeriodTickersPo> map, @NotNull java.util.Map<java.lang.String, TickersData> map2, @NotNull PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(periodEnum, "");
        this.KWHzl = list;
        this.EZpvd = map;
        this.copydefault = map2;
        this.AEQbTJ = periodEnum;
    }

    public java.lang.String toString() {
        return "ApplyFuturesPeriodTickersPayload(period=" + this.AEQbTJ + ", periodTickersSize=" + this.EZpvd.size() + ", cupTickersSize=" + this.copydefault.size() + ", futuresVoListSize=" + this.KWHzl.size() + ")";
    }
}
