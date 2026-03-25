package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public class StorageGetUrlOptions extends StorageOptions {
    private final int expires;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getExpires() {
        return this.expires;
    }

    public StorageGetUrlOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
        this.expires = builder.getExpires();
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: B */
    /* JADX WARN: Multi-variable type inference failed */
    public static Builder<?> from(@NonNull StorageGetUrlOptions storageGetUrlOptions) {
        return ((Builder) ((Builder) builder().accessLevel(storageGetUrlOptions.getAccessLevel())).targetIdentityId(storageGetUrlOptions.getTargetIdentityId())).expires(storageGetUrlOptions.getExpires());
    }

    public static StorageGetUrlOptions defaultInstance() {
        return builder().build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageGetUrlOptions)) {
            return false;
        }
        StorageGetUrlOptions storageGetUrlOptions = (StorageGetUrlOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageGetUrlOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageGetUrlOptions.getTargetIdentityId()) && ObjectsCompat.equals(Integer.valueOf(getExpires()), Integer.valueOf(storageGetUrlOptions.getExpires()));
    }

    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId(), Integer.valueOf(getExpires()));
    }

    public String toString() {
        return "StorageGetUrlOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", expires=" + getExpires() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StorageGetUrlOptions> {
        private int expires;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B expires(int i) {
            this.expires = i;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getExpires() {
            return this.expires;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StorageGetUrlOptions build() {
            return new StorageGetUrlOptions(this);
        }
    }
}
