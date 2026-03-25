package com.okinc.unify_trade.bot.list;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SortOrder {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortOrder[] $VALUES;
    public static final SortOrder ASCENDING = new SortOrder("ASCENDING", 0, "asc");
    public static final SortOrder DESCENDING = new SortOrder("DESCENDING", 1, "desc");
    private final String apiValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortOrder[] $values() {
        return new SortOrder[]{ASCENDING, DESCENDING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortOrder> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApiValue() {
        return this.apiValue;
    }

    static {
        SortOrder[] sortOrderArr$values = $values();
        $VALUES = sortOrderArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortOrderArr$values);
    }

    private SortOrder(String str, int i, String str2) {
        this.apiValue = str2;
    }

    public static SortOrder valueOf(String str) {
        return (SortOrder) Enum.valueOf(SortOrder.class, str);
    }

    public static SortOrder[] values() {
        return (SortOrder[]) $VALUES.clone();
    }
}
