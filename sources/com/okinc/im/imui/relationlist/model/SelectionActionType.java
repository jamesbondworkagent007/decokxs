package com.okinc.im.imui.relationlist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class SelectionActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SelectionActionType[] $VALUES;
    public static final SelectionActionType ADD_MEMBER_TO_GROUP = new SelectionActionType("ADD_MEMBER_TO_GROUP", 0);
    public static final SelectionActionType CREATE_GROUP = new SelectionActionType("CREATE_GROUP", 1);
    public static final SelectionActionType CREATE_PREMIUM_GROUP = new SelectionActionType("CREATE_PREMIUM_GROUP", 2);
    public static final SelectionActionType UNKNOWN = new SelectionActionType("UNKNOWN", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SelectionActionType[] $values() {
        return new SelectionActionType[]{ADD_MEMBER_TO_GROUP, CREATE_GROUP, CREATE_PREMIUM_GROUP, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SelectionActionType> getEntries() {
        return $ENTRIES;
    }

    private SelectionActionType(String str, int i) {
    }

    static {
        SelectionActionType[] selectionActionTypeArr$values = $values();
        $VALUES = selectionActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(selectionActionTypeArr$values);
    }

    public static SelectionActionType valueOf(String str) {
        return (SelectionActionType) Enum.valueOf(SelectionActionType.class, str);
    }

    public static SelectionActionType[] values() {
        return (SelectionActionType[]) $VALUES.clone();
    }
}
