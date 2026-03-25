package o;

import com.okinc.okex.article.bean.SupportFaqArticle;
import com.okinc.okex.center.bean.ContactInfoBean;
import com.okinc.okex.center.bean.ContextualScenarioModel;
import com.okinc.okex.center.bean.RelatedArticleListModel;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.TransactionBean;
import com.okinc.okex.center.bean.TroubleshootResultPageData;
import com.okinc.okex.center.bean.TxnContextualModel;
import com.okinc.okex.center.bean.enums.ContextualScenario;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44858sep {
    public static final TroubleshootResultPageData EZpvd(@NotNull TxnContextualModel txnContextualModel) {
        Intrinsics.checkNotNullParameter(txnContextualModel, "");
        TransactionBean transactionInformation = txnContextualModel.getTransactionInformation();
        TransactionDisplayModel transactionDisplayModel$default = transactionInformation != null ? C45073sis.toTransactionDisplayModel$default(transactionInformation, null, null, 3, null) : null;
        ContextualScenario scenarioKey = txnContextualModel.getScenarioKey();
        ContextualScenarioModel contextualScenario = txnContextualModel.getContextualScenario();
        SelfServiceTools selfServiceTools = txnContextualModel.getSelfServiceTools();
        java.util.List<SelfServiceToolBean> list = selfServiceTools != null ? selfServiceTools.getList() : null;
        if (list == null) {
            list = yDY.AhwBna();
        }
        java.util.List<SelfServiceToolBean> list2 = list;
        RelatedArticleListModel relatedArticles = txnContextualModel.getRelatedArticles();
        java.util.List<SupportFaqArticle> list3 = relatedArticles != null ? relatedArticles.getList() : null;
        if (list3 == null) {
            list3 = yDY.AhwBna();
        }
        java.util.List<SupportFaqArticle> list4 = list3;
        RelatedArticleListModel relatedArticles2 = txnContextualModel.getRelatedArticles();
        boolean hasMore = relatedArticles2 != null ? relatedArticles2.getHasMore() : false;
        GetSupportRatingBean rating = txnContextualModel.getRating();
        RatingResult ratingResult$default = rating != null ? sxK.toRatingResult$default(sxK.copydefault, rating, null, null, null, 7, null) : null;
        ContactInfoBean contactInformation = txnContextualModel.getContactInformation();
        return new TroubleshootResultPageData(transactionDisplayModel$default, scenarioKey, contextualScenario, list2, list4, hasMore, ratingResult$default, contactInformation != null ? C45067sim.AEQbTJ(contactInformation) : null);
    }
}
