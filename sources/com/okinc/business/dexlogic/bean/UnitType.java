package com.okinc.business.dexlogic.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class UnitType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnitType[] $VALUES;
    public static final UnitType UnitTypePercent = new UnitType("UnitTypePercent", 0);
    public static final UnitType UnitTypeToken = new UnitType("UnitTypeToken", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnitType[] $values() {
        return new UnitType[]{UnitTypePercent, UnitTypeToken};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnitType> getEntries() {
        return $ENTRIES;
    }

    private UnitType(String str, int i) {
    }

    static {
        UnitType[] unitTypeArr$values = $values();
        $VALUES = unitTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(unitTypeArr$values);
    }

    public static UnitType valueOf(String str) {
        return (UnitType) Enum.valueOf(UnitType.class, str);
    }

    public static UnitType[] values() {
        return (UnitType[]) $VALUES.clone();
    }
}
