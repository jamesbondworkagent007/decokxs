package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class StorageDownloadFileOptions extends StorageOptions {
    public StorageDownloadFileOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(@NonNull StorageDownloadFileOptions storageDownloadFileOptions) {
        return (Builder) ((Builder) builder().accessLevel(storageDownloadFileOptions.getAccessLevel())).targetIdentityId(storageDownloadFileOptions.getTargetIdentityId());
    }

    public static StorageDownloadFileOptions defaultInstance() {
        return builder().build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageDownloadFileOptions)) {
            return false;
        }
        StorageDownloadFileOptions storageDownloadFileOptions = (StorageDownloadFileOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageDownloadFileOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageDownloadFileOptions.getTargetIdentityId());
    }

    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId());
    }

    public String toString() {
        return "StorageDownloadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageDownloadFileOptions> {
        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StorageDownloadFileOptions build() {
            return new StorageDownloadFileOptions(this);
        }
    }
}
