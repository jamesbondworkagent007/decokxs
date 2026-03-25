package com.amplifyframework.logging;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface Logger {
    void debug(@Nullable String str);

    void error(@Nullable String str);

    void error(@Nullable String str, @Nullable Throwable th);

    String getNamespace();

    LogLevel getThresholdLevel();

    void info(@Nullable String str);

    void verbose(@Nullable String str);

    void warn(@Nullable String str);

    void warn(@Nullable String str, @Nullable Throwable th);
}
