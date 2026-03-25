package com.reown.android.internal.utils;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class Time {
    public static final long dayInSeconds;
    public static final long fiveMinutesInSeconds;
    public static final long monthInSeconds;
    public static final long oneHourInSeconds;
    public static final long thirtySeconds;
    public static final long weekInSeconds;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getDayInSeconds() {
        return dayInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getFiveMinutesInSeconds() {
        return fiveMinutesInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getMonthInSeconds() {
        return monthInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getOneHourInSeconds() {
        return oneHourInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getThirtySeconds() {
        return thirtySeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final long getWeekInSeconds() {
        return weekInSeconds;
    }

    public static final long getCurrentTimeInSeconds() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        thirtySeconds = timeUnit.convert(30L, timeUnit);
        fiveMinutesInSeconds = timeUnit.convert(5L, TimeUnit.MINUTES);
        oneHourInSeconds = timeUnit.convert(1L, TimeUnit.HOURS);
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        dayInSeconds = timeUnit.convert(1L, timeUnit2);
        weekInSeconds = timeUnit.convert(7L, timeUnit2);
        monthInSeconds = timeUnit.convert(30L, timeUnit2);
    }
}
