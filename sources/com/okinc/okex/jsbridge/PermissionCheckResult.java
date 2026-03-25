package com.okinc.okex.jsbridge;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PermissionCheckResult {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PermissionCheckResult[] $VALUES;
    private final String value;
    public static final PermissionCheckResult AUTHORISED = new PermissionCheckResult("AUTHORISED", 0, "authorized");
    public static final PermissionCheckResult DENIED = new PermissionCheckResult("DENIED", 1, "denied");
    public static final PermissionCheckResult SOFT_DENY = new PermissionCheckResult("SOFT_DENY", 2, "soft_deny");
    public static final PermissionCheckResult NOT_AVAILABLE = new PermissionCheckResult("NOT_AVAILABLE", 3, "not_available");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PermissionCheckResult[] $values() {
        return new PermissionCheckResult[]{AUTHORISED, DENIED, SOFT_DENY, NOT_AVAILABLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PermissionCheckResult> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PermissionCheckResult(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PermissionCheckResult[] permissionCheckResultArr$values = $values();
        $VALUES = permissionCheckResultArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(permissionCheckResultArr$values);
    }

    public static PermissionCheckResult valueOf(String str) {
        return (PermissionCheckResult) Enum.valueOf(PermissionCheckResult.class, str);
    }

    public static PermissionCheckResult[] values() {
        return (PermissionCheckResult[]) $VALUES.clone();
    }
}
