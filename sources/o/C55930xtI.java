package o;

import com.okinc.biz.TacticsType;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.core.util.SPUtils;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.ArbitrageOrderBean;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.ContractGridVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExtendedBusinessInfo;
import com.okinc.unify_trade.biz.MarginPerCcyVo;
import com.okinc.unify_trade.biz.OrderCategory;
import com.okinc.unify_trade.biz.PriceLockerTradeBean;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.RecurringBuyDetails;
import com.okinc.unify_trade.biz.RecurringBuyDto;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.UnitDisplayVo;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BalanceDetailInfoDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.biz.subscribe.BizTradeStrategyInfo;
import com.okinc.unify_trade.biz.subscribe.StrategyHistoryListResp;
import com.okinc.unify_trade.biz.subscribe.StrategyPendingListResp;
import com.okinc.unify_trade.bot.config.ContractDcaStopConditionType;
import com.okinc.unify_trade.bot.config.ContractDcaStopLossType;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.IceBergAggressiveType;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.BotNoticeData;
import com.okinc.unify_trade.bot.data.ContractDcaSpecialData;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.SmartArbProfitsInfo;
import com.okinc.unify_trade.bot.data.SwapCoinMProfitSwitchUiModel;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import o.C55924xtC;
import o.C55959xtl;
import o.C55961xtn;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.xtI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55930xtI implements InterfaceC54501xKt<C55804xqp<java.util.List<? extends BizTradeStrategyInfo>>, java.util.ArrayList<java.lang.Object>> {
    public boolean AEQbTJ;
    public InterfaceC55876xsH EZpvd;
    public boolean KWHzl;
    public final boolean OLrzqt;
    public boolean copydefault;
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55930xtI() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z, boolean z2) {
        this.KWHzl = z;
        this.copydefault = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.AEQbTJ = z;
    }

    public C55930xtI(boolean z) {
        this.OLrzqt = z;
        this.EZpvd = C55875xsG.copydefault;
        this.djBIcL = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:197) call: o.xtI.<init>(boolean):void type: THIS */
    public /* synthetic */ C55930xtI(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC54501xKt
    public /* synthetic */ java.util.ArrayList<java.lang.Object> KWHzl(C55804xqp<java.util.List<? extends BizTradeStrategyInfo>> c55804xqp) {
        return OLrzqt((C55804xqp<java.util.List<BizTradeStrategyInfo>>) c55804xqp);
    }

    public java.util.ArrayList<java.lang.Object> OLrzqt(@NotNull C55804xqp<java.util.List<BizTradeStrategyInfo>> c55804xqp) {
        OrderCategory orderCategory;
        xOR xorCopydefault;
        java.util.List<OrderCategory> listAEQbTJ;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        BizTradeStrategyInfo bizTradeStrategyInfo = (BizTradeStrategyInfo) CollectionsKt___CollectionsKt.firstOrNull(c55804xqp.copydefault());
        int i = 0;
        if (Intrinsics.EZpvd((java.lang.Object) (bizTradeStrategyInfo != null ? bizTradeStrategyInfo.getOrderType() : null), (java.lang.Object) "iceberg")) {
            boolean zAEQbTJ = C33129mqd.AEQbTJ(C33129mqd.subS$default(C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), SPUtils.getString("ice_berg_offline_notice-" + C55697xoo.OLrzqt.gEmmrt(), ""), null, null, null, 14, null), "86400000");
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            if (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null || (listAEQbTJ = xorCopydefault.AEQbTJ()) == null) {
                orderCategory = null;
            } else {
                java.util.Iterator<T> it = listAEQbTJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) next).getStrategyType(), (java.lang.Object) "smart_iceberg")) {
                        break;
                    }
                }
                orderCategory = (OrderCategory) next;
            }
            boolean z = orderCategory != null && Intrinsics.EZpvd((java.lang.Object) orderCategory.getStrategyType(), (java.lang.Object) "smart_iceberg");
            if (zAEQbTJ && z) {
                arrayList.add(new BotNoticeData(C33070mpX.AYXKKw(C55688xof.Application.setupCustomContent)));
            }
        }
        for (java.lang.Object obj : c55804xqp.copydefault()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            BizTradeStrategyInfo bizTradeStrategyInfo2 = (BizTradeStrategyInfo) obj;
            if (C56059xvf.EZpvd.valueOf().contains(bizTradeStrategyInfo2.getOrderType())) {
                if (bizTradeStrategyInfo2.isHistoryOrder()) {
                    arrayList.add(AEQbTJ(bizTradeStrategyInfo2));
                } else if (!Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo2.getOrderType(), (java.lang.Object) "lvf_buy") && !Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo2.getOrderType(), (java.lang.Object) "lvf_sell")) {
                    arrayList.add(OLrzqt(bizTradeStrategyInfo2));
                }
            }
            i++;
        }
        java.lang.String strDjBIcL = this.KWHzl ? C56059xvf.EZpvd.djBIcL() : null;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            if (!this.KWHzl || !(obj2 instanceof TacticsData) || EZpvd((TacticsData) obj2, strDjBIcL)) {
                arrayList2.add(obj2);
            }
        }
        java.util.ArrayList<java.lang.Object> arrayList3 = new java.util.ArrayList<>();
        for (java.lang.Object obj3 : arrayList2) {
            if (this.copydefault && (obj3 instanceof TacticsData)) {
                java.lang.String orderType = ((TacticsData) obj3).getOrderType();
                if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "lvf_buy")) {
                }
            }
            arrayList3.add(obj3);
        }
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0.equals("recurring") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.equals("smart_portfolio") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(TacticsData tacticsData, java.lang.String str) {
        java.lang.String orderType = tacticsData.getOrderType();
        int iHashCode = orderType.hashCode();
        if (iHashCode != -1216369070) {
            if (iHashCode != -1086683216) {
                if (iHashCode == 1165749981) {
                }
                return Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstId(), (java.lang.Object) str);
            }
            if (orderType.equals("signal_bot")) {
                java.util.List<java.lang.String> instIds = tacticsData.getInstIds();
                return instIds != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) instIds), str);
            }
            return Intrinsics.EZpvd((java.lang.Object) tacticsData.getInstId(), (java.lang.Object) str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TacticsData AEQbTJ(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String instFamily;
        java.lang.String strStatus;
        java.lang.String str;
        java.lang.String orderType;
        java.lang.String strStatus2;
        BizInstrument suggestedInstrument$default;
        java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
        java.lang.String orderInstId = bizTradeStrategyInfo.getOrderInstId();
        java.lang.String orderCtVal = bizTradeStrategyInfo.getOrderCtVal();
        if (orderCtVal == null) {
            orderCtVal = "";
        }
        java.lang.String strEZpvd = C56033xvF.EZpvd(orderInstType, orderInstId, orderCtVal);
        java.lang.String strAhwBna = C56033xvF.AhwBna(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), bizTradeStrategyInfo.getOrderDisplayId());
        java.lang.String orderTradeQuoteCcy = bizTradeStrategyInfo.getOrderTradeQuoteCcy();
        java.lang.String str2 = (orderTradeQuoteCcy == null || orderTradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) orderTradeQuoteCcy)) ? strAhwBna : orderTradeQuoteCcy;
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String orderType2 = bizTradeStrategyInfo.getOrderType();
        java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
        java.lang.String strKWHzl = c56059xvf.KWHzl(orderType2, smartArbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList) : null, bizTradeStrategyInfo.getOrderInstType());
        java.lang.String orderType3 = bizTradeStrategyInfo.getOrderType();
        java.util.ArrayList<SmartArbListItem> smartArbList2 = bizTradeStrategyInfo.getSmartArbList();
        java.lang.String strEZpvd2 = c56059xvf.EZpvd(orderType3, smartArbList2 != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList2) : null, bizTradeStrategyInfo.getOrderInstId());
        java.lang.String orderInstFamily = bizTradeStrategyInfo.getOrderInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strKWHzl, strEZpvd2, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        java.lang.String str3 = (orderInstFamily == null || orderInstFamily.length() == 0) ? instFamily : orderInstFamily;
        C55998xuX c55998xuX = C55998xuX.copydefault;
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pairAkhnZx = c55998xuX.AkhnZx(c55998xuX.OLrzqt(bizTradeStrategyInfo));
        java.lang.String orderType4 = bizTradeStrategyInfo.getOrderType();
        java.lang.String orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
        java.lang.String orderType5 = bizTradeStrategyInfo.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType5, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType5, (java.lang.Object) "lvf_buy")) {
            strStatus = bizTradeStrategyInfo.status();
            if (strStatus == null) {
                str = "";
            }
            java.lang.String filledPercent = bizTradeStrategyInfo.getFilledPercent();
            java.lang.String strEZpvd3 = EZpvd(bizTradeStrategyInfo, true);
            TacticsType tacticsTypeUzCIH = C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType());
            java.lang.String strValueOf = valueOf(bizTradeStrategyInfo);
            java.lang.String orderLever = bizTradeStrategyInfo.getOrderLever();
            java.lang.String strOLrzqt = OLrzqt(bizTradeStrategyInfo.getOrderCTime());
            long jValueOf = C33129mqd.valueOf(bizTradeStrategyInfo.getOrderCTime());
            java.util.ArrayList arrayListConversionInsideData$default = conversionInsideData$default(this, bizTradeStrategyInfo, strEZpvd, str2, strAhwBna, strEZpvd2, strKWHzl, false, 64, null);
            orderType = bizTradeStrategyInfo.getOrderType();
            if (!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "lvf_buy")) {
                strStatus2 = bizTradeStrategyInfo.status();
                if (strStatus2 == null) {
                    strStatus2 = "";
                }
            } else {
                strStatus2 = bizTradeStrategyInfo.getOrderCancelType();
            }
            java.lang.String strKWHzl2 = KWHzl(bizTradeStrategyInfo.getOrderType(), bizTradeStrategyInfo.getErrorMsg(), bizTradeStrategyInfo.getOrderStopResult(), strEZpvd);
            java.lang.String strSubS$default = C33129mqd.subS$default(bizTradeStrategyInfo.getUTimeValue(), bizTradeStrategyInfo.getOrderCTime(), null, null, null, 14, null);
            ShareData shareDataCopydefault = copydefault((InterfaceC55847xrf) bizTradeStrategyInfo);
            java.util.List<ArbitrageOrderBean> arbitrageList = bizTradeStrategyInfo.getArbitrageList();
            java.lang.Boolean boolIsAssociate = bizTradeStrategyInfo.isAssociate();
            java.lang.String strGEmmrt = gEmmrt(bizTradeStrategyInfo);
            java.lang.String orderDirection = bizTradeStrategyInfo.getOrderDirection();
            java.lang.String orderTpTriggerPx = bizTradeStrategyInfo.getOrderTpTriggerPx();
            java.lang.String orderSlTriggerPx = bizTradeStrategyInfo.getOrderSlTriggerPx();
            java.lang.String gridTpPnlRatio = bizTradeStrategyInfo.getGridTpPnlRatio();
            java.lang.String gridSlPnlRatio = bizTradeStrategyInfo.getGridSlPnlRatio();
            java.util.ArrayList<RecurringListItem> recList = bizTradeStrategyInfo.getRecList();
            java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList = bizTradeStrategyInfo.getSmartPortfolioList();
            java.lang.String stgyInvestCcy = bizTradeStrategyInfo.getStgyInvestCcy();
            java.util.List<TacticsListButtonItem> first = pairAkhnZx.getFirst();
            java.util.List<TacticsListButtonItem> second = pairAkhnZx.getSecond();
            java.util.ArrayList<TacticsListLabelUiData> arrayListCopydefault = copydefault(bizTradeStrategyInfo, true, strEZpvd2, strKWHzl);
            java.util.List<SignParamItem> gridSignParams = bizTradeStrategyInfo.getGridSignParams();
            java.lang.String cancelTime = bizTradeStrategyInfo.getCancelTime();
            java.util.List<DcaTriggerParam> dcaTriggerParams = bizTradeStrategyInfo.getDcaTriggerParams();
            java.lang.String orderActualMarginSz = bizTradeStrategyInfo.getOrderActualMarginSz();
            java.lang.String orderExtraMarginSz = bizTradeStrategyInfo.getOrderExtraMarginSz();
            java.lang.String orderTradeNum = bizTradeStrategyInfo.getOrderTradeNum();
            java.lang.String ordCopyType = bizTradeStrategyInfo.getOrdCopyType();
            java.lang.String sharingRatio = bizTradeStrategyInfo.getSharingRatio();
            java.lang.String sourceId = bizTradeStrategyInfo.getSourceId();
            java.lang.String orderTotalAmt = bizTradeStrategyInfo.getOrderTotalAmt();
            java.lang.String orderSignalChanId = bizTradeStrategyInfo.getOrderSignalChanId();
            java.lang.String orderSignalChanName = bizTradeStrategyInfo.getOrderSignalChanName();
            java.lang.String orderFloatingPnl = bizTradeStrategyInfo.getOrderFloatingPnl();
            java.lang.String orderAvailableMargin = bizTradeStrategyInfo.getOrderAvailableMargin();
            java.lang.String orderTotalPnlRatio = bizTradeStrategyInfo.getOrderTotalPnlRatio();
            java.lang.String orderSignalCount = bizTradeStrategyInfo.getOrderSignalCount();
            java.util.ArrayList<java.lang.String> orderInstIds = bizTradeStrategyInfo.getOrderInstIds();
            boolean zSupportEarlyFill = bizTradeStrategyInfo.supportEarlyFill();
            java.lang.String orderType6 = bizTradeStrategyInfo.getOrderType();
            return new TacticsData(orderType4, orderAlgoId, strKWHzl, strEZpvd2, str, filledPercent, true, strEZpvd3, tacticsTypeUzCIH, 0, strValueOf, strOLrzqt, jValueOf, null, arrayListConversionInsideData$default, strEZpvd, strStatus2, strKWHzl2, shareDataCopydefault, arbitrageList, boolIsAssociate, strGEmmrt, orderDirection, orderTpTriggerPx, orderSlTriggerPx, gridTpPnlRatio, gridSlPnlRatio, (!Intrinsics.EZpvd((java.lang.Object) orderType6, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType6, (java.lang.Object) "lvf_buy")) ? EZpvd(bizTradeStrategyInfo) : null, recList, smartPortfolioList, stgyInvestCcy, null, first, second, arrayListCopydefault, gridSignParams, cancelTime, dcaTriggerParams, null, null, null, null, null, null, null, orderLever, orderActualMarginSz, orderExtraMarginSz, null, null, null, orderTradeNum, null, null, null, null, null, null, null, null, null, null, null, ordCopyType, sharingRatio, sourceId, null, orderInstIds, orderTotalAmt, orderSignalChanId, orderSignalChanName, orderFloatingPnl, orderAvailableMargin, orderTotalPnlRatio, orderSignalCount, zSupportEarlyFill, null, null, null, null, null, null, 0, bizTradeStrategyInfo.getOrderMaxPx(), bizTradeStrategyInfo.getOrderMinPx(), bizTradeStrategyInfo.getOrderRunType(), bizTradeStrategyInfo.getOrderGridNum(), bizTradeStrategyInfo.getTrailingUp(), bizTradeStrategyInfo.getTrailingDown(), null, bizTradeStrategyInfo.reserveFunds(), bizTradeStrategyInfo.isBasePos(), bizTradeStrategyInfo.perGridProfitRatio(), bizTradeStrategyInfo.perMinProfitRate(), bizTradeStrategyInfo.perMaxProfitRate(), bizTradeStrategyInfo.getPortfolioBalType(), bizTradeStrategyInfo.getPortfolioBalInterval(), bizTradeStrategyInfo.getPortfolioBalRatio(), bizTradeStrategyInfo.getMaxSafetyOrders(), bizTradeStrategyInfo.pxSteps(), bizTradeStrategyInfo.pxStepsMult(), bizTradeStrategyInfo.volMult(), bizTradeStrategyInfo.tpPct(), bizTradeStrategyInfo.slPct(), bizTradeStrategyInfo.getStopLessMode(), null, null, bizTradeStrategyInfo.getAutoMarginSwitch(), bizTradeStrategyInfo.getAutoMarginMaxAmount(), bizTradeStrategyInfo.extendedBusinessInfo(), str3, bizTradeStrategyInfo.getSmartArbList(), false, null, null, null, null, null, bizTradeStrategyInfo.getOrderRuleType(), null, bizTradeStrategyInfo.getOrderTotalPnl(), false, null, null, null, bizTradeStrategyInfo.getTacticsVoucherInfo(), null, null, null, false, bizTradeStrategyInfo.lastTradeExpireTime(), bizTradeStrategyInfo.lastSettlementSettledTime(), null, strSubS$default, null, false, null, null, null, bizTradeStrategyInfo.getSmartEarn(), null, null, null, null, bizTradeStrategyInfo.getArbiTotalPnlInfo(), bizTradeStrategyInfo.getLeverPrincipal(), null, null, false, null, bizTradeStrategyInfo.getOngoingProfitSnapshots(), bizTradeStrategyInfo.getLatestProfitData(), bizTradeStrategyInfo.getOrderTradeQuoteCcy(), bizTradeStrategyInfo.getSmartArbProfitsInfo(), bizTradeStrategyInfo.getBalanceDetailInfoDto(), bizTradeStrategyInfo.getBotVo(), null, null, null, null, AhwBna(bizTradeStrategyInfo), bizTradeStrategyInfo.getRecurringBuyDetails(), -2147474944, 2146901952, 34074628, -557906432, -264439853, 0, null);
        }
        strStatus = bizTradeStrategyInfo.getOrderState();
        str = strStatus;
        java.lang.String filledPercent2 = bizTradeStrategyInfo.getFilledPercent();
        java.lang.String strEZpvd32 = EZpvd(bizTradeStrategyInfo, true);
        TacticsType tacticsTypeUzCIH2 = C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType());
        java.lang.String strValueOf2 = valueOf(bizTradeStrategyInfo);
        java.lang.String orderLever2 = bizTradeStrategyInfo.getOrderLever();
        java.lang.String strOLrzqt2 = OLrzqt(bizTradeStrategyInfo.getOrderCTime());
        long jValueOf2 = C33129mqd.valueOf(bizTradeStrategyInfo.getOrderCTime());
        java.util.ArrayList arrayListConversionInsideData$default2 = conversionInsideData$default(this, bizTradeStrategyInfo, strEZpvd, str2, strAhwBna, strEZpvd2, strKWHzl, false, 64, null);
        orderType = bizTradeStrategyInfo.getOrderType();
        if (!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "lvf_sell")) {
            strStatus2 = bizTradeStrategyInfo.status();
            if (strStatus2 == null) {
            }
        }
        java.lang.String strKWHzl22 = KWHzl(bizTradeStrategyInfo.getOrderType(), bizTradeStrategyInfo.getErrorMsg(), bizTradeStrategyInfo.getOrderStopResult(), strEZpvd);
        java.lang.String strSubS$default2 = C33129mqd.subS$default(bizTradeStrategyInfo.getUTimeValue(), bizTradeStrategyInfo.getOrderCTime(), null, null, null, 14, null);
        ShareData shareDataCopydefault2 = copydefault((InterfaceC55847xrf) bizTradeStrategyInfo);
        java.util.List<ArbitrageOrderBean> arbitrageList2 = bizTradeStrategyInfo.getArbitrageList();
        java.lang.Boolean boolIsAssociate2 = bizTradeStrategyInfo.isAssociate();
        java.lang.String strGEmmrt2 = gEmmrt(bizTradeStrategyInfo);
        java.lang.String orderDirection2 = bizTradeStrategyInfo.getOrderDirection();
        java.lang.String orderTpTriggerPx2 = bizTradeStrategyInfo.getOrderTpTriggerPx();
        java.lang.String orderSlTriggerPx2 = bizTradeStrategyInfo.getOrderSlTriggerPx();
        java.lang.String gridTpPnlRatio2 = bizTradeStrategyInfo.getGridTpPnlRatio();
        java.lang.String gridSlPnlRatio2 = bizTradeStrategyInfo.getGridSlPnlRatio();
        java.util.ArrayList<RecurringListItem> recList2 = bizTradeStrategyInfo.getRecList();
        java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList2 = bizTradeStrategyInfo.getSmartPortfolioList();
        java.lang.String stgyInvestCcy2 = bizTradeStrategyInfo.getStgyInvestCcy();
        java.util.List<TacticsListButtonItem> first2 = pairAkhnZx.getFirst();
        java.util.List<TacticsListButtonItem> second2 = pairAkhnZx.getSecond();
        java.util.ArrayList<TacticsListLabelUiData> arrayListCopydefault2 = copydefault(bizTradeStrategyInfo, true, strEZpvd2, strKWHzl);
        java.util.List<SignParamItem> gridSignParams2 = bizTradeStrategyInfo.getGridSignParams();
        java.lang.String cancelTime2 = bizTradeStrategyInfo.getCancelTime();
        java.util.List<DcaTriggerParam> dcaTriggerParams2 = bizTradeStrategyInfo.getDcaTriggerParams();
        java.lang.String orderActualMarginSz2 = bizTradeStrategyInfo.getOrderActualMarginSz();
        java.lang.String orderExtraMarginSz2 = bizTradeStrategyInfo.getOrderExtraMarginSz();
        java.lang.String orderTradeNum2 = bizTradeStrategyInfo.getOrderTradeNum();
        java.lang.String ordCopyType2 = bizTradeStrategyInfo.getOrdCopyType();
        java.lang.String sharingRatio2 = bizTradeStrategyInfo.getSharingRatio();
        java.lang.String sourceId2 = bizTradeStrategyInfo.getSourceId();
        java.lang.String orderTotalAmt2 = bizTradeStrategyInfo.getOrderTotalAmt();
        java.lang.String orderSignalChanId2 = bizTradeStrategyInfo.getOrderSignalChanId();
        java.lang.String orderSignalChanName2 = bizTradeStrategyInfo.getOrderSignalChanName();
        java.lang.String orderFloatingPnl2 = bizTradeStrategyInfo.getOrderFloatingPnl();
        java.lang.String orderAvailableMargin2 = bizTradeStrategyInfo.getOrderAvailableMargin();
        java.lang.String orderTotalPnlRatio2 = bizTradeStrategyInfo.getOrderTotalPnlRatio();
        java.lang.String orderSignalCount2 = bizTradeStrategyInfo.getOrderSignalCount();
        java.util.ArrayList<java.lang.String> orderInstIds2 = bizTradeStrategyInfo.getOrderInstIds();
        boolean zSupportEarlyFill2 = bizTradeStrategyInfo.supportEarlyFill();
        java.lang.String orderType62 = bizTradeStrategyInfo.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType62, (java.lang.Object) "lvf_sell")) {
        }
        return new TacticsData(orderType4, orderAlgoId, strKWHzl, strEZpvd2, str, filledPercent2, true, strEZpvd32, tacticsTypeUzCIH2, 0, strValueOf2, strOLrzqt2, jValueOf2, null, arrayListConversionInsideData$default2, strEZpvd, strStatus2, strKWHzl22, shareDataCopydefault2, arbitrageList2, boolIsAssociate2, strGEmmrt2, orderDirection2, orderTpTriggerPx2, orderSlTriggerPx2, gridTpPnlRatio2, gridSlPnlRatio2, (!Intrinsics.EZpvd((java.lang.Object) orderType62, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType62, (java.lang.Object) "lvf_buy")) ? EZpvd(bizTradeStrategyInfo) : null, recList2, smartPortfolioList2, stgyInvestCcy2, null, first2, second2, arrayListCopydefault2, gridSignParams2, cancelTime2, dcaTriggerParams2, null, null, null, null, null, null, null, orderLever2, orderActualMarginSz2, orderExtraMarginSz2, null, null, null, orderTradeNum2, null, null, null, null, null, null, null, null, null, null, null, ordCopyType2, sharingRatio2, sourceId2, null, orderInstIds2, orderTotalAmt2, orderSignalChanId2, orderSignalChanName2, orderFloatingPnl2, orderAvailableMargin2, orderTotalPnlRatio2, orderSignalCount2, zSupportEarlyFill2, null, null, null, null, null, null, 0, bizTradeStrategyInfo.getOrderMaxPx(), bizTradeStrategyInfo.getOrderMinPx(), bizTradeStrategyInfo.getOrderRunType(), bizTradeStrategyInfo.getOrderGridNum(), bizTradeStrategyInfo.getTrailingUp(), bizTradeStrategyInfo.getTrailingDown(), null, bizTradeStrategyInfo.reserveFunds(), bizTradeStrategyInfo.isBasePos(), bizTradeStrategyInfo.perGridProfitRatio(), bizTradeStrategyInfo.perMinProfitRate(), bizTradeStrategyInfo.perMaxProfitRate(), bizTradeStrategyInfo.getPortfolioBalType(), bizTradeStrategyInfo.getPortfolioBalInterval(), bizTradeStrategyInfo.getPortfolioBalRatio(), bizTradeStrategyInfo.getMaxSafetyOrders(), bizTradeStrategyInfo.pxSteps(), bizTradeStrategyInfo.pxStepsMult(), bizTradeStrategyInfo.volMult(), bizTradeStrategyInfo.tpPct(), bizTradeStrategyInfo.slPct(), bizTradeStrategyInfo.getStopLessMode(), null, null, bizTradeStrategyInfo.getAutoMarginSwitch(), bizTradeStrategyInfo.getAutoMarginMaxAmount(), bizTradeStrategyInfo.extendedBusinessInfo(), str3, bizTradeStrategyInfo.getSmartArbList(), false, null, null, null, null, null, bizTradeStrategyInfo.getOrderRuleType(), null, bizTradeStrategyInfo.getOrderTotalPnl(), false, null, null, null, bizTradeStrategyInfo.getTacticsVoucherInfo(), null, null, null, false, bizTradeStrategyInfo.lastTradeExpireTime(), bizTradeStrategyInfo.lastSettlementSettledTime(), null, strSubS$default2, null, false, null, null, null, bizTradeStrategyInfo.getSmartEarn(), null, null, null, null, bizTradeStrategyInfo.getArbiTotalPnlInfo(), bizTradeStrategyInfo.getLeverPrincipal(), null, null, false, null, bizTradeStrategyInfo.getOngoingProfitSnapshots(), bizTradeStrategyInfo.getLatestProfitData(), bizTradeStrategyInfo.getOrderTradeQuoteCcy(), bizTradeStrategyInfo.getSmartArbProfitsInfo(), bizTradeStrategyInfo.getBalanceDetailInfoDto(), bizTradeStrategyInfo.getBotVo(), null, null, null, null, AhwBna(bizTradeStrategyInfo), bizTradeStrategyInfo.getRecurringBuyDetails(), -2147474944, 2146901952, 34074628, -557906432, -264439853, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TacticsData OLrzqt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String instFamily;
        java.lang.String strStatus;
        java.lang.String str;
        BotVo botVo;
        boolean z;
        TpSlTriggerParamReqResp orderTpSlTriggerParam;
        TpSlTriggerParam tpSlTriggerParam;
        java.lang.String dcdBotState;
        java.lang.String strStatus2;
        java.util.ArrayList<java.lang.String> forbiddenFunctions;
        java.util.ArrayList<java.lang.String> hiddenFeaturesData;
        BacktestDto backtest;
        BacktestDto backtest2;
        BizInstrument suggestedInstrument$default;
        java.lang.String strEZpvd = C56033xvF.EZpvd(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), "");
        java.lang.String strAhwBna = C56033xvF.AhwBna(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), bizTradeStrategyInfo.getOrderDisplayId());
        java.lang.String orderTradeQuoteCcy = bizTradeStrategyInfo.getOrderTradeQuoteCcy();
        java.lang.String str2 = (orderTradeQuoteCcy == null || orderTradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) orderTradeQuoteCcy)) ? strAhwBna : orderTradeQuoteCcy;
        C56059xvf c56059xvf = C56059xvf.EZpvd;
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
        java.lang.String strKWHzl = c56059xvf.KWHzl(orderType, smartArbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList) : null, bizTradeStrategyInfo.getOrderInstType());
        java.lang.String orderType2 = bizTradeStrategyInfo.getOrderType();
        java.util.ArrayList<SmartArbListItem> smartArbList2 = bizTradeStrategyInfo.getSmartArbList();
        java.lang.String strEZpvd2 = c56059xvf.EZpvd(orderType2, smartArbList2 != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList2) : null, bizTradeStrategyInfo.getOrderInstId());
        java.lang.String orderInstFamily = bizTradeStrategyInfo.getOrderInstFamily();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strKWHzl, strEZpvd2, null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        java.lang.String str3 = (orderInstFamily == null || orderInstFamily.length() == 0) ? instFamily : orderInstFamily;
        ContractDcaSpecialData contractDcaSpecialData = new ContractDcaSpecialData((java.lang.String) null, 1, (DefaultConstructorMarker) null);
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "contract_dca")) {
            contractDcaSpecialData.setAvgPx(C33129mqd.valueOf(bizTradeStrategyInfo.getAvgPrice(), 0) ? "--" : bizTradeStrategyInfo.getAvgPrice());
        }
        C55998xuX c55998xuX = C55998xuX.copydefault;
        kotlin.Pair<java.util.List<TacticsListButtonItem>, java.util.List<TacticsListButtonItem>> pairAkhnZx = c55998xuX.AkhnZx(c55998xuX.OLrzqt(bizTradeStrategyInfo));
        java.lang.String orderType3 = bizTradeStrategyInfo.getOrderType();
        java.lang.String orderAlgoId = bizTradeStrategyInfo.getOrderAlgoId();
        java.lang.String orderType4 = bizTradeStrategyInfo.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType4, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType4, (java.lang.Object) "lvf_buy")) {
            strStatus = bizTradeStrategyInfo.status();
            if (strStatus == null) {
                str = "";
            }
            java.lang.String filledPercent = bizTradeStrategyInfo.getFilledPercent();
            botVo = bizTradeStrategyInfo.getBotVo();
            if (((botVo != null || (backtest2 = botVo.getBacktest()) == null) ? null : backtest2.getStatus()) == BotStatus.Completed) {
                z = true;
            } else {
                BotVo botVo2 = bizTradeStrategyInfo.getBotVo();
                if (((botVo2 == null || (backtest = botVo2.getBacktest()) == null) ? null : backtest.getStatus()) != BotStatus.Failed) {
                    z = false;
                }
            }
            java.lang.String tvTitle$default = getTvTitle$default(this, bizTradeStrategyInfo, false, 2, null);
            TacticsType tacticsTypeUzCIH = C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType());
            java.lang.String strValueOf = valueOf(bizTradeStrategyInfo);
            java.lang.String strOLrzqt = OLrzqt(bizTradeStrategyInfo.getOrderCTime());
            long jValueOf = C33129mqd.valueOf(bizTradeStrategyInfo.getOrderCTime());
            java.lang.String strKWHzl2 = KWHzl(bizTradeStrategyInfo);
            java.util.ArrayList arrayListConversionInsideData$default = conversionInsideData$default(this, bizTradeStrategyInfo, strEZpvd, str2, strAhwBna, strEZpvd2, strKWHzl, false, 64, null);
            ShareData shareDataCopydefault = copydefault((InterfaceC55847xrf) bizTradeStrategyInfo);
            java.util.List<ArbitrageOrderBean> arbitrageList = bizTradeStrategyInfo.getArbitrageList();
            java.lang.Boolean boolIsAssociate = bizTradeStrategyInfo.isAssociate();
            java.lang.String strGEmmrt = gEmmrt(bizTradeStrategyInfo);
            java.lang.String orderDirection = bizTradeStrategyInfo.getOrderDirection();
            java.lang.String orderTpTriggerPx = bizTradeStrategyInfo.getOrderTpTriggerPx();
            java.lang.String orderSlTriggerPx = bizTradeStrategyInfo.getOrderSlTriggerPx();
            orderTpSlTriggerParam = bizTradeStrategyInfo.getOrderTpSlTriggerParam();
            if (orderTpSlTriggerParam != null || (tpSlTriggerParam = C55765xqC.OLrzqt(orderTpSlTriggerParam)) == null) {
                tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
            }
            TpSlTriggerParam tpSlTriggerParam2 = tpSlTriggerParam;
            java.lang.String gridTpPnlRatio = bizTradeStrategyInfo.getGridTpPnlRatio();
            java.lang.String gridSlPnlRatio = bizTradeStrategyInfo.getGridSlPnlRatio();
            java.util.ArrayList<RecurringListItem> recList = bizTradeStrategyInfo.getRecList();
            java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList = bizTradeStrategyInfo.getSmartPortfolioList();
            java.lang.String stgyInvestCcy = bizTradeStrategyInfo.getStgyInvestCcy();
            java.lang.String orderInvestment = bizTradeStrategyInfo.getOrderInvestment();
            java.util.List<TacticsListButtonItem> first = pairAkhnZx.getFirst();
            java.util.List<TacticsListButtonItem> second = pairAkhnZx.getSecond();
            java.lang.String gridState = bizTradeStrategyInfo.getGridState();
            dcdBotState = bizTradeStrategyInfo.getDcdBotState();
            if (dcdBotState.length() == 0) {
                dcdBotState = bizTradeStrategyInfo.status();
            }
            java.lang.String str4 = dcdBotState != null ? "" : dcdBotState;
            java.lang.String profitValue = bizTradeStrategyInfo.getProfitValue();
            java.lang.String orderSymbolsNumber = bizTradeStrategyInfo.getOrderSymbolsNumber();
            java.util.ArrayList<TacticsListLabelUiData> arrayListCopydefault = copydefault(bizTradeStrategyInfo, false, strEZpvd2, strKWHzl);
            java.util.List<SignParamItem> gridSignParams = bizTradeStrategyInfo.getGridSignParams();
            java.lang.String cancelTime = bizTradeStrategyInfo.getCancelTime();
            java.util.List<DcaTriggerParam> dcaTriggerParams = bizTradeStrategyInfo.getDcaTriggerParams();
            java.lang.String strAddS$default = C33129mqd.addS$default(bizTradeStrategyInfo.getCompleteCycles(), 1, null, null, null, 14, null);
            java.lang.String stopBotType = bizTradeStrategyInfo.getStopBotType();
            java.lang.String tpPrice = bizTradeStrategyInfo.getTpPrice();
            java.lang.String slPrice = bizTradeStrategyInfo.getSlPrice();
            java.lang.String tpRange = bizTradeStrategyInfo.getTpRange();
            java.lang.String orderLever = bizTradeStrategyInfo.getOrderLever();
            java.lang.String orderActualMarginSz = bizTradeStrategyInfo.getOrderActualMarginSz();
            java.lang.String orderExtraMarginSz = bizTradeStrategyInfo.getOrderExtraMarginSz();
            java.lang.String orderLiqPx = bizTradeStrategyInfo.getOrderLiqPx();
            java.lang.String orderTradeNum = bizTradeStrategyInfo.getOrderTradeNum();
            java.lang.String orderPxSpread = bizTradeStrategyInfo.getOrderPxSpread();
            java.lang.String orderPxVar = bizTradeStrategyInfo.getOrderPxVar();
            java.lang.String orderPxLimit = bizTradeStrategyInfo.getOrderPxLimit();
            java.lang.String orderTimeInterval = bizTradeStrategyInfo.getOrderTimeInterval();
            java.lang.String orderSzLimit = bizTradeStrategyInfo.getOrderSzLimit();
            java.lang.String orderSz = bizTradeStrategyInfo.getOrderSz();
            java.lang.String orderSide = bizTradeStrategyInfo.getOrderSide();
            java.lang.String orderPosSide = bizTradeStrategyInfo.getOrderPosSide();
            java.lang.String orderTdMode = bizTradeStrategyInfo.getOrderTdMode();
            java.lang.String orderReduceOnly = bizTradeStrategyInfo.getOrderReduceOnly();
            java.lang.String orderCcy = bizTradeStrategyInfo.getOrderCcy();
            java.lang.String ordCopyType = bizTradeStrategyInfo.getOrdCopyType();
            java.lang.String sharingRatio = bizTradeStrategyInfo.getSharingRatio();
            java.lang.String sourceId = bizTradeStrategyInfo.getSourceId();
            java.lang.String orderMktCap = bizTradeStrategyInfo.getOrderMktCap();
            java.lang.String orderTotalAmt = bizTradeStrategyInfo.getOrderTotalAmt();
            java.lang.String orderSignalChanId = bizTradeStrategyInfo.getOrderSignalChanId();
            java.lang.String orderSignalChanName = bizTradeStrategyInfo.getOrderSignalChanName();
            java.lang.String orderFloatingPnl = bizTradeStrategyInfo.getOrderFloatingPnl();
            java.lang.String orderAvailableMargin = bizTradeStrategyInfo.getOrderAvailableMargin();
            java.lang.String orderTotalPnlRatio = bizTradeStrategyInfo.getOrderTotalPnlRatio();
            java.lang.String orderSignalCount = bizTradeStrategyInfo.getOrderSignalCount();
            java.util.ArrayList<java.lang.String> orderInstIds = bizTradeStrategyInfo.getOrderInstIds();
            java.lang.String orderType5 = bizTradeStrategyInfo.getOrderType();
            java.lang.String str5 = ((!Intrinsics.EZpvd((java.lang.Object) orderType5, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType5, (java.lang.Object) "lvf_buy")) && (strStatus2 = bizTradeStrategyInfo.status()) != null) ? strStatus2 : "";
            boolean zSupportEarlyFill = bizTradeStrategyInfo.supportEarlyFill();
            java.lang.String orderType6 = bizTradeStrategyInfo.getOrderType();
            PriceLockerTradeBean priceLockerTradeBeanEZpvd = (!Intrinsics.EZpvd((java.lang.Object) orderType6, (java.lang.Object) "lvf_sell") || Intrinsics.EZpvd((java.lang.Object) orderType6, (java.lang.Object) "lvf_buy")) ? EZpvd(bizTradeStrategyInfo) : null;
            java.lang.String orderMinPx = bizTradeStrategyInfo.getOrderMinPx();
            java.lang.String orderMaxPx = bizTradeStrategyInfo.getOrderMaxPx();
            java.lang.String orderRunType = bizTradeStrategyInfo.getOrderRunType();
            java.lang.String orderGridNum = bizTradeStrategyInfo.getOrderGridNum();
            TrailingConfig trailingUp = bizTradeStrategyInfo.getTrailingUp();
            TrailingConfig trailingDown = bizTradeStrategyInfo.getTrailingDown();
            java.lang.String mTrailingDownFund = bizTradeStrategyInfo.getMTrailingDownFund();
            java.lang.Boolean boolReserveFunds = bizTradeStrategyInfo.reserveFunds();
            boolean zIsBasePos = bizTradeStrategyInfo.isBasePos();
            java.lang.String strPerGridProfitRatio = bizTradeStrategyInfo.perGridProfitRatio();
            java.lang.String strPerMinProfitRate = bizTradeStrategyInfo.perMinProfitRate();
            java.lang.String strPerMaxProfitRate = bizTradeStrategyInfo.perMaxProfitRate();
            java.lang.String portfolioBalType = bizTradeStrategyInfo.getPortfolioBalType();
            java.lang.String portfolioBalInterval = bizTradeStrategyInfo.getPortfolioBalInterval();
            java.lang.String portfolioBalRatio = bizTradeStrategyInfo.getPortfolioBalRatio();
            java.lang.String maxSafetyOrders = bizTradeStrategyInfo.getMaxSafetyOrders();
            java.lang.String strPxSteps = bizTradeStrategyInfo.pxSteps();
            java.lang.String strPxStepsMult = bizTradeStrategyInfo.pxStepsMult();
            java.lang.String strVolMult = bizTradeStrategyInfo.volMult();
            java.lang.String strTpPct = bizTradeStrategyInfo.tpPct();
            java.lang.String strSlPct = bizTradeStrategyInfo.slPct();
            java.lang.String stopLessMode = bizTradeStrategyInfo.getStopLessMode();
            boolean autoMarginSwitch = bizTradeStrategyInfo.getAutoMarginSwitch();
            java.lang.String autoMarginMaxAmount = bizTradeStrategyInfo.getAutoMarginMaxAmount();
            ExtendedBusinessInfo extendedBusinessInfo = bizTradeStrategyInfo.extendedBusinessInfo();
            boolean zIsOutOfRange = bizTradeStrategyInfo.isOutOfRange();
            java.lang.String strSourceCcy = bizTradeStrategyInfo.sourceCcy();
            java.lang.String strSourceCcySz = bizTradeStrategyInfo.sourceCcySz();
            java.lang.String strCurBaseSz = bizTradeStrategyInfo.curBaseSz();
            java.lang.String strCurQuoteSz = bizTradeStrategyInfo.curQuoteSz();
            java.lang.String strIsNeedPostWarning = bizTradeStrategyInfo.isNeedPostWarning();
            java.lang.Boolean boolIsBorrowMode = bizTradeStrategyInfo.isBorrowMode();
            java.lang.String orderTotalPnl = bizTradeStrategyInfo.getOrderTotalPnl();
            boolean zIsShowTWapTips = bizTradeStrategyInfo.isShowTWapTips();
            java.util.List<java.lang.Integer> orderTags = bizTradeStrategyInfo.getOrderTags();
            EntrySignalOrderAmtParam signalAmtParam = bizTradeStrategyInfo.getSignalAmtParam();
            ExitSignalOrderAmtParam signalBotStopParam = bizTradeStrategyInfo.getSignalBotStopParam();
            TacticsVoucherInfo tacticsVoucherInfo = bizTradeStrategyInfo.getTacticsVoucherInfo();
            forbiddenFunctions = bizTradeStrategyInfo.getForbiddenFunctions();
            if (forbiddenFunctions == null) {
                forbiddenFunctions = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.String> arrayList = forbiddenFunctions;
            boolean reinvestmentInfo = bizTradeStrategyInfo.getReinvestmentInfo();
            hiddenFeaturesData = bizTradeStrategyInfo.getHiddenFeaturesData();
            if (hiddenFeaturesData == null) {
                hiddenFeaturesData = new java.util.ArrayList<>();
            }
            return new TacticsData(orderType3, orderAlgoId, strKWHzl, strEZpvd2, str, filledPercent, z, tvTitle$default, tacticsTypeUzCIH, 0, strValueOf, strOLrzqt, jValueOf, strKWHzl2, arrayListConversionInsideData$default, strEZpvd, str5, null, shareDataCopydefault, arbitrageList, boolIsAssociate, strGEmmrt, orderDirection, orderTpTriggerPx, orderSlTriggerPx, gridTpPnlRatio, gridSlPnlRatio, priceLockerTradeBeanEZpvd, recList, smartPortfolioList, stgyInvestCcy, null, first, second, arrayListCopydefault, gridSignParams, cancelTime, dcaTriggerParams, strAddS$default, stopBotType, tpPrice, slPrice, tpSlTriggerParam2, tpRange, gridState, orderLever, orderActualMarginSz, orderExtraMarginSz, orderLiqPx, null, null, orderTradeNum, orderPxSpread, orderPxVar, orderPxLimit, orderTimeInterval, orderSzLimit, orderSz, orderSide, orderPosSide, orderTdMode, orderReduceOnly, orderCcy, ordCopyType, sharingRatio, sourceId, orderMktCap, orderInstIds, orderTotalAmt, orderSignalChanId, orderSignalChanName, orderFloatingPnl, orderAvailableMargin, orderTotalPnlRatio, orderSignalCount, zSupportEarlyFill, null, null, null, null, profitValue, orderSymbolsNumber, 0, orderMaxPx, orderMinPx, orderRunType, orderGridNum, trailingUp, trailingDown, mTrailingDownFund, boolReserveFunds, zIsBasePos, strPerGridProfitRatio, strPerMinProfitRate, strPerMaxProfitRate, portfolioBalType, portfolioBalInterval, portfolioBalRatio, maxSafetyOrders, strPxSteps, strPxStepsMult, strVolMult, strTpPct, strSlPct, stopLessMode, null, null, autoMarginSwitch, autoMarginMaxAmount, extendedBusinessInfo, str3, bizTradeStrategyInfo.getSmartArbList(), zIsOutOfRange, strSourceCcy, strSourceCcySz, strCurQuoteSz, strCurBaseSz, strIsNeedPostWarning, null, boolIsBorrowMode, orderTotalPnl, zIsShowTWapTips, orderTags, signalAmtParam, signalBotStopParam, tacticsVoucherInfo, arrayList, hiddenFeaturesData, str4, reinvestmentInfo, bizTradeStrategyInfo.lastTradeExpireTime(), bizTradeStrategyInfo.lastSettlementSettledTime(), null, C33129mqd.subS$default(bizTradeStrategyInfo.getOrderPTime(), bizTradeStrategyInfo.getOrderCTime(), null, null, null, 14, null), bizTradeStrategyInfo.getArbStakingError(), bizTradeStrategyInfo.isArbitrageWithStaking(), null, null, null, bizTradeStrategyInfo.getSmartEarn(), null, null, orderInvestment, null, bizTradeStrategyInfo.getArbiTotalPnlInfo(), bizTradeStrategyInfo.getLeverPrincipal(), contractDcaSpecialData, bizTradeStrategyInfo.getArbiHighestApyPeriod(), bizTradeStrategyInfo.getArbiDisplayMinPaybackDays(), bizTradeStrategyInfo.getArbiFundingFeeApyList(), bizTradeStrategyInfo.getOngoingProfitSnapshots(), bizTradeStrategyInfo.getLatestProfitData(), bizTradeStrategyInfo.getOrderTradeQuoteCcy(), bizTradeStrategyInfo.getSmartArbProfitsInfo(), bizTradeStrategyInfo.getBalanceDetailInfoDto(), bizTradeStrategyInfo.getBotVo(), null, bizTradeStrategyInfo.getDcaInitOrdAmt(), bizTradeStrategyInfo.getDcaSafetyOrdAmt(), bizTradeStrategyInfo.getOrderEffectiveEditParametersDetails(), AhwBna(bizTradeStrategyInfo), bizTradeStrategyInfo.getRecurringBuyDetails(), -2147352064, 393216, 323584, 4195840, 268482320, 0, null);
        }
        strStatus = bizTradeStrategyInfo.getOrderState();
        str = strStatus;
        java.lang.String filledPercent2 = bizTradeStrategyInfo.getFilledPercent();
        botVo = bizTradeStrategyInfo.getBotVo();
        if (((botVo != null || (backtest2 = botVo.getBacktest()) == null) ? null : backtest2.getStatus()) == BotStatus.Completed) {
        }
        java.lang.String tvTitle$default2 = getTvTitle$default(this, bizTradeStrategyInfo, false, 2, null);
        TacticsType tacticsTypeUzCIH2 = C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType());
        java.lang.String strValueOf2 = valueOf(bizTradeStrategyInfo);
        java.lang.String strOLrzqt2 = OLrzqt(bizTradeStrategyInfo.getOrderCTime());
        long jValueOf2 = C33129mqd.valueOf(bizTradeStrategyInfo.getOrderCTime());
        java.lang.String strKWHzl22 = KWHzl(bizTradeStrategyInfo);
        java.util.ArrayList arrayListConversionInsideData$default2 = conversionInsideData$default(this, bizTradeStrategyInfo, strEZpvd, str2, strAhwBna, strEZpvd2, strKWHzl, false, 64, null);
        ShareData shareDataCopydefault2 = copydefault((InterfaceC55847xrf) bizTradeStrategyInfo);
        java.util.List<ArbitrageOrderBean> arbitrageList2 = bizTradeStrategyInfo.getArbitrageList();
        java.lang.Boolean boolIsAssociate2 = bizTradeStrategyInfo.isAssociate();
        java.lang.String strGEmmrt2 = gEmmrt(bizTradeStrategyInfo);
        java.lang.String orderDirection2 = bizTradeStrategyInfo.getOrderDirection();
        java.lang.String orderTpTriggerPx2 = bizTradeStrategyInfo.getOrderTpTriggerPx();
        java.lang.String orderSlTriggerPx2 = bizTradeStrategyInfo.getOrderSlTriggerPx();
        orderTpSlTriggerParam = bizTradeStrategyInfo.getOrderTpSlTriggerParam();
        if (orderTpSlTriggerParam != null) {
            tpSlTriggerParam = new TpSlTriggerParam((java.lang.String) null, (java.lang.String) null, (TpSLTriggerItem) null, (TpSLTriggerItem) null, 15, (DefaultConstructorMarker) null);
        }
        TpSlTriggerParam tpSlTriggerParam22 = tpSlTriggerParam;
        java.lang.String gridTpPnlRatio2 = bizTradeStrategyInfo.getGridTpPnlRatio();
        java.lang.String gridSlPnlRatio2 = bizTradeStrategyInfo.getGridSlPnlRatio();
        java.util.ArrayList<RecurringListItem> recList2 = bizTradeStrategyInfo.getRecList();
        java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList2 = bizTradeStrategyInfo.getSmartPortfolioList();
        java.lang.String stgyInvestCcy2 = bizTradeStrategyInfo.getStgyInvestCcy();
        java.lang.String orderInvestment2 = bizTradeStrategyInfo.getOrderInvestment();
        java.util.List<TacticsListButtonItem> first2 = pairAkhnZx.getFirst();
        java.util.List<TacticsListButtonItem> second2 = pairAkhnZx.getSecond();
        java.lang.String gridState2 = bizTradeStrategyInfo.getGridState();
        dcdBotState = bizTradeStrategyInfo.getDcdBotState();
        if (dcdBotState.length() == 0) {
        }
        if (dcdBotState != null) {
        }
        java.lang.String profitValue2 = bizTradeStrategyInfo.getProfitValue();
        java.lang.String orderSymbolsNumber2 = bizTradeStrategyInfo.getOrderSymbolsNumber();
        java.util.ArrayList<TacticsListLabelUiData> arrayListCopydefault2 = copydefault(bizTradeStrategyInfo, false, strEZpvd2, strKWHzl);
        java.util.List<SignParamItem> gridSignParams2 = bizTradeStrategyInfo.getGridSignParams();
        java.lang.String cancelTime2 = bizTradeStrategyInfo.getCancelTime();
        java.util.List<DcaTriggerParam> dcaTriggerParams2 = bizTradeStrategyInfo.getDcaTriggerParams();
        java.lang.String strAddS$default2 = C33129mqd.addS$default(bizTradeStrategyInfo.getCompleteCycles(), 1, null, null, null, 14, null);
        java.lang.String stopBotType2 = bizTradeStrategyInfo.getStopBotType();
        java.lang.String tpPrice2 = bizTradeStrategyInfo.getTpPrice();
        java.lang.String slPrice2 = bizTradeStrategyInfo.getSlPrice();
        java.lang.String tpRange2 = bizTradeStrategyInfo.getTpRange();
        java.lang.String orderLever2 = bizTradeStrategyInfo.getOrderLever();
        java.lang.String orderActualMarginSz2 = bizTradeStrategyInfo.getOrderActualMarginSz();
        java.lang.String orderExtraMarginSz2 = bizTradeStrategyInfo.getOrderExtraMarginSz();
        java.lang.String orderLiqPx2 = bizTradeStrategyInfo.getOrderLiqPx();
        java.lang.String orderTradeNum2 = bizTradeStrategyInfo.getOrderTradeNum();
        java.lang.String orderPxSpread2 = bizTradeStrategyInfo.getOrderPxSpread();
        java.lang.String orderPxVar2 = bizTradeStrategyInfo.getOrderPxVar();
        java.lang.String orderPxLimit2 = bizTradeStrategyInfo.getOrderPxLimit();
        java.lang.String orderTimeInterval2 = bizTradeStrategyInfo.getOrderTimeInterval();
        java.lang.String orderSzLimit2 = bizTradeStrategyInfo.getOrderSzLimit();
        java.lang.String orderSz2 = bizTradeStrategyInfo.getOrderSz();
        java.lang.String orderSide2 = bizTradeStrategyInfo.getOrderSide();
        java.lang.String orderPosSide2 = bizTradeStrategyInfo.getOrderPosSide();
        java.lang.String orderTdMode2 = bizTradeStrategyInfo.getOrderTdMode();
        java.lang.String orderReduceOnly2 = bizTradeStrategyInfo.getOrderReduceOnly();
        java.lang.String orderCcy2 = bizTradeStrategyInfo.getOrderCcy();
        java.lang.String ordCopyType2 = bizTradeStrategyInfo.getOrdCopyType();
        java.lang.String sharingRatio2 = bizTradeStrategyInfo.getSharingRatio();
        java.lang.String sourceId2 = bizTradeStrategyInfo.getSourceId();
        java.lang.String orderMktCap2 = bizTradeStrategyInfo.getOrderMktCap();
        java.lang.String orderTotalAmt2 = bizTradeStrategyInfo.getOrderTotalAmt();
        java.lang.String orderSignalChanId2 = bizTradeStrategyInfo.getOrderSignalChanId();
        java.lang.String orderSignalChanName2 = bizTradeStrategyInfo.getOrderSignalChanName();
        java.lang.String orderFloatingPnl2 = bizTradeStrategyInfo.getOrderFloatingPnl();
        java.lang.String orderAvailableMargin2 = bizTradeStrategyInfo.getOrderAvailableMargin();
        java.lang.String orderTotalPnlRatio2 = bizTradeStrategyInfo.getOrderTotalPnlRatio();
        java.lang.String orderSignalCount2 = bizTradeStrategyInfo.getOrderSignalCount();
        java.util.ArrayList<java.lang.String> orderInstIds2 = bizTradeStrategyInfo.getOrderInstIds();
        java.lang.String orderType52 = bizTradeStrategyInfo.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType52, (java.lang.Object) "lvf_sell")) {
        }
        boolean zSupportEarlyFill2 = bizTradeStrategyInfo.supportEarlyFill();
        java.lang.String orderType62 = bizTradeStrategyInfo.getOrderType();
        if (Intrinsics.EZpvd((java.lang.Object) orderType62, (java.lang.Object) "lvf_sell")) {
        }
        java.lang.String orderMinPx2 = bizTradeStrategyInfo.getOrderMinPx();
        java.lang.String orderMaxPx2 = bizTradeStrategyInfo.getOrderMaxPx();
        java.lang.String orderRunType2 = bizTradeStrategyInfo.getOrderRunType();
        java.lang.String orderGridNum2 = bizTradeStrategyInfo.getOrderGridNum();
        TrailingConfig trailingUp2 = bizTradeStrategyInfo.getTrailingUp();
        TrailingConfig trailingDown2 = bizTradeStrategyInfo.getTrailingDown();
        java.lang.String mTrailingDownFund2 = bizTradeStrategyInfo.getMTrailingDownFund();
        java.lang.Boolean boolReserveFunds2 = bizTradeStrategyInfo.reserveFunds();
        boolean zIsBasePos2 = bizTradeStrategyInfo.isBasePos();
        java.lang.String strPerGridProfitRatio2 = bizTradeStrategyInfo.perGridProfitRatio();
        java.lang.String strPerMinProfitRate2 = bizTradeStrategyInfo.perMinProfitRate();
        java.lang.String strPerMaxProfitRate2 = bizTradeStrategyInfo.perMaxProfitRate();
        java.lang.String portfolioBalType2 = bizTradeStrategyInfo.getPortfolioBalType();
        java.lang.String portfolioBalInterval2 = bizTradeStrategyInfo.getPortfolioBalInterval();
        java.lang.String portfolioBalRatio2 = bizTradeStrategyInfo.getPortfolioBalRatio();
        java.lang.String maxSafetyOrders2 = bizTradeStrategyInfo.getMaxSafetyOrders();
        java.lang.String strPxSteps2 = bizTradeStrategyInfo.pxSteps();
        java.lang.String strPxStepsMult2 = bizTradeStrategyInfo.pxStepsMult();
        java.lang.String strVolMult2 = bizTradeStrategyInfo.volMult();
        java.lang.String strTpPct2 = bizTradeStrategyInfo.tpPct();
        java.lang.String strSlPct2 = bizTradeStrategyInfo.slPct();
        java.lang.String stopLessMode2 = bizTradeStrategyInfo.getStopLessMode();
        boolean autoMarginSwitch2 = bizTradeStrategyInfo.getAutoMarginSwitch();
        java.lang.String autoMarginMaxAmount2 = bizTradeStrategyInfo.getAutoMarginMaxAmount();
        ExtendedBusinessInfo extendedBusinessInfo2 = bizTradeStrategyInfo.extendedBusinessInfo();
        boolean zIsOutOfRange2 = bizTradeStrategyInfo.isOutOfRange();
        java.lang.String strSourceCcy2 = bizTradeStrategyInfo.sourceCcy();
        java.lang.String strSourceCcySz2 = bizTradeStrategyInfo.sourceCcySz();
        java.lang.String strCurBaseSz2 = bizTradeStrategyInfo.curBaseSz();
        java.lang.String strCurQuoteSz2 = bizTradeStrategyInfo.curQuoteSz();
        java.lang.String strIsNeedPostWarning2 = bizTradeStrategyInfo.isNeedPostWarning();
        java.lang.Boolean boolIsBorrowMode2 = bizTradeStrategyInfo.isBorrowMode();
        java.lang.String orderTotalPnl2 = bizTradeStrategyInfo.getOrderTotalPnl();
        boolean zIsShowTWapTips2 = bizTradeStrategyInfo.isShowTWapTips();
        java.util.List<java.lang.Integer> orderTags2 = bizTradeStrategyInfo.getOrderTags();
        EntrySignalOrderAmtParam signalAmtParam2 = bizTradeStrategyInfo.getSignalAmtParam();
        ExitSignalOrderAmtParam signalBotStopParam2 = bizTradeStrategyInfo.getSignalBotStopParam();
        TacticsVoucherInfo tacticsVoucherInfo2 = bizTradeStrategyInfo.getTacticsVoucherInfo();
        forbiddenFunctions = bizTradeStrategyInfo.getForbiddenFunctions();
        if (forbiddenFunctions == null) {
        }
        java.util.ArrayList<java.lang.String> arrayList2 = forbiddenFunctions;
        boolean reinvestmentInfo2 = bizTradeStrategyInfo.getReinvestmentInfo();
        hiddenFeaturesData = bizTradeStrategyInfo.getHiddenFeaturesData();
        if (hiddenFeaturesData == null) {
        }
        return new TacticsData(orderType3, orderAlgoId, strKWHzl, strEZpvd2, str, filledPercent2, z, tvTitle$default2, tacticsTypeUzCIH2, 0, strValueOf2, strOLrzqt2, jValueOf2, strKWHzl22, arrayListConversionInsideData$default2, strEZpvd, str5, null, shareDataCopydefault2, arbitrageList2, boolIsAssociate2, strGEmmrt2, orderDirection2, orderTpTriggerPx2, orderSlTriggerPx2, gridTpPnlRatio2, gridSlPnlRatio2, priceLockerTradeBeanEZpvd, recList2, smartPortfolioList2, stgyInvestCcy2, null, first2, second2, arrayListCopydefault2, gridSignParams2, cancelTime2, dcaTriggerParams2, strAddS$default2, stopBotType2, tpPrice2, slPrice2, tpSlTriggerParam22, tpRange2, gridState2, orderLever2, orderActualMarginSz2, orderExtraMarginSz2, orderLiqPx2, null, null, orderTradeNum2, orderPxSpread2, orderPxVar2, orderPxLimit2, orderTimeInterval2, orderSzLimit2, orderSz2, orderSide2, orderPosSide2, orderTdMode2, orderReduceOnly2, orderCcy2, ordCopyType2, sharingRatio2, sourceId2, orderMktCap2, orderInstIds2, orderTotalAmt2, orderSignalChanId2, orderSignalChanName2, orderFloatingPnl2, orderAvailableMargin2, orderTotalPnlRatio2, orderSignalCount2, zSupportEarlyFill2, null, null, null, null, profitValue2, orderSymbolsNumber2, 0, orderMaxPx2, orderMinPx2, orderRunType2, orderGridNum2, trailingUp2, trailingDown2, mTrailingDownFund2, boolReserveFunds2, zIsBasePos2, strPerGridProfitRatio2, strPerMinProfitRate2, strPerMaxProfitRate2, portfolioBalType2, portfolioBalInterval2, portfolioBalRatio2, maxSafetyOrders2, strPxSteps2, strPxStepsMult2, strVolMult2, strTpPct2, strSlPct2, stopLessMode2, null, null, autoMarginSwitch2, autoMarginMaxAmount2, extendedBusinessInfo2, str3, bizTradeStrategyInfo.getSmartArbList(), zIsOutOfRange2, strSourceCcy2, strSourceCcySz2, strCurQuoteSz2, strCurBaseSz2, strIsNeedPostWarning2, null, boolIsBorrowMode2, orderTotalPnl2, zIsShowTWapTips2, orderTags2, signalAmtParam2, signalBotStopParam2, tacticsVoucherInfo2, arrayList2, hiddenFeaturesData, str4, reinvestmentInfo2, bizTradeStrategyInfo.lastTradeExpireTime(), bizTradeStrategyInfo.lastSettlementSettledTime(), null, C33129mqd.subS$default(bizTradeStrategyInfo.getOrderPTime(), bizTradeStrategyInfo.getOrderCTime(), null, null, null, 14, null), bizTradeStrategyInfo.getArbStakingError(), bizTradeStrategyInfo.isArbitrageWithStaking(), null, null, null, bizTradeStrategyInfo.getSmartEarn(), null, null, orderInvestment2, null, bizTradeStrategyInfo.getArbiTotalPnlInfo(), bizTradeStrategyInfo.getLeverPrincipal(), contractDcaSpecialData, bizTradeStrategyInfo.getArbiHighestApyPeriod(), bizTradeStrategyInfo.getArbiDisplayMinPaybackDays(), bizTradeStrategyInfo.getArbiFundingFeeApyList(), bizTradeStrategyInfo.getOngoingProfitSnapshots(), bizTradeStrategyInfo.getLatestProfitData(), bizTradeStrategyInfo.getOrderTradeQuoteCcy(), bizTradeStrategyInfo.getSmartArbProfitsInfo(), bizTradeStrategyInfo.getBalanceDetailInfoDto(), bizTradeStrategyInfo.getBotVo(), null, bizTradeStrategyInfo.getDcaInitOrdAmt(), bizTradeStrategyInfo.getDcaSafetyOrdAmt(), bizTradeStrategyInfo.getOrderEffectiveEditParametersDetails(), AhwBna(bizTradeStrategyInfo), bizTradeStrategyInfo.getRecurringBuyDetails(), -2147352064, 393216, 323584, 4195840, 268482320, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [631=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r0.equals("contract_grid") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0.equals("smart_arbitrage") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
    
        if (r0.equals("smart_portfolio") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r0.equals("contract_dca") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        if (r0.equals("infinite_grid") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        if (r0.equals("spot_dca") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return r3.getOrderPnlRatio();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return r3.getPnlRatio();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0.equals("recurring") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.lang.String totalPnlRatio;
        if (bizTradeStrategyInfo instanceof StrategyPendingListResp) {
            StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) bizTradeStrategyInfo;
            java.lang.String orderType = strategyPendingListResp.getOrderType();
            switch (orderType.hashCode()) {
                case -1831183611:
                    break;
                case -1574173039:
                    break;
                case -1402017003:
                    break;
                case -1216369070:
                    break;
                case -1086683216:
                    if (orderType.equals("signal_bot") && (totalPnlRatio = strategyPendingListResp.getTotalPnlRatio()) != null) {
                        return totalPnlRatio;
                    }
                    break;
                case -557961837:
                    break;
                case -512749997:
                    break;
                case 3181382:
                    if (orderType.equals("grid")) {
                        return C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? strategyPendingListResp.getPnlRatioInSourceCcy() : strategyPendingListResp.getPnlRatio();
                    }
                    break;
                case 1165749981:
                    break;
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [652=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String gEmmrt(BizTradeStrategyInfo bizTradeStrategyInfo) {
        SmartArbListItem smartArbListItem;
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (!orderType.equals("spot_dca")) {
                    return "";
                }
                return C56033xvF.getCoinTitle$default(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), false, null, null, 28, null) + " " + C33070mpX.AYXKKw(C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType()).getStgyName());
            case -1402017003:
                if (!orderType.equals("contract_dca")) {
                    return "";
                }
                return C56033xvF.getCoinTitle$default(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), false, null, null, 28, null) + " " + C33070mpX.AYXKKw(C56033xvF.uzCIH(bizTradeStrategyInfo.getOrderType()).getStgyName());
            case -1216369070:
                if (!orderType.equals("smart_portfolio")) {
                    return "";
                }
                break;
            case -557961837:
                if (!orderType.equals("smart_arbitrage")) {
                    return "";
                }
                int i = C55688xof.Application.MediaBrowserCompatCustomActionResultReceiver;
                C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
                java.lang.String instFamily = (smartArbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList)) == null) ? null : smartArbListItem.getInstFamily();
                return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", c56051xvX.KWHzl(instFamily != null ? instFamily : ""))));
            case 1165749981:
                if (!orderType.equals("recurring")) {
                    return "";
                }
                break;
            case 1485620813:
                return !orderType.equals("dcd_bot") ? "" : C33069mpW.copydefault(C55688xof.Application.invokespecialgBtXYZ, C56423yEv.EZpvd(C56390yDp.OLrzqt("cryptoPair", C56033xvF.getCoinTitle$default(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), false, null, null, 28, null))));
            default:
                return "";
        }
        return bizTradeStrategyInfo.getStrategyName();
    }

    public final ShareData djBIcL(@NotNull BizTradeStrategyInfo bizTradeStrategyInfo) {
        Intrinsics.checkNotNullParameter(bizTradeStrategyInfo, "");
        return copydefault((InterfaceC55847xrf) bizTradeStrategyInfo);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xtl.ActionBar.getTitleOne$default(o.xtl$ActionBar, java.lang.String, java.lang.String, int, java.lang.Object):kotlin.Pair */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [694=6] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return new com.okinc.unify_trade.bot.data.ShareData(null, r25.getOrderPnlRatio(), null, r25.getOrderTotalPnl(), null, r0.component1(), r0.component2(), null, null, null, null, null, null, null, null, 32661, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0216, code lost:
    
        if (r2.equals("contract_dca") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021f, code lost:
    
        if (r2.equals("spot_dca") == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0222, code lost:
    
        r0 = o.C55951xtd.Companion.EZpvd(r25.getCompleteCycles());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ShareData copydefault(@NotNull InterfaceC55847xrf interfaceC55847xrf) {
        java.lang.Integer recurringTimeType;
        Intrinsics.checkNotNullParameter(interfaceC55847xrf, "");
        java.lang.String orderType = interfaceC55847xrf.getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1402017003:
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    C55924xtC.Application application = C55924xtC.Companion;
                    kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = application.copydefault(interfaceC55847xrf.getSmartPortfolioList(), interfaceC55847xrf.getStgyInvestCcy());
                    java.lang.String strComponent1 = pairCopydefault.component1();
                    java.lang.String strComponent2 = pairCopydefault.component2();
                    kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = application.EZpvd(interfaceC55847xrf.getPortfolioBalType(), interfaceC55847xrf.getPortfolioBalRatio(), interfaceC55847xrf.getPortfolioBalInterval());
                    return new ShareData(null, interfaceC55847xrf.getOrderPnlRatio(), null, interfaceC55847xrf.getOrderTotalPnl(), interfaceC55847xrf.getStgyInvestCcy(), strComponent1, strComponent2, pairEZpvd.component1(), pairEZpvd.component2(), null, null, null, null, null, null, 32261, null);
                }
                java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar = C55959xtl.Companion;
                kotlin.Pair titleOne$default = C55959xtl.ActionBar.getTitleOne$default(actionBar, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str = (java.lang.String) titleOne$default.component1();
                java.lang.String str2 = (java.lang.String) titleOne$default.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault2 = actionBar.copydefault(strAEQbTJ, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent12 = pairCopydefault2.component1();
                java.lang.String strComponent22 = pairCopydefault2.component2();
                java.lang.String strPnlRatioInSourceCcy = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy = interfaceC55847xrf.sourceCcy();
                java.lang.String str3 = (strSourceCcy != null || strSourceCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strSourceCcy)) ? strAEQbTJ : strSourceCcy;
                java.lang.String strSourceCcy2 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy, null, orderTotalPnl, str3, str, str2, strComponent12, strComponent22, null, null, null, null, null, (strSourceCcy2 != null || strSourceCcy2.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy2, 15877, null);
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    java.util.ArrayList<java.lang.String> orderInstIds = interfaceC55847xrf.getOrderInstIds();
                    return new ShareData(null, null, null, null, null, null, null, null, null, null, null, null, C56423yEv.EZpvd(C56390yDp.OLrzqt("signal_bot_share_inst_id_count", orderInstIds != null ? C33129mqd.gEmmrt(java.lang.Integer.valueOf(orderInstIds.size())) : null)), null, null, 28671, null);
                }
                java.lang.String strAEQbTJ2 = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar2 = C55959xtl.Companion;
                kotlin.Pair titleOne$default2 = C55959xtl.ActionBar.getTitleOne$default(actionBar2, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str4 = (java.lang.String) titleOne$default2.component1();
                java.lang.String str22 = (java.lang.String) titleOne$default2.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault22 = actionBar2.copydefault(strAEQbTJ2, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent122 = pairCopydefault22.component1();
                java.lang.String strComponent222 = pairCopydefault22.component2();
                java.lang.String strPnlRatioInSourceCcy2 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl2 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy3 = interfaceC55847xrf.sourceCcy();
                if (strSourceCcy3 != null) {
                }
                java.lang.String strSourceCcy22 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy2, null, orderTotalPnl2, str3, str4, str22, strComponent122, strComponent222, null, null, null, null, null, (strSourceCcy22 != null || strSourceCcy22.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy22, 15877, null);
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    return new ShareData(C55927xtF.Companion.EZpvd(interfaceC55847xrf.isHistoryOrder()), interfaceC55847xrf.isHistoryOrder() ? interfaceC55847xrf.getOrderPnlRatio() : interfaceC55847xrf.getSumApyAndStakingApy(), null, interfaceC55847xrf.isHistoryOrder() ? interfaceC55847xrf.getOrderTotalPnl() : "", null, null, null, null, null, null, null, null, null, null, null, 32756, null);
                }
                java.lang.String strAEQbTJ22 = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar22 = C55959xtl.Companion;
                kotlin.Pair titleOne$default22 = C55959xtl.ActionBar.getTitleOne$default(actionBar22, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str42 = (java.lang.String) titleOne$default22.component1();
                java.lang.String str222 = (java.lang.String) titleOne$default22.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault222 = actionBar22.copydefault(strAEQbTJ22, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent1222 = pairCopydefault222.component1();
                java.lang.String strComponent2222 = pairCopydefault222.component2();
                java.lang.String strPnlRatioInSourceCcy22 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl22 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy32 = interfaceC55847xrf.sourceCcy();
                if (strSourceCcy32 != null) {
                }
                java.lang.String strSourceCcy222 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy22, null, orderTotalPnl22, str3, str42, str222, strComponent1222, strComponent2222, null, null, null, null, null, (strSourceCcy222 != null || strSourceCcy222.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy222, 15877, null);
            case 1165749981:
                if (orderType.equals("recurring")) {
                    C55961xtn.ActionBar actionBar3 = C55961xtn.Companion;
                    kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt = actionBar3.OLrzqt(interfaceC55847xrf.getRecList(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getStgyInvestCcy());
                    java.lang.String strComponent13 = pairOLrzqt.component1();
                    java.lang.String strComponent23 = pairOLrzqt.component2();
                    RecurringBuyDetails recurringBuyDetails = interfaceC55847xrf.getRecurringBuyDetails();
                    RecurringBuyDto recurringBuyDtoAEQbTJ = recurringBuyDetails != null ? recurringBuyDetails.AEQbTJ() : null;
                    java.lang.String recPeriod = interfaceC55847xrf.getRecPeriod();
                    java.lang.String recDay = interfaceC55847xrf.getRecDay();
                    java.lang.String recTime = interfaceC55847xrf.getRecTime();
                    java.lang.String recHourly = interfaceC55847xrf.getRecHourly();
                    java.lang.String string = (recurringBuyDtoAEQbTJ == null || (recurringTimeType = recurringBuyDtoAEQbTJ.getRecurringTimeType()) == null) ? null : recurringTimeType.toString();
                    java.lang.String str5 = string == null ? "" : string;
                    java.lang.String recurringTimeMinutes = recurringBuyDtoAEQbTJ != null ? recurringBuyDtoAEQbTJ.getRecurringTimeMinutes() : null;
                    kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt2 = actionBar3.OLrzqt(recPeriod, recDay, recTime, recHourly, str5, recurringTimeMinutes == null ? "" : recurringTimeMinutes);
                    return new ShareData(null, interfaceC55847xrf.getOrderPnlRatio(), null, interfaceC55847xrf.getOrderTotalPnl(), interfaceC55847xrf.getStgyInvestCcy(), strComponent13, strComponent23, pairOLrzqt2.component1(), pairOLrzqt2.component2(), null, null, null, null, null, null, 32261, null);
                }
                java.lang.String strAEQbTJ222 = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar222 = C55959xtl.Companion;
                kotlin.Pair titleOne$default222 = C55959xtl.ActionBar.getTitleOne$default(actionBar222, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str422 = (java.lang.String) titleOne$default222.component1();
                java.lang.String str2222 = (java.lang.String) titleOne$default222.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault2222 = actionBar222.copydefault(strAEQbTJ222, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent12222 = pairCopydefault2222.component1();
                java.lang.String strComponent22222 = pairCopydefault2222.component2();
                java.lang.String strPnlRatioInSourceCcy222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy322 = interfaceC55847xrf.sourceCcy();
                if (strSourceCcy322 != null) {
                }
                java.lang.String strSourceCcy2222 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy222, null, orderTotalPnl222, str3, str422, str2222, strComponent12222, strComponent22222, null, null, null, null, null, (strSourceCcy2222 != null || strSourceCcy2222.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy2222, 15877, null);
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault3 = C55955xth.Companion.copydefault(interfaceC55847xrf.getDcdCycle());
                    return new ShareData(interfaceC55847xrf.isHistoryOrder() ? C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStubProxy) : C33070mpX.AYXKKw(C55688xof.Application.IconCompatParcelizer), interfaceC55847xrf.isHistoryOrder() ? interfaceC55847xrf.getOrderPnlRatio() : interfaceC55847xrf.getDcdArbApy(), null, interfaceC55847xrf.isHistoryOrder() ? interfaceC55847xrf.getOrderTotalPnl() : "", null, pairCopydefault3.component1(), pairCopydefault3.component2(), null, null, null, null, null, null, null, null, 32660, null);
                }
                java.lang.String strAEQbTJ2222 = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar2222 = C55959xtl.Companion;
                kotlin.Pair titleOne$default2222 = C55959xtl.ActionBar.getTitleOne$default(actionBar2222, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str4222 = (java.lang.String) titleOne$default2222.component1();
                java.lang.String str22222 = (java.lang.String) titleOne$default2222.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault22222 = actionBar2222.copydefault(strAEQbTJ2222, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent122222 = pairCopydefault22222.component1();
                java.lang.String strComponent222222 = pairCopydefault22222.component2();
                java.lang.String strPnlRatioInSourceCcy2222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl2222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy3222 = interfaceC55847xrf.sourceCcy();
                if (strSourceCcy3222 != null) {
                }
                java.lang.String strSourceCcy22222 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy2222, null, orderTotalPnl2222, str3, str4222, str22222, strComponent122222, strComponent222222, null, null, null, null, null, (strSourceCcy22222 != null || strSourceCcy22222.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy22222, 15877, null);
            default:
                java.lang.String strAEQbTJ22222 = C56033xvF.AEQbTJ(interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId());
                C55959xtl.ActionBar actionBar22222 = C55959xtl.Companion;
                kotlin.Pair titleOne$default22222 = C55959xtl.ActionBar.getTitleOne$default(actionBar22222, interfaceC55847xrf.getOrderArbitrageNum(), null, 2, null);
                java.lang.String str42222 = (java.lang.String) titleOne$default22222.component1();
                java.lang.String str222222 = (java.lang.String) titleOne$default22222.component2();
                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault222222 = actionBar22222.copydefault(strAEQbTJ22222, interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderMinPx(), interfaceC55847xrf.getOrderMaxPx());
                java.lang.String strComponent1222222 = pairCopydefault222222.component1();
                java.lang.String strComponent2222222 = pairCopydefault222222.component2();
                java.lang.String strPnlRatioInSourceCcy22222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.pnlRatioInSourceCcy() : interfaceC55847xrf.getOrderPnlRatio();
                java.lang.String orderTotalPnl22222 = !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) interfaceC55847xrf.sourceCcy()) ^ true) ? interfaceC55847xrf.totalPnlInSourceCcy() : interfaceC55847xrf.getOrderTotalPnl();
                java.lang.String strSourceCcy32222 = interfaceC55847xrf.sourceCcy();
                if (strSourceCcy32222 != null) {
                }
                java.lang.String strSourceCcy222222 = interfaceC55847xrf.sourceCcy();
                return new ShareData(null, strPnlRatioInSourceCcy22222, null, orderTotalPnl22222, str3, str42222, str222222, strComponent1222222, strComponent2222222, null, null, null, null, null, (strSourceCcy222222 != null || strSourceCcy222222.length() == 0) ? C56066xvm.EZpvd.KWHzl(interfaceC55847xrf.getOrderInstId(), interfaceC55847xrf.getOrderInstType(), interfaceC55847xrf.getTradeQuoteCcyForSpot()) : strSourceCcy222222, 15877, null);
        }
    }

    public final java.lang.String valueOf(BizTradeStrategyInfo bizTradeStrategyInfo) {
        return Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "smart_arbitrage") ? "" : C56033xvF.getBotLever$default(bizTradeStrategyInfo.getOrderLever(), false, 2, null);
    }

    public static /* synthetic */ java.lang.String getTvTitle$default(C55930xtI c55930xtI, BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c55930xtI.EZpvd(bizTradeStrategyInfo, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [827=8] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z) {
        java.lang.String strAEQbTJ;
        java.lang.String instFamily;
        SmartArbListItem smartArbListItem;
        AiBotDto ai;
        java.lang.String strGEmmrt = gEmmrt(bizTradeStrategyInfo);
        java.lang.String orderType = bizTradeStrategyInfo.getOrderType();
        java.lang.String strCopydefault = "";
        switch (orderType.hashCode()) {
            case -1831183611:
                strAEQbTJ = !orderType.equals("spot_dca") ? "Unknown" : C56033xvF.AEQbTJ(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), z, bizTradeStrategyInfo.getOrderRuleType(), bizTradeStrategyInfo.getOrderDisplayId());
                break;
            case -1574173039:
                if (!orderType.equals("infinite_grid")) {
                }
                break;
            case -1402017003:
                if (!orderType.equals("contract_dca")) {
                }
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                        java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList = bizTradeStrategyInfo.getSmartPortfolioList();
                        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(smartPortfolioList, 10));
                        java.util.Iterator<T> it = smartPortfolioList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SmartPortfolioListItem) it.next()).getCcy());
                        }
                        strAEQbTJ = C55962xto.KWHzl(arrayList, "");
                    } else {
                        strAEQbTJ = strGEmmrt;
                    }
                    break;
                }
                break;
            case -1148661171:
                if (!orderType.equals("smart_iceberg")) {
                }
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    strAEQbTJ = C56033xvF.getCoinTitleTacticsItem$default(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId(), z, null, null, 24, null);
                    break;
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    C56051xvX c56051xvX = C56051xvX.AEQbTJ;
                    java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
                    if (smartArbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList)) == null || (instFamily = smartArbListItem.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    strAEQbTJ = c56051xvX.KWHzl(instFamily);
                    break;
                }
                break;
            case -512749997:
                if (!orderType.equals("contract_grid")) {
                }
                break;
            case -392358507:
                if (orderType.equals("lvf_sell")) {
                    strAEQbTJ = bizTradeStrategyInfo.currency() + "/" + bizTradeStrategyInfo.alternativeCurrency();
                    break;
                }
                break;
            case 3181382:
                if (!orderType.equals("grid")) {
                }
                break;
            case 3573234:
                if (!orderType.equals("twap")) {
                }
                break;
            case 541516771:
                if (!orderType.equals("lvf_buy")) {
                }
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
                        java.util.ArrayList<RecurringListItem> recList = bizTradeStrategyInfo.getRecList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(recList, 10));
                        java.util.Iterator<T> it2 = recList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((RecurringListItem) it2.next()).getCcy());
                        }
                        strAEQbTJ = C55962xto.KWHzl(arrayList2, "");
                        break;
                    }
                }
                break;
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    strAEQbTJ = C56033xvF.getCoinTitle$default("SPOT", bizTradeStrategyInfo.getOrderInstId(), z, null, null, 16, null);
                    break;
                }
                break;
            case 1780188297:
                if (orderType.equals("arbitrage")) {
                    strAEQbTJ = "";
                    break;
                }
                break;
        }
        if ((Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "recurring") || Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "smart_portfolio")) && C33129mqd.OLrzqt((java.lang.CharSequence) strGEmmrt)) {
            return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strAEQbTJ).toString();
        }
        if (!Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderType(), (java.lang.Object) "ai_bot")) {
            TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(bizTradeStrategyInfo.getOrderType());
            return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) (strAEQbTJ + " " + (tacticsTypeAEQbTJ != null ? C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName()) : null))).toString();
        }
        BotVo botVo = bizTradeStrategyInfo.getBotVo();
        java.util.List<java.lang.String> instIds = (botVo == null || (ai = botVo.getAi()) == null) ? null : ai.getInstIds();
        if (instIds != null && !instIds.isEmpty()) {
            java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(instIds, ",", null, null, 3, null, new Function1() { // from class: o.xtJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C55930xtI.AEQbTJ((java.lang.String) obj);
                }
            }, 22, null);
            BotVo botVo2 = bizTradeStrategyInfo.getBotVo();
            strCopydefault = (botVo2 != null ? botVo2.getBacktest() : null) != null ? C33069mpW.copydefault(C55688xof.Application.AkhnZx, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strJoinToString$default))) : C33069mpW.copydefault(C55688xof.Application.isConnected, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strJoinToString$default)));
        }
        return strCopydefault;
    }

    public static final java.lang.CharSequence AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static /* synthetic */ java.util.ArrayList getLabelList$default(C55930xtI c55930xtI, BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return c55930xtI.copydefault(bizTradeStrategyInfo, z, str, str2);
    }

    public final java.util.ArrayList<TacticsListLabelUiData> copydefault(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2) {
        return C55939xtR.AEQbTJ.EZpvd(bizTradeStrategyInfo, z, str, str2);
    }

    public final java.util.ArrayList<TacticsInsideItemData> EZpvd(@NotNull java.lang.Object obj, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return conversionInsideData$default(this, obj, str, str2, str3, null, null, true, 48, null);
    }

    public static /* synthetic */ java.util.ArrayList conversionInsideData$default(C55930xtI c55930xtI, java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, java.lang.Object obj2) {
        return c55930xtI.OLrzqt(obj, str, str2, str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? false : z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [951=16, 3356=16] */
    /* JADX WARN: Code restructure failed: missing block: B:1164:0x4752, code lost:
    
        if (r11.equals("lvf_buy") == false) goto L1170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x15e9, code lost:
    
        if (r10.equals("starting") == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x15f4, code lost:
    
        if (r10.equals("pending_signal") == false) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x15f6, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x1638, code lost:
    
        r6 = r6.getOrdCopyType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1640, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r6, (java.lang.Object) "2") == false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x1642, code lost:
    
        r12.add(r2);
        r12.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x1648, code lost:
    
        if (r26 != false) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x164a, code lost:
    
        r12.add(r8);
        r12.add(r1);
        r12.add(r7);
        r12.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x1656, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x165f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r6, (java.lang.Object) "3") == false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x1661, code lost:
    
        r12.add(r2);
        r12.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x1667, code lost:
    
        if (r26 != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x1669, code lost:
    
        r12.add(r8);
        r12.add(r1);
        r12.add(r7);
        r12.add(r3);
        r12.add(r0);
        r12.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x167b, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x167e, code lost:
    
        r12.add(r2);
        r12.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x1684, code lost:
    
        if (r26 != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x1686, code lost:
    
        r12.add(r8);
        r12.add(r1);
        r12.add(r7);
        r12.add(r3);
        r12.add(r0);
        r12.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x1698, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x169a, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x16a5, code lost:
    
        if (r13.equals("lvf_sell") == false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x1ec5, code lost:
    
        if (r10.equals("starting") == false) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x1f0a, code lost:
    
        if (r10.equals("pending_signal") == false) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x1f10, code lost:
    
        r1 = r6.getOrdCopyType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x1f18, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd(r1, r12) == false) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x1f1a, code lost:
    
        r15.add(r8);
        r15.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x1f20, code lost:
    
        if (r26 != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x1f22, code lost:
    
        r15.add(r14);
        r15.add(r11);
        r15.add(r7);
        r15.add(r5);
        r15.add(r4);
        r15.add(r90);
        r15.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x1f39, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x1f3c, code lost:
    
        r10 = r90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x1f44, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r1, (java.lang.Object) "3") == false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x1f46, code lost:
    
        r15.add(r8);
        r15.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x1f4c, code lost:
    
        if (r26 != false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x1f4e, code lost:
    
        r15.add(r14);
        r15.add(r11);
        r15.add(r7);
        r15.add(r5);
        r15.add(r0);
        r15.add(r4);
        r15.add(r10);
        r15.add(r2);
        r15.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x1f69, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x1f6c, code lost:
    
        r15.add(r8);
        r15.add(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x1f72, code lost:
    
        if (r26 != false) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x1f74, code lost:
    
        r15.add(r14);
        r15.add(r11);
        r15.add(r7);
        r15.add(r5);
        r15.add(r0);
        r15.add(r10);
        r15.add(r4);
        r15.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x1f8c, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x1f8e, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x300b, code lost:
    
        if (r0.equals("starting") == false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:808:0x3020, code lost:
    
        if (r0.equals("pending_signal") == false) goto L809;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x3022, code lost:
    
        r0 = r91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x30b9, code lost:
    
        r1 = r6.getOrdCopyType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x30c3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r1, (java.lang.Object) "2") == false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x30c5, code lost:
    
        r9.add(r10);
        r9.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x30cb, code lost:
    
        if (r2 != false) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x30d1, code lost:
    
        if (r7.length() <= 0) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x30d3, code lost:
    
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x30d6, code lost:
    
        r9.add(r3);
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x30dc, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:0x30e3, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd(r1, r15) == false) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x30e5, code lost:
    
        r9.add(r10);
        r9.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:838:0x30eb, code lost:
    
        if (r2 != false) goto L843;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x30f1, code lost:
    
        if (r7.length() <= 0) goto L842;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x30f3, code lost:
    
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:842:0x30f6, code lost:
    
        r9.add(r3);
        r9.add(r4);
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x30ff, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:844:0x3102, code lost:
    
        r9.add(r10);
        r9.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x3108, code lost:
    
        if (r2 != false) goto L850;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x310e, code lost:
    
        if (r7.length() <= 0) goto L849;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x3110, code lost:
    
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x3113, code lost:
    
        r9.add(r3);
        r9.add(r4);
        r9.add(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x311c, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x311e, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x3b55  */
    /* JADX WARN: Removed duplicated region for block: B:1009:0x3b71  */
    /* JADX WARN: Removed duplicated region for block: B:1014:0x3b9d A[PHI: r6 r7 r13
  0x3b9d: PHI (r6v102 com.okinc.unify_trade.bot.data.TacticsInsideItemData) = 
  (r6v101 com.okinc.unify_trade.bot.data.TacticsInsideItemData)
  (r6v104 com.okinc.unify_trade.bot.data.TacticsInsideItemData)
 binds: [B:1006:0x3b65, B:1003:0x3b52] A[DONT_GENERATE, DONT_INLINE]
  0x3b9d: PHI (r7v42 com.okinc.unify_trade.bot.data.TacticsInsideItemData) = 
  (r7v41 com.okinc.unify_trade.bot.data.TacticsInsideItemData)
  (r7v44 com.okinc.unify_trade.bot.data.TacticsInsideItemData)
 binds: [B:1006:0x3b65, B:1003:0x3b52] A[DONT_GENERATE, DONT_INLINE]
  0x3b9d: PHI (r13v24 java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsInsideItemData>) = 
  (r13v23 java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsInsideItemData>)
  (r13v26 java.util.ArrayList<com.okinc.unify_trade.bot.data.TacticsInsideItemData>)
 binds: [B:1006:0x3b65, B:1003:0x3b52] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:1469:0x5fbb  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1f99  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x2aff  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x2b09  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x2b0c  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x2b58  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x2bd8  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x2c4e  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x2c51  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x2ce1  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x2cef  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x2d81  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x2d86  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x2dfb  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x2e7f  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x2e82  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x2ec1  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x2ec4  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x2f43  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x300e  */
    /* JADX WARN: Removed duplicated region for block: B:896:0x34cd  */
    /* JADX WARN: Removed duplicated region for block: B:971:0x3868  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x38fe  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x39d6  */
    /* JADX WARN: Removed duplicated region for block: B:979:0x39d8  */
    /* JADX WARN: Removed duplicated region for block: B:982:0x3a17  */
    /* JADX WARN: Removed duplicated region for block: B:983:0x3a1a  */
    /* JADX WARN: Removed duplicated region for block: B:986:0x3a50  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x3a55  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x3af8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<TacticsInsideItemData> OLrzqt(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        java.util.ArrayList<TacticsInsideItemData> arrayList;
        java.util.ArrayList<TacticsInsideItemData> arrayList2;
        java.lang.String displayQuoteSymbol;
        java.lang.String botAmount$default;
        java.lang.String strCopydefault;
        java.lang.String botAmount$default2;
        java.lang.String botAmount$default3;
        java.lang.String str6;
        BotVo botVo;
        ContractGridVo contractGrid;
        UnitDisplayVo unitDisplayVO;
        java.util.Map<java.lang.String, MarginPerCcyVo> marginPerCcy;
        java.lang.String investment;
        java.lang.String str7;
        java.lang.String strSourceCcy;
        java.lang.Integer recurringTimeType;
        ArbitrageOrderBean arbitrageOrderBean;
        ArbitrageOrderBean arbitrageOrderBean2;
        java.lang.String subOrderState;
        java.lang.String state;
        java.lang.String subOrderState2;
        java.lang.String state2;
        xMS xmsGEmmrt;
        TacticsInsideItemData tacticsInsideItemData;
        java.lang.Object obj2;
        int iHashCode;
        TacticsInsideItemData tacticsInsideItemData2;
        TacticsInsideItemData tacticsInsideItemData3;
        TacticsInsideItemData tacticsInsideItemData4;
        TacticsInsideItemData tacticsInsideItemData5;
        java.util.ArrayList<TacticsInsideItemData> arrayList3;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAEQbTJ;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        C54536xML c54536xMLAYXKKw2;
        C54536xML c54536xMLAEQbTJ2;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLDjBIcL2;
        DcaTriggerParam dcaTriggerParam;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String quoteSymbol;
        java.util.ArrayList<TacticsInsideItemData> arrayList4;
        java.util.ArrayList<TacticsInsideItemData> arrayList5;
        xMS xmsGEmmrt2;
        java.lang.String marginSymbol;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String displayQuoteSymbol2;
        TacticsInsideItemData tacticsInsideItemData6;
        TacticsInsideItemData tacticsInsideItemData7;
        java.lang.String displayQuoteSymbol3;
        C54536xML c54536xMLAYXKKw3;
        C54536xML c54536xMLAEQbTJ3;
        C54536xML c54536xMLCopydefault3;
        C54536xML c54536xMLDjBIcL3;
        TacticsInsideItemData tacticsInsideItemData8;
        TacticsInsideItemData tacticsInsideItemData9;
        java.lang.String str10;
        TacticsInsideItemData tacticsInsideItemData10;
        TacticsInsideItemData tacticsInsideItemData11;
        C54536xML c54536xMLAYXKKw4;
        TacticsInsideItemData tacticsInsideItemData12;
        C54536xML c54536xMLAEQbTJ4;
        TacticsInsideItemData tacticsInsideItemData13;
        C54536xML c54536xMLCopydefault4;
        C54536xML c54536xMLDjBIcL4;
        TacticsInsideItemData tacticsInsideItemData14;
        java.lang.String safeString$default2;
        java.lang.String str11;
        C54536xML c54536xMLAYXKKw5;
        C54536xML c54536xMLAEQbTJ5;
        C54536xML c54536xMLCopydefault5;
        C54536xML c54536xMLDjBIcL5;
        int iHashCode2;
        java.lang.Object obj3;
        TacticsInsideItemData tacticsInsideItemData15;
        TacticsInsideItemData tacticsInsideItemData16;
        TacticsInsideItemData tacticsInsideItemData17;
        TacticsInsideItemData tacticsInsideItemData18;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        java.lang.String botAmount$default4;
        java.lang.String strCopydefault2;
        java.lang.String botAmount$default5;
        C55930xtI c55930xtI;
        java.lang.String str12;
        java.lang.String botPnl$default;
        java.util.ArrayList<TacticsInsideItemData> arrayList6;
        java.lang.String str13;
        MarginPerCcyVo marginPerCcyVo;
        java.lang.String str14;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ;
        java.lang.String str15;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ2;
        java.lang.String extraMargin;
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ3;
        java.lang.String extraMargin2;
        TacticsInsideItemData tacticsInsideItemData19;
        TacticsInsideItemData tacticsInsideItemData20;
        TacticsInsideItemData tacticsInsideItemData21;
        TacticsInsideItemData tacticsInsideItemData22;
        java.lang.Object obj4;
        TacticsInsideItemData tacticsInsideItemData23;
        BotVo botVo2;
        ContractGridVo contractGrid2;
        UnitDisplayVo unitDisplayVO2;
        java.util.Map<java.lang.String, MarginPerCcyVo> marginPerCcy2;
        C55930xtI c55930xtI2;
        java.util.ArrayList<TacticsInsideItemData> arrayList7;
        java.lang.String str16;
        java.lang.String instId;
        java.lang.String investment2;
        boolean z2;
        java.lang.Integer recurringTimeType2;
        ArbitrageOrderBean arbitrageOrderBean3;
        ArbitrageOrderBean arbitrageOrderBean4;
        java.lang.String subOrderState3;
        java.lang.String state3;
        java.lang.String subOrderState4;
        java.lang.String state4;
        java.lang.String str17 = str2;
        java.util.ArrayList<TacticsInsideItemData> arrayList8 = new java.util.ArrayList<>();
        boolean z3 = this.EZpvd.KWHzl() == CardStyle.MINI && !this.OLrzqt;
        if (!(obj instanceof StrategyPendingListResp)) {
            boolean z4 = z3;
            if (obj instanceof StrategyHistoryListResp) {
                StrategyHistoryListResp strategyHistoryListResp = (StrategyHistoryListResp) obj;
                java.lang.String orderType = strategyHistoryListResp.getOrderType();
                switch (orderType.hashCode()) {
                    case -1831183611:
                        arrayList2 = arrayList8;
                        if (orderType.equals("spot_dca")) {
                            java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strategyHistoryListResp.getInvestmentccy(), strategyHistoryListResp.getInvestmentamt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
                            java.lang.String strAhwBna = AhwBna(str17);
                            int i = C32113mPz.Dialog.OcIXYQ;
                            TacticsUiConst.BotListSubItemType.BotSubTip.Default r17 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                            TacticsInsideItemData tacticsInsideItemData24 = new TacticsInsideItemData(strAhwBna, strFmtBotValueBySymbol$default, C33070mpX.AYXKKw(C55688xof.Application.DarRvM), 0, 0, 0, 0, i, null, r17, null, C33070mpX.AYXKKw(C55688xof.Application.DAIeex), null, null, null, null, null, 128376, null);
                            TacticsInsideItemData tacticsInsideItemData25 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", C56033xvF.getBotPnl$default(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getOrderTotalPnl(), str2, false, true, null, false, null, null, null, 2000, null) + " (" + C56068xvo.copydefault.copydefault(strategyHistoryListResp.getOrderPnlRatio(), true) + ")", C33070mpX.AYXKKw(C55688xof.Application.gasjUx), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r17, null, C33070mpX.AYXKKw(C55688xof.Application.OnContextAvailableListener), null, null, null, null, null, 128368, null);
                            java.lang.String strKWHzl = C55962xto.KWHzl(strategyHistoryListResp.getArbitrageApy());
                            java.lang.String totalApy = strategyHistoryListResp.getTotalApy();
                            java.lang.String strKWHzl2 = C55962xto.KWHzl(totalApy != null ? totalApy : "0");
                            TacticsInsideItemData tacticsInsideItemData26 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl + "\n" + strKWHzl2, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl + "\n" + strKWHzl2), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r17, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                            TacticsInsideItemData tacticsInsideItemData27 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyHistoryListResp.getTotalCycleProfit(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyHistoryListResp.getTotalCycleProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getTotalCycleProfit()), 0, 0, 0, 0, null, r17, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                            TacticsInsideItemData tacticsInsideItemData28 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), C55962xto.OLrzqt(strategyHistoryListResp.getCompleteCycles()), C33070mpX.AYXKKw(C55688xof.Application.ODWQjV), 0, 0, 0, 0, 0, null, r17, null, C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), null, null, null, null, null, 128504, null);
                            arrayList2.add(tacticsInsideItemData24);
                            arrayList2.add(tacticsInsideItemData25);
                            if (!z4) {
                                arrayList2.add(tacticsInsideItemData27);
                                arrayList2.add(tacticsInsideItemData26);
                                arrayList2.add(tacticsInsideItemData28);
                                if (!z) {
                                    TacticsInsideItemData tacticsInsideItemData29 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                    TacticsInsideItemData tacticsInsideItemData30 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                    arrayList2.add(tacticsInsideItemData29);
                                    arrayList2.add(tacticsInsideItemData30);
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            return arrayList2;
                        }
                        arrayList = arrayList2;
                        break;
                    case -1574173039:
                        arrayList2 = arrayList8;
                        if (orderType.equals("infinite_grid")) {
                            C56068xvo c56068xvo = C56068xvo.copydefault;
                            TacticsInsideItemData tacticsInsideItemData31 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", c56068xvo.AEQbTJ(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getOrderTotalPnl(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null) + " (" + c56068xvo.copydefault(strategyHistoryListResp.getOrderPnlRatio(), true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                            TacticsInsideItemData tacticsInsideItemData32 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.HJWChPOZOJIj, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str17))), C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getMinPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), null, null, 12, null) : null;
                            TacticsInsideItemData tacticsInsideItemData33 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2) + " (" + str17 + ")", C56033xvF.fmtBotValueBySymbol$default((suggestedInstrument$default == null || (displayQuoteSymbol = suggestedInstrument$default.getDisplayQuoteSymbol()) == null) ? "" : displayQuoteSymbol, strategyHistoryListResp.getInvestment(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                            TacticsInsideItemData tacticsInsideItemData34 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandler), C55962xto.OLrzqt(strategyHistoryListResp.getArbitrageNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData35 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData36 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            arrayList2.add(tacticsInsideItemData33);
                            arrayList2.add(tacticsInsideItemData31);
                            arrayList2.add(tacticsInsideItemData34);
                            arrayList2.add(tacticsInsideItemData32);
                            arrayList2.add(tacticsInsideItemData35);
                            arrayList2.add(tacticsInsideItemData36);
                        }
                        arrayList = arrayList2;
                        break;
                    case -1418042064:
                        arrayList2 = arrayList8;
                        if (orderType.equals("ai_bot")) {
                            arrayList2.add(new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, java.lang.String.valueOf(z4), null, 98303, null));
                        }
                        arrayList = arrayList2;
                        break;
                    case -1402017003:
                        arrayList2 = arrayList8;
                        if (orderType.equals("contract_dca")) {
                            java.lang.String strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(strategyHistoryListResp.getInvestmentccy(), strategyHistoryListResp.getInvestmentamt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
                            java.lang.String str18 = C33070mpX.AYXKKw(C55688xof.Application.DsL) + " (" + strategyHistoryListResp.getInvestmentccy() + ")";
                            int i2 = C32113mPz.Dialog.OcIXYQ;
                            TacticsUiConst.BotListSubItemType.BotSubTip.Default r2 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                            TacticsInsideItemData tacticsInsideItemData37 = new TacticsInsideItemData(str18, strFmtBotValueBySymbol$default2, C33070mpX.AYXKKw(C55688xof.Application.fbC), 0, 0, 0, 0, i2, null, r2, null, C33070mpX.AYXKKw(C55688xof.Application.DAIeex), null, null, null, null, null, 128376, null);
                            java.lang.String botPnl$default2 = C56033xvF.getBotPnl$default(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getOrderTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
                            java.lang.String strCopydefault3 = C56068xvo.copydefault.copydefault(strategyHistoryListResp.getOrderPnlRatio(), true);
                            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getCurrent);
                            java.lang.String tradeQuoteCcy = strategyHistoryListResp.getTradeQuoteCcy();
                            java.lang.String investmentccy = strategyHistoryListResp.getInvestmentccy();
                            if (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) {
                                tradeQuoteCcy = investmentccy;
                            }
                            TacticsInsideItemData tacticsInsideItemData38 = new TacticsInsideItemData(strAYXKKw + " (" + tradeQuoteCcy + ")", botPnl$default2 + " (" + strCopydefault3 + ")", C33070mpX.AYXKKw(C55688xof.Application.gasjUx), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r2, null, C33070mpX.AYXKKw(C55688xof.Application.OnContextAvailableListener), null, null, null, null, null, 128368, null);
                            java.lang.String completeCycles = strategyHistoryListResp.getCompleteCycles();
                            TacticsInsideItemData tacticsInsideItemData39 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), (completeCycles == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) completeCycles)) ? "--" : xMR.copydefault.copydefault(strategyHistoryListResp.getCompleteCycles()), C33070mpX.AYXKKw(C55688xof.Application.DcMfJKRKUgwx), 0, 0, 0, 0, 0, null, r2, null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), null, null, null, null, null, 128504, null);
                            TacticsInsideItemData tacticsInsideItemData40 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyHistoryListResp.getArbitragePnl(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyHistoryListResp.getArbitrageProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.getRoot), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getArbitragePnl()), 0, 0, 0, 0, null, r2, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                            java.lang.String strKWHzl3 = C55962xto.KWHzl(strategyHistoryListResp.getArbitrageApy());
                            java.lang.String totalApy2 = strategyHistoryListResp.getTotalApy();
                            java.lang.String strKWHzl4 = C55962xto.KWHzl(totalApy2 != null ? totalApy2 : "0");
                            TacticsInsideItemData tacticsInsideItemData41 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl3 + "\n" + strKWHzl4, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl3 + "\n" + strKWHzl4), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r2, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                            java.lang.String ordCopyType = strategyHistoryListResp.getOrdCopyType();
                            if (Intrinsics.EZpvd((java.lang.Object) ordCopyType, (java.lang.Object) "2")) {
                                arrayList2.add(tacticsInsideItemData37);
                                arrayList2.add(tacticsInsideItemData38);
                                if (!z4) {
                                    arrayList2.add(tacticsInsideItemData40);
                                    arrayList2.add(tacticsInsideItemData41);
                                    arrayList2.add(tacticsInsideItemData39);
                                }
                                Unit unit2 = Unit.INSTANCE;
                            } else if (Intrinsics.EZpvd((java.lang.Object) ordCopyType, (java.lang.Object) "1")) {
                                arrayList2.add(tacticsInsideItemData37);
                                arrayList2.add(tacticsInsideItemData38);
                                if (!z4) {
                                    arrayList2.add(tacticsInsideItemData40);
                                    arrayList2.add(tacticsInsideItemData41);
                                    arrayList2.add(tacticsInsideItemData39);
                                }
                                Unit unit3 = Unit.INSTANCE;
                            } else {
                                arrayList2.add(tacticsInsideItemData37);
                                arrayList2.add(tacticsInsideItemData38);
                                if (!z4) {
                                    arrayList2.add(tacticsInsideItemData40);
                                    arrayList2.add(tacticsInsideItemData41);
                                    arrayList2.add(tacticsInsideItemData39);
                                }
                                Unit unit4 = Unit.INSTANCE;
                            }
                            if (!z4 && !z) {
                                TacticsInsideItemData tacticsInsideItemData42 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                TacticsInsideItemData tacticsInsideItemData43 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                arrayList2.add(tacticsInsideItemData42);
                                arrayList2.add(tacticsInsideItemData43);
                            }
                        }
                        arrayList = arrayList2;
                        break;
                    case -1216369070:
                        arrayList2 = arrayList8;
                        if (orderType.equals("smart_portfolio")) {
                            java.lang.String tradeQuoteCcy2 = strategyHistoryListResp.getTradeQuoteCcy();
                            java.lang.String stgyInvestCcy = strategyHistoryListResp.getStgyInvestCcy();
                            if (tradeQuoteCcy2 == null || tradeQuoteCcy2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy2)) {
                                tradeQuoteCcy2 = stgyInvestCcy;
                            }
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DimenRes) + " (" + tradeQuoteCcy2 + ")", C56033xvF.fmtBotValueBySymbol$default(tradeQuoteCcy2, strategyHistoryListResp.getStgyInvestAmt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null));
                            java.lang.String botPnl$default3 = C56033xvF.getBotPnl$default(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getOrderTotalPnl(), tradeQuoteCcy2, false, true, null, false, null, null, null, 2000, null);
                            java.lang.String strCopydefault4 = C56068xvo.copydefault.copydefault(strategyHistoryListResp.getOrderPnlRatio(), true);
                            new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy2 + ")", botPnl$default3, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                            new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault4, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyHistoryListResp.getOrderPnlRatio())), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy2 + ")", botPnl$default3 + " (" + strCopydefault4 + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
                            if (!z4) {
                                kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = copydefault((BizTradeStrategyInfo) obj);
                                arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setElevation), pairCopydefault.getFirst(), null, 0, 0, 0, 0, 0, pairCopydefault.getSecond(), null, null, null, null, null, null, null, null, 130812, null));
                                kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd = C55924xtC.Companion.EZpvd(strategyHistoryListResp.getPortfolioBalType(), strategyHistoryListResp.getPortfolioBalRatio(), strategyHistoryListResp.getPortfolioBalInterval());
                                arrayList2.add(new TacticsInsideItemData(pairEZpvd.component1(), pairEZpvd.component2(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.f1070api), C55962xto.OLrzqt(strategyHistoryListResp.getPortfolioBalNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            }
                        }
                        arrayList = arrayList2;
                        break;
                    case -1148661171:
                        arrayList2 = arrayList8;
                        if (orderType.equals("smart_iceberg")) {
                            java.lang.String str19 = C33070mpX.AYXKKw(C55688xof.Application.setButtonPanelLayoutHint) + " (" + str + ")";
                            java.lang.String szLimit = strategyHistoryListResp.getSzLimit();
                            if (szLimit == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) szLimit)) {
                                botAmount$default = "--";
                            } else {
                                java.lang.String instType = strategyHistoryListResp.getInstType();
                                java.lang.String instId2 = strategyHistoryListResp.getInstId();
                                java.lang.String szLimit2 = strategyHistoryListResp.getSzLimit();
                                java.lang.String orderCtVal = strategyHistoryListResp.getOrderCtVal();
                                botAmount$default = C56033xvF.getBotAmount$default(instType, instId2, szLimit2, orderCtVal == null ? "" : orderCtVal, false, null, 48, null);
                            }
                            arrayList2.add(new TacticsInsideItemData(str19, botAmount$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setCustomTitle);
                            java.lang.String lmtOrderNumber = strategyHistoryListResp.getLmtOrderNumber();
                            if (lmtOrderNumber == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lmtOrderNumber)) {
                                strCopydefault = "--";
                            } else {
                                xMR xmr = xMR.copydefault;
                                java.lang.String lmtOrderNumber2 = strategyHistoryListResp.getLmtOrderNumber();
                                if (lmtOrderNumber2 == null) {
                                    lmtOrderNumber2 = "";
                                }
                                strCopydefault = xmr.copydefault(lmtOrderNumber2);
                            }
                            arrayList2.add(new TacticsInsideItemData(strAYXKKw2, strCopydefault, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController1) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            java.lang.String actualSz = strategyHistoryListResp.getActualSz();
                            if (actualSz == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualSz)) {
                                botAmount$default2 = "--";
                            } else {
                                java.lang.String instType2 = strategyHistoryListResp.getInstType();
                                java.lang.String instId3 = strategyHistoryListResp.getInstId();
                                java.lang.String actualSz2 = strategyHistoryListResp.getActualSz();
                                java.lang.String orderCtVal2 = strategyHistoryListResp.getOrderCtVal();
                                botAmount$default2 = C56033xvF.getBotAmount$default(instType2, instId3, actualSz2, orderCtVal2 == null ? "" : orderCtVal2, false, null, 48, null);
                            }
                            java.lang.String sz = strategyHistoryListResp.getSz();
                            if (sz == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sz)) {
                                botAmount$default3 = "--";
                            } else {
                                java.lang.String instType3 = strategyHistoryListResp.getInstType();
                                java.lang.String instId4 = strategyHistoryListResp.getInstId();
                                java.lang.String sz2 = strategyHistoryListResp.getSz();
                                java.lang.String orderCtVal3 = strategyHistoryListResp.getOrderCtVal();
                                botAmount$default3 = C56033xvF.getBotAmount$default(instType3, instId4, sz2, orderCtVal3 == null ? "" : orderCtVal3, false, null, 48, null);
                            }
                            arrayList2.add(new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.resolvePanel, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str))), botAmount$default2 + "/" + botAmount$default3, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getTriggerParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController2), valueOf(strategyHistoryListResp.getIceAggressiveNess()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList2.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        }
                        arrayList = arrayList2;
                        break;
                    case -1086683216:
                        arrayList2 = arrayList8;
                        if (orderType.equals("signal_bot")) {
                            java.lang.String botPnl$default4 = C56033xvF.getBotPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
                            C56068xvo c56068xvo2 = C56068xvo.copydefault;
                            java.lang.String totalPnlRatio = strategyHistoryListResp.getTotalPnlRatio();
                            if (totalPnlRatio == null) {
                                totalPnlRatio = "";
                            }
                            TacticsInsideItemData tacticsInsideItemData44 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", botPnl$default4 + " (" + c56068xvo2.copydefault(totalPnlRatio, true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.closeSocket);
                            java.lang.String signalChanName = strategyHistoryListResp.getSignalChanName();
                            TacticsInsideItemData tacticsInsideItemData45 = new TacticsInsideItemData(strAYXKKw3, signalChanName == null ? "" : signalChanName, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.getSupportedCipherSuites);
                            xMR xmr2 = xMR.copydefault;
                            java.lang.String signalCount = strategyHistoryListResp.getSignalCount();
                            if (signalCount == null) {
                                signalCount = "";
                            }
                            TacticsInsideItemData tacticsInsideItemData46 = new TacticsInsideItemData(strAYXKKw4, xmr2.copydefault(signalCount), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String strOLrzqt = C56033xvF.OLrzqt(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), "");
                            java.lang.String str20 = C33070mpX.AYXKKw(C55688xof.Application.DztXDE) + " (" + strOLrzqt + ")";
                            java.lang.String totalAmt = strategyHistoryListResp.getTotalAmt();
                            TacticsInsideItemData tacticsInsideItemData47 = new TacticsInsideItemData(str20, C56033xvF.fmtBotValueBySymbol$default(strOLrzqt, totalAmt == null ? "" : totalAmt, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                            TacticsInsideItemData tacticsInsideItemData48 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData49 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            arrayList2.add(tacticsInsideItemData47);
                            arrayList2.add(tacticsInsideItemData44);
                            if (!z4) {
                                arrayList2.add(tacticsInsideItemData45);
                                arrayList2.add(tacticsInsideItemData46);
                                arrayList2.add(tacticsInsideItemData48);
                                arrayList2.add(tacticsInsideItemData49);
                            }
                            Unit unit5 = Unit.INSTANCE;
                        }
                        arrayList = arrayList2;
                        break;
                    case -557961837:
                        arrayList2 = arrayList8;
                        if (orderType.equals("smart_arbitrage")) {
                            arrayList2.addAll(EZpvd((BizTradeStrategyInfo) obj, z4, str4, str5));
                        }
                        arrayList = arrayList2;
                        break;
                    case -512749997:
                        MarginPerCcyVo marginPerCcyVo2 = null;
                        boolean z5 = false;
                        if (orderType.equals("contract_grid")) {
                            C55889xsU c55889xsU = C55889xsU.copydefault;
                            boolean zCopydefault = c55889xsU.copydefault(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getBotVo());
                            int iAEQbTJ = c55889xsU.AEQbTJ(strategyHistoryListResp.getOrderAlgoId());
                            if (zCopydefault && iAEQbTJ == CoinMarginedCcyDisplay.USDT.getIndex()) {
                                z5 = true;
                            }
                            if (!z5 || (botVo = strategyHistoryListResp.getBotVo()) == null || (contractGrid = botVo.getContractGrid()) == null || (unitDisplayVO = contractGrid.getUnitDisplayVO()) == null || (marginPerCcy = unitDisplayVO.getMarginPerCcy()) == null) {
                                str6 = "USDT";
                            } else {
                                str6 = "USDT";
                                marginPerCcyVo2 = marginPerCcy.get(str6);
                            }
                            java.lang.String ccy = str6;
                            TacticsInsideItemData tacticsInsideItemData50 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getMinPx(), false, false, null, null, 120, null) + "-\n" + C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.isEmpty);
                            java.lang.String str21 = C55962xto.OLrzqt(strategyHistoryListResp.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyHistoryListResp.getArbitrageNum()) + " ";
                            TacticsUiConst.BotListSubItemType.BotSubTip.Default r22 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                            TacticsInsideItemData tacticsInsideItemData51 = new TacticsInsideItemData(strAYXKKw5, str21, C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, r22, null, null, null, null, null, null, null, 130552, null);
                            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ4 = (!z5 || marginPerCcyVo2 == null) ? ActionBar.AEQbTJ(C56033xvF.fmtBotValueBySymbol$default(C56033xvF.OLrzqt(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), ""), strategyHistoryListResp.getOrderSz(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), strategyHistoryListResp.getOrderSz()) : ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), marginPerCcyVo2.getInvestment()), marginPerCcyVo2.getInvestment());
                            java.lang.String investCcy = (!z5 || marginPerCcyVo2 == null) ? strategyHistoryListResp.getInvestCcy() : ccy;
                            C56066xvm c56066xvm = C56066xvm.EZpvd;
                            TacticsInsideItemData tacticsInsideItemData52 = new TacticsInsideItemData(AhwBna(c56066xvm.OLrzqt(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), investCcy)), ActionBar.AEQbTJ(pairAEQbTJ4), C33070mpX.AYXKKw(C55688xof.Application.zXhzOT), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r22, null, null, null, null, null, null, null, 130424, null);
                            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ5 = (!z5 || marginPerCcyVo2 == null) ? ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null), strategyHistoryListResp.getTotalPnl()) : ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), marginPerCcyVo2.getTotalPnl()), marginPerCcyVo2.getTotalPnl());
                            java.lang.String strCopydefault5 = C56068xvo.copydefault.copydefault((!z5 || marginPerCcyVo2 == null) ? strategyHistoryListResp.getPnlRatio() : marginPerCcyVo2.getPnlRatio(), true);
                            java.lang.String instId5 = strategyHistoryListResp.getInstId();
                            java.lang.String instType4 = strategyHistoryListResp.getInstType();
                            if (!z5 || marginPerCcyVo2 == null) {
                                ccy = strategyHistoryListResp.getCcy();
                            }
                            TacticsInsideItemData tacticsInsideItemData53 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + c56066xvm.KWHzl(instId5, instType4, ccy) + ")", ActionBar.AEQbTJ(pairAEQbTJ5) + " (" + strCopydefault5 + ")", C33070mpX.AYXKKw(C55688xof.Application.getCurrentPosition), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), ActionBar.KWHzl(pairAEQbTJ5), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r22, null, null, null, null, null, null, null, 130416, null);
                            kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ6 = (!z5 || marginPerCcyVo2 == null) ? ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getGridProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyHistoryListResp.getGridProfit()) : ActionBar.AEQbTJ(c55889xsU.AEQbTJ(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), marginPerCcyVo2.getGridProfit()), marginPerCcyVo2.getGridProfit());
                            java.lang.String strOLrzqt2 = C33129mqd.OLrzqt((java.lang.Object) ActionBar.KWHzl(pairAEQbTJ6), (java.lang.Object) 0) ? C55962xto.OLrzqt("0") : ActionBar.AEQbTJ(pairAEQbTJ6);
                            java.lang.String strKWHzl5 = C55962xto.KWHzl((!z5 || marginPerCcyVo2 == null) ? strategyHistoryListResp.getGridProfitRate() : marginPerCcyVo2.getGridProfitRate());
                            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent);
                            int i3 = C32113mPz.Dialog.fIwbmz;
                            int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) ActionBar.KWHzl(pairAEQbTJ6));
                            BalanceDetailInfoDto balanceDetails = strategyHistoryListResp.getBalanceDetails();
                            if (balanceDetails == null) {
                                balanceDetails = BalanceDetailInfoDto.Companion.EZpvd();
                            }
                            TacticsInsideItemData tacticsInsideItemData54 = new TacticsInsideItemData(strAYXKKw6, strOLrzqt2, C33070mpX.AYXKKw(C55688xof.Application.selectTab), iOLrzqt, 0, 0, i3, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails(strategyHistoryListResp.getAlgoId(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), balanceDetails), null, null, null, null, strKWHzl5, null, null, 114096, null);
                            TacticsInsideItemData tacticsInsideItemData55 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData56 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String arbitrageApy = (!z5 || marginPerCcyVo2 == null) ? strategyHistoryListResp.getArbitrageApy() : marginPerCcyVo2.getArbitrageApy();
                            java.lang.String totalApy3 = (!z5 || marginPerCcyVo2 == null) ? strategyHistoryListResp.getTotalApy() : marginPerCcyVo2.getTotalApy();
                            java.lang.String strKWHzl6 = C55962xto.KWHzl(arbitrageApy);
                            java.lang.String strKWHzl7 = C55962xto.KWHzl(totalApy3 != null ? totalApy3 : "0");
                            TacticsInsideItemData tacticsInsideItemData57 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl6 + "\n" + strKWHzl7, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) arbitrageApy), C56033xvF.OLrzqt((java.lang.Object) totalApy3), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl6 + "\n" + strKWHzl7), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r22, null, null, null, null, null, null, null, 130496, null);
                            if (Intrinsics.EZpvd((java.lang.Object) strategyHistoryListResp.getOrdCopyType(), (java.lang.Object) "2")) {
                                arrayList2 = arrayList8;
                                arrayList2.add(tacticsInsideItemData52);
                                arrayList2.add(tacticsInsideItemData53);
                                if (!z4) {
                                    arrayList2.add(tacticsInsideItemData54);
                                    arrayList2.add(tacticsInsideItemData57);
                                    arrayList2.add(tacticsInsideItemData51);
                                }
                            } else {
                                arrayList2 = arrayList8;
                                arrayList2.add(tacticsInsideItemData52);
                                arrayList2.add(tacticsInsideItemData53);
                                if (!z4) {
                                    arrayList2.add(tacticsInsideItemData54);
                                    arrayList2.add(tacticsInsideItemData57);
                                    arrayList2.add(tacticsInsideItemData50);
                                    arrayList2.add(tacticsInsideItemData51);
                                }
                            }
                            if (!z4) {
                                arrayList2.add(tacticsInsideItemData55);
                                arrayList2.add(tacticsInsideItemData56);
                            }
                        } else {
                            arrayList2 = arrayList8;
                        }
                        arrayList = arrayList2;
                        break;
                    case -392358507:
                        if (orderType.equals("lvf_sell")) {
                            arrayList8.addAll(C54795xVp.OLrzqt(strategyHistoryListResp.getStatus()) ? AEQbTJ((BizTradeStrategyInfo) obj, true) : OLrzqt((BizTradeStrategyInfo) obj, true));
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 3181382:
                        boolean z6 = false;
                        if (orderType.equals("grid")) {
                            TacticsInsideItemData tacticsInsideItemData58 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.isEmpty);
                            java.lang.String str22 = C55962xto.OLrzqt(strategyHistoryListResp.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyHistoryListResp.getArbitrageNum()) + " ";
                            TacticsUiConst.BotListSubItemType.BotSubTip.Default r23 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                            TacticsInsideItemData tacticsInsideItemData59 = new TacticsInsideItemData(strAYXKKw7, str22, C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, r23, null, null, null, null, null, null, null, 130552, null);
                            if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyHistoryListResp.getSourceCcy())) {
                                java.lang.String str23 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) strategyHistoryListResp.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null), 1);
                                if (str23 == null) {
                                    str23 = "BTC";
                                }
                                java.lang.String str24 = str23 + "-" + strategyHistoryListResp.getSourceCcy();
                                strSourceCcy = strategyHistoryListResp.sourceCcy();
                                java.lang.String sourceCcySz = strategyHistoryListResp.getSourceCcySz();
                                investment = sourceCcySz == null ? "" : sourceCcySz;
                                str7 = str24;
                                z6 = true;
                            } else {
                                java.lang.String instId6 = strategyHistoryListResp.getInstId();
                                investment = strategyHistoryListResp.getInvestment();
                                str7 = instId6;
                                strSourceCcy = str17;
                            }
                            java.lang.String totalPnlInSourceCcy = z6 ? strategyHistoryListResp.getTotalPnlInSourceCcy() : strategyHistoryListResp.getTotalPnl();
                            C56068xvo c56068xvo3 = C56068xvo.copydefault;
                            TacticsInsideItemData tacticsInsideItemData60 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + strSourceCcy + ")", c56068xvo3.AEQbTJ(str7, strategyHistoryListResp.getInstType(), totalPnlInSourceCcy, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null) + " (" + c56068xvo3.copydefault(z6 ? strategyHistoryListResp.getPnlRatioInSourceCcy() : strategyHistoryListResp.getPnlRatio(), true) + ")", C33070mpX.AYXKKw(C55688xof.Application.containsKey), C56033xvF.OLrzqt((java.lang.Object) totalPnlInSourceCcy), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, z6 ? r23 : TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl, null, C33070mpX.AYXKKw(C55688xof.Application.getCurrent), null, null, null, null, null, 128368, null);
                            java.lang.String gridProfitInSourceCcy = C33129mqd.OLrzqt((java.lang.CharSequence) strategyHistoryListResp.getSourceCcy()) ? strategyHistoryListResp.getGridProfitInSourceCcy() : strategyHistoryListResp.getGridProfit();
                            TacticsInsideItemData tacticsInsideItemData61 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent), C55962xto.EZpvd(gridProfitInSourceCcy, strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyHistoryListResp.getGridProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.selectTab), C56033xvF.OLrzqt((java.lang.Object) gridProfitInSourceCcy), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r23, null, null, null, null, null, null, null, 130480, null);
                            java.lang.String strKWHzl8 = C55962xto.KWHzl(strategyHistoryListResp.getArbitrageApy());
                            java.lang.String totalApy4 = strategyHistoryListResp.getTotalApy();
                            java.lang.String strKWHzl9 = C55962xto.KWHzl(totalApy4 != null ? totalApy4 : "0");
                            TacticsInsideItemData tacticsInsideItemData62 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl8 + "\n" + strKWHzl9, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyHistoryListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl8 + "\n" + strKWHzl9), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r23, null, null, null, null, null, null, null, 130496, null);
                            TacticsInsideItemData tacticsInsideItemData63 = new TacticsInsideItemData(AhwBna(strSourceCcy), C56033xvF.fmtBotValueBySymbol$default(strSourceCcy, investment, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), z6 ? C33070mpX.AYXKKw(C55688xof.Application.getBundle) : C33070mpX.AYXKKw(C55688xof.Application.skipToNext), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r23, null, C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), null, null, null, null, null, 128376, null);
                            TacticsInsideItemData tacticsInsideItemData64 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData65 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            if (Intrinsics.EZpvd((java.lang.Object) strategyHistoryListResp.getOrdCopyType(), (java.lang.Object) "2")) {
                                arrayList8.add(tacticsInsideItemData63);
                                arrayList8.add(tacticsInsideItemData60);
                                if (!z4) {
                                    arrayList8.add(tacticsInsideItemData61);
                                    arrayList8.add(tacticsInsideItemData62);
                                    arrayList8.add(tacticsInsideItemData59);
                                }
                            } else {
                                arrayList8.add(tacticsInsideItemData63);
                                arrayList8.add(tacticsInsideItemData60);
                                if (!z4) {
                                    arrayList8.add(tacticsInsideItemData61);
                                    arrayList8.add(tacticsInsideItemData62);
                                    if (!Intrinsics.EZpvd((java.lang.Object) strategyHistoryListResp.getOrdCopyType(), (java.lang.Object) "1")) {
                                        arrayList8.add(tacticsInsideItemData58);
                                    }
                                    arrayList8.add(tacticsInsideItemData59);
                                }
                            }
                            if (!z4) {
                                arrayList8.add(tacticsInsideItemData64);
                                arrayList8.add(tacticsInsideItemData65);
                            }
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 3573234:
                        if (orderType.equals("twap")) {
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalFullyDrawnReporterOwner) + " " + AEQbTJ(strategyHistoryListResp, str17), AEQbTJ(strategyHistoryListResp), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPRGtXKCDKRTZD) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1) + " (" + C33070mpX.AYXKKw(C55688xof.Application.XmlRes) + ")", xMR.copydefault.copydefault(strategyHistoryListResp.getTimeInterval()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RSmiaq) + " (" + str + ")", C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getSzLimit(), strategyHistoryListResp.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.resolvePanel, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str))), C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getActualSz(), strategyHistoryListResp.getCtVal(), false, null, 48, null) + "/" + C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getSz(), strategyHistoryListResp.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 541516771:
                        break;
                    case 1165749981:
                        if (orderType.equals("recurring")) {
                            java.lang.String tradeQuoteCcy3 = strategyHistoryListResp.getTradeQuoteCcy();
                            java.lang.String stgyInvestCcy2 = strategyHistoryListResp.getStgyInvestCcy();
                            if (tradeQuoteCcy3 == null || tradeQuoteCcy3.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy3)) {
                                tradeQuoteCcy3 = stgyInvestCcy2;
                            }
                            TacticsInsideItemData tacticsInsideItemData66 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy3 + ")", C56033xvF.getBotPnl$default(strategyHistoryListResp.getOrderInstId(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getOrderTotalPnl(), strategyHistoryListResp.getStgyInvestCcy(), false, true, null, false, null, null, null, 2000, null) + " (" + C56068xvo.copydefault.copydefault(strategyHistoryListResp.getOrderPnlRatio(), true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), strategyHistoryListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                            kotlin.Pair recurringList$default = getRecurringList$default(this, (BizTradeStrategyInfo) obj, false, 2, null);
                            TacticsInsideItemData tacticsInsideItemData67 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatErrorCode), (java.lang.String) recurringList$default.getFirst(), null, 0, 0, 0, 0, 0, (java.lang.String) recurringList$default.getSecond(), null, null, null, null, null, null, null, null, 130812, null);
                            java.lang.String strCopydefault6 = strategyHistoryListResp.getCycles().length() == 0 ? "--" : xMR.copydefault.copydefault(strategyHistoryListResp.getCycles());
                            RecurringBuyDetails recurringBuyDetails = strategyHistoryListResp.getRecurringBuyDetails();
                            RecurringBuyDto recurringBuyDtoAEQbTJ = recurringBuyDetails != null ? recurringBuyDetails.AEQbTJ() : null;
                            java.lang.String strAYXKKw8 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21Callback);
                            int i4 = C55688xof.Application.getRemoteControlClient;
                            kotlin.Pair[] pairArr = new kotlin.Pair[2];
                            C56046xvS c56046xvS = C56046xvS.AEQbTJ;
                            java.lang.String recPeriod = strategyHistoryListResp.getRecPeriod();
                            java.lang.String recDay = strategyHistoryListResp.getRecDay();
                            java.lang.String recTime = strategyHistoryListResp.getRecTime();
                            java.lang.String recHourly = strategyHistoryListResp.getRecHourly();
                            java.lang.String string = (recurringBuyDtoAEQbTJ == null || (recurringTimeType = recurringBuyDtoAEQbTJ.getRecurringTimeType()) == null) ? null : recurringTimeType.toString();
                            if (string == null) {
                                string = "";
                            }
                            java.lang.String recurringTimeMinutes = recurringBuyDtoAEQbTJ != null ? recurringBuyDtoAEQbTJ.getRecurringTimeMinutes() : null;
                            if (recurringTimeMinutes == null) {
                                recurringTimeMinutes = "";
                            }
                            pairArr[0] = C56390yDp.OLrzqt("frenquency", c56046xvS.copydefault(recPeriod, recDay, recTime, recHourly, string, recurringTimeMinutes));
                            pairArr[1] = C56390yDp.OLrzqt("times", strCopydefault6);
                            TacticsInsideItemData tacticsInsideItemData68 = new TacticsInsideItemData(strAYXKKw8, C33069mpW.copydefault(i4, C56424yEw.gEmmrt(pairArr)), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String str25 = C33070mpX.AYXKKw(C55688xof.Application.setState) + " (" + tradeQuoteCcy3 + ")";
                            java.lang.String stgyInvestCcy3 = strategyHistoryListResp.getStgyInvestCcy();
                            java.lang.String stgyAmt = strategyHistoryListResp.getStgyAmt();
                            RoundingMode roundingMode = RoundingMode.UP;
                            TacticsInsideItemData tacticsInsideItemData69 = new TacticsInsideItemData(str25, C56033xvF.fmtBotValueBySymbol$default(stgyInvestCcy3, stgyAmt, roundingMode, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData70 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.enumMapping) + " (" + tradeQuoteCcy3 + ")", C56033xvF.fmtBotValueBySymbol$default(strategyHistoryListResp.getStgyInvestCcy(), strategyHistoryListResp.getStgyInvestAmt(), roundingMode, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                            kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault2 = C55961xtn.Companion.copydefault(strategyHistoryListResp.getRecList(), strategyHistoryListResp.getOrderInstType(), strategyHistoryListResp.getStgyInvestCcy());
                            TacticsInsideItemData tacticsInsideItemData71 = new TacticsInsideItemData(pairCopydefault2.component1(), pairCopydefault2.component2(), null, 0, 0, 0, 0, 0, strategyHistoryListResp.getRecList().size() > 2 ? "bot_sub_recurring_avg_price" : "", null, null, null, null, null, null, null, null, 130812, null);
                            TacticsInsideItemData tacticsInsideItemData72 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData73 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            if (strategyHistoryListResp.getRecList().size() == 1) {
                                arrayList8.add(tacticsInsideItemData70);
                                arrayList8.add(tacticsInsideItemData66);
                                if (!z4) {
                                    arrayList8.add(tacticsInsideItemData68);
                                    arrayList8.add(tacticsInsideItemData69);
                                    arrayList8.add(tacticsInsideItemData71);
                                    arrayList8.add(tacticsInsideItemData72);
                                    arrayList8.add(tacticsInsideItemData73);
                                }
                                Unit unit6 = Unit.INSTANCE;
                            } else {
                                arrayList8.add(tacticsInsideItemData70);
                                arrayList8.add(tacticsInsideItemData66);
                                if (!z4) {
                                    arrayList8.add(tacticsInsideItemData67);
                                    arrayList8.add(tacticsInsideItemData68);
                                    arrayList8.add(tacticsInsideItemData69);
                                    arrayList8.add(tacticsInsideItemData71);
                                    arrayList8.add(tacticsInsideItemData72);
                                    arrayList8.add(tacticsInsideItemData73);
                                }
                                Unit unit7 = Unit.INSTANCE;
                            }
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 1485620813:
                        if (orderType.equals("dcd_bot")) {
                            java.lang.String totalPnl = strategyHistoryListResp.getTotalPnl();
                            java.lang.String str26 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyHistoryListResp.getAlternateCurrency()) ? "" : " (" + strategyHistoryListResp.getAlternateCurrency() + ")";
                            C56068xvo c56068xvo4 = C56068xvo.copydefault;
                            TacticsInsideItemData tacticsInsideItemData74 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", c56068xvo4.AEQbTJ(strategyHistoryListResp.getInstId(), strategyHistoryListResp.getInstType(), totalPnl, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null) + " (" + c56068xvo4.copydefault(strategyHistoryListResp.getPnlRatio(), true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) totalPnl), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                            java.lang.String dcdArbApy = strategyHistoryListResp.getDcdArbApy();
                            TacticsInsideItemData tacticsInsideItemData75 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gUEfcq), c56068xvo4.copydefault(dcdArbApy, true), C33070mpX.AYXKKw(C55688xof.Application.fsSxsn), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(dcdArbApy)), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl, null, C33070mpX.AYXKKw(C55688xof.Application.gUEfcq), null, null, null, null, null, 128496, null);
                            java.lang.String instId7 = strategyHistoryListResp.getInstId();
                            java.lang.String instType5 = strategyHistoryListResp.getInstType();
                            java.lang.String arbPnl = strategyHistoryListResp.getArbPnl();
                            java.lang.String strAEQbTJ = c56068xvo4.AEQbTJ(instId7, instType5, arbPnl == null ? "" : arbPnl, (536 & 8) != 0 ? "" : strategyHistoryListResp.getAlternateCurrency(), (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
                            TacticsInsideItemData tacticsInsideItemData76 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sTzBva), strAEQbTJ, null, C56033xvF.OLrzqt((java.lang.Object) strAEQbTJ), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                            java.lang.String dcdNotional = strategyHistoryListResp.getDcdNotional();
                            TacticsInsideItemData tacticsInsideItemData77 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RvdRAu) + str26, dcdNotional.length() == 0 ? "--" : dcdNotional, null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                            TacticsInsideItemData tacticsInsideItemData78 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGUQLIOvDItG), C56033xvF.gEmmrt(strategyHistoryListResp.getCancelType()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData79 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zhUgOk), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyHistoryListResp.lastSettlementSettledTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyHistoryListResp.lastSettlementSettledTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            xMR xmr3 = xMR.copydefault;
                            java.lang.String settlementAmount = strategyHistoryListResp.getSettlementAmount();
                            TacticsInsideItemData tacticsInsideItemData80 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getPriority), xmr3.copydefault(settlementAmount == null ? "" : settlementAmount, 8), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData81 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zYHWMc), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyHistoryListResp.getCycle()) ? "--" : xmr3.copydefault(strategyHistoryListResp.getCycle(), 0), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            java.lang.String str27 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyHistoryListResp.getCTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyHistoryListResp.getCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                            java.lang.String str28 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyHistoryListResp.getUTime()) ? "--" : pTA.format$default(new Date(C33129mqd.valueOf(strategyHistoryListResp.getUTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
                            TacticsInsideItemData tacticsInsideItemData82 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AxsJAYsNCnLh), str27, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            TacticsInsideItemData tacticsInsideItemData83 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.launchdefault), str28, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                            arrayList8.add(tacticsInsideItemData77);
                            arrayList8.add(tacticsInsideItemData74);
                            if (!z4) {
                                arrayList8.add(tacticsInsideItemData75);
                                arrayList8.add(tacticsInsideItemData76);
                                arrayList8.add(tacticsInsideItemData78);
                                arrayList8.add(tacticsInsideItemData79);
                                arrayList8.add(tacticsInsideItemData80);
                                arrayList8.add(tacticsInsideItemData81);
                                arrayList8.add(tacticsInsideItemData82);
                                arrayList8.add(tacticsInsideItemData83);
                            }
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 1629187779:
                        if (orderType.equals("iceberg")) {
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.accessBackHandlerlambda0) + " " + AEQbTJ(strategyHistoryListResp, str17), AEQbTJ(strategyHistoryListResp), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPURsaBn) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RSmiaq) + " (" + str + ")", C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getSzLimit(), strategyHistoryListResp.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + str + ")", C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getActualSz(), strategyHistoryListResp.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + str + ")", C56033xvF.getBotAmount$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getSz(), strategyHistoryListResp.getCtVal(), false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isShowing), OLrzqt(strategyHistoryListResp.getOrderCTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onDestroy), OLrzqt(strategyHistoryListResp.getCancelTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        }
                        arrayList2 = arrayList8;
                        arrayList = arrayList2;
                        break;
                    case 1780188297:
                        if (orderType.equals("arbitrage")) {
                            java.util.List<ArbitrageOrderBean> instList = strategyHistoryListResp.getInstList();
                            if (instList != null) {
                                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                                for (java.lang.Object obj5 : instList) {
                                    if (Intrinsics.EZpvd(((ArbitrageOrderBean) obj5).getMajor(), java.lang.Boolean.TRUE)) {
                                        arrayList9.add(obj5);
                                    }
                                }
                                arbitrageOrderBean = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList9, 0);
                            } else {
                                arbitrageOrderBean = null;
                            }
                            java.util.List<ArbitrageOrderBean> instList2 = strategyHistoryListResp.getInstList();
                            if (instList2 != null) {
                                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                                for (java.lang.Object obj6 : instList2) {
                                    if (!Intrinsics.EZpvd(((ArbitrageOrderBean) obj6).getMajor(), java.lang.Boolean.TRUE)) {
                                        arrayList10.add(obj6);
                                    }
                                }
                                arbitrageOrderBean2 = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList10, 0);
                            } else {
                                arbitrageOrderBean2 = null;
                            }
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hlXVux), copydefault(arbitrageOrderBean), null, AEQbTJ(arbitrageOrderBean), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
                            arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hlXVux), copydefault(arbitrageOrderBean2), null, AEQbTJ(arbitrageOrderBean2), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
                            if (!z4) {
                                java.lang.String str29 = C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2invokeinlinedonDispose1) + " | " + C33070mpX.AYXKKw(C55688xof.Application.setOwners);
                                if (arbitrageOrderBean == null || (subOrderState = arbitrageOrderBean.getSubOrderState()) == null) {
                                    subOrderState = "";
                                }
                                java.lang.String strEZpvd = EZpvd(subOrderState);
                                if (arbitrageOrderBean == null || (state = arbitrageOrderBean.getState()) == null) {
                                    state = "";
                                }
                                arrayList8.add(new TacticsInsideItemData(str29, strEZpvd + " | " + copydefault(state), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                java.lang.String str30 = C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2invokeinlinedonDispose1) + " | " + C33070mpX.AYXKKw(C55688xof.Application.setOwners);
                                if (arbitrageOrderBean2 == null || (subOrderState2 = arbitrageOrderBean2.getSubOrderState()) == null) {
                                    subOrderState2 = "";
                                }
                                arrayList8.add(new TacticsInsideItemData(str30, EZpvd(subOrderState2) + " | " + copydefault((arbitrageOrderBean2 == null || (state2 = arbitrageOrderBean2.getState()) == null) ? "" : state2), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " | " + C33070mpX.AYXKKw(C55688xof.Application.getSerial), KWHzl(arbitrageOrderBean) + " | " + AhwBna(arbitrageOrderBean), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " | " + C33070mpX.AYXKKw(C55688xof.Application.getSerial), KWHzl(arbitrageOrderBean2) + " | " + AhwBna(arbitrageOrderBean2), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2) + " | " + C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), EZpvd(arbitrageOrderBean) + " | " + AYXKKw(arbitrageOrderBean), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2) + " | " + C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), EZpvd(arbitrageOrderBean2) + " | " + AYXKKw(arbitrageOrderBean2), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                if (EZpvd(arbitrageOrderBean, arbitrageOrderBean2)) {
                                    arrayList8.add(new TacticsInsideItemData(OLrzqt(arbitrageOrderBean).getFirst(), OLrzqt(arbitrageOrderBean).getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                    arrayList8.add(new TacticsInsideItemData(OLrzqt(arbitrageOrderBean2).getFirst(), OLrzqt(arbitrageOrderBean2).getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                                }
                            }
                            arrayList2 = arrayList8;
                            arrayList = arrayList2;
                        } else {
                            arrayList = arrayList8;
                        }
                        break;
                    default:
                        arrayList = arrayList8;
                        break;
                }
            } else {
                arrayList = arrayList8;
            }
            return arrayList;
        }
        StrategyPendingListResp strategyPendingListResp = (StrategyPendingListResp) obj;
        java.lang.String orderType2 = strategyPendingListResp.getOrderType();
        switch (orderType2.hashCode()) {
            case -1831183611:
                boolean z7 = z3;
                if (!orderType2.equals("spot_dca")) {
                    return arrayList8;
                }
                C54589xNz c54589xNz = C54589xNz.EZpvd;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
                BizInstrument suggestedInstrument$default2 = interfaceC54581xNrOLrzqt2 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderInstId(), null, null, 12, null) : null;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt3.OLrzqt(strategyPendingListResp.getOrderInstType())) == null) {
                    xmsGEmmrt = null;
                } else {
                    if (suggestedInstrument$default2 == null || (instFamily = suggestedInstrument$default2.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(instFamily);
                }
                java.lang.String botPnl$default5 = C56033xvF.getBotPnl$default(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
                C56068xvo c56068xvo5 = C56068xvo.copydefault;
                java.lang.String strCopydefault7 = c56068xvo5.copydefault(strategyPendingListResp.getOrderPnlRatio(), true);
                TacticsInsideItemData tacticsInsideItemData84 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", botPnl$default5, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                TacticsInsideItemData tacticsInsideItemData85 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault7, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPendingListResp.getOrderPnlRatio())), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                java.lang.String str31 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")";
                java.lang.String str32 = botPnl$default5 + " (" + strCopydefault7 + ")";
                int i5 = C32113mPz.Dialog.OcIXYQ;
                int iOLrzqt2 = C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null));
                TacticsUiConst.BotListSubItemType.BotSubTip.Default r1 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                TacticsInsideItemData tacticsInsideItemData86 = new TacticsInsideItemData(str31, str32, C33070mpX.AYXKKw(C55688xof.Application.gasjUx), iOLrzqt2, 0, 0, 0, i5, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.OnContextAvailableListener), null, null, null, null, null, 128368, null);
                GridStartTriggerType.Application application = GridStartTriggerType.Companion;
                java.util.List<DcaTriggerParam> triggerParams = strategyPendingListResp.getTriggerParams();
                java.lang.String strCopydefault8 = application.copydefault((triggerParams == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams)) == null) ? null : dcaTriggerParam.getTriggerStrategy());
                TacticsInsideItemData tacticsInsideItemData87 = strCopydefault8.length() > 0 ? new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), strCopydefault8, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null) : null;
                java.lang.String strAYXKKw9 = C33129mqd.OLrzqt((java.lang.Object) strategyPendingListResp.getMaxSafetyOrders(), (java.lang.Object) 0) ? C33070mpX.AYXKKw(C55688xof.Application.getResultContract) : C55962xto.OLrzqt(strategyPendingListResp.getFillSafetyOrders());
                java.lang.String strOLrzqt3 = C55962xto.OLrzqt(strategyPendingListResp.getMaxSafetyOrders());
                TacticsInsideItemData tacticsInsideItemData88 = tacticsInsideItemData87;
                TacticsInsideItemData tacticsInsideItemData89 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.spnCvw), strOLrzqt3, C33070mpX.AYXKKw(C55688xof.Application.DWgRXt), 0, 0, 0, 0, 0, null, r1, null, null, null, null, null, null, null, 130552, null);
                TacticsInsideItemData tacticsInsideItemData90 = new TacticsInsideItemData(AhwBna(str17), C56033xvF.fmtBotValueBySymbol$default((str17 == null || str2.length() == 0) ? strategyPendingListResp.getInvestmentccy() : str17, strategyPendingListResp.getInvestmentamt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), C33070mpX.AYXKKw(C55688xof.Application.DarRvM), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.DAIeex), null, null, null, null, null, 128376, null);
                TacticsInsideItemData tacticsInsideItemData91 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QKudOq), c56068xvo5.OLrzqt(xmsGEmmrt, strategyPendingListResp.getAvgPrice(), false), C33070mpX.AYXKKw(C55688xof.Application.DXXBbs), 0, 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.QKudOq), null, null, null, null, null, 128504, null);
                java.lang.String tpPrice = strategyPendingListResp.getTpPrice();
                if (tpPrice != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tpPrice) && xmsGEmmrt != null && (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(strategyPendingListResp.getTpPrice())) != null && (c54536xMLAEQbTJ2 = c54536xMLAYXKKw2.AEQbTJ(false)) != null && (c54536xMLCopydefault2 = c54536xMLAEQbTJ2.copydefault()) != null && (c54536xMLDjBIcL2 = c54536xMLCopydefault2.djBIcL()) != null) {
                    tacticsInsideItemData = tacticsInsideItemData91;
                    obj2 = "running";
                    java.lang.String safeString$default3 = C54536xML.toSafeString$default(c54536xMLDjBIcL2, false, 1, null);
                    java.lang.String str33 = safeString$default3 != null ? safeString$default3 : "--";
                    TacticsInsideItemData tacticsInsideItemData92 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Ufzxmz), str33, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String slPrice = strategyPendingListResp.getSlPrice();
                    TacticsInsideItemData tacticsInsideItemData93 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RXzakW) + " (" + str17 + ")", (slPrice != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slPrice) || xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(strategyPendingListResp.getSlPrice())) == null || (c54536xMLAEQbTJ = c54536xMLAYXKKw.AEQbTJ(false)) == null || (c54536xMLCopydefault = c54536xMLAEQbTJ.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "--" : safeString$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData94 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), C55962xto.OLrzqt(strategyPendingListResp.getCompleteCycles()), C33070mpX.AYXKKw(C55688xof.Application.ODWQjV), 0, 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), null, null, null, null, null, 128504, null);
                    java.lang.String strKWHzl10 = C55962xto.KWHzl(strategyPendingListResp.getArbitrageApy());
                    java.lang.String totalApy5 = strategyPendingListResp.getTotalApy();
                    java.lang.String strKWHzl11 = C55962xto.KWHzl(totalApy5 != null ? totalApy5 : "0");
                    TacticsInsideItemData tacticsInsideItemData95 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl10 + "\n" + strKWHzl11, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl10 + "\n" + strKWHzl11), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                    TacticsInsideItemData tacticsInsideItemData96 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyPendingListResp.getTotalCycleProfit(), strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getTotalCycleProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalCycleProfit()), 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                    java.lang.String botPrice$default = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? "--" : C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLastPrice(), false, false, null, null, 120, null);
                    TacticsInsideItemData tacticsInsideItemData97 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release) + " (" + str3 + ")", botPrice$default, null, 0, 0, 0, 0, 0, !Intrinsics.EZpvd((java.lang.Object) botPrice$default, (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    java.lang.String floatProfitInSourceCcy = !C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? strategyPendingListResp.getFloatProfitInSourceCcy() : strategyPendingListResp.getFloatProfit();
                    TacticsInsideItemData tacticsInsideItemData98 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), C55962xto.EZpvd(floatProfitInSourceCcy, strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getFloatProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.gGvvIC), C56033xvF.OLrzqt((java.lang.Object) floatProfitInSourceCcy), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), null, null, null, null, null, 128432, null);
                    TacticsInsideItemData tacticsInsideItemData99 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.giSNqX), strAYXKKw9 + "/" + strOLrzqt3, C33070mpX.AYXKKw(C55688xof.Application.flVtFt), 0, 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.giSNqX), null, null, null, null, null, 128504, null);
                    java.lang.String orderState = strategyPendingListResp.getOrderState();
                    iHashCode = orderState.hashCode();
                    if (iHashCode == -2127938992) {
                        if (iHashCode == 1316806720) {
                            tacticsInsideItemData2 = tacticsInsideItemData86;
                            tacticsInsideItemData3 = tacticsInsideItemData94;
                            tacticsInsideItemData4 = tacticsInsideItemData90;
                            tacticsInsideItemData5 = tacticsInsideItemData;
                            arrayList3 = arrayList8;
                            if (orderState.equals("starting")) {
                                arrayList3.add(tacticsInsideItemData4);
                                arrayList3.add(tacticsInsideItemData2);
                                if (!z7) {
                                    if (tacticsInsideItemData88 != null) {
                                        arrayList3.add(tacticsInsideItemData88);
                                    }
                                    arrayList3.add(tacticsInsideItemData89);
                                }
                                Unit unit8 = Unit.INSTANCE;
                            }
                        } else if (iHashCode == 1550783935 && orderState.equals(obj2)) {
                            arrayList3 = arrayList8;
                            arrayList3.add(tacticsInsideItemData90);
                            arrayList3.add(tacticsInsideItemData86);
                            if (!z7) {
                                arrayList3.add(tacticsInsideItemData96);
                                arrayList3.add(tacticsInsideItemData98);
                                arrayList3.add(tacticsInsideItemData95);
                                arrayList3.add(tacticsInsideItemData97);
                                arrayList3.add(tacticsInsideItemData92);
                                arrayList3.add(tacticsInsideItemData);
                                arrayList3.add(tacticsInsideItemData94);
                                arrayList3.add(tacticsInsideItemData99);
                            }
                            Unit unit9 = Unit.INSTANCE;
                        } else {
                            tacticsInsideItemData3 = tacticsInsideItemData94;
                            tacticsInsideItemData4 = tacticsInsideItemData90;
                            tacticsInsideItemData5 = tacticsInsideItemData;
                            arrayList3 = arrayList8;
                        }
                        arrayList3.add(tacticsInsideItemData4);
                        arrayList3.add(tacticsInsideItemData84);
                        if (!z7) {
                            arrayList3.add(tacticsInsideItemData85);
                            if (tacticsInsideItemData88 != null) {
                                arrayList3.add(tacticsInsideItemData88);
                            }
                            arrayList3.add(tacticsInsideItemData96);
                            arrayList3.add(tacticsInsideItemData98);
                            arrayList3.add(tacticsInsideItemData95);
                            arrayList3.add(tacticsInsideItemData97);
                            arrayList3.add(tacticsInsideItemData92);
                            arrayList3.add(tacticsInsideItemData93);
                            arrayList3.add(tacticsInsideItemData5);
                            arrayList3.add(tacticsInsideItemData3);
                            arrayList3.add(tacticsInsideItemData99);
                        }
                        Unit unit10 = Unit.INSTANCE;
                    } else {
                        tacticsInsideItemData2 = tacticsInsideItemData86;
                        tacticsInsideItemData3 = tacticsInsideItemData94;
                        tacticsInsideItemData4 = tacticsInsideItemData90;
                        tacticsInsideItemData5 = tacticsInsideItemData;
                        arrayList3 = arrayList8;
                        if (!orderState.equals("pending_signal")) {
                            arrayList3.add(tacticsInsideItemData4);
                            arrayList3.add(tacticsInsideItemData84);
                            if (!z7) {
                            }
                            Unit unit102 = Unit.INSTANCE;
                        }
                    }
                    return arrayList3;
                }
                tacticsInsideItemData = tacticsInsideItemData91;
                obj2 = "running";
                TacticsInsideItemData tacticsInsideItemData922 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Ufzxmz), str33, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                java.lang.String slPrice2 = strategyPendingListResp.getSlPrice();
                if (slPrice2 != null) {
                    TacticsInsideItemData tacticsInsideItemData932 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RXzakW) + " (" + str17 + ")", (slPrice2 != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) slPrice2) || xmsGEmmrt == null || (c54536xMLAYXKKw = xmsGEmmrt.AYXKKw(strategyPendingListResp.getSlPrice())) == null || (c54536xMLAEQbTJ = c54536xMLAYXKKw.AEQbTJ(false)) == null || (c54536xMLCopydefault = c54536xMLAEQbTJ.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "--" : safeString$default, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData942 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), C55962xto.OLrzqt(strategyPendingListResp.getCompleteCycles()), C33070mpX.AYXKKw(C55688xof.Application.ODWQjV), 0, 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.RlQdEF), null, null, null, null, null, 128504, null);
                    java.lang.String strKWHzl102 = C55962xto.KWHzl(strategyPendingListResp.getArbitrageApy());
                    java.lang.String totalApy52 = strategyPendingListResp.getTotalApy();
                    java.lang.String strKWHzl112 = C55962xto.KWHzl(totalApy52 != null ? totalApy52 : "0");
                    TacticsInsideItemData tacticsInsideItemData952 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl102 + "\n" + strKWHzl112, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl102 + "\n" + strKWHzl112), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                    TacticsInsideItemData tacticsInsideItemData962 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyPendingListResp.getTotalCycleProfit(), strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getTotalCycleProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalCycleProfit()), 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                    if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice())) {
                    }
                    TacticsInsideItemData tacticsInsideItemData972 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release) + " (" + str3 + ")", botPrice$default, null, 0, 0, 0, 0, 0, !Intrinsics.EZpvd((java.lang.Object) botPrice$default, (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    if (!C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy())) {
                    }
                    TacticsInsideItemData tacticsInsideItemData982 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), C55962xto.EZpvd(floatProfitInSourceCcy, strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getFloatProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.gGvvIC), C56033xvF.OLrzqt((java.lang.Object) floatProfitInSourceCcy), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), null, null, null, null, null, 128432, null);
                    TacticsInsideItemData tacticsInsideItemData992 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.giSNqX), strAYXKKw9 + "/" + strOLrzqt3, C33070mpX.AYXKKw(C55688xof.Application.flVtFt), 0, 0, 0, 0, 0, null, r1, null, C33070mpX.AYXKKw(C55688xof.Application.giSNqX), null, null, null, null, null, 128504, null);
                    java.lang.String orderState2 = strategyPendingListResp.getOrderState();
                    iHashCode = orderState2.hashCode();
                    if (iHashCode == -2127938992) {
                    }
                }
                return arrayList3;
            case -1574173039:
                if (orderType2.equals("infinite_grid")) {
                    C56068xvo c56068xvo6 = C56068xvo.copydefault;
                    java.lang.String strAEQbTJ2 = c56068xvo6.AEQbTJ(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderTotalPnl(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
                    TacticsInsideItemData tacticsInsideItemData100 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", strAEQbTJ2, null, C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getOrderTotalPnl()), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    java.lang.String strCopydefault9 = c56068xvo6.copydefault(strategyPendingListResp.getOrderPnlRatio(), true);
                    TacticsInsideItemData tacticsInsideItemData101 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault9, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(C33129mqd.divS$default(strategyPendingListResp.getTotalPnl(), strategyPendingListResp.getInvestment(), null, null, null, 14, null))), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData102 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", strAEQbTJ2 + " (" + strCopydefault9 + ")", null, C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getOrderTotalPnl()), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData103 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.HJWChPOZOJIj, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str17))), C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getMinPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData104 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResultlambda1), C56033xvF.fmtBotPnlPercent$default(strategyPendingListResp.getPerGridProfitRatio(), false, 0, 6, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = C54589xNz.EZpvd.OLrzqt();
                    BizInstrument suggestedInstrument$default3 = interfaceC54581xNrOLrzqt4 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt4, strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), null, null, 12, null) : null;
                    TacticsInsideItemData tacticsInsideItemData105 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2) + " (" + str17 + ")", C56033xvF.fmtBotValueBySymbol$default((suggestedInstrument$default3 == null || (quoteSymbol = suggestedInstrument$default3.getQuoteSymbol()) == null) ? "" : quoteSymbol, strategyPendingListResp.getInvestment(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData106 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandler), C55962xto.OLrzqt(strategyPendingListResp.getArbitrageNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData107 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), C55962xto.OLrzqt(strategyPendingListResp.getSignParams())), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData108 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalActivityResultRegistryOwner) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getOrderTpTriggerPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData109 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setContent) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getOrderSlTriggerPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String botPrice$default2 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? "--" : C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLastPrice(), false, false, null, null, 120, null);
                    TacticsInsideItemData tacticsInsideItemData110 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release), botPrice$default2, null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) botPrice$default2, (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    java.lang.String orderState3 = strategyPendingListResp.getOrderState();
                    int iHashCode3 = orderState3.hashCode();
                    if (iHashCode3 != -2127938992) {
                        if (iHashCode3 != 1316806720) {
                            if (iHashCode3 == 1550783935 && orderState3.equals("running")) {
                                arrayList8.add(tacticsInsideItemData105);
                                arrayList8.add(tacticsInsideItemData102);
                                arrayList8.add(tacticsInsideItemData106);
                                arrayList8.add(tacticsInsideItemData103);
                                arrayList8.add(tacticsInsideItemData110);
                            }
                        } else if (orderState3.equals("starting")) {
                            arrayList8.add(tacticsInsideItemData105);
                            arrayList8.add(tacticsInsideItemData102);
                            arrayList8.add(tacticsInsideItemData107);
                            arrayList8.add(tacticsInsideItemData103);
                            arrayList8.add(tacticsInsideItemData110);
                        }
                        arrayList8.add(tacticsInsideItemData100);
                        arrayList8.add(tacticsInsideItemData101);
                        arrayList8.add(tacticsInsideItemData103);
                        arrayList8.add(tacticsInsideItemData104);
                        arrayList8.add(tacticsInsideItemData105);
                        arrayList8.add(tacticsInsideItemData106);
                        arrayList8.add(tacticsInsideItemData107);
                        arrayList8.add(tacticsInsideItemData108);
                        arrayList8.add(tacticsInsideItemData109);
                    } else if (!orderState3.equals("pending_signal")) {
                        arrayList8.add(tacticsInsideItemData100);
                        arrayList8.add(tacticsInsideItemData101);
                        arrayList8.add(tacticsInsideItemData103);
                        arrayList8.add(tacticsInsideItemData104);
                        arrayList8.add(tacticsInsideItemData105);
                        arrayList8.add(tacticsInsideItemData106);
                        arrayList8.add(tacticsInsideItemData107);
                        arrayList8.add(tacticsInsideItemData108);
                        arrayList8.add(tacticsInsideItemData109);
                    }
                }
                arrayList3 = arrayList8;
                return arrayList3;
            case -1418042064:
                boolean z8 = z3;
                arrayList4 = arrayList8;
                if (orderType2.equals("ai_bot")) {
                    arrayList4.add(new TacticsInsideItemData(null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, java.lang.String.valueOf(z8), null, 98303, null));
                }
                arrayList3 = arrayList4;
                return arrayList3;
            case -1402017003:
                boolean z9 = z3;
                arrayList5 = arrayList8;
                if (orderType2.equals("contract_dca")) {
                    C54589xNz c54589xNz2 = C54589xNz.EZpvd;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz2.OLrzqt();
                    BizInstrument suggestedInstrument$default4 = interfaceC54581xNrOLrzqt5 != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt5, strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderInstId(), null, null, 12, null) : null;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt6 = c54589xNz2.OLrzqt();
                    if (interfaceC54581xNrOLrzqt6 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt6.OLrzqt(strategyPendingListResp.getOrderInstType())) == null) {
                        xmsGEmmrt2 = null;
                    } else {
                        if (suggestedInstrument$default4 == null || (instFamily2 = suggestedInstrument$default4.getInstFamily()) == null) {
                            instFamily2 = "";
                        }
                        xmsGEmmrt2 = abstractC54531xLwOLrzqt2.gEmmrt(instFamily2);
                    }
                    if (suggestedInstrument$default4 == null || (marginSymbol = suggestedInstrument$default4.getMarginSymbol()) == null) {
                        marginSymbol = "";
                    }
                    java.lang.String botPnl$default6 = C56033xvF.getBotPnl$default(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
                    C56068xvo c56068xvo7 = C56068xvo.copydefault;
                    java.lang.String strCopydefault10 = c56068xvo7.copydefault(strategyPendingListResp.getOrderPnlRatio(), true);
                    java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent);
                    if (suggestedInstrument$default4 != null) {
                        str8 = "/";
                        str9 = "--";
                        displayQuoteSymbol2 = suggestedInstrument$default4.getDisplayQuoteSymbol();
                    } else {
                        str8 = "/";
                        str9 = "--";
                        displayQuoteSymbol2 = null;
                    }
                    TacticsInsideItemData tacticsInsideItemData111 = new TacticsInsideItemData(strAYXKKw10 + " (" + displayQuoteSymbol2 + ")", botPnl$default6, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData112 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault10, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPendingListResp.getOrderPnlRatio())), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent);
                    if (suggestedInstrument$default4 != null) {
                        tacticsInsideItemData6 = tacticsInsideItemData111;
                        tacticsInsideItemData7 = tacticsInsideItemData112;
                        displayQuoteSymbol3 = suggestedInstrument$default4.getDisplayQuoteSymbol();
                    } else {
                        tacticsInsideItemData6 = tacticsInsideItemData111;
                        tacticsInsideItemData7 = tacticsInsideItemData112;
                        displayQuoteSymbol3 = null;
                    }
                    java.lang.String str34 = botPnl$default6 + " (" + strCopydefault10 + ")";
                    int i6 = C32113mPz.Dialog.OcIXYQ;
                    int iOLrzqt3 = C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null));
                    TacticsUiConst.BotListSubItemType.BotSubTip.Default r0 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                    TacticsInsideItemData tacticsInsideItemData113 = new TacticsInsideItemData(strAYXKKw11 + " (" + displayQuoteSymbol3 + ")", str34, C33070mpX.AYXKKw(C55688xof.Application.gasjUx), iOLrzqt3, 0, 0, 0, i6, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.OnContextAvailableListener), null, null, null, null, null, 128368, null);
                    java.lang.String strEZpvd2 = ContractDcaTriggerType.Companion.EZpvd(strategyPendingListResp.getDcaTriggerParams(), marginSymbol);
                    TacticsInsideItemData tacticsInsideItemData114 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), strEZpvd2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData115 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setShuffleModeEnabledRemoved), ContractDcaStopConditionType.Companion.copydefault(strategyPendingListResp.getTriggerParams(), suggestedInstrument$default4 != null ? suggestedInstrument$default4.getDisplayQuoteSymbol() : null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String orderFloatProfit = strategyPendingListResp.getOrderFloatProfit();
                    TacticsInsideItemData tacticsInsideItemData116 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ManagedActivityResultLauncher) + " (" + marginSymbol + ")", (orderFloatProfit == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) orderFloatProfit)) ? str9 : C56033xvF.fmtBotValueBySymbol$default(marginSymbol, strategyPendingListResp.getOrderFloatProfit(), RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null), C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfNUfqk), 0, 0, 0, 0, 0, null, r0, null, null, null, null, null, null, null, 130552, null);
                    TacticsInsideItemData tacticsInsideItemData117 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DsL) + " (" + strategyPendingListResp.getInvestmentccy() + ")", C56033xvF.fmtBotValueBySymbol$default(strategyPendingListResp.getInvestmentccy(), strategyPendingListResp.getInvestmentamt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), C33070mpX.AYXKKw(C55688xof.Application.fbC), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.DAIeex), null, null, null, null, null, 128376, null);
                    if (!C33129mqd.valueOf(strategyPendingListResp.getAvgPrice(), 0) && xmsGEmmrt2 != null && (c54536xMLAYXKKw3 = xmsGEmmrt2.AYXKKw(strategyPendingListResp.getAvgPrice())) != null && (c54536xMLAEQbTJ3 = c54536xMLAYXKKw3.AEQbTJ(false)) != null && (c54536xMLCopydefault3 = c54536xMLAEQbTJ3.copydefault()) != null && (c54536xMLDjBIcL3 = c54536xMLCopydefault3.djBIcL()) != null) {
                        tacticsInsideItemData8 = tacticsInsideItemData113;
                        tacticsInsideItemData9 = tacticsInsideItemData116;
                        java.lang.String safeString$default4 = C54536xML.toSafeString$default(c54536xMLDjBIcL3, false, 1, null);
                        if (safeString$default4 != null) {
                            str10 = safeString$default4;
                        }
                        tacticsInsideItemData10 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), str10, C33070mpX.AYXKKw(C55688xof.Application.DXXBbs), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), null, null, null, null, null, 128504, null);
                        java.lang.String fillSafetyOrders = (C33129mqd.OLrzqt((java.lang.Object) strategyPendingListResp.getMaxSafetyOrders(), (java.lang.Object) 0) || Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getOrdCopyType(), (java.lang.Object) "2")) ? !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getFillSafetyOrders()) ? str9 : strategyPendingListResp.getFillSafetyOrders() : C33070mpX.AYXKKw(C55688xof.Application.getResultContract);
                        TacticsInsideItemData tacticsInsideItemData118 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getStatusCode), fillSafetyOrders, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfbSiEC), 0, 0, 0, 0, 0, null, r0, null, null, null, null, null, null, null, 130552, null);
                        java.lang.String maxSafetyOrders = strategyPendingListResp.getMaxSafetyOrders();
                        java.lang.String maxSafetyOrders2 = (maxSafetyOrders != null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxSafetyOrders)) ? str9 : strategyPendingListResp.getMaxSafetyOrders();
                        TacticsInsideItemData tacticsInsideItemData119 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.OijiEz), maxSafetyOrders2, C33070mpX.AYXKKw(C55688xof.Application.aeJQwa), 0, 0, 0, 0, 0, null, r0, null, null, null, null, null, null, null, 130552, null);
                        tacticsInsideItemData11 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi21QueueItem), C56068xvo.getForcedClosePrice$default(c56068xvo7, strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderLiqPx(), strategyPendingListResp.getOrderDirection(), false, false, 48, null), C33070mpX.AYXKKw(C55688xof.Application.FSMca), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi21QueueItem), null, null, null, null, null, 128504, null);
                        if (C33129mqd.valueOf(strategyPendingListResp.getTpPrice(), 0) || xmsGEmmrt2 == null || (c54536xMLAYXKKw4 = xmsGEmmrt2.AYXKKw(strategyPendingListResp.getTpPrice())) == null) {
                            tacticsInsideItemData13 = tacticsInsideItemData10;
                            tacticsInsideItemData12 = tacticsInsideItemData11;
                        } else {
                            tacticsInsideItemData12 = tacticsInsideItemData11;
                            c54536xMLAEQbTJ4 = c54536xMLAYXKKw4.AEQbTJ(false);
                            if (c54536xMLAEQbTJ4 == null && (c54536xMLCopydefault4 = c54536xMLAEQbTJ4.copydefault()) != null && (c54536xMLDjBIcL4 = c54536xMLCopydefault4.djBIcL()) != null) {
                                tacticsInsideItemData13 = tacticsInsideItemData10;
                                tacticsInsideItemData14 = tacticsInsideItemData117;
                                java.lang.String safeString$default5 = C54536xML.toSafeString$default(c54536xMLDjBIcL4, false, 1, null);
                                java.lang.String str35 = safeString$default5 != null ? safeString$default5 : str9;
                                TacticsInsideItemData tacticsInsideItemData120 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hbZCHz), str35, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                if (C33129mqd.valueOf(strategyPendingListResp.getSlPrice(), 0)) {
                                    str11 = str9;
                                } else {
                                    java.lang.String strAEQbTJ3 = ContractDcaStopLossType.Companion.AEQbTJ(strategyPendingListResp.getStopLessMode());
                                    if (xmsGEmmrt2 == null || (c54536xMLAYXKKw5 = xmsGEmmrt2.AYXKKw(strategyPendingListResp.getSlPrice())) == null || (c54536xMLAEQbTJ5 = c54536xMLAYXKKw5.AEQbTJ(false)) == null || (c54536xMLCopydefault5 = c54536xMLAEQbTJ5.copydefault()) == null || (c54536xMLDjBIcL5 = c54536xMLCopydefault5.djBIcL()) == null || (safeString$default2 = C54536xML.toSafeString$default(c54536xMLDjBIcL5, false, 1, null)) == null) {
                                        safeString$default2 = str9;
                                    }
                                    str11 = strAEQbTJ3 + safeString$default2;
                                }
                                TacticsInsideItemData tacticsInsideItemData121 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gbIfDn) + " (" + marginSymbol + ")", str11, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                java.lang.String completeCycles2 = strategyPendingListResp.getCompleteCycles();
                                TacticsInsideItemData tacticsInsideItemData122 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), (completeCycles2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) completeCycles2)) ? str9 : strategyPendingListResp.getCompleteCycles(), C33070mpX.AYXKKw(C55688xof.Application.DcMfJKRKUgwx), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), null, null, null, null, null, 128504, null);
                                TacticsInsideItemData tacticsInsideItemData123 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyPendingListResp.getArbitragePnl(), strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getArbitrageProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitragePnl()), 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                                java.lang.String floatProfitInSourceCcy2 = !C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? strategyPendingListResp.getFloatProfitInSourceCcy() : strategyPendingListResp.getFloatProfit();
                                TacticsInsideItemData tacticsInsideItemData124 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), C55962xto.EZpvd(floatProfitInSourceCcy2, strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getFloatProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.gGvvIC), C56033xvF.OLrzqt((java.lang.Object) floatProfitInSourceCcy2), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), null, null, null, null, null, 128432, null);
                                java.lang.String strKWHzl12 = C55962xto.KWHzl(strategyPendingListResp.getArbitrageApy());
                                java.lang.String totalApy6 = strategyPendingListResp.getTotalApy();
                                java.lang.String strKWHzl13 = C55962xto.KWHzl(totalApy6 != null ? totalApy6 : "0");
                                TacticsInsideItemData tacticsInsideItemData125 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl12 + "\n" + strKWHzl13, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl12 + "\n" + strKWHzl13), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                                java.lang.String botPrice$default3 = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? str9 : C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLastPrice(), false, false, null, null, 120, null);
                                TacticsInsideItemData tacticsInsideItemData126 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release) + " (" + str3 + ")", botPrice$default3, null, 0, 0, 0, 0, 0, !Intrinsics.EZpvd((java.lang.Object) botPrice$default3, (java.lang.Object) str9) ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                                TacticsInsideItemData tacticsInsideItemData127 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.giSNqX), fillSafetyOrders + str8 + maxSafetyOrders2, C33070mpX.AYXKKw(C55688xof.Application.flVtFt), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.giSNqX), null, null, null, null, null, 128504, null);
                                java.lang.String orderState4 = strategyPendingListResp.getOrderState();
                                iHashCode2 = orderState4.hashCode();
                                if (iHashCode2 != -2127938992) {
                                    obj3 = "1";
                                    tacticsInsideItemData15 = tacticsInsideItemData8;
                                    arrayList4 = arrayList5;
                                    tacticsInsideItemData16 = tacticsInsideItemData12;
                                    tacticsInsideItemData17 = tacticsInsideItemData13;
                                    tacticsInsideItemData18 = tacticsInsideItemData14;
                                    break;
                                } else if (iHashCode2 == 1316806720) {
                                    obj3 = "1";
                                    tacticsInsideItemData15 = tacticsInsideItemData8;
                                    arrayList4 = arrayList5;
                                    tacticsInsideItemData16 = tacticsInsideItemData12;
                                    tacticsInsideItemData17 = tacticsInsideItemData13;
                                    tacticsInsideItemData18 = tacticsInsideItemData14;
                                    break;
                                } else if (iHashCode2 == 1550783935 && orderState4.equals("running")) {
                                    java.lang.String ordCopyType2 = strategyPendingListResp.getOrdCopyType();
                                    if (Intrinsics.EZpvd((java.lang.Object) ordCopyType2, (java.lang.Object) "2")) {
                                        arrayList4 = arrayList5;
                                        arrayList4.add(tacticsInsideItemData14);
                                        arrayList4.add(tacticsInsideItemData8);
                                        if (!z9) {
                                            arrayList4.add(tacticsInsideItemData123);
                                            arrayList4.add(tacticsInsideItemData124);
                                            arrayList4.add(tacticsInsideItemData125);
                                            arrayList4.add(tacticsInsideItemData126);
                                            arrayList4.add(tacticsInsideItemData13);
                                            arrayList4.add(tacticsInsideItemData122);
                                            arrayList4.add(tacticsInsideItemData12);
                                        }
                                        Unit unit11 = Unit.INSTANCE;
                                    } else {
                                        TacticsInsideItemData tacticsInsideItemData128 = tacticsInsideItemData8;
                                        arrayList4 = arrayList5;
                                        TacticsInsideItemData tacticsInsideItemData129 = tacticsInsideItemData12;
                                        TacticsInsideItemData tacticsInsideItemData130 = tacticsInsideItemData13;
                                        TacticsInsideItemData tacticsInsideItemData131 = tacticsInsideItemData14;
                                        if (Intrinsics.EZpvd((java.lang.Object) ordCopyType2, (java.lang.Object) "1")) {
                                            arrayList4.add(tacticsInsideItemData131);
                                            arrayList4.add(tacticsInsideItemData128);
                                            if (!z9) {
                                                arrayList4.add(tacticsInsideItemData123);
                                                arrayList4.add(tacticsInsideItemData124);
                                                arrayList4.add(tacticsInsideItemData125);
                                                arrayList4.add(tacticsInsideItemData126);
                                                arrayList4.add(tacticsInsideItemData120);
                                                arrayList4.add(tacticsInsideItemData130);
                                                arrayList4.add(tacticsInsideItemData122);
                                                arrayList4.add(tacticsInsideItemData127);
                                                arrayList4.add(tacticsInsideItemData129);
                                            }
                                            Unit unit12 = Unit.INSTANCE;
                                        } else {
                                            arrayList4.add(tacticsInsideItemData131);
                                            arrayList4.add(tacticsInsideItemData128);
                                            if (!z9) {
                                                arrayList4.add(tacticsInsideItemData123);
                                                arrayList4.add(tacticsInsideItemData124);
                                                arrayList4.add(tacticsInsideItemData125);
                                                arrayList4.add(tacticsInsideItemData126);
                                                arrayList4.add(tacticsInsideItemData120);
                                                arrayList4.add(tacticsInsideItemData130);
                                                arrayList4.add(tacticsInsideItemData122);
                                                arrayList4.add(tacticsInsideItemData127);
                                                arrayList4.add(tacticsInsideItemData129);
                                            }
                                            Unit unit13 = Unit.INSTANCE;
                                        }
                                    }
                                    Unit unit14 = Unit.INSTANCE;
                                    arrayList3 = arrayList4;
                                } else {
                                    TacticsInsideItemData tacticsInsideItemData132 = tacticsInsideItemData6;
                                    obj3 = "1";
                                    arrayList4 = arrayList5;
                                    tacticsInsideItemData16 = tacticsInsideItemData12;
                                    tacticsInsideItemData17 = tacticsInsideItemData13;
                                    tacticsInsideItemData18 = tacticsInsideItemData14;
                                    arrayList4.add(tacticsInsideItemData132);
                                    arrayList4.add(tacticsInsideItemData7);
                                    if (!z9) {
                                        java.lang.String ordCopyType3 = strategyPendingListResp.getOrdCopyType();
                                        if (Intrinsics.EZpvd((java.lang.Object) ordCopyType3, (java.lang.Object) "2")) {
                                            arrayList4.add(tacticsInsideItemData9);
                                            arrayList4.add(tacticsInsideItemData18);
                                            arrayList4.add(tacticsInsideItemData118);
                                            arrayList4.add(tacticsInsideItemData16);
                                            arrayList4.add(tacticsInsideItemData122);
                                        } else {
                                            TacticsInsideItemData tacticsInsideItemData133 = tacticsInsideItemData9;
                                            if (Intrinsics.EZpvd(ordCopyType3, obj3)) {
                                                if (strEZpvd2.length() > 0) {
                                                    arrayList4.add(tacticsInsideItemData114);
                                                }
                                                arrayList4.add(tacticsInsideItemData115);
                                                arrayList4.add(tacticsInsideItemData133);
                                                arrayList4.add(tacticsInsideItemData18);
                                                arrayList4.add(tacticsInsideItemData17);
                                                arrayList4.add(tacticsInsideItemData118);
                                                arrayList4.add(tacticsInsideItemData119);
                                                arrayList4.add(tacticsInsideItemData16);
                                                arrayList4.add(tacticsInsideItemData120);
                                                arrayList4.add(tacticsInsideItemData121);
                                                arrayList4.add(tacticsInsideItemData122);
                                            } else {
                                                if (strEZpvd2.length() > 0) {
                                                    arrayList4.add(tacticsInsideItemData114);
                                                }
                                                arrayList4.add(tacticsInsideItemData115);
                                                arrayList4.add(tacticsInsideItemData133);
                                                arrayList4.add(tacticsInsideItemData18);
                                                arrayList4.add(tacticsInsideItemData17);
                                                arrayList4.add(tacticsInsideItemData118);
                                                arrayList4.add(tacticsInsideItemData119);
                                                arrayList4.add(tacticsInsideItemData16);
                                                arrayList4.add(tacticsInsideItemData120);
                                                arrayList4.add(tacticsInsideItemData121);
                                                arrayList4.add(tacticsInsideItemData122);
                                            }
                                        }
                                    }
                                    Unit unit15 = Unit.INSTANCE;
                                    arrayList3 = arrayList4;
                                }
                                return arrayList3;
                            }
                            tacticsInsideItemData13 = tacticsInsideItemData10;
                        }
                        tacticsInsideItemData14 = tacticsInsideItemData117;
                        TacticsInsideItemData tacticsInsideItemData1202 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hbZCHz), str35, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                        if (C33129mqd.valueOf(strategyPendingListResp.getSlPrice(), 0)) {
                        }
                        TacticsInsideItemData tacticsInsideItemData1212 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gbIfDn) + " (" + marginSymbol + ")", str11, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                        java.lang.String completeCycles22 = strategyPendingListResp.getCompleteCycles();
                        if (completeCycles22 == null) {
                            TacticsInsideItemData tacticsInsideItemData1222 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), (completeCycles22 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) completeCycles22)) ? str9 : strategyPendingListResp.getCompleteCycles(), C33070mpX.AYXKKw(C55688xof.Application.DcMfJKRKUgwx), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKOmnske), null, null, null, null, null, 128504, null);
                            TacticsInsideItemData tacticsInsideItemData1232 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.access100), C55962xto.EZpvd(strategyPendingListResp.getArbitragePnl(), strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getArbitrageProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.OqFWZa), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitragePnl()), 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
                            if (!C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy())) {
                            }
                            TacticsInsideItemData tacticsInsideItemData1242 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), C55962xto.EZpvd(floatProfitInSourceCcy2, strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getFloatProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.gGvvIC), C56033xvF.OLrzqt((java.lang.Object) floatProfitInSourceCcy2), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange), null, null, null, null, null, 128432, null);
                            java.lang.String strKWHzl122 = C55962xto.KWHzl(strategyPendingListResp.getArbitrageApy());
                            java.lang.String totalApy62 = strategyPendingListResp.getTotalApy();
                            java.lang.String strKWHzl132 = C55962xto.KWHzl(totalApy62 != null ? totalApy62 : "0");
                            TacticsInsideItemData tacticsInsideItemData1252 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl122 + "\n" + strKWHzl132, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl122 + "\n" + strKWHzl132), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), null, null, null, null, null, 128448, null);
                            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice())) {
                            }
                            TacticsInsideItemData tacticsInsideItemData1262 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.createIntentactivity_release) + " (" + str3 + ")", botPrice$default3, null, 0, 0, 0, 0, 0, !Intrinsics.EZpvd((java.lang.Object) botPrice$default3, (java.lang.Object) str9) ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                            TacticsInsideItemData tacticsInsideItemData1272 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.giSNqX), fillSafetyOrders + str8 + maxSafetyOrders2, C33070mpX.AYXKKw(C55688xof.Application.flVtFt), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.giSNqX), null, null, null, null, null, 128504, null);
                            java.lang.String orderState42 = strategyPendingListResp.getOrderState();
                            iHashCode2 = orderState42.hashCode();
                            if (iHashCode2 != -2127938992) {
                            }
                        }
                        return arrayList3;
                    }
                    tacticsInsideItemData8 = tacticsInsideItemData113;
                    tacticsInsideItemData9 = tacticsInsideItemData116;
                    str10 = str9;
                    tacticsInsideItemData10 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), str10, C33070mpX.AYXKKw(C55688xof.Application.DXXBbs), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDcMfJK), null, null, null, null, null, 128504, null);
                    if (C33129mqd.OLrzqt((java.lang.Object) strategyPendingListResp.getMaxSafetyOrders(), (java.lang.Object) 0)) {
                        TacticsInsideItemData tacticsInsideItemData1182 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getStatusCode), fillSafetyOrders, C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfbSiEC), 0, 0, 0, 0, 0, null, r0, null, null, null, null, null, null, null, 130552, null);
                        java.lang.String maxSafetyOrders3 = strategyPendingListResp.getMaxSafetyOrders();
                        if (maxSafetyOrders3 != null) {
                            TacticsInsideItemData tacticsInsideItemData1192 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.OijiEz), maxSafetyOrders2, C33070mpX.AYXKKw(C55688xof.Application.aeJQwa), 0, 0, 0, 0, 0, null, r0, null, null, null, null, null, null, null, 130552, null);
                            tacticsInsideItemData11 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi21QueueItem), C56068xvo.getForcedClosePrice$default(c56068xvo7, strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderLiqPx(), strategyPendingListResp.getOrderDirection(), false, false, 48, null), C33070mpX.AYXKKw(C55688xof.Application.FSMca), 0, 0, 0, 0, 0, null, r0, null, C33070mpX.AYXKKw(C55688xof.Application.MediaSessionCompatApi21QueueItem), null, null, null, null, null, 128504, null);
                            if (C33129mqd.valueOf(strategyPendingListResp.getTpPrice(), 0)) {
                                tacticsInsideItemData12 = tacticsInsideItemData11;
                                c54536xMLAEQbTJ4 = c54536xMLAYXKKw4.AEQbTJ(false);
                                if (c54536xMLAEQbTJ4 == null) {
                                }
                                tacticsInsideItemData13 = tacticsInsideItemData10;
                                tacticsInsideItemData14 = tacticsInsideItemData117;
                                TacticsInsideItemData tacticsInsideItemData12022 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hbZCHz), str35, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                if (C33129mqd.valueOf(strategyPendingListResp.getSlPrice(), 0)) {
                                }
                                TacticsInsideItemData tacticsInsideItemData12122 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gbIfDn) + " (" + marginSymbol + ")", str11, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                                java.lang.String completeCycles222 = strategyPendingListResp.getCompleteCycles();
                            }
                        }
                    }
                    return arrayList3;
                }
                return arrayList5;
            case -1216369070:
                boolean z10 = z3;
                if (orderType2.equals("smart_portfolio")) {
                    java.lang.String tradeQuoteCcy4 = strategyPendingListResp.getTradeQuoteCcy();
                    java.lang.String stgyInvestCcy4 = strategyPendingListResp.getStgyInvestCcy();
                    if (tradeQuoteCcy4 == null || tradeQuoteCcy4.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy4)) {
                        tradeQuoteCcy4 = stgyInvestCcy4;
                    }
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DimenRes) + " (" + tradeQuoteCcy4 + ")", C56033xvF.fmtBotValueBySymbol$default(strategyPendingListResp.getStgyInvestCcy(), strategyPendingListResp.getStgyInvestAmt(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null));
                    java.lang.String botPnl$default7 = C56033xvF.getBotPnl$default(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderTotalPnl(), strategyPendingListResp.getStgyInvestCcy(), false, true, null, false, null, null, null, 2000, null);
                    java.lang.String strCopydefault11 = C56068xvo.copydefault.copydefault(strategyPendingListResp.getOrderPnlRatio(), true);
                    new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy4 + ")", botPnl$default7, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault11, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPendingListResp.getOrderPnlRatio())), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy4 + ")", botPnl$default7 + " (" + strCopydefault11 + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPendingListResp.getOrderPnlRatio())), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null));
                    if (!z10) {
                        kotlin.Pair<java.lang.String, java.lang.String> pairKWHzl = KWHzl(strategyPendingListResp);
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi21), pairKWHzl.getFirst(), null, 0, 0, 0, 0, 0, pairKWHzl.getSecond(), null, null, null, null, null, null, null, null, 130812, null));
                        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault3 = copydefault((BizTradeStrategyInfo) obj);
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.setElevation), pairCopydefault3.getFirst(), null, 0, 0, 0, 0, 0, pairCopydefault3.getSecond(), null, null, null, null, null, null, null, null, 130812, null));
                        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd2 = C55924xtC.Companion.EZpvd(strategyPendingListResp.getPortfolioBalType(), strategyPendingListResp.getPortfolioBalRatio(), strategyPendingListResp.getPortfolioBalInterval());
                        arrayList8.add(new TacticsInsideItemData(pairEZpvd2.component1(), pairEZpvd2.component2(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        kotlin.Pair<java.lang.String, java.lang.String> pairEZpvd3 = EZpvd(strategyPendingListResp);
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplApi212), pairEZpvd3.getFirst(), null, 0, 0, 0, 0, 0, pairEZpvd3.getSecond(), null, null, null, null, null, null, null, null, 130812, null));
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.f1070api), C55962xto.OLrzqt(strategyPendingListResp.getPortfolioBalNum()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    }
                }
                arrayList5 = arrayList8;
                return arrayList5;
            case -1148661171:
                java.lang.String botAmount$default6 = "--";
                if (orderType2.equals("smart_iceberg")) {
                    java.lang.String str36 = C33070mpX.AYXKKw(C55688xof.Application.setButtonPanelLayoutHint) + " (" + str + ")";
                    java.lang.String szLimit3 = strategyPendingListResp.getSzLimit();
                    if (szLimit3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) szLimit3)) {
                        botAmount$default4 = botAmount$default6;
                    } else {
                        java.lang.String instType6 = strategyPendingListResp.getInstType();
                        java.lang.String instId8 = strategyPendingListResp.getInstId();
                        java.lang.String szLimit4 = strategyPendingListResp.getSzLimit();
                        java.lang.String orderCtVal4 = strategyPendingListResp.getOrderCtVal();
                        botAmount$default4 = C56033xvF.getBotAmount$default(instType6, instId8, szLimit4, orderCtVal4 == null ? "" : orderCtVal4, false, null, 48, null);
                    }
                    arrayList8.add(new TacticsInsideItemData(str36, botAmount$default4, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String strAYXKKw12 = C33070mpX.AYXKKw(C55688xof.Application.setCustomTitle);
                    java.lang.String lmtOrderNumber3 = strategyPendingListResp.getLmtOrderNumber();
                    if (lmtOrderNumber3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lmtOrderNumber3)) {
                        strCopydefault2 = botAmount$default6;
                    } else {
                        xMR xmr4 = xMR.copydefault;
                        java.lang.String lmtOrderNumber4 = strategyPendingListResp.getLmtOrderNumber();
                        if (lmtOrderNumber4 == null) {
                            lmtOrderNumber4 = "";
                        }
                        strCopydefault2 = xmr4.copydefault(lmtOrderNumber4);
                    }
                    arrayList8.add(new TacticsInsideItemData(strAYXKKw12, strCopydefault2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController1) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String actualSz3 = strategyPendingListResp.getActualSz();
                    if (actualSz3 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) actualSz3)) {
                        botAmount$default5 = botAmount$default6;
                    } else {
                        java.lang.String instType7 = strategyPendingListResp.getInstType();
                        java.lang.String instId9 = strategyPendingListResp.getInstId();
                        java.lang.String actualSz4 = strategyPendingListResp.getActualSz();
                        java.lang.String orderCtVal5 = strategyPendingListResp.getOrderCtVal();
                        botAmount$default5 = C56033xvF.getBotAmount$default(instType7, instId9, actualSz4, orderCtVal5 == null ? "" : orderCtVal5, false, null, 48, null);
                    }
                    java.lang.String sz3 = strategyPendingListResp.getSz();
                    if (sz3 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sz3)) {
                        java.lang.String instType8 = strategyPendingListResp.getInstType();
                        java.lang.String instId10 = strategyPendingListResp.getInstId();
                        java.lang.String sz4 = strategyPendingListResp.getSz();
                        java.lang.String orderCtVal6 = strategyPendingListResp.getOrderCtVal();
                        botAmount$default6 = C56033xvF.getBotAmount$default(instType8, instId10, sz4, orderCtVal6 == null ? "" : orderCtVal6, false, null, 48, null);
                    }
                    arrayList8.add(new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.resolvePanel, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str))), botAmount$default5 + "/" + botAmount$default6, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getTriggerParams()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AlertController2), valueOf(strategyPendingListResp.getIceAggressiveNess()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                arrayList5 = arrayList8;
                return arrayList5;
            case -1086683216:
                c55930xtI = this;
                boolean z11 = z3;
                if (orderType2.equals("signal_bot")) {
                    java.lang.String botPnl$default8 = C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
                    C56068xvo c56068xvo8 = C56068xvo.copydefault;
                    java.lang.String totalPnlRatio2 = strategyPendingListResp.getTotalPnlRatio();
                    if (totalPnlRatio2 == null) {
                        totalPnlRatio2 = "";
                    }
                    TacticsInsideItemData tacticsInsideItemData134 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", botPnl$default8 + " (" + c56068xvo8.copydefault(totalPnlRatio2, true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    java.lang.String strAYXKKw13 = C33070mpX.AYXKKw(C55688xof.Application.closeSocket);
                    java.lang.String signalChanName2 = strategyPendingListResp.getSignalChanName();
                    TacticsInsideItemData tacticsInsideItemData135 = new TacticsInsideItemData(strAYXKKw13, signalChanName2 == null ? "" : signalChanName2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String strAYXKKw14 = C33070mpX.AYXKKw(C55688xof.Application.getSupportedCipherSuites);
                    xMR xmr5 = xMR.copydefault;
                    java.lang.String signalCount2 = strategyPendingListResp.getSignalCount();
                    if (signalCount2 == null) {
                        signalCount2 = "";
                    }
                    TacticsInsideItemData tacticsInsideItemData136 = new TacticsInsideItemData(strAYXKKw14, xmr5.copydefault(signalCount2), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    str12 = "";
                    java.lang.String strOLrzqt4 = C56033xvF.OLrzqt(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), str12);
                    java.lang.String str37 = C33070mpX.AYXKKw(C55688xof.Application.DztXDE) + " (" + strOLrzqt4 + ")";
                    java.lang.String totalAmt2 = strategyPendingListResp.getTotalAmt();
                    TacticsInsideItemData tacticsInsideItemData137 = new TacticsInsideItemData(str37, C56033xvF.fmtBotValueBySymbol$default(strOLrzqt4, totalAmt2 == null ? str12 : totalAmt2, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                    java.lang.String str38 = C33070mpX.AYXKKw(C55688xof.Application.OnBackPressedDispatcher2) + " (" + strOLrzqt4 + ")";
                    java.lang.String availableMargin = strategyPendingListResp.getAvailableMargin();
                    TacticsInsideItemData tacticsInsideItemData138 = new TacticsInsideItemData(str38, C56033xvF.fmtBotValueBySymbol$default(strOLrzqt4, availableMargin == null ? str12 : availableMargin, RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    if (C33129mqd.OLrzqt((java.lang.Object) strategyPendingListResp.getFloatingPnl(), (java.lang.Object) 0)) {
                        botPnl$default = C55962xto.OLrzqt("0");
                    } else {
                        java.lang.String instId11 = strategyPendingListResp.getInstId();
                        java.lang.String instType9 = strategyPendingListResp.getInstType();
                        java.lang.String floatingPnl = strategyPendingListResp.getFloatingPnl();
                        botPnl$default = C56033xvF.getBotPnl$default(instId11, instType9, floatingPnl == null ? str12 : floatingPnl, null, false, true, null, false, null, null, null, 2008, null);
                    }
                    java.lang.String str39 = botPnl$default;
                    java.lang.String str40 = C33070mpX.AYXKKw(C55688xof.Application.onLayoutChange) + " (" + C56033xvF.KWHzl(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), str12) + ")";
                    java.lang.String instId12 = strategyPendingListResp.getInstId();
                    java.lang.String instType10 = strategyPendingListResp.getInstType();
                    java.lang.String floatingPnl2 = strategyPendingListResp.getFloatingPnl();
                    TacticsInsideItemData tacticsInsideItemData139 = new TacticsInsideItemData(str40, str39, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(instId12, instType10, floatingPnl2 != null ? floatingPnl2 : "", null, 8, null)), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                    arrayList8.add(tacticsInsideItemData137);
                    arrayList8.add(tacticsInsideItemData134);
                    if (!z11) {
                        arrayList8.add(tacticsInsideItemData135);
                        arrayList8.add(tacticsInsideItemData139);
                        arrayList8.add(tacticsInsideItemData136);
                        arrayList8.add(tacticsInsideItemData138);
                    }
                    Unit unit16 = Unit.INSTANCE;
                }
                return arrayList8;
            case -557961837:
                boolean z12 = z3;
                if (orderType2.equals("smart_arbitrage")) {
                    c55930xtI = this;
                    arrayList8.addAll(c55930xtI.EZpvd((BizTradeStrategyInfo) obj, z12, str4, str5));
                } else {
                    c55930xtI = this;
                }
                return arrayList8;
            case -512749997:
                boolean z13 = z3;
                arrayList6 = arrayList8;
                if (orderType2.equals("contract_grid")) {
                    C55889xsU c55889xsU2 = C55889xsU.copydefault;
                    boolean z14 = c55889xsU2.copydefault(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getBotVo()) && c55889xsU2.AEQbTJ(strategyPendingListResp.getOrderAlgoId()) == CoinMarginedCcyDisplay.USDT.getIndex();
                    if (!z14 || (botVo2 = strategyPendingListResp.getBotVo()) == null || (contractGrid2 = botVo2.getContractGrid()) == null || (unitDisplayVO2 = contractGrid2.getUnitDisplayVO()) == null || (marginPerCcy2 = unitDisplayVO2.getMarginPerCcy()) == null) {
                        str13 = "USDT";
                        marginPerCcyVo = null;
                    } else {
                        str13 = "USDT";
                        marginPerCcyVo = marginPerCcy2.get(str13);
                    }
                    if (!z14 || marginPerCcyVo == null) {
                        str14 = str13;
                        pairAEQbTJ = ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null), strategyPendingListResp.getTotalPnl());
                    } else {
                        str14 = str13;
                        pairAEQbTJ = ActionBar.AEQbTJ(c55889xsU2.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), marginPerCcyVo.getTotalPnl()), marginPerCcyVo.getTotalPnl());
                    }
                    java.lang.String pnlRatio = (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getPnlRatio() : marginPerCcyVo.getPnlRatio();
                    C56068xvo c56068xvo9 = C56068xvo.copydefault;
                    java.lang.String strCopydefault12 = c56068xvo9.copydefault(pnlRatio, true);
                    C56066xvm c56066xvm2 = C56066xvm.EZpvd;
                    java.lang.String str41 = C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + c56066xvm2.KWHzl(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getCcy() : str14) + ")";
                    java.lang.String str42 = ActionBar.AEQbTJ(pairAEQbTJ) + " (" + strCopydefault12 + ")";
                    int i7 = C32113mPz.Dialog.OcIXYQ;
                    int iOLrzqt4 = C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), ActionBar.KWHzl(pairAEQbTJ), null, 8, null));
                    TacticsUiConst.BotListSubItemType.BotSubTip.Default r5 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
                    TacticsInsideItemData tacticsInsideItemData140 = new TacticsInsideItemData(str41, str42, C33070mpX.AYXKKw(C55688xof.Application.getCurrentPosition), iOLrzqt4, 0, 0, 0, i7, null, r5, null, null, null, null, null, null, null, 130416, null);
                    kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ7 = (!z14 || marginPerCcyVo == null) ? C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getGridProfitInSourceCcy(), null, false, true, null, false, null, null, null, 2008, null), strategyPendingListResp.getGridProfitInSourceCcy()) : ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getGridProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyPendingListResp.getGridProfit()) : ActionBar.AEQbTJ(c55889xsU2.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), marginPerCcyVo.getGridProfit()), marginPerCcyVo.getGridProfit());
                    java.lang.String strOLrzqt5 = C33129mqd.OLrzqt((java.lang.Object) ActionBar.KWHzl(pairAEQbTJ7), (java.lang.Object) 0) ? C55962xto.OLrzqt("0") : ActionBar.AEQbTJ(pairAEQbTJ7);
                    java.lang.String strKWHzl14 = C55962xto.KWHzl((!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getGridProfitRate() : marginPerCcyVo.getGridProfitRate());
                    java.lang.String strAYXKKw15 = C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent);
                    int i8 = C32113mPz.Dialog.fIwbmz;
                    int iOLrzqt5 = C56033xvF.OLrzqt((java.lang.Object) ActionBar.KWHzl(pairAEQbTJ7));
                    BalanceDetailInfoDto balanceDetails2 = strategyPendingListResp.getBalanceDetails();
                    if (balanceDetails2 == null) {
                        balanceDetails2 = BalanceDetailInfoDto.Companion.EZpvd();
                    }
                    TacticsInsideItemData tacticsInsideItemData141 = new TacticsInsideItemData(strAYXKKw15, strOLrzqt5, C33070mpX.AYXKKw(C55688xof.Application.selectTab), iOLrzqt5, 0, 0, i8, 0, "WithdrawProfitIcon", new TacticsUiConst.BotListSubItemType.BotSubTip.ContractGridProfitDetails(strategyPendingListResp.getAlgoId(), strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), balanceDetails2), null, null, null, null, strKWHzl14, null, null, 113840, null);
                    kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairAEQbTJ8 = (!z14 || marginPerCcyVo == null) ? C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getFloatProfitInSourceCcy(), null, false, true, null, false, null, null, null, 2008, null), strategyPendingListResp.getFloatProfitInSourceCcy()) : ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getFloatProfit(), null, false, true, null, false, null, null, null, 2008, null), strategyPendingListResp.getFloatProfit()) : ActionBar.AEQbTJ(c55889xsU2.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), marginPerCcyVo.getFloatProfit()), marginPerCcyVo.getFloatProfit());
                    TacticsInsideItemData tacticsInsideItemData142 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), ActionBar.AEQbTJ(pairAEQbTJ8) + "\n" + c56068xvo9.copydefault((!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getFloatProfitRate() : marginPerCcyVo.getFloatProfitRate(), true), C33070mpX.AYXKKw(C55688xof.Application.setCustomView), C56033xvF.OLrzqt((java.lang.Object) ActionBar.KWHzl(pairAEQbTJ8)), 0, 0, C32113mPz.Dialog.fIwbmz, 0, null, r5, null, C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), null, null, null, null, null, 128432, null);
                    java.lang.String arbitrageApy2 = (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getArbitrageApy() : marginPerCcyVo.getArbitrageApy();
                    java.lang.String totalApy7 = (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getTotalApy() : marginPerCcyVo.getTotalApy();
                    java.lang.String strKWHzl15 = C55962xto.KWHzl(arbitrageApy2);
                    java.lang.String strKWHzl16 = C55962xto.KWHzl(totalApy7 != null ? totalApy7 : "0");
                    TacticsInsideItemData tacticsInsideItemData143 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl15 + "\n" + strKWHzl16, C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded), C56033xvF.OLrzqt((java.lang.Object) arbitrageApy2), C56033xvF.OLrzqt((java.lang.Object) totalApy7), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl15 + "\n" + strKWHzl16), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, r5, null, null, null, null, null, null, null, 130496, null);
                    TacticsInsideItemData tacticsInsideItemData144 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getMinPx(), false, false, null, null, 120, null) + "-" + C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData145 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isEmpty), C55962xto.OLrzqt(strategyPendingListResp.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyPendingListResp.getArbitrageNum()) + " ", C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, r5, null, null, null, null, null, null, null, 130552, null);
                    if (!z14 || marginPerCcyVo == null) {
                        str15 = "";
                        pairAEQbTJ2 = ActionBar.AEQbTJ(C56033xvF.getBotPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderSz(), C56033xvF.OLrzqt(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), str15), false, false, null, false, null, null, null, 1984, null), strategyPendingListResp.getOrderSz());
                    } else {
                        pairAEQbTJ2 = ActionBar.AEQbTJ(c55889xsU2.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), marginPerCcyVo.getInvestment()), marginPerCcyVo.getInvestment());
                        str15 = "";
                    }
                    TacticsInsideItemData tacticsInsideItemData146 = new TacticsInsideItemData(AhwBna(c56066xvm2.OLrzqt(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getInvestCcy() : str14)), ActionBar.AEQbTJ(pairAEQbTJ2), C33070mpX.AYXKKw(C55688xof.Application.zXhzOT), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, r5, null, null, null, null, null, null, null, 130424, null);
                    if (!z14 || marginPerCcyVo == null) {
                        java.lang.String instId13 = strategyPendingListResp.getInstId();
                        java.lang.String instType11 = strategyPendingListResp.getInstType();
                        BalanceDetailInfoDto balanceDetails3 = strategyPendingListResp.getBalanceDetails();
                        java.lang.String botPnl$default9 = C56033xvF.getBotPnl$default(instId13, instType11, (balanceDetails3 == null || (extraMargin2 = balanceDetails3.getExtraMargin()) == null) ? str15 : extraMargin2, null, false, false, null, false, null, null, null, 2040, null);
                        BalanceDetailInfoDto balanceDetails4 = strategyPendingListResp.getBalanceDetails();
                        if (balanceDetails4 == null || (extraMargin = balanceDetails4.getExtraMargin()) == null) {
                            extraMargin = str15;
                        }
                        pairAEQbTJ3 = ActionBar.AEQbTJ(botPnl$default9, extraMargin);
                    } else {
                        pairAEQbTJ3 = ActionBar.AEQbTJ(c55889xsU2.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), marginPerCcyVo.getExtraMargin()), marginPerCcyVo.getExtraMargin());
                    }
                    java.lang.String str43 = str15;
                    TacticsInsideItemData tacticsInsideItemData147 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21PlaybackInfo) + " (" + c56066xvm2.KWHzl(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), (!z14 || marginPerCcyVo == null) ? strategyPendingListResp.getCcy() : str14) + ")", ActionBar.AEQbTJ(pairAEQbTJ3), C33070mpX.AYXKKw(C55688xof.Application.createOnBackInvokedCallbacklambda0), 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getInstId(), (java.lang.Object) "--") ? str43 : "extra_margin", r5, null, C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21PlaybackInfo), null, null, null, null, null, 128248, null);
                    TacticsInsideItemData tacticsInsideItemData148 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy), C56068xvo.getForcedClosePrice$default(c56068xvo9, strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLiqPx(), strategyPendingListResp.getDirection(), false, false, 48, null), C33070mpX.AYXKKw(C55688xof.Application.ParcelableVolumeInfo1), 0, 0, 0, 0, 0, null, r5, null, null, null, null, null, null, null, 130552, null);
                    java.lang.String botPrice$default4 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? "--" : C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLastPrice(), false, false, null, null, 120, null);
                    TacticsInsideItemData tacticsInsideItemData149 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.parameter) + " (" + str2 + ")", botPrice$default4, null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) botPrice$default4, (java.lang.Object) "--") ? str43 : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    TacticsInsideItemData tacticsInsideItemData150 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), C55962xto.OLrzqt(strategyPendingListResp.getSignParams())), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData151 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onKeyShortcut), C56068xvo.getProcessedPrice$default(c56068xvo9, strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getRunPx(), RoundingMode.UP, false, false, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String orderState5 = strategyPendingListResp.getOrderState();
                    switch (orderState5.hashCode()) {
                        case -2127938992:
                            tacticsInsideItemData19 = tacticsInsideItemData140;
                            tacticsInsideItemData20 = tacticsInsideItemData142;
                            tacticsInsideItemData21 = tacticsInsideItemData141;
                            tacticsInsideItemData22 = tacticsInsideItemData147;
                            obj4 = "2";
                            arrayList8 = arrayList6;
                            break;
                        case -1821824562:
                            tacticsInsideItemData19 = tacticsInsideItemData140;
                            tacticsInsideItemData20 = tacticsInsideItemData142;
                            tacticsInsideItemData21 = tacticsInsideItemData141;
                            tacticsInsideItemData22 = tacticsInsideItemData147;
                            obj4 = "2";
                            arrayList8 = arrayList6;
                            if (orderState5.equals("no_close_position")) {
                                arrayList8.add(tacticsInsideItemData146);
                                arrayList8.add(tacticsInsideItemData19);
                                if (!z13) {
                                    arrayList8.add(tacticsInsideItemData149);
                                    arrayList8.add(tacticsInsideItemData144);
                                    arrayList8.add(tacticsInsideItemData145);
                                    arrayList8.add(tacticsInsideItemData148);
                                    arrayList8.add(tacticsInsideItemData151);
                                }
                                Unit unit17 = Unit.INSTANCE;
                                c55930xtI = this;
                            }
                            tacticsInsideItemData23 = tacticsInsideItemData22;
                            arrayList8.add(tacticsInsideItemData146);
                            arrayList8.add(tacticsInsideItemData19);
                            if (!z13) {
                                if (Intrinsics.EZpvd(strategyPendingListResp.getOrdCopyType(), obj4)) {
                                    arrayList8.add(tacticsInsideItemData145);
                                    arrayList8.add(tacticsInsideItemData21);
                                    arrayList8.add(tacticsInsideItemData20);
                                    arrayList8.add(tacticsInsideItemData143);
                                    arrayList8.add(tacticsInsideItemData149);
                                    arrayList8.add(tacticsInsideItemData23);
                                    arrayList8.add(tacticsInsideItemData148);
                                } else {
                                    arrayList8.add(tacticsInsideItemData145);
                                    arrayList8.add(tacticsInsideItemData21);
                                    arrayList8.add(tacticsInsideItemData20);
                                    arrayList8.add(tacticsInsideItemData143);
                                    arrayList8.add(tacticsInsideItemData144);
                                    arrayList8.add(tacticsInsideItemData149);
                                    arrayList8.add(tacticsInsideItemData23);
                                    arrayList8.add(tacticsInsideItemData148);
                                    arrayList8.add(tacticsInsideItemData151);
                                }
                            }
                            Unit unit18 = Unit.INSTANCE;
                            c55930xtI = this;
                            break;
                        case 1316806720:
                            tacticsInsideItemData19 = tacticsInsideItemData140;
                            tacticsInsideItemData20 = tacticsInsideItemData142;
                            tacticsInsideItemData21 = tacticsInsideItemData141;
                            tacticsInsideItemData22 = tacticsInsideItemData147;
                            obj4 = "2";
                            arrayList8 = arrayList6;
                            break;
                        case 1550783935:
                            if (orderState5.equals("running")) {
                                java.lang.String ordCopyType4 = strategyPendingListResp.getOrdCopyType();
                                if (Intrinsics.EZpvd((java.lang.Object) ordCopyType4, (java.lang.Object) "2")) {
                                    arrayList8 = arrayList6;
                                    arrayList8.add(tacticsInsideItemData146);
                                    arrayList8.add(tacticsInsideItemData140);
                                    if (!z13) {
                                        arrayList8.add(tacticsInsideItemData141);
                                        arrayList8.add(tacticsInsideItemData142);
                                        arrayList8.add(tacticsInsideItemData143);
                                        arrayList8.add(tacticsInsideItemData149);
                                        arrayList8.add(tacticsInsideItemData145);
                                        arrayList8.add(tacticsInsideItemData147);
                                        arrayList8.add(tacticsInsideItemData148);
                                    }
                                    Unit unit19 = Unit.INSTANCE;
                                } else {
                                    arrayList8 = arrayList6;
                                    if (Intrinsics.EZpvd((java.lang.Object) ordCopyType4, (java.lang.Object) "3")) {
                                        arrayList8.add(tacticsInsideItemData146);
                                        arrayList8.add(tacticsInsideItemData140);
                                        if (!z13) {
                                            arrayList8.add(tacticsInsideItemData141);
                                            arrayList8.add(tacticsInsideItemData142);
                                            arrayList8.add(tacticsInsideItemData143);
                                            arrayList8.add(tacticsInsideItemData149);
                                            arrayList8.add(tacticsInsideItemData144);
                                            arrayList8.add(tacticsInsideItemData145);
                                            arrayList8.add(tacticsInsideItemData147);
                                            arrayList8.add(tacticsInsideItemData148);
                                            arrayList8.add(tacticsInsideItemData151);
                                        }
                                        Unit unit20 = Unit.INSTANCE;
                                    } else {
                                        arrayList8.add(tacticsInsideItemData146);
                                        arrayList8.add(tacticsInsideItemData140);
                                        if (!z13) {
                                            arrayList8.add(tacticsInsideItemData141);
                                            arrayList8.add(tacticsInsideItemData142);
                                            arrayList8.add(tacticsInsideItemData143);
                                            arrayList8.add(tacticsInsideItemData149);
                                            arrayList8.add(tacticsInsideItemData144);
                                            arrayList8.add(tacticsInsideItemData145);
                                            arrayList8.add(tacticsInsideItemData147);
                                            arrayList8.add(tacticsInsideItemData148);
                                            arrayList8.add(tacticsInsideItemData151);
                                        }
                                        Unit unit21 = Unit.INSTANCE;
                                    }
                                }
                                Unit unit22 = Unit.INSTANCE;
                                c55930xtI = this;
                                break;
                            }
                        default:
                            tacticsInsideItemData19 = tacticsInsideItemData140;
                            tacticsInsideItemData20 = tacticsInsideItemData142;
                            tacticsInsideItemData21 = tacticsInsideItemData141;
                            tacticsInsideItemData23 = tacticsInsideItemData147;
                            obj4 = "2";
                            arrayList8 = arrayList6;
                            arrayList8.add(tacticsInsideItemData146);
                            arrayList8.add(tacticsInsideItemData19);
                            if (!z13) {
                            }
                            Unit unit182 = Unit.INSTANCE;
                            c55930xtI = this;
                            break;
                    }
                    return arrayList8;
                }
                arrayList5 = arrayList6;
                return arrayList5;
            case -392358507:
                c55930xtI2 = this;
                arrayList7 = arrayList8;
                break;
            case 3181382:
                c55930xtI2 = this;
                if (orderType2.equals("grid")) {
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy())) {
                        java.lang.String str44 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) strategyPendingListResp.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null), 1);
                        if (str44 == null) {
                            str44 = "BTC";
                        }
                        java.lang.String sourceCcy = strategyPendingListResp.getSourceCcy();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str44);
                        str16 = "-";
                        sb.append(str16);
                        sb.append(sourceCcy);
                        instId = sb.toString();
                        java.lang.String strSourceCcy2 = strategyPendingListResp.sourceCcy();
                        java.lang.String sourceCcySz2 = strategyPendingListResp.getSourceCcySz();
                        if (sourceCcySz2 == null) {
                            sourceCcySz2 = "";
                        }
                        str17 = strSourceCcy2;
                        investment2 = sourceCcySz2;
                        z2 = true;
                    } else {
                        str16 = "-";
                        instId = strategyPendingListResp.getInstId();
                        investment2 = strategyPendingListResp.getInvestment();
                        z2 = false;
                    }
                    java.lang.String totalPnlInSourceCcy2 = z2 ? strategyPendingListResp.getTotalPnlInSourceCcy() : strategyPendingListResp.getTotalPnl();
                    C56068xvo c56068xvo10 = C56068xvo.copydefault;
                    boolean z15 = z3;
                    java.lang.String strAEQbTJ4 = c56068xvo10.AEQbTJ(instId, strategyPendingListResp.getInstType(), totalPnlInSourceCcy2, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
                    TacticsInsideItemData tacticsInsideItemData152 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", strAEQbTJ4, C33070mpX.AYXKKw(C55688xof.Application.containsKey), C56033xvF.OLrzqt((java.lang.Object) totalPnlInSourceCcy2), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, z2 ? TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl : TacticsUiConst.BotListSubItemType.BotSubNormal.KWHzl, null, C33070mpX.AYXKKw(C55688xof.Application.getCurrent), null, null, null, null, null, 128368, null);
                    java.lang.String pnlRatioInSourceCcy = z2 ? strategyPendingListResp.getPnlRatioInSourceCcy() : strategyPendingListResp.getPnlRatio();
                    java.lang.String strCopydefault13 = c56068xvo10.copydefault(pnlRatioInSourceCcy, true);
                    TacticsInsideItemData tacticsInsideItemData153 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault13, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(pnlRatioInSourceCcy)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData154 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", strAEQbTJ4 + " (" + strCopydefault13 + ")", C33070mpX.AYXKKw(C55688xof.Application.containsKey), C56033xvF.OLrzqt((java.lang.Object) totalPnlInSourceCcy2), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, z2 ? TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl : new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.getCurrent), C33070mpX.AYXKKw(C55688xof.Application.getCurrentPosition)), null, C33070mpX.AYXKKw(C55688xof.Application.getCurrent), null, null, null, null, null, 128368, null);
                    TacticsInsideItemData tacticsInsideItemData155 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCallerContract), C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getMinPx(), false, false, null, null, 120, null) + str16 + C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getMaxPx(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData156 = new TacticsInsideItemData(c55930xtI2.AhwBna(str17), C56033xvF.fmtBotValueBySymbol$default(str17, investment2, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), z2 ? C33070mpX.AYXKKw(C55688xof.Application.getBundle) : C33070mpX.AYXKKw(C55688xof.Application.skipToNext), 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.DAIeex), z2 ? C33070mpX.AYXKKw(C55688xof.Application.getBundle) : C33070mpX.AYXKKw(C55688xof.Application.skipToNext)), null, C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2), null, null, null, null, null, 128376, null);
                    java.lang.String botPrice$default5 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? "--" : C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getLastPrice(), false, false, null, null, 120, null);
                    TacticsInsideItemData tacticsInsideItemData157 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.parameter) + " (" + str3 + ")", botPrice$default5, null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) botPrice$default5, (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    TacticsInsideItemData tacticsInsideItemData158 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton), C55962xto.AEQbTJ(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), C55962xto.OLrzqt(strategyPendingListResp.getSignParams())), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String strKWHzl17 = C55962xto.KWHzl(strategyPendingListResp.getArbitrageApy());
                    java.lang.String totalApy8 = strategyPendingListResp.getTotalApy();
                    java.lang.String strKWHzl18 = C55962xto.KWHzl(totalApy8 != null ? totalApy8 : "0");
                    TacticsInsideItemData tacticsInsideItemData159 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), strKWHzl17 + "\n" + strKWHzl18, null, C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getArbitrageApy()), C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getTotalApy()), StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) (strKWHzl17 + "\n" + strKWHzl18), '\n', 0, false, 6, (java.lang.Object) null), 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.removeSubscription), C33070mpX.AYXKKw(C55688xof.Application.onChildrenLoaded)), null, null, null, null, null, null, null, 130500, null);
                    java.lang.String gridProfitInSourceCcy2 = C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? strategyPendingListResp.getGridProfitInSourceCcy() : strategyPendingListResp.getGridProfit();
                    TacticsInsideItemData tacticsInsideItemData160 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent), C55962xto.EZpvd(gridProfitInSourceCcy2, instId, strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getGridProfitRate()), C33070mpX.AYXKKw(C55688xof.Application.selectTab), C56033xvF.OLrzqt((java.lang.Object) gridProfitInSourceCcy2), 0, 0, 0, 0, !Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getOrdCopyType(), (java.lang.Object) "2") ? "WithdrawProfitIcon" : "", new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.onMenuKeyEvent), C33070mpX.AYXKKw(C55688xof.Application.selectTab)), null, null, null, null, null, null, null, 130288, null);
                    java.lang.String floatProfitInSourceCcy3 = C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getSourceCcy()) ? strategyPendingListResp.getFloatProfitInSourceCcy() : strategyPendingListResp.getFloatProfit();
                    TacticsInsideItemData tacticsInsideItemData161 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), C55962xto.EZpvd(floatProfitInSourceCcy3, instId, strategyPendingListResp.getInstType()) + "\n" + C55962xto.KWHzl(strategyPendingListResp.getFloatProfitRate()), null, C56033xvF.OLrzqt((java.lang.Object) floatProfitInSourceCcy3), 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.getLastPositionUpdateTime), C33070mpX.AYXKKw(C55688xof.Application.setCustomView)), null, null, null, null, null, null, null, 130548, null);
                    TacticsInsideItemData tacticsInsideItemData162 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isEmpty), C55962xto.OLrzqt(strategyPendingListResp.getAvgDailyArbitrageNum()) + "/" + C55962xto.OLrzqt(strategyPendingListResp.getArbitrageNum()) + " ", C33070mpX.AYXKKw(C55688xof.Application.putCallback), 0, 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.isEmpty), C33070mpX.AYXKKw(C55688xof.Application.putCallback)), null, null, null, null, null, null, null, 130552, null);
                    java.lang.String orderState6 = strategyPendingListResp.getOrderState();
                    int iHashCode4 = orderState6.hashCode();
                    if (iHashCode4 == -2127938992) {
                        arrayList7 = arrayList8;
                        break;
                    } else if (iHashCode4 == 1316806720) {
                        arrayList7 = arrayList8;
                        break;
                    } else if (iHashCode4 == 1550783935 && orderState6.equals("running")) {
                        java.lang.String ordCopyType5 = strategyPendingListResp.getOrdCopyType();
                        if (Intrinsics.EZpvd((java.lang.Object) ordCopyType5, (java.lang.Object) "2")) {
                            arrayList7 = arrayList8;
                            arrayList7.add(tacticsInsideItemData156);
                            arrayList7.add(tacticsInsideItemData154);
                            if (!z15) {
                                arrayList7.add(tacticsInsideItemData160);
                                arrayList7.add(tacticsInsideItemData161);
                                arrayList7.add(tacticsInsideItemData159);
                                arrayList7.add(tacticsInsideItemData157);
                                arrayList7.add(tacticsInsideItemData162);
                            }
                            Unit unit23 = Unit.INSTANCE;
                        } else {
                            arrayList7 = arrayList8;
                            if (Intrinsics.EZpvd((java.lang.Object) ordCopyType5, (java.lang.Object) "3")) {
                                arrayList7.add(tacticsInsideItemData156);
                                arrayList7.add(tacticsInsideItemData154);
                                if (!z15) {
                                    arrayList7.add(tacticsInsideItemData160);
                                    arrayList7.add(tacticsInsideItemData161);
                                    arrayList7.add(tacticsInsideItemData159);
                                    arrayList7.add(tacticsInsideItemData157);
                                    arrayList7.add(tacticsInsideItemData155);
                                    arrayList7.add(tacticsInsideItemData162);
                                }
                                Unit unit24 = Unit.INSTANCE;
                            } else {
                                arrayList7.add(tacticsInsideItemData156);
                                arrayList7.add(tacticsInsideItemData154);
                                if (!z15) {
                                    arrayList7.add(tacticsInsideItemData160);
                                    arrayList7.add(tacticsInsideItemData161);
                                    arrayList7.add(tacticsInsideItemData159);
                                    arrayList7.add(tacticsInsideItemData157);
                                    arrayList7.add(tacticsInsideItemData155);
                                    arrayList7.add(tacticsInsideItemData162);
                                }
                                Unit unit25 = Unit.INSTANCE;
                            }
                        }
                        Unit unit26 = Unit.INSTANCE;
                    } else {
                        TacticsInsideItemData tacticsInsideItemData163 = tacticsInsideItemData152;
                        arrayList7 = arrayList8;
                        arrayList7.add(tacticsInsideItemData163);
                        arrayList7.add(tacticsInsideItemData153);
                        if (!z15) {
                            if (Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getOrdCopyType(), (java.lang.Object) "2")) {
                                arrayList7.add(tacticsInsideItemData156);
                                arrayList7.add(tacticsInsideItemData160);
                                arrayList7.add(tacticsInsideItemData161);
                                arrayList7.add(tacticsInsideItemData159);
                                arrayList7.add(tacticsInsideItemData157);
                                arrayList7.add(tacticsInsideItemData162);
                            } else {
                                arrayList7.add(tacticsInsideItemData156);
                                arrayList7.add(tacticsInsideItemData160);
                                arrayList7.add(tacticsInsideItemData161);
                                arrayList7.add(tacticsInsideItemData159);
                                arrayList7.add(tacticsInsideItemData157);
                                arrayList7.add(tacticsInsideItemData155);
                                arrayList7.add(tacticsInsideItemData162);
                            }
                        }
                        Unit unit27 = Unit.INSTANCE;
                    }
                    return arrayList7;
                }
                return arrayList8;
            case 3573234:
                c55930xtI2 = this;
                if (orderType2.equals("twap")) {
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalFullyDrawnReporterOwner) + " " + c55930xtI2.KWHzl(strategyPendingListResp, str17), c55930xtI2.OLrzqt(strategyPendingListResp), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPRGtXKCDKRTZD) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1) + " (" + C33070mpX.AYXKKw(C55688xof.Application.XmlRes) + ")", xMR.copydefault.copydefault(strategyPendingListResp.getTimeInterval()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String str45 = C33070mpX.AYXKKw(C55688xof.Application.RSmiaq) + " (" + str + ")";
                    java.lang.String instType12 = strategyPendingListResp.getInstType();
                    java.lang.String instId14 = strategyPendingListResp.getInstId();
                    java.lang.String szLimit5 = strategyPendingListResp.getSzLimit();
                    java.lang.String orderCtVal7 = strategyPendingListResp.getOrderCtVal();
                    arrayList8.add(new TacticsInsideItemData(str45, C56033xvF.getBotAmount$default(instType12, instId14, szLimit5, orderCtVal7 == null ? "" : orderCtVal7, false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String strCopydefault14 = C33069mpW.copydefault(C55688xof.Application.resolvePanel, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str)));
                    java.lang.String instType13 = strategyPendingListResp.getInstType();
                    java.lang.String instId15 = strategyPendingListResp.getInstId();
                    java.lang.String actualSz5 = strategyPendingListResp.getActualSz();
                    java.lang.String orderCtVal8 = strategyPendingListResp.getOrderCtVal();
                    java.lang.String botAmount$default7 = C56033xvF.getBotAmount$default(instType13, instId15, actualSz5, orderCtVal8 == null ? "" : orderCtVal8, false, null, 48, null);
                    java.lang.String instType14 = strategyPendingListResp.getInstType();
                    java.lang.String instId16 = strategyPendingListResp.getInstId();
                    java.lang.String sz5 = strategyPendingListResp.getSz();
                    java.lang.String orderCtVal9 = strategyPendingListResp.getOrderCtVal();
                    arrayList8.add(new TacticsInsideItemData(strCopydefault14, botAmount$default7 + "/" + C56033xvF.getBotAmount$default(instType14, instId16, sz5, orderCtVal9 == null ? "" : orderCtVal9, false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                return arrayList8;
            case 541516771:
                c55930xtI2 = this;
                if (orderType2.equals("lvf_buy")) {
                    arrayList7 = arrayList8;
                    arrayList7.addAll(C54795xVp.OLrzqt(strategyPendingListResp.getStatus()) ? c55930xtI2.AEQbTJ((BizTradeStrategyInfo) obj, false) : c55930xtI2.OLrzqt((BizTradeStrategyInfo) obj, false));
                    arrayList6 = arrayList7;
                    arrayList5 = arrayList6;
                    return arrayList5;
                }
                return arrayList8;
            case 1165749981:
                if (orderType2.equals("recurring")) {
                    java.lang.String tradeQuoteCcy5 = strategyPendingListResp.getTradeQuoteCcy();
                    java.lang.String stgyInvestCcy5 = strategyPendingListResp.getStgyInvestCcy();
                    if (tradeQuoteCcy5 == null || tradeQuoteCcy5.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy5)) {
                        tradeQuoteCcy5 = stgyInvestCcy5;
                    }
                    java.lang.String botPnl$default10 = C56033xvF.getBotPnl$default(strategyPendingListResp.getOrderInstId(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getOrderTotalPnl(), tradeQuoteCcy5, false, true, null, false, null, null, null, 2000, null);
                    java.lang.String strCopydefault15 = C56068xvo.copydefault.copydefault(strategyPendingListResp.getOrderPnlRatio(), true);
                    TacticsInsideItemData tacticsInsideItemData164 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy5 + ")", botPnl$default10, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData165 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AnimatorRes), strCopydefault15, null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(strategyPendingListResp.getOrderPnlRatio())), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    TacticsInsideItemData tacticsInsideItemData166 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + tradeQuoteCcy5 + ")", botPnl$default10 + " (" + strCopydefault15 + ")", null, C56033xvF.OLrzqt((java.lang.Object) C56033xvF.getDigitPnl$default(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getOrderTotalPnl(), null, 8, null)), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    c55930xtI2 = this;
                    kotlin.Pair recurringList$default2 = getRecurringList$default(c55930xtI2, (BizTradeStrategyInfo) obj, false, 2, null);
                    TacticsInsideItemData tacticsInsideItemData167 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatErrorCode), (java.lang.String) recurringList$default2.getFirst(), null, 0, 0, 0, 0, 0, (java.lang.String) recurringList$default2.getSecond(), null, null, null, null, null, null, null, null, 130812, null);
                    java.lang.String strCopydefault16 = strategyPendingListResp.getCycles().length() == 0 ? "--" : xMR.copydefault.copydefault(strategyPendingListResp.getCycles());
                    RecurringBuyDetails recurringBuyDetails2 = strategyPendingListResp.getRecurringBuyDetails();
                    RecurringBuyDto recurringBuyDtoAEQbTJ2 = recurringBuyDetails2 != null ? recurringBuyDetails2.AEQbTJ() : null;
                    java.lang.String strAYXKKw16 = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatApi21Callback);
                    C56046xvS c56046xvS2 = C56046xvS.AEQbTJ;
                    java.lang.String recPeriod2 = strategyPendingListResp.getRecPeriod();
                    java.lang.String recDay2 = strategyPendingListResp.getRecDay();
                    java.lang.String recTime2 = strategyPendingListResp.getRecTime();
                    java.lang.String recHourly2 = strategyPendingListResp.getRecHourly();
                    java.lang.String string2 = (recurringBuyDtoAEQbTJ2 == null || (recurringTimeType2 = recurringBuyDtoAEQbTJ2.getRecurringTimeType()) == null) ? null : recurringTimeType2.toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                    java.lang.String recurringTimeMinutes2 = recurringBuyDtoAEQbTJ2 != null ? recurringBuyDtoAEQbTJ2.getRecurringTimeMinutes() : null;
                    if (recurringTimeMinutes2 == null) {
                        recurringTimeMinutes2 = "";
                    }
                    TacticsInsideItemData tacticsInsideItemData168 = new TacticsInsideItemData(strAYXKKw16, c56046xvS2.copydefault(recPeriod2, recDay2, recTime2, recHourly2, string2, recurringTimeMinutes2) + "/" + strCopydefault16, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData169 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.isAvailable), Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getState(), (java.lang.Object) "pause") ? "--" : c56046xvS2.copydefault(strategyPendingListResp.getRecNextInvestTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String str46 = C33070mpX.AYXKKw(C55688xof.Application.setState) + " (" + tradeQuoteCcy5 + ")";
                    java.lang.String stgyInvestCcy6 = strategyPendingListResp.getStgyInvestCcy();
                    java.lang.String stgyAmt2 = strategyPendingListResp.getStgyAmt();
                    RoundingMode roundingMode2 = RoundingMode.UP;
                    TacticsInsideItemData tacticsInsideItemData170 = new TacticsInsideItemData(str46, C56033xvF.fmtBotValueBySymbol$default(stgyInvestCcy6, stgyAmt2, roundingMode2, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData171 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.enumMapping) + " (" + tradeQuoteCcy5 + ")", C56033xvF.fmtBotValueBySymbol$default(strategyPendingListResp.getStgyInvestCcy(), strategyPendingListResp.getStgyInvestAmt(), roundingMode2, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                    kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault4 = C55961xtn.Companion.copydefault(strategyPendingListResp.getRecList(), strategyPendingListResp.getOrderInstType(), strategyPendingListResp.getStgyInvestCcy());
                    TacticsInsideItemData tacticsInsideItemData172 = new TacticsInsideItemData(pairCopydefault4.component1(), pairCopydefault4.component2(), null, 0, 0, 0, 0, 0, strategyPendingListResp.getRecList().size() > 2 ? "bot_sub_recurring_avg_price" : "", null, null, null, null, null, null, null, null, 130812, null);
                    boolean z16 = strategyPendingListResp.getRecList().size() == 1;
                    java.lang.String state5 = strategyPendingListResp.getState();
                    if (Intrinsics.EZpvd((java.lang.Object) state5, (java.lang.Object) "live")) {
                        if (z16) {
                            arrayList8.add(tacticsInsideItemData171);
                            arrayList8.add(tacticsInsideItemData166);
                            if (!z3) {
                                arrayList8.add(tacticsInsideItemData168);
                                arrayList8.add(tacticsInsideItemData170);
                                arrayList8.add(tacticsInsideItemData172);
                                arrayList8.add(tacticsInsideItemData169);
                            }
                            Unit unit28 = Unit.INSTANCE;
                        } else {
                            arrayList8.add(tacticsInsideItemData171);
                            arrayList8.add(tacticsInsideItemData166);
                            if (!z3) {
                                arrayList8.add(tacticsInsideItemData167);
                                arrayList8.add(tacticsInsideItemData168);
                                arrayList8.add(tacticsInsideItemData170);
                                arrayList8.add(tacticsInsideItemData172);
                                arrayList8.add(tacticsInsideItemData169);
                            }
                            Unit unit29 = Unit.INSTANCE;
                        }
                    } else if (!Intrinsics.EZpvd((java.lang.Object) state5, (java.lang.Object) "pause")) {
                        arrayList8.add(tacticsInsideItemData164);
                        arrayList8.add(tacticsInsideItemData165);
                        if (!z3) {
                            arrayList8.add(tacticsInsideItemData167);
                            arrayList8.add(tacticsInsideItemData168);
                            arrayList8.add(tacticsInsideItemData169);
                            arrayList8.add(tacticsInsideItemData170);
                            arrayList8.add(tacticsInsideItemData171);
                            arrayList8.add(tacticsInsideItemData172);
                        }
                        Unit unit30 = Unit.INSTANCE;
                    } else if (z16) {
                        arrayList8.add(tacticsInsideItemData171);
                        arrayList8.add(tacticsInsideItemData166);
                        if (!z3) {
                            arrayList8.add(tacticsInsideItemData168);
                            arrayList8.add(tacticsInsideItemData170);
                            arrayList8.add(tacticsInsideItemData172);
                            arrayList8.add(tacticsInsideItemData169);
                        }
                        Unit unit31 = Unit.INSTANCE;
                    } else {
                        arrayList8.add(tacticsInsideItemData171);
                        arrayList8.add(tacticsInsideItemData166);
                        if (!z3) {
                            arrayList8.add(tacticsInsideItemData167);
                            arrayList8.add(tacticsInsideItemData168);
                            arrayList8.add(tacticsInsideItemData170);
                            arrayList8.add(tacticsInsideItemData172);
                            arrayList8.add(tacticsInsideItemData169);
                        }
                        Unit unit32 = Unit.INSTANCE;
                    }
                } else {
                    c55930xtI2 = this;
                }
                return arrayList8;
            case 1485620813:
                if (orderType2.equals("dcd_bot")) {
                    strategyPendingListResp.setInstType("SPOT");
                    java.lang.String str47 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getAlternateCurrency()) ? "" : " (" + strategyPendingListResp.getAlternateCurrency() + ")";
                    java.lang.String totalPnl2 = strategyPendingListResp.getTotalPnl();
                    if (totalPnl2.length() == 0) {
                        totalPnl2 = strategyPendingListResp.getDcdPnl();
                    }
                    C56068xvo c56068xvo11 = C56068xvo.copydefault;
                    java.lang.String strAEQbTJ5 = c56068xvo11.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), totalPnl2, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
                    java.lang.String dcdArbApy2 = strategyPendingListResp.getDcdArbApy();
                    TacticsInsideItemData tacticsInsideItemData173 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.gUEfcq), c56068xvo11.copydefault(dcdArbApy2, true), C33070mpX.AYXKKw(C55688xof.Application.fsSxsn), C56033xvF.OLrzqt((java.lang.Object) C56033xvF.KWHzl(dcdArbApy2)), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl, null, C33070mpX.AYXKKw(C55688xof.Application.gUEfcq), null, null, null, null, null, 128496, null);
                    java.lang.String pnlRatio2 = strategyPendingListResp.getPnlRatio();
                    if (pnlRatio2.length() == 0) {
                        pnlRatio2 = strategyPendingListResp.getDcdPnlRatio();
                    }
                    TacticsInsideItemData tacticsInsideItemData174 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getCurrent) + " (" + str17 + ")", strAEQbTJ5 + " (" + c56068xvo11.copydefault(pnlRatio2, true) + ")", null, C56033xvF.OLrzqt((java.lang.Object) totalPnl2), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130932, null);
                    java.lang.String instId17 = strategyPendingListResp.getInstId();
                    java.lang.String instType15 = strategyPendingListResp.getInstType();
                    java.lang.String arbPnl2 = strategyPendingListResp.getArbPnl();
                    java.lang.String strAEQbTJ6 = c56068xvo11.AEQbTJ(instId17, instType15, arbPnl2 == null ? "" : arbPnl2, (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null);
                    TacticsInsideItemData tacticsInsideItemData175 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.sTzBva), strAEQbTJ6, null, C56033xvF.OLrzqt((java.lang.Object) strAEQbTJ6), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                    TacticsInsideItemData tacticsInsideItemData176 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.RvdRAu) + str47, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getDcdNotional()) ? "--" : C56033xvF.fmtBotValueBySymbol$default(strategyPendingListResp.getAlternateCurrency(), strategyPendingListResp.getDcdNotional(), RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null), null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
                    java.lang.String instType16 = strategyPendingListResp.getInstType();
                    java.lang.String instId18 = strategyPendingListResp.getInstId();
                    java.lang.String str48 = instId18 == null ? "" : instId18;
                    java.lang.String lastPrice = strategyPendingListResp.getLastPrice();
                    TacticsInsideItemData tacticsInsideItemData177 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.parameter) + " (" + strategyPendingListResp.getNotionalCcy() + ")", StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getLastPrice()) ? "--" : C56033xvF.getBotPrice$default(instType16, str48, lastPrice == null ? "" : lastPrice, false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getLastPrice(), (java.lang.Object) "--") ? "" : "last_price", null, null, null, null, null, null, null, null, 130812, null);
                    TacticsInsideItemData tacticsInsideItemData178 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zYHWMc), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyPendingListResp.getDcdCycle()) ? "--" : C33129mqd.gEmmrt(strategyPendingListResp.getDcdCycle(), 0) ? "0" : strategyPendingListResp.getDcdCycle(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    java.lang.String currency = strategyPendingListResp.getCurrency();
                    TacticsInsideItemData tacticsInsideItemData179 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGUQLIDGUQLI) + ((currency == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) currency)) ? "" : " (" + strategyPendingListResp.getCurrency() + ")"), xMR.copydefault.copydefault(strategyPendingListResp.getCurrencyBal(), 8), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData180 = new TacticsInsideItemData(java.lang.String.valueOf(C33070mpX.AYXKKw(C55688xof.Application.swzYdv)), C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getDcdAvgCost(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    TacticsInsideItemData tacticsInsideItemData181 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zAEkPU), c56068xvo11.AEQbTJ(strategyPendingListResp.getInstId(), strategyPendingListResp.getInstType(), strategyPendingListResp.getDcdCoinPnl(), (536 & 8) != 0 ? "" : null, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : null), null, C56033xvF.OLrzqt((java.lang.Object) strategyPendingListResp.getDcdCoinPnl()), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                    java.lang.String strMulS$default = C33129mqd.mulS$default(strategyPendingListResp.getAbsYieldPercentage(), strategyPendingListResp.getSettlementAmount(), null, null, null, 14, null);
                    TacticsInsideItemData tacticsInsideItemData182 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.hlkKmr, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strategyPendingListResp.settlementCcy()))), C56033xvF.copydefault(strMulS$default, strategyPendingListResp.settlementCcy(), (88 & 4) != 0 ? false : false, (88 & 8) != 0 ? null : "8", (88 & 16) != 0 ? false : false, (88 & 32) == 0, (88 & 64) == 0 ? null : null), null, C56033xvF.OLrzqt((java.lang.Object) strMulS$default), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null);
                    java.lang.String instType17 = strategyPendingListResp.getInstType();
                    java.lang.String instId19 = strategyPendingListResp.getInstId();
                    java.lang.String curStrike = strategyPendingListResp.getCurStrike();
                    TacticsInsideItemData tacticsInsideItemData183 = new TacticsInsideItemData(Intrinsics.EZpvd((java.lang.Object) strategyPendingListResp.getDcdState(), (java.lang.Object) "profit_snipping") ? C33070mpX.AYXKKw(C55688xof.Application.DGUQLIdZmdUa) : C33070mpX.AYXKKw(C55688xof.Application.hvKCwS), C56033xvF.getBotPrice$default(instType17, instId19, curStrike == null ? "" : curStrike, false, false, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                    arrayList8.add(tacticsInsideItemData176);
                    arrayList8.add(tacticsInsideItemData174);
                    if (!z3) {
                        if (!strategyPendingListResp.isHistoryOrder()) {
                            arrayList8.add(tacticsInsideItemData182);
                        }
                        arrayList8.add(tacticsInsideItemData173);
                        arrayList8.add(tacticsInsideItemData175);
                        if (C33129mqd.AhwBna(strategyPendingListResp.getCurrencyBal(), 0)) {
                            arrayList8.add(tacticsInsideItemData179);
                            arrayList8.add(tacticsInsideItemData178);
                            arrayList8.add(tacticsInsideItemData181);
                            arrayList8.add(tacticsInsideItemData180);
                        } else {
                            arrayList8.add(tacticsInsideItemData178);
                            arrayList8.add(tacticsInsideItemData183);
                        }
                        arrayList8.add(tacticsInsideItemData177);
                    }
                    c55930xtI2 = this;
                    return arrayList8;
                }
                c55930xtI2 = this;
                return arrayList8;
            case 1629187779:
                if (orderType2.equals("iceberg")) {
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.accessBackHandlerlambda0) + " " + KWHzl(strategyPendingListResp, str17), OLrzqt(strategyPendingListResp), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.HJWChPURsaBn) + " (" + str17 + ")", C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getPxLimit(), false, false, null, null, 120, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String str49 = C33070mpX.AYXKKw(C55688xof.Application.RSmiaq) + " (" + str + ")";
                    java.lang.String instType18 = strategyPendingListResp.getInstType();
                    java.lang.String instId20 = strategyPendingListResp.getInstId();
                    java.lang.String szLimit6 = strategyPendingListResp.getSzLimit();
                    java.lang.String orderCtVal10 = strategyPendingListResp.getOrderCtVal();
                    arrayList8.add(new TacticsInsideItemData(str49, C56033xvF.getBotAmount$default(instType18, instId20, szLimit6, orderCtVal10 == null ? "" : orderCtVal10, false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String str50 = C33070mpX.AYXKKw(C55688xof.Application.validateSHA256) + " (" + str + ")";
                    java.lang.String instType19 = strategyPendingListResp.getInstType();
                    java.lang.String instId21 = strategyPendingListResp.getInstId();
                    java.lang.String actualSz6 = strategyPendingListResp.getActualSz();
                    java.lang.String orderCtVal11 = strategyPendingListResp.getOrderCtVal();
                    arrayList8.add(new TacticsInsideItemData(str50, C56033xvF.getBotAmount$default(instType19, instId21, actualSz6, orderCtVal11 == null ? "" : orderCtVal11, false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                    java.lang.String str51 = C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt) + " (" + str + ")";
                    java.lang.String instType20 = strategyPendingListResp.getInstType();
                    java.lang.String instId22 = strategyPendingListResp.getInstId();
                    java.lang.String sz6 = strategyPendingListResp.getSz();
                    java.lang.String orderCtVal12 = strategyPendingListResp.getOrderCtVal();
                    arrayList8.add(new TacticsInsideItemData(str51, C56033xvF.getBotAmount$default(instType20, instId22, sz6, orderCtVal12 == null ? "" : orderCtVal12, false, null, 48, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                }
                c55930xtI2 = this;
                return arrayList8;
            case 1780188297:
                if (orderType2.equals("arbitrage")) {
                    java.util.List<ArbitrageOrderBean> instList3 = strategyPendingListResp.getInstList();
                    if (instList3 != null) {
                        java.util.ArrayList arrayList11 = new java.util.ArrayList();
                        for (java.lang.Object obj7 : instList3) {
                            if (Intrinsics.EZpvd(((ArbitrageOrderBean) obj7).getMajor(), java.lang.Boolean.TRUE)) {
                                arrayList11.add(obj7);
                            }
                        }
                        arbitrageOrderBean3 = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList11, 0);
                    } else {
                        arbitrageOrderBean3 = null;
                    }
                    java.util.List<ArbitrageOrderBean> instList4 = strategyPendingListResp.getInstList();
                    if (instList4 != null) {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        for (java.lang.Object obj8 : instList4) {
                            if (!Intrinsics.EZpvd(((ArbitrageOrderBean) obj8).getMajor(), java.lang.Boolean.TRUE)) {
                                arrayList12.add(obj8);
                            }
                        }
                        arbitrageOrderBean4 = (ArbitrageOrderBean) CollectionsKt___CollectionsKt.AkhnZx(arrayList12, 0);
                    } else {
                        arbitrageOrderBean4 = null;
                    }
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hlXVux), copydefault(arbitrageOrderBean3), null, AEQbTJ(arbitrageOrderBean3), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
                    arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.hlXVux), copydefault(arbitrageOrderBean4), null, AEQbTJ(arbitrageOrderBean4), 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131060, null));
                    if (!z3) {
                        java.lang.String str52 = C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2invokeinlinedonDispose1) + " | " + C33070mpX.AYXKKw(C55688xof.Application.setOwners);
                        if (arbitrageOrderBean3 == null || (subOrderState3 = arbitrageOrderBean3.getSubOrderState()) == null) {
                            subOrderState3 = "";
                        }
                        java.lang.String strEZpvd3 = EZpvd(subOrderState3);
                        if (arbitrageOrderBean3 == null || (state3 = arbitrageOrderBean3.getState()) == null) {
                            state3 = "";
                        }
                        arrayList8.add(new TacticsInsideItemData(str52, strEZpvd3 + " | " + copydefault(state3), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        java.lang.String str53 = C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2invokeinlinedonDispose1) + " | " + C33070mpX.AYXKKw(C55688xof.Application.setOwners);
                        if (arbitrageOrderBean4 == null || (subOrderState4 = arbitrageOrderBean4.getSubOrderState()) == null) {
                            subOrderState4 = "";
                        }
                        java.lang.String strEZpvd4 = EZpvd(subOrderState4);
                        if (arbitrageOrderBean4 == null || (state4 = arbitrageOrderBean4.getState()) == null) {
                            state4 = "";
                        }
                        arrayList8.add(new TacticsInsideItemData(str53, strEZpvd4 + " | " + copydefault(state4), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " | " + C33070mpX.AYXKKw(C55688xof.Application.getSerial), KWHzl(arbitrageOrderBean3) + " | " + AhwBna(arbitrageOrderBean3), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.validateAndPutInMap) + " | " + C33070mpX.AYXKKw(C55688xof.Application.getSerial), KWHzl(arbitrageOrderBean4) + " | " + AhwBna(arbitrageOrderBean4), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2) + " | " + C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), EZpvd(arbitrageOrderBean3) + " | " + AYXKKw(arbitrageOrderBean3), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        arrayList8.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandler2) + " | " + C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityKt), EZpvd(arbitrageOrderBean4) + " | " + AYXKKw(arbitrageOrderBean4), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        if (EZpvd(arbitrageOrderBean3, arbitrageOrderBean4)) {
                            arrayList8.add(new TacticsInsideItemData(OLrzqt(arbitrageOrderBean3).getFirst(), OLrzqt(arbitrageOrderBean3).getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                            arrayList8.add(new TacticsInsideItemData(OLrzqt(arbitrageOrderBean4).getFirst(), OLrzqt(arbitrageOrderBean4).getSecond(), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
                        }
                    }
                }
                c55930xtI2 = this;
                return arrayList8;
            default:
                arrayList3 = arrayList8;
                return arrayList3;
        }
    }

    public static /* synthetic */ java.util.List convertSmartArbInsideData$default(C55930xtI c55930xtI, BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return c55930xtI.EZpvd(bizTradeStrategyInfo, z, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0321  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<TacticsInsideItemData> EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String strFmtBotValueBySymbol$default;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String ccy;
        kotlin.Pair pairOLrzqt;
        java.lang.String str7;
        TacticsInsideItemData tacticsInsideItemData;
        TacticsInsideItemData tacticsInsideItemData2;
        java.lang.Object obj;
        TacticsInsideItemData tacticsInsideItemData3;
        TacticsInsideItemData tacticsInsideItemData4;
        java.lang.String str8;
        java.lang.String smartArbProfit$default;
        TacticsInsideItemData tacticsInsideItemData5;
        java.lang.String smartArbProfit$default2;
        BotVo botVo;
        SmartArbitrageVo smartArbitrage;
        BotCommon common;
        AutoEarnStakingParam autoEarn;
        BotCommon common2;
        AutoEarnStakingParam autoEarn2;
        BotCommon common3;
        ProfitDetailResponse quote;
        SmartArbitrageVo smartArbitrage2;
        ProfitDetailResponse autoStakingProfit;
        ProfitDetailResponse quote2;
        java.lang.String total;
        ProfitDetailResponse quote3;
        java.lang.String total2;
        SmartArbListItem smartArbListItem;
        C56051xvX c56051xvX = C56051xvX.AEQbTJ;
        java.util.ArrayList<SmartArbListItem> smartArbList = bizTradeStrategyInfo.getSmartArbList();
        java.lang.String instFamily = (smartArbList == null || (smartArbListItem = (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(smartArbList)) == null) ? null : smartArbListItem.getInstFamily();
        if (instFamily == null) {
            instFamily = "";
        }
        BizInstrument bizInstrumentCopydefault = c56051xvX.copydefault(instFamily, "SWAP");
        java.lang.String smartArbProfit$default3 = C56051xvX.getSmartArbProfit$default(c56051xvX, bizTradeStrategyInfo.getOrderTotalPnl(), bizInstrumentCopydefault, false, false, 12, null);
        java.lang.String displayQuoteSymbol = bizInstrumentCopydefault != null ? bizInstrumentCopydefault.getDisplayQuoteSymbol() : null;
        java.lang.String str9 = displayQuoteSymbol == null ? "" : displayQuoteSymbol;
        C56068xvo c56068xvo = C56068xvo.copydefault;
        java.lang.String strCopydefault = c56068xvo.copydefault(bizTradeStrategyInfo.getOrderPnlRatio(), true);
        int i = C32113mPz.Dialog.OcIXYQ;
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getOrderTotalPnl());
        TacticsUiConst.BotListSubItemType.BotSubTip.Default r45 = TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl;
        TacticsInsideItemData tacticsInsideItemData6 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.writeTypedObject) + " (" + str9 + ")", smartArbProfit$default3 + " (" + strCopydefault + ")", C33070mpX.AYXKKw(C55688xof.Application.areNotificationsEnabled), iOLrzqt, 0, 0, 0, i, null, r45, null, C33070mpX.AYXKKw(C55688xof.Application.getCurrent), null, null, null, null, null, 128368, null);
        java.lang.String str10 = C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt) + " (" + str9 + ")";
        java.lang.String orderTotalAmt = bizTradeStrategyInfo.getOrderTotalAmt();
        if (orderTotalAmt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) orderTotalAmt)) {
            str3 = "--";
            str4 = ")";
            strFmtBotValueBySymbol$default = str3;
        } else {
            java.lang.String orderTotalAmt2 = bizTradeStrategyInfo.getOrderTotalAmt();
            java.lang.String str11 = orderTotalAmt2 == null ? "" : orderTotalAmt2;
            str3 = "--";
            str4 = ")";
            strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(str9, str11, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
        }
        TacticsInsideItemData tacticsInsideItemData7 = new TacticsInsideItemData(str10, strFmtBotValueBySymbol$default, null, 0, 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, null, null, null, null, null, null, null, null, 130940, null);
        java.lang.String arbOrderPnl = bizTradeStrategyInfo.getArbOrderPnl();
        java.lang.String str12 = str4;
        java.lang.String str13 = str9;
        java.lang.String smartArbProfit$default4 = C56051xvX.getSmartArbProfit$default(c56051xvX, arbOrderPnl == null ? "" : arbOrderPnl, bizInstrumentCopydefault, false, false, 12, null);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.access100);
        java.lang.String arbOrderPnl2 = bizTradeStrategyInfo.getArbOrderPnl();
        TacticsInsideItemData tacticsInsideItemData8 = new TacticsInsideItemData(strAYXKKw, (arbOrderPnl2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) arbOrderPnl2)) ? str3 : smartArbProfit$default4, C33070mpX.AYXKKw(C55688xof.Application.getRoot), C56033xvF.OLrzqt((java.lang.Object) bizTradeStrategyInfo.getArbOrderPnl()), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbProfitsDetails.EZpvd, null, C33070mpX.AYXKKw(C55688xof.Application.access100), null, null, null, null, null, 128496, null);
        SmartArbProfitsInfo smartArbProfitsInfo = bizTradeStrategyInfo.getSmartArbProfitsInfo();
        ProfitDetailResponse stakingProfit = smartArbProfitsInfo.getStakingProfit();
        if (stakingProfit == null || (quote3 = stakingProfit.getQuote()) == null || (total2 = quote3.getTotal()) == null) {
            str5 = null;
        } else {
            str5 = (total2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) total2)) ? "0" : total2;
        }
        BotVo botVo2 = bizTradeStrategyInfo.getBotVo();
        if (botVo2 == null || (smartArbitrage2 = botVo2.getSmartArbitrage()) == null || (autoStakingProfit = smartArbitrage2.getAutoStakingProfit()) == null || (quote2 = autoStakingProfit.getQuote()) == null || (total = quote2.getTotal()) == null) {
            str6 = null;
        } else {
            str6 = (total.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) total)) ? "0" : total;
        }
        java.lang.String strAddS$default = C33129mqd.addS$default(str5, str6, null, null, null, 14, null);
        ProfitDetailResponse stakingProfit2 = smartArbProfitsInfo.getStakingProfit();
        java.lang.String total3 = stakingProfit2 != null ? stakingProfit2.getTotal() : null;
        ProfitDetailResponse stakingProfit3 = smartArbProfitsInfo.getStakingProfit();
        C56034xvG c56034xvG = new C56034xvG(total3, strAddS$default, stakingProfit3 != null ? stakingProfit3.getCcy() : null);
        int i2 = C55688xof.Application.ITrustedWebActivityService;
        ProfitDetailResponse stakingProfit4 = smartArbProfitsInfo.getStakingProfit();
        if (stakingProfit4 == null || (quote = stakingProfit4.getQuote()) == null || (ccy = quote.getCcy()) == null) {
            ccy = "USDT";
        }
        TacticsInsideItemData tacticsInsideItemData9 = new TacticsInsideItemData(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))), c56034xvG.copydefault(), null, C56033xvF.OLrzqt((java.lang.Object) strAddS$default), 0, 0, 0, 0, null, TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbStakingProfitsDetails.copydefault, null, null, null, null, null, null, null, 130548, null);
        java.lang.String strSourceCcy = C33129mqd.OLrzqt((java.lang.CharSequence) bizTradeStrategyInfo.sourceCcy()) ? bizTradeStrategyInfo.sourceCcy() : str13;
        BotVo botVo3 = bizTradeStrategyInfo.getBotVo();
        if (botVo3 == null || !botVo3.getShouldShowAutoEarn()) {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        } else {
            BotVo botVo4 = bizTradeStrategyInfo.getBotVo();
            if (((botVo4 == null || (common3 = botVo4.getCommon()) == null) ? null : common3.getAutoEarn()) != null) {
                BotVo botVo5 = bizTradeStrategyInfo.getBotVo();
                java.lang.String totalProfit = (botVo5 == null || (common2 = botVo5.getCommon()) == null || (autoEarn2 = common2.getAutoEarn()) == null) ? null : autoEarn2.getTotalProfit();
                java.lang.String str14 = totalProfit == null ? "" : totalProfit;
                BotVo botVo6 = bizTradeStrategyInfo.getBotVo();
                pairOLrzqt = C55884xsP.copydefault(str14, (botVo6 == null || (common = botVo6.getCommon()) == null || (autoEarn = common.getAutoEarn()) == null) ? null : autoEarn.getStatus(), str, str2, strSourceCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : bizTradeStrategyInfo.isHistoryOrder());
            }
        }
        java.lang.String str15 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        java.lang.String str16 = str3;
        TacticsInsideItemData tacticsInsideItemData10 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getMediaUri) + "(" + strSourceCcy + str12, (str15 == null || str15.length() == 0) ? str3 : str15 == null ? "" : str15, null, iIntValue, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstId(), (java.lang.Object) str16) ? "" : "arbitrage_auto_earn", TacticsUiConst.BotListSubItemType.BotSubTip.SmartArbAutoEarn.EZpvd, null, null, null, null, null, null, null, 130292, null);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStub);
        java.lang.String totalSpreadProfit = smartArbProfitsInfo.getTotalSpreadProfit();
        if (totalSpreadProfit == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalSpreadProfit)) {
            str7 = str12;
            tacticsInsideItemData = tacticsInsideItemData10;
            tacticsInsideItemData2 = tacticsInsideItemData9;
            obj = "ccy";
            tacticsInsideItemData3 = tacticsInsideItemData8;
            tacticsInsideItemData4 = tacticsInsideItemData7;
            str8 = str16;
            smartArbProfit$default = str8;
        } else {
            str7 = str12;
            tacticsInsideItemData = tacticsInsideItemData10;
            tacticsInsideItemData4 = tacticsInsideItemData7;
            str8 = str16;
            tacticsInsideItemData2 = tacticsInsideItemData9;
            obj = "ccy";
            tacticsInsideItemData3 = tacticsInsideItemData8;
            smartArbProfit$default = C56051xvX.getSmartArbProfit$default(c56051xvX, smartArbProfitsInfo.getTotalSpreadProfit(), bizInstrumentCopydefault, false, false, 12, null);
        }
        TacticsInsideItemData tacticsInsideItemData11 = new TacticsInsideItemData(strAYXKKw2, smartArbProfit$default, null, C56033xvF.OLrzqt((java.lang.Object) smartArbProfitsInfo.getTotalSpreadProfit()), 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.ITrustedWebActivityCallbackStub), C33070mpX.AYXKKw(C55688xof.Application.IPostMessageServiceStub)), null, null, null, null, null, null, null, 130548, null);
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanionCREATOR1);
        java.lang.String fee = smartArbProfitsInfo.getFee();
        if (fee == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fee)) {
            tacticsInsideItemData5 = tacticsInsideItemData11;
            smartArbProfit$default2 = str8;
        } else {
            tacticsInsideItemData5 = tacticsInsideItemData11;
            smartArbProfit$default2 = C56051xvX.getSmartArbProfit$default(c56051xvX, smartArbProfitsInfo.getFee(), bizInstrumentCopydefault, false, false, 12, null);
        }
        TacticsInsideItemData tacticsInsideItemData12 = new TacticsInsideItemData(strAYXKKw3, smartArbProfit$default2, null, 0, 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.IntentSenderRequestCompanionCREATOR1), C33070mpX.AYXKKw(C55688xof.Application.IPostMessageServiceDefault)), null, null, null, null, null, null, null, 130556, null);
        java.lang.String str17 = C33070mpX.AYXKKw(C55688xof.Application.notifyNotificationWithChannel) + " (" + str13 + str7;
        java.lang.String totalInterestAmt = smartArbProfitsInfo.getTotalInterestAmt();
        TacticsInsideItemData tacticsInsideItemData13 = new TacticsInsideItemData(str17, (totalInterestAmt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) totalInterestAmt)) ? str8 : StringsKt__StringsKt.iwGUEr((java.lang.CharSequence) C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(smartArbProfitsInfo.getTotalInterestAmt()), "", RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(4), null, null, null, 56, null)).toString(), null, 0, 0, 0, 0, 0, Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.getOrderInstId(), (java.lang.Object) str8) ? "" : "loan_interest_order", null, null, null, null, null, null, null, null, 130812, null);
        java.lang.String totalApy = smartArbProfitsInfo.getTotalApy();
        if (totalApy == null) {
            totalApy = "";
        }
        TacticsInsideItemData tacticsInsideItemData14 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.getActiveNotifications), C33129mqd.OLrzqt((java.lang.CharSequence) totalApy) ? c56068xvo.copydefault(totalApy, true) : str8, null, C56033xvF.OLrzqt((java.lang.Object) totalApy), 0, 0, 0, 0, null, new TacticsUiConst.BotListSubItemType.BotSubTip.DoubtDialog(C33070mpX.AYXKKw(C55688xof.Application.getActiveNotifications), C33070mpX.AYXKKw(C55688xof.Application.onExtraCallback)), null, null, null, null, null, null, null, 130548, null);
        BotVo botVo7 = bizTradeStrategyInfo.getBotVo();
        java.lang.String totalReturnedAmt = (botVo7 == null || (smartArbitrage = botVo7.getSmartArbitrage()) == null) ? null : smartArbitrage.getTotalReturnedAmt();
        if (totalReturnedAmt == null) {
            totalReturnedAmt = "";
        }
        java.lang.String str18 = str8;
        TacticsInsideItemData tacticsInsideItemData15 = new TacticsInsideItemData(C33069mpW.copydefault(C55688xof.Application.setInternalConnectionCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(obj, str13))), C56033xvF.fmtBotValueBySymbol$default(str13, totalReturnedAmt, null, false, null, false, null, null, null, null, null, 2044, null), C33070mpX.AYXKKw(C55688xof.Application.onConnectionSuspended), 0, 0, 0, 0, 0, null, r45, null, C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatCustomActionCallback), null, null, null, null, null, 128504, null);
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(tacticsInsideItemData4);
        listOLrzqt.add(tacticsInsideItemData6);
        if (!z) {
            listOLrzqt.add(tacticsInsideItemData14);
            listOLrzqt.add(tacticsInsideItemData3);
            if (bizTradeStrategyInfo.isArbitrageWithStaking() || ((botVo = bizTradeStrategyInfo.getBotVo()) != null && botVo.isAutoStaking())) {
                listOLrzqt.add(tacticsInsideItemData2);
            }
            BotVo botVo8 = bizTradeStrategyInfo.getBotVo();
            if (botVo8 != null && botVo8.isEarnOngoing(bizTradeStrategyInfo)) {
                listOLrzqt.add(tacticsInsideItemData);
            }
            listOLrzqt.add(tacticsInsideItemData5);
            listOLrzqt.add(tacticsInsideItemData12);
            listOLrzqt.add(tacticsInsideItemData13);
            listOLrzqt.add(tacticsInsideItemData15);
            if (bizTradeStrategyInfo.isHistoryOrder()) {
                TacticsInsideItemData tacticsInsideItemData16 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.AxsJAYsNCnLh), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizTradeStrategyInfo.getOrderCTime()) ? str18 : pTA.format$default(new Date(C33129mqd.valueOf(bizTradeStrategyInfo.getOrderCTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                TacticsInsideItemData tacticsInsideItemData17 = new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.launchdefault), StringsKt__StringsKt.fARcdN((java.lang.CharSequence) bizTradeStrategyInfo.getUTimeValue()) ? str18 : pTA.format$default(new Date(C33129mqd.valueOf(bizTradeStrategyInfo.getUTimeValue())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null);
                listOLrzqt.add(tacticsInsideItemData16);
                listOLrzqt.add(tacticsInsideItemData17);
            }
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt(ArbitrageOrderBean arbitrageOrderBean) {
        kotlin.Pair<java.lang.String, java.lang.String> pair;
        java.lang.String instType = arbitrageOrderBean != null ? arbitrageOrderBean.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    if (instType.equals("MARGIN")) {
                        if (Intrinsics.EZpvd(arbitrageOrderBean.getReduceOnly(), java.lang.Boolean.TRUE)) {
                            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(C55688xof.Application.AlertController3));
                        }
                        return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(C55688xof.Application.onScroll));
                    }
                    pair = new kotlin.Pair<>("", "");
                    break;
                case -1956807563:
                    if (instType.equals("OPTION")) {
                        pair = new kotlin.Pair<>("", "");
                    } else {
                        pair = new kotlin.Pair<>("", "");
                    }
                    break;
                case 2552066:
                    if (!instType.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        if (Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPosSide(), (java.lang.Object) "net")) {
                            if (Intrinsics.EZpvd(arbitrageOrderBean.getReduceOnly(), java.lang.Boolean.TRUE)) {
                                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(C55688xof.Application.AlertController3));
                            }
                            return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.hOMIpD), C33070mpX.AYXKKw(C55688xof.Application.onScroll));
                        }
                        pair = new kotlin.Pair<>("", "");
                        break;
                    }
                    break;
                case 214415088:
                    if (!instType.equals("FUTURES")) {
                    }
                    break;
            }
        }
        return pair;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(ArbitrageOrderBean arbitrageOrderBean, ArbitrageOrderBean arbitrageOrderBean2) {
        boolean zEZpvd;
        boolean zEZpvd2;
        java.lang.String instType = arbitrageOrderBean != null ? arbitrageOrderBean.getInstType() : null;
        if (instType != null) {
            switch (instType.hashCode()) {
                case -2027980370:
                    zEZpvd = instType.equals("MARGIN");
                    break;
                case -1956807563:
                    instType.equals("OPTION");
                    break;
                case 2552066:
                    instType.equals("SPOT");
                    break;
                case 2558355:
                    if (instType.equals("SWAP")) {
                        zEZpvd = Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPosSide(), (java.lang.Object) "net");
                        break;
                    }
                    break;
                case 214415088:
                    if (!instType.equals("FUTURES")) {
                    }
                    break;
            }
        }
        java.lang.String instType2 = arbitrageOrderBean2 != null ? arbitrageOrderBean2.getInstType() : null;
        if (instType2 != null) {
            switch (instType2.hashCode()) {
                case -2027980370:
                    zEZpvd2 = instType2.equals("MARGIN");
                    break;
                case -1956807563:
                    instType2.equals("OPTION");
                    break;
                case 2552066:
                    instType2.equals("SPOT");
                    break;
                case 2558355:
                    if (instType2.equals("SWAP")) {
                        zEZpvd2 = Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean2.getPosSide(), (java.lang.Object) "net");
                        break;
                    }
                    break;
                case 214415088:
                    if (!instType2.equals("FUTURES")) {
                    }
                    break;
            }
        }
        return zEZpvd || zEZpvd2;
    }

    public final java.lang.String AYXKKw(ArbitrageOrderBean arbitrageOrderBean) {
        if (arbitrageOrderBean == null) {
            return "--";
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        java.lang.String instId = arbitrageOrderBean.getInstId();
        if (instId == null) {
            instId = "";
        }
        java.lang.String instType = arbitrageOrderBean.getInstType();
        if (instType == null) {
            instType = "";
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, instId, instType, Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPxType(), (java.lang.Object) "marketPrice") ? arbitrageOrderBean.getAvgPx() : arbitrageOrderBean.getPx(), valueOf(arbitrageOrderBean), null, 16, null);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderBean.getSz()) || c54571xNhCreateAmtConvertor$default == null) {
            return "--";
        }
        java.lang.String sz = arbitrageOrderBean.getSz();
        java.lang.String strGEmmrt = c54571xNhCreateAmtConvertor$default.gEmmrt(sz != null ? sz : "");
        return strGEmmrt == null ? "--" : strGEmmrt;
    }

    public final java.lang.String EZpvd(ArbitrageOrderBean arbitrageOrderBean) {
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        if (arbitrageOrderBean == null) {
            return "--";
        }
        C54797xVr c54797xVr = C54797xVr.copydefault;
        java.lang.String instId = arbitrageOrderBean.getInstId();
        if (instId == null) {
            instId = "";
        }
        java.lang.String instType = arbitrageOrderBean.getInstType();
        if (instType == null) {
            instType = "";
        }
        C54571xNh c54571xNhCreateAmtConvertor$default = C54797xVr.createAmtConvertor$default(c54797xVr, instId, instType, arbitrageOrderBean.getAvgPx(), false, null, 16, null);
        if (valueOf(arbitrageOrderBean)) {
            if (c54571xNhCreateAmtConvertor$default == null) {
                return "--";
            }
            java.lang.String accFillSz = arbitrageOrderBean.getAccFillSz();
            java.lang.String strGEmmrt = c54571xNhCreateAmtConvertor$default.gEmmrt(accFillSz != null ? accFillSz : "");
            return strGEmmrt == null ? "--" : strGEmmrt;
        }
        if (c54571xNhCreateAmtConvertor$default == null) {
            return "--";
        }
        java.lang.String accFillSz2 = arbitrageOrderBean.getAccFillSz();
        C54536xML c54536xMLDjBIcL2 = c54571xNhCreateAmtConvertor$default.djBIcL(accFillSz2 != null ? accFillSz2 : "");
        return (c54536xMLDjBIcL2 == null || (c54536xMLDjBIcL = c54536xMLDjBIcL2.djBIcL()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public final boolean valueOf(ArbitrageOrderBean arbitrageOrderBean) {
        if (arbitrageOrderBean != null && Intrinsics.EZpvd(arbitrageOrderBean.getTransform(), java.lang.Boolean.FALSE)) {
            return (Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getInstType(), (java.lang.Object) "MARGIN")) && Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPxType(), (java.lang.Object) "marketPrice") && Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getSide(), (java.lang.Object) "buy");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(ArbitrageOrderBean arbitrageOrderBean) {
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String strEZpvd;
        C54536xML c54536xMLCopydefault;
        if (!C33129mqd.valueOf(arbitrageOrderBean != null ? arbitrageOrderBean.getAvgPx() : null, 0) && arbitrageOrderBean != null) {
            C54797xVr c54797xVr = C54797xVr.copydefault;
            java.lang.String instId = arbitrageOrderBean.getInstId();
            if (instId == null) {
                instId = "";
            }
            java.lang.String instType = arbitrageOrderBean.getInstType();
            if (instType == null) {
                instType = "";
            }
            xMS xmsAEQbTJ = c54797xVr.AEQbTJ(instId, instType);
            if (xmsAEQbTJ != null) {
                java.lang.String avgPx = arbitrageOrderBean.getAvgPx();
                C54536xML c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(avgPx != null ? avgPx : "");
                if (c54536xMLAYXKKw != null && (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) != null) {
                    c54536xMLFetchVPNInfo = c54536xMLCopydefault.djBIcL();
                }
                if (!Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPxType(), (java.lang.Object) "enter")) {
                }
                if (c54536xMLFetchVPNInfo == null) {
                }
            } else {
                c54536xMLFetchVPNInfo = null;
                if (!Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPxType(), (java.lang.Object) "enter")) {
                    c54536xMLFetchVPNInfo = c54536xMLFetchVPNInfo != null ? c54536xMLFetchVPNInfo.fetchVPNInfo() : null;
                }
                if (c54536xMLFetchVPNInfo == null && (strEZpvd = c54536xMLFetchVPNInfo.EZpvd(false)) != null) {
                    return strEZpvd;
                }
            }
        }
        return "--";
    }

    public final java.lang.String AhwBna(ArbitrageOrderBean arbitrageOrderBean) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        java.lang.String strEZpvd;
        if (arbitrageOrderBean == null) {
            return "--";
        }
        if (Intrinsics.EZpvd((java.lang.Object) arbitrageOrderBean.getPxType(), (java.lang.Object) "enter")) {
            C54797xVr c54797xVr = C54797xVr.copydefault;
            java.lang.String instId = arbitrageOrderBean.getInstId();
            if (instId == null) {
                instId = "";
            }
            java.lang.String instType = arbitrageOrderBean.getInstType();
            if (instType == null) {
                instType = "";
            }
            xMS xmsAEQbTJ = c54797xVr.AEQbTJ(instId, instType);
            if (xmsAEQbTJ == null) {
                return "";
            }
            java.lang.String px = arbitrageOrderBean.getPx();
            if (px == null) {
                px = "";
            }
            C54536xML c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(px);
            return (c54536xMLAYXKKw == null || (c54536xMLCopydefault = c54536xMLAYXKKw.copydefault()) == null || (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (strEZpvd = c54536xMLFetchVPNInfo.EZpvd(false)) == null) ? "" : strEZpvd;
        }
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) arbitrageOrderBean.getPxType())) {
            return "--";
        }
        java.lang.String str = C56039xvL.OLrzqt.AEQbTJ().get(arbitrageOrderBean.getPxType());
        return str == null ? "" : str;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -2075867386) {
                if (iHashCode != -1468651097) {
                    if (iHashCode == -1086574198 && str.equals("failure")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.BackHandlerKtBackHandlerbackCallback11);
                    }
                } else if (str.equals("effective")) {
                    return C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnAfter);
                }
            } else if (str.equals("submitting")) {
                return C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnAfterfullyDrawnReporter1);
            }
        }
        return "--";
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [5186=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1784744586:
                    if (str.equals("partially_effective")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.playFromSearch);
                    }
                    break;
                case -1468651097:
                    if (str.equals("effective")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnWhen);
                    }
                    break;
                case -123173735:
                    if (str.equals("canceled")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.provides);
                    }
                    break;
                case 3322092:
                    if (str.equals("live")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.setActionBarDescription);
                    }
                    break;
            }
        }
        return "--";
    }

    public final java.lang.String copydefault(ArbitrageOrderBean arbitrageOrderBean) {
        java.lang.String instType;
        java.lang.String side;
        java.lang.String posSide;
        java.lang.String str = "";
        if (arbitrageOrderBean == null || (instType = arbitrageOrderBean.getInstType()) == null) {
            instType = "";
        }
        if (arbitrageOrderBean == null || (side = arbitrageOrderBean.getSide()) == null) {
            side = "";
        }
        if (arbitrageOrderBean != null && (posSide = arbitrageOrderBean.getPosSide()) != null) {
            str = posSide;
        }
        java.lang.String first = C56033xvF.AYXKKw(instType, side, str).getFirst();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) first)) {
            first = "--";
        }
        return first;
    }

    public final int AEQbTJ(ArbitrageOrderBean arbitrageOrderBean) {
        java.lang.String instType;
        java.lang.String side;
        java.lang.String posSide;
        java.lang.String instType2;
        java.lang.String side2;
        java.lang.String posSide2;
        java.lang.String str = "";
        if (arbitrageOrderBean == null || (instType = arbitrageOrderBean.getInstType()) == null) {
            instType = "";
        }
        if (arbitrageOrderBean == null || (side = arbitrageOrderBean.getSide()) == null) {
            side = "";
        }
        if (arbitrageOrderBean == null || (posSide = arbitrageOrderBean.getPosSide()) == null) {
            posSide = "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) C56033xvF.AYXKKw(instType, side, posSide).getFirst())) {
            return C33070mpX.copydefault(C52761wXj.Activity.DeEinT);
        }
        if (arbitrageOrderBean == null || (instType2 = arbitrageOrderBean.getInstType()) == null) {
            instType2 = "";
        }
        if (arbitrageOrderBean == null || (side2 = arbitrageOrderBean.getSide()) == null) {
            side2 = "";
        }
        if (arbitrageOrderBean != null && (posSide2 = arbitrageOrderBean.getPosSide()) != null) {
            str = posSide2;
        }
        return C56033xvF.OLrzqt(C56033xvF.AYXKKw(instType2, side2, str).getSecond().booleanValue());
    }

    public final java.lang.String OLrzqt(StrategyPendingListResp strategyPendingListResp) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getPxSpread())) {
            return C56033xvF.getBotPrice$default(strategyPendingListResp.getInstType(), strategyPendingListResp.getInstId(), strategyPendingListResp.getPxSpread(), false, false, null, null, 120, null);
        }
        return xMR.formatPercent$default(xMR.copydefault, strategyPendingListResp.getPxVar(), 0, RoundingMode.DOWN, 2, null);
    }

    public static /* synthetic */ java.lang.String getSpreadPriceUnit$default(C55930xtI c55930xtI, StrategyPendingListResp strategyPendingListResp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c55930xtI.KWHzl(strategyPendingListResp, str);
    }

    public final java.lang.String KWHzl(StrategyPendingListResp strategyPendingListResp, java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strategyPendingListResp.getPxSpread())) {
            return "";
        }
        return "(" + str + ")";
    }

    public final java.lang.String AEQbTJ(StrategyHistoryListResp strategyHistoryListResp) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyHistoryListResp.getPxSpread())) {
            return C56033xvF.getBotPrice$default(strategyHistoryListResp.getInstType(), strategyHistoryListResp.getInstId(), strategyHistoryListResp.getPxSpread(), false, false, null, null, 120, null);
        }
        return xMR.formatPercent$default(xMR.copydefault, strategyHistoryListResp.getPxVar(), 0, RoundingMode.DOWN, 2, null);
    }

    public static /* synthetic */ java.lang.String getSpreadPriceUnit$default(C55930xtI c55930xtI, StrategyHistoryListResp strategyHistoryListResp, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c55930xtI.AEQbTJ(strategyHistoryListResp, str);
    }

    public final java.lang.String AEQbTJ(StrategyHistoryListResp strategyHistoryListResp, java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strategyHistoryListResp.getPxSpread())) {
            return "";
        }
        return "(" + str + ")";
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_iceberg")) {
            if (Intrinsics.EZpvd((java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL, (java.lang.Object) str3)) {
                return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C55688xof.Application.getPosition), C56424yEw.gEmmrt(C56390yDp.OLrzqt("tradeSymbolOne", str4), C56390yDp.OLrzqt("tradeSymbolTwo", str4)));
            }
        } else if (str2 != null && str2.length() != 0) {
            return str2;
        }
        return "";
    }

    public final java.lang.String valueOf(java.lang.String str) {
        IceBergAggressiveType iceBergAggressiveType;
        java.lang.String strAYXKKw;
        IceBergAggressiveType[] iceBergAggressiveTypeArrValues = IceBergAggressiveType.values();
        int length = iceBergAggressiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iceBergAggressiveType = null;
                break;
            }
            iceBergAggressiveType = iceBergAggressiveTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) iceBergAggressiveType.getMode(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return (iceBergAggressiveType == null || (strAYXKKw = C33070mpX.AYXKKw(iceBergAggressiveType.getDesc())) == null) ? "--" : strAYXKKw;
    }

    public static /* synthetic */ kotlin.Pair getCurState$default(C55930xtI c55930xtI, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c55930xtI.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [5273=5] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        switch (str2.hashCode()) {
            case -1148661171:
                if (str2.equals("smart_iceberg")) {
                    return C56033xvF.isConnected(str);
                }
                break;
            case -557961837:
                if (str2.equals("smart_arbitrage")) {
                    return C56033xvF.AuCTel(str);
                }
                break;
            case -392358507:
                if (str2.equals("lvf_sell")) {
                    return C54795xVp.OLrzqt(str, "Sell");
                }
                break;
            case 541516771:
                if (str2.equals("lvf_buy")) {
                    return C54795xVp.OLrzqt(str, "Buy");
                }
                break;
            case 1485620813:
                if (str2.equals("dcd_bot")) {
                    return C56033xvF.copydefault(str, str3);
                }
                break;
        }
        return C56033xvF.fetchVPNInfo(str);
    }

    public static /* synthetic */ kotlin.Pair getHisState$default(C55930xtI c55930xtI, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c55930xtI.AEQbTJ(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [5314=7, 5288=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.ActivityResultCallback), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.setDisplayOptions), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.setDisplayUseLogoEnabled), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.removeTabAt), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.setDisplayHomeAsUpEnabled), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.AxsJAYaxsJAY), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:?, code lost:
    
        return new kotlin.Pair<>(o.C33070mpX.AYXKKw(o.C55688xof.Application.getActions), java.lang.Integer.valueOf(o.C33070mpX.copydefault(o.C52761wXj.Activity.aappFQ)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:?, code lost:
    
        return o.C56033xvF.AYXKKw(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006e, code lost:
    
        if (r5.equals("recurring") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        if (r5.equals("lvf_buy") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        if (r5.equals("grid") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
    
        if (r5.equals("lvf_sell") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.EZpvd((java.lang.Object) r5, (java.lang.Object) "lvf_buy") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        r4 = "Buy";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        r4 = "Sell";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r5.equals("contract_grid") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
    
        if (r5.equals("smart_portfolio") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
    
        r5 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        if (r5 == 1570) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
    
        if (r5 == 1571) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        switch(r5) {
            case 49: goto L72;
            case 50: goto L68;
            case 51: goto L64;
            case 52: goto L60;
            case 53: goto L56;
            default: goto L82;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        if (r4.equals("5") != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0137, code lost:
    
        if (r4.equals("4") != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0158, code lost:
    
        if (r4.equals("3") != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        if (r4.equals("2") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0199, code lost:
    
        if (r4.equals("1") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b9, code lost:
    
        if (r4.equals("14") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d8, code lost:
    
        if (r4.equals("13") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x020c, code lost:
    
        if (r5.equals("contract_dca") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0215, code lost:
    
        if (r5.equals("infinite_grid") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021e, code lost:
    
        if (r5.equals("spot_dca") != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
    
        return o.C54795xVp.OLrzqt(r6, r4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.Integer> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        switch (str2.hashCode()) {
            case -1831183611:
                break;
            case -1574173039:
                break;
            case -1402017003:
                break;
            case -1216369070:
                break;
            case -1148661171:
                if (str2.equals("smart_iceberg")) {
                    return C56033xvF.values(str3);
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
            case -557961837:
                if (str2.equals("smart_arbitrage")) {
                    return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "4") ? new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setDisplayOptions), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ))) : new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
            case -512749997:
                break;
            case -392358507:
                break;
            case 3181382:
                break;
            case 541516771:
                break;
            case 1165749981:
                break;
            case 1485620813:
                if (str2.equals("dcd_bot")) {
                    return C56033xvF.djBIcL(str3);
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
            case 1780188297:
                if (str2.equals("arbitrage")) {
                    return Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "completed") ? new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.HJWChPQdUnVm), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ))) : new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
                }
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
            default:
                return new kotlin.Pair<>(C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.aappFQ)));
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        return pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(str)), null, 1, null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(BizTradeStrategyInfo bizTradeStrategyInfo) {
        java.util.ArrayList<SmartPortfolioListItem> smartPortfolioList = bizTradeStrategyInfo.getSmartPortfolioList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : smartPortfolioList) {
            SmartPortfolioListItem smartPortfolioListItem = (SmartPortfolioListItem) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) bizTradeStrategyInfo.getStgyInvestCcy()) && !Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) bizTradeStrategyInfo.getOrderTradeQuoteCcy())) {
                arrayList.add(obj);
            }
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", null, null, 2, "...", new Function1() { // from class: o.xtP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C55930xtI.OLrzqt((SmartPortfolioListItem) obj2);
            }
        }, 6, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "--";
        }
        return C56390yDp.OLrzqt(strJoinToString$default, arrayList.size() > 2 ? "coin_target_scale" : "");
    }

    public static final java.lang.CharSequence OLrzqt(SmartPortfolioListItem smartPortfolioListItem) {
        Intrinsics.checkNotNullParameter(smartPortfolioListItem, "");
        return smartPortfolioListItem.getCcy() + " " + pTB.KWHzl(xMR.copydefault.OLrzqt((java.lang.Object) smartPortfolioListItem.getRatio()), 0, RoundingMode.DOWN);
    }

    public static /* synthetic */ kotlin.Pair getRecurringList$default(C55930xtI c55930xtI, BizTradeStrategyInfo bizTradeStrategyInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c55930xtI.KWHzl(bizTradeStrategyInfo, z);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z) {
        java.util.ArrayList<RecurringListItem> recList = bizTradeStrategyInfo.getRecList();
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(recList, ", ", null, null, 2, "...", new Function1() { // from class: o.xtH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C55930xtI.copydefault((RecurringListItem) obj);
            }
        }, 6, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "--";
        }
        return C56390yDp.OLrzqt(strJoinToString$default, (recList.size() > 2 || z) ? "coin_target_scale" : "");
    }

    public static final java.lang.CharSequence copydefault(RecurringListItem recurringListItem) {
        Intrinsics.checkNotNullParameter(recurringListItem, "");
        return recurringListItem.getCcy() + " " + pTB.KWHzl(xMR.copydefault.OLrzqt((java.lang.Object) recurringListItem.getRatio()), 0, RoundingMode.DOWN);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> KWHzl(StrategyPendingListResp strategyPendingListResp) {
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyPendingListResp.getPortfolioList();
        java.util.ArrayList<SmartPortfolioListItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : portfolioList) {
            SmartPortfolioListItem smartPortfolioListItem = (SmartPortfolioListItem) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyPendingListResp.getInvestCcy()) && !Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyPendingListResp.getTradeQuoteCcy())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SmartPortfolioListItem smartPortfolioListItem2 : arrayList) {
            java.lang.String strMulS$default = C33129mqd.mulS$default(smartPortfolioListItem2.getCurNum(), smartPortfolioListItem2.getPx(), null, null, null, 14, null);
            arrayList2.add(C56390yDp.OLrzqt(smartPortfolioListItem2.getCcy(), xMR.formatPercent$default(xMR.copydefault, C33129mqd.divS$default(strMulS$default, strategyPendingListResp.getMktCap(), null, null, null, 14, null), 0, Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem2.getCcy(), (java.lang.Object) "USDT") ? RoundingMode.UP : RoundingMode.DOWN, 2, null)));
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 2, "...", new Function1() { // from class: o.xtL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C55930xtI.KWHzl((kotlin.Pair) obj2);
            }
        }, 6, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "--";
        }
        return C56390yDp.OLrzqt(strJoinToString$default, arrayList2.size() > 2 ? "coin_current_position" : "");
    }

    public static final java.lang.CharSequence KWHzl(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst() + " " + pair.getSecond();
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> EZpvd(StrategyPendingListResp strategyPendingListResp) {
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyPendingListResp.getPortfolioList();
        java.util.ArrayList<SmartPortfolioListItem> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : portfolioList) {
            SmartPortfolioListItem smartPortfolioListItem = (SmartPortfolioListItem) obj;
            if (!Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyPendingListResp.getInvestCcy()) && !Intrinsics.EZpvd((java.lang.Object) smartPortfolioListItem.getCcy(), (java.lang.Object) strategyPendingListResp.getTradeQuoteCcy())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (SmartPortfolioListItem smartPortfolioListItem2 : arrayList) {
            arrayList2.add(C56390yDp.OLrzqt(smartPortfolioListItem2.getCcy(), C56033xvF.fmtBotValueBySymbol$default(strategyPendingListResp.getInvestCcy(), C33129mqd.mulS$default(smartPortfolioListItem2.getCurNum(), smartPortfolioListItem2.getPx(), null, null, null, 14, null), RoundingMode.DOWN, false, null, false, null, null, null, null, null, 2040, null)));
        }
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 2, "...", new Function1() { // from class: o.xtQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C55930xtI.copydefault((kotlin.Pair) obj2);
            }
        }, 6, null);
        if (strJoinToString$default.length() == 0) {
            strJoinToString$default = "--";
        }
        return C56390yDp.OLrzqt(strJoinToString$default, arrayList2.size() > 2 ? "coin_current_value" : "");
    }

    public static final java.lang.CharSequence copydefault(kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return pair.getFirst() + " " + pair.getSecond();
    }

    public final java.util.ArrayList<TacticsInsideItemData> AEQbTJ(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z) {
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMultiWindowModeChangedListener), C54795xVp.copydefault(bizTradeStrategyInfo.createTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (!z) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QqiRNA), C54795xVp.copydefault(bizTradeStrategyInfo.earlyFillSettleTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.dSJNDS), C54795xVp.copydefault(bizTradeStrategyInfo.earlyFilledTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        if (Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.tradeSide(), (java.lang.Object) "Buy")) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.QgUVrU);
            java.lang.String strFmtEarlyTotal = bizTradeStrategyInfo.fmtEarlyTotal();
            arrayList.add(new TacticsInsideItemData(strAYXKKw, strFmtEarlyTotal == null ? "" : strFmtEarlyTotal, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.onServiceConnected);
            java.lang.String strFmtEarlyPrice = bizTradeStrategyInfo.fmtEarlyPrice();
            arrayList.add(new TacticsInsideItemData(strAYXKKw2, strFmtEarlyPrice == null ? "" : strFmtEarlyPrice, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onServiceDisconnected), C54795xVp.KWHzl(bizTradeStrategyInfo.turnoverRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.DLl);
            java.lang.String strFmtEarlyAmount = bizTradeStrategyInfo.fmtEarlyAmount();
            arrayList.add(new TacticsInsideItemData(strAYXKKw3, strFmtEarlyAmount == null ? "" : strFmtEarlyAmount, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else {
            java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C55688xof.Application.UimiPO);
            java.lang.String strFmtEarlyAmount2 = bizTradeStrategyInfo.fmtEarlyAmount();
            arrayList.add(new TacticsInsideItemData(strAYXKKw4, strFmtEarlyAmount2 == null ? "" : strFmtEarlyAmount2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C55688xof.Application.RxVVQC);
            java.lang.String strFmtEarlyPrice2 = bizTradeStrategyInfo.fmtEarlyPrice();
            arrayList.add(new TacticsInsideItemData(strAYXKKw5, strFmtEarlyPrice2 == null ? "" : strFmtEarlyPrice2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onServiceDisconnected), C54795xVp.KWHzl(bizTradeStrategyInfo.turnoverRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.OqIZjC);
            java.lang.String strFmtEarlyTotal2 = bizTradeStrategyInfo.fmtEarlyTotal();
            arrayList.add(new TacticsInsideItemData(strAYXKKw6, strFmtEarlyTotal2 == null ? "" : strFmtEarlyTotal2, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        return arrayList;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVp.getAmount$default(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):java.lang.String */
    public final java.util.ArrayList<TacticsInsideItemData> OLrzqt(BizTradeStrategyInfo bizTradeStrategyInfo, boolean z) {
        java.lang.String downToMax$default;
        BizInstrument suggestedInstrument$default;
        java.util.ArrayList<TacticsInsideItemData> arrayList = new java.util.ArrayList<>();
        java.lang.String orderInstId = bizTradeStrategyInfo.getOrderInstId();
        java.lang.String orderInstType = bizTradeStrategyInfo.getOrderInstType();
        if (!z) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String displayQuoteSymbol = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, orderInstType, orderInstId, null, null, 12, null)) == null) ? null : suggestedInstrument$default.getDisplayQuoteSymbol();
            boolean zAEQbTJ = C33129mqd.AEQbTJ(bizTradeStrategyInfo.estimateProfit(), 0);
            if (zAEQbTJ) {
                downToMax$default = xMR.formatUpToMax$default(xMR.copydefault, bizTradeStrategyInfo.estimateProfit(), 0, 2, null);
            } else {
                downToMax$default = xMR.formatDownToMax$default(xMR.copydefault, bizTradeStrategyInfo.estimateProfit(), 0, 2, null);
            }
            if (zAEQbTJ) {
                downToMax$default = Marker.ANY_NON_NULL_MARKER + downToMax$default;
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnPictureInPictureModeChangedListener) + "(" + displayQuoteSymbol + ")", downToMax$default, C33070mpX.AYXKKw(C55688xof.Application.gAnGwV), C56033xvF.OLrzqt((java.lang.Object) bizTradeStrategyInfo.estimateProfit()), 0, 0, 0, C32113mPz.Dialog.OcIXYQ, null, TacticsUiConst.BotListSubItemType.BotSubTip.Default.KWHzl, null, null, null, null, null, null, null, 130416, null));
            arrayList.add(new TacticsInsideItemData("", "", null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnMultiWindowModeChangedListener), C54795xVp.copydefault(bizTradeStrategyInfo.createTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onTrimMemory), C54795xVp.copydefault(bizTradeStrategyInfo.expiryTime()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (!z) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeOnConfigurationChangedListener), C54795xVp.AEQbTJ(bizTradeStrategyInfo.timeLeft()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.tradeSide(), (java.lang.Object) "Buy") ? C55688xof.Application.RXxsjQ : C55688xof.Application.aVPvww), C54795xVp.AEQbTJ(orderInstId, orderInstType, bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.strikePrecision()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.tradeSide(), (java.lang.Object) "Buy") ? C55688xof.Application.ContextAware : C55688xof.Application.drbYRJ), C54795xVp.getAmount$default(orderInstId, orderInstType, bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.notionalAmount(), bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.getBaseDigit(), null, 64, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) bizTradeStrategyInfo.tradeSide(), (java.lang.Object) "Buy") ? C55688xof.Application.RXdAnZ : C55688xof.Application.dispatchOnContextAvailable), C54795xVp.AEQbTJ(orderInstId, orderInstType, bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.notionalAmount(), bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.getQuoteDigit()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.removeMenuProvider), C54795xVp.KWHzl(bizTradeStrategyInfo.participationRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.registerForActivityResult), C54795xVp.copydefault(orderInstId, orderInstType, bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.notionalAmount(), bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.getBaseDigit(), bizTradeStrategyInfo.participationRatio()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        if (z) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.values), C54795xVp.copydefault(orderInstId, orderInstType, bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.settlementAmount(), bizTradeStrategyInfo.notionalAmount(), bizTradeStrategyInfo.getBaseDigit()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DbNXlk), C54795xVp.EZpvd(bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.notionalAmount(), bizTradeStrategyInfo.settlementAmount()), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        return arrayList;
    }

    public final PriceLockerTradeBean EZpvd(BizTradeStrategyInfo bizTradeStrategyInfo) {
        return new PriceLockerTradeBean(bizTradeStrategyInfo.getOrderInstId(), bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.alternativeCurrency(), bizTradeStrategyInfo.currency(), bizTradeStrategyInfo.createTime(), bizTradeStrategyInfo.expiryTime(), bizTradeStrategyInfo.notionalAmount(), (java.lang.String) null, bizTradeStrategyInfo.participationRatio(), (java.lang.String) null, bizTradeStrategyInfo.settlementAmount(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, bizTradeStrategyInfo.status(), bizTradeStrategyInfo.strike(), bizTradeStrategyInfo.tradeId(), bizTradeStrategyInfo.tradeSide(), bizTradeStrategyInfo.timeLeft(), (java.lang.String) null, (java.lang.String) null, bizTradeStrategyInfo.strikePrecision(), (java.lang.String) null, bizTradeStrategyInfo.endStatusFlag(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, -43976064, 3, (DefaultConstructorMarker) null);
    }

    public final java.lang.String AhwBna(java.lang.String str) {
        if (C56071xvr.gEmmrt.ejfBZ()) {
            return C33069mpW.copydefault(C55688xof.Application.gEmmrt, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str)));
        }
        return C33069mpW.copydefault(C55688xof.Application.PlaybackStateCompat, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str)));
    }

    public final SwapCoinMProfitSwitchUiModel AhwBna(BizTradeStrategyInfo bizTradeStrategyInfo) {
        C55887xsS c55887xsS = new C55887xsS(bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getOrderInstId());
        C55889xsU c55889xsU = C55889xsU.copydefault;
        boolean zCopydefault = c55889xsU.copydefault(bizTradeStrategyInfo.getOrderInstId(), bizTradeStrategyInfo.getOrderInstType(), bizTradeStrategyInfo.getBotVo());
        if (!zCopydefault) {
            return null;
        }
        int iAEQbTJ = c55889xsU.AEQbTJ(bizTradeStrategyInfo.getOrderAlgoId());
        BizInstrument bizInstrumentAhwBna = c55887xsS.AhwBna();
        return new SwapCoinMProfitSwitchUiModel(zCopydefault, iAEQbTJ, bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarketInfoSettleCcy() : null);
    }

    /* JADX INFO: renamed from: o.xtI$ActionBar */
    public static final class ActionBar {
        public static final C0998ActionBar Companion = new C0998ActionBar(null);
        public static final kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> OLrzqt = AEQbTJ("--", "");
        public final kotlin.Pair<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean AEQbTJ(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair, java.lang.Object obj) {
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(pair, ((ActionBar) obj).KWHzl());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> EZpvd(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            return pair;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 kotlin.Pair) A[MD:(kotlin.Pair):void (m)] call: o.xtI.ActionBar.<init>(kotlin.Pair):void type: CONSTRUCTOR */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final /* synthetic */ ActionBar OLrzqt(kotlin.Pair pair) {
            return new ActionBar(pair);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int copydefault(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return pair.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String djBIcL(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return "DisplayString(pair=" + pair + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ kotlin.Pair KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return AEQbTJ(this.copydefault, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return copydefault(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return djBIcL(this.copydefault);
        }

        /* JADX DEBUG: Marked for inline */
        /* JADX DEBUG: Method not inlined, still used in: [o.xtI.ActionBar.OLrzqt(kotlin.Pair):o.xtI$ActionBar] */
        public /* synthetic */ ActionBar(kotlin.Pair pair) {
            this.copydefault = pair;
        }

        public static kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return EZpvd(C56390yDp.OLrzqt(str, str2));
        }

        public static final java.lang.String AEQbTJ(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return pair.getFirst();
        }

        public static final java.lang.String KWHzl(kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pair) {
            return pair.getSecond();
        }

        /* JADX INFO: renamed from: o.xtI$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0998ActionBar {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xtI.ActionBar.ActionBar.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0998ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0998ActionBar() {
            }
        }
    }
}
