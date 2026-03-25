package com.okinc.unify_trade.constants;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class MarketTypeEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarketTypeEnum[] $VALUES;
    public static final MarketTypeEnum CALL_AUCTION = new MarketTypeEnum("CALL_AUCTION", 0, "call auction");
    public static final MarketTypeEnum PRE_QUOTE = new MarketTypeEnum("PRE_QUOTE", 1, "pre quote");
    public static final MarketTypeEnum TRADING = new MarketTypeEnum("TRADING", 2, "trading");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarketTypeEnum[] $values() {
        return new MarketTypeEnum[]{CALL_AUCTION, PRE_QUOTE, TRADING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarketTypeEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private MarketTypeEnum(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        MarketTypeEnum[] marketTypeEnumArr$values = $values();
        $VALUES = marketTypeEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(marketTypeEnumArr$values);
    }

    public static MarketTypeEnum valueOf(String str) {
        return (MarketTypeEnum) Enum.valueOf(MarketTypeEnum.class, str);
    }

    public static MarketTypeEnum[] values() {
        return (MarketTypeEnum[]) $VALUES.clone();
    }
}
