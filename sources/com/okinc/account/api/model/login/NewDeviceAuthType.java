package com.okinc.account.api.model.login;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class NewDeviceAuthType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NewDeviceAuthType[] $VALUES;
    private final int value;
    public static final NewDeviceAuthType PHONE = new NewDeviceAuthType("PHONE", 0, 0);
    public static final NewDeviceAuthType EMAIL = new NewDeviceAuthType("EMAIL", 1, 1);
    public static final NewDeviceAuthType DEVICE = new NewDeviceAuthType("DEVICE", 2, 2);
    public static final NewDeviceAuthType FACE = new NewDeviceAuthType("FACE", 3, 3);
    public static final NewDeviceAuthType NEW_DEVICE = new NewDeviceAuthType("NEW_DEVICE", 4, 4);
    public static final NewDeviceAuthType NEW_FACE = new NewDeviceAuthType("NEW_FACE", 5, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NewDeviceAuthType[] $values() {
        return new NewDeviceAuthType[]{PHONE, EMAIL, DEVICE, FACE, NEW_DEVICE, NEW_FACE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NewDeviceAuthType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private NewDeviceAuthType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        NewDeviceAuthType[] newDeviceAuthTypeArr$values = $values();
        $VALUES = newDeviceAuthTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(newDeviceAuthTypeArr$values);
    }

    public static NewDeviceAuthType valueOf(String str) {
        return (NewDeviceAuthType) Enum.valueOf(NewDeviceAuthType.class, str);
    }

    public static NewDeviceAuthType[] values() {
        return (NewDeviceAuthType[]) $VALUES.clone();
    }
}
