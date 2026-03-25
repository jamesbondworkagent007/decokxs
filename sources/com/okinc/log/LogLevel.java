package com.okinc.log;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class LogLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    private int level;
    public static final LogLevel LEVEL_ALL = new LogLevel("LEVEL_ALL", 0, 0);
    public static final LogLevel LEVEL_VERBOSE = new LogLevel("LEVEL_VERBOSE", 1, 0);
    public static final LogLevel LEVEL_DEBUG = new LogLevel("LEVEL_DEBUG", 2, 1);
    public static final LogLevel LEVEL_INFO = new LogLevel("LEVEL_INFO", 3, 2);
    public static final LogLevel LEVEL_WARNING = new LogLevel("LEVEL_WARNING", 4, 3);
    public static final LogLevel LEVEL_ERROR = new LogLevel("LEVEL_ERROR", 5, 4);
    public static final LogLevel LEVEL_FATAL = new LogLevel("LEVEL_FATAL", 6, 5);
    public static final LogLevel LEVEL_NONE = new LogLevel("LEVEL_NONE", 7, 6);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{LEVEL_ALL, LEVEL_VERBOSE, LEVEL_DEBUG, LEVEL_INFO, LEVEL_WARNING, LEVEL_ERROR, LEVEL_FATAL, LEVEL_NONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LogLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLevel(int i) {
        this.level = i;
    }

    private LogLevel(String str, int i, int i2) {
        this.level = i2;
    }

    static {
        LogLevel[] logLevelArr$values = $values();
        $VALUES = logLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(logLevelArr$values);
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }
}
