package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.PropertyContainerPath;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelMutation {
    public static final ModelMutation INSTANCE = new ModelMutation();

    private ModelMutation() {
    }

    public static final <M extends Model> GraphQLRequest<M> create(@NotNull M m) {
        Intrinsics.checkNotNullParameter(m, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.CREATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> create(@NotNull M m, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.CREATE, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> update(@NotNull M m, @NotNull QueryPredicate queryPredicate) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> update(@NotNull M m, @NotNull QueryPredicate queryPredicate, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.UPDATE, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> update(@NotNull M m) {
        Intrinsics.checkNotNullParameter(m, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> update(@NotNull M m, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.UPDATE, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> delete(@NotNull M m, @NotNull QueryPredicate queryPredicate) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.DELETE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> delete(@NotNull M m, @NotNull QueryPredicate queryPredicate, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicate, MutationType.DELETE, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> delete(@NotNull M m) {
        Intrinsics.checkNotNullParameter(m, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.DELETE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> delete(@NotNull M m, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(function1, "");
        QueryPredicate queryPredicateAll = QueryPredicates.all();
        Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
        return AppSyncGraphQLRequestFactory.buildMutation(m, queryPredicateAll, MutationType.DELETE, function1);
    }
}
