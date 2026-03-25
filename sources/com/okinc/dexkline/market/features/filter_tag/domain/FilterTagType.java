package com.okinc.dexkline.market.features.filter_tag.domain;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FilterTagType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FilterTagType[] $VALUES;
    public static final FilterTagType HOLDER = new FilterTagType("HOLDER", 0);
    public static final FilterTagType TRADER = new FilterTagType("TRADER", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FilterTagType[] $values() {
        return new FilterTagType[]{HOLDER, TRADER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FilterTagType> getEntries() {
        return $ENTRIES;
    }

    private FilterTagType(String str, int i) {
    }

    static {
        FilterTagType[] filterTagTypeArr$values = $values();
        $VALUES = filterTagTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(filterTagTypeArr$values);
    }

    public static FilterTagType valueOf(String str) {
        return (FilterTagType) Enum.valueOf(FilterTagType.class, str);
    }

    public static FilterTagType[] values() {
        return (FilterTagType[]) $VALUES.clone();
    }
}
