package com.okinc.kline.features.settings.main.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oSK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartDisplayType implements oSK {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartDisplayType[] $VALUES;
    public static final ChartDisplayType Axis = new ChartDisplayType("Axis", 0);
    public static final ChartDisplayType CountDown = new ChartDisplayType("CountDown", 1);
    public static final ChartDisplayType PriceAlerts = new ChartDisplayType("PriceAlerts", 2);
    public static final ChartDisplayType EconomicCalendar = new ChartDisplayType("EconomicCalendar", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartDisplayType[] $values() {
        return new ChartDisplayType[]{Axis, CountDown, PriceAlerts, EconomicCalendar};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartDisplayType> getEntries() {
        return $ENTRIES;
    }

    private ChartDisplayType(String str, int i) {
    }

    static {
        ChartDisplayType[] chartDisplayTypeArr$values = $values();
        $VALUES = chartDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartDisplayTypeArr$values);
    }

    public static ChartDisplayType valueOf(String str) {
        return (ChartDisplayType) Enum.valueOf(ChartDisplayType.class, str);
    }

    public static ChartDisplayType[] values() {
        return (ChartDisplayType[]) $VALUES.clone();
    }
}
