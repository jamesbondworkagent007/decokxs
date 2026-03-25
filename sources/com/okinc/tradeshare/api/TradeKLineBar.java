package com.okinc.tradeshare.api;

import androidx.compose.material3.CalendarModelKt;
import androidx.work.PeriodicWorkRequest;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class TradeKLineBar {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeKLineBar[] $VALUES;
    private final long ms;
    private final String value;
    public static final TradeKLineBar ONE_SECOND = new TradeKLineBar("ONE_SECOND", 0, "1s", 1000);
    public static final TradeKLineBar ONE_MINUTE = new TradeKLineBar("ONE_MINUTE", 1, "1m", 60000);
    public static final TradeKLineBar THREE_MINUTES = new TradeKLineBar("THREE_MINUTES", 2, "3m", 180000);
    public static final TradeKLineBar FIVE_MINUTES = new TradeKLineBar("FIVE_MINUTES", 3, "5m", 300000);
    public static final TradeKLineBar FIFTEEN_MINUTES = new TradeKLineBar("FIFTEEN_MINUTES", 4, "15m", PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
    public static final TradeKLineBar THIRTY_MINUTES = new TradeKLineBar("THIRTY_MINUTES", 5, "30m", 1800000);
    public static final TradeKLineBar ONE_HOUR = new TradeKLineBar("ONE_HOUR", 6, "1H", 3600000);
    public static final TradeKLineBar TWO_HOURS = new TradeKLineBar("TWO_HOURS", 7, "2H", 7200000);
    public static final TradeKLineBar FOUR_HOURS = new TradeKLineBar("FOUR_HOURS", 8, "4H", 14400000);
    public static final TradeKLineBar SIX_HOURS = new TradeKLineBar("SIX_HOURS", 9, "6H", 21600000);
    public static final TradeKLineBar TWELVE_HOURS = new TradeKLineBar("TWELVE_HOURS", 10, "12H", 43200000);
    public static final TradeKLineBar ONE_DAY = new TradeKLineBar("ONE_DAY", 11, "1D", CalendarModelKt.MillisecondsIn24Hours);
    public static final TradeKLineBar TWO_DAYS = new TradeKLineBar("TWO_DAYS", 12, "2D", 172800000);
    public static final TradeKLineBar THREE_DAYS = new TradeKLineBar("THREE_DAYS", 13, "3D", 259200000);
    public static final TradeKLineBar FIVE_DAYS = new TradeKLineBar("FIVE_DAYS", 14, "5D", 432000000);
    public static final TradeKLineBar ONE_WEEK = new TradeKLineBar("ONE_WEEK", 15, "1W", 604800000);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeKLineBar[] $values() {
        return new TradeKLineBar[]{ONE_SECOND, ONE_MINUTE, THREE_MINUTES, FIVE_MINUTES, FIFTEEN_MINUTES, THIRTY_MINUTES, ONE_HOUR, TWO_HOURS, FOUR_HOURS, SIX_HOURS, TWELVE_HOURS, ONE_DAY, TWO_DAYS, THREE_DAYS, FIVE_DAYS, ONE_WEEK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeKLineBar> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMs() {
        return this.ms;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private TradeKLineBar(String str, int i, String str2, long j) {
        this.value = str2;
        this.ms = j;
    }

    static {
        TradeKLineBar[] tradeKLineBarArr$values = $values();
        $VALUES = tradeKLineBarArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeKLineBarArr$values);
    }

    public static TradeKLineBar valueOf(String str) {
        return (TradeKLineBar) Enum.valueOf(TradeKLineBar.class, str);
    }

    public static TradeKLineBar[] values() {
        return (TradeKLineBar[]) $VALUES.clone();
    }
}
