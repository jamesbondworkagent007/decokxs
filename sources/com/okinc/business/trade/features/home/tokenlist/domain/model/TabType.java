package com.okinc.business.trade.features.home.tokenlist.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TabType[] $VALUES;
    public static final TabType Collection = new TabType("Collection", 0);
    public static final TabType All = new TabType("All", 1);
    public static final TabType SingleChain = new TabType("SingleChain", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TabType[] $values() {
        return new TabType[]{Collection, All, SingleChain};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TabType> getEntries() {
        return $ENTRIES;
    }

    private TabType(String str, int i) {
    }

    static {
        TabType[] tabTypeArr$values = $values();
        $VALUES = tabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tabTypeArr$values);
    }

    public static TabType valueOf(String str) {
        return (TabType) Enum.valueOf(TabType.class, str);
    }

    public static TabType[] values() {
        return (TabType[]) $VALUES.clone();
    }
}
