package com.okinc.im.imui.share.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class SearchPayload {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchPayload[] $VALUES;
    public static final SearchPayload KEYWORD_OR_SELECTION = new SearchPayload("KEYWORD_OR_SELECTION", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchPayload[] $values() {
        return new SearchPayload[]{KEYWORD_OR_SELECTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchPayload> getEntries() {
        return $ENTRIES;
    }

    private SearchPayload(String str, int i) {
    }

    static {
        SearchPayload[] searchPayloadArr$values = $values();
        $VALUES = searchPayloadArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchPayloadArr$values);
    }

    public static SearchPayload valueOf(String str) {
        return (SearchPayload) Enum.valueOf(SearchPayload.class, str);
    }

    public static SearchPayload[] values() {
        return (SearchPayload[]) $VALUES.clone();
    }
}
