package com.okinc.unify_trade.bot.mapper;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class CoinMarginedCcyDisplay {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinMarginedCcyDisplay[] $VALUES;
    public static final CoinMarginedCcyDisplay COIN = new CoinMarginedCcyDisplay("COIN", 0, 0);
    public static final CoinMarginedCcyDisplay USDT = new CoinMarginedCcyDisplay("USDT", 1, 1);
    private final int index;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinMarginedCcyDisplay[] $values() {
        return new CoinMarginedCcyDisplay[]{COIN, USDT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinMarginedCcyDisplay> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    private CoinMarginedCcyDisplay(String str, int i, int i2) {
        this.index = i2;
    }

    static {
        CoinMarginedCcyDisplay[] coinMarginedCcyDisplayArr$values = $values();
        $VALUES = coinMarginedCcyDisplayArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinMarginedCcyDisplayArr$values);
    }

    public static CoinMarginedCcyDisplay valueOf(String str) {
        return (CoinMarginedCcyDisplay) Enum.valueOf(CoinMarginedCcyDisplay.class, str);
    }

    public static CoinMarginedCcyDisplay[] values() {
        return (CoinMarginedCcyDisplay[]) $VALUES.clone();
    }
}
