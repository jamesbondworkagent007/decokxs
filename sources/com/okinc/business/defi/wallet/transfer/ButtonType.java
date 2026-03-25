package com.okinc.business.defi.wallet.transfer;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ButtonType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType NO_BUTTON = new ButtonType("NO_BUTTON", 0);
    public static final ButtonType CREATE_ACCOUNT_BUTTON = new ButtonType("CREATE_ACCOUNT_BUTTON", 1);
    public static final ButtonType ACTIVE_BUTTON = new ButtonType("ACTIVE_BUTTON", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ButtonType[] $values() {
        return new ButtonType[]{NO_BUTTON, CREATE_ACCOUNT_BUTTON, ACTIVE_BUTTON};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ButtonType> getEntries() {
        return $ENTRIES;
    }

    private ButtonType(String str, int i) {
    }

    static {
        ButtonType[] buttonTypeArr$values = $values();
        $VALUES = buttonTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(buttonTypeArr$values);
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
