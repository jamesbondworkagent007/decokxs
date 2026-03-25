package com.okinc.business.trade.features.home.ui.meme.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeExchangeDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MemeExchangeDirection[] $VALUES;
    public static final MemeExchangeDirection ALL = new MemeExchangeDirection("ALL", 0, -1);
    public static final MemeExchangeDirection BUY = new MemeExchangeDirection("BUY", 1, 0);
    public static final MemeExchangeDirection SELL = new MemeExchangeDirection("SELL", 2, 1);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MemeExchangeDirection[] $values() {
        return new MemeExchangeDirection[]{ALL, BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MemeExchangeDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MemeExchangeDirection(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MemeExchangeDirection[] memeExchangeDirectionArr$values = $values();
        $VALUES = memeExchangeDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(memeExchangeDirectionArr$values);
    }

    public static MemeExchangeDirection valueOf(String str) {
        return (MemeExchangeDirection) Enum.valueOf(MemeExchangeDirection.class, str);
    }

    public static MemeExchangeDirection[] values() {
        return (MemeExchangeDirection[]) $VALUES.clone();
    }
}
