package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class HoldType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HoldType[] $VALUES;
    public static final HoldType FLEXIBLE = new HoldType("FLEXIBLE", 0);
    public static final HoldType FIXED = new HoldType("FIXED", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HoldType[] $values() {
        return new HoldType[]{FLEXIBLE, FIXED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HoldType> getEntries() {
        return $ENTRIES;
    }

    private HoldType(String str, int i) {
    }

    static {
        HoldType[] holdTypeArr$values = $values();
        $VALUES = holdTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(holdTypeArr$values);
    }

    public static HoldType valueOf(String str) {
        return (HoldType) Enum.valueOf(HoldType.class, str);
    }

    public static HoldType[] values() {
        return (HoldType[]) $VALUES.clone();
    }
}
