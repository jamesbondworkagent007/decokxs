package com.okinc.business.market.features.watch_list_groups.ui.models;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class GroupSelectionMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupSelectionMode[] $VALUES;
    public static final GroupSelectionMode INDIVIDUAL = new GroupSelectionMode("INDIVIDUAL", 0);
    public static final GroupSelectionMode BULK = new GroupSelectionMode("BULK", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupSelectionMode[] $values() {
        return new GroupSelectionMode[]{INDIVIDUAL, BULK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupSelectionMode> getEntries() {
        return $ENTRIES;
    }

    private GroupSelectionMode(String str, int i) {
    }

    static {
        GroupSelectionMode[] groupSelectionModeArr$values = $values();
        $VALUES = groupSelectionModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupSelectionModeArr$values);
    }

    public static GroupSelectionMode valueOf(String str) {
        return (GroupSelectionMode) Enum.valueOf(GroupSelectionMode.class, str);
    }

    public static GroupSelectionMode[] values() {
        return (GroupSelectionMode[]) $VALUES.clone();
    }
}
