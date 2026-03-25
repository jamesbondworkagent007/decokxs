package com.okinc.social_trade_api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class ListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ListType[] $VALUES;
    public static final ListType Current = new ListType("Current", 0);
    public static final ListType History = new ListType("History", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ListType[] $values() {
        return new ListType[]{Current, History};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ListType> getEntries() {
        return $ENTRIES;
    }

    private ListType(String str, int i) {
    }

    static {
        ListType[] listTypeArr$values = $values();
        $VALUES = listTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(listTypeArr$values);
    }

    public static ListType valueOf(String str) {
        return (ListType) Enum.valueOf(ListType.class, str);
    }

    public static ListType[] values() {
        return (ListType[]) $VALUES.clone();
    }
}
