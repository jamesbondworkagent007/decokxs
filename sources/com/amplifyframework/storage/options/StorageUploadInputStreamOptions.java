package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageUploadOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class StorageUploadInputStreamOptions extends StorageUploadOptions {
    public StorageUploadInputStreamOptions(Builder<?> builder) {
        super(builder);
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(@NonNull StorageUploadInputStreamOptions storageUploadInputStreamOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(storageUploadInputStreamOptions.getAccessLevel())).targetIdentityId(storageUploadInputStreamOptions.getTargetIdentityId())).contentType(storageUploadInputStreamOptions.getContentType())).metadata(storageUploadInputStreamOptions.getMetadata());
    }

    public static StorageUploadInputStreamOptions defaultInstance() {
        return builder().build();
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadInputStreamOptions)) {
            return false;
        }
        StorageUploadInputStreamOptions storageUploadInputStreamOptions = (StorageUploadInputStreamOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageUploadInputStreamOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageUploadInputStreamOptions.getTargetIdentityId()) && ObjectsCompat.equals(getContentType(), storageUploadInputStreamOptions.getContentType()) && ObjectsCompat.equals(getMetadata(), storageUploadInputStreamOptions.getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "StorageUploadInputStreamOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageUploadOptions.Builder<B, StorageUploadInputStreamOptions> {
        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StorageUploadInputStreamOptions build() {
            return new StorageUploadInputStreamOptions(this);
        }
    }
}
