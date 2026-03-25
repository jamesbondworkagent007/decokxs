package com.okinc.im.widgets;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class GroupInviteType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupInviteType[] $VALUES;
    public static final GroupInviteType GROUP_INVITE_RECEIVE = new GroupInviteType("GROUP_INVITE_RECEIVE", 0);
    public static final GroupInviteType GROUP_INVITE_SEND = new GroupInviteType("GROUP_INVITE_SEND", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupInviteType[] $values() {
        return new GroupInviteType[]{GROUP_INVITE_RECEIVE, GROUP_INVITE_SEND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupInviteType> getEntries() {
        return $ENTRIES;
    }

    private GroupInviteType(String str, int i) {
    }

    static {
        GroupInviteType[] groupInviteTypeArr$values = $values();
        $VALUES = groupInviteTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupInviteTypeArr$values);
    }

    public static GroupInviteType valueOf(String str) {
        return (GroupInviteType) Enum.valueOf(GroupInviteType.class, str);
    }

    public static GroupInviteType[] values() {
        return (GroupInviteType[]) $VALUES.clone();
    }
}
