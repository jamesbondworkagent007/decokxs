package o;

import com.okinc.planet.biz_plugin.ChartTimeframeConfig;
import com.okinc.tradeshare.api.TradeKLineBar;

/* JADX INFO: loaded from: classes16.dex */
public final class tBO {
    public static final tBO copydefault = new tBO();

    private tBO() {
    }

    public static /* synthetic */ ChartTimeframeConfig calculateSpotChartConfig$default(tBO tbo, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = java.lang.System.currentTimeMillis();
        }
        return tbo.copydefault(j, j2);
    }

    public final ChartTimeframeConfig copydefault(long j, long j2) {
        long j3 = j2 - j;
        double d = j3;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        double millis = d / timeUnit.toMillis(1L);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
        double millis2 = d / timeUnit2.toMillis(1L);
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        if (j3 <= timeUnit3.toMillis(5L)) {
            return new ChartTimeframeConfig("<=5m", "Past 1 minute", TradeKLineBar.ONE_SECOND, 60, java.lang.Math.max(j, j2 - timeUnit3.toMillis(1L)), j2);
        }
        if (j3 <= timeUnit.toMillis(1L)) {
            return new ChartTimeframeConfig(">5m-1h", "Past 1 hour", TradeKLineBar.ONE_MINUTE, 60, j, j2);
        }
        if (millis <= 3.0d) {
            return new ChartTimeframeConfig(">1h-3h", "Past 3 hours", TradeKLineBar.THREE_MINUTES, 60, j, j2);
        }
        if (millis <= 8.0d) {
            return new ChartTimeframeConfig(">3h-8h", "Past 8 hours", TradeKLineBar.FIVE_MINUTES, 96, j, j2);
        }
        if (millis <= 18.0d) {
            return new ChartTimeframeConfig(">8h-18h", "Past 18 hours", TradeKLineBar.FIFTEEN_MINUTES, 72, j, j2);
        }
        if (millis <= 24.0d) {
            return new ChartTimeframeConfig(">18h-24h", "Past 24 hours", TradeKLineBar.THIRTY_MINUTES, 48, j, j2);
        }
        if (millis2 <= 3.0d) {
            return new ChartTimeframeConfig(">1-3 days", "Past 3 Days", TradeKLineBar.ONE_HOUR, 72, j, j2);
        }
        if (millis2 <= 7.0d) {
            return new ChartTimeframeConfig(">3-7 days", "Past 7 Days", TradeKLineBar.TWO_HOURS, 84, j, j2);
        }
        if (millis2 <= 14.0d) {
            return new ChartTimeframeConfig(">7-14 days", "Past 14 Days", TradeKLineBar.FOUR_HOURS, 84, j, j2);
        }
        return new ChartTimeframeConfig(">14 days", "Past 30 Days", TradeKLineBar.ONE_DAY, 30, java.lang.Math.max(j, j2 - timeUnit2.toMillis(180L)), j2);
    }

    public static /* synthetic */ ChartTimeframeConfig calculateFutureChartConfig$default(tBO tbo, long j, long j2, long j3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            j3 = java.lang.System.currentTimeMillis();
        }
        return tbo.OLrzqt(j, j2, j3);
    }

    public final ChartTimeframeConfig OLrzqt(long j, long j2, long j3) {
        long j4 = j3 - j;
        double d = j4;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.HOURS;
        double millis = d / timeUnit.toMillis(1L);
        double millis2 = (j3 - j2) / timeUnit.toMillis(1L);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.DAYS;
        double millis3 = d / timeUnit2.toMillis(1L);
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.MINUTES;
        if (j4 <= timeUnit3.toMillis(5L)) {
            if (millis2 < 1.0d) {
                return new ChartTimeframeConfig("<=5m", "Past 1 minute", TradeKLineBar.ONE_SECOND, 60, java.lang.Math.max(j, j3 - timeUnit3.toMillis(1L)), j3);
            }
            return new ChartTimeframeConfig("<=5m", "Past 1 hour", TradeKLineBar.ONE_MINUTE, 60, java.lang.Math.max(j, j3 - timeUnit3.toMillis(1L)), j3);
        }
        if (j4 <= timeUnit.toMillis(1L)) {
            return new ChartTimeframeConfig(">5m-1h", "Past 1 hour", TradeKLineBar.ONE_MINUTE, 60, j, j3);
        }
        if (millis <= 3.0d) {
            return new ChartTimeframeConfig(">1h-3h", "Past 3 hours", TradeKLineBar.THREE_MINUTES, 60, j, j3);
        }
        if (millis <= 8.0d) {
            return new ChartTimeframeConfig(">3h-8h", "Past 8 hours", TradeKLineBar.FIVE_MINUTES, 96, j, j3);
        }
        if (millis <= 18.0d) {
            return new ChartTimeframeConfig(">8h-18h", "Past 18 hours", TradeKLineBar.FIFTEEN_MINUTES, 72, j, j3);
        }
        if (millis <= 24.0d) {
            return new ChartTimeframeConfig(">18h-24h", "Past 24 hours", TradeKLineBar.THIRTY_MINUTES, 48, j, j3);
        }
        if (millis3 <= 3.0d) {
            return new ChartTimeframeConfig(">1-3 days", "Past 3 Days", TradeKLineBar.ONE_HOUR, 72, j, j3);
        }
        if (millis3 <= 7.0d) {
            return new ChartTimeframeConfig(">3-7 days", "Past 7 Days", TradeKLineBar.TWO_HOURS, 84, j, j3);
        }
        if (millis3 <= 14.0d) {
            return new ChartTimeframeConfig(">7-14 days", "Past 14 Days", TradeKLineBar.FOUR_HOURS, 84, j, j3);
        }
        if (millis3 <= 30.0d) {
            return new ChartTimeframeConfig(">14-30 days", "Past 30 Days", TradeKLineBar.SIX_HOURS, 120, j, j3);
        }
        if (millis3 <= 90.0d) {
            return new ChartTimeframeConfig(">30-90 days", "Past 90 Days", TradeKLineBar.ONE_DAY, 90, j, j3);
        }
        return new ChartTimeframeConfig(">90 days", "Past 180 Days", TradeKLineBar.TWO_DAYS, 90, java.lang.Math.max(j, j3 - timeUnit2.toMillis(180L)), j3);
    }

    public static /* synthetic */ ChartTimeframeConfig calculateChartConfigFromSeconds$default(tBO tbo, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = java.lang.System.currentTimeMillis() / ((long) 1000);
        }
        return tbo.EZpvd(j, j2);
    }

    public final ChartTimeframeConfig EZpvd(long j, long j2) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        return OLrzqt(timeUnit.toMillis(j), timeUnit.toMillis(j2), timeUnit.toMillis(j2));
    }
}
