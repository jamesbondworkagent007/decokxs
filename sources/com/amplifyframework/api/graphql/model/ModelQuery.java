package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.PropertyContainerPath;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelQuery {
    public static final ModelQuery INSTANCE = new ModelQuery();

    private ModelQuery() {
    }

    public static final <M extends Model> GraphQLRequest<M> get(@NotNull Class<M> cls, @NotNull String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, str);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> get(@NotNull Class<M> cls, @NotNull String str, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, str, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> get(@NotNull Class<M> cls, @NotNull ModelIdentifier<M> modelIdentifier) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelIdentifier, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, modelIdentifier);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> get(@NotNull Class<M> cls, @NotNull ModelIdentifier<M> modelIdentifier, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelIdentifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, modelIdentifier, function1);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull QueryPredicate queryPredicate) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, queryPredicate);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull QueryPredicate queryPredicate, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildQuery(cls, queryPredicate, function1);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return list(cls, queryPredicateAll);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return list(cls, queryPredicateAll, function1);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull QueryPredicate queryPredicate, @NotNull ModelPagination modelPagination) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(modelPagination, "");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicate, modelPagination.getLimit());
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull QueryPredicate queryPredicate, @NotNull ModelPagination modelPagination, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(modelPagination, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicate, modelPagination.getLimit(), function1);
    }

    public static final <M extends Model> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull ModelPagination modelPagination) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelPagination, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicateAll, modelPagination.getLimit());
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<PaginatedResult<M>> list(@NotNull Class<M> cls, @NotNull ModelPagination modelPagination, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelPagination, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildPaginatedResultQuery(cls, queryPredicateAll, modelPagination.getLimit(), function1);
    }
}
