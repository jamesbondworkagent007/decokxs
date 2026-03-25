package com.okinc.business.web3pay.api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CurrencyRounding {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CurrencyRounding[] $VALUES;
    public static final CurrencyRounding DOWN = new CurrencyRounding("DOWN", 0);
    public static final CurrencyRounding UP = new CurrencyRounding("UP", 1);
    public static final CurrencyRounding ROUND = new CurrencyRounding("ROUND", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CurrencyRounding[] $values() {
        return new CurrencyRounding[]{DOWN, UP, ROUND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CurrencyRounding> getEntries() {
        return $ENTRIES;
    }

    static {
        CurrencyRounding[] currencyRoundingArr$values = $values();
        $VALUES = currencyRoundingArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currencyRoundingArr$values);
    }

    private CurrencyRounding(String str, int i) {
    }

    public static CurrencyRounding valueOf(String str) {
        return (CurrencyRounding) Enum.valueOf(CurrencyRounding.class, str);
    }

    public static CurrencyRounding[] values() {
        return (CurrencyRounding[]) $VALUES.clone();
    }
}
