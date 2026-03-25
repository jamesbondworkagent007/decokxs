package com.amplifyframework.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class JavaLogger implements Logger {
    private static boolean isEnabled = true;
    private final String namespace;
    private final LogLevel threshold;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setIsEnabled(boolean z) {
        isEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.logging.Logger
    public String getNamespace() {
        return this.namespace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.logging.Logger
    public LogLevel getThresholdLevel() {
        return this.threshold;
    }

    public JavaLogger(@NonNull String str, @NonNull LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.threshold = logLevel;
        Objects.requireNonNull(str);
        this.namespace = str;
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str) {
        LogLevel logLevel = LogLevel.ERROR;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str, @Nullable Throwable th) {
        LogLevel logLevel = LogLevel.ERROR;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str) {
        LogLevel logLevel = LogLevel.WARN;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str, @Nullable Throwable th) {
        LogLevel logLevel = LogLevel.WARN;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th);
    }

    @Override // com.amplifyframework.logging.Logger
    public void info(@Nullable String str) {
        LogLevel logLevel = LogLevel.INFO;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void debug(@Nullable String str) {
        LogLevel logLevel = LogLevel.DEBUG;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void verbose(@Nullable String str) {
        LogLevel logLevel = LogLevel.VERBOSE;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    private void log(@NonNull LogLevel logLevel, @Nullable String str) {
        log(logLevel, str, null);
    }

    private void log(@NonNull LogLevel logLevel, @Nullable String str, @Nullable Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(logLevel);
        sb.append("/");
        sb.append(this.namespace);
        sb.append(": ");
        sb.append(str);
        if (th != null) {
            sb.append("\n");
            sb.append(th);
        }
        System.out.println(sb.toString());
    }

    private boolean shouldNotLogMessage(LogLevel logLevel) {
        return !isEnabled || this.threshold.above(logLevel);
    }
}
