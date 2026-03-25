package com.okinc.business.market.features.scanner.surge.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class FilterType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FilterType[] $VALUES;
    public static final FilterType MARKET_CAP = new FilterType("MARKET_CAP", 0);
    public static final FilterType VOLUME = new FilterType("VOLUME", 1);
    public static final FilterType TOKEN_AGE = new FilterType("TOKEN_AGE", 2);
    public static final FilterType KEYWORD = new FilterType("KEYWORD", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FilterType[] $values() {
        return new FilterType[]{MARKET_CAP, VOLUME, TOKEN_AGE, KEYWORD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FilterType> getEntries() {
        return $ENTRIES;
    }

    private FilterType(String str, int i) {
    }

    static {
        FilterType[] filterTypeArr$values = $values();
        $VALUES = filterTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(filterTypeArr$values);
    }

    public static FilterType valueOf(String str) {
        return (FilterType) Enum.valueOf(FilterType.class, str);
    }

    public static FilterType[] values() {
        return (FilterType[]) $VALUES.clone();
    }
}
