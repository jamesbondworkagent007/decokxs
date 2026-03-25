package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class StorageRemoveOptions extends StorageOptions {
    public StorageRemoveOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(@NonNull StorageRemoveOptions storageRemoveOptions) {
        return (Builder) ((Builder) builder().accessLevel(storageRemoveOptions.getAccessLevel())).targetIdentityId(storageRemoveOptions.getTargetIdentityId());
    }

    public static StorageRemoveOptions defaultInstance() {
        return builder().build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageRemoveOptions)) {
            return false;
        }
        StorageRemoveOptions storageRemoveOptions = (StorageRemoveOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageRemoveOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageRemoveOptions.getTargetIdentityId());
    }

    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId());
    }

    public String toString() {
        return "StorageRemoveOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageRemoveOptions> {
        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StorageRemoveOptions build() {
            return new StorageRemoveOptions(this);
        }
    }
}
