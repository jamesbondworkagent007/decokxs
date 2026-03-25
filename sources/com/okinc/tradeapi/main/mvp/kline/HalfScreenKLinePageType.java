package com.okinc.tradeapi.main.mvp.kline;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class HalfScreenKLinePageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HalfScreenKLinePageType[] $VALUES;
    public static final HalfScreenKLinePageType TRADE_MANUAL = new HalfScreenKLinePageType("TRADE_MANUAL", 0);
    public static final HalfScreenKLinePageType TRADE_TACTICS = new HalfScreenKLinePageType("TRADE_TACTICS", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HalfScreenKLinePageType[] $values() {
        return new HalfScreenKLinePageType[]{TRADE_MANUAL, TRADE_TACTICS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HalfScreenKLinePageType> getEntries() {
        return $ENTRIES;
    }

    private HalfScreenKLinePageType(String str, int i) {
    }

    static {
        HalfScreenKLinePageType[] halfScreenKLinePageTypeArr$values = $values();
        $VALUES = halfScreenKLinePageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(halfScreenKLinePageTypeArr$values);
    }

    public static HalfScreenKLinePageType valueOf(String str) {
        return (HalfScreenKLinePageType) Enum.valueOf(HalfScreenKLinePageType.class, str);
    }

    public static HalfScreenKLinePageType[] values() {
        return (HalfScreenKLinePageType[]) $VALUES.clone();
    }
}
