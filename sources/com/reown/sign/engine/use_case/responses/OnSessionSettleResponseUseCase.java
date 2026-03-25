package com.reown.sign.engine.use_case.responses;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
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
public final class OnSessionSettleResponseUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionSettleResponseUseCase(@NotNull SessionStorageRepository sessionStorageRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull KeyManagementRepository keyManagementRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.sessionStorageRepository = sessionStorageRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.crypto = keyManagementRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.responses.OnSessionSettleResponseUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WCResponse $wcResponse;
        public /* synthetic */ Object L$0;
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
            AnonymousClass2 anonymousClass2 = OnSessionSettleResponseUseCase.this.new AnonymousClass2(this.$wcResponse, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
                    final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    OnSessionSettleResponseUseCase.this.logger.log("Session settle response received on topic: " + this.$wcResponse.getTopic());
                    final Topic topic = this.$wcResponse.getTopic();
                    if (!OnSessionSettleResponseUseCase.this.sessionStorageRepository.isSessionValid(topic)) {
                        OnSessionSettleResponseUseCase.this.logger.error("Peer failed to settle session: invalid session");
                        return Unit.INSTANCE;
                    }
                    SessionVO sessionWithoutMetadataByTopic = OnSessionSettleResponseUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(topic);
                    SessionVO sessionVOM7336copyBsNgfLQ = sessionWithoutMetadataByTopic.m7336copyBsNgfLQ((65215 & 1) != 0 ? sessionWithoutMetadataByTopic.topic : null, (65215 & 2) != 0 ? sessionWithoutMetadataByTopic.expiry : null, (65215 & 4) != 0 ? sessionWithoutMetadataByTopic.relayProtocol : null, (65215 & 8) != 0 ? sessionWithoutMetadataByTopic.relayData : null, (65215 & 16) != 0 ? sessionWithoutMetadataByTopic.controllerKey : null, (65215 & 32) != 0 ? sessionWithoutMetadataByTopic.selfPublicKey : null, (65215 & 64) != 0 ? sessionWithoutMetadataByTopic.selfAppMetaData : sessionWithoutMetadataByTopic.getSelfAppMetaData(), (65215 & 128) != 0 ? sessionWithoutMetadataByTopic.peerPublicKey : null, (65215 & 256) != 0 ? sessionWithoutMetadataByTopic.peerAppMetaData : OnSessionSettleResponseUseCase.this.metadataStorageRepository.getByTopicAndType(sessionWithoutMetadataByTopic.getTopic(), AppMetaDataType.PEER), (65215 & 512) != 0 ? sessionWithoutMetadataByTopic.sessionNamespaces : null, (65215 & 1024) != 0 ? sessionWithoutMetadataByTopic.requiredNamespaces : null, (65215 & 2048) != 0 ? sessionWithoutMetadataByTopic.optionalNamespaces : null, (65215 & 4096) != 0 ? sessionWithoutMetadataByTopic.properties : null, (65215 & 8192) != 0 ? sessionWithoutMetadataByTopic.isAcknowledged : false, (65215 & 16384) != 0 ? sessionWithoutMetadataByTopic.pairingTopic : null, (65215 & 32768) != 0 ? sessionWithoutMetadataByTopic.transportType : null);
                    JsonRpcResponse response = this.$wcResponse.getResponse();
                    if (response instanceof JsonRpcResponse.JsonRpcResult) {
                        OnSessionSettleResponseUseCase.this.logger.log("Session settle success received");
                        OnSessionSettleResponseUseCase.this.sessionStorageRepository.acknowledgeSession(topic);
                        MutableSharedFlow mutableSharedFlow = OnSessionSettleResponseUseCase.this._events;
                        EngineDO.SettledSessionResponse.Result result = new EngineDO.SettledSessionResponse.Result(EngineMapperKt.toEngineDO(sessionVOM7336copyBsNgfLQ));
                        this.label = 1;
                        if (mutableSharedFlow.emit(result, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (response instanceof JsonRpcResponse.JsonRpcError) {
                        Logger logger = OnSessionSettleResponseUseCase.this.logger;
                        JsonRpcResponse response2 = this.$wcResponse.getResponse();
                        Intrinsics.copydefault(response2, "");
                        logger.error("Peer failed to settle session: " + ((JsonRpcResponse.JsonRpcError) response2).getErrorMessage());
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionSettleResponseUseCase.this.jsonRpcInteractor;
                        final OnSessionSettleResponseUseCase onSessionSettleResponseUseCase = OnSessionSettleResponseUseCase.this;
                        RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(relayJsonRpcInteractorInterface, topic, new Function0<Unit>() { // from class: com.reown.sign.engine.use_case.responses.OnSessionSettleResponseUseCase.invoke.2.1
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
                                Object objM7377constructorimpl;
                                OnSessionSettleResponseUseCase onSessionSettleResponseUseCase2 = onSessionSettleResponseUseCase;
                                Topic topic2 = topic;
                                try {
                                    Result.Application application = Result.Companion;
                                    onSessionSettleResponseUseCase2.sessionStorageRepository.deleteSession(topic2);
                                    onSessionSettleResponseUseCase2.crypto.removeKeys(topic2.getValue());
                                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                                } catch (Throwable th) {
                                    Result.Application application2 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                }
                                OnSessionSettleResponseUseCase onSessionSettleResponseUseCase3 = onSessionSettleResponseUseCase;
                                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                                if (thM7380exceptionOrNullimpl != null) {
                                    onSessionSettleResponseUseCase3.logger.error(thM7380exceptionOrNullimpl);
                                }
                            }
                        }, null, 4, null);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
            } catch (Exception e) {
                OnSessionSettleResponseUseCase.this.logger.error("Peer failed to settle session: " + e);
                MutableSharedFlow mutableSharedFlow2 = OnSessionSettleResponseUseCase.this._events;
                SDKError sDKError = new SDKError(e);
                this.label = 2;
                if (mutableSharedFlow2.emit(sDKError, this) == objCopydefault) {
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
