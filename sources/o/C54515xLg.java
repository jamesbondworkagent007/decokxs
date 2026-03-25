package o;

import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ChaseOrderReq;
import com.okinc.unify_trade.biz.OptionalTradeOrderReq;
import com.okinc.unify_trade.biz.SegmentOrderRequest;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.TradeOrderGroupData;
import com.okinc.unify_trade.biz.TradeOrderSpReq;
import com.okinc.unify_trade.biz.TradeStrategyOrderGroupData;
import com.okinc.unify_trade.biz.TriggerStrategyOrderReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.constants.KLineConfigType;
import com.okinc.unify_trade.manager.UserOperationInfo;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import com.okinc.unify_trade.universal.data.PositionLiveDataResp;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C54520xLl;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xLg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54515xLg {
    public static boolean AYXKKw;
    public static Application djBIcL;
    public static final C54515xLg OLrzqt = new C54515xLg();
    public static java.lang.Boolean copydefault = java.lang.Boolean.FALSE;
    public static java.lang.String EZpvd = "0";
    public static final int AEQbTJ = 1000;
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.xLf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C54515xLg.OLrzqt();
        }
    });
    public static final int KWHzl = 8;

    private C54515xLg() {
    }

    public final xLY AEQbTJ() {
        return (xLY) valueOf.getValue();
    }

    public static final xLY OLrzqt() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    public static /* synthetic */ void collectCommonInfo$default(C54515xLg c54515xLg, java.util.Map map, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        c54515xLg.EZpvd(map, str, str2);
    }

    public final void EZpvd(java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.String str2) {
        xOW newProxyInstance;
        xOW newProxyInstance2;
        map.put("pic_size", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(xVL.EZpvd.gEmmrt())));
        java.lang.String strAuCTelauCTel = null;
        if (str2 == null) {
            BizInstrument bizInstrumentEZpvd = AEQbTJ().EZpvd();
            str2 = C33129mqd.gEmmrt(bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstId() : null);
        }
        map.put("application_attach", str2);
        if (str == null) {
            BizInstrument bizInstrumentEZpvd2 = AEQbTJ().EZpvd();
            str = C33129mqd.gEmmrt(bizInstrumentEZpvd2 != null ? bizInstrumentEZpvd2.getInstType() : null);
        }
        map.put("inst_id", str);
        xHZ xhz = xHZ.KWHzl;
        map.put("system_avail_mem", C33129mqd.gEmmrt(xhz.isConnected()));
        map.put("txType", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(xhz.values())));
        map.put("fiat_amount", C33129mqd.gEmmrt(xhz.gEmmrt()));
        map.put("unified_amount", C33129mqd.gEmmrt(xhz.DbNXlk()));
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        map.put("last_activity_render", C33129mqd.gEmmrt((interfaceC54581xNrOLrzqt == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM()));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null && (newProxyInstance = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) != null) {
            strAuCTelauCTel = newProxyInstance.AuCTelauCTel();
        }
        map.put("page", C33129mqd.gEmmrt(strAuCTelauCTel));
        map.put("process_status_vm_peak", TradeAbTestManager.copydefault.KWHzl());
    }

    public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        xHZ xhz = xHZ.KWHzl;
        UserOperationInfo userOperationInfoAkhnZx = xhz.AkhnZx();
        map.put("activity_render", C33129mqd.gEmmrt(userOperationInfoAkhnZx != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx.getOrderAreaCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx2 = xhz.AkhnZx();
        map.put("application_create", C33129mqd.gEmmrt(userOperationInfoAkhnZx2 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx2.getClickOrderTypeEntryCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx3 = xhz.AkhnZx();
        map.put("application_install_provider", C33129mqd.gEmmrt(userOperationInfoAkhnZx3 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx3.getPriceChangeCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx4 = xhz.AkhnZx();
        map.put("blockedTime", C33129mqd.gEmmrt(userOperationInfoAkhnZx4 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx4.getAmountChangeCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx5 = xhz.AkhnZx();
        map.put("brc20Token", C33129mqd.gEmmrt(userOperationInfoAkhnZx5 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx5.getDragSeekBarCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx6 = xhz.AkhnZx();
        map.put("isApplicationHooked", C33129mqd.gEmmrt(userOperationInfoAkhnZx6 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx6.getSwitchBuySellCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx7 = xhz.AkhnZx();
        map.put("click", C33129mqd.gEmmrt(userOperationInfoAkhnZx7 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx7.getOppoPriceCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx8 = xhz.AkhnZx();
        map.put("code", C33129mqd.gEmmrt(userOperationInfoAkhnZx8 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx8.getMarginModeCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx9 = xhz.AkhnZx();
        map.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33129mqd.gEmmrt(userOperationInfoAkhnZx9 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx9.getModifyLeverageCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx10 = xhz.AkhnZx();
        map.put("crypto_amount", C33129mqd.gEmmrt(userOperationInfoAkhnZx10 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx10.getReduceOnlyCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx11 = xhz.AkhnZx();
        map.put("debugBlockerAttacked", C33129mqd.gEmmrt(userOperationInfoAkhnZx11 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx11.getTpslCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx12 = xhz.AkhnZx();
        map.put("isMemoryTampered", C33129mqd.gEmmrt(userOperationInfoAkhnZx12 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx12.getSwitchMarginCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx13 = xhz.AkhnZx();
        map.put("isFileTampered", C33129mqd.gEmmrt(userOperationInfoAkhnZx13 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx13.getTransferCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx14 = xhz.AkhnZx();
        map.put("debugBlockerFailed", C33129mqd.gEmmrt(userOperationInfoAkhnZx14 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx14.getDepthAllCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx15 = xhz.AkhnZx();
        map.put("isSelinuxIntegrity", C33129mqd.gEmmrt(userOperationInfoAkhnZx15 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx15.getDepthPriceCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx16 = xhz.AkhnZx();
        map.put("isSignedWithDebugKeys", C33129mqd.gEmmrt(userOperationInfoAkhnZx16 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx16.getDepthAmountCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx17 = xhz.AkhnZx();
        map.put("system_total_mem", C33129mqd.gEmmrt(userOperationInfoAkhnZx17 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx17.getKLineAllCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx18 = xhz.AkhnZx();
        map.put("task_call_method", C33129mqd.gEmmrt(userOperationInfoAkhnZx18 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx18.getKLineHideCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx19 = xhz.AkhnZx();
        map.put(OtcExtraKeys.CRYPTO_ORDER_TYPE, C33129mqd.gEmmrt(userOperationInfoAkhnZx19 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx19.getKLineEnterCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx20 = xhz.AkhnZx();
        map.put("payment_channel", C33129mqd.gEmmrt(userOperationInfoAkhnZx20 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx20.getBottomAllCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx21 = xhz.AkhnZx();
        map.put("isCertificateTampered", C33129mqd.gEmmrt(userOperationInfoAkhnZx21 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx21.getPositionListAllCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx22 = xhz.AkhnZx();
        map.put("isClockTampered", C33129mqd.gEmmrt(userOperationInfoAkhnZx22 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx22.getOrderListAllCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx23 = xhz.AkhnZx();
        map.put("isDebuggerAttached", C33129mqd.gEmmrt(userOperationInfoAkhnZx23 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx23.getOrderModifyCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx24 = xhz.AkhnZx();
        map.put("isDeviceRooted", C33129mqd.gEmmrt(userOperationInfoAkhnZx24 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx24.getOrderCancelCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx25 = xhz.AkhnZx();
        map.put("trade_type", C33129mqd.gEmmrt(userOperationInfoAkhnZx25 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx25.getOrderItemCount()) : null));
        UserOperationInfo userOperationInfoAkhnZx26 = xhz.AkhnZx();
        map.put("isMemoryTampered", C33129mqd.gEmmrt(userOperationInfoAkhnZx26 != null ? java.lang.Integer.valueOf(userOperationInfoAkhnZx26.getAssetListAllCount()) : null));
    }

    public final void copydefault(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_page_end");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str);
        linkedHashMap.put("pauseTime", java.lang.String.valueOf(str2));
        xHZ xhz = xHZ.KWHzl;
        linkedHashMap.put("start_mode", xhz.AhwBna());
        linkedHashMap.put("isAppDebuggable", C33129mqd.gEmmrt(java.lang.Integer.valueOf(xhz.fetchVPNInfo())));
        linkedHashMap.put("isRunningInEmulator", C33129mqd.gEmmrt(str3));
        linkedHashMap.put("isTampered", xhz.djBIcL());
        linkedHashMap.put("isAppTampered", xhz.AEQbTJ());
        linkedHashMap.put("chain_id", copydefault());
        linkedHashMap.put("java_heap_max", xhz.copydefault());
        AEQbTJ(linkedHashMap);
        collectCommonInfo$default(this, linkedHashMap, null, null, 6, null);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportTradePageEnd: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public static /* synthetic */ void reportOrderType$default(C54515xLg c54515xLg, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        c54515xLg.OLrzqt(str, str2, bool);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Boolean bool) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        linkedHashMap.put("pauseTime", lowerCase);
        linkedHashMap.put("launchTime", OtcExtraKeys.CRYPTO_ORDER_TYPE);
        linkedHashMap.put("otherTime", java.lang.String.valueOf(bool));
        linkedHashMap.put("totalTime", str);
        if (Intrinsics.EZpvd(copydefault, java.lang.Boolean.TRUE)) {
            str3 = "hasPercent";
        } else if (Intrinsics.EZpvd(copydefault, java.lang.Boolean.FALSE)) {
            str3 = "noPercent";
        }
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str3);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportOrderType: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        copydefault = null;
    }

    public static /* synthetic */ void reportSpotLargeOrder$default(C54515xLg c54515xLg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        c54515xLg.OLrzqt(str, str2, str3, str4);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C33129mqd.gEmmrt(str, "1000000") || C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_spot_large_amount");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("totalTime", str2);
        linkedHashMap.put("otherTime", str3);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str4);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportSpotLargeOrder: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public static /* synthetic */ void reportReduceOnlyEntry$default(C54515xLg c54515xLg, java.lang.String str, Activity activity, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            activity = null;
        }
        c54515xLg.AEQbTJ(str, activity);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, Activity activity) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        xHZ xhz = xHZ.KWHzl;
        xhz.copydefault(str);
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", "reduce_only_entry");
        linkedHashMap.put("pauseTime", str);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, xhz.valueOf());
        if (activity != null) {
            activity.OLrzqt(linkedHashMap);
        }
        EZpvd(linkedHashMap, activity != null ? activity.KWHzl() : null, activity != null ? activity.AEQbTJ() : null);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportReduceOnlyEntry: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c7 A[PHI: r22
  0x02c7: PHI (r22v3 java.lang.String) = (r22v1 java.lang.String), (r22v4 java.lang.String) binds: [B:167:0x02c4, B:156:0x0299] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02db A[PHI: r22
  0x02db: PHI (r22v6 java.lang.String) = 
  (r22v0 java.lang.String)
  (r22v1 java.lang.String)
  (r22v2 java.lang.String)
  (r22v2 java.lang.String)
  (r22v2 java.lang.String)
  (r22v3 java.lang.String)
  (r22v3 java.lang.String)
  (r22v4 java.lang.String)
  (r22v5 java.lang.String)
  (r22v8 java.lang.String)
  (r22v9 java.lang.String)
  (r22v11 java.lang.String)
  (r22v11 java.lang.String)
  (r22v13 java.lang.String)
 binds: [B:245:?, B:167:0x02c4, B:159:0x02a4, B:162:0x02b3, B:164:0x02b9, B:170:0x02d3, B:172:0x02d9, B:156:0x0299, B:247:?, B:154:0x028e, B:244:?, B:150:0x0285, B:152:0x028b, B:246:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, ChaseOrderReq chaseOrderReq, TradeOrderGroupData tradeOrderGroupData, StrategyReqGroup strategyReqGroup, TradeStrategyOrderGroupData tradeStrategyOrderGroupData, SegmentOrderRequest segmentOrderRequest, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.String str8) {
        java.lang.String posSide;
        TriggerStrategyOrderReq trigger;
        java.lang.String triggerPx;
        java.lang.String bboType;
        java.lang.String tpTriggerPx;
        java.lang.String tpOrdPx;
        java.lang.String slTriggerPx;
        java.lang.String slOrdPx;
        java.lang.String orderPx;
        java.lang.String sz;
        java.lang.String ordType;
        java.lang.String str9;
        xMJ.TaskDescription value;
        java.lang.String strOLrzqt;
        java.lang.Boolean boolValueOf;
        java.lang.String tdMode;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.Boolean boolValueOf2;
        java.lang.String strGEmmrt;
        java.util.List<TradePositionManager.PositionItem> positions;
        java.lang.Object next;
        TradeStrategyOrderGroupData tradeStrategyOrderGroupData2;
        TriggerStrategyOrderReq trigger2;
        TradeOrderSpReq sp;
        TradeOrderSpReq sp2;
        TradeOrderSpReq sp3;
        TradeOrderSpReq sp4;
        OptionalTradeOrderReq optional;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        C49402unq.reportHttpResult$default("http_place_order", C56424yEw.gEmmrt(C56390yDp.OLrzqt("errorCode", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt(EopTrackEvent.KEY_ERROR_MSG_HUMP, C33129mqd.gEmmrt(str2)), C56390yDp.OLrzqt("instType", C33129mqd.gEmmrt(str3)), C56390yDp.OLrzqt("instId", C33129mqd.gEmmrt(str4)), C56390yDp.OLrzqt("orderId", C33129mqd.gEmmrt(str5))), null, 4, null);
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        if (chaseOrderReq != null) {
            posSide = chaseOrderReq.getPosSide();
        } else if (tradeOrderGroupData != null) {
            OptionalTradeOrderReq optional2 = tradeOrderGroupData.getOptional();
            posSide = optional2 != null ? optional2.getPosSide() : null;
        } else if (strategyReqGroup != null) {
            posSide = strategyReqGroup.getBaseReq().getPosSide();
        } else if (tradeStrategyOrderGroupData != null) {
            posSide = tradeStrategyOrderGroupData.getReq().getPosSide();
        }
        if (tradeOrderGroupData != null) {
            OptionalTradeOrderReq optional3 = tradeOrderGroupData.getOptional();
            triggerPx = optional3 != null ? optional3.getPx() : null;
        } else if (tradeStrategyOrderGroupData != null && Intrinsics.EZpvd((java.lang.Object) tradeStrategyOrderGroupData.getReq().getOrderType(), (java.lang.Object) "trigger") && (trigger = tradeStrategyOrderGroupData.getTrigger()) != null) {
            triggerPx = trigger.getTriggerPx();
        }
        if (tradeOrderGroupData == null || (optional = tradeOrderGroupData.getOptional()) == null || (bboType = optional.getBboType()) == null) {
            bboType = "";
        }
        Function2 function2 = new Function2() { // from class: o.xLk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C54515xLg.copydefault((java.lang.String) obj, (java.lang.String) obj2));
            }
        };
        if (tradeStrategyOrderGroupData != null) {
            java.lang.String orderType = tradeStrategyOrderGroupData.getReq().getOrderType();
            TradeOrderSpReq sp5 = tradeStrategyOrderGroupData.getSp();
            TradeStrategyOrderGroupData tradeStrategyOrderGroupData3 = ((java.lang.Boolean) function2.invoke(orderType, sp5 != null ? sp5.getTpTriggerPx() : null)).booleanValue() ? tradeStrategyOrderGroupData : null;
            tpTriggerPx = (tradeStrategyOrderGroupData3 == null || (sp4 = tradeStrategyOrderGroupData3.getSp()) == null) ? null : sp4.getTpTriggerPx();
        }
        if (tradeStrategyOrderGroupData != null) {
            java.lang.String orderType2 = tradeStrategyOrderGroupData.getReq().getOrderType();
            TradeOrderSpReq sp6 = tradeStrategyOrderGroupData.getSp();
            TradeStrategyOrderGroupData tradeStrategyOrderGroupData4 = ((java.lang.Boolean) function2.invoke(orderType2, sp6 != null ? sp6.getTpOrdPx() : null)).booleanValue() ? tradeStrategyOrderGroupData : null;
            tpOrdPx = (tradeStrategyOrderGroupData4 == null || (sp3 = tradeStrategyOrderGroupData4.getSp()) == null) ? null : sp3.getTpOrdPx();
        }
        if (tradeStrategyOrderGroupData != null) {
            java.lang.String orderType3 = tradeStrategyOrderGroupData.getReq().getOrderType();
            TradeOrderSpReq sp7 = tradeStrategyOrderGroupData.getSp();
            TradeStrategyOrderGroupData tradeStrategyOrderGroupData5 = ((java.lang.Boolean) function2.invoke(orderType3, sp7 != null ? sp7.getSlTriggerPx() : null)).booleanValue() ? tradeStrategyOrderGroupData : null;
            slTriggerPx = (tradeStrategyOrderGroupData5 == null || (sp2 = tradeStrategyOrderGroupData5.getSp()) == null) ? null : sp2.getSlTriggerPx();
        }
        if (tradeStrategyOrderGroupData != null) {
            java.lang.String orderType4 = tradeStrategyOrderGroupData.getReq().getOrderType();
            TradeOrderSpReq sp8 = tradeStrategyOrderGroupData.getSp();
            TradeStrategyOrderGroupData tradeStrategyOrderGroupData6 = ((java.lang.Boolean) function2.invoke(orderType4, sp8 != null ? sp8.getSlOrdPx() : null)).booleanValue() ? tradeStrategyOrderGroupData : null;
            slOrdPx = (tradeStrategyOrderGroupData6 == null || (sp = tradeStrategyOrderGroupData6.getSp()) == null) ? null : sp.getSlOrdPx();
        }
        if (tradeStrategyOrderGroupData == null) {
            orderPx = null;
        } else if (Intrinsics.EZpvd((java.lang.Object) tradeStrategyOrderGroupData.getReq().getOrderType(), (java.lang.Object) "trigger")) {
            TriggerStrategyOrderReq trigger3 = tradeStrategyOrderGroupData.getTrigger();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) (trigger3 != null ? trigger3.getOrderPx() : null))) {
                tradeStrategyOrderGroupData2 = tradeStrategyOrderGroupData;
            }
            if (tradeStrategyOrderGroupData2 == null) {
                orderPx = null;
            }
        } else {
            tradeStrategyOrderGroupData2 = null;
            if (tradeStrategyOrderGroupData2 == null && (trigger2 = tradeStrategyOrderGroupData2.getTrigger()) != null) {
                orderPx = trigger2.getOrderPx();
            }
        }
        if (chaseOrderReq != null) {
            sz = chaseOrderReq.getSz();
        } else if (tradeOrderGroupData != null) {
            sz = tradeOrderGroupData.getBase().getSz();
        } else if (strategyReqGroup != null) {
            StrategyMoveOrderReq movingProfitReq = strategyReqGroup.getMovingProfitReq();
            sz = movingProfitReq != null ? movingProfitReq.getSz() : null;
        } else if (tradeStrategyOrderGroupData != null) {
            sz = tradeStrategyOrderGroupData.getReq().getSz();
        }
        if (chaseOrderReq != null) {
            ordType = chaseOrderReq.getOrdType();
        } else if (tradeOrderGroupData != null) {
            ordType = tradeOrderGroupData.getBase().getOrderType();
        } else if (strategyReqGroup != null) {
            ordType = strategyReqGroup.getBaseReq().getOrdType();
        } else if (tradeStrategyOrderGroupData != null) {
            ordType = tradeStrategyOrderGroupData.getReq().getOrderType();
        } else {
            ordType = segmentOrderRequest != null ? segmentOrderRequest.getOrdType() : null;
        }
        java.lang.String str10 = ordType;
        switch (str3.hashCode()) {
            case -2027980370:
                str9 = sz;
                if (!str3.equals("MARGIN")) {
                    strOLrzqt = "";
                    break;
                } else {
                    TickersData value2 = C54782xVc.AEQbTJ.gEmmrt().getValue();
                    if (value2 == null || (strOLrzqt = value2.getLast()) == null) {
                    }
                }
                break;
            case -1956807563:
                str9 = sz;
                if (!str3.equals("OPTION") || (value = C54782xVc.AEQbTJ.copydefault().getValue()) == null || (strOLrzqt = value.OLrzqt()) == null) {
                }
                break;
            case 2552066:
                str9 = sz;
                if (!str3.equals("SPOT")) {
                }
                break;
            case 2558355:
                if (str3.equals("SWAP")) {
                    PositionLiveDataResp value3 = C54782xVc.AEQbTJ.djBIcL().getValue();
                    if (value3 == null || (positions = value3.getPositions()) == null) {
                        str9 = sz;
                    } else {
                        java.util.Iterator<T> it = positions.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                str9 = sz;
                                if (!Intrinsics.EZpvd((java.lang.Object) ((TradePositionManager.PositionItem) next).getInstId(), (java.lang.Object) str4)) {
                                    sz = str9;
                                }
                            } else {
                                str9 = sz;
                                next = null;
                            }
                        }
                        TradePositionManager.PositionItem positionItem = (TradePositionManager.PositionItem) next;
                        if (positionItem == null || (strOLrzqt = positionItem.getLast()) == null) {
                        }
                    }
                } else {
                    str9 = sz;
                }
                strOLrzqt = "";
                break;
            case 214415088:
                if (!str3.equals("FUTURES")) {
                    str9 = sz;
                }
                strOLrzqt = "";
                break;
            default:
                str9 = sz;
                strOLrzqt = "";
                break;
        }
        if (chaseOrderReq != null) {
            boolValueOf = chaseOrderReq.getReduceOnly();
        } else if (tradeOrderGroupData != null) {
            OptionalTradeOrderReq optional4 = tradeOrderGroupData.getOptional();
            boolValueOf = optional4 != null ? optional4.getReduceOnly() : null;
        } else if (strategyReqGroup != null) {
            boolValueOf = strategyReqGroup.getBaseReq().getReduceOnly();
        } else if (tradeStrategyOrderGroupData != null) {
            boolValueOf = tradeStrategyOrderGroupData.getReq().getReduceOnly();
        } else if (segmentOrderRequest != null) {
            boolValueOf = java.lang.Boolean.valueOf(segmentOrderRequest.getReduceOnly());
        }
        if (chaseOrderReq != null) {
            tdMode = chaseOrderReq.getTdMode();
        } else if (tradeOrderGroupData != null) {
            tdMode = tradeOrderGroupData.getBase().getTdMode();
        } else if (strategyReqGroup != null) {
            tdMode = strategyReqGroup.getBaseReq().getTdMode();
        } else if (tradeStrategyOrderGroupData != null) {
            tdMode = tradeStrategyOrderGroupData.getReq().getTdMode();
        } else {
            tdMode = segmentOrderRequest != null ? segmentOrderRequest.getTdMode() : null;
        }
        if ((Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SWAP") || Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "FUTURES")) && (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) != null) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str4 == null ? "" : str4);
            boolValueOf2 = bizInstrumentValueOf != null ? java.lang.Boolean.valueOf(bizInstrumentValueOf.isPositiveContract()) : null;
        }
        xMJ.Application value4 = C54782xVc.AEQbTJ.AhwBna().getValue();
        java.lang.String strEZpvd = value4 != null ? value4.EZpvd() : null;
        EventData eventData = new EventData();
        java.lang.String str11 = strEZpvd;
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.lang.Boolean bool3 = boolValueOf2;
        linkedHashMap.put("launchTime", "response_state");
        linkedHashMap.put("pauseTime", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "0") ? "success" : "fail");
        linkedHashMap.put("totalTime", str2);
        linkedHashMap.put("otherTime", str);
        xHZ xhz = xHZ.KWHzl;
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, xhz.AYXKKw());
        linkedHashMap.put("main_start", str3);
        linkedHashMap.put("launching", java.lang.String.valueOf(str5));
        linkedHashMap.put("pic_url", xhz.valueOf());
        linkedHashMap.put("activity_render", str6);
        linkedHashMap.put("isRunningInEmulator", C33129mqd.gEmmrt(str7));
        linkedHashMap.put("blockedTime", C33129mqd.gEmmrt(posSide));
        linkedHashMap.put("brc20Token", C33129mqd.gEmmrt(triggerPx));
        linkedHashMap.put("current_app_mode", C33129mqd.gEmmrt(bboType));
        linkedHashMap.put("isApplicationHooked", C33129mqd.gEmmrt(tpTriggerPx));
        linkedHashMap.put("payment_channel", C33129mqd.gEmmrt(tpOrdPx));
        linkedHashMap.put("isFileTampered", C33129mqd.gEmmrt(slTriggerPx));
        linkedHashMap.put("isSelinuxIntegrity", C33129mqd.gEmmrt(slOrdPx));
        linkedHashMap.put("isSignedWithDebugKeys", C33129mqd.gEmmrt(orderPx));
        linkedHashMap.put("crypto_amount", C33129mqd.gEmmrt(str9));
        linkedHashMap.put("code", C33129mqd.gEmmrt(str10));
        linkedHashMap.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33129mqd.gEmmrt(strOLrzqt));
        linkedHashMap.put("click", C33129mqd.gEmmrt(boolValueOf));
        linkedHashMap.put("isMemoryTampered", C33129mqd.gEmmrt(tdMode));
        linkedHashMap.put("debugBlockerFailed", C33129mqd.gEmmrt(bool3));
        linkedHashMap.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, C33129mqd.gEmmrt(str11));
        linkedHashMap.put("isDebuggerAttached", bool != null ? C33129mqd.gEmmrt(bool) : "");
        BizInstrument bizInstrumentEZpvd = AEQbTJ().EZpvd();
        linkedHashMap.put("isTampered", C33129mqd.gEmmrt(bizInstrumentEZpvd != null ? java.lang.Boolean.valueOf(bizInstrumentEZpvd.isNewLabel()) : null));
        linkedHashMap.put("application_install_provider", EZpvd);
        linkedHashMap.put("application_create", str8 == null ? "" : str8);
        linkedHashMap.put("isDeviceRooted", (bool2 == null || (strGEmmrt = C33129mqd.gEmmrt(bool2)) == null) ? "" : strGEmmrt);
        linkedHashMap.put("isAppTampered", C33129mqd.gEmmrt(java.lang.Boolean.valueOf(AYXKKw)));
        EZpvd(linkedHashMap, str3, str4);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportPlaceOrderResponse: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        AYXKKw = false;
    }

    public static final boolean copydefault(java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return yDY.copydefault("conditional", "oco").contains(str) && C33129mqd.OLrzqt((java.lang.CharSequence) str2);
    }

    public final void AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_setting_end");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", str);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, C33129mqd.gEmmrt(java.lang.Boolean.valueOf(z)));
        linkedHashMap.put("pic_url", str2);
        linkedHashMap.put("code", str3);
        linkedHashMap.put("click", str4);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportTradeSettingEnd: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    /* JADX INFO: renamed from: o.xLg$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            return new Activity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) activity.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) activity.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) activity.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) activity.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) activity.isConnected);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            java.lang.String str = this.OLrzqt;
            return (((((((((((((((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AhwBna.hashCode()) * 31) + this.DbNXlk.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.isConnected.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GrafanaPositionItem(instType=" + this.KWHzl + ", instId=" + this.OLrzqt + ", posId=" + this.AhwBna + ", tradeId=" + this.DbNXlk + ", availPos=" + this.AEQbTJ + ", pos=" + this.djBIcL + ", posSide=" + this.gEmmrt + ", marginMode=" + this.valueOf + ", liqPx=" + this.EZpvd + ", marginRatio=" + this.AYXKKw + ", cTime=" + this.copydefault + ", uTime=" + this.isConnected + ")";
        }

        public Activity(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.AhwBna = str3;
            this.DbNXlk = str4;
            this.AEQbTJ = str5;
            this.djBIcL = str6;
            this.gEmmrt = str7;
            this.valueOf = str8;
            this.EZpvd = str9;
            this.AYXKKw = str10;
            this.copydefault = str11;
            this.isConnected = str12;
        }

        public final void OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            java.lang.String strGEmmrt = this.OLrzqt;
            if (strGEmmrt == null) {
                BizInstrument bizInstrumentEZpvd = C54515xLg.OLrzqt.AEQbTJ().EZpvd();
                strGEmmrt = C33129mqd.gEmmrt(bizInstrumentEZpvd != null ? bizInstrumentEZpvd.getInstId() : null);
            }
            map.put("application_attach", strGEmmrt);
            map.put("inst_id", this.KWHzl);
            map.put("main_start", this.AhwBna);
            map.put("launching", this.DbNXlk);
            map.put("pic_url", this.AEQbTJ);
            map.put("activity_render", this.djBIcL);
            map.put("isRunningInEmulator", this.gEmmrt);
            map.put("blockedTime", this.valueOf);
            map.put("brc20Token", this.EZpvd);
            map.put("crypto_amount", this.AYXKKw);
            map.put("code", this.copydefault);
            map.put(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, this.isConnected);
        }
    }

    /* JADX INFO: renamed from: o.xLg$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar {
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.copydefault;
            }
            if ((i & 4) != 0) {
                str3 = actionBar.OLrzqt;
            }
            if ((i & 8) != 0) {
                str4 = actionBar.KWHzl;
            }
            return actionBar.EZpvd(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new ActionBar(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GrafanaNormalCloseData(orderType=" + this.EZpvd + ", side=" + this.copydefault + ", closeSize=" + this.OLrzqt + ", closePx=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.KWHzl = str4;
        }

        public final void EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("click", this.EZpvd);
            map.put("isMemoryTampered", this.copydefault);
            map.put("debugBlockerFailed", this.OLrzqt);
            map.put("isSignedWithDebugKeys", this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.xLg$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "GrafanaBatchCloseData(batchCloseId=" + this.KWHzl + ")";
        }

        public StateListAnimator(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public final void copydefault(@NotNull java.util.Map<java.lang.String, java.lang.String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("payment_channel", this.KWHzl);
        }
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j, @NotNull Activity activity, ActionBar actionBar, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(activity, "");
        C54520xLl c54520xLl = C54520xLl.KWHzl;
        java.lang.String strAEQbTJ = activity.AEQbTJ();
        java.lang.String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
        java.lang.String strKWHzl = activity.KWHzl();
        java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("source", str3), C56390yDp.OLrzqt("is_success", java.lang.String.valueOf(z)), C56390yDp.OLrzqt("position_data", activity.toString()));
        if (!z) {
            mapDjBIcL.put("error_code", str);
            mapDjBIcL.put(EopTrackEvent.KEY_ERROR_MSG, str2);
        }
        if (actionBar != null) {
        }
        if (stateListAnimator != null) {
            mapDjBIcL.put("batch_close_data", stateListAnimator.toString());
        }
        Unit unit = Unit.INSTANCE;
        c54520xLl.AEQbTJ(new C54520xLl.Activity("system", "response", "close_position", str4, strKWHzl, mapDjBIcL));
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", "close_position_response_state");
        linkedHashMap.put("pauseTime", z ? "success" : "fail");
        linkedHashMap.put("totalTime", str2);
        linkedHashMap.put("otherTime", str);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str3);
        linkedHashMap.put("isSelinuxIntegrity", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)));
        activity.OLrzqt(linkedHashMap);
        if (actionBar != null) {
            actionBar.EZpvd(linkedHashMap);
        }
        if (stateListAnimator != null) {
            stateListAnimator.copydefault(linkedHashMap);
        }
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportClosePositionResponse: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, @NotNull java.lang.String str10) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str10, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        if (c54589xNz.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", "tpsl_entry");
        linkedHashMap.put("totalTime", str3);
        linkedHashMap.put("pauseTime", str4);
        linkedHashMap.put("otherTime", str8 == null ? "" : str8);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str9 == null ? "" : str9);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        linkedHashMap.put("main_start", C33129mqd.gEmmrt((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.wlaJM()));
        linkedHashMap.put("launching", str5);
        linkedHashMap.put("pic_url", str6);
        linkedHashMap.put("brc20Token", str7 != null ? str7 : "");
        linkedHashMap.put("activity_render", str);
        linkedHashMap.put("isRunningInEmulator", str2);
        linkedHashMap.put("blockedTime", str10);
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportTpslEntry: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        djBIcL = null;
    }

    /* JADX INFO: renamed from: o.xLg$Application */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Application {
        public final java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public java.lang.String djBIcL;
        public final java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull java.lang.String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str9, "");
            return new Application(str, str2, str3, str4, str5, str6, str7, str8, str9);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.AhwBna.hashCode();
            int iHashCode4 = this.gEmmrt.hashCode();
            int iHashCode5 = this.AEQbTJ.hashCode();
            int iHashCode6 = this.copydefault.hashCode();
            java.lang.String str = this.OLrzqt;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AYXKKw;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TpslData(errorCode=" + this.KWHzl + ", errorMsg=" + this.EZpvd + ", source=" + this.AhwBna + ", tpslEntry=" + this.gEmmrt + ", instType=" + this.AEQbTJ + ", instId=" + this.copydefault + ", attachTpslType=" + this.OLrzqt + ", tpType=" + this.AYXKKw + ", operation=" + this.djBIcL + ")";
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, java.lang.String str7, java.lang.String str8, @NotNull java.lang.String str9) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str9, "");
            this.KWHzl = str;
            this.EZpvd = str2;
            this.AhwBna = str3;
            this.gEmmrt = str4;
            this.AEQbTJ = str5;
            this.copydefault = str6;
            this.OLrzqt = str7;
            this.AYXKKw = str8;
            this.djBIcL = str9;
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", "trade_init");
        linkedHashMap.put("pauseTime", str);
        linkedHashMap.put("totalTime", str2);
        linkedHashMap.put("otherTime", str3);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, str4);
        linkedHashMap.put("blockedTime", TradeAbTestManager.copydefault.copydefault() ? "1" : "0");
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportInitTask: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", str);
        linkedHashMap.put("pauseTime", str2);
        linkedHashMap.put("totalTime", str3);
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, java.lang.String.valueOf(C54589xNz.EZpvd.EZpvd()));
        eventData.setAttrs(linkedHashMap);
        pUU.EZpvd("GrafanaHelper", "reportSyncBizNull: " + linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final java.lang.String copydefault() {
        xOW newProxyInstance;
        KLineConfigType kLineConfigTypeDTwDnp;
        xOW newProxyInstance2;
        xOW newProxyInstance3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance3 = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance3.uzCIH()) {
            linkedHashSet.add("market_close_all_confirm");
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        java.lang.String strName = null;
        linkedHashSet.add("account_" + C33129mqd.gEmmrt((interfaceC54581xNrOLrzqt2 == null || (newProxyInstance2 = interfaceC54581xNrOLrzqt2.getNewProxyInstance()) == null) ? null : newProxyInstance2.wlaJM()));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null && (newProxyInstance = interfaceC54581xNrOLrzqt3.getNewProxyInstance()) != null && (kLineConfigTypeDTwDnp = newProxyInstance.DTwDnp()) != null) {
            strName = kLineConfigTypeDTwDnp.name();
        }
        linkedHashSet.add(C33129mqd.gEmmrt(strName));
        return C33129mqd.gEmmrt(linkedHashSet);
    }

    public static /* synthetic */ void reportPositionApiRequest$default(C54515xLg c54515xLg, long j, boolean z, java.lang.String str, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        c54515xLg.copydefault(j, z, str, num);
    }

    public final void copydefault(long j, boolean z, java.lang.String str, java.lang.Integer num) {
        if (C54589xNz.EZpvd.EZpvd()) {
            return;
        }
        EventData eventData = new EventData();
        eventData.setAct("trade_order_common_monitor");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("launchTime", "monitor_position_request_status");
        linkedHashMap.put(OtcExtraKeys.TRADING_FIAT_CURRENCY_DEEPLINK, java.lang.String.valueOf(java.lang.System.currentTimeMillis() - j));
        linkedHashMap.put("launching", z ? "SUCCESS" : "FAIL");
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("pic_url", str);
        linkedHashMap.put("blockedTime", C33129mqd.gEmmrt(num));
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public static /* synthetic */ void reportError$default(C54515xLg c54515xLg, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        c54515xLg.KWHzl(str, str2, str3);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (C54586xNw.OLrzqt.EZpvd()) {
            EventData eventData = new EventData();
            eventData.setAct("trade_init_monitor");
            eventData.setAttrs(C56424yEw.djBIcL(C56390yDp.OLrzqt("launchTime", str), C56390yDp.OLrzqt("pauseTime", str2), C56390yDp.OLrzqt("pic_url", str3)));
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
    }
}
