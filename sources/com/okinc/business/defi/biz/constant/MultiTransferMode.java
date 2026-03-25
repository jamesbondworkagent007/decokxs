package com.okinc.business.defi.biz.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MultiTransferMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MultiTransferMode[] $VALUES;
    private final int value;
    public static final MultiTransferMode MODE_NONE = new MultiTransferMode("MODE_NONE", 0, 0);
    public static final MultiTransferMode MODE_ONE_TO_MANY = new MultiTransferMode("MODE_ONE_TO_MANY", 1, 1);
    public static final MultiTransferMode MODE_MANY_TO_ONE = new MultiTransferMode("MODE_MANY_TO_ONE", 2, 2);
    public static final MultiTransferMode MODE_MANY_TO_MANY = new MultiTransferMode("MODE_MANY_TO_MANY", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MultiTransferMode[] $values() {
        return new MultiTransferMode[]{MODE_NONE, MODE_ONE_TO_MANY, MODE_MANY_TO_ONE, MODE_MANY_TO_MANY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MultiTransferMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MultiTransferMode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MultiTransferMode[] multiTransferModeArr$values = $values();
        $VALUES = multiTransferModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(multiTransferModeArr$values);
    }

    public static MultiTransferMode valueOf(String str) {
        return (MultiTransferMode) Enum.valueOf(MultiTransferMode.class, str);
    }

    public static MultiTransferMode[] values() {
        return (MultiTransferMode[]) $VALUES.clone();
    }
}
