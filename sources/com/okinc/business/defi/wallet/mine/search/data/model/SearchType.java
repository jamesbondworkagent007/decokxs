package com.okinc.business.defi.wallet.mine.search.data.model;

import com.google.errorprone.annotations.Keep;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Keep
public final class SearchType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SearchType[] $VALUES;
    public static final SearchType TOKEN = new SearchType("TOKEN", 0);
    public static final SearchType ADDRESS = new SearchType("ADDRESS", 1);
    public static final SearchType DAPP = new SearchType("DAPP", 2);
    public static final SearchType TOKEN_ASSET = new SearchType("TOKEN_ASSET", 3);
    public static final SearchType NFT_ASSET = new SearchType("NFT_ASSET", 4);
    public static final SearchType DEFI_ASSET = new SearchType("DEFI_ASSET", 5);
    public static final SearchType WEBSITE = new SearchType("WEBSITE", 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SearchType[] $values() {
        return new SearchType[]{TOKEN, ADDRESS, DAPP, TOKEN_ASSET, NFT_ASSET, DEFI_ASSET, WEBSITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SearchType> getEntries() {
        return $ENTRIES;
    }

    private SearchType(String str, int i) {
    }

    static {
        SearchType[] searchTypeArr$values = $values();
        $VALUES = searchTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(searchTypeArr$values);
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) $VALUES.clone();
    }
}
