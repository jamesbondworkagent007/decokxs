package com.amplifyframework.core.model.query;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class QueryPaginationInput {
    public static final int DEFAULT_LIMIT = 100;
    private final int limit;
    private final int page;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPage() {
        return this.page;
    }

    public QueryPaginationInput(int i, int i2) {
        this.page = i;
        this.limit = i2;
    }

    public QueryPaginationInput withLimit(@NonNull Integer num) {
        return new QueryPaginationInput(this.page, num.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryPaginationInput)) {
            return false;
        }
        QueryPaginationInput queryPaginationInput = (QueryPaginationInput) obj;
        return this.page == queryPaginationInput.page && this.limit == queryPaginationInput.limit;
    }

    public int hashCode() {
        return ObjectsCompat.hash(Integer.valueOf(this.page), Integer.valueOf(this.limit));
    }

    public String toString() {
        return "QueryPaginationInput{page=" + this.page + ", limit=" + this.limit + AbstractJsonLexerKt.END_OBJ;
    }
}
