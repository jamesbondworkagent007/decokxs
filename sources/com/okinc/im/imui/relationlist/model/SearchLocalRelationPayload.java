package com.okinc.im.imui.relationlist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class SearchLocalRelationPayload {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchLocalRelationPayload[] $VALUES;
    public static final SearchLocalRelationPayload KEYWORD = new SearchLocalRelationPayload("KEYWORD", 0);
    public static final SearchLocalRelationPayload OTHER_LOCAL_RELATION_COUNT = new SearchLocalRelationPayload("OTHER_LOCAL_RELATION_COUNT", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchLocalRelationPayload[] $values() {
        return new SearchLocalRelationPayload[]{KEYWORD, OTHER_LOCAL_RELATION_COUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchLocalRelationPayload> getEntries() {
        return $ENTRIES;
    }

    private SearchLocalRelationPayload(String str, int i) {
    }

    static {
        SearchLocalRelationPayload[] searchLocalRelationPayloadArr$values = $values();
        $VALUES = searchLocalRelationPayloadArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchLocalRelationPayloadArr$values);
    }

    public static SearchLocalRelationPayload valueOf(String str) {
        return (SearchLocalRelationPayload) Enum.valueOf(SearchLocalRelationPayload.class, str);
    }

    public static SearchLocalRelationPayload[] values() {
        return (SearchLocalRelationPayload[]) $VALUES.clone();
    }
}
