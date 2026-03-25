package com.okinc.business.dexlogic.bean.track;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TrackTransactionDirection {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackTransactionDirection[] $VALUES;
    private final String value;
    public static final TrackTransactionDirection BUY = new TrackTransactionDirection("BUY", 0, "buy");
    public static final TrackTransactionDirection SELL = new TrackTransactionDirection("SELL", 1, "sell");
    public static final TrackTransactionDirection NA = new TrackTransactionDirection("NA", 2, "na");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackTransactionDirection[] $values() {
        return new TrackTransactionDirection[]{BUY, SELL, NA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackTransactionDirection> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TrackTransactionDirection(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TrackTransactionDirection[] trackTransactionDirectionArr$values = $values();
        $VALUES = trackTransactionDirectionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackTransactionDirectionArr$values);
    }

    public static TrackTransactionDirection valueOf(String str) {
        return (TrackTransactionDirection) Enum.valueOf(TrackTransactionDirection.class, str);
    }

    public static TrackTransactionDirection[] values() {
        return (TrackTransactionDirection[]) $VALUES.clone();
    }
}
