package com.okinc.find_ui.widgetprovider.feed;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class NewsResponse {
    public static final int $stable = 8;
    private final List<NewsItem> contentDataList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.find_ui.widgetprovider.feed.NewsResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsResponse copy$default(NewsResponse newsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = newsResponse.contentDataList;
        }
        return newsResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewsItem> component1() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsResponse copy(@NotNull List<NewsItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new NewsResponse(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsResponse) && Intrinsics.EZpvd(this.contentDataList, ((NewsResponse) obj).contentDataList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NewsItem> getContentDataList() {
        return this.contentDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.contentDataList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsResponse(contentDataList=" + this.contentDataList + ")";
    }

    public NewsResponse(@NotNull List<NewsItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.contentDataList = list;
    }
}
