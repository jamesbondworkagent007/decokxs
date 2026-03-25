package com.okinc.im.imui.relationlist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class GroupType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;
    public static final GroupType PREMIUM = new GroupType("PREMIUM", 0);
    public static final GroupType STANDARD = new GroupType("STANDARD", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupType[] $values() {
        return new GroupType[]{PREMIUM, STANDARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupType> getEntries() {
        return $ENTRIES;
    }

    private GroupType(String str, int i) {
    }

    static {
        GroupType[] groupTypeArr$values = $values();
        $VALUES = groupTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupTypeArr$values);
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }
}
