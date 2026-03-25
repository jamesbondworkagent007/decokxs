package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55964xtq implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.takeNonBlankTradeQuoteCcy();
        if (strTakeNonBlankTradeQuoteCcy == null) {
            strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.getInvestCcy();
        }
        java.lang.String str2 = strTakeNonBlankTradeQuoteCcy;
        java.lang.String investCcy = strategyDetailsResponseCopydefault.getInvestCcy();
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default("", strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), strategyDetailsResponseCopydefault.getInvestCcy(), false, false, null, false, null, null, null, 2032, null);
        if (Intrinsics.EZpvd((java.lang.Object) botPnl$default, (java.lang.Object) "--")) {
            str = "--";
        } else {
            str = botPnl$default + " " + str2;
        }
        return new BenefitDetails(strategyDetailsResponseCopydefault.getAlgoId(), strategyDetailsResponseCopydefault.getAlgoOrdType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), str2, C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getGridProfit(), null, false, false, null, false, null, null, null, 2040, null) + " " + str2 + " ", C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getFloatProfit(), null, false, false, null, false, null, null, null, 2040, null) + " " + str2 + " ", 0, C56033xvF.getBotPrice$default(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInvestment(), false, false, null, null, 120, null) + " " + str2 + " ", null, null, null, xMR.formatPercent$default(xMR.copydefault, strategyDetailsResponseCopydefault.getTotalAnnualizedRate(), 2, 0, null, 8, null), str, strategyDetailsResponseCopydefault.getPnlRatio(), null, strategyDetailsResponseCopydefault.getCcy(), strategyDetailsResponseCopydefault.getMktCap(), C56033xvF.OLrzqt(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getEq(), "") + " " + investCcy + " ", strategyDetailsResponseCopydefault.getInvestCcy(), strategyDetailsResponseCopydefault.getInvestAmt(), null, null, null, null, null, null, null, null, 0, null, null, null, false, false, C56033xvF.djBIcL("", strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), strategyDetailsResponseCopydefault.getInvestCcy()), null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strategyDetailsResponseCopydefault.getProfitSnapshots(), strategyDetailsResponseCopydefault.getLatestProfit(), null, null, null, -2060672, -9, -402653185, null);
    }
}
