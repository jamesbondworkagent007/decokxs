package com.okinc.oklive.app.domain.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class PriceChangeDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PriceChangeDirection[] $VALUES;
    public static final PriceChangeDirection Positive = new PriceChangeDirection("Positive", 0);
    public static final PriceChangeDirection Zero = new PriceChangeDirection("Zero", 1);
    public static final PriceChangeDirection Negative = new PriceChangeDirection("Negative", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PriceChangeDirection[] $values() {
        return new PriceChangeDirection[]{Positive, Zero, Negative};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PriceChangeDirection> getEntries() {
        return $ENTRIES;
    }

    private PriceChangeDirection(String str, int i) {
    }

    static {
        PriceChangeDirection[] priceChangeDirectionArr$values = $values();
        $VALUES = priceChangeDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(priceChangeDirectionArr$values);
    }

    public static PriceChangeDirection valueOf(String str) {
        return (PriceChangeDirection) Enum.valueOf(PriceChangeDirection.class, str);
    }

    public static PriceChangeDirection[] values() {
        return (PriceChangeDirection[]) $VALUES.clone();
    }
}
