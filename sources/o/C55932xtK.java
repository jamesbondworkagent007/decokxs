package o;

import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.RebateTransItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55932xtK implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    public boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0256  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.lang.String instId;
        java.lang.String strAhwBna;
        java.lang.String gridProfit;
        java.lang.String investment;
        java.lang.String earnTotalProfit;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        kotlin.Pair pairOLrzqt3;
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        AutoEarnStakingParam autoEarn;
        BotCommon common3;
        BotCommon common4;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.lang.String status = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponseCopydefault.getSourceCcy())) {
            java.lang.String str5 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) strategyDetailsResponseCopydefault.getInstId(), new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null), 1);
            if (str5 == null) {
                str5 = "BTC";
            }
            instId = str5 + "-" + strategyDetailsResponseCopydefault.getSourceCcy();
            strAhwBna = strategyDetailsResponseCopydefault.getSourceCcy();
            Intrinsics.copydefault((java.lang.Object) strAhwBna);
            gridProfit = strategyDetailsResponseCopydefault.getGridProfitInSourceCcy();
            if (gridProfit == null) {
                gridProfit = "";
            }
            java.lang.String floatProfitInSourceCcy = strategyDetailsResponseCopydefault.getFloatProfitInSourceCcy();
            if (floatProfitInSourceCcy == null) {
                floatProfitInSourceCcy = "";
            }
            investment = strategyDetailsResponseCopydefault.getSourceCcySz();
            if (investment == null) {
                investment = "";
            }
            java.lang.String totalPnlInSourceCcy = strategyDetailsResponseCopydefault.getTotalPnlInSourceCcy();
            if (totalPnlInSourceCcy == null) {
                totalPnlInSourceCcy = "";
            }
            java.lang.String pnlRatioInSourceCcy = strategyDetailsResponseCopydefault.getPnlRatioInSourceCcy();
            if (pnlRatioInSourceCcy == null) {
                pnlRatioInSourceCcy = "";
            }
            java.lang.String sourceCcy = strategyDetailsResponseCopydefault.getSourceCcy();
            if (sourceCcy == null) {
                sourceCcy = "";
            }
            SmartEarnParam simpleEarn = strategyDetailsResponseCopydefault.getSimpleEarn();
            earnTotalProfit = simpleEarn != null ? simpleEarn.getEarnTotalProfitInSourceCcy() : null;
            str2 = floatProfitInSourceCcy;
            str3 = totalPnlInSourceCcy;
            str4 = pnlRatioInSourceCcy;
            str = sourceCcy;
        } else {
            instId = strategyDetailsResponseCopydefault.getInstId();
            strAhwBna = C56033xvF.AhwBna(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getDisplayId());
            gridProfit = strategyDetailsResponseCopydefault.getGridProfit();
            java.lang.String floatProfit = strategyDetailsResponseCopydefault.getFloatProfit();
            investment = strategyDetailsResponseCopydefault.getInvestment();
            java.lang.String totalPnl = strategyDetailsResponseCopydefault.getTotalPnl();
            java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
            SmartEarnParam simpleEarn2 = strategyDetailsResponseCopydefault.getSimpleEarn();
            earnTotalProfit = simpleEarn2 != null ? simpleEarn2.getEarnTotalProfit() : null;
            str = null;
            str2 = floatProfit;
            str3 = totalPnl;
            str4 = pnlRatio;
        }
        java.lang.String str6 = earnTotalProfit;
        java.lang.String str7 = gridProfit;
        java.lang.String str8 = investment;
        java.lang.String tradeQuoteCcy = strategyDetailsResponseCopydefault.getTradeQuoteCcy();
        java.lang.String str9 = (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) ? strAhwBna : tradeQuoteCcy;
        C56068xvo c56068xvo = C56068xvo.copydefault;
        kotlin.Pair pairKWHzl = c56068xvo.KWHzl(instId, strategyDetailsResponseCopydefault.getInstType(), str2, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : strAhwBna, (MLKEMEngine.KyberPolyBytes & 16) != 0, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : str9, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
        java.lang.String str10 = (java.lang.String) pairKWHzl.component1();
        int iIntValue = ((java.lang.Number) pairKWHzl.component2()).intValue();
        if (c55804xqp.copydefault().getShouldShowEarn()) {
            SmartEarnParam simpleEarn3 = c55804xqp.copydefault().getSimpleEarn();
            if (simpleEarn3 != null && simpleEarn3.getEnabled() && str6 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str6)) {
                pairOLrzqt = c56068xvo.KWHzl(instId, strategyDetailsResponseCopydefault.getInstType(), str6, (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : strAhwBna, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? true : true, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : str9, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("", java.lang.Integer.valueOf(C56033xvF.OLrzqt((java.lang.Object) null)));
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str11 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        java.lang.String str12 = instId;
        java.lang.String str13 = strAhwBna;
        java.lang.String str14 = str9;
        java.lang.String strAEQbTJ = c56068xvo.AEQbTJ(str12, strategyDetailsResponseCopydefault.getInstType(), str7, (536 & 8) != 0 ? "" : str13, (536 & 16) != 0, (536 & 32) != 0 ? false : true, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : str14);
        java.lang.String strAEQbTJ2 = c56068xvo.AEQbTJ(str12, strategyDetailsResponseCopydefault.getInstType(), str3, (536 & 8) != 0 ? "" : str13, (536 & 16) != 0, (536 & 32) != 0 ? false : false, (536 & 64) != 0 ? false : true, (536 & 128) != 0 ? null : null, (536 & 256) != 0 ? RoundingMode.FLOOR : null, (536 & 512) != 0 ? null : str14);
        java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strAhwBna, str8, RoundingMode.UP, true, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), str9, null, null, 1584, null);
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                java.lang.String strAddS$default = C33129mqd.addS$default(str6, c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), null, null, null, 14, null);
                java.lang.String status2 = c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus();
                java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
                SmartEarnParam simpleEarn4 = strategyDetailsResponseCopydefault.getSimpleEarn();
                pairOLrzqt2 = C55884xsP.EZpvd(strAddS$default, status2, instId, instType, str9, str9, simpleEarn4 != null && simpleEarn4.getEnabled());
            }
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str15 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue3 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? null : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = c55804xqp.copydefault().getBot().getCommon().getAutoStaking();
            pairOLrzqt3 = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), instId, strategyDetailsResponseCopydefault.getInstType(), str9, null, 32, null);
        } else {
            pairOLrzqt3 = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str16 = (java.lang.String) pairOLrzqt3.component1();
        int iIntValue4 = ((java.lang.Number) pairOLrzqt3.component2()).intValue();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String orderType = strategyDetailsResponseCopydefault.getOrderType();
        java.lang.String instId2 = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType2 = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponseCopydefault.getTotalAnnualizedRate(), 0, RoundingMode.DOWN, 2, null);
        java.lang.String ccy = strategyDetailsResponseCopydefault.getCcy();
        java.lang.String strOLrzqt = OLrzqt(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getRebateTrans());
        int pnlColor$default = C56033xvF.getPnlColor$default(instId, strategyDetailsResponseCopydefault.getInstType(), str3, null, 8, null);
        boolean z = this.EZpvd;
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status3 = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? null : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        if (bot4 != null && (common = bot4.getCommon()) != null && (autoStaking = common.getAutoStaking()) != null) {
            status = autoStaking.getStatus();
        }
        return new BenefitDetails(algoId, orderType, instId2, instType2, str9, null, strAEQbTJ, 0, str10, strFmtBotValueBySymbol$default, null, null, percent$default, strAEQbTJ2, str4, null, ccy, null, null, null, null, null, null, null, null, null, null, strOLrzqt, null, 0, null, null, null, false, z, pnlColor$default, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, str, null, null, null, null, null, null, null, str11, iIntValue2, iIntValue, str16, iIntValue4, str15, iIntValue3, status3, status, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, c55804xqp.copydefault().getTrailingDownConfig(), c55804xqp.copydefault().getTrailingDownFund(), -134312800, 133693427, 671088624, null);
    }

    private final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.util.ArrayList<RebateTransItem> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return "--";
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (RebateTransItem rebateTransItem : arrayList) {
            java.lang.String rebate = rebateTransItem.getRebate();
            java.lang.String str3 = "";
            if (rebate == null) {
                rebate = "";
            }
            java.lang.String rebateCcy = rebateTransItem.getRebateCcy();
            if (rebateCcy == null) {
                rebateCcy = "";
            }
            java.lang.String strGEmmrt = C56033xvF.gEmmrt(str, str2, rebate, rebateCcy);
            java.lang.String rebateCcy2 = rebateTransItem.getRebateCcy();
            if (rebateCcy2 != null) {
                str3 = rebateCcy2;
            }
            arrayList2.add(strGEmmrt + " " + str3);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, " + ", null, null, 0, null, null, 62, null);
    }
}
