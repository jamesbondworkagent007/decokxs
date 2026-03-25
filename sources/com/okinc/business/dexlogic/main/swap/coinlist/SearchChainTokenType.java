package com.okinc.business.dexlogic.main.swap.coinlist;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SearchChainTokenType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchChainTokenType[] $VALUES;
    public static final SearchChainTokenType THIRD_PART = new SearchChainTokenType("THIRD_PART", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchChainTokenType[] $values() {
        return new SearchChainTokenType[]{THIRD_PART};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchChainTokenType> getEntries() {
        return $ENTRIES;
    }

    private SearchChainTokenType(String str, int i) {
    }

    static {
        SearchChainTokenType[] searchChainTokenTypeArr$values = $values();
        $VALUES = searchChainTokenTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchChainTokenTypeArr$values);
    }

    public static SearchChainTokenType valueOf(String str) {
        return (SearchChainTokenType) Enum.valueOf(SearchChainTokenType.class, str);
    }

    public static SearchChainTokenType[] values() {
        return (SearchChainTokenType[]) $VALUES.clone();
    }
}
