package com.okinc.planet.biz_home.feed_tab;

import androidx.annotation.StringRes;
import o.C47501trL;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class FeedPage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeedPage[] $VALUES;
    private final String contentDescriptionId;
    private final int titleResId;
    public static final FeedPage FOR_YOU = new FeedPage("FOR_YOU", 0, C47501trL.Fragment.getStatusCode, "DiscoverFeedsTab");
    public static final FeedPage FOLLOWING = new FeedPage("FOLLOWING", 1, C47501trL.Fragment.XW, "DiscoverFollowingTab");
    public static final FeedPage NEWS = new FeedPage("NEWS", 2, C47501trL.Fragment.DcMfJKdMCrTj, "DiscoverNewsTab");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeedPage[] $values() {
        return new FeedPage[]{FOR_YOU, FOLLOWING, NEWS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeedPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContentDescriptionId() {
        return this.contentDescriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    private FeedPage(@StringRes String str, int i, int i2, String str2) {
        this.titleResId = i2;
        this.contentDescriptionId = str2;
    }

    static {
        FeedPage[] feedPageArr$values = $values();
        $VALUES = feedPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(feedPageArr$values);
    }

    public static FeedPage valueOf(String str) {
        return (FeedPage) Enum.valueOf(FeedPage.class, str);
    }

    public static FeedPage[] values() {
        return (FeedPage[]) $VALUES.clone();
    }
}
