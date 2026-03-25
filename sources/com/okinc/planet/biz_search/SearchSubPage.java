package com.okinc.planet.biz_search;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class SearchSubPage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchSubPage[] $VALUES;
    public static final SearchSubPage ORBITER = new SearchSubPage("ORBITER", 0);
    public static final SearchSubPage FEED = new SearchSubPage("FEED", 1);
    public static final SearchSubPage GROUPS = new SearchSubPage("GROUPS", 2);
    public static final SearchSubPage CONTACTS = new SearchSubPage("CONTACTS", 3);
    public static final SearchSubPage MESSAGES = new SearchSubPage("MESSAGES", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchSubPage[] $values() {
        return new SearchSubPage[]{ORBITER, FEED, GROUPS, CONTACTS, MESSAGES};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchSubPage> getEntries() {
        return $ENTRIES;
    }

    private SearchSubPage(String str, int i) {
    }

    static {
        SearchSubPage[] searchSubPageArr$values = $values();
        $VALUES = searchSubPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchSubPageArr$values);
    }

    public static SearchSubPage valueOf(String str) {
        return (SearchSubPage) Enum.valueOf(SearchSubPage.class, str);
    }

    public static SearchSubPage[] values() {
        return (SearchSubPage[]) $VALUES.clone();
    }
}
