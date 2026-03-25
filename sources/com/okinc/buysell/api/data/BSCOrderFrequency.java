package com.okinc.buysell.api.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class BSCOrderFrequency {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ BSCOrderFrequency[] $VALUES;
    private final String txt;
    public static final BSCOrderFrequency NO_FREQ = new BSCOrderFrequency("NO_FREQ", 0, "just_once");
    public static final BSCOrderFrequency DAILY = new BSCOrderFrequency("DAILY", 1, "daily");
    public static final BSCOrderFrequency WEEKLY = new BSCOrderFrequency("WEEKLY", 2, "weekly");
    public static final BSCOrderFrequency BI_WEEKLY = new BSCOrderFrequency("BI_WEEKLY", 3, "bi-weekly");
    public static final BSCOrderFrequency MONTHLY = new BSCOrderFrequency("MONTHLY", 4, "monthly");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ BSCOrderFrequency[] $values() {
        return new BSCOrderFrequency[]{NO_FREQ, DAILY, WEEKLY, BI_WEEKLY, MONTHLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<BSCOrderFrequency> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxt() {
        return this.txt;
    }

    private BSCOrderFrequency(String str, int i, String str2) {
        this.txt = str2;
    }

    static {
        BSCOrderFrequency[] bSCOrderFrequencyArr$values = $values();
        $VALUES = bSCOrderFrequencyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(bSCOrderFrequencyArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.txt);
    }

    public static BSCOrderFrequency valueOf(String str) {
        return (BSCOrderFrequency) Enum.valueOf(BSCOrderFrequency.class, str);
    }

    public static BSCOrderFrequency[] values() {
        return (BSCOrderFrequency[]) $VALUES.clone();
    }
}
