package o;

import androidx.camera.video.AudioStats;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.tradelite.bean.OrderBeanData;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.biz.subscribe.TradeOrderData;
import com.okinc.unify_trade.biz.subscribe.TradeStrategyOrderData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37944pGm {
    public static final C37944pGm KWHzl = new C37944pGm();

    private C37944pGm() {
    }

    public static /* synthetic */ OrderBeanData toOrderBeanData$default(C37944pGm c37944pGm, TradeAllOrderApi tradeAllOrderApi, java.lang.Double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        return c37944pGm.EZpvd(tradeAllOrderApi, d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: Exception -> 0x039b, TryCatch #0 {Exception -> 0x039b, blocks: (B:3:0x0007, B:4:0x0011, B:52:0x0240, B:56:0x0259, B:58:0x029b, B:59:0x029f, B:63:0x02d0, B:67:0x02eb, B:71:0x02fe, B:75:0x0311, B:79:0x0354, B:83:0x0363, B:6:0x0016, B:15:0x0034, B:17:0x005c, B:18:0x0060, B:22:0x0085, B:26:0x009c, B:30:0x00af, B:34:0x00de, B:9:0x0020, B:12:0x002a, B:36:0x0144, B:39:0x014e, B:43:0x0167, B:45:0x017d, B:46:0x0181, B:50:0x01ae), top: B:87:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x029b A[Catch: Exception -> 0x039b, TryCatch #0 {Exception -> 0x039b, blocks: (B:3:0x0007, B:4:0x0011, B:52:0x0240, B:56:0x0259, B:58:0x029b, B:59:0x029f, B:63:0x02d0, B:67:0x02eb, B:71:0x02fe, B:75:0x0311, B:79:0x0354, B:83:0x0363, B:6:0x0016, B:15:0x0034, B:17:0x005c, B:18:0x0060, B:22:0x0085, B:26:0x009c, B:30:0x00af, B:34:0x00de, B:9:0x0020, B:12:0x002a, B:36:0x0144, B:39:0x014e, B:43:0x0167, B:45:0x017d, B:46:0x0181, B:50:0x01ae), top: B:87:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final OrderBeanData EZpvd(@NotNull TradeAllOrderApi tradeAllOrderApi, java.lang.Double d) {
        Intrinsics.checkNotNullParameter(tradeAllOrderApi, "");
        try {
            java.lang.String ortType = tradeAllOrderApi.getOrtType();
            int iHashCode = ortType.hashCode();
            double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
            switch (iHashCode) {
                case -1727670399:
                    if (ortType.equals("move_order_stop")) {
                        StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) tradeAllOrderApi;
                        java.lang.String avgPx = strategyPendingListResp.getAvgPx();
                        java.lang.String cTime = strategyPendingListResp.getCTime();
                        java.lang.String ccy = strategyPendingListResp.getCcy();
                        java.lang.String instFamily = strategyPendingListResp.getInstFamily();
                        java.lang.String str = instFamily == null ? "" : instFamily;
                        java.lang.String instId = strategyPendingListResp.getInstId();
                        java.lang.String instType = strategyPendingListResp.getInstType();
                        java.lang.String lever = strategyPendingListResp.getLever();
                        java.lang.String ordId = strategyPendingListResp.getOrdId();
                        java.lang.String ordType = strategyPendingListResp.getOrdType();
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        }
                        double d2 = dDoubleValue;
                        java.lang.String posSide = strategyPendingListResp.getPosSide();
                        java.lang.String quickMgnType = strategyPendingListResp.getQuickMgnType();
                        java.lang.String reduceOnly = strategyPendingListResp.getReduceOnly();
                        java.lang.String side = strategyPendingListResp.getSide();
                        java.lang.String slTriggerPx = strategyPendingListResp.getSlTriggerPx();
                        java.lang.String state = strategyPendingListResp.getState();
                        java.lang.String sz = strategyPendingListResp.getSz();
                        java.lang.String tdMode = strategyPendingListResp.getTdMode();
                        java.lang.String tgtCcy = strategyPendingListResp.getTgtCcy();
                        return new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strategyPendingListResp.getAlgoId(), (java.lang.String) null, avgPx, (java.lang.String) null, (java.lang.String) null, cTime, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, ccy, (java.lang.String) null, (java.lang.String) null, strategyPendingListResp.getCloseFraction(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, str, instId, instType, (java.lang.String) null, lever, (java.lang.String) null, (java.lang.String) null, strategyPendingListResp.getNotionalUsd(), ordId, (java.util.List) null, "", ordType, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, posSide, "", quickMgnType, (java.lang.String) null, (java.lang.String) null, reduceOnly, side, (java.lang.String) null, (java.lang.String) null, slTriggerPx, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, state, (java.lang.String) null, (java.lang.String) null, sz, (java.lang.String) null, tdMode, tgtCcy == null ? "" : tgtCcy, (java.lang.String) null, strategyPendingListResp.getTpTriggerPx(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, strategyPendingListResp.getUTime(), strategyPendingListResp.getUly(), d2, strategyPendingListResp.getTradeQuoteCcy(), -2361665, -1114049944, MTAnalysisConstants.MainWhat.ON_DRAW_DONE, (DefaultConstructorMarker) null);
                    }
                    TradeOrderData tradeOrderData = (TradeOrderData) tradeAllOrderApi;
                    java.lang.String accFillSz = tradeOrderData.getAccFillSz();
                    java.lang.String avgPx2 = tradeOrderData.getAvgPx();
                    java.lang.String cTime2 = tradeOrderData.getCTime();
                    java.lang.String ccy2 = tradeOrderData.getCcy();
                    java.lang.String str2 = ccy2 == null ? "" : ccy2;
                    java.lang.String fee = tradeOrderData.getFee();
                    java.lang.String feeCcy = tradeOrderData.getFeeCcy();
                    java.lang.String feeRate = tradeOrderData.getFeeRate();
                    java.lang.String fillPx = tradeOrderData.getFillPx();
                    java.lang.String fillSz = tradeOrderData.getFillSz();
                    java.lang.String fillTime = tradeOrderData.getFillTime();
                    java.lang.String instFamily2 = tradeOrderData.getInstFamily();
                    java.lang.String instId2 = tradeOrderData.getInstId();
                    java.lang.String instType2 = tradeOrderData.getInstType();
                    java.lang.String lever2 = tradeOrderData.getLever();
                    java.lang.String ordId2 = tradeOrderData.getOrdId();
                    java.lang.String px = tradeOrderData.getPx();
                    java.lang.String ordType2 = tradeOrderData.getOrdType();
                    java.lang.String pnl = tradeOrderData.getPnl();
                    java.lang.String pnlCcy = tradeOrderData.getPnlCcy();
                    java.lang.String pnlRatio = tradeOrderData.getPnlRatio();
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    }
                    double d3 = dDoubleValue;
                    java.lang.String posSide2 = tradeOrderData.getPosSide();
                    java.lang.String px2 = tradeOrderData.getPx();
                    java.lang.String quickMgnType2 = tradeOrderData.getQuickMgnType();
                    java.lang.String rebate = tradeOrderData.getRebate();
                    java.lang.String rebateCcy = tradeOrderData.getRebateCcy();
                    java.lang.String reduceOnly2 = tradeOrderData.getReduceOnly();
                    java.lang.String side2 = tradeOrderData.getSide();
                    java.lang.String slOrdPx = tradeOrderData.getSlOrdPx();
                    java.lang.String slTriggerPx2 = tradeOrderData.getSlTriggerPx();
                    java.lang.String slTriggerPxType = tradeOrderData.getSlTriggerPxType();
                    java.lang.String str3 = slTriggerPxType == null ? "" : slTriggerPxType;
                    java.lang.String state2 = tradeOrderData.getState();
                    java.lang.String sz2 = tradeOrderData.getSz();
                    java.lang.String category = tradeOrderData.getCategory();
                    java.lang.String tdMode2 = tradeOrderData.getTdMode();
                    java.lang.String tgtCcy2 = tradeOrderData.getTgtCcy();
                    java.lang.String str4 = tgtCcy2 == null ? "" : tgtCcy2;
                    java.lang.String tpOrdPx = tradeOrderData.getTpOrdPx();
                    java.lang.String tpTriggerPx = tradeOrderData.getTpTriggerPx();
                    java.lang.String tpTriggerPxType = tradeOrderData.getTpTriggerPxType();
                    java.lang.String str5 = tpTriggerPxType == null ? "" : tpTriggerPxType;
                    java.lang.String tradeId = tradeOrderData.getTradeId();
                    java.lang.String triggerPx = tradeOrderData.getTriggerPx();
                    java.lang.String pxType = tradeOrderData.getPxType();
                    java.lang.String str6 = pxType == null ? "" : pxType;
                    java.lang.String uTime = tradeOrderData.getUTime();
                    java.lang.String uly = tradeOrderData.getUly();
                    java.lang.String notionalUsd = tradeOrderData.getNotionalUsd();
                    java.lang.String fillNotionalUsd = tradeOrderData.getFillNotionalUsd();
                    java.lang.String bankruptcyPx = tradeOrderData.getBankruptcyPx();
                    java.lang.String avgCost = tradeOrderData.getAvgCost();
                    java.lang.String category2 = tradeOrderData.getCategory();
                    java.lang.String bizRefType = tradeOrderData.getBizRefType();
                    java.lang.String cancelSourceReason = tradeOrderData.getCancelSourceReason();
                    java.lang.String multiplier = tradeOrderData.getMultiplier();
                    java.lang.String sideMsg = tradeOrderData.getSideMsg();
                    java.lang.String tradeQuoteCcy = tradeOrderData.getTradeQuoteCcy();
                    java.lang.String algoId = tradeOrderData.getAlgoId();
                    java.lang.String closeFraction = tradeOrderData.getCloseFraction();
                    java.lang.String ctVal = tradeOrderData.getCtVal();
                    java.lang.String str7 = ctVal == null ? "" : ctVal;
                    java.lang.String lastPx = tradeOrderData.getLastPx();
                    java.lang.String code = tradeOrderData.getCode();
                    return new OrderBeanData(accFillSz, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId, avgCost, avgPx2, bankruptcyPx, bizRefType, cTime2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason, (java.lang.String) null, category2, str2, (java.lang.String) null, (java.lang.String) null, closeFraction, str7, code == null ? "" : code, (java.lang.String) null, fee, feeRate, feeCcy, fillNotionalUsd, fillPx, fillSz, fillTime, instFamily2, instId2, instType2, lastPx, lever2, (java.lang.String) null, multiplier, notionalUsd, ordId2, (java.util.List) null, px, ordType2, (java.lang.String) null, pnl, pnlCcy, pnlRatio, posSide2, px2, quickMgnType2, rebate, rebateCcy, reduceOnly2, side2, sideMsg, slOrdPx, slTriggerPx2, str3, tradeOrderData.getSource(), (java.lang.String) null, (java.lang.String) null, state2, (java.lang.String) null, (java.lang.String) null, sz2, category, tdMode2, str4, tpOrdPx, tpTriggerPx, str5, tradeId, triggerPx, str6, (java.lang.String) null, uTime, uly, d3, tradeQuoteCcy, 18444350, -1342172640, 2049, (DefaultConstructorMarker) null);
                case -1059891784:
                    if (!ortType.equals("trigger")) {
                        TradeOrderData tradeOrderData2 = (TradeOrderData) tradeAllOrderApi;
                        java.lang.String accFillSz2 = tradeOrderData2.getAccFillSz();
                        java.lang.String avgPx22 = tradeOrderData2.getAvgPx();
                        java.lang.String cTime22 = tradeOrderData2.getCTime();
                        java.lang.String ccy22 = tradeOrderData2.getCcy();
                        if (ccy22 == null) {
                        }
                        java.lang.String fee2 = tradeOrderData2.getFee();
                        java.lang.String feeCcy2 = tradeOrderData2.getFeeCcy();
                        java.lang.String feeRate2 = tradeOrderData2.getFeeRate();
                        java.lang.String fillPx2 = tradeOrderData2.getFillPx();
                        java.lang.String fillSz2 = tradeOrderData2.getFillSz();
                        java.lang.String fillTime2 = tradeOrderData2.getFillTime();
                        java.lang.String instFamily22 = tradeOrderData2.getInstFamily();
                        java.lang.String instId22 = tradeOrderData2.getInstId();
                        java.lang.String instType22 = tradeOrderData2.getInstType();
                        java.lang.String lever22 = tradeOrderData2.getLever();
                        java.lang.String ordId22 = tradeOrderData2.getOrdId();
                        java.lang.String px3 = tradeOrderData2.getPx();
                        java.lang.String ordType22 = tradeOrderData2.getOrdType();
                        java.lang.String pnl2 = tradeOrderData2.getPnl();
                        java.lang.String pnlCcy2 = tradeOrderData2.getPnlCcy();
                        java.lang.String pnlRatio2 = tradeOrderData2.getPnlRatio();
                        if (d != null) {
                        }
                        double d32 = dDoubleValue;
                        java.lang.String posSide22 = tradeOrderData2.getPosSide();
                        java.lang.String px22 = tradeOrderData2.getPx();
                        java.lang.String quickMgnType22 = tradeOrderData2.getQuickMgnType();
                        java.lang.String rebate2 = tradeOrderData2.getRebate();
                        java.lang.String rebateCcy2 = tradeOrderData2.getRebateCcy();
                        java.lang.String reduceOnly22 = tradeOrderData2.getReduceOnly();
                        java.lang.String side22 = tradeOrderData2.getSide();
                        java.lang.String slOrdPx2 = tradeOrderData2.getSlOrdPx();
                        java.lang.String slTriggerPx22 = tradeOrderData2.getSlTriggerPx();
                        java.lang.String slTriggerPxType2 = tradeOrderData2.getSlTriggerPxType();
                        if (slTriggerPxType2 == null) {
                        }
                        java.lang.String state22 = tradeOrderData2.getState();
                        java.lang.String sz22 = tradeOrderData2.getSz();
                        java.lang.String category3 = tradeOrderData2.getCategory();
                        java.lang.String tdMode22 = tradeOrderData2.getTdMode();
                        java.lang.String tgtCcy22 = tradeOrderData2.getTgtCcy();
                        if (tgtCcy22 == null) {
                        }
                        java.lang.String tpOrdPx2 = tradeOrderData2.getTpOrdPx();
                        java.lang.String tpTriggerPx2 = tradeOrderData2.getTpTriggerPx();
                        java.lang.String tpTriggerPxType2 = tradeOrderData2.getTpTriggerPxType();
                        if (tpTriggerPxType2 == null) {
                        }
                        java.lang.String tradeId2 = tradeOrderData2.getTradeId();
                        java.lang.String triggerPx2 = tradeOrderData2.getTriggerPx();
                        java.lang.String pxType2 = tradeOrderData2.getPxType();
                        if (pxType2 == null) {
                        }
                        java.lang.String uTime2 = tradeOrderData2.getUTime();
                        java.lang.String uly2 = tradeOrderData2.getUly();
                        java.lang.String notionalUsd2 = tradeOrderData2.getNotionalUsd();
                        java.lang.String fillNotionalUsd2 = tradeOrderData2.getFillNotionalUsd();
                        java.lang.String bankruptcyPx2 = tradeOrderData2.getBankruptcyPx();
                        java.lang.String avgCost2 = tradeOrderData2.getAvgCost();
                        java.lang.String category22 = tradeOrderData2.getCategory();
                        java.lang.String bizRefType2 = tradeOrderData2.getBizRefType();
                        java.lang.String cancelSourceReason2 = tradeOrderData2.getCancelSourceReason();
                        java.lang.String multiplier2 = tradeOrderData2.getMultiplier();
                        java.lang.String sideMsg2 = tradeOrderData2.getSideMsg();
                        java.lang.String tradeQuoteCcy2 = tradeOrderData2.getTradeQuoteCcy();
                        java.lang.String algoId2 = tradeOrderData2.getAlgoId();
                        java.lang.String closeFraction2 = tradeOrderData2.getCloseFraction();
                        java.lang.String ctVal2 = tradeOrderData2.getCtVal();
                        if (ctVal2 == null) {
                        }
                        java.lang.String lastPx2 = tradeOrderData2.getLastPx();
                        java.lang.String code2 = tradeOrderData2.getCode();
                        return new OrderBeanData(accFillSz2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId2, avgCost2, avgPx22, bankruptcyPx2, bizRefType2, cTime22, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason2, (java.lang.String) null, category22, str2, (java.lang.String) null, (java.lang.String) null, closeFraction2, str7, code2 == null ? "" : code2, (java.lang.String) null, fee2, feeRate2, feeCcy2, fillNotionalUsd2, fillPx2, fillSz2, fillTime2, instFamily22, instId22, instType22, lastPx2, lever22, (java.lang.String) null, multiplier2, notionalUsd2, ordId22, (java.util.List) null, px3, ordType22, (java.lang.String) null, pnl2, pnlCcy2, pnlRatio2, posSide22, px22, quickMgnType22, rebate2, rebateCcy2, reduceOnly22, side22, sideMsg2, slOrdPx2, slTriggerPx22, str3, tradeOrderData2.getSource(), (java.lang.String) null, (java.lang.String) null, state22, (java.lang.String) null, (java.lang.String) null, sz22, category3, tdMode22, str4, tpOrdPx2, tpTriggerPx2, str5, tradeId2, triggerPx2, str6, (java.lang.String) null, uTime2, uly2, d32, tradeQuoteCcy2, 18444350, -1342172640, 2049, (DefaultConstructorMarker) null);
                    }
                    TradeStrategyOrderData tradeStrategyOrderData = (TradeStrategyOrderData) tradeAllOrderApi;
                    java.lang.String avgPx3 = tradeStrategyOrderData.getAvgPx();
                    java.lang.String cTime3 = tradeStrategyOrderData.getCTime();
                    java.lang.String ccy3 = tradeStrategyOrderData.getCcy();
                    java.lang.String instFamily3 = tradeStrategyOrderData.getInstFamily();
                    java.lang.String instId3 = tradeStrategyOrderData.getInstId();
                    java.lang.String instType3 = tradeStrategyOrderData.getInstType();
                    java.lang.String lever3 = tradeStrategyOrderData.getLever();
                    java.lang.String ordId3 = tradeStrategyOrderData.getOrdId();
                    java.lang.String ordType3 = tradeStrategyOrderData.getOrdType();
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    }
                    double d4 = dDoubleValue;
                    java.lang.String posSide3 = tradeStrategyOrderData.getPosSide();
                    java.lang.String quickMgnType3 = tradeStrategyOrderData.getQuickMgnType();
                    java.lang.String reduceOnly3 = tradeStrategyOrderData.getReduceOnly();
                    java.lang.String side3 = tradeStrategyOrderData.getSide();
                    java.lang.String slOrdPx3 = tradeStrategyOrderData.getSlOrdPx();
                    java.lang.String slTriggerPx3 = tradeStrategyOrderData.getSlTriggerPx();
                    java.lang.String slTriggerPxType3 = tradeStrategyOrderData.getSlTriggerPxType();
                    java.lang.String str8 = slTriggerPxType3 == null ? "" : slTriggerPxType3;
                    java.lang.String state3 = tradeStrategyOrderData.getState();
                    java.lang.String sz3 = tradeStrategyOrderData.getSz();
                    java.lang.String tdMode3 = tradeStrategyOrderData.getTdMode();
                    java.lang.String tgtCcy3 = tradeStrategyOrderData.getTgtCcy();
                    java.lang.String str9 = tgtCcy3 == null ? "" : tgtCcy3;
                    java.lang.String tpOrdPx3 = tradeStrategyOrderData.getTpOrdPx();
                    java.lang.String tpTriggerPx3 = tradeStrategyOrderData.getTpTriggerPx();
                    java.lang.String tpTriggerPxType3 = tradeStrategyOrderData.getTpTriggerPxType();
                    java.lang.String str10 = tpTriggerPxType3 == null ? "" : tpTriggerPxType3;
                    java.lang.String triggerPx3 = tradeStrategyOrderData.getTriggerPx();
                    java.lang.String uTime3 = tradeStrategyOrderData.getUTime();
                    java.lang.String uly3 = tradeStrategyOrderData.getUly();
                    java.lang.String notionalUsd3 = tradeStrategyOrderData.getNotionalUsd();
                    java.lang.String bizRefType3 = tradeStrategyOrderData.getBizRefType();
                    java.lang.String cancelSourceReason3 = tradeStrategyOrderData.getCancelSourceReason();
                    java.lang.String tradeQuoteCcy3 = tradeStrategyOrderData.getTradeQuoteCcy();
                    java.lang.String algoId3 = tradeStrategyOrderData.getAlgoId();
                    java.lang.String closeFraction3 = tradeStrategyOrderData.getCloseFraction();
                    java.lang.String ctVal3 = tradeStrategyOrderData.getCtVal();
                    return new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId3, (java.lang.String) null, avgPx3, (java.lang.String) null, bizRefType3, cTime3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason3, (java.lang.String) null, (java.lang.String) null, ccy3, (java.lang.String) null, (java.lang.String) null, closeFraction3, ctVal3 == null ? "" : ctVal3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, instFamily3, instId3, instType3, (java.lang.String) null, lever3, (java.lang.String) null, (java.lang.String) null, notionalUsd3, ordId3, (java.util.List) null, "", ordType3, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, posSide3, "", quickMgnType3, (java.lang.String) null, (java.lang.String) null, reduceOnly3, side3, (java.lang.String) null, slOrdPx3, slTriggerPx3, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, state3, (java.lang.String) null, (java.lang.String) null, sz3, (java.lang.String) null, tdMode3, str9, tpOrdPx3, tpTriggerPx3, str10, (java.lang.String) null, triggerPx3, (java.lang.String) null, (java.lang.String) null, uTime3, uly3, d4, tradeQuoteCcy3, -6589761, -1197936024, 3333, (DefaultConstructorMarker) null);
                case 109851:
                    if (!ortType.equals("oco")) {
                        TradeOrderData tradeOrderData22 = (TradeOrderData) tradeAllOrderApi;
                        java.lang.String accFillSz22 = tradeOrderData22.getAccFillSz();
                        java.lang.String avgPx222 = tradeOrderData22.getAvgPx();
                        java.lang.String cTime222 = tradeOrderData22.getCTime();
                        java.lang.String ccy222 = tradeOrderData22.getCcy();
                        if (ccy222 == null) {
                        }
                        java.lang.String fee22 = tradeOrderData22.getFee();
                        java.lang.String feeCcy22 = tradeOrderData22.getFeeCcy();
                        java.lang.String feeRate22 = tradeOrderData22.getFeeRate();
                        java.lang.String fillPx22 = tradeOrderData22.getFillPx();
                        java.lang.String fillSz22 = tradeOrderData22.getFillSz();
                        java.lang.String fillTime22 = tradeOrderData22.getFillTime();
                        java.lang.String instFamily222 = tradeOrderData22.getInstFamily();
                        java.lang.String instId222 = tradeOrderData22.getInstId();
                        java.lang.String instType222 = tradeOrderData22.getInstType();
                        java.lang.String lever222 = tradeOrderData22.getLever();
                        java.lang.String ordId222 = tradeOrderData22.getOrdId();
                        java.lang.String px32 = tradeOrderData22.getPx();
                        java.lang.String ordType222 = tradeOrderData22.getOrdType();
                        java.lang.String pnl22 = tradeOrderData22.getPnl();
                        java.lang.String pnlCcy22 = tradeOrderData22.getPnlCcy();
                        java.lang.String pnlRatio22 = tradeOrderData22.getPnlRatio();
                        if (d != null) {
                        }
                        double d322 = dDoubleValue;
                        java.lang.String posSide222 = tradeOrderData22.getPosSide();
                        java.lang.String px222 = tradeOrderData22.getPx();
                        java.lang.String quickMgnType222 = tradeOrderData22.getQuickMgnType();
                        java.lang.String rebate22 = tradeOrderData22.getRebate();
                        java.lang.String rebateCcy22 = tradeOrderData22.getRebateCcy();
                        java.lang.String reduceOnly222 = tradeOrderData22.getReduceOnly();
                        java.lang.String side222 = tradeOrderData22.getSide();
                        java.lang.String slOrdPx22 = tradeOrderData22.getSlOrdPx();
                        java.lang.String slTriggerPx222 = tradeOrderData22.getSlTriggerPx();
                        java.lang.String slTriggerPxType22 = tradeOrderData22.getSlTriggerPxType();
                        if (slTriggerPxType22 == null) {
                        }
                        java.lang.String state222 = tradeOrderData22.getState();
                        java.lang.String sz222 = tradeOrderData22.getSz();
                        java.lang.String category32 = tradeOrderData22.getCategory();
                        java.lang.String tdMode222 = tradeOrderData22.getTdMode();
                        java.lang.String tgtCcy222 = tradeOrderData22.getTgtCcy();
                        if (tgtCcy222 == null) {
                        }
                        java.lang.String tpOrdPx22 = tradeOrderData22.getTpOrdPx();
                        java.lang.String tpTriggerPx22 = tradeOrderData22.getTpTriggerPx();
                        java.lang.String tpTriggerPxType22 = tradeOrderData22.getTpTriggerPxType();
                        if (tpTriggerPxType22 == null) {
                        }
                        java.lang.String tradeId22 = tradeOrderData22.getTradeId();
                        java.lang.String triggerPx22 = tradeOrderData22.getTriggerPx();
                        java.lang.String pxType22 = tradeOrderData22.getPxType();
                        if (pxType22 == null) {
                        }
                        java.lang.String uTime22 = tradeOrderData22.getUTime();
                        java.lang.String uly22 = tradeOrderData22.getUly();
                        java.lang.String notionalUsd22 = tradeOrderData22.getNotionalUsd();
                        java.lang.String fillNotionalUsd22 = tradeOrderData22.getFillNotionalUsd();
                        java.lang.String bankruptcyPx22 = tradeOrderData22.getBankruptcyPx();
                        java.lang.String avgCost22 = tradeOrderData22.getAvgCost();
                        java.lang.String category222 = tradeOrderData22.getCategory();
                        java.lang.String bizRefType22 = tradeOrderData22.getBizRefType();
                        java.lang.String cancelSourceReason22 = tradeOrderData22.getCancelSourceReason();
                        java.lang.String multiplier22 = tradeOrderData22.getMultiplier();
                        java.lang.String sideMsg22 = tradeOrderData22.getSideMsg();
                        java.lang.String tradeQuoteCcy22 = tradeOrderData22.getTradeQuoteCcy();
                        java.lang.String algoId22 = tradeOrderData22.getAlgoId();
                        java.lang.String closeFraction22 = tradeOrderData22.getCloseFraction();
                        java.lang.String ctVal22 = tradeOrderData22.getCtVal();
                        if (ctVal22 == null) {
                        }
                        java.lang.String lastPx22 = tradeOrderData22.getLastPx();
                        java.lang.String code22 = tradeOrderData22.getCode();
                        return new OrderBeanData(accFillSz22, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId22, avgCost22, avgPx222, bankruptcyPx22, bizRefType22, cTime222, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason22, (java.lang.String) null, category222, str2, (java.lang.String) null, (java.lang.String) null, closeFraction22, str7, code22 == null ? "" : code22, (java.lang.String) null, fee22, feeRate22, feeCcy22, fillNotionalUsd22, fillPx22, fillSz22, fillTime22, instFamily222, instId222, instType222, lastPx22, lever222, (java.lang.String) null, multiplier22, notionalUsd22, ordId222, (java.util.List) null, px32, ordType222, (java.lang.String) null, pnl22, pnlCcy22, pnlRatio22, posSide222, px222, quickMgnType222, rebate22, rebateCcy22, reduceOnly222, side222, sideMsg22, slOrdPx22, slTriggerPx222, str3, tradeOrderData22.getSource(), (java.lang.String) null, (java.lang.String) null, state222, (java.lang.String) null, (java.lang.String) null, sz222, category32, tdMode222, str4, tpOrdPx22, tpTriggerPx22, str5, tradeId22, triggerPx22, str6, (java.lang.String) null, uTime22, uly22, d322, tradeQuoteCcy22, 18444350, -1342172640, 2049, (DefaultConstructorMarker) null);
                    }
                    TradeStrategyOrderData tradeStrategyOrderData2 = (TradeStrategyOrderData) tradeAllOrderApi;
                    java.lang.String avgPx32 = tradeStrategyOrderData2.getAvgPx();
                    java.lang.String cTime32 = tradeStrategyOrderData2.getCTime();
                    java.lang.String ccy32 = tradeStrategyOrderData2.getCcy();
                    java.lang.String instFamily32 = tradeStrategyOrderData2.getInstFamily();
                    java.lang.String instId32 = tradeStrategyOrderData2.getInstId();
                    java.lang.String instType32 = tradeStrategyOrderData2.getInstType();
                    java.lang.String lever32 = tradeStrategyOrderData2.getLever();
                    java.lang.String ordId32 = tradeStrategyOrderData2.getOrdId();
                    java.lang.String ordType32 = tradeStrategyOrderData2.getOrdType();
                    if (d != null) {
                    }
                    double d42 = dDoubleValue;
                    java.lang.String posSide32 = tradeStrategyOrderData2.getPosSide();
                    java.lang.String quickMgnType32 = tradeStrategyOrderData2.getQuickMgnType();
                    java.lang.String reduceOnly32 = tradeStrategyOrderData2.getReduceOnly();
                    java.lang.String side32 = tradeStrategyOrderData2.getSide();
                    java.lang.String slOrdPx32 = tradeStrategyOrderData2.getSlOrdPx();
                    java.lang.String slTriggerPx32 = tradeStrategyOrderData2.getSlTriggerPx();
                    java.lang.String slTriggerPxType32 = tradeStrategyOrderData2.getSlTriggerPxType();
                    if (slTriggerPxType32 == null) {
                    }
                    java.lang.String state32 = tradeStrategyOrderData2.getState();
                    java.lang.String sz32 = tradeStrategyOrderData2.getSz();
                    java.lang.String tdMode32 = tradeStrategyOrderData2.getTdMode();
                    java.lang.String tgtCcy32 = tradeStrategyOrderData2.getTgtCcy();
                    if (tgtCcy32 == null) {
                    }
                    java.lang.String tpOrdPx32 = tradeStrategyOrderData2.getTpOrdPx();
                    java.lang.String tpTriggerPx32 = tradeStrategyOrderData2.getTpTriggerPx();
                    java.lang.String tpTriggerPxType32 = tradeStrategyOrderData2.getTpTriggerPxType();
                    if (tpTriggerPxType32 == null) {
                    }
                    java.lang.String triggerPx32 = tradeStrategyOrderData2.getTriggerPx();
                    java.lang.String uTime32 = tradeStrategyOrderData2.getUTime();
                    java.lang.String uly32 = tradeStrategyOrderData2.getUly();
                    java.lang.String notionalUsd32 = tradeStrategyOrderData2.getNotionalUsd();
                    java.lang.String bizRefType32 = tradeStrategyOrderData2.getBizRefType();
                    java.lang.String cancelSourceReason32 = tradeStrategyOrderData2.getCancelSourceReason();
                    java.lang.String tradeQuoteCcy32 = tradeStrategyOrderData2.getTradeQuoteCcy();
                    java.lang.String algoId32 = tradeStrategyOrderData2.getAlgoId();
                    java.lang.String closeFraction32 = tradeStrategyOrderData2.getCloseFraction();
                    java.lang.String ctVal32 = tradeStrategyOrderData2.getCtVal();
                    return new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId32, (java.lang.String) null, avgPx32, (java.lang.String) null, bizRefType32, cTime32, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason32, (java.lang.String) null, (java.lang.String) null, ccy32, (java.lang.String) null, (java.lang.String) null, closeFraction32, ctVal32 == null ? "" : ctVal32, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, instFamily32, instId32, instType32, (java.lang.String) null, lever32, (java.lang.String) null, (java.lang.String) null, notionalUsd32, ordId32, (java.util.List) null, "", ordType32, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, posSide32, "", quickMgnType32, (java.lang.String) null, (java.lang.String) null, reduceOnly32, side32, (java.lang.String) null, slOrdPx32, slTriggerPx32, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, state32, (java.lang.String) null, (java.lang.String) null, sz32, (java.lang.String) null, tdMode32, str9, tpOrdPx32, tpTriggerPx32, str10, (java.lang.String) null, triggerPx32, (java.lang.String) null, (java.lang.String) null, uTime32, uly32, d42, tradeQuoteCcy32, -6589761, -1197936024, 3333, (DefaultConstructorMarker) null);
                case 1208131206:
                    if (!ortType.equals("conditional")) {
                        TradeOrderData tradeOrderData222 = (TradeOrderData) tradeAllOrderApi;
                        java.lang.String accFillSz222 = tradeOrderData222.getAccFillSz();
                        java.lang.String avgPx2222 = tradeOrderData222.getAvgPx();
                        java.lang.String cTime2222 = tradeOrderData222.getCTime();
                        java.lang.String ccy2222 = tradeOrderData222.getCcy();
                        if (ccy2222 == null) {
                        }
                        java.lang.String fee222 = tradeOrderData222.getFee();
                        java.lang.String feeCcy222 = tradeOrderData222.getFeeCcy();
                        java.lang.String feeRate222 = tradeOrderData222.getFeeRate();
                        java.lang.String fillPx222 = tradeOrderData222.getFillPx();
                        java.lang.String fillSz222 = tradeOrderData222.getFillSz();
                        java.lang.String fillTime222 = tradeOrderData222.getFillTime();
                        java.lang.String instFamily2222 = tradeOrderData222.getInstFamily();
                        java.lang.String instId2222 = tradeOrderData222.getInstId();
                        java.lang.String instType2222 = tradeOrderData222.getInstType();
                        java.lang.String lever2222 = tradeOrderData222.getLever();
                        java.lang.String ordId2222 = tradeOrderData222.getOrdId();
                        java.lang.String px322 = tradeOrderData222.getPx();
                        java.lang.String ordType2222 = tradeOrderData222.getOrdType();
                        java.lang.String pnl222 = tradeOrderData222.getPnl();
                        java.lang.String pnlCcy222 = tradeOrderData222.getPnlCcy();
                        java.lang.String pnlRatio222 = tradeOrderData222.getPnlRatio();
                        if (d != null) {
                        }
                        double d3222 = dDoubleValue;
                        java.lang.String posSide2222 = tradeOrderData222.getPosSide();
                        java.lang.String px2222 = tradeOrderData222.getPx();
                        java.lang.String quickMgnType2222 = tradeOrderData222.getQuickMgnType();
                        java.lang.String rebate222 = tradeOrderData222.getRebate();
                        java.lang.String rebateCcy222 = tradeOrderData222.getRebateCcy();
                        java.lang.String reduceOnly2222 = tradeOrderData222.getReduceOnly();
                        java.lang.String side2222 = tradeOrderData222.getSide();
                        java.lang.String slOrdPx222 = tradeOrderData222.getSlOrdPx();
                        java.lang.String slTriggerPx2222 = tradeOrderData222.getSlTriggerPx();
                        java.lang.String slTriggerPxType222 = tradeOrderData222.getSlTriggerPxType();
                        if (slTriggerPxType222 == null) {
                        }
                        java.lang.String state2222 = tradeOrderData222.getState();
                        java.lang.String sz2222 = tradeOrderData222.getSz();
                        java.lang.String category322 = tradeOrderData222.getCategory();
                        java.lang.String tdMode2222 = tradeOrderData222.getTdMode();
                        java.lang.String tgtCcy2222 = tradeOrderData222.getTgtCcy();
                        if (tgtCcy2222 == null) {
                        }
                        java.lang.String tpOrdPx222 = tradeOrderData222.getTpOrdPx();
                        java.lang.String tpTriggerPx222 = tradeOrderData222.getTpTriggerPx();
                        java.lang.String tpTriggerPxType222 = tradeOrderData222.getTpTriggerPxType();
                        if (tpTriggerPxType222 == null) {
                        }
                        java.lang.String tradeId222 = tradeOrderData222.getTradeId();
                        java.lang.String triggerPx222 = tradeOrderData222.getTriggerPx();
                        java.lang.String pxType222 = tradeOrderData222.getPxType();
                        if (pxType222 == null) {
                        }
                        java.lang.String uTime222 = tradeOrderData222.getUTime();
                        java.lang.String uly222 = tradeOrderData222.getUly();
                        java.lang.String notionalUsd222 = tradeOrderData222.getNotionalUsd();
                        java.lang.String fillNotionalUsd222 = tradeOrderData222.getFillNotionalUsd();
                        java.lang.String bankruptcyPx222 = tradeOrderData222.getBankruptcyPx();
                        java.lang.String avgCost222 = tradeOrderData222.getAvgCost();
                        java.lang.String category2222 = tradeOrderData222.getCategory();
                        java.lang.String bizRefType222 = tradeOrderData222.getBizRefType();
                        java.lang.String cancelSourceReason222 = tradeOrderData222.getCancelSourceReason();
                        java.lang.String multiplier222 = tradeOrderData222.getMultiplier();
                        java.lang.String sideMsg222 = tradeOrderData222.getSideMsg();
                        java.lang.String tradeQuoteCcy222 = tradeOrderData222.getTradeQuoteCcy();
                        java.lang.String algoId222 = tradeOrderData222.getAlgoId();
                        java.lang.String closeFraction222 = tradeOrderData222.getCloseFraction();
                        java.lang.String ctVal222 = tradeOrderData222.getCtVal();
                        if (ctVal222 == null) {
                        }
                        java.lang.String lastPx222 = tradeOrderData222.getLastPx();
                        java.lang.String code222 = tradeOrderData222.getCode();
                        return new OrderBeanData(accFillSz222, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId222, avgCost222, avgPx2222, bankruptcyPx222, bizRefType222, cTime2222, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason222, (java.lang.String) null, category2222, str2, (java.lang.String) null, (java.lang.String) null, closeFraction222, str7, code222 == null ? "" : code222, (java.lang.String) null, fee222, feeRate222, feeCcy222, fillNotionalUsd222, fillPx222, fillSz222, fillTime222, instFamily2222, instId2222, instType2222, lastPx222, lever2222, (java.lang.String) null, multiplier222, notionalUsd222, ordId2222, (java.util.List) null, px322, ordType2222, (java.lang.String) null, pnl222, pnlCcy222, pnlRatio222, posSide2222, px2222, quickMgnType2222, rebate222, rebateCcy222, reduceOnly2222, side2222, sideMsg222, slOrdPx222, slTriggerPx2222, str3, tradeOrderData222.getSource(), (java.lang.String) null, (java.lang.String) null, state2222, (java.lang.String) null, (java.lang.String) null, sz2222, category322, tdMode2222, str4, tpOrdPx222, tpTriggerPx222, str5, tradeId222, triggerPx222, str6, (java.lang.String) null, uTime222, uly222, d3222, tradeQuoteCcy222, 18444350, -1342172640, 2049, (DefaultConstructorMarker) null);
                    }
                    TradeStrategyOrderData tradeStrategyOrderData22 = (TradeStrategyOrderData) tradeAllOrderApi;
                    java.lang.String avgPx322 = tradeStrategyOrderData22.getAvgPx();
                    java.lang.String cTime322 = tradeStrategyOrderData22.getCTime();
                    java.lang.String ccy322 = tradeStrategyOrderData22.getCcy();
                    java.lang.String instFamily322 = tradeStrategyOrderData22.getInstFamily();
                    java.lang.String instId322 = tradeStrategyOrderData22.getInstId();
                    java.lang.String instType322 = tradeStrategyOrderData22.getInstType();
                    java.lang.String lever322 = tradeStrategyOrderData22.getLever();
                    java.lang.String ordId322 = tradeStrategyOrderData22.getOrdId();
                    java.lang.String ordType322 = tradeStrategyOrderData22.getOrdType();
                    if (d != null) {
                    }
                    double d422 = dDoubleValue;
                    java.lang.String posSide322 = tradeStrategyOrderData22.getPosSide();
                    java.lang.String quickMgnType322 = tradeStrategyOrderData22.getQuickMgnType();
                    java.lang.String reduceOnly322 = tradeStrategyOrderData22.getReduceOnly();
                    java.lang.String side322 = tradeStrategyOrderData22.getSide();
                    java.lang.String slOrdPx322 = tradeStrategyOrderData22.getSlOrdPx();
                    java.lang.String slTriggerPx322 = tradeStrategyOrderData22.getSlTriggerPx();
                    java.lang.String slTriggerPxType322 = tradeStrategyOrderData22.getSlTriggerPxType();
                    if (slTriggerPxType322 == null) {
                    }
                    java.lang.String state322 = tradeStrategyOrderData22.getState();
                    java.lang.String sz322 = tradeStrategyOrderData22.getSz();
                    java.lang.String tdMode322 = tradeStrategyOrderData22.getTdMode();
                    java.lang.String tgtCcy322 = tradeStrategyOrderData22.getTgtCcy();
                    if (tgtCcy322 == null) {
                    }
                    java.lang.String tpOrdPx322 = tradeStrategyOrderData22.getTpOrdPx();
                    java.lang.String tpTriggerPx322 = tradeStrategyOrderData22.getTpTriggerPx();
                    java.lang.String tpTriggerPxType322 = tradeStrategyOrderData22.getTpTriggerPxType();
                    if (tpTriggerPxType322 == null) {
                    }
                    java.lang.String triggerPx322 = tradeStrategyOrderData22.getTriggerPx();
                    java.lang.String uTime322 = tradeStrategyOrderData22.getUTime();
                    java.lang.String uly322 = tradeStrategyOrderData22.getUly();
                    java.lang.String notionalUsd322 = tradeStrategyOrderData22.getNotionalUsd();
                    java.lang.String bizRefType322 = tradeStrategyOrderData22.getBizRefType();
                    java.lang.String cancelSourceReason322 = tradeStrategyOrderData22.getCancelSourceReason();
                    java.lang.String tradeQuoteCcy322 = tradeStrategyOrderData22.getTradeQuoteCcy();
                    java.lang.String algoId322 = tradeStrategyOrderData22.getAlgoId();
                    java.lang.String closeFraction322 = tradeStrategyOrderData22.getCloseFraction();
                    java.lang.String ctVal322 = tradeStrategyOrderData22.getCtVal();
                    return new OrderBeanData((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId322, (java.lang.String) null, avgPx322, (java.lang.String) null, bizRefType322, cTime322, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason322, (java.lang.String) null, (java.lang.String) null, ccy322, (java.lang.String) null, (java.lang.String) null, closeFraction322, ctVal322 == null ? "" : ctVal322, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, instFamily322, instId322, instType322, (java.lang.String) null, lever322, (java.lang.String) null, (java.lang.String) null, notionalUsd322, ordId322, (java.util.List) null, "", ordType322, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, posSide322, "", quickMgnType322, (java.lang.String) null, (java.lang.String) null, reduceOnly322, side322, (java.lang.String) null, slOrdPx322, slTriggerPx322, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, state322, (java.lang.String) null, (java.lang.String) null, sz322, (java.lang.String) null, tdMode322, str9, tpOrdPx322, tpTriggerPx322, str10, (java.lang.String) null, triggerPx322, (java.lang.String) null, (java.lang.String) null, uTime322, uly322, d422, tradeQuoteCcy322, -6589761, -1197936024, 3333, (DefaultConstructorMarker) null);
                default:
                    TradeOrderData tradeOrderData2222 = (TradeOrderData) tradeAllOrderApi;
                    java.lang.String accFillSz2222 = tradeOrderData2222.getAccFillSz();
                    java.lang.String avgPx22222 = tradeOrderData2222.getAvgPx();
                    java.lang.String cTime22222 = tradeOrderData2222.getCTime();
                    java.lang.String ccy22222 = tradeOrderData2222.getCcy();
                    if (ccy22222 == null) {
                    }
                    java.lang.String fee2222 = tradeOrderData2222.getFee();
                    java.lang.String feeCcy2222 = tradeOrderData2222.getFeeCcy();
                    java.lang.String feeRate2222 = tradeOrderData2222.getFeeRate();
                    java.lang.String fillPx2222 = tradeOrderData2222.getFillPx();
                    java.lang.String fillSz2222 = tradeOrderData2222.getFillSz();
                    java.lang.String fillTime2222 = tradeOrderData2222.getFillTime();
                    java.lang.String instFamily22222 = tradeOrderData2222.getInstFamily();
                    java.lang.String instId22222 = tradeOrderData2222.getInstId();
                    java.lang.String instType22222 = tradeOrderData2222.getInstType();
                    java.lang.String lever22222 = tradeOrderData2222.getLever();
                    java.lang.String ordId22222 = tradeOrderData2222.getOrdId();
                    java.lang.String px3222 = tradeOrderData2222.getPx();
                    java.lang.String ordType22222 = tradeOrderData2222.getOrdType();
                    java.lang.String pnl2222 = tradeOrderData2222.getPnl();
                    java.lang.String pnlCcy2222 = tradeOrderData2222.getPnlCcy();
                    java.lang.String pnlRatio2222 = tradeOrderData2222.getPnlRatio();
                    if (d != null) {
                    }
                    double d32222 = dDoubleValue;
                    java.lang.String posSide22222 = tradeOrderData2222.getPosSide();
                    java.lang.String px22222 = tradeOrderData2222.getPx();
                    java.lang.String quickMgnType22222 = tradeOrderData2222.getQuickMgnType();
                    java.lang.String rebate2222 = tradeOrderData2222.getRebate();
                    java.lang.String rebateCcy2222 = tradeOrderData2222.getRebateCcy();
                    java.lang.String reduceOnly22222 = tradeOrderData2222.getReduceOnly();
                    java.lang.String side22222 = tradeOrderData2222.getSide();
                    java.lang.String slOrdPx2222 = tradeOrderData2222.getSlOrdPx();
                    java.lang.String slTriggerPx22222 = tradeOrderData2222.getSlTriggerPx();
                    java.lang.String slTriggerPxType2222 = tradeOrderData2222.getSlTriggerPxType();
                    if (slTriggerPxType2222 == null) {
                    }
                    java.lang.String state22222 = tradeOrderData2222.getState();
                    java.lang.String sz22222 = tradeOrderData2222.getSz();
                    java.lang.String category3222 = tradeOrderData2222.getCategory();
                    java.lang.String tdMode22222 = tradeOrderData2222.getTdMode();
                    java.lang.String tgtCcy22222 = tradeOrderData2222.getTgtCcy();
                    if (tgtCcy22222 == null) {
                    }
                    java.lang.String tpOrdPx2222 = tradeOrderData2222.getTpOrdPx();
                    java.lang.String tpTriggerPx2222 = tradeOrderData2222.getTpTriggerPx();
                    java.lang.String tpTriggerPxType2222 = tradeOrderData2222.getTpTriggerPxType();
                    if (tpTriggerPxType2222 == null) {
                    }
                    java.lang.String tradeId2222 = tradeOrderData2222.getTradeId();
                    java.lang.String triggerPx2222 = tradeOrderData2222.getTriggerPx();
                    java.lang.String pxType2222 = tradeOrderData2222.getPxType();
                    if (pxType2222 == null) {
                    }
                    java.lang.String uTime2222 = tradeOrderData2222.getUTime();
                    java.lang.String uly2222 = tradeOrderData2222.getUly();
                    java.lang.String notionalUsd2222 = tradeOrderData2222.getNotionalUsd();
                    java.lang.String fillNotionalUsd2222 = tradeOrderData2222.getFillNotionalUsd();
                    java.lang.String bankruptcyPx2222 = tradeOrderData2222.getBankruptcyPx();
                    java.lang.String avgCost2222 = tradeOrderData2222.getAvgCost();
                    java.lang.String category22222 = tradeOrderData2222.getCategory();
                    java.lang.String bizRefType2222 = tradeOrderData2222.getBizRefType();
                    java.lang.String cancelSourceReason2222 = tradeOrderData2222.getCancelSourceReason();
                    java.lang.String multiplier2222 = tradeOrderData2222.getMultiplier();
                    java.lang.String sideMsg2222 = tradeOrderData2222.getSideMsg();
                    java.lang.String tradeQuoteCcy2222 = tradeOrderData2222.getTradeQuoteCcy();
                    java.lang.String algoId2222 = tradeOrderData2222.getAlgoId();
                    java.lang.String closeFraction2222 = tradeOrderData2222.getCloseFraction();
                    java.lang.String ctVal2222 = tradeOrderData2222.getCtVal();
                    if (ctVal2222 == null) {
                    }
                    java.lang.String lastPx2222 = tradeOrderData2222.getLastPx();
                    java.lang.String code2222 = tradeOrderData2222.getCode();
                    return new OrderBeanData(accFillSz2222, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, algoId2222, avgCost2222, avgPx22222, bankruptcyPx2222, bizRefType2222, cTime22222, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, cancelSourceReason2222, (java.lang.String) null, category22222, str2, (java.lang.String) null, (java.lang.String) null, closeFraction2222, str7, code2222 == null ? "" : code2222, (java.lang.String) null, fee2222, feeRate2222, feeCcy2222, fillNotionalUsd2222, fillPx2222, fillSz2222, fillTime2222, instFamily22222, instId22222, instType22222, lastPx2222, lever22222, (java.lang.String) null, multiplier2222, notionalUsd2222, ordId22222, (java.util.List) null, px3222, ordType22222, (java.lang.String) null, pnl2222, pnlCcy2222, pnlRatio2222, posSide22222, px22222, quickMgnType22222, rebate2222, rebateCcy2222, reduceOnly22222, side22222, sideMsg2222, slOrdPx2222, slTriggerPx22222, str3, tradeOrderData2222.getSource(), (java.lang.String) null, (java.lang.String) null, state22222, (java.lang.String) null, (java.lang.String) null, sz22222, category3222, tdMode22222, str4, tpOrdPx2222, tpTriggerPx2222, str5, tradeId2222, triggerPx2222, str6, (java.lang.String) null, uTime2222, uly2222, d32222, tradeQuoteCcy2222, 18444350, -1342172640, 2049, (DefaultConstructorMarker) null);
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
