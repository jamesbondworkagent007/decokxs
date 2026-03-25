package com.amplifyframework.api.aws;

import androidx.exifinterface.media.ExifInterface;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AppSyncGraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.api.graphql.Operation;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.api.graphql.QueryType;
import com.amplifyframework.api.graphql.SubscriptionType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.core.model.ModelPath;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.PropertyContainerPath;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.amplifyframework.util.Casing;
import com.amplifyframework.util.TypeMaker;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AppSyncGraphQLRequestFactory {
    private static final int DEFAULT_QUERY_LIMIT = 1000;
    public static final AppSyncGraphQLRequestFactory INSTANCE = new AppSyncGraphQLRequestFactory();

    private AppSyncGraphQLRequestFactory() {
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull String str) {
        GraphQLRequestVariable graphQLRequestVariable;
        String primaryKeyName;
        ModelField modelField;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
            primaryKeyName = modelSchemaFromModelClass.getPrimaryKeyName();
            Intrinsics.checkNotNullExpressionValue(primaryKeyName, "");
            modelField = modelSchemaFromModelClass.getFields().get(primaryKeyName);
        } catch (Exception unused) {
            graphQLRequestVariable = new GraphQLRequestVariable("id", str, "ID!");
        }
        if (modelField == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ModelField modelField2 = modelField;
        String str2 = modelField2.isRequired() ? "!" : "";
        graphQLRequestVariable = new GraphQLRequestVariable(primaryKeyName, str, modelField2.getTargetType() + str2);
        return INSTANCE.buildQueryInternal$aws_api_release(cls, null, graphQLRequestVariable);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull String str, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        GraphQLRequestVariable graphQLRequestVariable;
        String primaryKeyName;
        ModelField modelField;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
            primaryKeyName = modelSchemaFromModelClass.getPrimaryKeyName();
            Intrinsics.checkNotNullExpressionValue(primaryKeyName, "");
            modelField = modelSchemaFromModelClass.getFields().get(primaryKeyName);
        } catch (Exception unused) {
            graphQLRequestVariable = new GraphQLRequestVariable("id", str, "ID!");
        }
        if (modelField == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        ModelField modelField2 = modelField;
        String str2 = modelField2.isRequired() ? "!" : "";
        graphQLRequestVariable = new GraphQLRequestVariable(primaryKeyName, str, modelField2.getTargetType() + str2);
        return INSTANCE.buildQueryInternal$aws_api_release(cls, function1, graphQLRequestVariable);
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull ModelIdentifier<T> modelIdentifier) {
        Serializable string;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelIdentifier, "");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
            List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
            Intrinsics.checkNotNullExpressionValue(primaryIndexFields, "");
            List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(primaryIndexFields, 10));
            int i = 0;
            for (Object obj : primaryIndexFields) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                String str = (String) obj;
                ModelField modelField = modelSchemaFromModelClass.getFields().get(str);
                if (modelField == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ModelField modelField2 = modelField;
                String str2 = modelField2.isRequired() ? "!" : "";
                String str3 = modelField2.getTargetType() + str2;
                if (i == 0) {
                    string = modelIdentifier.key().toString();
                } else {
                    string = listSortedKeys.get(i - 1);
                }
                Intrinsics.copydefault((Object) str);
                Intrinsics.copydefault(string);
                arrayList.add(new GraphQLRequestVariable(str, string, str3));
                i++;
            }
            AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
            GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
            return appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, null, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull ModelIdentifier<T> modelIdentifier, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Serializable string;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(modelIdentifier, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
            List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
            Intrinsics.checkNotNullExpressionValue(primaryIndexFields, "");
            List<? extends Serializable> listSortedKeys = modelIdentifier.sortedKeys();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(primaryIndexFields, 10));
            int i = 0;
            for (Object obj : primaryIndexFields) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                String str = (String) obj;
                ModelField modelField = modelSchemaFromModelClass.getFields().get(str);
                if (modelField == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                ModelField modelField2 = modelField;
                String str2 = modelField2.isRequired() ? "!" : "";
                String str3 = modelField2.getTargetType() + str2;
                if (i == 0) {
                    string = modelIdentifier.key().toString();
                } else {
                    string = listSortedKeys.get(i - 1);
                }
                Intrinsics.copydefault((Object) str);
                Intrinsics.copydefault(string);
                arrayList.add(new GraphQLRequestVariable(str, string, str3));
                i++;
            }
            AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
            GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
            return appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, function1, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQueryInternal$aws_api_release(@NotNull Class<T> cls, Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1, @NotNull GraphQLRequestVariable... graphQLRequestVariableArr) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(graphQLRequestVariableArr, "");
        try {
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(cls).operation(QueryType.GET).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            for (GraphQLRequestVariable graphQLRequestVariable : graphQLRequestVariableArr) {
                builderResponseType.variable(graphQLRequestVariable.component1(), graphQLRequestVariable.component3(), graphQLRequestVariable.component2());
            }
            SelectionSet selectionSetCreateApiSelectionSet = function1 != null ? INSTANCE.createApiSelectionSet(cls, QueryType.GET, function1) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            Intrinsics.copydefault(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull QueryPredicate queryPredicate) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        Intrinsics.copydefault(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, 1000, parameterizedType, null, null, 32, null);
    }

    public final <R, T extends Model> GraphQLRequest<R> buildModelPageQuery$aws_api_release(@NotNull Class<T> cls, @NotNull QueryPredicate queryPredicate, String str) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Type parameterizedType = TypeMaker.getParameterizedType(ApiModelPage.class, cls);
        Intrinsics.copydefault(parameterizedType);
        return buildListQueryInternal(cls, queryPredicate, 1000, parameterizedType, null, str);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildQuery(@NotNull Class<T> cls, @NotNull QueryPredicate queryPredicate, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        Intrinsics.copydefault(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, 1000, parameterizedType, function1, null, 32, null);
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildPaginatedResultQuery(@NotNull Class<T> cls, @NotNull QueryPredicate queryPredicate, int i) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        Intrinsics.copydefault(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, i, parameterizedType, null, null, 32, null);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildPaginatedResultQuery(@NotNull Class<T> cls, @NotNull QueryPredicate queryPredicate, int i, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Type parameterizedType = TypeMaker.getParameterizedType(PaginatedResult.class, cls);
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = INSTANCE;
        Intrinsics.copydefault(parameterizedType);
        return buildListQueryInternal$default(appSyncGraphQLRequestFactory, cls, queryPredicate, i, parameterizedType, function1, null, 32, null);
    }

    public static /* synthetic */ GraphQLRequest buildListQueryInternal$default(AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory, Class cls, QueryPredicate queryPredicate, int i, Type type, Function1 function1, String str, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            str = null;
        }
        return appSyncGraphQLRequestFactory.buildListQueryInternal(cls, queryPredicate, i, type, function1, str);
    }

    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildListQueryInternal(Class<T> cls, QueryPredicate queryPredicate, int i, Type type, Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1, String str) {
        try {
            String name = ModelSchema.fromModelClass(cls).getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            AppSyncGraphQLRequest.Builder builderModelClass = AppSyncGraphQLRequest.builder().modelClass(cls);
            QueryType queryType = QueryType.LIST;
            AppSyncGraphQLRequest.Builder builderResponseType = builderModelClass.operation(queryType).requestOptions(new ApiGraphQLRequestOptions()).responseType(type);
            if (!Intrinsics.EZpvd(QueryPredicates.all(), queryPredicate)) {
                builderResponseType.variable("filter", ExifInterface.TAG_MODEL + Casing.capitalizeFirst(name) + "FilterInput", GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            builderResponseType.variable("limit", "Int", Integer.valueOf(i));
            if (str != null) {
                builderResponseType.variable(LazyTypeDeserializersKt.NEXT_TOKEN_KEY, "String", str);
            }
            SelectionSet selectionSetCreateApiSelectionSet = function1 != null ? INSTANCE.createApiSelectionSet(cls, queryType, function1) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            Intrinsics.copydefault(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildMutation(@NotNull T t, @NotNull QueryPredicate queryPredicate, @NotNull MutationType mutationType) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(mutationType, "");
        return INSTANCE.buildMutationInternal(t, queryPredicate, mutationType, null);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildMutation(@NotNull T t, @NotNull QueryPredicate queryPredicate, @NotNull MutationType mutationType, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(queryPredicate, "");
        Intrinsics.checkNotNullParameter(mutationType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return INSTANCE.buildMutationInternal(t, queryPredicate, mutationType, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.amplifyframework.api.aws.AppSyncGraphQLRequest$Builder */
    /* JADX WARN: Multi-variable type inference failed */
    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildMutationInternal(T t, QueryPredicate queryPredicate, MutationType mutationType, Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        try {
            Class<?> cls = t.getClass();
            ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(cls);
            Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
            String name = modelSchemaFromModelClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().operation(mutationType).modelClass(cls).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            String str = Casing.capitalize(mutationType.toString()) + Casing.capitalizeFirst(name) + "Input!";
            if (MutationType.DELETE == mutationType) {
                builderResponseType.variable(Web3SecurityTrackEvent.VALUE_INPUT, str, GraphQLRequestHelper.getDeleteMutationInputMap(modelSchemaFromModelClass, t));
            } else {
                builderResponseType.variable(Web3SecurityTrackEvent.VALUE_INPUT, str, GraphQLRequestHelper.getMapOfFieldNameAndValues(modelSchemaFromModelClass, t, mutationType));
            }
            if (!Intrinsics.EZpvd(QueryPredicates.all(), queryPredicate)) {
                builderResponseType.variable("condition", ExifInterface.TAG_MODEL + Casing.capitalizeFirst(name) + "ConditionInput", GraphQLRequestHelper.parsePredicate(queryPredicate));
            }
            SelectionSet selectionSetCreateApiSelectionSet = function1 != null ? INSTANCE.createApiSelectionSet(cls, mutationType, function1) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            Intrinsics.copydefault(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Could not generate a schema for the specified class", e);
        }
    }

    public static final <R, T extends Model> GraphQLRequest<R> buildSubscription(@NotNull Class<T> cls, @NotNull SubscriptionType subscriptionType) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(subscriptionType, "");
        return INSTANCE.buildSubscriptionInternal(cls, subscriptionType, null);
    }

    public static final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildSubscription(@NotNull Class<T> cls, @NotNull SubscriptionType subscriptionType, @NotNull Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(subscriptionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return INSTANCE.buildSubscriptionInternal(cls, subscriptionType, function1);
    }

    private final <R, T extends Model, P extends ModelPath<T>> GraphQLRequest<R> buildSubscriptionInternal(Class<T> cls, SubscriptionType subscriptionType, Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) {
        try {
            AppSyncGraphQLRequest.Builder builderResponseType = AppSyncGraphQLRequest.builder().modelClass(cls).operation(subscriptionType).requestOptions(new ApiGraphQLRequestOptions()).responseType(cls);
            SelectionSet selectionSetCreateApiSelectionSet = function1 != null ? INSTANCE.createApiSelectionSet(cls, subscriptionType, function1) : null;
            if (selectionSetCreateApiSelectionSet != null) {
                builderResponseType.selectionSet(selectionSetCreateApiSelectionSet);
            }
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = builderResponseType.build();
            Intrinsics.copydefault(appSyncGraphQLRequestBuild);
            return appSyncGraphQLRequestBuild;
        } catch (AmplifyException e) {
            throw new IllegalStateException("Failed to build GraphQLRequest", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.amplifyframework.api.aws.SelectionSet$Builder */
    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends Model, P extends ModelPath<T>> SelectionSet createApiSelectionSet(Class<T> cls, Operation operation, Function1<? super P, ? extends List<? extends PropertyContainerPath>> function1) throws AmplifyException {
        SelectionSet selectionSetBuild = SelectionSet.builder().modelClass(cls).operation(operation).requestOptions(new ApiGraphQLRequestOptions()).includeRelationships(function1.invoke(ModelPath.Companion.getRootPath(cls))).build();
        Intrinsics.checkNotNullExpressionValue(selectionSetBuild, "");
        return selectionSetBuild;
    }
}
