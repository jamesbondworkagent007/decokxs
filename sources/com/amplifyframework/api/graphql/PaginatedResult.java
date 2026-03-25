package com.amplifyframework.api.graphql;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class PaginatedResult<T> implements Iterable<T> {
    private final Iterable<T> items;
    private final GraphQLRequest<PaginatedResult<T>> requestForNextResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Iterable<T> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GraphQLRequest<PaginatedResult<T>> getRequestForNextResult() {
        return this.requestForNextResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasNextResult() {
        return this.requestForNextResult != null;
    }

    public PaginatedResult(@NonNull Iterable<T> iterable, @Nullable GraphQLRequest<PaginatedResult<T>> graphQLRequest) {
        this.requestForNextResult = graphQLRequest;
        this.items = (Iterable) StreamSupport.stream(iterable.spliterator(), false).filter(new Predicate() { // from class: com.amplifyframework.api.graphql.PaginatedResult$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull(obj);
            }
        }).collect(Collectors.toList());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PaginatedResult.class != obj.getClass()) {
            return false;
        }
        PaginatedResult paginatedResult = (PaginatedResult) obj;
        return ObjectsCompat.equals(this.requestForNextResult, paginatedResult.requestForNextResult) && ObjectsCompat.equals(this.items, paginatedResult.items);
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.requestForNextResult, this.items);
    }

    public String toString() {
        return "PaginatedResult{requestForNextResult=" + this.requestForNextResult + ", items=" + this.items + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    @Override // java.lang.Iterable
    public void forEach(@NonNull Consumer<? super T> consumer) {
        this.items.forEach(consumer);
    }

    @Override // java.lang.Iterable
    public Spliterator<T> spliterator() {
        return this.items.spliterator();
    }
}
