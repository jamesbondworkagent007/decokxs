package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import com.okinc.unify_trade.biz.SmartArbListItem;
import com.okinc.unify_trade.biz.SmartArbPlanLeg;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xtz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55973xtz implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        SmartArbPlanLeg smartArbPlanLeg;
        java.lang.String instFamily;
        ProfitDetailResponse quote;
        java.lang.String displayQuoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.util.ArrayList<SmartArbPlanLeg> planLeg;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.util.ArrayList<SmartArbListItem> arbList = strategyDetailsResponseCopydefault.getArbList();
        SmartArbListItem smartArbListItem = arbList != null ? (SmartArbListItem) CollectionsKt___CollectionsKt.firstOrNull(arbList) : null;
        java.lang.String instType = "SWAP";
        if (smartArbListItem == null || (planLeg = smartArbListItem.getPlanLeg()) == null) {
            smartArbPlanLeg = null;
        } else {
            java.util.Iterator<T> it = planLeg.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SmartArbPlanLeg) next).getInstType(), (java.lang.Object) "SWAP")) {
                    break;
                }
            }
            smartArbPlanLeg = (SmartArbPlanLeg) next;
        }
        if (smartArbListItem == null || (instFamily = smartArbListItem.getInstFamily()) == null) {
            instFamily = "";
        }
        java.lang.String instType2 = smartArbPlanLeg != null ? smartArbPlanLeg.getInstType() : null;
        if (instType2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) instType2) && (smartArbPlanLeg == null || (instType = smartArbPlanLeg.getInstType()) == null)) {
            instType = "";
        }
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument bizInstrumentDbNXlk = (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(instType)) == null) ? null : abstractC54531xLwOLrzqt.DbNXlk(instFamily);
        java.lang.String smartArbProfit$default = C56051xvX.getSmartArbProfit$default(C56051xvX.AEQbTJ, strategyDetailsResponseCopydefault.getTotalPnl(), bizInstrumentDbNXlk, false, false, 12, null);
        java.lang.String str = (bizInstrumentDbNXlk == null || (displayQuoteSymbol = bizInstrumentDbNXlk.getDisplayQuoteSymbol()) == null) ? "" : displayQuoteSymbol;
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String algoOrdType = strategyDetailsResponseCopydefault.getAlgoOrdType();
        java.lang.String instType3 = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String spreadPnl = strategyDetailsResponseCopydefault.getSpreadPnl();
        ProfitDetailResponse arbitrageProfit = strategyDetailsResponseCopydefault.getArbitrageProfit();
        java.lang.String total = arbitrageProfit != null ? arbitrageProfit.getTotal() : null;
        java.lang.String totalAmt = strategyDetailsResponseCopydefault.getTotalAmt();
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String totalCycleProfit = strategyDetailsResponseCopydefault.getTotalCycleProfit();
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) strategyDetailsResponseCopydefault.getTotalPnl());
        java.util.ArrayList<SmartArbListItem> arbList2 = strategyDetailsResponseCopydefault.getArbList();
        ProfitDetailResponse arbitrageProfit2 = strategyDetailsResponseCopydefault.getArbitrageProfit();
        java.lang.String apy = arbitrageProfit2 != null ? arbitrageProfit2.getApy() : null;
        java.lang.String str2 = apy == null ? "" : apy;
        java.lang.String maturedApy = strategyDetailsResponseCopydefault.getMaturedApy();
        java.lang.String instFamily2 = strategyDetailsResponseCopydefault.getInstFamily();
        ProfitDetailResponse stakingProfit = strategyDetailsResponseCopydefault.getStakingProfit();
        java.lang.String total2 = stakingProfit != null ? stakingProfit.getTotal() : null;
        ProfitDetailResponse stakingProfit2 = strategyDetailsResponseCopydefault.getStakingProfit();
        java.lang.String total3 = (stakingProfit2 == null || (quote = stakingProfit2.getQuote()) == null) ? null : quote.getTotal();
        ProfitDetailResponse stakingProfit3 = strategyDetailsResponseCopydefault.getStakingProfit();
        java.lang.String ccy = stakingProfit3 != null ? stakingProfit3.getCcy() : null;
        java.lang.String str3 = ccy == null ? "" : ccy;
        ProfitDetailResponse stakingProfit4 = strategyDetailsResponseCopydefault.getStakingProfit();
        java.lang.String apy2 = stakingProfit4 != null ? stakingProfit4.getApy() : null;
        java.util.List<SubArbitrageType4Remote> subArbTypes = strategyDetailsResponseCopydefault.getSubArbTypes();
        java.lang.String totalInterestAmt = strategyDetailsResponseCopydefault.getTotalInterestAmt();
        java.lang.String debtCcy = strategyDetailsResponseCopydefault.getDebtCcy();
        java.lang.String totalSpreadProfit = strategyDetailsResponseCopydefault.getTotalSpreadProfit();
        java.lang.String fee = strategyDetailsResponseCopydefault.getFee();
        return new BenefitDetails(algoId, algoOrdType, null, instType3, str, null, null, 0, null, null, null, null, null, smartArbProfit$default, pnlRatio, str2, str, null, null, null, null, null, null, null, null, null, null, null, totalCycleProfit, 0, null, null, null, false, strategyDetailsResponseCopydefault.isHistory(), iOLrzqt, null, null, null, null, null, null, fee == null ? "" : fee, null, 0, spreadPnl, total, totalAmt, arbList2, instFamily2, maturedApy, null, totalInterestAmt, debtCcy, total2, apy2, total3, str3, subArbTypes, null, 0, 0, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, totalSpreadProfit, strategyDetailsResponseCopydefault.getTotalApy(), strategyDetailsResponseCopydefault.getProfitSnapshots(), strategyDetailsResponseCopydefault.getLatestProfit(), null, null, null, -268558364, -133686285, -503316481, null);
    }
}
