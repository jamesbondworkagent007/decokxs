package o;

import com.okinc.unify_trade.biz.bot.Portfolio;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.DistributeItem;
import com.okinc.unify_trade.bot.data.RecommendCardData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53194wgr implements InterfaceC54501xKt<java.util.List<? extends SmartRecommendResp>, java.util.List<? extends RecommendCardData>> {
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<RecommendCardData> KWHzl(@NotNull java.util.List<SmartRecommendResp> list) {
        java.util.List<java.lang.String> label;
        java.lang.String str;
        java.lang.String str2;
        java.util.List<Portfolio> portfolioList;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SmartRecommendResp smartRecommendResp : list) {
            int riseUpColor$default = C33129mqd.copydefault(smartRecommendResp.getPnlRatio(), "0") ? C56071xvr.getRiseUpColor$default(C56071xvr.gEmmrt, 0.0f, 1, null) : C56071xvr.getFallDownColor$default(C56071xvr.gEmmrt, 0.0f, 1, null);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            StgyParam stgyParam = smartRecommendResp.getStgyParam();
            if (stgyParam != null && (portfolioList = stgyParam.getPortfolioList()) != null) {
                for (Portfolio portfolio : portfolioList) {
                    arrayList2.add(new DistributeItem(portfolio.getCcy(), C33129mqd.AhwBna(C33129mqd.mulS$default(portfolio.getRatio(), 100, null, null, null, 14, null)), (java.lang.String) null, (java.lang.String) null, 0, 28, (DefaultConstructorMarker) null));
                }
            }
            java.lang.String stgyName = smartRecommendResp.getStgyName();
            java.lang.String str3 = stgyName == null ? "" : stgyName;
            java.lang.String tag = smartRecommendResp.getTag();
            java.lang.String str4 = tag == null ? "" : tag;
            java.util.List<java.lang.String> label2 = smartRecommendResp.getLabel();
            java.lang.String str5 = (label2 == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(label2)) == null) ? "" : str2;
            java.util.List<java.lang.String> label3 = smartRecommendResp.getLabel();
            java.lang.String str6 = (!C33129mqd.AEQbTJ(label3 != null ? java.lang.Integer.valueOf(label3.size()) : null, 1) || (label = smartRecommendResp.getLabel()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(label)) == null) ? "" : str;
            java.lang.String pnlRatio = smartRecommendResp.getPnlRatio();
            if (pnlRatio == null) {
                pnlRatio = "";
            }
            java.lang.String strFmtBotPnlPercent$default = C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null);
            java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(riseUpColor$default));
            xMR xmr = xMR.copydefault;
            java.lang.String followerCount = smartRecommendResp.getFollowerCount();
            if (followerCount == null) {
                followerCount = "";
            }
            java.lang.String strCopydefault = xmr.copydefault(followerCount);
            java.lang.String description = smartRecommendResp.getDescription();
            java.lang.String str7 = description == null ? "" : description;
            java.lang.String summary = smartRecommendResp.getSummary();
            arrayList.add(new RecommendCardData(str3, str4, str5, str6, strFmtBotPnlPercent$default, strGEmmrt, arrayList2, strCopydefault, str7, summary == null ? "" : summary));
        }
        return arrayList;
    }
}
