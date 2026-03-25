package com.okinc.market.common.bean;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class PayloadPeriod {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PayloadPeriod[] $VALUES;
    private final String value;
    public static final PayloadPeriod PERIOD_7D = new PayloadPeriod("PERIOD_7D", 0, "7");
    public static final PayloadPeriod PERIOD_30D = new PayloadPeriod("PERIOD_30D", 1, "30");
    public static final PayloadPeriod PERIOD_90D = new PayloadPeriod("PERIOD_90D", 2, "90");
    public static final PayloadPeriod ALL = new PayloadPeriod("ALL", 3, "all");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PayloadPeriod[] $values() {
        return new PayloadPeriod[]{PERIOD_7D, PERIOD_30D, PERIOD_90D, ALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PayloadPeriod> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PayloadPeriod(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PayloadPeriod[] payloadPeriodArr$values = $values();
        $VALUES = payloadPeriodArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(payloadPeriodArr$values);
    }

    public static PayloadPeriod valueOf(String str) {
        return (PayloadPeriod) Enum.valueOf(PayloadPeriod.class, str);
    }

    public static PayloadPeriod[] values() {
        return (PayloadPeriod[]) $VALUES.clone();
    }
}
