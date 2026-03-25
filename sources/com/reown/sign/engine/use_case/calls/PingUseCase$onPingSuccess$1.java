package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class PingUseCase$onPingSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
    public final /* synthetic */ Function1<String, Unit> $onSuccess;
    public final /* synthetic */ SignRpc.SessionPing $pingPayload;
    public final /* synthetic */ long $timeout;
    public final /* synthetic */ String $topic;
    public int label;
    public final /* synthetic */ PingUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingUseCase$onPingSuccess$1(long j, Function1<? super Throwable, Unit> function1, PingUseCase pingUseCase, SignRpc.SessionPing sessionPing, Function1<? super String, Unit> function12, String str, Continuation<? super PingUseCase$onPingSuccess$1> continuation) {
        super(2, continuation);
        this.$timeout = j;
        this.$onFailure = function1;
        this.this$0 = pingUseCase;
        this.$pingPayload = sessionPing;
        this.$onSuccess = function12;
        this.$topic = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
        return new PingUseCase$onPingSuccess$1(this.$timeout, this.$onFailure, this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PingUseCase$onPingSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                long j = this.$timeout;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, this.$onFailure, null);
                this.label = 1;
                if (TimeoutKt.m7402withTimeoutKLykuaI(j, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (TimeoutCancellationException e) {
            this.$onFailure.invoke(e);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.PingUseCase$onPingSuccess$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Throwable, Unit> $onFailure;
        public final /* synthetic */ Function1<String, Unit> $onSuccess;
        public final /* synthetic */ SignRpc.SessionPing $pingPayload;
        public final /* synthetic */ String $topic;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ PingUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PingUseCase pingUseCase, SignRpc.SessionPing sessionPing, Function1<? super String, Unit> function1, String str, Function1<? super Throwable, Unit> function12, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pingUseCase;
            this.$pingPayload = sessionPing;
            this.$onSuccess = function1;
            this.$topic = str;
            this.$onFailure = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$pingPayload, this.$onSuccess, this.$topic, this.$onFailure, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                PingUseCase pingUseCase = this.this$0;
                long id = this.$pingPayload.getId();
                final PingUseCase pingUseCase2 = this.this$0;
                final Function1<String, Unit> function1 = this.$onSuccess;
                final String str = this.$topic;
                final Function1<Throwable, Unit> function12 = this.$onFailure;
                Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit> function13 = new Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit>() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase.onPingSuccess.1.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
                    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Result<? extends JsonRpcResponse.JsonRpcResult> result) {
                        m7349invoke(result.m7386unboximpl());
                        return Unit.INSTANCE;
                    }

                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m7349invoke(@NotNull Object obj2) {
                        CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
                        PingUseCase pingUseCase3 = pingUseCase2;
                        Function1<String, Unit> function14 = function1;
                        String str2 = str;
                        Function1<Throwable, Unit> function15 = function12;
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                        if (thM7380exceptionOrNullimpl == null) {
                            pingUseCase3.logger.log("Ping peer response success");
                            function14.invoke(str2);
                        } else {
                            pingUseCase3.logger.error("Ping peer response error: " + thM7380exceptionOrNullimpl);
                            function15.invoke(thM7380exceptionOrNullimpl);
                        }
                    }
                };
                this.label = 1;
                if (pingUseCase.collectResponse(id, function13, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
