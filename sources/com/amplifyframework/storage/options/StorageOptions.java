package com.amplifyframework.storage.options;

import androidx.annotation.Nullable;
import com.amplifyframework.storage.StorageAccessLevel;

/* JADX INFO: loaded from: classes14.dex */
abstract class StorageOptions {
    private final StorageAccessLevel accessLevel;
    private final String targetIdentityId;

    /* JADX INFO: loaded from: classes21.dex */
    public static abstract class Builder<B extends Builder, O extends StorageOptions> {
        private StorageAccessLevel accessLevel;
        private String targetIdentityId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B accessLevel(@Nullable StorageAccessLevel storageAccessLevel) {
            this.accessLevel = storageAccessLevel;
            return this;
        }

        public abstract O build();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageAccessLevel getAccessLevel() {
            return this.accessLevel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTargetIdentityId() {
            return this.targetIdentityId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B targetIdentityId(@Nullable String str) {
            this.targetIdentityId = str;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetIdentityId() {
        return this.targetIdentityId;
    }

    public StorageOptions(StorageAccessLevel storageAccessLevel, String str) {
        this.accessLevel = storageAccessLevel;
        this.targetIdentityId = str;
    }
}
