package com.okinc.buysell.ui.bsc.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BSCTabIndex {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCTabIndex[] $VALUES;
    private final int index;
    public static final BSCTabIndex BUY = new BSCTabIndex("BUY", 0, 0);
    public static final BSCTabIndex SELL = new BSCTabIndex("SELL", 1, 1);
    public static final BSCTabIndex CONVERT = new BSCTabIndex("CONVERT", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCTabIndex[] $values() {
        return new BSCTabIndex[]{BUY, SELL, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCTabIndex> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    private BSCTabIndex(String str, int i, int i2) {
        this.index = i2;
    }

    static {
        BSCTabIndex[] bSCTabIndexArr$values = $values();
        $VALUES = bSCTabIndexArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCTabIndexArr$values);
    }

    public static BSCTabIndex valueOf(String str) {
        return (BSCTabIndex) Enum.valueOf(BSCTabIndex.class, str);
    }

    public static BSCTabIndex[] values() {
        return (BSCTabIndex[]) $VALUES.clone();
    }
}
