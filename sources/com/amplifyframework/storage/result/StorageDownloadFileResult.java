package com.amplifyframework.storage.result;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageDownloadFileResult extends StorageTransferResult {
    private final File file;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public File getFile() {
        return this.file;
    }

    private StorageDownloadFileResult(File file) {
        this.file = file;
    }

    public static StorageDownloadFileResult fromFile(@NonNull File file) {
        Objects.requireNonNull(file);
        return new StorageDownloadFileResult(file);
    }
}
