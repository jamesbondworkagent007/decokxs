package com.amplifyframework.storage.operation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.result.StorageDownloadFileResult;
import com.amplifyframework.storage.result.StorageTransferProgress;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StorageDownloadFileOperation<R> extends StorageTransferOperation<R, StorageDownloadFileResult> {
    public StorageDownloadFileOperation(@Nullable R r) {
        this(r, UUID.randomUUID().toString(), null, null, null);
    }

    public StorageDownloadFileOperation(@Nullable R r, @NonNull String str, @Nullable Consumer<StorageTransferProgress> consumer, @Nullable Consumer<StorageDownloadFileResult> consumer2, @Nullable Consumer<StorageException> consumer3) {
        super(r, str, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(@Nullable Consumer<StorageDownloadFileResult> consumer) {
        super.setOnSuccess(consumer);
    }

    @Override // com.amplifyframework.core.async.AmplifyOperation
    public R getRequest() {
        return (R) super.getRequest();
    }
}
