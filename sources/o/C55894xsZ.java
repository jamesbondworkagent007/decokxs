package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.RebateTransItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.biz.bot.AutoEarnStakingParam;
import com.okinc.unify_trade.biz.bot.BotCommon;
import com.okinc.unify_trade.bot.data.BenefitDetails;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55894xsZ implements InterfaceC54501xKt<C55804xqp<StrategyDetailsResponse>, BenefitDetails> {
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C55894xsZ() {
        this(false, 1, null);
    }

    public C55894xsZ(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:275) call: o.xsZ.<init>(boolean):void type: THIS */
    public /* synthetic */ C55894xsZ(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0148  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BenefitDetails KWHzl(@NotNull C55804xqp<StrategyDetailsResponse> c55804xqp) {
        java.lang.String investment;
        java.lang.String sourceCcy;
        java.lang.String fundingFeeDig;
        java.lang.String strKWHzl;
        kotlin.Pair pairOLrzqt;
        kotlin.Pair pairOLrzqt2;
        BotCommon common;
        AutoEarnStakingParam autoStaking;
        BotCommon common2;
        AutoEarnStakingParam autoEarn;
        BotCommon common3;
        BotCommon common4;
        java.lang.String profitSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseCopydefault = c55804xqp.copydefault();
        java.lang.String strTakeNonBlankTradeQuoteCcy = strategyDetailsResponseCopydefault.takeNonBlankTradeQuoteCcy();
        if (strTakeNonBlankTradeQuoteCcy == null) {
            strTakeNonBlankTradeQuoteCcy = C56033xvF.AhwBna(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getDisplayId());
        }
        java.lang.String str = strTakeNonBlankTradeQuoteCcy;
        java.lang.String strValueOf = C56033xvF.valueOf(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getFeeCcy());
        java.lang.String strDjBIcL = C56033xvF.djBIcL(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getFeeCcy());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strategyDetailsResponseCopydefault.getSourceCcy())) {
            investment = strategyDetailsResponseCopydefault.getSourceCcySz();
            if (investment == null) {
                investment = "";
            }
            sourceCcy = strategyDetailsResponseCopydefault.getSourceCcy();
            Intrinsics.copydefault((java.lang.Object) sourceCcy);
        } else {
            investment = strategyDetailsResponseCopydefault.getInvestment();
            sourceCcy = strDjBIcL;
        }
        java.lang.String str2 = investment;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, 12, null) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strategyDetailsResponseCopydefault.getInstType())) == null) {
            fundingFeeDig = null;
        } else {
            if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                fundingFeeDig = idxConfigAkhnZx.getFundingFeeDig();
            }
        }
        int iOLrzqt = C56033xvF.OLrzqt((java.lang.Object) strategyDetailsResponseCopydefault.getFundingFee());
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseCopydefault.getInstType(), (java.lang.Object) "SWAP")) {
            strKWHzl = C56068xvo.copydefault.KWHzl(strategyDetailsResponseCopydefault.getFundingFee(), fundingFeeDig, true, (suggestedInstrument$default == null || (profitSymbol = suggestedInstrument$default.getProfitSymbol()) == null) ? "" : profitSymbol, RoundingMode.FLOOR, true);
        } else {
            strKWHzl = "";
        }
        if (c55804xqp.copydefault().getShouldShowAutoEarn()) {
            BotVo bot = c55804xqp.copydefault().getBot();
            if (((bot == null || (common4 = bot.getCommon()) == null) ? null : common4.getAutoEarn()) != null) {
                pairOLrzqt = C55884xsP.copydefault(c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getTotalProfit(), c55804xqp.copydefault().getBot().getCommon().getAutoEarn().getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), sourceCcy, (64 & 32) != 0, (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : false);
            }
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str3 = (java.lang.String) pairOLrzqt.component1();
        int iIntValue = ((java.lang.Number) pairOLrzqt.component2()).intValue();
        BotVo bot2 = c55804xqp.copydefault().getBot();
        if (((bot2 == null || (common3 = bot2.getCommon()) == null) ? null : common3.getAutoStaking()) != null && c55804xqp.copydefault().getShouldShowAutoStake()) {
            AutoEarnStakingParam autoStaking2 = c55804xqp.copydefault().getBot().getCommon().getAutoStaking();
            pairOLrzqt2 = C55884xsP.formatAutoStake$default(autoStaking2.getTotalProfit(), autoStaking2.getStatus(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), sourceCcy, null, 32, null);
        } else {
            pairOLrzqt2 = C56390yDp.OLrzqt(null, 0);
        }
        java.lang.String str4 = (java.lang.String) pairOLrzqt2.component1();
        int iIntValue2 = ((java.lang.Number) pairOLrzqt2.component2()).intValue();
        boolean zIsHistory = strategyDetailsResponseCopydefault.isHistory();
        java.lang.String algoId = strategyDetailsResponseCopydefault.getAlgoId();
        java.lang.String orderType = strategyDetailsResponseCopydefault.getOrderType();
        java.lang.String instId = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String instType = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String botPnl$default = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getGridProfit(), null, this.OLrzqt, false, null, false, null, null, null, 2024, null);
        int pnlColor$default = C56033xvF.getPnlColor$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getGridProfit(), null, 8, null);
        java.lang.String botPnl$default2 = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getFloatProfit(), null, this.OLrzqt, false, null, false, null, null, null, 2024, null);
        RoundingMode roundingMode = RoundingMode.UP;
        java.lang.String strFmtBotValueBySymbol$default = C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, str2, roundingMode, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        xMR xmr = xMR.copydefault;
        java.lang.String totalAnnualizedRate = strategyDetailsResponseCopydefault.getTotalAnnualizedRate();
        RoundingMode roundingMode2 = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, totalAnnualizedRate, 0, roundingMode2, 2, null);
        java.lang.String botPnl$default3 = C56033xvF.getBotPnl$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, false, this.OLrzqt, null, false, null, null, null, 2008, null);
        java.lang.String pnlRatio = strategyDetailsResponseCopydefault.getPnlRatio();
        java.lang.String strFmtBotValueBySymbol$default2 = C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, strategyDetailsResponseCopydefault.getEq(), roundingMode2, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.lang.String strCopydefault = copydefault(strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getRebateTrans());
        int pnlColor$default2 = C56033xvF.getPnlColor$default(strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getTotalPnl(), null, 8, null);
        java.lang.String strFmtBotValueBySymbol$default3 = C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, strategyDetailsResponseCopydefault.getOrdFrozen(), roundingMode, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.lang.String strFmtBotValueBySymbol$default4 = C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, strategyDetailsResponseCopydefault.getAvailEq(), roundingMode2, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.lang.String strFmtBotValueBySymbol$default5 = C56033xvF.fmtBotValueBySymbol$default(sourceCcy, strategyDetailsResponseCopydefault.getNetMarginTransfer(), roundingMode, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.lang.String instType2 = strategyDetailsResponseCopydefault.getInstType();
        java.lang.String instId2 = strategyDetailsResponseCopydefault.getInstId();
        java.lang.String fee = strategyDetailsResponseCopydefault.getFee();
        java.lang.String strEZpvd = C56033xvF.EZpvd(instType2, instId2, fee == null ? "" : fee, strategyDetailsResponseCopydefault.getFeeCcy(), this.OLrzqt);
        java.lang.String str5 = sourceCcy;
        java.lang.String strFmtBotValueBySymbol$default6 = C56033xvF.fmtBotValueBySymbol$default(str5, strategyDetailsResponseCopydefault.getActualMarginSz(), roundingMode, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.lang.String strFmtBotValueBySymbol$default7 = C56033xvF.fmtBotValueBySymbol$default(str5, strategyDetailsResponseCopydefault.getExtraMarginSz(), roundingMode, this.OLrzqt, null, false, strategyDetailsResponseCopydefault.getInstType(), strategyDetailsResponseCopydefault.getInstId(), null, null, null, 1840, null);
        java.util.List<StrategyProfitResponse> profitSnapshots = strategyDetailsResponseCopydefault.getProfitSnapshots();
        StrategyProfitResponse latestProfit = strategyDetailsResponseCopydefault.getLatestProfit();
        BotVo bot3 = c55804xqp.copydefault().getBot();
        java.lang.String status = (bot3 == null || (common2 = bot3.getCommon()) == null || (autoEarn = common2.getAutoEarn()) == null) ? null : autoEarn.getStatus();
        BotVo bot4 = c55804xqp.copydefault().getBot();
        return new BenefitDetails(algoId, orderType, instId, instType, str, null, botPnl$default, pnlColor$default, botPnl$default2, strFmtBotValueBySymbol$default, strFmtBotValueBySymbol$default6, strFmtBotValueBySymbol$default7, percent$default, botPnl$default3, pnlRatio, null, strValueOf, null, strFmtBotValueBySymbol$default2, null, null, null, null, null, null, null, null, strCopydefault, null, 0, null, null, null, false, zIsHistory, pnlColor$default2, null, null, strFmtBotValueBySymbol$default3, strFmtBotValueBySymbol$default4, null, strFmtBotValueBySymbol$default5, strEZpvd, strKWHzl, iOLrzqt, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, str4, iIntValue2, str3, iIntValue, status, (bot4 == null || (common = bot4.getCommon()) == null || (autoStaking = common.getAutoStaking()) == null) ? null : autoStaking.getStatus(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, profitSnapshots, latestProfit, null, null, null, -134578144, 1073733939, -402653200, null);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, java.util.ArrayList<RebateTransItem> arrayList) {
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
            if (rebateCcy != null) {
                str3 = rebateCcy;
            }
            arrayList2.add(C56033xvF.gEmmrt(str, str2, rebate, str3) + " " + C56033xvF.valueOf(str2, str, rebateTransItem.getRebateCcy()));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList2, " + ", null, null, 0, null, null, 62, null);
    }
}
