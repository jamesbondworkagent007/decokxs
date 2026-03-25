package com.okinc.ok_kyc_core_api.feature_restriction;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ButtonActionType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonActionType[] $VALUES;
    public static final ButtonActionType WEB3 = new ButtonActionType("WEB3", 0);
    public static final ButtonActionType KYC_USER_CENTER = new ButtonActionType("KYC_USER_CENTER", 1);
    public static final ButtonActionType SIGN_UP = new ButtonActionType("SIGN_UP", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonActionType[] $values() {
        return new ButtonActionType[]{WEB3, KYC_USER_CENTER, SIGN_UP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonActionType> getEntries() {
        return $ENTRIES;
    }

    private ButtonActionType(String str, int i) {
    }

    static {
        ButtonActionType[] buttonActionTypeArr$values = $values();
        $VALUES = buttonActionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonActionTypeArr$values);
    }

    public static ButtonActionType valueOf(String str) {
        return (ButtonActionType) Enum.valueOf(ButtonActionType.class, str);
    }

    public static ButtonActionType[] values() {
        return (ButtonActionType[]) $VALUES.clone();
    }
}
