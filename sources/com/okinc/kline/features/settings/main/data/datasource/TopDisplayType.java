package com.okinc.kline.features.settings.main.data.datasource;

import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.oSK;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class TopDisplayType implements oSK {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TopDisplayType[] $VALUES;
    public static final TopDisplayType Landscape = new TopDisplayType("Landscape", 0);
    public static final TopDisplayType Indicators = new TopDisplayType("Indicators", 1);
    public static final TopDisplayType Drawing = new TopDisplayType("Drawing", 2);
    public static final TopDisplayType Formula = new TopDisplayType("Formula", 3);
    public static final TopDisplayType Compare = new TopDisplayType("Compare", 4);
    public static final TopDisplayType Date = new TopDisplayType("Date", 5);
    public static final TopDisplayType Tutorial = new TopDisplayType("Tutorial", 6);
    public static final TopDisplayType Settings = new TopDisplayType("Settings", 7);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TopDisplayType[] $values() {
        return new TopDisplayType[]{Landscape, Indicators, Drawing, Formula, Compare, Date, Tutorial, Settings};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TopDisplayType> getEntries() {
        return $ENTRIES;
    }

    private TopDisplayType(String str, int i) {
    }

    static {
        TopDisplayType[] topDisplayTypeArr$values = $values();
        $VALUES = topDisplayTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(topDisplayTypeArr$values);
    }

    public static TopDisplayType valueOf(String str) {
        return (TopDisplayType) Enum.valueOf(TopDisplayType.class, str);
    }

    public static TopDisplayType[] values() {
        return (TopDisplayType[]) $VALUES.clone();
    }
}
