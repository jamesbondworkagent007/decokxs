package com.okinc.crcore.shared.formatter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class AmountDisplayType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AmountDisplayType[] $VALUES;
    public static final AmountDisplayType OVERVIEW = new AmountDisplayType("OVERVIEW", 0);
    public static final AmountDisplayType INPUT = new AmountDisplayType("INPUT", 1);
    public static final AmountDisplayType DETAIL = new AmountDisplayType("DETAIL", 2);
    public static final AmountDisplayType CASH = new AmountDisplayType("CASH", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AmountDisplayType[] $values() {
        return new AmountDisplayType[]{OVERVIEW, INPUT, DETAIL, CASH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AmountDisplayType> getEntries() {
        return $ENTRIES;
    }

    private AmountDisplayType(String str, int i) {
    }

    static {
        AmountDisplayType[] amountDisplayTypeArr$values = $values();
        $VALUES = amountDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(amountDisplayTypeArr$values);
    }

    public static AmountDisplayType valueOf(String str) {
        return (AmountDisplayType) Enum.valueOf(AmountDisplayType.class, str);
    }

    public static AmountDisplayType[] values() {
        return (AmountDisplayType[]) $VALUES.clone();
    }
}
