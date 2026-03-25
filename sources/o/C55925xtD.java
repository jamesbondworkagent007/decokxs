package o;

import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55925xtD implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
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
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.takeNonBlankTradeQuoteCcy();
        if (strTakeNonBlankTradeQuoteCcy == null) {
            strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.getInvestCcy();
        }
        java.lang.String investCcy = strategyDetailsResponseCopydefault.getInvestCcy();
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default("", strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), strategyDetailsResponseCopydefault.getInvestCcy(), false, true, null, false, null, null, null, 2000, null);
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                pairOLrzqt = C55884xsP.copydefault(c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), investCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
                autoEarnStakingParam = null;
            }
        } else {
            autoEarnStakingParam = null;
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? autoEarnStakingParam : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = c55804xqp.copydefault().getBot().getCommon().getAutoStaking();
            pairOLrzqt2 = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), investCcy, null, 32, null);
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(autoEarnStakingParam, 0);
        }
        java.lang.String str2 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String algoOrdType = strategyDetailsResponseCopydefault.getAlgoOrdType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String str3 = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getGridProfit(), null, false, false, null, false, null, null, null, 2040, null) + " " + strTakeNonBlankTradeQuoteCcy + " ";
        java.lang.String str4 = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getFloatProfit(), null, false, false, null, false, null, null, null, 2040, null) + " " + strTakeNonBlankTradeQuoteCcy + " ";
        java.lang.String str5 = C56033xvF.getBotPrice$default(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInvestment(), false, false, null, null, 120, null) + " " + strTakeNonBlankTradeQuoteCcy + " ";
        java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, C33129mqd.mulS$default(strategyDetailsResponseCopydefault.getTotalAnnualizedRate(), 100, null, null, null, 14, null), 0, null, 6, null);
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String ccy = strategyDetailsResponseCopydefault.getCcy();
        java.lang.String str6 = C56033xvF.OLrzqt(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getEq(), "") + " " + investCcy + " ";
        java.lang.String mktCap = strategyDetailsResponseCopydefault.getMktCap();
        java.lang.String investAmt = strategyDetailsResponseCopydefault.getInvestAmt();
        int iDjBIcL = C56033xvF.djBIcL("", strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), strategyDetailsResponseCopydefault.getInvestCcy());
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        boolean zIsHistory = strategyDetailsResponseCopydefault.isHistory();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? null : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        return new BenefitDetails(algoId, algoOrdType, instId, instType, strTakeNonBlankTradeQuoteCcy, str3, str4, 0, str5, null, null, null, percent$default, botPnl$default, pnlRatio, null, ccy, mktCap, str6, strTakeNonBlankTradeQuoteCcy, investAmt, null, null, null, null, null, null, null, null, 0, null, null, null, false, zIsHistory, iDjBIcL, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, str2, iIntValue2, str, iIntValue, status, (bot4 == null || (common = bot4.getCommon()) == null || (autoStaking = common.getAutoStaking()) == null) ? null : autoStaking.getStatus(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, null, null, -2060672, 1073741811, -402653200, null);
    }
}
