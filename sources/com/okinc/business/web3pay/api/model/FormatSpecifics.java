package com.okinc.business.web3pay.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class FormatSpecifics {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FormatSpecifics[] $VALUES;
    public static final FormatSpecifics VALUE = new FormatSpecifics("VALUE", 0);
    public static final FormatSpecifics INCREMENT_VALUE = new FormatSpecifics("INCREMENT_VALUE", 1);
    public static final FormatSpecifics DECREMENT_VALUE = new FormatSpecifics("DECREMENT_VALUE", 2);
    public static final FormatSpecifics RATE = new FormatSpecifics("RATE", 3);
    public static final FormatSpecifics FEE = new FormatSpecifics("FEE", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FormatSpecifics[] $values() {
        return new FormatSpecifics[]{VALUE, INCREMENT_VALUE, DECREMENT_VALUE, RATE, FEE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FormatSpecifics> getEntries() {
        return $ENTRIES;
    }

    private FormatSpecifics(String str, int i) {
    }

    static {
        FormatSpecifics[] formatSpecificsArr$values = $values();
        $VALUES = formatSpecificsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(formatSpecificsArr$values);
    }

    public static FormatSpecifics valueOf(String str) {
        return (FormatSpecifics) Enum.valueOf(FormatSpecifics.class, str);
    }

    public static FormatSpecifics[] values() {
        return (FormatSpecifics[]) $VALUES.clone();
    }
}
