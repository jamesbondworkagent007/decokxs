package com.okinc.find_ui.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ListType[] $VALUES;
    public static final ListType BUYXLARGE = new ListType("BUYXLARGE", 0);
    public static final ListType BUYLARGE = new ListType("BUYLARGE", 1);
    public static final ListType BUYMID = new ListType("BUYMID", 2);
    public static final ListType BUYSMALL = new ListType("BUYSMALL", 3);
    public static final ListType SELLXLARGE = new ListType("SELLXLARGE", 4);
    public static final ListType SELLLARGE = new ListType("SELLLARGE", 5);
    public static final ListType SELLMID = new ListType("SELLMID", 6);
    public static final ListType SELLSMALL = new ListType("SELLSMALL", 7);
    public static final ListType NULL = new ListType("NULL", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ListType[] $values() {
        return new ListType[]{BUYXLARGE, BUYLARGE, BUYMID, BUYSMALL, SELLXLARGE, SELLLARGE, SELLMID, SELLSMALL, NULL};
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
