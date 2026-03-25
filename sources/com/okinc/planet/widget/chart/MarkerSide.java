package com.okinc.planet.widget.chart;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MarkerSide {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MarkerSide[] $VALUES;
    public static final MarkerSide BUY = new MarkerSide("BUY", 0);
    public static final MarkerSide SELL = new MarkerSide("SELL", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MarkerSide[] $values() {
        return new MarkerSide[]{BUY, SELL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MarkerSide> getEntries() {
        return $ENTRIES;
    }

    private MarkerSide(String str, int i) {
    }

    static {
        MarkerSide[] markerSideArr$values = $values();
        $VALUES = markerSideArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(markerSideArr$values);
    }

    public static MarkerSide valueOf(String str) {
        return (MarkerSide) Enum.valueOf(MarkerSide.class, str);
    }

    public static MarkerSide[] values() {
        return (MarkerSide[]) $VALUES.clone();
    }
}
