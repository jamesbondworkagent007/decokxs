package o;

import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55926xtE implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    public boolean AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r72v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r72v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r72v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r73v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r73v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r73v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.lang.String string;
        AutoEarnStakingParam autoEarnStakingParam;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        AutoEarnStakingParam autoEarn;
        BotCommon common3;
        BotCommon common4;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.lang.String tradeQuoteCcy = strategyDetailsResponseCopydefault.getTradeQuoteCcy();
        java.lang.String investmentCcy = strategyDetailsResponseCopydefault.getInvestmentCcy();
        if (tradeQuoteCcy == null || tradeQuoteCcy.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)) {
            tradeQuoteCcy = investmentCcy;
        }
        java.lang.String str = "--";
        java.lang.String botPnl$default = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponseCopydefault.getTotalPnl()) ? "--" : C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, false, true, null, false, tradeQuoteCcy, null, null, 1752, null);
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.takeNonBlankTradeQuoteCcy();
        if (strTakeNonBlankTradeQuoteCcy == null) {
            strTakeNonBlankTradeQuoteCcy = C56033xvF.AhwBna(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getDisplayId());
        }
        kotlin.Pair pairKWHzl = C56068xvo.copydefault.KWHzl(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalCycleProfit(), (MLKEMEngine.KyberPolyBytes & 8) != 0 ? "" : tradeQuoteCcy, (MLKEMEngine.KyberPolyBytes & 16) != 0 ? true : true, (MLKEMEngine.KyberPolyBytes & 32) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 64) != 0 ? false : true, (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? RoundingMode.FLOOR : null, (MLKEMEngine.KyberPolyBytes & 512) != 0 ? null : tradeQuoteCcy, (MLKEMEngine.KyberPolyBytes & 1024) != 0 ? null : null);
        java.lang.String str2 = (java.lang.String) pairKWHzl.component1();
        int iIntValue = ((java.lang.Number) pairKWHzl.component2()).intValue();
        java.lang.String str3 = " ";
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponseCopydefault.getAdditionalFundNeeded())) {
            string = "--";
        } else {
            java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(tradeQuoteCcy, strategyDetailsResponseCopydefault.getAdditionalFundNeeded(), RoundingMode.UP, false, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1848, null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(strFmtBotValueBySymbol$default);
            str3 = " ";
            sb.append(str3);
            sb.append(strTakeNonBlankTradeQuoteCcy);
            string = sb.toString();
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strategyDetailsResponseCopydefault.getMaxBotUsage())) {
            str = C56033xvF.fmtBotValueBySymbol$default(tradeQuoteCcy, strategyDetailsResponseCopydefault.getMaxBotUsage(), RoundingMode.UP, false, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1848, null) + str3 + strTakeNonBlankTradeQuoteCcy;
        }
        java.lang.String str4 = str;
        java.lang.String strCopydefault = xMR.copydefault.copydefault(strategyDetailsResponseCopydefault.getCompletedCycles());
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                pairOLrzqt = C55884xsP.copydefault(c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), tradeQuoteCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
                autoEarnStakingParam = null;
            }
        } else {
            autoEarnStakingParam = null;
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str5 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? autoEarnStakingParam : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            pairOLrzqt2 = C55884xsP.formatAutoStake$default(c55804xqp.copydefault().getBot().getCommon().getAutoStaking().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoStaking().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), tradeQuoteCcy, null, 32, null);
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(autoEarnStakingParam, 0);
        }
        java.lang.String str6 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue3 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String algoOrdType = strategyDetailsResponseCopydefault.getAlgoOrdType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String floatProfit = strategyDetailsResponseCopydefault.getFloatProfit();
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String investmentCcy2 = strategyDetailsResponseCopydefault.getInvestmentCcy();
        java.lang.String investmentCcy3 = strategyDetailsResponseCopydefault.getInvestmentCcy();
        java.lang.String investmentAmt = strategyDetailsResponseCopydefault.getInvestmentAmt();
        java.lang.String fillSafetyOrds = strategyDetailsResponseCopydefault.getFillSafetyOrds();
        java.lang.String maxSafetyOrds = strategyDetailsResponseCopydefault.getMaxSafetyOrds();
        java.lang.String avgPx = strategyDetailsResponseCopydefault.getAvgPx();
        boolean reserveFunds = strategyDetailsResponseCopydefault.getReserveFunds();
        boolean z = this.AEQbTJ;
        int pnlColor$default = C56033xvF.getPnlColor$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, 8, null);
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? autoEarnStakingParam : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        return new BenefitDetails(algoId, algoOrdType, instId, instType, strTakeNonBlankTradeQuoteCcy, null, null, 0, floatProfit, null, null, null, null, botPnl$default, pnlRatio, null, investmentCcy2, null, null, null, null, investmentAmt, investmentCcy3, avgPx, fillSafetyOrds, maxSafetyOrds, strCopydefault, null, str2, iIntValue, null, string, str4, reserveFunds, z, pnlColor$default, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, str6, iIntValue3, str5, iIntValue2, status, (bot4 == null || (common = bot4.getCommon()) == null || (autoStaking = common.getAutoStaking()) == null) ? autoEarnStakingParam : autoStaking.getStatus(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, null, null, 1209966304, 1073741808, -402653200, null);
    }
}
