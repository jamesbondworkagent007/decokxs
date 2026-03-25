package com.okinc.business.dexlogic.track.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class KlineType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ KlineType[] $VALUES;
    private final String value;
    public static final KlineType PRICE = new KlineType("PRICE", 0, "Price");
    public static final KlineType MARKET_CAP = new KlineType("MARKET_CAP", 1, "mcap");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ KlineType[] $values() {
        return new KlineType[]{PRICE, MARKET_CAP};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<KlineType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private KlineType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        KlineType[] klineTypeArr$values = $values();
        $VALUES = klineTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(klineTypeArr$values);
    }

    public static KlineType valueOf(String str) {
        return (KlineType) Enum.valueOf(KlineType.class, str);
    }

    public static KlineType[] values() {
        return (KlineType[]) $VALUES.clone();
    }
}
