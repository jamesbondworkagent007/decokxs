package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AiBotDto;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.bot.data.ShareData;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.C48033uCm;
import o.C53698wqR;
import o.C55688xof;
import o.C59462zhW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53772wrm {
    public static final C53780wru KWHzl(@NotNull TacticsData tacticsData) {
        AiBotDto ai;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotVo bot = tacticsData.getBot();
        if (bot == null || (ai = bot.getAi()) == null) {
            return null;
        }
        BotVo bot2 = tacticsData.getBot();
        BacktestDto backtest = bot2 != null ? bot2.getBacktest() : null;
        boolean z = true;
        boolean z2 = backtest != null;
        if (backtest == null || (backtest.getStatus() != BotStatus.Completed && backtest.getStatus() != BotStatus.Failed)) {
            z = false;
        }
        return new C53780wru(copydefault(tacticsData, z2, ai.getInstIds()), EZpvd(tacticsData, ai, backtest, z2, z), OLrzqt(tacticsData, z, backtest, tacticsData.getRunningDuration()));
    }

    public static final java.lang.String copydefault(TacticsData tacticsData, boolean z, java.util.List<java.lang.String> list) {
        BotCommon common;
        BotVo bot = tacticsData.getBot();
        java.lang.String stgyName = (bot == null || (common = bot.getCommon()) == null) ? null : common.getStgyName();
        if (stgyName != null && stgyName.length() != 0) {
            return stgyName;
        }
        if (z) {
            return C33069mpW.copydefault(C48033uCm.Fragment.dNCPSb, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 2, null, new Function1() { // from class: o.wro
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53772wrm.copydefault((java.lang.String) obj);
                }
            }, 23, null))));
        }
        return C33069mpW.copydefault(C48033uCm.Fragment.dvKsVJ, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 2, null, new Function1() { // from class: o.wrt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53772wrm.OLrzqt((java.lang.String) obj);
            }
        }, 23, null))));
    }

    public static final java.lang.CharSequence copydefault(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.lang.CharSequence OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String upperCase = TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public static final java.util.List<C53777wrr> EZpvd(TacticsData tacticsData, final AiBotDto aiBotDto, BacktestDto backtestDto, boolean z, boolean z2) {
        java.lang.String runningDuration;
        java.lang.String strAYXKKw;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(new C53777wrr(C33070mpX.AYXKKw(C55688xof.Application.getCurrent), C52694wUx.toTextProperties$default(aiBotDto.getTotalPnl(), 0, new Function1() { // from class: o.wrq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53772wrm.AEQbTJ(aiBotDto, (java.lang.String) obj);
            }
        }, 1, null), null, false, 12, null));
        if (z2 && backtestDto != null) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.gkJEwt);
            C48235uJz c48235uJz = C48235uJz.EZpvd;
            java.lang.String virtualStartTime = backtestDto.getVirtualStartTime();
            if (virtualStartTime == null) {
                virtualStartTime = "";
            }
            java.lang.String virtualEndTime = backtestDto.getVirtualEndTime();
            if (virtualEndTime == null) {
                virtualEndTime = "";
            }
            listOLrzqt.add(new C53777wrr(strAYXKKw2, new uJQ(uLP.EZpvd(c48235uJz.copydefault(virtualStartTime, virtualEndTime, backtestDto.getStatus()), ""), null, 2, null), null, false, 12, null));
        } else {
            if (backtestDto != null) {
                long jValueOf = C33129mqd.valueOf(backtestDto.getStartTime());
                long jValueOf2 = C33129mqd.valueOf(backtestDto.getFinishTime());
                C59462zhW.Activity activity = C59462zhW.OLrzqt;
                runningDuration = java.lang.String.valueOf(C59462zhW.gEmmrt(C59462zhW.OLrzqt(C59519zia.AEQbTJ(jValueOf2 - jValueOf, DurationUnit.MILLISECONDS), C33129mqd.djBIcL(backtestDto.getProgress()))));
            } else {
                runningDuration = tacticsData.getRunningDuration();
            }
            if (tacticsData.getHistory()) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setHideOnContentScrollEnabled);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.collapseActionView);
            }
            listOLrzqt.add(new C53777wrr(strAYXKKw + " | " + C33070mpX.AYXKKw(C55688xof.Application.isTimeProfileEmpty), new uJQ(uLP.EZpvd(wUB.copydefault(C33129mqd.valueOf(runningDuration)), ""), null, 2, null), null, false, 4, null));
        }
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C48033uCm.Fragment.ffGIBT);
        uJQ ujq = new uJQ(uLP.EZpvd(aiBotDto.getAiModel().getName(), aiBotDto.getAiModel().getName()), null, 2, null);
        java.lang.String strAEQbTJ = C53418wlC.AEQbTJ(aiBotDto.getAiModel().getIconUrl());
        if (strAEQbTJ.length() == 0) {
            strAEQbTJ = C48235uJz.EZpvd.EZpvd().get(aiBotDto.getAiModel().getName());
        }
        listOLrzqt.add(new C53777wrr(strAYXKKw3, ujq, strAEQbTJ, false, 8, null));
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static final java.lang.String AEQbTJ(AiBotDto aiBotDto, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C38305pTw.formatCryptoCode$default(C33129mqd.EZpvd(str), aiBotDto.getInvestCcy(), null, C38307pTy.Companion.AEQbTJ(4), null, null, null, 58, null);
    }

    public static final java.util.List<java.lang.String> OLrzqt(TacticsData tacticsData, boolean z, BacktestDto backtestDto, java.lang.String str) {
        java.lang.String strAYXKKw;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        java.lang.String instType = tacticsData.getInstType();
        int iHashCode = instType.hashCode();
        java.lang.String strAYXKKw2 = "";
        if (iHashCode == 2552066) {
            strAYXKKw = !instType.equals("SPOT") ? "" : C33070mpX.AYXKKw(C48033uCm.Fragment.zKcAg);
        } else {
            strAYXKKw = iHashCode != 2558355 ? C33070mpX.AYXKKw(C48033uCm.Fragment.UccSpe) : C33070mpX.AYXKKw(C48033uCm.Fragment.UccSpe);
        }
        if (strAYXKKw.length() > 0) {
            listOLrzqt.add(strAYXKKw);
        }
        if (z) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.DTwDnp);
        } else if (!tacticsData.getHistory()) {
            strAYXKKw2 = C33069mpW.copydefault(C48033uCm.Fragment.ROgMPW, C56423yEv.EZpvd(C56390yDp.OLrzqt("durationDayTime", wUB.copydefault(C33129mqd.valueOf(str)))));
        } else if (tacticsData.getHistory()) {
            strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.zFZsbn);
        }
        if (strAYXKKw2.length() > 0) {
            listOLrzqt.add(strAYXKKw2);
        }
        if (C54589xNz.EZpvd.EZpvd()) {
            listOLrzqt.add(C33070mpX.AYXKKw(C55688xof.Application.fmB));
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public static /* synthetic */ void shareAiBot$default(TacticsData tacticsData, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        AEQbTJ(tacticsData, abstractActivityC33041mov, z, z2);
    }

    public static final void AEQbTJ(@NotNull TacticsData tacticsData, @NotNull AbstractActivityC33041mov abstractActivityC33041mov, boolean z, boolean z2) {
        AiBotDto ai;
        AiBotDto ai2;
        AiBotDto ai3;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        C53780wru c53780wruKWHzl = KWHzl(tacticsData);
        if (c53780wruKWHzl == null) {
            return;
        }
        C53698wqR.TaskDescription taskDescription = C53698wqR.Companion;
        BotVo bot = tacticsData.getBot();
        java.lang.String investCcy = null;
        java.lang.String totalPnlRate = (bot == null || (ai3 = bot.getAi()) == null) ? null : ai3.getTotalPnlRate();
        java.lang.String str = totalPnlRate == null ? "" : totalPnlRate;
        BotVo bot2 = tacticsData.getBot();
        java.lang.String totalPnl = (bot2 == null || (ai2 = bot2.getAi()) == null) ? null : ai2.getTotalPnl();
        java.lang.String str2 = totalPnl == null ? "" : totalPnl;
        BotVo bot3 = tacticsData.getBot();
        if (bot3 != null && (ai = bot3.getAi()) != null) {
            investCcy = ai.getInvestCcy();
        }
        TacticsData tacticsDataCopy = tacticsData.copy(((-262145) & 1) != 0 ? tacticsData.orderType : null, ((-262145) & 2) != 0 ? tacticsData.algoId : null, ((-262145) & 4) != 0 ? tacticsData.instType : null, ((-262145) & 8) != 0 ? tacticsData.instId : null, ((-262145) & 16) != 0 ? tacticsData.state : null, ((-262145) & 32) != 0 ? tacticsData.filledPercentage : null, ((-262145) & 64) != 0 ? tacticsData.history : false, ((-262145) & 128) != 0 ? tacticsData.tvTitle : null, ((-262145) & 256) != 0 ? tacticsData.tacticsType : null, ((-262145) & 512) != 0 ? tacticsData.ivShareRes : 0, ((-262145) & 1024) != 0 ? tacticsData.level : null, ((-262145) & 2048) != 0 ? tacticsData.cTime : null, ((-262145) & 4096) != 0 ? tacticsData.cTimeStamp : 0L, ((-262145) & 8192) != 0 ? tacticsData.pnlRatio : null, ((-262145) & 16384) != 0 ? tacticsData.subData : null, ((-262145) & 32768) != 0 ? tacticsData.tradeSymbol : null, ((-262145) & 65536) != 0 ? tacticsData.stopStateText : null, ((-262145) & 131072) != 0 ? tacticsData.stopOrangeHint : null, ((-262145) & 262144) != 0 ? tacticsData.shareData : new ShareData(null, str, null, str2, null, null, null, null, null, null, null, null, null, null, investCcy, 16373, null), ((-262145) & 524288) != 0 ? tacticsData.instList : null, ((-262145) & 1048576) != 0 ? tacticsData.associate : null, ((-262145) & 2097152) != 0 ? tacticsData.stgyName : null, ((-262145) & 4194304) != 0 ? tacticsData.direction : null, ((-262145) & 8388608) != 0 ? tacticsData.tpTriggerPx : null, ((-262145) & 16777216) != 0 ? tacticsData.slTriggerPx : null, ((-262145) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.tpRatio : null, ((-262145) & 67108864) != 0 ? tacticsData.slRatio : null, ((-262145) & 134217728) != 0 ? tacticsData.priceLocker : null, ((-262145) & 268435456) != 0 ? tacticsData.recItemList : null, ((-262145) & 536870912) != 0 ? tacticsData.hoardItemList : null, ((-262145) & 1073741824) != 0 ? tacticsData.investCcy : null, ((-262145) & Integer.MIN_VALUE) != 0 ? tacticsData.lastPrice : null, ((-1) & 1) != 0 ? tacticsData.operateList : null, ((-1) & 2) != 0 ? tacticsData.extraOperatorList : null, ((-1) & 4) != 0 ? tacticsData.labelList : null, ((-1) & 8) != 0 ? tacticsData.signParams : null, ((-1) & 16) != 0 ? tacticsData.uTime : null, ((-1) & 32) != 0 ? tacticsData.triggerParams : null, ((-1) & 64) != 0 ? tacticsData.cycleId : null, ((-1) & 128) != 0 ? tacticsData.stopType : null, ((-1) & 256) != 0 ? tacticsData.tpPx : null, ((-1) & 512) != 0 ? tacticsData.slPx : null, ((-1) & 1024) != 0 ? tacticsData.tpslTriggerParam : null, ((-1) & 2048) != 0 ? tacticsData.tpPriceRange : null, ((-1) & 4096) != 0 ? tacticsData.gridState : null, ((-1) & 8192) != 0 ? tacticsData.originalLevel : null, ((-1) & 16384) != 0 ? tacticsData.actualMarginSz : null, ((-1) & 32768) != 0 ? tacticsData.extraMarginSz : null, ((-1) & 65536) != 0 ? tacticsData.liqPx : null, ((-1) & 131072) != 0 ? tacticsData.longLiqPx : null, ((-1) & 262144) != 0 ? tacticsData.shortLiqPx : null, ((-1) & 524288) != 0 ? tacticsData.tradeNum : null, ((-1) & 1048576) != 0 ? tacticsData.pxSpread : null, ((-1) & 2097152) != 0 ? tacticsData.pxVar : null, ((-1) & 4194304) != 0 ? tacticsData.pxLimit : null, ((-1) & 8388608) != 0 ? tacticsData.timeInterval : null, ((-1) & 16777216) != 0 ? tacticsData.szLimit : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.sz : null, ((-1) & 67108864) != 0 ? tacticsData.side : null, ((-1) & 134217728) != 0 ? tacticsData.posSide : null, ((-1) & 268435456) != 0 ? tacticsData.tdMode : null, ((-1) & 536870912) != 0 ? tacticsData.reduce_only : null, ((-1) & 1073741824) != 0 ? tacticsData.ccy : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.copyType : null, ((-1) & 1) != 0 ? tacticsData.profitSharingRatio : null, ((-1) & 2) != 0 ? tacticsData.sourceAlgoId : null, ((-1) & 4) != 0 ? tacticsData.mktCap : null, ((-1) & 8) != 0 ? tacticsData.instIds : null, ((-1) & 16) != 0 ? tacticsData.totalAmt : null, ((-1) & 32) != 0 ? tacticsData.signalChanId : null, ((-1) & 64) != 0 ? tacticsData.signalChanName : null, ((-1) & 128) != 0 ? tacticsData.floatingPnl : null, ((-1) & 256) != 0 ? tacticsData.availableMargin : null, ((-1) & 512) != 0 ? tacticsData.totalPnlRatio : null, ((-1) & 1024) != 0 ? tacticsData.signalCount : null, ((-1) & 2048) != 0 ? tacticsData.supportEarlyFill : false, ((-1) & 4096) != 0 ? tacticsData.signalSubsSizeDesc : null, ((-1) & 8192) != 0 ? tacticsData.signalSubsSize : null, ((-1) & 16384) != 0 ? tacticsData.signalSource : null, ((-1) & 32768) != 0 ? tacticsData.profitRateDesc : null, ((-1) & 65536) != 0 ? tacticsData.profit : null, ((-1) & 131072) != 0 ? tacticsData.symbolsNumber : null, ((-1) & 262144) != 0 ? tacticsData.locatePage : 0, ((-1) & 524288) != 0 ? tacticsData.maxPx : null, ((-1) & 1048576) != 0 ? tacticsData.minPx : null, ((-1) & 2097152) != 0 ? tacticsData.runType : null, ((-1) & 4194304) != 0 ? tacticsData.gridNum : null, ((-1) & 8388608) != 0 ? tacticsData.trailingUpConfig : null, ((-1) & 16777216) != 0 ? tacticsData.trailingDownConfig : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.trailingDownFund : null, ((-1) & 67108864) != 0 ? tacticsData.reserveFunds : null, ((-1) & 134217728) != 0 ? tacticsData.basePos : false, ((-1) & 268435456) != 0 ? tacticsData.perGridProfitRatio : null, ((-1) & 536870912) != 0 ? tacticsData.perMinProfitRate : null, ((-1) & 1073741824) != 0 ? tacticsData.perMaxProfitRate : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.balType : null, ((-1) & 1) != 0 ? tacticsData.interval : null, ((-1) & 2) != 0 ? tacticsData.deltaRatio : null, ((-1) & 4) != 0 ? tacticsData.maxSafetyOrds : null, ((-1) & 8) != 0 ? tacticsData.pxSteps : null, ((-1) & 16) != 0 ? tacticsData.pxStepsMult : null, ((-1) & 32) != 0 ? tacticsData.volMult : null, ((-1) & 64) != 0 ? tacticsData.tpPct : null, ((-1) & 128) != 0 ? tacticsData.slPct : null, ((-1) & 256) != 0 ? tacticsData.slMode : null, ((-1) & 512) != 0 ? tacticsData.triggerType : null, ((-1) & 1024) != 0 ? tacticsData.trackingMode : null, ((-1) & 2048) != 0 ? tacticsData.autoMarginReloadSwitch : false, ((-1) & 4096) != 0 ? tacticsData.autoMarginReloadMaxAmount : null, ((-1) & 8192) != 0 ? tacticsData.extendedBusinessInfo : null, ((-1) & 16384) != 0 ? tacticsData.instFamily : null, ((-1) & 32768) != 0 ? tacticsData.arbList : null, ((-1) & 65536) != 0 ? tacticsData.outOfRange : false, ((-1) & 131072) != 0 ? tacticsData.sourceCcy : null, ((-1) & 262144) != 0 ? tacticsData.sourceCcySz : null, ((-1) & 524288) != 0 ? tacticsData.curQuoteSz : null, ((-1) & 1048576) != 0 ? tacticsData.curBaseSz : null, ((-1) & 2097152) != 0 ? tacticsData.isPostWarning : null, ((-1) & 4194304) != 0 ? tacticsData.ruleType : null, ((-1) & 8388608) != 0 ? tacticsData.isTradeBorrowMode : null, ((-1) & 16777216) != 0 ? tacticsData.totalPnl : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.isShowTWapTips : false, ((-1) & 67108864) != 0 ? tacticsData.strategyTags : null, ((-1) & 134217728) != 0 ? tacticsData.signalOrderAmtParam : null, ((-1) & 268435456) != 0 ? tacticsData.signalBotOrderStopParam : null, ((-1) & 536870912) != 0 ? tacticsData.voucherInfo : null, ((-1) & 1073741824) != 0 ? tacticsData.forbidden : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.hiddenFeatures : null, ((-1) & 1) != 0 ? tacticsData.dcdState : null, ((-1) & 2) != 0 ? tacticsData.reinvestment : false, ((-1) & 4) != 0 ? tacticsData.lastTradeExpireTime : null, ((-1) & 8) != 0 ? tacticsData.lastSettlementSettledTime : null, ((-1) & 16) != 0 ? tacticsData.profitData : null, ((-1) & 32) != 0 ? tacticsData.runningDuration : null, ((-1) & 64) != 0 ? tacticsData.arbitrageStakingError : null, ((-1) & 128) != 0 ? tacticsData.isSmartArbitrageWithStaking : false, ((-1) & 256) != 0 ? tacticsData.deeplink : null, ((-1) & 512) != 0 ? tacticsData.source : null, ((-1) & 1024) != 0 ? tacticsData.topupActualMarginSz : null, ((-1) & 2048) != 0 ? tacticsData.simpleEarn : null, ((-1) & 4096) != 0 ? tacticsData.baseSz : null, ((-1) & 8192) != 0 ? tacticsData.investmentType : null, ((-1) & 16384) != 0 ? tacticsData.investment : null, ((-1) & 32768) != 0 ? tacticsData.cbAutoReserve : null, ((-1) & 65536) != 0 ? tacticsData.arbitrageTotalPnlInfo : null, ((-1) & 131072) != 0 ? tacticsData.leverPrincipal : null, ((-1) & 262144) != 0 ? tacticsData.contractDcaSpecialData : null, ((-1) & 524288) != 0 ? tacticsData.highestApyPeriod : null, ((-1) & 1048576) != 0 ? tacticsData.displayMinPaybackDays : false, ((-1) & 2097152) != 0 ? tacticsData.fundingFeeApyList : null, ((-1) & 4194304) != 0 ? tacticsData.profitSnapshots : null, ((-1) & 8388608) != 0 ? tacticsData.latestProfitData : null, ((-1) & 16777216) != 0 ? tacticsData.tradeQuoteCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.smartArbProfitsInfo : null, ((-1) & 67108864) != 0 ? tacticsData.balanceDetails : null, ((-1) & 134217728) != 0 ? tacticsData.bot : null, ((-1) & 268435456) != 0 ? tacticsData.autoVipProfitInfo : null, ((-1) & 536870912) != 0 ? tacticsData.initOrdAmt : null, ((-1) & 1073741824) != 0 ? tacticsData.safetyOrdAmt : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.effectiveEditParametersDetails : null, (3 & 1) != 0 ? tacticsData.swapCoinMProfitSwitchUiModel : null, (3 & 2) != 0 ? tacticsData.recurringBuyDetails : null);
        java.util.List<StrategyProfitResponse> profitSnapshots = tacticsData.getProfitSnapshots();
        if (profitSnapshots == null) {
            profitSnapshots = yDY.AhwBna();
        }
        taskDescription.KWHzl(tacticsDataCopy, abstractActivityC33041mov, z, profitSnapshots, z2, c53780wruKWHzl);
    }
}
