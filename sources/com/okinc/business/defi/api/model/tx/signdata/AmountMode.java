package com.okinc.business.defi.api.model.tx.signdata;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AmountMode {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AmountMode[] $VALUES;
    public static final AmountMode SPECIFIED = new AmountMode("SPECIFIED", 0);
    public static final AmountMode RANGE = new AmountMode("RANGE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AmountMode[] $values() {
        return new AmountMode[]{SPECIFIED, RANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AmountMode> getEntries() {
        return $ENTRIES;
    }

    private AmountMode(String str, int i) {
    }

    static {
        AmountMode[] amountModeArr$values = $values();
        $VALUES = amountModeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(amountModeArr$values);
    }

    public static AmountMode valueOf(String str) {
        return (AmountMode) Enum.valueOf(AmountMode.class, str);
    }

    public static AmountMode[] values() {
        return (AmountMode[]) $VALUES.clone();
    }
}
