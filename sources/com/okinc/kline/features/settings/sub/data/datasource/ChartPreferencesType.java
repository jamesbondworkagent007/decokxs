package com.okinc.kline.features.settings.sub.data.datasource;

import o.C56444yFp;
import o.InterfaceC36227oTz;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartPreferencesType implements InterfaceC36227oTz {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartPreferencesType[] $VALUES;
    public static final ChartPreferencesType UtcChangeAndChartTime = new ChartPreferencesType("UtcChangeAndChartTime", 0);
    public static final ChartPreferencesType AbstractOnChart = new ChartPreferencesType("AbstractOnChart", 1);
    public static final ChartPreferencesType DragPosition = new ChartPreferencesType("DragPosition", 2);
    public static final ChartPreferencesType AnchorTime = new ChartPreferencesType("AnchorTime", 3);
    public static final ChartPreferencesType AnchorTimeSwitchPairs = new ChartPreferencesType("AnchorTimeSwitchPairs", 4);
    public static final ChartPreferencesType NewsDisplay = new ChartPreferencesType("NewsDisplay", 5);
    public static final ChartPreferencesType QuickTrading = new ChartPreferencesType("QuickTrading", 6);
    public static final ChartPreferencesType KeepScreenOn = new ChartPreferencesType("KeepScreenOn", 7);
    public static final ChartPreferencesType DoubleTapToFullScreen = new ChartPreferencesType("DoubleTapToFullScreen", 8);
    public static final ChartPreferencesType CancelOrderConfirm = new ChartPreferencesType("CancelOrderConfirm", 9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartPreferencesType[] $values() {
        return new ChartPreferencesType[]{UtcChangeAndChartTime, AbstractOnChart, DragPosition, AnchorTime, AnchorTimeSwitchPairs, NewsDisplay, QuickTrading, KeepScreenOn, DoubleTapToFullScreen, CancelOrderConfirm};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartPreferencesType> getEntries() {
        return $ENTRIES;
    }

    private ChartPreferencesType(String str, int i) {
    }

    static {
        ChartPreferencesType[] chartPreferencesTypeArr$values = $values();
        $VALUES = chartPreferencesTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartPreferencesTypeArr$values);
    }

    public static ChartPreferencesType valueOf(String str) {
        return (ChartPreferencesType) Enum.valueOf(ChartPreferencesType.class, str);
    }

    public static ChartPreferencesType[] values() {
        return (ChartPreferencesType[]) $VALUES.clone();
    }
}
