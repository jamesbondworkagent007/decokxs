package com.amplifyframework.logging;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class LoggingEventName {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LoggingEventName[] $VALUES;
    public static final LoggingEventName WRITE_LOG_FAILURE = new LoggingEventName("WRITE_LOG_FAILURE", 0, "writeLogFailure");
    public static final LoggingEventName FLUSH_LOG_FAILURE = new LoggingEventName("FLUSH_LOG_FAILURE", 1, "flushLogFailure");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LoggingEventName[] $values() {
        return new LoggingEventName[]{WRITE_LOG_FAILURE, FLUSH_LOG_FAILURE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LoggingEventName> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LoggingEventName valueOf(String str) {
        return (LoggingEventName) Enum.valueOf(LoggingEventName.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LoggingEventName[] values() {
        return (LoggingEventName[]) $VALUES.clone();
    }

    private LoggingEventName(String str, int i, String str2) {
    }

    static {
        LoggingEventName[] loggingEventNameArr$values = $values();
        $VALUES = loggingEventNameArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(loggingEventNameArr$values);
    }
}
