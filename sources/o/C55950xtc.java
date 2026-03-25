package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55950xtc implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c1  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        AutoEarnStakingParam autoEarn;
        BotCommon common3;
        BotCommon common4;
        BizInstrument suggestedInstrument$default;
        java.lang.String marginSymbol;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String str = (interfaceC54581xNrCopydefault == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, 12, null)) == null || (marginSymbol = suggestedInstrument$default.getMarginSymbol()) == null) ? "" : marginSymbol;
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                pairOLrzqt = C55884xsP.copydefault(c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInvestCcy(), (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str2 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? null : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = c55804xqp.copydefault().getBot().getCommon().getAutoStaking();
            pairOLrzqt2 = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInvestCcy(), null, 32, null);
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str3 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String algoOrdType = strategyDetailsResponseCopydefault.getAlgoOrdType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String floatProfit = strategyDetailsResponseCopydefault.getFloatProfit();
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String investmentCcy = strategyDetailsResponseCopydefault.getInvestmentCcy();
        java.lang.String investmentCcy2 = strategyDetailsResponseCopydefault.getInvestmentCcy();
        java.lang.String investmentAmt = strategyDetailsResponseCopydefault.getInvestmentAmt();
        java.lang.String completedCycles = strategyDetailsResponseCopydefault.getCompletedCycles();
        java.lang.String fillSafetyOrds = strategyDetailsResponseCopydefault.getFillSafetyOrds();
        java.lang.String maxSafetyOrds = strategyDetailsResponseCopydefault.getMaxSafetyOrds();
        java.lang.String avgPx = strategyDetailsResponseCopydefault.getAvgPx();
        java.lang.String maxBotUsage = strategyDetailsResponseCopydefault.getMaxBotUsage();
        java.lang.String totalCycleProfit = strategyDetailsResponseCopydefault.getTotalCycleProfit();
        int pnlColor$default = C56033xvF.getPnlColor$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, 8, null);
        java.lang.String transferInMargin = strategyDetailsResponseCopydefault.getTransferInMargin();
        java.lang.String reserveFundingFee = strategyDetailsResponseCopydefault.getReserveFundingFee();
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? null : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        return new BenefitDetails(algoId, algoOrdType, instId, instType, str, null, null, 0, floatProfit, null, null, null, null, botPnl$default, pnlRatio, null, investmentCcy, null, null, null, null, investmentAmt, investmentCcy2, avgPx, fillSafetyOrds, maxSafetyOrds, completedCycles, null, totalCycleProfit, 0, null, null, maxBotUsage, false, false, pnlColor$default, transferInMargin, reserveFundingFee, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, str3, iIntValue2, str2, iIntValue, status, (bot4 == null || (common = bot4.getCommon()) == null || (autoStaking = common.getAutoStaking()) == null) ? null : autoStaking.getStatus(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, null, null, -400646432, 1073741766, -402653200, null);
    }
}
