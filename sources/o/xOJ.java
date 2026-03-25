package o;

import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.subscribe.TpslAllInfo;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xOJ {
    public static final xOJ AEQbTJ = new xOJ();

    private xOJ() {
    }

    public final TradePositionManager.PositionItem EZpvd(@NotNull TradePositionData tradePositionData, java.util.List<TradePositionData> list) {
        TradePositionManager.MarginModeType marginModeType;
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        TradePositionManager.PositionItem positionItem = new TradePositionManager.PositionItem();
        positionItem.setAdl(tradePositionData.getAdl());
        positionItem.setAvailPos(tradePositionData.getAvailPos());
        positionItem.setAvgPx(tradePositionData.getAvgPx());
        positionItem.setCcy(tradePositionData.getCcy());
        positionItem.setCTime(tradePositionData.getCTime());
        positionItem.setTradeId(tradePositionData.getTradeId());
        positionItem.setImr(tradePositionData.getImr());
        positionItem.setInstId(tradePositionData.getInstId());
        positionItem.setInstType(tradePositionData.getInstType());
        positionItem.setInterest(tradePositionData.getInterest());
        positionItem.setLever(tradePositionData.getLever());
        positionItem.setLiabCcy(tradePositionData.getLiabCcy());
        positionItem.setLiab(tradePositionData.getLiab());
        positionItem.setLiqPx(tradePositionData.getLiqPx());
        positionItem.setMargin(tradePositionData.getMargin());
        java.lang.String mgnMode = tradePositionData.getMgnMode();
        if (Intrinsics.EZpvd((java.lang.Object) mgnMode, (java.lang.Object) "cross")) {
            marginModeType = TradePositionManager.MarginModeType.CROSSED;
        } else {
            marginModeType = Intrinsics.EZpvd((java.lang.Object) mgnMode, (java.lang.Object) "isolated") ? TradePositionManager.MarginModeType.ISOLATED : TradePositionManager.MarginModeType.CASH;
        }
        positionItem.setMarginMode(marginModeType);
        positionItem.setMgnRatio(tradePositionData.getMgnRatio());
        positionItem.setMmr(tradePositionData.getMmr());
        positionItem.setOptVal(tradePositionData.getOptVal());
        positionItem.setPosSide(tradePositionData.getPosSide());
        positionItem.setPos(tradePositionData.getPos());
        positionItem.setPosId(tradePositionData.getPosId());
        positionItem.setPosCcy(tradePositionData.getPosCcy());
        positionItem.setUpl(tradePositionData.getUpl());
        positionItem.setUplRatio(tradePositionData.getUplRatio());
        positionItem.setUplLastPx(tradePositionData.getUplLastPx());
        positionItem.setUplRatioLastPx(tradePositionData.getUplRatioLastPx());
        positionItem.setLast(tradePositionData.getLast());
        positionItem.setNotionalUsd(tradePositionData.getNotionalUsd());
        positionItem.setUTime(tradePositionData.getUTime());
        java.lang.String usdPx = tradePositionData.getUsdPx();
        positionItem.setUsdPx(usdPx != null ? usdPx : "");
        positionItem.setMarkPx(tradePositionData.getMarkPx());
        positionItem.setBaseBalance(tradePositionData.getBaseBal());
        positionItem.setQuoteBalance(tradePositionData.getQuoteBal());
        positionItem.setSpotInUseAmt(tradePositionData.getSpotInUseAmt());
        positionItem.setSpotInUseCcy(tradePositionData.getSpotInUseCcy());
        positionItem.setPendingCloseOrdLiabVal(tradePositionData.getPendingCloseOrdLiabVal());
        java.util.List<TpslAllInfo> closeOrderAlgo = tradePositionData.getCloseOrderAlgo();
        if (closeOrderAlgo == null) {
            closeOrderAlgo = yDY.AhwBna();
        }
        positionItem.setCloseOrderAlgo(closeOrderAlgo);
        positionItem.setBaseBorrowed(tradePositionData.getBaseBorrowed());
        positionItem.setQuoteBorrowed(tradePositionData.getQuoteBorrowed());
        positionItem.setQuoteInterest(tradePositionData.getQuoteInterest());
        positionItem.setBaseInterest(tradePositionData.getBaseInterest());
        positionItem.setBizRefId(tradePositionData.getBizRefId());
        positionItem.setBizRefType(tradePositionData.getBizRefType());
        positionItem.setRiskUnitCcy(tradePositionData.getRiskUnitCcy());
        positionItem.setInstFamily(tradePositionData.getInstFamily());
        positionItem.setUly(tradePositionData.getUly());
        positionItem.setRealizedPnl(tradePositionData.getRealizedPnl());
        positionItem.setPnl(tradePositionData.getPnl());
        positionItem.setFee(tradePositionData.getFee());
        positionItem.setFundingFee(tradePositionData.getFundingFee());
        positionItem.setLiqPenalty(tradePositionData.getLiqPenalty());
        positionItem.setBestSlTriggerPx(tradePositionData.getBestSlTriggerPx());
        positionItem.setBestTpTriggerPx(tradePositionData.getBestTpTriggerPx());
        positionItem.setPosRelationAlgoOrdCount(tradePositionData.getPosRelationAlgoOrdCount());
        positionItem.setBePx(tradePositionData.getBePx());
        positionItem.setNonSettleAvgPx(tradePositionData.getNonSettleAvgPx());
        positionItem.setSettledPnl(tradePositionData.getSettledPnl());
        positionItem.setHedgedPos(tradePositionData.getHedgedPos());
        positionItem.setDeltaBS(tradePositionData.getDeltaBS());
        positionItem.setDeltaPA(tradePositionData.getDeltaPA());
        positionItem.setThetaBS(tradePositionData.getThetaBS());
        positionItem.setThetaPA(tradePositionData.getThetaPA());
        if (Intrinsics.EZpvd((java.lang.Object) tradePositionData.getMgnMode(), (java.lang.Object) "cross")) {
            java.lang.Integer numValueOf = null;
            int i = 0;
            if (C54794xVo.copydefault.EZpvd()) {
                if (list != null) {
                    if (!list.isEmpty()) {
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.EZpvd((java.lang.Object) ((TradePositionData) it.next()).getMgnMode(), (java.lang.Object) "cross") && (i = i + 1) < 0) {
                                yDY.djBIcL();
                            }
                        }
                    }
                    numValueOf = java.lang.Integer.valueOf(i);
                }
                strGEmmrt = C33129mqd.gEmmrt(numValueOf);
            } else {
                if (list != null) {
                    if (!list.isEmpty()) {
                        for (TradePositionData tradePositionData2 : list) {
                            if (Intrinsics.EZpvd((java.lang.Object) tradePositionData2.getMgnMode(), (java.lang.Object) "cross") && Intrinsics.EZpvd((java.lang.Object) tradePositionData2.getCcy(), (java.lang.Object) tradePositionData.getCcy()) && (i = i + 1) < 0) {
                                yDY.djBIcL();
                            }
                        }
                    }
                    numValueOf = java.lang.Integer.valueOf(i);
                }
                strGEmmrt = C33129mqd.gEmmrt(numValueOf);
            }
            positionItem.setSharedMarginNum(strGEmmrt);
        }
        KWHzl(positionItem, tradePositionData.getPosUserInfo());
        return positionItem;
    }

    public static final void KWHzl(TradePositionManager.PositionItem positionItem, TradeUserPositionInfo tradeUserPositionInfo) {
        boolean zEZpvd = false;
        if (tradeUserPositionInfo == null) {
            positionItem.setAccountName(C55697xoo.OLrzqt.copydefault());
            positionItem.setCurrentAccount(true);
            positionItem.setMainAccount(false);
            positionItem.setAuthAccount(false);
            return;
        }
        positionItem.setAccountName(tradeUserPositionInfo.getAccountName());
        if (Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getMain(), (java.lang.Object) "1")) {
            if (!C55697xoo.OLrzqt.AuCTel()) {
                zEZpvd = true;
            }
        } else {
            zEZpvd = Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getAccountName(), (java.lang.Object) C55697xoo.OLrzqt.copydefault());
        }
        positionItem.setCurrentAccount(zEZpvd);
        positionItem.setMainAccount(Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getMain(), (java.lang.Object) "1"));
        positionItem.setAuthAccount(Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getAuth(), (java.lang.Object) "1"));
    }

    public final java.util.List<TradePositionManager.PositionItem> EZpvd(final java.util.List<TradePositionData> list, java.util.List<TradeUserPositionInfo> list2) {
        Sequence sequenceQVAiDq;
        Sequence sequenceFetchVPNInfo;
        java.util.List<TradePositionManager.PositionItem> listZuBGHE;
        boolean zEZpvd;
        java.lang.Object obj = null;
        if (list2 == null || list2.isEmpty() || !Intrinsics.EZpvd((java.lang.Object) ((TradeUserPositionInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).getAuth(), (java.lang.Object) "1")) {
            if (list == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TradePositionData tradePositionData : list) {
                tradePositionData.setPosUserInfo(null);
                arrayList.add(AEQbTJ.EZpvd(tradePositionData, list));
            }
            return arrayList;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            TradeUserPositionInfo tradeUserPositionInfo = (TradeUserPositionInfo) next;
            C55697xoo c55697xoo = C55697xoo.OLrzqt;
            if (c55697xoo.AuCTel()) {
                zEZpvd = Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getAccountName(), (java.lang.Object) c55697xoo.copydefault());
            } else {
                zEZpvd = Intrinsics.EZpvd((java.lang.Object) tradeUserPositionInfo.getMain(), (java.lang.Object) "1");
            }
            if (zEZpvd) {
                obj = next;
                break;
            }
        }
        final TradeUserPositionInfo tradeUserPositionInfo2 = (TradeUserPositionInfo) obj;
        if (list != null && (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(list)) != null && (sequenceFetchVPNInfo = C59467zhb.fetchVPNInfo(sequenceQVAiDq, new Function1() { // from class: o.xOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return xOJ.OLrzqt(tradeUserPositionInfo2, list, (TradePositionData) obj2);
            }
        })) != null) {
            final Function2 function2 = new Function2() { // from class: o.xOO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Integer.valueOf(xOJ.KWHzl((TradePositionManager.PositionItem) obj2, (TradePositionManager.PositionItem) obj3));
                }
            };
            Sequence sequenceKWHzl = C59467zhb.KWHzl(sequenceFetchVPNInfo, new java.util.Comparator() { // from class: o.xON
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.Comparator
                public final int compare(java.lang.Object obj2, java.lang.Object obj3) {
                    return xOJ.AEQbTJ(function2, obj2, obj3);
                }
            });
            if (sequenceKWHzl != null && (listZuBGHE = C59467zhb.zuBGHE(sequenceKWHzl)) != null) {
                return listZuBGHE;
            }
        }
        return yDY.AhwBna();
    }

    public static final TradePositionManager.PositionItem OLrzqt(TradeUserPositionInfo tradeUserPositionInfo, java.util.List list, TradePositionData tradePositionData) {
        Intrinsics.checkNotNullParameter(tradePositionData, "");
        if (tradePositionData.getPosUserInfo() == null) {
            tradePositionData.setPosUserInfo(tradeUserPositionInfo);
        }
        return AEQbTJ.EZpvd(tradePositionData, (java.util.List<TradePositionData>) list);
    }

    public static final int AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Number) function2.invoke(obj, obj2)).intValue();
    }

    public static final int KWHzl(TradePositionManager.PositionItem positionItem, TradePositionManager.PositionItem positionItem2) {
        if (!positionItem.isCurrentAccount()) {
            if (!positionItem2.isCurrentAccount()) {
                if (!positionItem.isMainAccount()) {
                    if (!positionItem2.isMainAccount()) {
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
