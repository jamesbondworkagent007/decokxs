package com.amplifyframework.api.graphql;

import androidx.annotation.NonNull;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.Action;
import com.amplifyframework.core.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface GraphQLBehavior {
    <T> GraphQLOperation<T> mutate(@NonNull GraphQLRequest<T> graphQLRequest, @NonNull Consumer<GraphQLResponse<T>> consumer, @NonNull Consumer<ApiException> consumer2);

    <R> GraphQLOperation<R> mutate(@NonNull String str, @NonNull GraphQLRequest<R> graphQLRequest, @NonNull Consumer<GraphQLResponse<R>> consumer, @NonNull Consumer<ApiException> consumer2);

    <R> GraphQLOperation<R> query(@NonNull GraphQLRequest<R> graphQLRequest, @NonNull Consumer<GraphQLResponse<R>> consumer, @NonNull Consumer<ApiException> consumer2);

    <R> GraphQLOperation<R> query(@NonNull String str, @NonNull GraphQLRequest<R> graphQLRequest, @NonNull Consumer<GraphQLResponse<R>> consumer, @NonNull Consumer<ApiException> consumer2);

    <R> GraphQLOperation<R> subscribe(@NonNull GraphQLRequest<R> graphQLRequest, @NonNull Consumer<String> consumer, @NonNull Consumer<GraphQLResponse<R>> consumer2, @NonNull Consumer<ApiException> consumer3, @NonNull Action action);

    <R> GraphQLOperation<R> subscribe(@NonNull String str, @NonNull GraphQLRequest<R> graphQLRequest, @NonNull Consumer<String> consumer, @NonNull Consumer<GraphQLResponse<R>> consumer2, @NonNull Consumer<ApiException> consumer3, @NonNull Action action);
}
