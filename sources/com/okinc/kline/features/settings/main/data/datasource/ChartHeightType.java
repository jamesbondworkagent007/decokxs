package com.okinc.kline.features.settings.main.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oSK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChartHeightType implements oSK {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChartHeightType[] $VALUES;
    public static final ChartHeightType ChartHeight = new ChartHeightType("ChartHeight", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChartHeightType[] $values() {
        return new ChartHeightType[]{ChartHeight};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChartHeightType> getEntries() {
        return $ENTRIES;
    }

    private ChartHeightType(String str, int i) {
    }

    static {
        ChartHeightType[] chartHeightTypeArr$values = $values();
        $VALUES = chartHeightTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chartHeightTypeArr$values);
    }

    public static ChartHeightType valueOf(String str) {
        return (ChartHeightType) Enum.valueOf(ChartHeightType.class, str);
    }

    public static ChartHeightType[] values() {
        return (ChartHeightType[]) $VALUES.clone();
    }
}
