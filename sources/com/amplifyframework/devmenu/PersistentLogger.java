package com.amplifyframework.devmenu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.logging.LogLevel;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Immutable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class PersistentLogger implements Logger {
    private static final int MAX_NUM_LOGS = 500;
    private static boolean isEnabled = true;
    private final List<LogEntry> logs;
    private final String namespace;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void setIsEnabled(boolean z) {
        isEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.logging.Logger
    public String getNamespace() {
        return this.namespace;
    }

    public PersistentLogger(@NonNull String str) {
        Objects.requireNonNull(str);
        this.namespace = str;
        this.logs = new LinkedList();
    }

    @Override // com.amplifyframework.logging.Logger
    public LogLevel getThresholdLevel() {
        return LogLevel.VERBOSE;
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str) {
        addToLogs(str, null, LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(@Nullable String str, @Nullable Throwable th) {
        addToLogs(str, th, LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str) {
        addToLogs(str, null, LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(@Nullable String str, @Nullable Throwable th) {
        addToLogs(str, th, LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void info(@Nullable String str) {
        addToLogs(str, null, LogLevel.INFO);
    }

    @Override // com.amplifyframework.logging.Logger
    public void debug(@Nullable String str) {
        addToLogs(str, null, LogLevel.DEBUG);
    }

    @Override // com.amplifyframework.logging.Logger
    public void verbose(@Nullable String str) {
        addToLogs(str, null, LogLevel.VERBOSE);
    }

    public List<LogEntry> getLogs() {
        return Immutable.of(this.logs);
    }

    private void addToLogs(String str, Throwable th, LogLevel logLevel) {
        if (isEnabled) {
            if (this.logs.size() == 500) {
                this.logs.remove(0);
            }
            this.logs.add(new LogEntry(new Date(), this.namespace, str, th, logLevel));
        }
    }
}
