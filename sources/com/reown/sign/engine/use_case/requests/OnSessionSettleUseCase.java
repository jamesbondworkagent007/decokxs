package com.reown.sign.engine.use_case.requests;

import com.reown.android.Core;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Tags;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.utils.Time;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.utils.ExtensionsKt;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.exceptions.MessagesKt;
import com.reown.sign.common.exceptions.PeerError;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.common.validator.SignValidator;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.Map;
import kotlin.Triple;
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
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OnSessionSettleUseCase {
    public final MutableSharedFlow<EngineEvent> _events;
    public final KeyManagementRepository crypto;
    public final SharedFlow<EngineEvent> events;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final PairingControllerInterface pairingController;
    public final ProposalStorageRepository proposalStorageRepository;
    public final AppMetaData selfAppMetaData;
    public final SessionStorageRepository sessionStorageRepository;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEvents() {
        return this.events;
    }

    public OnSessionSettleUseCase(@NotNull KeyManagementRepository keyManagementRepository, @NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull AppMetaData appMetaData, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.crypto = keyManagementRepository;
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.proposalStorageRepository = proposalStorageRepository;
        this.sessionStorageRepository = sessionStorageRepository;
        this.pairingController = pairingControllerInterface;
        this.selfAppMetaData = appMetaData;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.use_case.requests.OnSessionSettleUseCase$invoke$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ WCRequest $request;
        public final /* synthetic */ SignParams.SessionSettleParams $settleParams;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WCRequest wCRequest, SignParams.SessionSettleParams sessionSettleParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$request = wCRequest;
            this.$settleParams = sessionSettleParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return OnSessionSettleUseCase.this.new AnonymousClass2(this.$request, this.$settleParams, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [70=10, 71=10, 72=10] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x049d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x04ce A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Topic topic;
            IrnParams irnParams;
            String str;
            ProposalVO proposalVO;
            ProposalVO proposalVO2;
            String message;
            MutableSharedFlow mutableSharedFlow;
            SDKError sDKError;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                OnSessionSettleUseCase.this.logger.log("Session settle received on topic: " + this.$request.getTopic());
                topic = this.$request.getTopic();
                irnParams = new IrnParams(Tags.SESSION_SETTLE_RESPONSE, new Ttl(Time.getFiveMinutesInSeconds()), false, 4, null);
                try {
                    String strMo7186getSelfPublicFromKeyAgreementp9DwDrs = OnSessionSettleUseCase.this.crypto.mo7186getSelfPublicFromKeyAgreementp9DwDrs(topic);
                    AppMetaData metadata = this.$settleParams.getController().getMetadata();
                    try {
                        ProposalVO proposalByKey$sign_release = OnSessionSettleUseCase.this.proposalStorageRepository.getProposalByKey$sign_release(strMo7186getSelfPublicFromKeyAgreementp9DwDrs);
                        OnSessionSettleUseCase.this.proposalStorageRepository.deleteProposal$sign_release(strMo7186getSelfPublicFromKeyAgreementp9DwDrs);
                        Triple triple = new Triple(proposalByKey$sign_release.getRequiredNamespaces(), proposalByKey$sign_release.getOptionalNamespaces(), proposalByKey$sign_release.getProperties());
                        Map map = (Map) triple.component1();
                        Map map2 = (Map) triple.component2();
                        Map map3 = (Map) triple.component3();
                        SignValidator signValidator = SignValidator.INSTANCE;
                        Map<String, Namespace.Session> namespaces = this.$settleParams.getNamespaces();
                        OnSessionSettleUseCase onSessionSettleUseCase = OnSessionSettleUseCase.this;
                        WCRequest wCRequest = this.$request;
                        if (namespaces.isEmpty()) {
                            ValidationError.EmptyNamespaces emptyNamespaces = ValidationError.EmptyNamespaces.INSTANCE;
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + emptyNamespaces);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(emptyNamespaces), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areNamespacesKeysProperlyFormatted(namespaces)) {
                            ValidationError.UnsupportedNamespaceKey unsupportedNamespaceKey = ValidationError.UnsupportedNamespaceKey.INSTANCE;
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + unsupportedNamespaceKey);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(unsupportedNamespaceKey), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainsNotEmpty(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_MISSING_MESSAGE);
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + unsupportedChains);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(unsupportedChains), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainIdsValid(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains2 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_CAIP_2_MESSAGE);
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + unsupportedChains2);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(unsupportedChains2), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areChainsInMatchingNamespace(namespaces)) {
                            ValidationError.UnsupportedChains unsupportedChains3 = new ValidationError.UnsupportedChains(MessagesKt.NAMESPACE_CHAINS_WRONG_NAMESPACE_MESSAGE);
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + unsupportedChains3);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(unsupportedChains3), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAccountIdsValid(namespaces)) {
                            ValidationError.UserRejectedChains userRejectedChains = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_CAIP_10_MESSAGE);
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + userRejectedChains);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(userRejectedChains), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAccountsInMatchingNamespaceAndChains(namespaces)) {
                            ValidationError.UserRejectedChains userRejectedChains2 = new ValidationError.UserRejectedChains(MessagesKt.NAMESPACE_ACCOUNTS_WRONG_NAMESPACE_MESSAGE);
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + userRejectedChains2);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(userRejectedChains2), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        str = "Session settle received failure: ";
                        if (!signValidator.areAllNamespacesApproved(namespaces.keySet(), map.keySet())) {
                            ValidationError.UserRejected userRejected = ValidationError.UserRejected.INSTANCE;
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + userRejected);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(userRejected), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAllMethodsApproved(signValidator.allMethodsWithChains(namespaces), signValidator.allMethodsWithChains(map))) {
                            ValidationError.UserRejectedMethods userRejectedMethods = ValidationError.UserRejectedMethods.INSTANCE;
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + userRejectedMethods);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(userRejectedMethods), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        if (!signValidator.areAllEventsApproved(signValidator.allEventsWithChains(namespaces), signValidator.allEventsWithChains(map))) {
                            ValidationError.UserRejectedEvents userRejectedEvents = ValidationError.UserRejectedEvents.INSTANCE;
                            onSessionSettleUseCase.logger.error("Session settle received failure - namespace validation: " + wCRequest.getTopic() + ", error: " + userRejectedEvents);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(onSessionSettleUseCase.jsonRpcInteractor, wCRequest, EngineMapperKt.toPeerError(userRejectedEvents), irnParams, null, null, null, null, 120, null);
                            return Unit.INSTANCE;
                        }
                        try {
                            proposalVO = proposalByKey$sign_release;
                        } catch (Exception e) {
                            e = e;
                            proposalVO = proposalByKey$sign_release;
                        }
                        try {
                            SessionVO sessionVOM7340createAcknowledgedSessionTrzEdc$sign_release = SessionVO.Companion.m7340createAcknowledgedSessionTrzEdc$sign_release(topic, this.$settleParams, strMo7186getSelfPublicFromKeyAgreementp9DwDrs, OnSessionSettleUseCase.this.selfAppMetaData, map, map2, map3, proposalByKey$sign_release.getPairingTopic().getValue());
                            OnSessionSettleUseCase.this.sessionStorageRepository.insertSession(sessionVOM7340createAcknowledgedSessionTrzEdc$sign_release, this.$request.getId());
                            PairingControllerInterface pairingControllerInterface = OnSessionSettleUseCase.this.pairingController;
                            String value = proposalVO.getPairingTopic().getValue();
                            Core.Model.AppMetaData client = ExtensionsKt.toClient(metadata);
                            AppMetaDataType appMetaDataType = AppMetaDataType.PEER;
                            PairingControllerInterface.DefaultImpls.updateMetadata$default(pairingControllerInterface, new Core.Params.UpdateMetadata(value, client, appMetaDataType), null, 2, null);
                            OnSessionSettleUseCase.this.metadataStorageRepository.insertOrAbortMetadata(topic, metadata, appMetaDataType);
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithSuccess$default(OnSessionSettleUseCase.this.jsonRpcInteractor, this.$request, irnParams, null, null, 12, null);
                            OnSessionSettleUseCase.this.logger.log("Session settle received on topic: " + this.$request.getTopic() + " - emitting");
                            MutableSharedFlow mutableSharedFlow2 = OnSessionSettleUseCase.this._events;
                            EngineDO.SessionApproved sessionApproved = EngineMapperKt.toSessionApproved(sessionVOM7340createAcknowledgedSessionTrzEdc$sign_release);
                            this.L$0 = topic;
                            this.L$1 = irnParams;
                            this.L$2 = proposalVO;
                            this.label = 1;
                            if (mutableSharedFlow2.emit(sessionApproved, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        } catch (Exception e2) {
                            e = e2;
                            objCopydefault = objCopydefault;
                            proposalVO2 = proposalVO;
                            IrnParams irnParams2 = irnParams;
                            OnSessionSettleUseCase.this.logger.error(str + this.$request.getTopic() + ", error: " + e);
                            OnSessionSettleUseCase.this.proposalStorageRepository.insertProposal$sign_release(proposalVO2);
                            OnSessionSettleUseCase.this.sessionStorageRepository.deleteSession(topic);
                            RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = OnSessionSettleUseCase.this.jsonRpcInteractor;
                            WCRequest wCRequest2 = this.$request;
                            message = e.getMessage();
                            if (message == null) {
                                message = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
                            }
                            RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface, wCRequest2, new PeerError.Failure.SessionSettlementFailed(message), irnParams2, null, null, null, null, 120, null);
                            mutableSharedFlow = OnSessionSettleUseCase.this._events;
                            sDKError = new SDKError(e);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 2;
                            if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e3) {
                        OnSessionSettleUseCase.this.logger.error("Session settle received failure: " + this.$request.getTopic() + ", error: " + e3);
                        RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface2 = OnSessionSettleUseCase.this.jsonRpcInteractor;
                        WCRequest wCRequest3 = this.$request;
                        String message2 = e3.getMessage();
                        if (message2 == null) {
                            message2 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
                        }
                        RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface2, wCRequest3, new PeerError.Failure.SessionSettlementFailed(message2), irnParams, null, null, null, null, 120, null);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e4) {
                    OnSessionSettleUseCase.this.logger.error("Session settle received failure: " + this.$request.getTopic() + ", error: " + e4);
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface3 = OnSessionSettleUseCase.this.jsonRpcInteractor;
                    WCRequest wCRequest4 = this.$request;
                    String message3 = e4.getMessage();
                    if (message3 == null) {
                        message3 = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
                    }
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface3, wCRequest4, new PeerError.Failure.SessionSettlementFailed(message3), irnParams, null, null, null, null, 120, null);
                    return Unit.INSTANCE;
                }
            }
            if (i == 1) {
                proposalVO2 = (ProposalVO) this.L$2;
                irnParams = (IrnParams) this.L$1;
                topic = (Topic) this.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                } catch (Exception e5) {
                    e = e5;
                    str = "Session settle received failure: ";
                    IrnParams irnParams22 = irnParams;
                    OnSessionSettleUseCase.this.logger.error(str + this.$request.getTopic() + ", error: " + e);
                    OnSessionSettleUseCase.this.proposalStorageRepository.insertProposal$sign_release(proposalVO2);
                    OnSessionSettleUseCase.this.sessionStorageRepository.deleteSession(topic);
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface4 = OnSessionSettleUseCase.this.jsonRpcInteractor;
                    WCRequest wCRequest22 = this.$request;
                    message = e.getMessage();
                    if (message == null) {
                    }
                    RelayJsonRpcInteractorInterface.DefaultImpls.respondWithError$default(relayJsonRpcInteractorInterface4, wCRequest22, new PeerError.Failure.SessionSettlementFailed(message), irnParams22, null, null, null, null, 120, null);
                    mutableSharedFlow = OnSessionSettleUseCase.this._events;
                    sDKError = new SDKError(e);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
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
            return Unit.INSTANCE;
        }
    }

    public final Object invoke(@NotNull WCRequest wCRequest, @NotNull SignParams.SessionSettleParams sessionSettleParams, @NotNull Continuation<? super Unit> continuation) {
        Object objSupervisorScope = SupervisorKt.supervisorScope(new AnonymousClass2(wCRequest, sessionSettleParams, null), continuation);
        return objSupervisorScope == C56442yFn.copydefault() ? objSupervisorScope : Unit.INSTANCE;
    }
}
