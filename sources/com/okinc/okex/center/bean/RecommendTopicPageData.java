package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.rating.net.RatingResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class RecommendTopicPageData {
    public static final int $stable = 8;
    private final RatingResult ratingResult;
    private final List<TopicListItem.TopicItem> topicList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.RecommendTopicPageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendTopicPageData copy$default(RecommendTopicPageData recommendTopicPageData, List list, RatingResult ratingResult, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendTopicPageData.topicList;
        }
        if ((i & 2) != 0) {
            ratingResult = recommendTopicPageData.ratingResult;
        }
        return recommendTopicPageData.copy(list, ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicListItem.TopicItem> component1() {
        return this.topicList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult component2() {
        return this.ratingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendTopicPageData copy(@NotNull List<TopicListItem.TopicItem> list, RatingResult ratingResult) {
        Intrinsics.checkNotNullParameter(list, "");
        return new RecommendTopicPageData(list, ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendTopicPageData)) {
            return false;
        }
        RecommendTopicPageData recommendTopicPageData = (RecommendTopicPageData) obj;
        return Intrinsics.EZpvd(this.topicList, recommendTopicPageData.topicList) && Intrinsics.EZpvd(this.ratingResult, recommendTopicPageData.ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult getRatingResult() {
        return this.ratingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicListItem.TopicItem> getTopicList() {
        return this.topicList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topicList.hashCode();
        RatingResult ratingResult = this.ratingResult;
        return (iHashCode * 31) + (ratingResult == null ? 0 : ratingResult.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendTopicPageData(topicList=" + this.topicList + ", ratingResult=" + this.ratingResult + ")";
    }

    public RecommendTopicPageData(@NotNull List<TopicListItem.TopicItem> list, RatingResult ratingResult) {
        Intrinsics.checkNotNullParameter(list, "");
        this.topicList = list;
        this.ratingResult = ratingResult;
    }
}
