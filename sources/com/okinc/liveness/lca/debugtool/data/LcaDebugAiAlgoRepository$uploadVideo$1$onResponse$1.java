package com.okinc.liveness.lca.debugtool.data;

import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes23.dex */
public final class LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $apiMode;
    final /* synthetic */ LcaDebugInfo $lcaDebugInfo;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<LivenessResponse, Unit> $onSuccess;
    final /* synthetic */ Response $response;
    int label;
    final /* synthetic */ LcaDebugAiAlgoRepository this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.liveness.lca.debugtool.data.LivenessResponse, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1(Response response, LcaDebugInfo lcaDebugInfo, int i, LcaDebugAiAlgoRepository lcaDebugAiAlgoRepository, Function1<? super LivenessResponse, Unit> function1, Function1<? super String, Unit> function12, Continuation<? super LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1> continuation) {
        super(2, continuation);
        this.$response = response;
        this.$lcaDebugInfo = lcaDebugInfo;
        this.$apiMode = i;
        this.this$0 = lcaDebugAiAlgoRepository;
        this.$onSuccess = function1;
        this.$onError = function12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1(this.$response, this.$lcaDebugInfo, this.$apiMode, this.this$0, this.$onSuccess, this.$onError, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ResponseBody responseBodyBody = this.$response.body();
                String strString = responseBodyBody != null ? responseBodyBody.string() : null;
                this.$lcaDebugInfo.setResponseRawJson(strString);
                Function1<LcaDebugInfo, Unit> debugInfoCallback = LcaSdkManager.Companion.getInstance().getDebugInfoCallback();
                if (debugInfoCallback != null) {
                    debugInfoCallback.invoke(this.$lcaDebugInfo);
                }
                if (strString != null) {
                    int i2 = this.$apiMode;
                    LcaDebugAiAlgoRepository lcaDebugAiAlgoRepository = this.this$0;
                    Function1<LivenessResponse, Unit> function1 = this.$onSuccess;
                    pUU.KWHzl(LcaDebugAiAlgoRepository.TAG, "responseBody=" + strString);
                    Object objFromJson = i2 == LcaSdkConfiguration.Companion.getAPI_MODEL_PREDICTION() ? lcaDebugAiAlgoRepository.gson.fromJson(strString, LcaAiAlgoLivenessPredictionResponse.class) : lcaDebugAiAlgoRepository.gson.fromJson(strString, LcaAiAlgoLivenessCollectionResponse.class);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1$1$1 lcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1$1$1 = new LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1$1$1(function1, objFromJson, null);
                    this.label = 1;
                    if (BuildersKt.withContext(main, lcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1$1$1, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onError, e, null);
            this.label = 2;
            if (BuildersKt.withContext(main2, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.liveness.lca.debugtool.data.LcaDebugAiAlgoRepository$uploadVideo$1$onResponse$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Exception $e;
        final /* synthetic */ Function1<String, Unit> $onError;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function1<? super String, Unit> function1, Exception exc, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onError = function1;
            this.$e = exc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$onError, this.$e, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Function1<String, Unit> function1 = this.$onError;
                String message = this.$e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                function1.invoke(message);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
