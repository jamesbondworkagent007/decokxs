package o;

import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55970xtw implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.lang.String status;
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
        java.lang.String strAEQbTJ = C56033xvF.AEQbTJ(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId());
        java.lang.String strOLrzqt = C56033xvF.OLrzqt(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), "");
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                status = null;
                pairOLrzqt = C55884xsP.copydefault(c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strAEQbTJ, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
            }
        } else {
            status = null;
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? status : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = c55804xqp.copydefault().getBot().getCommon().getAutoStaking();
            pairOLrzqt2 = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strAEQbTJ, null, 32, null);
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(status, 0);
        }
        java.lang.String str2 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String orderType = strategyDetailsResponseCopydefault.getOrderType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String floatingPnl = strategyDetailsResponseCopydefault.getFloatingPnl();
        java.lang.String str3 = floatingPnl == null ? "" : floatingPnl;
        java.lang.String totalEquity = strategyDetailsResponseCopydefault.getTotalEquity();
        java.lang.String str4 = totalEquity == null ? "" : totalEquity;
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strAEQbTJ, str4, roundingMode, true, null, false, null, null, null, null, null, 2032, null);
        java.lang.String percent$default = xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponseCopydefault.getTotalAnnualizedRate(), 0, roundingMode, 2, null);
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
        java.lang.String totalPnlRatio = strategyDetailsResponseCopydefault.getTotalPnlRatio();
        java.lang.String str5 = totalPnlRatio == null ? "" : totalPnlRatio;
        java.lang.String ccy = strategyDetailsResponseCopydefault.getCcy();
        java.lang.String str6 = C56033xvF.OLrzqt(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getEq(), "") + " " + strOLrzqt + " ";
        int pnlColor$default = C56033xvF.getPnlColor$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, 8, null);
        java.lang.String usedMargin = strategyDetailsResponseCopydefault.getUsedMargin();
        java.lang.String strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(strAEQbTJ, usedMargin == null ? "" : usedMargin, roundingMode, true, null, false, null, null, null, null, null, 2032, null);
        java.lang.String availableMargin = strategyDetailsResponseCopydefault.getAvailableMargin();
        java.lang.String strFmtBotValueBySymbol$default3 = C56033xvF.fmtBotValueBySymbol$default(strAEQbTJ, availableMargin == null ? "" : availableMargin, roundingMode, true, null, false, null, null, null, null, null, 2032, null);
        java.lang.String realizedPnl = strategyDetailsResponseCopydefault.getRealizedPnl();
        java.lang.String str7 = realizedPnl != null ? realizedPnl : "";
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status2 = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? status : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        if (bot4 != null && (common = bot4.getCommon()) != null && (autoStaking = common.getAutoStaking()) != null) {
            status = autoStaking.getStatus();
        }
        return new BenefitDetails(algoId, orderType, instId, instType, strAEQbTJ, null, null, 0, str3, strFmtBotValueBySymbol$default, null, null, percent$default, botPnl$default, str5, null, ccy, null, str6, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, false, false, pnlColor$default, null, null, strFmtBotValueBySymbol$default2, strFmtBotValueBySymbol$default3, str7, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, str2, iIntValue2, str, iIntValue, status2, status, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, null, null, -357152, 1073741367, -402653200, null);
    }
}
