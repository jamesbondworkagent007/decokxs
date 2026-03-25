package o;

import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55954xtg implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, false, true, null, false, null, null, null, 2008, null);
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String algoOrdType = strategyDetailsResponseCopydefault.getAlgoOrdType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String notionalCcy = strategyDetailsResponseCopydefault.getNotionalCcy();
        java.lang.String str = notionalCcy == null ? "" : notionalCcy;
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String arbApy = strategyDetailsResponseCopydefault.getArbApy();
        java.lang.String notionalCcy2 = strategyDetailsResponseCopydefault.getNotionalCcy();
        java.lang.String str2 = notionalCcy2 == null ? "" : notionalCcy2;
        java.lang.String notionalCcy3 = strategyDetailsResponseCopydefault.getNotionalCcy();
        java.lang.String str3 = notionalCcy3 == null ? "" : notionalCcy3;
        java.lang.String notional = strategyDetailsResponseCopydefault.getNotional();
        java.lang.String str4 = notional == null ? "" : notional;
        java.lang.String arbPnl = strategyDetailsResponseCopydefault.getArbPnl();
        return new BenefitDetails(algoId, algoOrdType, instId, instType, str, null, null, 0, null, null, null, null, null, botPnl$default, pnlRatio, arbApy, str2, null, null, null, null, str4, str3, null, null, null, null, null, null, 0, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, 0, null, arbPnl == null ? "" : arbPnl, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, null, 0, null, null, null, strategyDetailsResponseCopydefault.getCoinPnl(), null, null, strategyDetailsResponseCopydefault.getCurrencyBal(), strategyDetailsResponseCopydefault.getCurrency(), strategyDetailsResponseCopydefault.getAvgCost(), strategyDetailsResponseCopydefault.getCycle(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strategyDetailsResponseCopydefault.getProfitSnapshots(), strategyDetailsResponseCopydefault.getLatestProfit(), null, null, null, -6414368, -16385, -402657057, null);
    }
}
