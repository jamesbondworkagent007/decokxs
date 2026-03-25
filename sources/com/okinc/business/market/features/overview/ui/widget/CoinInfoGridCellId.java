package com.okinc.business.market.features.overview.ui.widget;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class CoinInfoGridCellId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinInfoGridCellId[] $VALUES;
    public static final CoinInfoGridCellId HOLDERS = new CoinInfoGridCellId("HOLDERS", 0);
    public static final CoinInfoGridCellId LIQUIDITY = new CoinInfoGridCellId("LIQUIDITY", 1);
    public static final CoinInfoGridCellId MCAP = new CoinInfoGridCellId("MCAP", 2);
    public static final CoinInfoGridCellId FDV = new CoinInfoGridCellId("FDV", 3);
    public static final CoinInfoGridCellId CONTRACT_ADDRESS = new CoinInfoGridCellId("CONTRACT_ADDRESS", 4);
    public static final CoinInfoGridCellId RISK = new CoinInfoGridCellId("RISK", 5);
    public static final CoinInfoGridCellId DEV_HOLDINGS = new CoinInfoGridCellId("DEV_HOLDINGS", 6);
    public static final CoinInfoGridCellId TOP_10_HOLDERS = new CoinInfoGridCellId("TOP_10_HOLDERS", 7);
    public static final CoinInfoGridCellId INSIDER = new CoinInfoGridCellId("INSIDER", 8);
    public static final CoinInfoGridCellId SNIPER = new CoinInfoGridCellId("SNIPER", 9);
    public static final CoinInfoGridCellId BUNDLER = new CoinInfoGridCellId("BUNDLER", 10);
    public static final CoinInfoGridCellId SMART_MONEY = new CoinInfoGridCellId("SMART_MONEY", 11);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinInfoGridCellId[] $values() {
        return new CoinInfoGridCellId[]{HOLDERS, LIQUIDITY, MCAP, FDV, CONTRACT_ADDRESS, RISK, DEV_HOLDINGS, TOP_10_HOLDERS, INSIDER, SNIPER, BUNDLER, SMART_MONEY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinInfoGridCellId> getEntries() {
        return $ENTRIES;
    }

    private CoinInfoGridCellId(String str, int i) {
    }

    static {
        CoinInfoGridCellId[] coinInfoGridCellIdArr$values = $values();
        $VALUES = coinInfoGridCellIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinInfoGridCellIdArr$values);
    }

    public static CoinInfoGridCellId valueOf(String str) {
        return (CoinInfoGridCellId) Enum.valueOf(CoinInfoGridCellId.class, str);
    }

    public static CoinInfoGridCellId[] values() {
        return (CoinInfoGridCellId[]) $VALUES.clone();
    }
}
