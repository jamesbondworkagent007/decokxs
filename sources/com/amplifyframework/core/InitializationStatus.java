package com.amplifyframework.core;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public enum InitializationStatus {
    SUCCEEDED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }

    public static InitializationStatus fromString(@Nullable String str) {
        for (InitializationStatus initializationStatus : values()) {
            if (initializationStatus.toString().equals(str)) {
                return initializationStatus;
            }
        }
        throw new IllegalArgumentException("Unknown status = " + str);
    }
}
