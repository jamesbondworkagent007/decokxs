package com.okinc.dexkline.market.features.coindetail.domain.type;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class CoinDetailTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinDetailTabType[] $VALUES;
    public static final CoinDetailTabType INFO = new CoinDetailTabType("INFO", 0);
    public static final CoinDetailTabType CHART = new CoinDetailTabType("CHART", 1);
    public static final CoinDetailTabType FEEDS = new CoinDetailTabType("FEEDS", 2);
    public static final CoinDetailTabType DATA = new CoinDetailTabType("DATA", 3);
    public static final CoinDetailTabType ASSESSMENT = new CoinDetailTabType("ASSESSMENT", 4);
    public static final CoinDetailTabType EARN = new CoinDetailTabType("EARN", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinDetailTabType[] $values() {
        return new CoinDetailTabType[]{INFO, CHART, FEEDS, DATA, ASSESSMENT, EARN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinDetailTabType> getEntries() {
        return $ENTRIES;
    }

    private CoinDetailTabType(String str, int i) {
    }

    static {
        CoinDetailTabType[] coinDetailTabTypeArr$values = $values();
        $VALUES = coinDetailTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinDetailTabTypeArr$values);
    }

    public static CoinDetailTabType valueOf(String str) {
        return (CoinDetailTabType) Enum.valueOf(CoinDetailTabType.class, str);
    }

    public static CoinDetailTabType[] values() {
        return (CoinDetailTabType[]) $VALUES.clone();
    }
}
