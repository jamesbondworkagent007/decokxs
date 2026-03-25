package com.okinc.business.dexlogic.main.limmitorder.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class BizMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BizMode[] $VALUES;
    private final int value;
    public static final BizMode LIMIT_ORDER = new BizMode("LIMIT_ORDER", 0, 1);
    public static final BizMode COPY_TRADE = new BizMode("COPY_TRADE", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BizMode[] $values() {
        return new BizMode[]{LIMIT_ORDER, COPY_TRADE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BizMode> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private BizMode(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        BizMode[] bizModeArr$values = $values();
        $VALUES = bizModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bizModeArr$values);
    }

    public static BizMode valueOf(String str) {
        return (BizMode) Enum.valueOf(BizMode.class, str);
    }

    public static BizMode[] values() {
        return (BizMode[]) $VALUES.clone();
    }
}
