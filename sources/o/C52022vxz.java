package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.PlaceOrderCondition;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SmartArbitrageVo;
import com.okinc.unify_trade.biz.SmartPortfolioListItem;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52020vxx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52022vxz {
    public static final C52022vxz KWHzl = new C52022vxz();

    private C52022vxz() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [31=7] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final C52020vxx.Activity copydefault(@NotNull StrategyDetailsResponse strategyDetailsResponse) {
        Intrinsics.checkNotNullParameter(strategyDetailsResponse, "");
        java.lang.String algoOrdType = strategyDetailsResponse.getAlgoOrdType();
        switch (algoOrdType.hashCode()) {
            case -1831183611:
                if (algoOrdType.equals("spot_dca")) {
                    return valueOf(strategyDetailsResponse);
                }
                return null;
            case -1402017003:
                if (algoOrdType.equals("contract_dca")) {
                    return KWHzl(strategyDetailsResponse);
                }
                return null;
            case -1216369070:
                if (algoOrdType.equals("smart_portfolio")) {
                    return AhwBna(strategyDetailsResponse);
                }
                return null;
            case -557961837:
                if (algoOrdType.equals("smart_arbitrage")) {
                    return AEQbTJ(strategyDetailsResponse);
                }
                return null;
            case -512749997:
                if (algoOrdType.equals("contract_grid")) {
                    return EZpvd(strategyDetailsResponse);
                }
                return null;
            case 3181382:
                if (algoOrdType.equals("grid")) {
                    return AYXKKw(strategyDetailsResponse);
                }
                return null;
            case 1165749981:
                if (algoOrdType.equals("recurring")) {
                    return OLrzqt(strategyDetailsResponse);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C52020vxx.Activity.LoaderManager AYXKKw(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String indicator;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String str = ccy.length() > 0 ? ccy : null;
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        int iAhwBna = C33129mqd.AhwBna(strategyDetailsResponse.getRunType());
        java.lang.String sourceAlgoId = strategyDetailsResponse.getSourceAlgoId();
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next2).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            SignParamItem signParamItem = (SignParamItem) next2;
            indicator = signParamItem != null ? signParamItem.getIndicator() : null;
        }
        java.util.ArrayList<SignParamItem> signParams2 = strategyDetailsResponse.getSignParams();
        if (signParams2 != null) {
            java.util.Iterator<T> it2 = signParams2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            SignParamItem signParamItem2 = (SignParamItem) next;
            triggerPx = signParamItem2 != null ? signParamItem2.getTriggerPx() : null;
        }
        boolean reserveFunds = strategyDetailsResponse.getReserveFunds();
        java.lang.String perGridProfitRatio = strategyDetailsResponse.getPerGridProfitRatio();
        return new C52020vxx.Activity.LoaderManager(instId, instType, str, gridNum, maxPx, minPx, iAhwBna, sourceAlgoId, strategyDetailsResponse.getSourceCcy(), indicator, triggerPx, reserveFunds, null, perGridProfitRatio.length() > 0 ? perGridProfitRatio : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C52020vxx.Activity.Application EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String indicator;
        java.lang.String triggerPx;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String str = ccy.length() > 0 ? ccy : null;
        java.lang.String gridNum = strategyDetailsResponse.getGridNum();
        java.lang.String maxPx = strategyDetailsResponse.getMaxPx();
        java.lang.String minPx = strategyDetailsResponse.getMinPx();
        int iAhwBna = C33129mqd.AhwBna(strategyDetailsResponse.getRunType());
        java.lang.String lever = strategyDetailsResponse.getLever();
        java.lang.String direction = strategyDetailsResponse.getDirection();
        boolean basePos = strategyDetailsResponse.getBasePos();
        java.lang.String sourceAlgoId = strategyDetailsResponse.getSourceAlgoId();
        java.util.ArrayList<SignParamItem> signParams = strategyDetailsResponse.getSignParams();
        if (signParams != null) {
            java.util.Iterator<T> it = signParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next2).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            SignParamItem signParamItem = (SignParamItem) next2;
            indicator = signParamItem != null ? signParamItem.getIndicator() : null;
        }
        java.util.ArrayList<SignParamItem> signParams2 = strategyDetailsResponse.getSignParams();
        if (signParams2 != null) {
            java.util.Iterator<T> it2 = signParams2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((SignParamItem) next).getTriggerAction(), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            SignParamItem signParamItem2 = (SignParamItem) next;
            triggerPx = signParamItem2 != null ? signParamItem2.getTriggerPx() : null;
        }
        java.lang.String perGridProfitRatio = strategyDetailsResponse.getPerGridProfitRatio();
        return new C52020vxx.Activity.Application(instId, instType, str, gridNum, maxPx, minPx, iAhwBna, lever, direction, java.lang.Boolean.valueOf(basePos), sourceAlgoId, indicator, triggerPx, true, null, perGridProfitRatio.length() > 0 ? perGridProfitRatio : null);
    }

    public final C52020vxx.Activity.Fragment valueOf(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String str = ccy.length() > 0 ? ccy : null;
        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
        java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
        java.lang.String str2 = pxSteps.length() > 0 ? pxSteps : null;
        java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
        java.lang.String volMult = strategyDetailsResponse.getVolMult();
        java.lang.String safetyOrdRatio = strategyDetailsResponse.getSafetyOrdRatio();
        if (safetyOrdRatio == null) {
            safetyOrdRatio = "";
        }
        return new C52020vxx.Activity.Fragment(instId, instType, str, maxSafetyOrds, str2, pxStepsMult, volMult, safetyOrdRatio, strategyDetailsResponse.getReserveFunds());
    }

    public final C52020vxx.Activity.ActionBar KWHzl(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        if (ccy.length() <= 0) {
            ccy = null;
        }
        java.lang.String str = ccy;
        java.lang.String maxSafetyOrds = strategyDetailsResponse.getMaxSafetyOrds();
        java.lang.String pxSteps = strategyDetailsResponse.getPxSteps();
        java.lang.String pxStepsMult = strategyDetailsResponse.getPxStepsMult();
        java.lang.String volMult = strategyDetailsResponse.getVolMult();
        java.lang.String safetyOrdRatio = strategyDetailsResponse.getSafetyOrdRatio();
        if (safetyOrdRatio == null) {
            safetyOrdRatio = "";
        }
        return new C52020vxx.Activity.ActionBar(instId, instType, str, maxSafetyOrds, pxSteps, pxStepsMult, volMult, safetyOrdRatio, strategyDetailsResponse.getDirection(), strategyDetailsResponse.getLever(), strategyDetailsResponse.getReserveFunds());
    }

    public final C52020vxx.Activity.StateListAnimator OLrzqt(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        if (ccy.length() <= 0) {
            ccy = null;
        }
        java.lang.String str = ccy;
        java.lang.String investCcy = strategyDetailsResponse.getInvestCcy();
        java.util.ArrayList<RecurringListItem> recurringList = strategyDetailsResponse.getRecurringList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(recurringList, 10));
        for (RecurringListItem recurringListItem : recurringList) {
            arrayList.add(new CoinRatioParam(recurringListItem.getCcy(), recurringListItem.getRatio(), recurringListItem.getMinPrice(), recurringListItem.getMaxPrice()));
        }
        return new C52020vxx.Activity.StateListAnimator(instId, instType, str, investCcy, arrayList);
    }

    public final C52020vxx.Activity.TaskDescription AhwBna(StrategyDetailsResponse strategyDetailsResponse) {
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        if (ccy.length() <= 0) {
            ccy = null;
        }
        java.util.ArrayList<SmartPortfolioListItem> portfolioList = strategyDetailsResponse.getPortfolioList();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(portfolioList, 10));
        for (SmartPortfolioListItem smartPortfolioListItem : portfolioList) {
            arrayList.add(new CoinRatioParam(smartPortfolioListItem.getCcy(), smartPortfolioListItem.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
        }
        return new C52020vxx.Activity.TaskDescription(instId, instType, ccy, arrayList);
    }

    public final C52020vxx.Activity.C0987Activity AEQbTJ(StrategyDetailsResponse strategyDetailsResponse) {
        SmartArbitrageVo smartArbitrage;
        PlaceOrderCondition openCondition;
        java.lang.String instId = strategyDetailsResponse.getInstId();
        java.lang.String instType = strategyDetailsResponse.getInstType();
        java.lang.String ccy = strategyDetailsResponse.getCcy();
        java.lang.String str = ccy.length() > 0 ? ccy : null;
        java.lang.String uly = strategyDetailsResponse.getUly();
        java.lang.Float leveragePrincipal = strategyDetailsResponse.getLeveragePrincipal();
        BotVo bot = strategyDetailsResponse.getBot();
        java.lang.String spreadRatio = (bot == null || (smartArbitrage = bot.getSmartArbitrage()) == null || (openCondition = smartArbitrage.getOpenCondition()) == null) ? null : openCondition.getSpreadRatio();
        java.util.List<SubArbitrageType4Remote> subArbTypes = strategyDetailsResponse.getSubArbTypes();
        return new C52020vxx.Activity.C0987Activity(instId, instType, str, uly, "simpleFundingFee", leveragePrincipal, null, "10000", spreadRatio, subArbTypes != null ? (SubArbitrageType4Remote) CollectionsKt___CollectionsKt.firstOrNull(subArbTypes) : null, null);
    }
}
