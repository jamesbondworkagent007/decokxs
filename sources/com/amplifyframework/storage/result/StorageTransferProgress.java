package com.amplifyframework.storage.result;

import androidx.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class StorageTransferProgress {
    private final long currentBytes;
    private final long totalBytes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getCurrentBytes() {
        return this.currentBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getFractionCompleted() {
        return this.currentBytes / this.totalBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getTotalBytes() {
        return this.totalBytes;
    }

    public StorageTransferProgress(long j, long j2) {
        this.currentBytes = j;
        this.totalBytes = j2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StorageTransferProgress.class != obj.getClass()) {
            return false;
        }
        StorageTransferProgress storageTransferProgress = (StorageTransferProgress) obj;
        return getCurrentBytes() == storageTransferProgress.getCurrentBytes() && getTotalBytes() == storageTransferProgress.getTotalBytes();
    }

    public int hashCode() {
        return (((int) (getCurrentBytes() ^ (getCurrentBytes() >>> 32))) * 31) + ((int) (getTotalBytes() ^ (getTotalBytes() >>> 32)));
    }

    public String toString() {
        return "StorageTransferProgress{currentBytes=" + getCurrentBytes() + ", totalBytes=" + getTotalBytes() + ", fractionCompleted=" + getFractionCompleted() + AbstractJsonLexerKt.END_OBJ;
    }
}
