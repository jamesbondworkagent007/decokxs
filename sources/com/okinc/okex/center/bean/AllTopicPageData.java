package com.okinc.okex.center.bean;

import com.okinc.okex.rating.net.RatingResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class AllTopicPageData {
    public static final int $stable = 8;
    private final RatingResult ratingResult;
    private final List<TopicListItem> topicSections;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okex.center.bean.AllTopicPageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AllTopicPageData copy$default(AllTopicPageData allTopicPageData, List list, RatingResult ratingResult, int i, Object obj) {
        if ((i & 1) != 0) {
            list = allTopicPageData.topicSections;
        }
        if ((i & 2) != 0) {
            ratingResult = allTopicPageData.ratingResult;
        }
        return allTopicPageData.copy(list, ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicListItem> component1() {
        return this.topicSections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult component2() {
        return this.ratingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllTopicPageData copy(@NotNull List<? extends TopicListItem> list, RatingResult ratingResult) {
        Intrinsics.checkNotNullParameter(list, "");
        return new AllTopicPageData(list, ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllTopicPageData)) {
            return false;
        }
        AllTopicPageData allTopicPageData = (AllTopicPageData) obj;
        return Intrinsics.EZpvd(this.topicSections, allTopicPageData.topicSections) && Intrinsics.EZpvd(this.ratingResult, allTopicPageData.ratingResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RatingResult getRatingResult() {
        return this.ratingResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicListItem> getTopicSections() {
        return this.topicSections;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topicSections.hashCode();
        RatingResult ratingResult = this.ratingResult;
        return (iHashCode * 31) + (ratingResult == null ? 0 : ratingResult.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AllTopicPageData(topicSections=" + this.topicSections + ", ratingResult=" + this.ratingResult + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.okex.center.bean.TopicListItem> */
    /* JADX WARN: Multi-variable type inference failed */
    public AllTopicPageData(@NotNull List<? extends TopicListItem> list, RatingResult ratingResult) {
        Intrinsics.checkNotNullParameter(list, "");
        this.topicSections = list;
        this.ratingResult = ratingResult;
    }
}
