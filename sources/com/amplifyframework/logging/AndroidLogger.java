package com.amplifyframework.logging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class AndroidLogger implements Logger {
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

    public AndroidLogger(@NonNull String str, @NonNull LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.threshold = logLevel;
        Objects.requireNonNull(str);
        this.namespace = str;
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str) {
        shouldNotLogMessage(LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str, @Nullable Throwable th) {
        shouldNotLogMessage(LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str) {
        shouldNotLogMessage(LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str, @Nullable Throwable th) {
        shouldNotLogMessage(LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void info(@Nullable String str) {
        shouldNotLogMessage(LogLevel.INFO);
    }

    @Override // com.amplifyframework.logging.Logger
    public void debug(@Nullable String str) {
        shouldNotLogMessage(LogLevel.DEBUG);
    }

    @Override // com.amplifyframework.logging.Logger
    public void verbose(@Nullable String str) {
        shouldNotLogMessage(LogLevel.VERBOSE);
    }

    private boolean shouldNotLogMessage(LogLevel logLevel) {
        return !isEnabled || this.threshold.above(logLevel);
    }
}
