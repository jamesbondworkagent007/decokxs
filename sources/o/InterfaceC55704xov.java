package o;

import com.okinc.unify_trade.biz.BaseTradeOrderReq;
import com.okinc.unify_trade.biz.BaseTradeStrategyOrderReq;
import com.okinc.unify_trade.biz.DeriConfigData;
import com.okinc.unify_trade.biz.OptionCheckPreReq;
import com.okinc.unify_trade.biz.OptionalTradeOrderReq;
import com.okinc.unify_trade.biz.OrderExpResp;
import com.okinc.unify_trade.biz.OrderForceDetails;
import com.okinc.unify_trade.biz.OrderPreCheckResp;
import com.okinc.unify_trade.biz.RiskTrendData;
import com.okinc.unify_trade.biz.SimpleNotes;
import com.okinc.unify_trade.biz.SimpleProducts;
import com.okinc.unify_trade.biz.TradeFillsData;
import com.okinc.unify_trade.biz.TradeOrderSpReq;
import com.okinc.unify_trade.biz.TriggerStrategyOrderReq;
import com.okinc.unify_trade.biz.UserGuideBean;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55704xov {
    InterfaceC58217yxC AEQbTJ(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList<TradeOrderStopParam> arrayList, @NotNull InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos);

    InterfaceC58217yxC AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull InterfaceC55701xos<java.util.List<TradeFillsData>> interfaceC55701xos);

    InterfaceC58217yxC AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<RiskTrendData>> interfaceC55701xos);

    InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, InterfaceC55701xos<java.util.ArrayList<SimpleNotes>> interfaceC55701xos);

    InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC55701xos<java.util.List<UserGuideBean>> interfaceC55701xos);

    InterfaceC58217yxC KWHzl(@NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, java.util.List<TradeOrderStopParam> list, @NotNull InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos);

    InterfaceC58217yxC KWHzl(java.lang.String str, @NotNull InterfaceC55701xos<java.util.List<OrderForceDetails>> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionCheckPreReq optionCheckPreReq, java.util.List<TradeOrderStopParam> list, @NotNull InterfaceC55701xos<OrderPreCheckResp> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, InterfaceC55701xos<java.util.ArrayList<java.util.ArrayList<SimpleProducts>>> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<DeriConfigData>> interfaceC55701xos);

    InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos);

    InterfaceC58217yxC copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos, @NotNull java.lang.String str3, java.lang.String str4);

    InterfaceC58217yxC copydefault(java.lang.String str, @NotNull InterfaceC55701xos<AccountBalanceData> interfaceC55701xos);

    /* JADX INFO: renamed from: o.xov$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.xov */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC58217yxC makeNormalOrder$default(InterfaceC55704xov interfaceC55704xov, BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList arrayList, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeNormalOrder");
            }
            if ((i & 2) != 0) {
                optionalTradeOrderReq = null;
            }
            if ((i & 4) != 0) {
                arrayList = null;
            }
            return interfaceC55704xov.AEQbTJ(baseTradeOrderReq, optionalTradeOrderReq, arrayList, interfaceC55701xos);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.xov */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC58217yxC makeStrategyOrder$default(InterfaceC55704xov interfaceC55704xov, BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, java.util.List list, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55704xov.KWHzl(baseTradeStrategyOrderReq, (i & 2) != 0 ? null : triggerStrategyOrderReq, (i & 4) != 0 ? null : tradeOrderSpReq, (i & 8) != 0 ? null : list, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeStrategyOrder");
        }

        public static /* synthetic */ InterfaceC58217yxC cancelStrategyOrder$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelStrategyOrder");
            }
            if ((i & 8) != 0) {
                str3 = "";
            }
            java.lang.String str5 = str3;
            if ((i & 16) != 0) {
                str4 = null;
            }
            return interfaceC55704xov.copydefault(str, str2, interfaceC55701xos, str5, str4);
        }

        public static /* synthetic */ InterfaceC58217yxC tradeClosePosition$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tradeClosePosition");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            java.lang.String str5 = str2;
            if ((i & 8) != 0) {
                str4 = "";
            }
            return interfaceC55704xov.OLrzqt(str, str5, str3, str4, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC tradePreCheck$default(InterfaceC55704xov interfaceC55704xov, BaseTradeOrderReq baseTradeOrderReq, OptionCheckPreReq optionCheckPreReq, java.util.List list, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tradePreCheck");
            }
            if ((i & 2) != 0) {
                optionCheckPreReq = null;
            }
            return interfaceC55704xov.OLrzqt(baseTradeOrderReq, optionCheckPreReq, (java.util.List<TradeOrderStopParam>) list, (InterfaceC55701xos<OrderPreCheckResp>) interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC marginBalance$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: marginBalance");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC55704xov.OLrzqt(str, str2, z, str3, str4, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getTradeFills$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55704xov.AEQbTJ((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeFills");
        }

        public static /* synthetic */ InterfaceC58217yxC getBalance$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBalance");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC55704xov.copydefault(str, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getOrderForceDetail$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderForceDetail");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC55704xov.KWHzl(str, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getSimpleNotes$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSimpleNotes");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return interfaceC55704xov.AEQbTJ(str, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getSimpleProducts$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, java.lang.String str3, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSimpleProducts");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                str3 = "";
            }
            return interfaceC55704xov.OLrzqt(str, str2, str3, (InterfaceC55701xos<java.util.ArrayList<java.util.ArrayList<SimpleProducts>>>) interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getUserGuide$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserGuide");
            }
            if ((i & 1) != 0) {
                str = "";
            }
            return interfaceC55704xov.EZpvd(str, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC setNavType$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNavType");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return interfaceC55704xov.OLrzqt(str, str2, interfaceC55701xos);
        }

        public static /* synthetic */ InterfaceC58217yxC getRiskTrend$default(InterfaceC55704xov interfaceC55704xov, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, InterfaceC55701xos interfaceC55701xos, int i, java.lang.Object obj) {
            if (obj == null) {
                return interfaceC55704xov.AEQbTJ((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, str4, interfaceC55701xos);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRiskTrend");
        }
    }
}
