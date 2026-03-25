package com.amplitude.common;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Logger {
    void AEQbTJ(@NotNull String str);

    void EZpvd(@NotNull String str);

    void KWHzl(@NotNull String str);

    void OLrzqt(@NotNull String str);

    public enum LogMode {
        DEBUG(1),
        INFO(2),
        WARN(3),
        ERROR(4),
        OFF(5);

        LogMode(int i) {
        }
    }
}
