package com.okinc.tradeuilib.available;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class AvailableOption {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AvailableOption[] $VALUES;
    public static final AvailableOption Trading = new AvailableOption("Trading", 0);
    public static final AvailableOption Funding = new AvailableOption("Funding", 1);
    public static final AvailableOption SimpleEarnFlexible = new AvailableOption("SimpleEarnFlexible", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AvailableOption[] $values() {
        return new AvailableOption[]{Trading, Funding, SimpleEarnFlexible};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AvailableOption> getEntries() {
        return $ENTRIES;
    }

    private AvailableOption(String str, int i) {
    }

    static {
        AvailableOption[] availableOptionArr$values = $values();
        $VALUES = availableOptionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(availableOptionArr$values);
    }

    public static AvailableOption valueOf(String str) {
        return (AvailableOption) Enum.valueOf(AvailableOption.class, str);
    }

    public static AvailableOption[] values() {
        return (AvailableOption[]) $VALUES.clone();
    }
}
