package com.okinc.cruilib.view.chart.multiline.category.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CategoryMultiLineChartTimeframe {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CategoryMultiLineChartTimeframe[] $VALUES;
    public static final CategoryMultiLineChartTimeframe LAST_DAY = new CategoryMultiLineChartTimeframe("LAST_DAY", 0);
    public static final CategoryMultiLineChartTimeframe LAST_WEEK = new CategoryMultiLineChartTimeframe("LAST_WEEK", 1);
    public static final CategoryMultiLineChartTimeframe LAST_MONTH = new CategoryMultiLineChartTimeframe("LAST_MONTH", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CategoryMultiLineChartTimeframe[] $values() {
        return new CategoryMultiLineChartTimeframe[]{LAST_DAY, LAST_WEEK, LAST_MONTH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CategoryMultiLineChartTimeframe> getEntries() {
        return $ENTRIES;
    }

    private CategoryMultiLineChartTimeframe(String str, int i) {
    }

    static {
        CategoryMultiLineChartTimeframe[] categoryMultiLineChartTimeframeArr$values = $values();
        $VALUES = categoryMultiLineChartTimeframeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(categoryMultiLineChartTimeframeArr$values);
    }

    public static CategoryMultiLineChartTimeframe valueOf(String str) {
        return (CategoryMultiLineChartTimeframe) Enum.valueOf(CategoryMultiLineChartTimeframe.class, str);
    }

    public static CategoryMultiLineChartTimeframe[] values() {
        return (CategoryMultiLineChartTimeframe[]) $VALUES.clone();
    }
}
