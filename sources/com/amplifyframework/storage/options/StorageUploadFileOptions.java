package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageUploadOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class StorageUploadFileOptions extends StorageUploadOptions {
    public StorageUploadFileOptions(Builder<?> builder) {
        super(builder);
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: B */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(@NonNull StorageUploadFileOptions storageUploadFileOptions) {
        return (Builder) ((Builder) ((Builder) ((Builder) builder().accessLevel(storageUploadFileOptions.getAccessLevel())).targetIdentityId(storageUploadFileOptions.getTargetIdentityId())).contentType(storageUploadFileOptions.getContentType())).metadata(storageUploadFileOptions.getMetadata());
    }

    public static StorageUploadFileOptions defaultInstance() {
        return builder().build();
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadFileOptions)) {
            return false;
        }
        StorageUploadFileOptions storageUploadFileOptions = (StorageUploadFileOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageUploadFileOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageUploadFileOptions.getTargetIdentityId()) && ObjectsCompat.equals(getContentType(), storageUploadFileOptions.getContentType()) && ObjectsCompat.equals(getMetadata(), storageUploadFileOptions.getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata());
    }

    @Override // com.amplifyframework.storage.options.StorageUploadOptions
    public String toString() {
        return "StorageUploadFileOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageUploadOptions.Builder<B, StorageUploadFileOptions> {
        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StorageUploadFileOptions build() {
            return new StorageUploadFileOptions(this);
        }
    }
}
