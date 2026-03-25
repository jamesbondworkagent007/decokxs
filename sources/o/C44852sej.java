package o;

import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.center.bean.BannerItem;
import com.okinc.okex.center.bean.ContactInfoBean;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.IntegratedSolutionPageData;
import com.okinc.okex.center.bean.IntegratedSolutionResponse;
import com.okinc.okex.center.bean.PopupAnnouncementInfoBean;
import com.okinc.okex.center.bean.PopupAnnouncements;
import com.okinc.okex.center.bean.RelatedArticleListModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionBannerDisplayModel;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sej, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44852sej {
    public static final IntegratedSolutionPageData OLrzqt(@NotNull IntegratedSolutionResponse integratedSolutionResponse) {
        TransactionDisplayModel transactionDisplayModelAEQbTJ;
        java.util.ArrayList arrayList;
        PopupAnnouncementInfoBean popupAnnouncementInfoBean;
        Intrinsics.checkNotNullParameter(integratedSolutionResponse, "");
        PopupAnnouncements popupAnnouncements = integratedSolutionResponse.getPopupAnnouncements();
        java.util.List<PopupAnnouncementInfoBean> list = popupAnnouncements != null ? popupAnnouncements.getList() : null;
        AnnouncementPopupDisplayModel announcementPopupDisplayModelOLrzqt = (list == null || list.isEmpty() || (popupAnnouncementInfoBean = (PopupAnnouncementInfoBean) CollectionsKt___CollectionsKt.firstOrNull(integratedSolutionResponse.getPopupAnnouncements().getList())) == null) ? null : C45065sik.OLrzqt(popupAnnouncementInfoBean);
        TransactionBean transactionInformation = integratedSolutionResponse.getTransactionInformation();
        if (transactionInformation != null) {
            ContextualScenarioModel contextualScenario = integratedSolutionResponse.getContextualScenario();
            java.util.List<BannerItem> banners = integratedSolutionResponse.getBanners();
            if (banners != null) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator<T> it = banners.iterator();
                while (it.hasNext()) {
                    TransactionBannerDisplayModel transactionBannerDisplayModelAEQbTJ = C45071siq.AEQbTJ((BannerItem) it.next());
                    if (transactionBannerDisplayModelAEQbTJ != null) {
                        arrayList.add(transactionBannerDisplayModelAEQbTJ);
                    }
                }
            } else {
                arrayList = null;
            }
            transactionDisplayModelAEQbTJ = C45073sis.AEQbTJ(transactionInformation, contextualScenario, arrayList);
        } else {
            transactionDisplayModelAEQbTJ = null;
        }
        ContextualScenarioModel contextualScenario2 = integratedSolutionResponse.getContextualScenario();
        SelfServiceTools selfServiceTools = integratedSolutionResponse.getSelfServiceTools();
        java.util.List<SelfServiceToolBean> list2 = selfServiceTools != null ? selfServiceTools.getList() : null;
        if (list2 == null) {
            list2 = yDY.AhwBna();
        }
        java.util.List<SelfServiceToolBean> list3 = list2;
        RelatedArticleListModel relatedArticles = integratedSolutionResponse.getRelatedArticles();
        java.util.List<SupportFaqArticle> list4 = relatedArticles != null ? relatedArticles.getList() : null;
        if (list4 == null) {
            list4 = yDY.AhwBna();
        }
        java.util.List<SupportFaqArticle> list5 = list4;
        RelatedArticleListModel relatedArticles2 = integratedSolutionResponse.getRelatedArticles();
        boolean hasMore = relatedArticles2 != null ? relatedArticles2.getHasMore() : false;
        GetSupportRatingBean rating = integratedSolutionResponse.getRating();
        RatingResult ratingResult$default = rating != null ? sxK.toRatingResult$default(sxK.copydefault, rating, null, null, null, 7, null) : null;
        ContactInfoBean contactInformation = integratedSolutionResponse.getContactInformation();
        return new IntegratedSolutionPageData(transactionDisplayModelAEQbTJ, contextualScenario2, list3, list5, hasMore, ratingResult$default, contactInformation != null ? C45067sim.AEQbTJ(contactInformation) : null, integratedSolutionResponse.getMiniSupportPage(), (java.util.List) null, announcementPopupDisplayModelOLrzqt, 256, (DefaultConstructorMarker) null);
    }
}
