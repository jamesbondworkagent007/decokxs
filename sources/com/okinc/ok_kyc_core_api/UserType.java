package com.okinc.ok_kyc_core_api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class UserType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    public static final UserType ALL = new UserType("ALL", 0);
    public static final UserType RETAIL_USER = new UserType("RETAIL_USER", 1);
    public static final UserType INSTITUTIONAL = new UserType("INSTITUTIONAL", 2);
    public static final UserType NONE = new UserType("NONE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserType[] $values() {
        return new UserType[]{ALL, RETAIL_USER, INSTITUTIONAL, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserType> getEntries() {
        return $ENTRIES;
    }

    private UserType(String str, int i) {
    }

    static {
        UserType[] userTypeArr$values = $values();
        $VALUES = userTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userTypeArr$values);
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }
}
