package com.reown.sign.engine.use_case.requests;

import com.reown.android.internal.common.exception.Uncategorized;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.utils.Time;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.PeerError;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
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
public final class OnSessionUpdateUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionUpdateUseCase(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull Logger logger) {
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

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionUpdateUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SignParams.UpdateNamespacesParams $params;
        public final /* synthetic */ WCRequest $request;
        public Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.UpdateNamespacesParams updateNamespacesParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$params = updateNamespacesParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionUpdateUseCase.this.new AnonymousClass2(this.$request, this.$params, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [53=10, 54=10, 55=10] */
        /* JADX DEBUG: Multi-variable search result rejected for r9v18, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX DEBUG: Multi-variable search result rejected for r9v19, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX DEBUG: Multi-variable search result rejected for r9v2, resolved type: com.reown.android.internal.common.model.IrnParams */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:90:0x057b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object obj2;
            IrnParams irnParams;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                IrnParams irnParams2 = new IrnParams(Tags.SESSION_UPDATE_RESPONSE, new Ttl(Time.getDayInSeconds()), false, 4, null);
                OnSessionUpdateUseCase.this.logger.log("Session update received on topic: " + this.$request.getTopic());
                try {
                    try {
                        if (!OnSessionUpdateUseCase.this.sessionStorageRepository.isSessionValid(this.$request.getTopic())) {
                            try {
                                OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - invalid session");
                                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionUpdateUseCase.this.jsonRpcInteractor;
                                WCRequest wCRequest = this.$request;
                                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest, new Uncategorized.NoMatchingTopic("SESSION", wCRequest.getTopic().getValue()), irnParams2, null, null, null, null, 120, null);
                                return Unit.INSTANCE;
                            } catch (Exception e) {
                                e = e;
                                obj = irnParams2;
                                obj2 = obj;
                                irnParams = obj2;
                                OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - " + e);
                                RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Invalid.UpdateRequest("Updating Namespace Failed. Review Namespace structure. Error: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                                mutableSharedFlow = OnSessionUpdateUseCase.this._events;
                                sDKError = new SDKError(e);
                                this.L$0 = null;
                                this.label = 2;
                                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        SessionVO sessionWithoutMetadataByTopic = OnSessionUpdateUseCase.this.sessionStorageRepository.getSessionWithoutMetadataByTopic(this.$request.getTopic());
                        if (!sessionWithoutMetadataByTopic.isPeerController()) {
                            OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - unauthorized peer");
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Unauthorized.UpdateRequest("SESSION"), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        SignValidator signValidator = SignValidator.INSTANCE;
                        Map<String, Namespace.Session> namespaces = this.$params.getNamespaces();
                        Map<String, Namespace.Proposal> requiredNamespaces = sessionWithoutMetadataByTopic.getRequiredNamespaces();
                        OnSessionUpdateUseCase onSessionUpdateUseCase = OnSessionUpdateUseCase.this;
                        WCRequest wCRequest2 = this.$request;
                        if (namespaces.isEmpty()) {
                            ValidationError.EmptyNamespaces emptyNamespaces = ValidationError.EmptyNamespaces.INSTANCE;
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + emptyNamespaces);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(emptyNamespaces.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areNamespacesKeysProperlyFormatted(namespaces)) {
                            ValidationError.UnsupportedNamespaceKey unsupportedNamespaceKey = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + unsupportedNamespaceKey);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(unsupportedNamespaceKey.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainsNotEmpty(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + unsupportedChains);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(unsupportedChains.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainIdsValid(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + unsupportedChains2);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(unsupportedChains2.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainsInMatchingNamespace(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + unsupportedChains3);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(unsupportedChains3.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAccountIdsValid(namespaces)) {
                            ValidationError.UserRejectedChains userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE);
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + userRejectedChains);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(userRejectedChains.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAccountsInMatchingNamespaceAndChains(namespaces)) {
                            ValidationError.UserRejectedChains userRejectedChains2 = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE);
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + userRejectedChains2);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(userRejectedChains2.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAllNamespacesApproved(namespaces.keySet(), requiredNamespaces.keySet())) {
                            ValidationError.UserRejected userRejected = ValidationError.UserRejected.INSTANCE;
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + userRejected);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(userRejected.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAllMethodsApproved(signValidator.allMethodsWithChains(namespaces), signValidator.allMethodsWithChains(requiredNamespaces))) {
                            ValidationError.UserRejectedMethods userRejectedMethods = ValidationError.UserRejectedMethods.INSTANCE;
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + userRejectedMethods);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(userRejectedMethods.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAllEventsApproved(signValidator.allEventsWithChains(namespaces), signValidator.allEventsWithChains(requiredNamespaces))) {
                            ValidationError.UserRejectedEvents userRejectedEvents = ValidationError.UserRejectedEvents.INSTANCE;
                            onSessionUpdateUseCase.logger.error("Session update received failure on topic: " + wCRequest2.getTopic() + " - namespaces validation: " + userRejectedEvents);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionUpdateUseCase.jsonRpcInteractor, wCRequest2, new PeerError.Invalid.UpdateRequest(userRejectedEvents.getMessage()), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!OnSessionUpdateUseCase.this.sessionStorageRepository.isUpdatedNamespaceValid(sessionWithoutMetadataByTopic.getTopic().getValue(), UtilFunctionsKt.extractTimestamp(this.$request.getId()))) {
                            OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - Update Namespace Request ID too old");
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Invalid.UpdateRequest("Update Namespace Request ID too old"), irnParams2, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        OnSessionUpdateUseCase.this.sessionStorageRepository.deleteNamespaceAndInsertNewNamespace(sessionWithoutMetadataByTopic.getTopic().getValue(), this.$params.getNamespaces(), this.$request.getId());
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithSuccess$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, irnParams2, null, null, 12, null);
                        OnSessionUpdateUseCase.this.logger.log("Session update received on topic: " + this.$request.getTopic() + " - emitting");
                        MutableSharedFlow mutableSharedFlow2 = OnSessionUpdateUseCase.this._events;
                        EngineDO.SessionUpdateNamespaces sessionUpdateNamespaces = new EngineDO.SessionUpdateNamespaces(this.$request.getTopic(), EngineMapperKt.toMapOfEngineNamespacesSession(this.$params.getNamespaces()));
                        obj2 = irnParams2;
                        try {
                            this.L$0 = obj2;
                            this.label = 1;
                            if (mutableSharedFlow2.emit(sessionUpdateNamespaces, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            e = e2;
                            irnParams = obj2;
                            OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - " + e);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Invalid.UpdateRequest("Updating Namespace Failed. Review Namespace structure. Error: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                            mutableSharedFlow = OnSessionUpdateUseCase.this._events;
                            sDKError = new SDKError(e);
                            this.L$0 = null;
                            this.label = 2;
                            if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Exception e4) {
                    e = e4;
                    obj2 = irnParams2;
                }
            } else {
                if (i == 1) {
                    IrnParams irnParams3 = (IrnParams) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    } catch (Exception e5) {
                        e = e5;
                        irnParams = irnParams3;
                        OnSessionUpdateUseCase.this.logger.error("Session update received failure on topic: " + this.$request.getTopic() + " - " + e);
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(OnSessionUpdateUseCase.this.jsonRpcInteractor, this.$request, new PeerError.Invalid.UpdateRequest("Updating Namespace Failed. Review Namespace structure. Error: " + e.getMessage() + ", topic: " + this.$request.getTopic()), irnParams, null, null, null, null, 120, null);
                        mutableSharedFlow = OnSessionUpdateUseCase.this._events;
                        sDKError = new SDKError(e);
                        this.L$0 = null;
                        this.label = 2;
                        if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.UpdateNamespacesParams updateNamespacesParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, updateNamespacesParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
