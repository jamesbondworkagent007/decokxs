package com.amplifyframework.core.model.query.predicate;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
final class MatchAllQueryPredicate implements QueryPredicate {
    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate and(QueryPredicate queryPredicate) {
        return queryPredicate;
    }

    @Override // com.amplifyframework.core.model.query.predicate.Evaluable
    public boolean evaluate(@Nullable Object obj) {
        return true;
    }

    @Override // com.amplifyframework.core.model.query.predicate.QueryPredicate
    public QueryPredicate or(QueryPredicate queryPredicate) {
        return this;
    }

    private MatchAllQueryPredicate() {
    }

    public static MatchAllQueryPredicate instance() {
        return new MatchAllQueryPredicate();
    }

    public int hashCode() {
        return MatchAllQueryPredicate.class.hashCode();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof MatchAllQueryPredicate;
    }

    public String toString() {
        return MatchAllQueryPredicate.class.getSimpleName();
    }
}
