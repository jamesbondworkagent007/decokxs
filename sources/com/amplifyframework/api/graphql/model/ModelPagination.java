package com.amplifyframework.api.graphql.model;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelPagination {
    private static final int DEFAULT_LIMIT = 1000;
    private int limit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModelPagination withLimit(int i) {
        this.limit = i;
        return this;
    }

    private ModelPagination(int i) {
        this.limit = i;
    }

    public static ModelPagination firstPage() {
        return limit(1000);
    }

    public static ModelPagination limit(@Nullable int i) {
        return new ModelPagination(i);
    }
}
