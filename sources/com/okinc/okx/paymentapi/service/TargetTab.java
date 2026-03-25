package com.okinc.okx.paymentapi.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TargetTab {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TargetTab[] $VALUES;
    public static final TargetTab BUY = new TargetTab("BUY", 0);
    public static final TargetTab SELL = new TargetTab("SELL", 1);
    public static final TargetTab CONVERT = new TargetTab("CONVERT", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TargetTab[] $values() {
        return new TargetTab[]{BUY, SELL, CONVERT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TargetTab> getEntries() {
        return $ENTRIES;
    }

    private TargetTab(String str, int i) {
    }

    static {
        TargetTab[] targetTabArr$values = $values();
        $VALUES = targetTabArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(targetTabArr$values);
    }

    public static TargetTab valueOf(String str) {
        return (TargetTab) Enum.valueOf(TargetTab.class, str);
    }

    public static TargetTab[] values() {
        return (TargetTab[]) $VALUES.clone();
    }
}
