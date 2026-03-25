package com.okinc.im.imui.selectgroupvoicecallmember.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class SearchGroupCallMemberPayload {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchGroupCallMemberPayload[] $VALUES;
    public static final SearchGroupCallMemberPayload KEYWORD = new SearchGroupCallMemberPayload("KEYWORD", 0);
    public static final SearchGroupCallMemberPayload SELECTION = new SearchGroupCallMemberPayload("SELECTION", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchGroupCallMemberPayload[] $values() {
        return new SearchGroupCallMemberPayload[]{KEYWORD, SELECTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchGroupCallMemberPayload> getEntries() {
        return $ENTRIES;
    }

    private SearchGroupCallMemberPayload(String str, int i) {
    }

    static {
        SearchGroupCallMemberPayload[] searchGroupCallMemberPayloadArr$values = $values();
        $VALUES = searchGroupCallMemberPayloadArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchGroupCallMemberPayloadArr$values);
    }

    public static SearchGroupCallMemberPayload valueOf(String str) {
        return (SearchGroupCallMemberPayload) Enum.valueOf(SearchGroupCallMemberPayload.class, str);
    }

    public static SearchGroupCallMemberPayload[] values() {
        return (SearchGroupCallMemberPayload[]) $VALUES.clone();
    }
}
