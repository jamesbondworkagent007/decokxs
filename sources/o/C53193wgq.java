package o;

import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.bot.Portfolio;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.wgq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53193wgq implements InterfaceC54501xKt<SmartRecommendResp, SmartPortfolioReq> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public SmartPortfolioReq KWHzl(SmartRecommendResp smartRecommendResp) {
        StgyParam stgyParam;
        StgyParam stgyParam2;
        StgyParam stgyParam3;
        StgyParam stgyParam4;
        java.util.List<Portfolio> portfolioList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (smartRecommendResp != null && (stgyParam4 = smartRecommendResp.getStgyParam()) != null && (portfolioList = stgyParam4.getPortfolioList()) != null) {
            for (Portfolio portfolio : portfolioList) {
                arrayList.add(new CoinRatioParam(portfolio.getCcy(), portfolio.getRatio(), (java.lang.String) null, (java.lang.String) null, 12, (DefaultConstructorMarker) null));
            }
        }
        return new SmartPortfolioReq(smartRecommendResp != null ? smartRecommendResp.getStgyName() : null, (java.util.List) null, arrayList, (smartRecommendResp == null || (stgyParam3 = smartRecommendResp.getStgyParam()) == null) ? null : stgyParam3.getBalType(), (smartRecommendResp == null || (stgyParam2 = smartRecommendResp.getStgyParam()) == null) ? null : stgyParam2.getInterval(), (smartRecommendResp == null || (stgyParam = smartRecommendResp.getStgyParam()) == null) ? null : stgyParam.getDeltaRatio(), (java.lang.String) null, smartRecommendResp != null ? smartRecommendResp.getRecommendId() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 16194, (DefaultConstructorMarker) null);
    }
}
