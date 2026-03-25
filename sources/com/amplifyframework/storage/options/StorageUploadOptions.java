package com.amplifyframework.storage.options;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.storage.options.StorageOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class StorageUploadOptions extends StorageOptions {
    private final String contentType;
    private final Map<String, String> metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContentType() {
        return this.contentType;
    }

    public <B extends Builder<B, O>, O extends StorageUploadOptions> StorageUploadOptions(Builder<B, O> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
        this.contentType = builder.getContentType();
        this.metadata = builder.getMetadata();
    }

    public Map<String, String> getMetadata() {
        return Immutable.of(this.metadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageUploadOptions)) {
            return false;
        }
        StorageUploadOptions storageUploadOptions = (StorageUploadOptions) obj;
        return ObjectsCompat.equals(getAccessLevel(), storageUploadOptions.getAccessLevel()) && ObjectsCompat.equals(getTargetIdentityId(), storageUploadOptions.getTargetIdentityId()) && ObjectsCompat.equals(getContentType(), storageUploadOptions.getContentType()) && ObjectsCompat.equals(getMetadata(), storageUploadOptions.getMetadata());
    }

    public int hashCode() {
        return ObjectsCompat.hash(getAccessLevel(), getTargetIdentityId(), getContentType(), getMetadata());
    }

    public String toString() {
        return "StorageUploadOptions {accessLevel=" + getAccessLevel() + ", targetIdentityId=" + getTargetIdentityId() + ", contentType=" + getContentType() + ", metadata=" + getMetadata() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<B extends Builder<B, O>, O extends StorageOptions> extends StorageOptions.Builder<B, O> {
        private String contentType;
        private Map<String, String> metadata = new HashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B contentType(@Nullable String str) {
            this.contentType = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getContentType() {
            return this.contentType;
        }

        public final B metadata(@NonNull Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata = new HashMap(map);
            return this;
        }

        public final Map<String, String> getMetadata() {
            return Immutable.of(this.metadata);
        }
    }
}
