package aws.smithy.kotlin.runtime.telemetry.logging;

import com.google.common.net.HttpHeaders;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class LogLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel Error = new LogLevel("Error", 0);
    public static final LogLevel Warning = new LogLevel(HttpHeaders.WARNING, 1);
    public static final LogLevel Info = new LogLevel("Info", 2);
    public static final LogLevel Debug = new LogLevel("Debug", 3);
    public static final LogLevel Trace = new LogLevel("Trace", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ LogLevel[] $values() {
        return new LogLevel[]{Error, Warning, Info, Debug, Trace};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<LogLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    private LogLevel(String str, int i) {
    }

    static {
        LogLevel[] logLevelArr$values = $values();
        $VALUES = logLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(logLevelArr$values);
    }
}
