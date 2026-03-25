package com.amplifyframework.storage.result;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class StorageUploadResult extends StorageTransferResult {
    private final String key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getKey() {
        return this.key;
    }

    public StorageUploadResult(String str) {
        this.key = str;
    }

    public static StorageUploadResult fromKey(@NonNull String str) {
        Objects.requireNonNull(str);
        return new StorageUploadResult(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(this.key, ((StorageUploadResult) obj).key);
    }

    public int hashCode() {
        String str = this.key;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
