package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.SignRpc;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class PingUseCase implements PingUseCaseInterface {
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    public PingUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
    }

    @Override // com.reown.sign.engine.use_case.calls.PingUseCaseInterface
    /* JADX INFO: renamed from: ping-zkXUZaI */
    public Object mo7342pingzkXUZaI(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, long j, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new PingUseCase$ping$2(this, str, function12, j, function1, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: onPingSuccess-gRj5Bb8, reason: not valid java name */
    public final void m7347onPingSuccessgRj5Bb8(long j, SignRpc.SessionPing sessionPing, Function1<? super String, Unit> function1, String str, Function1<? super Throwable, Unit> function12) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new PingUseCase$onPingSuccess$1(j, function12, this, sessionPing, function1, str, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.use_case.calls.PingUseCase */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object collectResponse$default(PingUseCase pingUseCase, long j, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<Result<? extends JsonRpcResponse.JsonRpcResult>, Unit>() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase.collectResponse.2
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m7348invoke(@NotNull Object obj2) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(Result<? extends JsonRpcResponse.JsonRpcResult> result) {
                    m7348invoke(result.m7386unboximpl());
                    return Unit.INSTANCE;
                }
            };
        }
        return pingUseCase.collectResponse(j, function1, continuation);
    }

    public final Object collectResponse(final long j, final Function1<? super Result<JsonRpcResponse.JsonRpcResult>, Unit> function1, Continuation<? super Unit> continuation) {
        final SharedFlow<WCResponse> peerResponse = this.jsonRpcInteractor.getPeerResponse();
        Object objCollect = new Flow<WCResponse>() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase$collectResponse$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WCResponse> flowCollector, @NotNull Continuation continuation2) {
                Object objCollect2 = peerResponse.collect(new AnonymousClass2(flowCollector, j), continuation2);
                return objCollect2 == C56442yFn.copydefault() ? objCollect2 : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.PingUseCase$collectResponse$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ long $id$inlined;
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.sign.engine.use_case.calls.PingUseCase$collectResponse$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2(FlowCollector flowCollector, long j) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$id$inlined = j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull Continuation continuation) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((WCResponse) obj).getResponse().getId() == this.$id$inlined) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        }.collect(new FlowCollector() { // from class: com.reown.sign.engine.use_case.calls.PingUseCase.collectResponse.4
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit((WCResponse) obj, (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(@NotNull WCResponse wCResponse, @NotNull Continuation<? super Unit> continuation2) {
                JsonRpcResponse response = wCResponse.getResponse();
                if (response instanceof JsonRpcResponse.JsonRpcResult) {
                    Function1<Result<JsonRpcResponse.JsonRpcResult>, Unit> function12 = function1;
                    Result.Application application = Result.Companion;
                    function12.invoke(Result.m7376boximpl(Result.m7377constructorimpl(response)));
                } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                    Function1<Result<JsonRpcResponse.JsonRpcResult>, Unit> function13 = function1;
                    Result.Application application2 = Result.Companion;
                    function13.invoke(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new Throwable(((JsonRpcResponse.JsonRpcError) response).getErrorMessage())))));
                }
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
    }
}
