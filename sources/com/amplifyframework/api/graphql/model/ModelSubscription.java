package com.amplifyframework.api.graphql.model;

import com.amplifyframework.api.aws.AppSyncGraphQLRequestFactory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.PropertyContainerPath;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ModelSubscription {
    public static final ModelSubscription INSTANCE = new ModelSubscription();

    private ModelSubscription() {
    }

    public final <M extends Model> GraphQLRequest<M> of(@NotNull Class<M> cls, @NotNull SubscriptionType subscriptionType) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(subscriptionType, "");
        return AppSyncGraphQLRequestFactory.buildSubscription(cls, subscriptionType);
    }

    public final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> of(@NotNull Class<M> cls, @NotNull SubscriptionType subscriptionType, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(subscriptionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AppSyncGraphQLRequestFactory.buildSubscription(cls, subscriptionType, function1);
    }

    public static final <M extends Model> GraphQLRequest<M> onCreate(@NotNull Class<M> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return INSTANCE.of(cls, SubscriptionType.ON_CREATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onCreate(@NotNull Class<M> cls, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return INSTANCE.of(cls, SubscriptionType.ON_CREATE, function1);
    }

    public final <M extends Model> GraphQLRequest<M> onDelete(@NotNull Class<M> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return of(cls, SubscriptionType.ON_DELETE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onDelete(@NotNull Class<M> cls, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return INSTANCE.of(cls, SubscriptionType.ON_DELETE, function1);
    }

    public final <M extends Model> GraphQLRequest<M> onUpdate(@NotNull Class<M> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return of(cls, SubscriptionType.ON_UPDATE);
    }

    public static final <M extends Model, P extends ModelPath<M>> GraphQLRequest<M> onUpdate(@NotNull Class<M> cls, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return INSTANCE.of(cls, SubscriptionType.ON_UPDATE, function1);
    }
}
