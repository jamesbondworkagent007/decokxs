package com.okinc.business.market.data.constant;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class Currency {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ Currency[] $VALUES;
    public static final Currency Usd = new Currency("Usd", 0, 0);
    private final int id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ Currency[] $values() {
        return new Currency[]{Usd};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<Currency> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getId() {
        return this.id;
    }

    private Currency(String str, int i, int i2) {
        this.id = i2;
    }

    static {
        Currency[] currencyArr$values = $values();
        $VALUES = currencyArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currencyArr$values);
    }

    public static Currency valueOf(String str) {
        return (Currency) Enum.valueOf(Currency.class, str);
    }

    public static Currency[] values() {
        return (Currency[]) $VALUES.clone();
    }
}
