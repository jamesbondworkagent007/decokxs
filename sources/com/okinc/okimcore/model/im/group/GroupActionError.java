package com.okinc.okimcore.model.im.group;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class GroupActionError {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupActionError[] $VALUES;
    private final int code;
    public static final GroupActionError GROUP_DESCRIPTION_FAIL_RISK_CHECK = new GroupActionError("GROUP_DESCRIPTION_FAIL_RISK_CHECK", 0, 2021);
    public static final GroupActionError DUPLICATED_TRANSACTION_ERROR = new GroupActionError("DUPLICATED_TRANSACTION_ERROR", 1, 2022);
    public static final GroupActionError IM_GROUP_MAX_PUBLIC_GROUP_CREATED_ERROR = new GroupActionError("IM_GROUP_MAX_PUBLIC_GROUP_CREATED_ERROR", 2, 2023);
    public static final GroupActionError IM_GROUP_MAX_PUBLIC_GROUP_TRANSFER_ERROR = new GroupActionError("IM_GROUP_MAX_PUBLIC_GROUP_TRANSFER_ERROR", 3, 2024);
    public static final GroupActionError ORBIT_PROFILE_EDIT = new GroupActionError("ORBIT_PROFILE_EDIT", 4, 2039);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupActionError[] $values() {
        return new GroupActionError[]{GROUP_DESCRIPTION_FAIL_RISK_CHECK, DUPLICATED_TRANSACTION_ERROR, IM_GROUP_MAX_PUBLIC_GROUP_CREATED_ERROR, IM_GROUP_MAX_PUBLIC_GROUP_TRANSFER_ERROR, ORBIT_PROFILE_EDIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupActionError> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    private GroupActionError(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        GroupActionError[] groupActionErrorArr$values = $values();
        $VALUES = groupActionErrorArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupActionErrorArr$values);
    }

    public static GroupActionError valueOf(String str) {
        return (GroupActionError) Enum.valueOf(GroupActionError.class, str);
    }

    public static GroupActionError[] values() {
        return (GroupActionError[]) $VALUES.clone();
    }
}
