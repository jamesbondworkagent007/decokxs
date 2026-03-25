package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface ILogger {
    void log(@NonNull String str, @Nullable Throwable th);
}
