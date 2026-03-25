package com.okinc.business.market.features.vibes.domain;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesTimeRange {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VibesTimeRange[] $VALUES;
    public static final VibesTimeRange TIME_24H;
    public static final VibesTimeRange TIME_30D;
    public static final VibesTimeRange TIME_3D;
    public static final VibesTimeRange TIME_7D;
    private final long discoverDuration;
    private final VibesTimeUnit discoverUnit;
    private final String trackKey;
    private final int value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VibesTimeRange[] $values() {
        return new VibesTimeRange[]{TIME_24H, TIME_3D, TIME_7D, TIME_30D};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VibesTimeRange> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDiscoverDuration() {
        return this.discoverDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesTimeUnit getDiscoverUnit() {
        return this.discoverUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackKey() {
        return this.trackKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private VibesTimeRange(String str, int i, int i2, String str2, long j, VibesTimeUnit vibesTimeUnit) {
        this.value = i2;
        this.trackKey = str2;
        this.discoverDuration = j;
        this.discoverUnit = vibesTimeUnit;
    }

    static {
        VibesTimeUnit vibesTimeUnit = VibesTimeUnit.D;
        TIME_24H = new VibesTimeRange("TIME_24H", 0, 1, "h24", 1L, vibesTimeUnit);
        TIME_3D = new VibesTimeRange("TIME_3D", 1, 2, "d3", 3L, vibesTimeUnit);
        TIME_7D = new VibesTimeRange("TIME_7D", 2, 3, "d7", 7L, vibesTimeUnit);
        TIME_30D = new VibesTimeRange("TIME_30D", 3, 4, "d30", 30L, vibesTimeUnit);
        VibesTimeRange[] vibesTimeRangeArr$values = $values();
        $VALUES = vibesTimeRangeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vibesTimeRangeArr$values);
    }

    public static VibesTimeRange valueOf(String str) {
        return (VibesTimeRange) Enum.valueOf(VibesTimeRange.class, str);
    }

    public static VibesTimeRange[] values() {
        return (VibesTimeRange[]) $VALUES.clone();
    }
}
