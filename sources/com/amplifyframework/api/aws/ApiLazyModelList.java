package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.model.LazyModelList;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import com.amplifyframework.core.model.PaginationToken;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiLazyModelList<M extends Model> implements LazyModelList<M> {
    public static final Companion Companion = new Companion(null);
    private final ApiCategory apiCategory;
    private final String apiName;
    private final CoroutineScope callbackScope;
    private final Class<M> clazz;
    private final QueryPredicate queryPredicate;

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.amplifyframework.api.aws.ApiLazyModelList<? extends M extends com.amplifyframework.core.model.Model> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ApiLazyModelList<? extends M> apiLazyModelList, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = apiLazyModelList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchPage((PaginationToken) null, this);
        }
    }

    public ApiLazyModelList(@NotNull Class<M> cls, @NotNull Map<String, ? extends Object> map, String str, @NotNull ApiCategory apiCategory) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(apiCategory, "");
        this.clazz = cls;
        this.apiName = str;
        this.apiCategory = apiCategory;
        this.callbackScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        this.queryPredicate = Companion.createPredicate(cls, map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApiLazyModelList(Class cls, Map map, String str, ApiCategory apiCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            apiCategory = Amplify.API;
            Intrinsics.checkNotNullExpressionValue(apiCategory, "");
        }
        this(cls, map, str, apiCategory);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.amplifyframework.core.model.LazyModelList
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchPage(PaginationToken paginationToken, @NotNull Continuation<? super ModelPage<? extends M>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AmplifyException e;
        ApiLazyModelList<M> apiLazyModelList;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, continuation);
            }
        }
        Object objQuery = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objQuery);
            try {
                ApiCategory apiCategory = this.apiCategory;
                GraphQLRequest<ModelPage<M>> graphQLRequestCreateRequest = createRequest(paginationToken);
                String str = this.apiName;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objQuery = ApiQueryKt.query(apiCategory, graphQLRequestCreateRequest, str, anonymousClass1);
                if (objQuery == objCopydefault) {
                    return objCopydefault;
                }
                apiLazyModelList = this;
            } catch (AmplifyException e2) {
                e = e2;
                apiLazyModelList = this;
                throw apiLazyModelList.createLazyException(e);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apiLazyModelList = (ApiLazyModelList) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objQuery);
            } catch (AmplifyException e3) {
                e = e3;
                throw apiLazyModelList.createLazyException(e);
            }
        }
        Object data = ((GraphQLResponse) objQuery).getData();
        Intrinsics.checkNotNullExpressionValue(data, "");
        return data;
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ Consumer<ModelPage<M>> $onSuccess;
        int label;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.amplifyframework.api.aws.ApiLazyModelList<? extends M extends com.amplifyframework.core.model.Model> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ApiLazyModelList<? extends M> apiLazyModelList, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = apiLazyModelList;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ApiLazyModelList<M> apiLazyModelList = this.this$0;
                    this.label = 1;
                    obj = LazyModelList.DefaultImpls.fetchPage$default(apiLazyModelList, null, this, 1, null);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((ModelPage) obj);
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.core.model.LazyModelList
    public void fetchPage(@NotNull Consumer<ModelPage<M>> consumer, @NotNull Consumer<AmplifyException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        BuildersKt__Builders_commonKt.launch$default(this.callbackScope, null, null, new AnonymousClass2(this, consumer, consumer2, null), 3, null);
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.ApiLazyModelList$fetchPage$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ Consumer<ModelPage<M>> $onSuccess;
        final /* synthetic */ PaginationToken $paginationToken;
        int label;
        final /* synthetic */ ApiLazyModelList<M> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.amplifyframework.api.aws.ApiLazyModelList<? extends M extends com.amplifyframework.core.model.Model> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ApiLazyModelList<? extends M> apiLazyModelList, PaginationToken paginationToken, Consumer<ModelPage<M>> consumer, Consumer<AmplifyException> consumer2, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = apiLazyModelList;
            this.$paginationToken = paginationToken;
            this.$onSuccess = consumer;
            this.$onError = consumer2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$paginationToken, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    ApiLazyModelList<M> apiLazyModelList = this.this$0;
                    PaginationToken paginationToken = this.$paginationToken;
                    this.label = 1;
                    obj = apiLazyModelList.fetchPage(paginationToken, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((ModelPage) obj);
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.amplifyframework.core.model.LazyModelList
    public void fetchPage(PaginationToken paginationToken, @NotNull Consumer<ModelPage<M>> consumer, @NotNull Consumer<AmplifyException> consumer2) {
        Intrinsics.checkNotNullParameter(consumer, "");
        Intrinsics.checkNotNullParameter(consumer2, "");
        BuildersKt__Builders_commonKt.launch$default(this.callbackScope, null, null, new AnonymousClass3(this, paginationToken, consumer, consumer2, null), 3, null);
    }

    public static /* synthetic */ GraphQLRequest createRequest$default(ApiLazyModelList apiLazyModelList, PaginationToken paginationToken, int i, Object obj) {
        if ((i & 1) != 0) {
            paginationToken = null;
        }
        return apiLazyModelList.createRequest(paginationToken);
    }

    private final GraphQLRequest<ModelPage<M>> createRequest(PaginationToken paginationToken) {
        AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = AppSyncGraphQLRequestFactory.INSTANCE;
        Class<M> cls = this.clazz;
        QueryPredicate queryPredicate = this.queryPredicate;
        ApiPaginationToken apiPaginationToken = paginationToken instanceof ApiPaginationToken ? (ApiPaginationToken) paginationToken : null;
        return appSyncGraphQLRequestFactory.buildModelPageQuery$aws_api_release(cls, queryPredicate, apiPaginationToken != null ? apiPaginationToken.getNextToken() : null);
    }

    private final AmplifyException createLazyException(AmplifyException amplifyException) {
        String message = amplifyException.getMessage();
        if (message == null) {
            message = "";
        }
        return new AmplifyException("Error lazy loading the model list.", amplifyException, message);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.api.aws.ApiLazyModelList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <M extends Model> QueryPredicate createPredicate(@NotNull Class<M> cls, @NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(map, "");
            QueryPredicate queryPredicateAll = QueryPredicates.all();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                queryPredicateAll = queryPredicateAll.and(QueryField.field(cls.getSimpleName(), entry.getKey()).eq(entry.getValue()));
            }
            Intrinsics.checkNotNullExpressionValue(queryPredicateAll, "");
            return queryPredicateAll;
        }
    }
}
