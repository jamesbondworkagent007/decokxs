package com.okinc.buysell.ui.bsc.util;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class InputType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InputType[] $VALUES;
    private final int id;
    public static final InputType FIAT_INPUT = new InputType("FIAT_INPUT", 0, 0);
    public static final InputType CRYPTO_INPUT = new InputType("CRYPTO_INPUT", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InputType[] $values() {
        return new InputType[]{FIAT_INPUT, CRYPTO_INPUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InputType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    private InputType(String str, int i, int i2) {
        this.id = i2;
    }

    static {
        InputType[] inputTypeArr$values = $values();
        $VALUES = inputTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inputTypeArr$values);
    }

    public static InputType valueOf(String str) {
        return (InputType) Enum.valueOf(InputType.class, str);
    }

    public static InputType[] values() {
        return (InputType[]) $VALUES.clone();
    }
}
