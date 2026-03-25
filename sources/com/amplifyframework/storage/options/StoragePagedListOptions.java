package com.amplifyframework.storage.options;

import com.amplifyframework.storage.options.StorageOptions;

/* JADX INFO: loaded from: classes14.dex */
public class StoragePagedListOptions extends StorageOptions {
    private String nextToken;
    private int pageSize;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getNextToken() {
        return this.nextToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPageSize() {
        return this.pageSize;
    }

    public StoragePagedListOptions(Builder<?> builder) {
        super(builder.getAccessLevel(), builder.getTargetIdentityId());
        this.pageSize = ((Builder) builder).pageSize;
        this.nextToken = ((Builder) builder).nextToken;
    }

    public static Builder<?> builder() {
        return new Builder<>();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static class Builder<B extends Builder<B>> extends StorageOptions.Builder<B, StoragePagedListOptions> {
        private String nextToken;
        private int pageSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public B setNextToken(String str) {
            this.nextToken = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public B setPageSize(int i) {
            this.pageSize = i;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/storage/options/StorageOptions; */
        @Override // com.amplifyframework.storage.options.StorageOptions.Builder
        public StoragePagedListOptions build() {
            return new StoragePagedListOptions(this);
        }
    }
}
