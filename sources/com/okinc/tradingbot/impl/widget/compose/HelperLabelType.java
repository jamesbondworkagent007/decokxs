package com.okinc.tradingbot.impl.widget.compose;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class HelperLabelType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HelperLabelType[] $VALUES;
    private final int value;
    public static final HelperLabelType Underlined = new HelperLabelType("Underlined", 0, 1);
    public static final HelperLabelType Regular = new HelperLabelType("Regular", 1, 2);
    public static final HelperLabelType Icon = new HelperLabelType("Icon", 2, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HelperLabelType[] $values() {
        return new HelperLabelType[]{Underlined, Regular, Icon};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HelperLabelType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private HelperLabelType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        HelperLabelType[] helperLabelTypeArr$values = $values();
        $VALUES = helperLabelTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(helperLabelTypeArr$values);
    }

    public static HelperLabelType valueOf(String str) {
        return (HelperLabelType) Enum.valueOf(HelperLabelType.class, str);
    }

    public static HelperLabelType[] values() {
        return (HelperLabelType[]) $VALUES.clone();
    }
}
