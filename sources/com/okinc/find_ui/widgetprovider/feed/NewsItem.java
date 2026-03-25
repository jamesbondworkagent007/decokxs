package com.okinc.find_ui.widgetprovider.feed;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class NewsItem {
    public static final int $stable = 8;
    private final String contentId;
    private final String title;
    private final List<TokenInfo> tokens;
    private final String translatedTitle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.find_ui.widgetprovider.feed.NewsItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewsItem copy$default(NewsItem newsItem, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = newsItem.title;
        }
        if ((i & 2) != 0) {
            str2 = newsItem.translatedTitle;
        }
        if ((i & 4) != 0) {
            str3 = newsItem.contentId;
        }
        if ((i & 8) != 0) {
            list = newsItem.tokens;
        }
        return newsItem.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> component4() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NewsItem copy(@NotNull String str, String str2, @NotNull String str3, List<TokenInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NewsItem(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsItem)) {
            return false;
        }
        NewsItem newsItem = (NewsItem) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) newsItem.title) && Intrinsics.EZpvd((Object) this.translatedTitle, (Object) newsItem.translatedTitle) && Intrinsics.EZpvd((Object) this.contentId, (Object) newsItem.contentId) && Intrinsics.EZpvd(this.tokens, newsItem.tokens);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenInfo> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTranslatedTitle() {
        return this.translatedTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.title.hashCode();
        String str = this.translatedTitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.contentId.hashCode();
        List<TokenInfo> list = this.tokens;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NewsItem(title=" + this.title + ", translatedTitle=" + this.translatedTitle + ", contentId=" + this.contentId + ", tokens=" + this.tokens + ")";
    }

    public NewsItem(@NotNull String str, String str2, @NotNull String str3, List<TokenInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.translatedTitle = str2;
        this.contentId = str3;
        this.tokens = list;
    }
}
