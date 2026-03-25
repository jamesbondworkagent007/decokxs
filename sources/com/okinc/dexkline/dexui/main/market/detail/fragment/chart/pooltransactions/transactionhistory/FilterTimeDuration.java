package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.transactionhistory;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class FilterTimeDuration {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FilterTimeDuration[] $VALUES;
    private final String value;
    public static final FilterTimeDuration ONE_HOUR_SELECTION = new FilterTimeDuration("ONE_HOUR_SELECTION", 0, "1");
    public static final FilterTimeDuration FOUR_HOUR_SELECTION = new FilterTimeDuration("FOUR_HOUR_SELECTION", 1, "2");
    public static final FilterTimeDuration TWENTY_FOUR_HOURS_SELECTION = new FilterTimeDuration("TWENTY_FOUR_HOURS_SELECTION", 2, "3");
    public static final FilterTimeDuration FIVE_MIN_CHANGE = new FilterTimeDuration("FIVE_MIN_CHANGE", 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FilterTimeDuration[] $values() {
        return new FilterTimeDuration[]{ONE_HOUR_SELECTION, FOUR_HOUR_SELECTION, TWENTY_FOUR_HOURS_SELECTION, FIVE_MIN_CHANGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FilterTimeDuration> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private FilterTimeDuration(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        FilterTimeDuration[] filterTimeDurationArr$values = $values();
        $VALUES = filterTimeDurationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(filterTimeDurationArr$values);
    }

    public static FilterTimeDuration valueOf(String str) {
        return (FilterTimeDuration) Enum.valueOf(FilterTimeDuration.class, str);
    }

    public static FilterTimeDuration[] values() {
        return (FilterTimeDuration[]) $VALUES.clone();
    }
}
