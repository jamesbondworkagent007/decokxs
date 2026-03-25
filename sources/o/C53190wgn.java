package o;

import com.okinc.unify_trade.biz.bot.Portfolio;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.DistributeItem;
import com.okinc.unify_trade.bot.data.IntroItemData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.wgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53190wgn implements InterfaceC54501xKt<SmartRecommendResp, IntroItemData> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public IntroItemData KWHzl(SmartRecommendResp smartRecommendResp) {
        java.lang.String stgyName;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String followerCount;
        java.lang.String description;
        java.util.List<java.lang.String> label;
        java.util.List<java.lang.String> label2;
        java.util.List<java.lang.String> label3;
        StgyParam stgyParam;
        java.util.List<Portfolio> portfolioList;
        java.lang.String strValueOf;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (smartRecommendResp != null && (stgyParam = smartRecommendResp.getStgyParam()) != null && (portfolioList = stgyParam.getPortfolioList()) != null) {
            for (Portfolio portfolio : portfolioList) {
                java.lang.String ccy = portfolio.getCcy();
                xMR xmr = xMR.copydefault;
                java.lang.String iCUPercent$default = xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) portfolio.getRatio()), null, C38307pTy.Companion.copydefault(0), null, java.lang.Double.valueOf(100.0d), null, 42, null);
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                arrayList.add(new DistributeItem(ccy, 0, iCUPercent$default, (interfaceC54581xNrCopydefault == null || (strValueOf = interfaceC54581xNrCopydefault.valueOf(portfolio.getCcy())) == null) ? "" : strValueOf, 0, 18, (DefaultConstructorMarker) null));
            }
        }
        if (smartRecommendResp == null || (stgyName = smartRecommendResp.getStgyName()) == null) {
            stgyName = "";
        }
        if (smartRecommendResp == null || (label3 = smartRecommendResp.getLabel()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(label3)) == null) {
            str = "";
        }
        if (!C33129mqd.AEQbTJ((smartRecommendResp == null || (label2 = smartRecommendResp.getLabel()) == null) ? null : java.lang.Integer.valueOf(label2.size()), 1) || smartRecommendResp == null || (label = smartRecommendResp.getLabel()) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(label)) == null) {
            str2 = "";
        }
        xMR xmr2 = xMR.copydefault;
        if (smartRecommendResp == null || (followerCount = smartRecommendResp.getFollowerCount()) == null) {
            followerCount = "";
        }
        java.lang.String strCopydefault = xmr2.copydefault(followerCount);
        if (smartRecommendResp == null || (description = smartRecommendResp.getDescription()) == null) {
            description = "";
        }
        return new IntroItemData(stgyName, str, str2, arrayList, strCopydefault, description);
    }
}
