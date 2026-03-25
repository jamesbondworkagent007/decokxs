package com.okinc.social_trade_api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class BusinessLine {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BusinessLine[] $VALUES;
    public static final BusinessLine Spot = new BusinessLine("Spot", 0);
    public static final BusinessLine Swap = new BusinessLine("Swap", 1);
    public static final BusinessLine Bots = new BusinessLine("Bots", 2);
    public static final BusinessLine Signal = new BusinessLine("Signal", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BusinessLine[] $values() {
        return new BusinessLine[]{Spot, Swap, Bots, Signal};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BusinessLine> getEntries() {
        return $ENTRIES;
    }

    private BusinessLine(String str, int i) {
    }

    static {
        BusinessLine[] businessLineArr$values = $values();
        $VALUES = businessLineArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(businessLineArr$values);
    }

    public static BusinessLine valueOf(String str) {
        return (BusinessLine) Enum.valueOf(BusinessLine.class, str);
    }

    public static BusinessLine[] values() {
        return (BusinessLine[]) $VALUES.clone();
    }
}
