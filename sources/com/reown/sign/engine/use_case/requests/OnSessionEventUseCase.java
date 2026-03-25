package com.reown.sign.engine.use_case.requests;

import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.PeerError;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionEventVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import java.util.List;
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
public final class OnSessionEventUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionEventUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.sessionStorageRepository = sessionStorageRepository;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionEventUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.EventParams $params;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.EventParams eventParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$params = eventParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionEventUseCase.this.new AnonymousClass2(this.$request, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[RETURN] */
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
                OnSessionEventUseCase.this.logger.log("Session event received on topic: " + this.$request.getTopic());
                IrnParams irnParams2 = new IrnParams(Tags.SESSION_EVENT_RESPONSE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                try {
                    SignValidator signValidator = SignValidator.INSTANCE;
                    EngineDO.Event engineDOEvent = EngineMapperKt.toEngineDOEvent(this.$params);
                    OnSessionEventUseCase onSessionEventUseCase = OnSessionEventUseCase.this;
                    WCRequest wCRequest = this.$request;
                    if (engineDOEvent.getData().length() != 0 && engineDOEvent.getName().length() != 0 && engineDOEvent.getChainId().length() != 0 && CoreValidator.INSTANCE.isChainIdCAIP2Compliant(engineDOEvent.getChainId())) {
                        if (!OnSessionEventUseCase.this.sessionStorageRepository.isSessionValid(this.$request.getTopic())) {
                            OnSessionEventUseCase.this.logger.error("Session event received failure on topic: " + this.$request.getTopic() + " - invalid session");
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionEventUseCase.this.jsonRpcInteractor;
                            WCRequest wCRequest2 = this.$request;
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest2, new Uncategorized.NoMatchingTopic("SESSION", wCRequest2.getTopic().getValue()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        SessionVO sessionWithoutMetadataByTopic = OnSessionEventUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(this.$request.getTopic());
                        if (!sessionWithoutMetadataByTopic.isPeerController()) {
                            OnSessionEventUseCase.this.logger.error("Session event received failure on topic: " + this.$request.getTopic() + " - unauthorized peer");
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionEventUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Unauthorized.Event("SESSION"), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!sessionWithoutMetadataByTopic.isAcknowledged()) {
                            OnSessionEventUseCase.this.logger.error("Session event received failure on topic: " + this.$request.getTopic() + " - no matching topic");
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface2 = OnSessionEventUseCase.this.jsonRpcInteractor;
                            WCRequest wCRequest3 = this.$request;
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface2, wCRequest3, new Uncategorized.NoMatchingTopic("SESSION", wCRequest3.getTopic().getValue()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        SessionEventVO event = this.$params.getEvent();
                        String chainId = this.$params.getChainId();
                        String name = event.getName();
                        Map<String, Namespace.Session> sessionNamespaces = sessionWithoutMetadataByTopic.getSessionNamespaces();
                        OnSessionEventUseCase onSessionEventUseCase2 = OnSessionEventUseCase.this;
                        WCRequest wCRequest4 = this.$request;
                        Map mapAllEventsWithChains = signValidator.allEventsWithChains(sessionNamespaces);
                        if (mapAllEventsWithChains.get(name) != null) {
                            Object obj2 = mapAllEventsWithChains.get(name);
                            Intrinsics.copydefault(obj2);
                            if (((List) obj2).contains(chainId)) {
                                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithSuccess$default(OnSessionEventUseCase.this.jsonRpcInteractor, this.$request, irnParams2, null, null, 12, null);
                                OnSessionEventUseCase.this.logger.log("Session event received on topic: " + this.$request.getTopic() + " - emitting");
                                MutableSharedFlow mutableSharedFlow2 = OnSessionEventUseCase.this._events;
                                EngineDO.SessionEvent engineDO = EngineMapperKt.toEngineDO(this.$params, this.$request.getTopic());
                                this.L$0 = irnParams2;
                                this.label = 1;
                                if (mutableSharedFlow2.emit(engineDO, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        ValidationError.UnauthorizedEvent unauthorizedEvent = ValidationError.UnauthorizedEvent.INSTANCE;
                        onSessionEventUseCase2.logger.error("Session event received failure on topic: " + wCRequest4.getTopic() + " - " + unauthorizedEvent);
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionEventUseCase2.jsonRpcInteractor, wCRequest4, EngineMapperKt.toPeerError(unauthorizedEvent), irnParams2, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                    ValidationError.InvalidEvent invalidEvent = ValidationError.InvalidEvent.INSTANCE;
                    onSessionEventUseCase.logger.error("Session event received failure on topic: " + wCRequest.getTopic() + " - " + invalidEvent);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionEventUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(invalidEvent), irnParams2, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                } catch (Exception e) {
                    e = e;
                    irnParams = irnParams2;
                    OnSessionEventUseCase.this.logger.error("Session event received failure on topic: " + this.$request.getTopic() + " - " + e);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionEventUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot emit an event: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionEventUseCase.this._events;
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
                    OnSessionEventUseCase.this.logger.error("Session event received failure on topic: " + this.$request.getTopic() + " - " + e);
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionEventUseCase.this.jsonRpcInteractor, this.$request, new Uncategorized.GenericError("Cannot emit an event: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionEventUseCase.this._events;
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

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.EventParams eventParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, eventParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
