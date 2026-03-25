package o;

import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55702xot {
    InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos);

    InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos);

    InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos);

    InterfaceC58217yxC EZpvd(java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<IndexTickersData>> interfaceC55701xos);

    InterfaceC58217yxC KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos);

    InterfaceC58217yxC KWHzl(@NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos);

    InterfaceC58217yxC copydefault(@NotNull TickerCupReq tickerCupReq, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos);

    InterfaceC58217yxC copydefault(@NotNull TickerInstReq tickerInstReq, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos);

    InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<BizKLineData>> interfaceC55701xos);

    InterfaceC58217yxC copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<TickersData>> interfaceC55701xos);

    /* JADX INFO: renamed from: o.xot$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ InterfaceC58217yxC setWatchList$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55702xot.KWHzl(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWatchList");
        }

        public static /* synthetic */ InterfaceC58217yxC getMarketTickers$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketTickers");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC55702xot.copydefault(str, str2, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getIndexTickers$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getIndexTickers");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC55702xot.EZpvd(str, str2, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getMarketCandles$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55702xot.AEQbTJ(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketCandles");
        }

        public static /* synthetic */ InterfaceC58217yxC getMarketIndexCandles$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55702xot.OLrzqt(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketIndexCandles");
        }

        public static /* synthetic */ InterfaceC58217yxC getMarketMarkPriceCandles$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketMarkPriceCandles");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC55702xot.AEQbTJ(str, str2, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getHistoryMarketCandles$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55702xot.copydefault(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getHistoryMarketCandles");
        }

        public static /* synthetic */ InterfaceC58217yxC getNewIndexTickers$default(InterfaceC55702xot interfaceC55702xot, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNewIndexTickers");
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            return interfaceC55702xot.EZpvd(str, str2, str3, str4, interfaceC55701xos);
        }
    }
}
