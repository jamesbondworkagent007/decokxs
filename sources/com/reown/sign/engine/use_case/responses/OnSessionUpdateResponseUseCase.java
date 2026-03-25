package com.reown.sign.engine.use_case.responses;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
public final class OnSessionUpdateResponseUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final SharedFlow<EngineEvent> events;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionUpdateResponseUseCase(@NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionUpdateResponseUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WCResponse $wcResponse;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCResponse wCResponse, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$wcResponse = wCResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionUpdateResponseUseCase.this.new AnonymousClass2(this.$wcResponse, continuation);
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
                    OnSessionUpdateResponseUseCase.this.logger.log("Session update namespaces response received on topic: " + this.$wcResponse.getTopic());
                    Topic topic = this.$wcResponse.getTopic();
                    if (!OnSessionUpdateResponseUseCase.this.sessionStorageRepository.isSessionValid(topic)) {
                        return Unit.INSTANCE;
                    }
                    SessionVO sessionWithoutMetadataByTopic = OnSessionUpdateResponseUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(topic);
                    if (!OnSessionUpdateResponseUseCase.this.sessionStorageRepository.isUpdatedNamespaceResponseValid(sessionWithoutMetadataByTopic.getTopic().getValue(), UtilFunctionsKt.extractTimestamp(this.$wcResponse.getResponse().getId()))) {
                        OnSessionUpdateResponseUseCase.this.logger.error("Session update namespaces response error: invalid namespaces");
                        return Unit.INSTANCE;
                    }
                    JsonRpcResponse response = this.$wcResponse.getResponse();
                    if (response instanceof JsonRpcResponse.JsonRpcResult) {
                        OnSessionUpdateResponseUseCase.this.logger.log("Session update namespaces response received on topic: " + this.$wcResponse.getTopic());
                        long id = this.$wcResponse.getResponse().getId();
                        Map tempNamespaces = OnSessionUpdateResponseUseCase.this.sessionStorageRepository.getTempNamespaces(id);
                        OnSessionUpdateResponseUseCase.this.sessionStorageRepository.deleteNamespaceAndInsertNewNamespace(sessionWithoutMetadataByTopic.getTopic().getValue(), tempNamespaces, id);
                        OnSessionUpdateResponseUseCase.this.sessionStorageRepository.markUnAckNamespaceAcknowledged(id);
                        MutableSharedFlow mutableSharedFlow = OnSessionUpdateResponseUseCase.this._events;
                        EngineDO.SessionUpdateNamespacesResponse.Result result = new EngineDO.SessionUpdateNamespacesResponse.Result(sessionWithoutMetadataByTopic.getTopic(), EngineMapperKt.toMapOfEngineNamespacesSession(tempNamespaces));
                        this.label = 1;
                        if (mutableSharedFlow.emit(result, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                        OnSessionUpdateResponseUseCase.this.logger.error("Peer failed to update session namespaces: " + ((JsonRpcResponse.JsonRpcError) response).getError() + " on topic: " + this.$wcResponse.getTopic());
                        MutableSharedFlow mutableSharedFlow2 = OnSessionUpdateResponseUseCase.this._events;
                        EngineDO.SessionUpdateNamespacesResponse.Error error = new EngineDO.SessionUpdateNamespacesResponse.Error(((JsonRpcResponse.JsonRpcError) response).getErrorMessage());
                        this.label = 2;
                        if (mutableSharedFlow2.emit(error, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i != 1 && i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                OnSessionUpdateResponseUseCase.this.logger.error("Peer failed to update session namespaces: " + e);
                MutableSharedFlow mutableSharedFlow3 = OnSessionUpdateResponseUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.label = 3;
                if (mutableSharedFlow3.emit(sDKError, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCResponse wCResponse, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCResponse, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
