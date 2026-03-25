package o;

import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okex.center.bean.RecommendationCard;
import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.enums.IntegratedSolutionPageType;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sgn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44962sgn {
    public static final C44962sgn KWHzl = new C44962sgn();

    private C44962sgn() {
    }

    public final android.content.Intent KWHzl(@NotNull android.content.Context context, TransactionDisplayModel transactionDisplayModel, TopicListItem.TopicItem topicItem, RecommendationCard recommendationCard, java.lang.String str, @NotNull IntegratedSolutionPageType integratedSolutionPageType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(integratedSolutionPageType, "");
        android.content.Intent intentOLrzqt = ((InterfaceC6804aWL) C43251rlk.copydefault(InterfaceC6804aWL.class)).OLrzqt(context);
        intentOLrzqt.putExtra("transaction_item", transactionDisplayModel);
        intentOLrzqt.putExtra("topic_item", topicItem);
        intentOLrzqt.putExtra("recommendation_card", recommendationCard);
        intentOLrzqt.putExtra("mini_support_page_id", str);
        intentOLrzqt.putExtra(EopTrackEvent.KEY_PAGE_TYPE, integratedSolutionPageType.ordinal());
        return intentOLrzqt;
    }
}
