package com.okinc.account.api.model.login;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class NewDeviceSecurityCodeStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NewDeviceSecurityCodeStatus[] $VALUES;
    public static final NewDeviceSecurityCodeStatus AWAITING_AUTHORIZE = new NewDeviceSecurityCodeStatus("AWAITING_AUTHORIZE", 0);
    public static final NewDeviceSecurityCodeStatus AUTHORIZED = new NewDeviceSecurityCodeStatus("AUTHORIZED", 1);
    public static final NewDeviceSecurityCodeStatus UNAUTHORIZED = new NewDeviceSecurityCodeStatus("UNAUTHORIZED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NewDeviceSecurityCodeStatus[] $values() {
        return new NewDeviceSecurityCodeStatus[]{AWAITING_AUTHORIZE, AUTHORIZED, UNAUTHORIZED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NewDeviceSecurityCodeStatus> getEntries() {
        return $ENTRIES;
    }

    private NewDeviceSecurityCodeStatus(String str, int i) {
    }

    static {
        NewDeviceSecurityCodeStatus[] newDeviceSecurityCodeStatusArr$values = $values();
        $VALUES = newDeviceSecurityCodeStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(newDeviceSecurityCodeStatusArr$values);
    }

    public static NewDeviceSecurityCodeStatus valueOf(String str) {
        return (NewDeviceSecurityCodeStatus) Enum.valueOf(NewDeviceSecurityCodeStatus.class, str);
    }

    public static NewDeviceSecurityCodeStatus[] values() {
        return (NewDeviceSecurityCodeStatus[]) $VALUES.clone();
    }
}
