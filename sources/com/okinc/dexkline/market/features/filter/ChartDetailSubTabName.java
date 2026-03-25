package com.okinc.dexkline.market.features.filter;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartDetailSubTabName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartDetailSubTabName[] $VALUES;
    private final String tabName;
    public static final ChartDetailSubTabName HISTORY_CHANGE = new ChartDetailSubTabName("HISTORY_CHANGE", 0, "history");
    public static final ChartDetailSubTabName LIQUIDITY_CHANGE = new ChartDetailSubTabName("LIQUIDITY_CHANGE", 1, "liquidity change");
    public static final ChartDetailSubTabName HOLDERS = new ChartDetailSubTabName("HOLDERS", 2, "holders");
    public static final ChartDetailSubTabName TRADER = new ChartDetailSubTabName("TRADER", 3, "trader");
    public static final ChartDetailSubTabName MY_POSITION = new ChartDetailSubTabName("MY_POSITION", 4, "my position");
    public static final ChartDetailSubTabName NONE = new ChartDetailSubTabName("NONE", 5, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartDetailSubTabName[] $values() {
        return new ChartDetailSubTabName[]{HISTORY_CHANGE, LIQUIDITY_CHANGE, HOLDERS, TRADER, MY_POSITION, NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartDetailSubTabName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    private ChartDetailSubTabName(String str, int i, String str2) {
        this.tabName = str2;
    }

    static {
        ChartDetailSubTabName[] chartDetailSubTabNameArr$values = $values();
        $VALUES = chartDetailSubTabNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartDetailSubTabNameArr$values);
    }

    public static ChartDetailSubTabName valueOf(String str) {
        return (ChartDetailSubTabName) Enum.valueOf(ChartDetailSubTabName.class, str);
    }

    public static ChartDetailSubTabName[] values() {
        return (ChartDetailSubTabName[]) $VALUES.clone();
    }
}
