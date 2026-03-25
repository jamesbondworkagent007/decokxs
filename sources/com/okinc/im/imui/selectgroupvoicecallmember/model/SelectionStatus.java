package com.okinc.im.imui.selectgroupvoicecallmember.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class SelectionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SelectionStatus[] $VALUES;
    public static final SelectionStatus SELECTED = new SelectionStatus("SELECTED", 0);
    public static final SelectionStatus UNSELECTED = new SelectionStatus("UNSELECTED", 1);
    public static final SelectionStatus COMPLETED = new SelectionStatus("COMPLETED", 2);
    public static final SelectionStatus DISABLED = new SelectionStatus("DISABLED", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SelectionStatus[] $values() {
        return new SelectionStatus[]{SELECTED, UNSELECTED, COMPLETED, DISABLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SelectionStatus> getEntries() {
        return $ENTRIES;
    }

    private SelectionStatus(String str, int i) {
    }

    static {
        SelectionStatus[] selectionStatusArr$values = $values();
        $VALUES = selectionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(selectionStatusArr$values);
    }

    public static SelectionStatus valueOf(String str) {
        return (SelectionStatus) Enum.valueOf(SelectionStatus.class, str);
    }

    public static SelectionStatus[] values() {
        return (SelectionStatus[]) $VALUES.clone();
    }
}
