package o;

import com.okinc.unify_trade.biz.subscribe.DexOrderDetail;
import com.okinc.unify_trade.biz.subscribe.TradeOrderStopParam;

/* JADX INFO: renamed from: o.xpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55726xpQ {
    java.util.List<TradeOrderStopParam> getAttachAlgoOrders();

    DexOrderDetail getDexOrderDetail();

    java.lang.String getOrderAlgoId();

    java.lang.String getOrderAlgoIdAll();

    java.lang.String getOrderCcy();

    java.lang.String getOrderInstId();

    java.lang.String getOrderInstType();

    java.lang.String getOrderLever();

    java.lang.String getOrderPosSide();

    java.lang.String getOrderReduceOnly();

    java.lang.String getOrderSide();

    java.lang.String getOrderSlOrderPx();

    java.lang.String getOrderSlTriggerPx();

    java.lang.String getOrderSlTriggerPxType();

    java.lang.String getOrderSz();

    java.lang.String getOrderTdMode();

    java.lang.String getOrderTgtCcy();

    java.lang.String getOrderTpOrderPx();

    java.lang.String getOrderTpTriggerPx();

    java.lang.String getOrderTpTriggerPxType();

    java.lang.String getOrderTradeQuoteCcy();

    java.lang.String getOrderType();

    boolean isDexOrder();
}
