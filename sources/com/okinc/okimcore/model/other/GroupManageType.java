package com.okinc.okimcore.model.other;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class GroupManageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupManageType[] $VALUES;
    public static final GroupManageType Mute = new GroupManageType("Mute", 0);
    public static final GroupManageType AllowMentionOthers = new GroupManageType("AllowMentionOthers", 1);
    public static final GroupManageType RequireAdminApprovalToJoin = new GroupManageType("RequireAdminApprovalToJoin", 2);
    public static final GroupManageType AllowGroupPrivateChat = new GroupManageType("AllowGroupPrivateChat", 3);
    public static final GroupManageType ModifyInvitePermissionSettingsType = new GroupManageType("ModifyInvitePermissionSettingsType", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupManageType[] $values() {
        return new GroupManageType[]{Mute, AllowMentionOthers, RequireAdminApprovalToJoin, AllowGroupPrivateChat, ModifyInvitePermissionSettingsType};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupManageType> getEntries() {
        return $ENTRIES;
    }

    private GroupManageType(String str, int i) {
    }

    static {
        GroupManageType[] groupManageTypeArr$values = $values();
        $VALUES = groupManageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupManageTypeArr$values);
    }

    public static GroupManageType valueOf(String str) {
        return (GroupManageType) Enum.valueOf(GroupManageType.class, str);
    }

    public static GroupManageType[] values() {
        return (GroupManageType[]) $VALUES.clone();
    }
}
