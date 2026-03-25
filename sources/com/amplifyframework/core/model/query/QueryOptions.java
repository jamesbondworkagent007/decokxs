package com.amplifyframework.core.model.query;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class QueryOptions {
    private QueryPaginationInput paginationInput;
    private QueryPredicate queryPredicate;
    private List<QuerySortBy> sortBy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QueryPaginationInput getPaginationInput() {
        return this.paginationInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QueryPredicate getQueryPredicate() {
        return this.queryPredicate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<QuerySortBy> getSortBy() {
        return this.sortBy;
    }

    public QueryOptions(@Nullable QueryPredicate queryPredicate, @Nullable QueryPaginationInput queryPaginationInput, @Nullable List<QuerySortBy> list) {
        this.queryPredicate = queryPredicate == null ? QueryPredicates.all() : queryPredicate;
        this.paginationInput = queryPaginationInput;
        this.sortBy = list;
    }

    public QueryOptions() {
        this(null, null, null);
    }

    public QueryOptions matches(@NonNull QueryPredicate queryPredicate) {
        Objects.requireNonNull(queryPredicate);
        return new QueryOptions(queryPredicate, this.paginationInput, this.sortBy);
    }

    public QueryOptions paginated(@NonNull QueryPaginationInput queryPaginationInput) {
        QueryPredicate queryPredicate = this.queryPredicate;
        Objects.requireNonNull(queryPaginationInput);
        return new QueryOptions(queryPredicate, queryPaginationInput, this.sortBy);
    }

    public QueryOptions sorted(@NonNull QuerySortBy... querySortByArr) {
        QueryPredicate queryPredicate = this.queryPredicate;
        QueryPaginationInput queryPaginationInput = this.paginationInput;
        Objects.requireNonNull(querySortByArr);
        return new QueryOptions(queryPredicate, queryPaginationInput, Arrays.asList(querySortByArr));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryOptions)) {
            return false;
        }
        QueryOptions queryOptions = (QueryOptions) obj;
        return ObjectsCompat.equals(this.queryPredicate, queryOptions.queryPredicate) && ObjectsCompat.equals(this.paginationInput, queryOptions.paginationInput) && ObjectsCompat.equals(this.sortBy, queryOptions.sortBy);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.queryPredicate, this.paginationInput, this.sortBy);
    }

    public String toString() {
        return "QueryOptions{queryPredicate=" + this.queryPredicate + ", paginationInput=" + this.paginationInput + ", sortBy=" + this.sortBy + AbstractJsonLexerKt.END_OBJ;
    }
}
