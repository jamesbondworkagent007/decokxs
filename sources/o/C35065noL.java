package o;

import com.okinc.market.quotation.data.model.stock.StockListPo;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35065noL {
    public final java.lang.String AEQbTJ;
    public final java.util.Map<java.lang.String, TickersData> EZpvd;
    public final StockListPo KWHzl;
    public final java.util.List<C35069noP> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.noL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C35065noL copy$default(C35065noL c35065noL, java.util.List list, StockListPo stockListPo, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c35065noL.copydefault;
        }
        if ((i & 2) != 0) {
            stockListPo = c35065noL.KWHzl;
        }
        if ((i & 4) != 0) {
            str = c35065noL.AEQbTJ;
        }
        if ((i & 8) != 0) {
            map = c35065noL.EZpvd;
        }
        return c35065noL.copydefault(list, stockListPo, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35069noP> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, TickersData> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockListPo copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35065noL copydefault(@NotNull java.util.List<C35069noP> list, @NotNull StockListPo stockListPo, @NotNull java.lang.String str, java.util.Map<java.lang.String, TickersData> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(stockListPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C35065noL(list, stockListPo, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35065noL)) {
            return false;
        }
        C35065noL c35065noL = (C35065noL) obj;
        return Intrinsics.EZpvd(this.copydefault, c35065noL.copydefault) && Intrinsics.EZpvd(this.KWHzl, c35065noL.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c35065noL.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c35065noL.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        java.util.Map<java.lang.String, TickersData> map = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map == null ? 0 : map.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ApplyHomeStockTickersPayload(voList=" + this.copydefault + ", tickersPo=" + this.KWHzl + ", bizType=" + this.AEQbTJ + ", cupTickerMap=" + this.EZpvd + ")";
    }

    public C35065noL(@NotNull java.util.List<C35069noP> list, @NotNull StockListPo stockListPo, @NotNull java.lang.String str, java.util.Map<java.lang.String, TickersData> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(stockListPo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = list;
        this.KWHzl = stockListPo;
        this.AEQbTJ = str;
        this.EZpvd = map;
    }
}
