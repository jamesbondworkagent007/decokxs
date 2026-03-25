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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56087xwG implements InterfaceC55704xov {
    public final xJC KWHzl = new xJC();
    public final C54435xIh AEQbTJ = new C54435xIh();

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC AEQbTJ(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionalTradeOrderReq optionalTradeOrderReq, java.util.ArrayList<TradeOrderStopParam> arrayList, @NotNull InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.AEQbTJ(baseTradeOrderReq, optionalTradeOrderReq, arrayList, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC KWHzl(@NotNull BaseTradeStrategyOrderReq baseTradeStrategyOrderReq, TriggerStrategyOrderReq triggerStrategyOrderReq, TradeOrderSpReq tradeOrderSpReq, java.util.List<TradeOrderStopParam> list, @NotNull InterfaceC55701xos<java.util.List<OrderExpResp>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeStrategyOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.KWHzl(baseTradeStrategyOrderReq, triggerStrategyOrderReq, tradeOrderSpReq, list, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.KWHzl.OLrzqt(str, str2, interfaceC55701xos, str3, str4);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.AEQbTJ(str, str2, str3, str4, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC OLrzqt(@NotNull BaseTradeOrderReq baseTradeOrderReq, OptionCheckPreReq optionCheckPreReq, java.util.List<TradeOrderStopParam> list, @NotNull InterfaceC55701xos<OrderPreCheckResp> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(baseTradeOrderReq, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.OLrzqt(baseTradeOrderReq, optionCheckPreReq, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, java.lang.String str4, @NotNull InterfaceC55701xos<Unit> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.copydefault(str, str2, z, str3, str4, null, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull InterfaceC55701xos<java.util.List<TradeFillsData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.EZpvd(str, str2, str3, str4, str5, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC copydefault(java.lang.String str, @NotNull InterfaceC55701xos<AccountBalanceData> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.KWHzl(str, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC KWHzl(java.lang.String str, @NotNull InterfaceC55701xos<java.util.List<OrderForceDetails>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.EZpvd(str, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC AEQbTJ(@NotNull java.lang.String str, InterfaceC55701xos<java.util.ArrayList<SimpleNotes>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.KWHzl.AEQbTJ(str, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, InterfaceC55701xos<java.util.ArrayList<java.util.ArrayList<SimpleProducts>>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return this.KWHzl.copydefault(str, str2, str3, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC55701xos<java.util.List<UserGuideBean>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.AEQbTJ.AEQbTJ(str, interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC OLrzqt(@NotNull java.lang.String str, java.lang.String str2, @NotNull InterfaceC55701xos<java.util.List<DeriConfigData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.EZpvd(str, str2, interfaceC55701xos);
    }

    public InterfaceC58217yxC KWHzl(@NotNull InterfaceC55701xos<java.util.List<DeriConfigData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.EZpvd(interfaceC55701xos);
    }

    @Override // o.InterfaceC55704xov
    public InterfaceC58217yxC AEQbTJ(java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull InterfaceC55701xos<java.util.List<RiskTrendData>> interfaceC55701xos) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(interfaceC55701xos, "");
        return this.KWHzl.copydefault(str, str2, str3, str4, interfaceC55701xos);
    }
}
