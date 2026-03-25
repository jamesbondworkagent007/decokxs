package com.okinc.account.api.model.security;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class BindVerificationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BindVerificationStatus[] $VALUES;
    public static final BindVerificationStatus SUCCESS = new BindVerificationStatus("SUCCESS", 0);
    public static final BindVerificationStatus LOGOUT = new BindVerificationStatus("LOGOUT", 1);
    public static final BindVerificationStatus COMBINE_ACCOUNT = new BindVerificationStatus("COMBINE_ACCOUNT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BindVerificationStatus[] $values() {
        return new BindVerificationStatus[]{SUCCESS, LOGOUT, COMBINE_ACCOUNT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BindVerificationStatus> getEntries() {
        return $ENTRIES;
    }

    private BindVerificationStatus(String str, int i) {
    }

    static {
        BindVerificationStatus[] bindVerificationStatusArr$values = $values();
        $VALUES = bindVerificationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bindVerificationStatusArr$values);
    }

    public static BindVerificationStatus valueOf(String str) {
        return (BindVerificationStatus) Enum.valueOf(BindVerificationStatus.class, str);
    }

    public static BindVerificationStatus[] values() {
        return (BindVerificationStatus[]) $VALUES.clone();
    }
}
