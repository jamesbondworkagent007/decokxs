package com.okinc.buysell.api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class BSCOrderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCOrderType[] $VALUES;
    private final String txt;
    public static final BSCOrderType OTHERS = new BSCOrderType("OTHERS", 0, "Trade");
    public static final BSCOrderType NONE = new BSCOrderType("NONE", 1, "Trade");
    public static final BSCOrderType ONE_TIME = new BSCOrderType("ONE_TIME", 2, "one_time");
    public static final BSCOrderType RECURRING = new BSCOrderType("RECURRING", 3, "recurring");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCOrderType[] $values() {
        return new BSCOrderType[]{OTHERS, NONE, ONE_TIME, RECURRING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCOrderType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxt() {
        return this.txt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.txt;
    }

    private BSCOrderType(String str, int i, String str2) {
        this.txt = str2;
    }

    static {
        BSCOrderType[] bSCOrderTypeArr$values = $values();
        $VALUES = bSCOrderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCOrderTypeArr$values);
    }

    public static BSCOrderType valueOf(String str) {
        return (BSCOrderType) Enum.valueOf(BSCOrderType.class, str);
    }

    public static BSCOrderType[] values() {
        return (BSCOrderType[]) $VALUES.clone();
    }
}
