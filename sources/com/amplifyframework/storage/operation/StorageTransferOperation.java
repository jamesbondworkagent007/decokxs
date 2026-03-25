package com.amplifyframework.storage.operation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.async.AmplifyOperation;
import com.amplifyframework.core.async.Cancelable;
import com.amplifyframework.core.async.Resumable;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.TransferState;
import com.amplifyframework.storage.result.StorageTransferProgress;
import com.amplifyframework.storage.result.StorageTransferResult;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StorageTransferOperation<R, T extends StorageTransferResult> extends AmplifyOperation<R> implements Resumable, Cancelable {
    private StorageException error;
    private Consumer<StorageException> internalOnError;
    private Consumer<StorageTransferProgress> onProgress;
    private Consumer<T> onSuccess;
    private final String transferId;
    private TransferState transferState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void clearAllListeners() {
        this.onProgress = null;
        this.onSuccess = null;
        this.internalOnError = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StorageException getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Consumer<StorageException> getOnError() {
        return this.internalOnError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Consumer<StorageTransferProgress> getOnProgress() {
        return this.onProgress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Consumer<T> getOnSuccess() {
        return this.onSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getTransferId() {
        return this.transferId;
    }

    public abstract TransferState getTransferState();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setError(@NonNull StorageException storageException) {
        this.error = storageException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnProgress(@Nullable Consumer<StorageTransferProgress> consumer) {
        this.onProgress = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setOnSuccess(@Nullable Consumer<T> consumer) {
        this.onSuccess = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTransferState(@NonNull TransferState transferState) {
        this.transferState = transferState;
    }

    public StorageTransferOperation(@Nullable R r, @NonNull String str, @Nullable Consumer<StorageTransferProgress> consumer, @Nullable Consumer<T> consumer2, @Nullable Consumer<StorageException> consumer3) {
        super(CategoryType.STORAGE, r);
        this.transferId = str;
        this.onProgress = consumer;
        this.onSuccess = consumer2;
        this.internalOnError = new InternalOnError(consumer3);
    }

    public void setOnError(@Nullable Consumer<StorageException> consumer) {
        if (consumer == null) {
            this.internalOnError = null;
            return;
        }
        this.internalOnError = new InternalOnError(consumer);
        if (getTransferState() == TransferState.FAILED) {
            if (this.error == null) {
                this.error = new StorageException("Something went wrong with your AWS S3 Storage transfer operation", new UnknownError("Reason unknown"), "Please re-queue the operation");
            }
            this.internalOnError.accept(this.error);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public class InternalOnError implements Consumer<StorageException> {
        private Consumer<StorageException> onError;

        public InternalOnError(Consumer<StorageException> consumer) {
            this.onError = consumer;
        }

        /* JADX DEBUG: Method merged with bridge method: accept(Ljava/lang/Object;)V */
        @Override // com.amplifyframework.core.Consumer
        public void accept(@NonNull StorageException storageException) {
            StorageTransferOperation.this.setError(storageException);
            Consumer<StorageException> consumer = this.onError;
            if (consumer != null) {
                consumer.accept(storageException);
            }
        }
    }
}
