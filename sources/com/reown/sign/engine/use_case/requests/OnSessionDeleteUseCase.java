package com.reown.sign.engine.use_case.requests;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionDeleteUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionDeleteUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull KeyManagementRepository keyManagementRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.crypto = keyManagementRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionDeleteUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.DeleteParams $params;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.DeleteParams deleteParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$params = deleteParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionDeleteUseCase.this.new AnonymousClass2(this.$request, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x01ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            IrnParams irnParams;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OnSessionDeleteUseCase.this.logger.log("Session delete received on topic: " + this.$request.getTopic());
                IrnParams irnParams2 = new IrnParams(Tags.SESSION_DELETE_RESPONSE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                try {
                    if (!OnSessionDeleteUseCase.this.sessionStorageRepository.isSessionValid(this.$request.getTopic())) {
                        OnSessionDeleteUseCase.this.logger.error("Session delete received failure on topic: " + this.$request.getTopic() + " - invalid session");
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionDeleteUseCase.this.jsonRpcInteractor;
                        WCRequest wCRequest = this.$request;
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest, new Uncategorized.NoMatchingTopic("SESSION", wCRequest.getTopic().getValue()), irnParams2, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface2 = OnSessionDeleteUseCase.this.jsonRpcInteractor;
                    Topic topic = this.$request.getTopic();
                    final OnSessionDeleteUseCase onSessionDeleteUseCase = OnSessionDeleteUseCase.this;
                    final WCRequest wCRequest2 = this.$request;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionDeleteUseCase.invoke.2.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onSessionDeleteUseCase.logger.log("Session delete received on topic: " + wCRequest2.getTopic() + " - unsubscribe success");
                            try {
                                onSessionDeleteUseCase.crypto.removeKeys(wCRequest2.getTopic().getValue());
                            } catch (Exception e) {
                                onSessionDeleteUseCase.logger.error("Remove keys exception:" + e);
                            }
                        }
                    };
                    final OnSessionDeleteUseCase onSessionDeleteUseCase2 = OnSessionDeleteUseCase.this;
                    final WCRequest wCRequest3 = this.$request;
                    relayJsonRpcInteractorInterface2.unsubscribe(topic, function0, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.use_case.requests.OnSessionDeleteUseCase.invoke.2.2
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                            invoke2(th);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Throwable th) {
                            Intrinsics.checkNotNullParameter(th, "");
                            onSessionDeleteUseCase2.logger.error("Session delete received on topic: " + wCRequest3.getTopic() + " - unsubscribe error " + th);
                        }
                    });
                    OnSessionDeleteUseCase.this.sessionStorageRepository.deleteSession(this.$request.getTopic());
                    OnSessionDeleteUseCase.this.logger.log("Session delete received on topic: " + this.$request.getTopic() + " - emitting");
                    MutableSharedFlow mutableSharedFlow2 = OnSessionDeleteUseCase.this._events;
                    EngineDO.SessionDelete engineDO = EngineMapperKt.toEngineDO(this.$params, this.$request.getTopic());
                    this.L$0 = irnParams2;
                    this.label = 1;
                    if (mutableSharedFlow2.emit(engineDO, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    e = e;
                    irnParams = irnParams2;
                    OnSessionDeleteUseCase.this.logger.error("Session delete received failure on topic: " + this.$request.getTopic() + " - " + e);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionDeleteUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot delete a session: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionDeleteUseCase.this._events;
                    sDKError = new SDKError(e);
                    this.L$0 = null;
                    this.label = 2;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i == 1) {
                IrnParams irnParams3 = (IrnParams) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                } catch (Exception e2) {
                    e = e2;
                    irnParams = irnParams3;
                    OnSessionDeleteUseCase.this.logger.error("Session delete received failure on topic: " + this.$request.getTopic() + " - " + e);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionDeleteUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot delete a session: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionDeleteUseCase.this._events;
                    sDKError = new SDKError(e);
                    this.L$0 = null;
                    this.label = 2;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.DeleteParams deleteParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, deleteParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
