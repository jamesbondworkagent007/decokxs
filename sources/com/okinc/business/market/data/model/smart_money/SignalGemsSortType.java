package com.okinc.business.market.data.model.smart_money;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class SignalGemsSortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalGemsSortType[] $VALUES;
    public static final SignalGemsSortType MARKET_CAP = new SignalGemsSortType("MARKET_CAP", 0, 2);
    public static final SignalGemsSortType MAX_PRICE_INCREASE = new SignalGemsSortType("MAX_PRICE_INCREASE", 1, 3);
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalGemsSortType[] $values() {
        return new SignalGemsSortType[]{MARKET_CAP, MAX_PRICE_INCREASE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalGemsSortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private SignalGemsSortType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        SignalGemsSortType[] signalGemsSortTypeArr$values = $values();
        $VALUES = signalGemsSortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalGemsSortTypeArr$values);
    }

    public static SignalGemsSortType valueOf(String str) {
        return (SignalGemsSortType) Enum.valueOf(SignalGemsSortType.class, str);
    }

    public static SignalGemsSortType[] values() {
        return (SignalGemsSortType[]) $VALUES.clone();
    }
}
