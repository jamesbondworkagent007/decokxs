package com.okinc.im.imui.relationlist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class SearchFriendPayload {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchFriendPayload[] $VALUES;
    public static final SearchFriendPayload KEYWORD = new SearchFriendPayload("KEYWORD", 0);
    public static final SearchFriendPayload SELECTION = new SearchFriendPayload("SELECTION", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchFriendPayload[] $values() {
        return new SearchFriendPayload[]{KEYWORD, SELECTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchFriendPayload> getEntries() {
        return $ENTRIES;
    }

    private SearchFriendPayload(String str, int i) {
    }

    static {
        SearchFriendPayload[] searchFriendPayloadArr$values = $values();
        $VALUES = searchFriendPayloadArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchFriendPayloadArr$values);
    }

    public static SearchFriendPayload valueOf(String str) {
        return (SearchFriendPayload) Enum.valueOf(SearchFriendPayload.class, str);
    }

    public static SearchFriendPayload[] values() {
        return (SearchFriendPayload[]) $VALUES.clone();
    }
}
