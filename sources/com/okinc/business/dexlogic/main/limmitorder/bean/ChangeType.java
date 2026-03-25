package com.okinc.business.dexlogic.main.limmitorder.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ChangeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChangeType[] $VALUES;
    public static final ChangeType FromChange = new ChangeType("FromChange", 0);
    public static final ChangeType ToChange = new ChangeType("ToChange", 1);
    public static final ChangeType RateChange = new ChangeType("RateChange", 2);
    public static final ChangeType FromToChange = new ChangeType("FromToChange", 3);
    public static final ChangeType UNKnown = new ChangeType("UNKnown", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChangeType[] $values() {
        return new ChangeType[]{FromChange, ToChange, RateChange, FromToChange, UNKnown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChangeType> getEntries() {
        return $ENTRIES;
    }

    private ChangeType(String str, int i) {
    }

    static {
        ChangeType[] changeTypeArr$values = $values();
        $VALUES = changeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(changeTypeArr$values);
    }

    public static ChangeType valueOf(String str) {
        return (ChangeType) Enum.valueOf(ChangeType.class, str);
    }

    public static ChangeType[] values() {
        return (ChangeType[]) $VALUES.clone();
    }
}
