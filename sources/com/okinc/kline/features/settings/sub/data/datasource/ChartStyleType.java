package com.okinc.kline.features.settings.sub.data.datasource;

import o.C56444yFp;
import o.InterfaceC36227oTz;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartStyleType implements InterfaceC36227oTz {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartStyleType[] $VALUES;
    public static final ChartStyleType ChartView = new ChartStyleType("ChartView", 0);
    public static final ChartStyleType FullScreenMode = new ChartStyleType("FullScreenMode", 1);
    public static final ChartStyleType Theme = new ChartStyleType("Theme", 2);
    public static final ChartStyleType ZoomStyle = new ChartStyleType("ZoomStyle", 3);
    public static final ChartStyleType TradeButton = new ChartStyleType("TradeButton", 4);
    public static final ChartStyleType ColorPreference = new ChartStyleType("ColorPreference", 5);
    public static final ChartStyleType Bullish = new ChartStyleType("Bullish", 6);
    public static final ChartStyleType Bearish = new ChartStyleType("Bearish", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartStyleType[] $values() {
        return new ChartStyleType[]{ChartView, FullScreenMode, Theme, ZoomStyle, TradeButton, ColorPreference, Bullish, Bearish};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartStyleType> getEntries() {
        return $ENTRIES;
    }

    private ChartStyleType(String str, int i) {
    }

    static {
        ChartStyleType[] chartStyleTypeArr$values = $values();
        $VALUES = chartStyleTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartStyleTypeArr$values);
    }

    public static ChartStyleType valueOf(String str) {
        return (ChartStyleType) Enum.valueOf(ChartStyleType.class, str);
    }

    public static ChartStyleType[] values() {
        return (ChartStyleType[]) $VALUES.clone();
    }
}
