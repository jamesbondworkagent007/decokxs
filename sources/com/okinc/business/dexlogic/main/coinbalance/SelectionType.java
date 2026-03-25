package com.okinc.business.dexlogic.main.coinbalance;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SelectionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SelectionType[] $VALUES;
    public static final SelectionType FROM = new SelectionType("FROM", 0);
    public static final SelectionType TO = new SelectionType("TO", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SelectionType[] $values() {
        return new SelectionType[]{FROM, TO};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SelectionType> getEntries() {
        return $ENTRIES;
    }

    private SelectionType(String str, int i) {
    }

    static {
        SelectionType[] selectionTypeArr$values = $values();
        $VALUES = selectionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(selectionTypeArr$values);
    }

    public static SelectionType valueOf(String str) {
        return (SelectionType) Enum.valueOf(SelectionType.class, str);
    }

    public static SelectionType[] values() {
        return (SelectionType[]) $VALUES.clone();
    }
}
