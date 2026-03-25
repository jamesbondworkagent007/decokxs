package com.okinc.buysell.api;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class BSCTargetTab {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCTargetTab[] $VALUES;
    public static final BSCTargetTab BUY = new BSCTargetTab("BUY", 0);
    public static final BSCTargetTab SELL = new BSCTargetTab("SELL", 1);
    public static final BSCTargetTab CONVERT = new BSCTargetTab("CONVERT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCTargetTab[] $values() {
        return new BSCTargetTab[]{BUY, SELL, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCTargetTab> getEntries() {
        return $ENTRIES;
    }

    private BSCTargetTab(String str, int i) {
    }

    static {
        BSCTargetTab[] bSCTargetTabArr$values = $values();
        $VALUES = bSCTargetTabArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCTargetTabArr$values);
    }

    public static BSCTargetTab valueOf(String str) {
        return (BSCTargetTab) Enum.valueOf(BSCTargetTab.class, str);
    }

    public static BSCTargetTab[] values() {
        return (BSCTargetTab[]) $VALUES.clone();
    }
}
