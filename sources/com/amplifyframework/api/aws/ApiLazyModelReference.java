package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiCategory;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.amplifyframework.core.NullableConsumer;
import com.amplifyframework.core.model.LazyModelReference;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiLazyModelReference<M extends Model> implements LazyModelReference<M> {
    private static final Companion Companion = new Companion(null);
    private final ApiCategory apiCategory;
    private final String apiName;
    private final AtomicReference<Companion.LoadedValue<M>> cachedValue;
    private final CoroutineScope callbackScope;
    private final Class<M> clazz;
    private final Map<String, Object> keyMap;
    private final Mutex mutex;

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.ApiLazyModelReference$fetchInternal$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ApiLazyModelReference<M> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ApiLazyModelReference<M> apiLazyModelReference, Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = apiLazyModelReference;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.fetchInternal(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.model.ModelReference
    public Map<String, Object> getIdentifier() {
        return this.keyMap;
    }

    public ApiLazyModelReference(@NotNull Class<M> cls, @NotNull Map<String, ? extends Object> map, String str, @NotNull ApiCategory apiCategory) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(apiCategory, "");
        this.clazz = cls;
        this.keyMap = map;
        this.apiName = str;
        this.apiCategory = apiCategory;
        AtomicReference<Companion.LoadedValue<M>> atomicReference = new AtomicReference<>(null);
        this.cachedValue = atomicReference;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.callbackScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
        if (map.isEmpty()) {
            atomicReference.set(new Companion.LoadedValue<>(null));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApiLazyModelReference(Class cls, Map map, String str, ApiCategory apiCategory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 4) != 0 ? null : str;
        if ((i & 8) != 0) {
            apiCategory = Amplify.API;
            Intrinsics.checkNotNullExpressionValue(apiCategory, "");
        }
        this(cls, map, str, apiCategory);
    }

    @Override // com.amplifyframework.core.model.LazyModelReference
    public Object fetchModel(@NotNull Continuation<? super M> continuation) {
        Companion.LoadedValue<M> loadedValue = this.cachedValue.get();
        if (loadedValue != null) {
            return loadedValue.getValue();
        }
        return fetchInternal(continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.amplifyframework.core.NullableConsumer<M extends com.amplifyframework.core.model.Model> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amplifyframework.core.model.LazyModelReference
    public void fetchModel(@NotNull NullableConsumer<M> nullableConsumer, @NotNull Consumer<AmplifyException> consumer) {
        Intrinsics.checkNotNullParameter(nullableConsumer, "");
        Intrinsics.checkNotNullParameter(consumer, "");
        Companion.LoadedValue<M> loadedValue = this.cachedValue.get();
        if (loadedValue != null) {
            nullableConsumer.accept(loadedValue.getValue());
        }
        BuildersKt__Builders_commonKt.launch$default(this.callbackScope, null, null, new AnonymousClass2(this, nullableConsumer, consumer, null), 3, null);
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.ApiLazyModelReference$fetchModel$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Consumer<AmplifyException> $onError;
        final /* synthetic */ NullableConsumer<M> $onSuccess;
        int label;
        final /* synthetic */ ApiLazyModelReference<M> this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ApiLazyModelReference<M> apiLazyModelReference, NullableConsumer<M> nullableConsumer, Consumer<AmplifyException> consumer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = apiLazyModelReference;
            this.$onSuccess = nullableConsumer;
            this.$onError = consumer;
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
                    ApiLazyModelReference<M> apiLazyModelReference = this.this$0;
                    this.label = 1;
                    obj = apiLazyModelReference.fetchInternal(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                this.$onSuccess.accept((M) ((Model) obj));
            } catch (AmplifyException e) {
                this.$onError.accept(e);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x014a */
    /* JADX DEBUG: Type inference failed for r7v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchInternal(Continuation<? super M> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ?? r2;
        ApiLazyModelReference<M> apiLazyModelReference;
        ?? r1;
        ApiLazyModelReference<M> apiLazyModelReference2;
        String message;
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
        String str = "";
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objQuery);
                    Mutex mutex = this.mutex;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = mutex;
                    anonymousClass1.label = 1;
                    if (mutex.lock(null, anonymousClass1) == objCopydefault) {
                        return objCopydefault;
                    }
                    apiLazyModelReference = this;
                    r2 = mutex;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Mutex mutex2 = (Mutex) anonymousClass1.L$1;
                        apiLazyModelReference2 = (ApiLazyModelReference) anonymousClass1.L$0;
                        try {
                            C56391yDq.AEQbTJ(objQuery);
                            r1 = mutex2;
                            Model model = (Model) ((GraphQLResponse) objQuery).getData();
                            apiLazyModelReference2.cachedValue.set(new Companion.LoadedValue<>(model));
                            r1.unlock(null);
                            return model;
                        } catch (ApiException e) {
                            e = e;
                            message = e.getMessage();
                            if (message == null) {
                            }
                            throw new AmplifyException("Error lazy loading the model.", e, str);
                        }
                    }
                    Mutex mutex3 = (Mutex) anonymousClass1.L$1;
                    apiLazyModelReference = (ApiLazyModelReference) anonymousClass1.L$0;
                    C56391yDq.AEQbTJ(objQuery);
                    r2 = mutex3;
                }
                Companion.LoadedValue<M> loadedValue = apiLazyModelReference.cachedValue.get();
                if (loadedValue != null) {
                    Model value = loadedValue.getValue();
                    r2.unlock(null);
                    return value;
                }
                try {
                    ModelSchema modelSchemaFromModelClass = ModelSchema.fromModelClass(apiLazyModelReference.clazz);
                    Intrinsics.checkNotNullExpressionValue(modelSchemaFromModelClass, "");
                    List<String> primaryIndexFields = modelSchemaFromModelClass.getPrimaryIndexFields();
                    Intrinsics.checkNotNullExpressionValue(primaryIndexFields, "");
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(primaryIndexFields, 10));
                    for (String str2 : primaryIndexFields) {
                        ModelField modelField = modelSchemaFromModelClass.getFields().get(str2);
                        if (modelField == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        ModelField modelField2 = modelField;
                        String str3 = modelField2.isRequired() ? "!" : "";
                        String str4 = modelField2.getTargetType() + str3;
                        Object obj = apiLazyModelReference.keyMap.get(str2);
                        if (obj == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        Intrinsics.copydefault((Object) str2);
                        arrayList.add(new GraphQLRequestVariable(str2, obj, str4));
                    }
                    AppSyncGraphQLRequestFactory appSyncGraphQLRequestFactory = AppSyncGraphQLRequestFactory.INSTANCE;
                    Class<M> cls = apiLazyModelReference.clazz;
                    GraphQLRequestVariable[] graphQLRequestVariableArr = (GraphQLRequestVariable[]) arrayList.toArray(new GraphQLRequestVariable[0]);
                    GraphQLRequest graphQLRequestBuildQueryInternal$aws_api_release = appSyncGraphQLRequestFactory.buildQueryInternal$aws_api_release(cls, null, (GraphQLRequestVariable[]) Arrays.copyOf(graphQLRequestVariableArr, graphQLRequestVariableArr.length));
                    ApiCategory apiCategory = apiLazyModelReference.apiCategory;
                    String str5 = apiLazyModelReference.apiName;
                    anonymousClass1.L$0 = apiLazyModelReference;
                    anonymousClass1.L$1 = r2;
                    anonymousClass1.label = 2;
                    objQuery = ApiQueryKt.query(apiCategory, graphQLRequestBuildQueryInternal$aws_api_release, str5, anonymousClass1);
                    if (objQuery == objCopydefault) {
                        return objCopydefault;
                    }
                    r1 = r2;
                    apiLazyModelReference2 = apiLazyModelReference;
                    Model model2 = (Model) ((GraphQLResponse) objQuery).getData();
                    apiLazyModelReference2.cachedValue.set(new Companion.LoadedValue<>(model2));
                    r1.unlock(null);
                    return model2;
                } catch (ApiException e2) {
                    e = e2;
                    message = e.getMessage();
                    if (message == null) {
                        str = message;
                    }
                    throw new AmplifyException("Error lazy loading the model.", e, str);
                }
            } catch (Throwable th) {
                th = th;
                r2.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = objCopydefault;
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.api.aws.ApiLazyModelReference.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static final class LoadedValue<M extends Model> {
            private final M value;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final M getValue() {
                return this.value;
            }

            public LoadedValue(M m) {
                this.value = m;
            }
        }
    }
}
