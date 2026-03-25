package com.okinc.business.market.features.vibes.ui.chart;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class TrendPosition {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrendPosition[] $VALUES;
    public static final TrendPosition ABOVE = new TrendPosition("ABOVE", 0);
    public static final TrendPosition BELOW = new TrendPosition("BELOW", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrendPosition[] $values() {
        return new TrendPosition[]{ABOVE, BELOW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrendPosition> getEntries() {
        return $ENTRIES;
    }

    private TrendPosition(String str, int i) {
    }

    static {
        TrendPosition[] trendPositionArr$values = $values();
        $VALUES = trendPositionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trendPositionArr$values);
    }

    public static TrendPosition valueOf(String str) {
        return (TrendPosition) Enum.valueOf(TrendPosition.class, str);
    }

    public static TrendPosition[] values() {
        return (TrendPosition[]) $VALUES.clone();
    }
}
