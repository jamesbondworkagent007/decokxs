package com.amplifyframework.storage.operation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import java.util.UUID;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StorageUploadFileOperation<R> extends StorageUploadOperation<R, StorageUploadFileResult> {
    public StorageUploadFileOperation(@Nullable R r) {
        this(r, UUID.randomUUID().toString(), null, null, null);
    }

    public StorageUploadFileOperation(@Nullable R r, @NonNull String str, @Nullable Consumer<StorageTransferProgress> consumer, @Nullable Consumer<StorageUploadFileResult> consumer2, @Nullable Consumer<StorageException> consumer3) {
        super(r, str, consumer, consumer2, consumer3);
    }

    @Override // com.amplifyframework.storage.operation.StorageUploadOperation, com.amplifyframework.storage.operation.StorageTransferOperation
    public void setOnSuccess(@Nullable Consumer<StorageUploadFileResult> consumer) {
        super.setOnSuccess(consumer);
    }
}
