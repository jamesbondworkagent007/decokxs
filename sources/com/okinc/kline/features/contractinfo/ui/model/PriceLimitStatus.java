package com.okinc.kline.features.contractinfo.ui.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class PriceLimitStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PriceLimitStatus[] $VALUES;
    private final int status;
    public static final PriceLimitStatus H1 = new PriceLimitStatus("H1", 0, 1);
    public static final PriceLimitStatus H2 = new PriceLimitStatus("H2", 1, 2);
    public static final PriceLimitStatus H3 = new PriceLimitStatus("H3", 2, 3);
    public static final PriceLimitStatus C = new PriceLimitStatus("C", 3, 4);
    public static final PriceLimitStatus X = new PriceLimitStatus("X", 4, 5);
    public static final PriceLimitStatus Y = new PriceLimitStatus("Y", 5, 6);
    public static final PriceLimitStatus Z = new PriceLimitStatus("Z", 6, 7);
    public static final PriceLimitStatus J = new PriceLimitStatus("J", 7, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PriceLimitStatus[] $values() {
        return new PriceLimitStatus[]{H1, H2, H3, C, X, Y, Z, J};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PriceLimitStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private PriceLimitStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        PriceLimitStatus[] priceLimitStatusArr$values = $values();
        $VALUES = priceLimitStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(priceLimitStatusArr$values);
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.status);
    }

    public static PriceLimitStatus valueOf(String str) {
        return (PriceLimitStatus) Enum.valueOf(PriceLimitStatus.class, str);
    }

    public static PriceLimitStatus[] values() {
        return (PriceLimitStatus[]) $VALUES.clone();
    }
}
