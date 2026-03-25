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
public final class ObserveQueryOptions {
    private final QueryPredicate queryPredicate;
    private final List<QuerySortBy> sortBy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QueryPredicate getQueryPredicate() {
        return this.queryPredicate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<QuerySortBy> getSortBy() {
        return this.sortBy;
    }

    public ObserveQueryOptions(@Nullable QueryPredicate queryPredicate, @Nullable List<QuerySortBy> list) {
        this.queryPredicate = queryPredicate == null ? QueryPredicates.all() : queryPredicate;
        this.sortBy = list;
    }

    public ObserveQueryOptions() {
        this(null, null);
    }

    public ObserveQueryOptions matches(@NonNull QueryPredicate queryPredicate) {
        Objects.requireNonNull(queryPredicate);
        return new ObserveQueryOptions(queryPredicate, this.sortBy);
    }

    public ObserveQueryOptions sorted(@NonNull QuerySortBy... querySortByArr) {
        QueryPredicate queryPredicate = this.queryPredicate;
        Objects.requireNonNull(querySortByArr);
        return new ObserveQueryOptions(queryPredicate, Arrays.asList(querySortByArr));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObserveQueryOptions)) {
            return false;
        }
        ObserveQueryOptions observeQueryOptions = (ObserveQueryOptions) obj;
        return ObjectsCompat.equals(this.queryPredicate, observeQueryOptions.queryPredicate) && ObjectsCompat.equals(this.sortBy, observeQueryOptions.sortBy);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.queryPredicate, this.sortBy);
    }

    public String toString() {
        return "QueryOptions{queryPredicate=" + this.queryPredicate + ", sortBy=" + this.sortBy + AbstractJsonLexerKt.END_OBJ;
    }
}
