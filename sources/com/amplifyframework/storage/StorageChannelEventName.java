package com.amplifyframework.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public enum StorageChannelEventName {
    UPLOAD_ERROR("upload_error"),
    UPLOAD_STATE("upload_state"),
    DOWNLOAD_ERROR("download_error"),
    DOWNLOAD_STATE("download_state");

    private final String hubEventName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.hubEventName;
    }

    StorageChannelEventName(@NonNull String str) {
        Objects.requireNonNull(str);
        this.hubEventName = str;
    }

    public static StorageChannelEventName fromString(@Nullable String str) {
        for (StorageChannelEventName storageChannelEventName : values()) {
            if (storageChannelEventName.toString().equals(str)) {
                return storageChannelEventName;
            }
        }
        throw new IllegalArgumentException("Storage category does not publish any Hub event with name = " + str);
    }
}
