package com.okinc.business.defi.biz.net.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ClickType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ClickType[] $VALUES;
    public static final ClickType CANCEL = new ClickType("CANCEL", 0, 1);
    public static final ClickType CONFIRM = new ClickType("CONFIRM", 1, 2);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ClickType[] $values() {
        return new ClickType[]{CANCEL, CONFIRM};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ClickType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ClickType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ClickType[] clickTypeArr$values = $values();
        $VALUES = clickTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(clickTypeArr$values);
    }

    public static ClickType valueOf(String str) {
        return (ClickType) Enum.valueOf(ClickType.class, str);
    }

    public static ClickType[] values() {
        return (ClickType[]) $VALUES.clone();
    }
}
