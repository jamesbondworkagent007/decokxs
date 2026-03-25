package com.reown.sign.engine.domain;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.reown.android.Core;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.model.AppMetaDataType;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Pairing;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.WCResponse;
import com.reown.android.internal.common.model.type.ClientParams;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.storage.metadata.MetadataStorageRepositoryInterface;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.internal.utils.CoreValidator;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pulse.domain.InsertTelemetryEventUseCase;
import com.reown.android.pulse.model.EventType;
import com.reown.android.pulse.model.Trace;
import com.reown.android.pulse.model.properties.Properties;
import com.reown.android.pulse.model.properties.Props;
import com.reown.android.push.notifications.DecryptMessageUseCaseInterface;
import com.reown.android.relay.WSSConnectionState;
import com.reown.android.verify.model.VerifyContext;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.util.Logger;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.DisconnectSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.EmitEventUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ExtendSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetPairingsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetPendingAuthenticateRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetSessionsUseCaseInterface;
import com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCaseInterface;
import com.reown.sign.engine.use_case.calls.PairUseCaseInterface;
import com.reown.sign.engine.use_case.calls.PingUseCaseInterface;
import com.reown.sign.engine.use_case.calls.ProposeSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RejectSessionUseCaseInterface;
import com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface;
import com.reown.sign.engine.use_case.calls.SessionUpdateUseCaseInterface;
import com.reown.sign.engine.use_case.requests.OnPingUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionAuthenticateUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionDeleteUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionEventUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionExtendUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionProposalUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionRequestUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionSettleUseCase;
import com.reown.sign.engine.use_case.requests.OnSessionUpdateUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionAuthenticateResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionProposalResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionRequestResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionSettleResponseUseCase;
import com.reown.sign.engine.use_case.responses.OnSessionUpdateResponseUseCase;
import com.reown.sign.json_rpc.domain.DeleteRequestByIdUseCase;
import com.reown.sign.json_rpc.domain.GetPendingRequestsUseCaseByTopicInterface;
import com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCaseInterface;
import com.reown.sign.json_rpc.domain.GetPendingSessionRequests;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import com.reown.sign.storage.authenticate.AuthenticateResponseTopicRepository;
import com.reown.sign.storage.proposal.ProposalStorageRepository;
import com.reown.sign.storage.sequence.SessionStorageRepository;
import com.reown.utils.UtilFunctionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignEngine implements ProposeSessionUseCaseInterface, SessionAuthenticateUseCaseInterface, PairUseCaseInterface, RejectSessionUseCaseInterface, ApproveSessionUseCaseInterface, ApproveSessionAuthenticateUseCaseInterface, RejectSessionAuthenticateUseCaseInterface, SessionUpdateUseCaseInterface, SessionRequestUseCaseInterface, RespondSessionRequestUseCaseInterface, PingUseCaseInterface, FormatAuthenticateMessageUseCaseInterface, EmitEventUseCaseInterface, ExtendSessionUseCaseInterface, DisconnectSessionUseCaseInterface, DecryptMessageUseCaseInterface, GetSessionsUseCaseInterface, GetPairingsUseCaseInterface, GetPendingRequestsUseCaseByTopicInterface, GetPendingAuthenticateRequestUseCaseInterface, GetPendingSessionRequestByTopicUseCaseInterface, GetSessionProposalsUseCaseInterface, GetVerifyContextByIdUseCaseInterface, GetListOfVerifyContextsUseCaseInterface, LinkModeJsonRpcInteractorInterface {
    public static final Companion Companion = new Companion(null);
    public static final long WATCHER_INTERVAL = 30000;
    public final MutableSharedFlow<EngineEvent> _engineEvent;
    public final ApproveSessionAuthenticateUseCaseInterface approveSessionAuthenticateUseCase;
    public final ApproveSessionUseCaseInterface approveSessionUseCase;
    public final AuthenticateResponseTopicRepository authenticateResponseTopicRepository;
    public final SessionAuthenticateUseCaseInterface authenticateSessionUseCase;
    public final KeyManagementRepository crypto;
    public final DecryptMessageUseCaseInterface decryptMessageUseCase;
    public final DeleteRequestByIdUseCase deleteRequestByIdUseCase;
    public final DisconnectSessionUseCaseInterface disconnectSessionUseCase;
    public final EmitEventUseCaseInterface emitEventUseCase;
    public final SharedFlow<EngineEvent> engineEvent;
    public Job envelopeRequestsJob;
    public Job envelopeResponsesJob;
    public final ExtendSessionUseCaseInterface extendSessionUseCase;
    public final FormatAuthenticateMessageUseCaseInterface formatAuthenticateMessageUseCase;
    public final GetListOfVerifyContextsUseCaseInterface getListOfVerifyContextsUseCase;
    public final GetPairingsUseCaseInterface getPairingsUseCase;
    public final GetPendingAuthenticateRequestUseCaseInterface getPendingAuthenticateRequestUseCase;
    public final GetPendingRequestsUseCaseByTopicInterface getPendingRequestsByTopicUseCase;
    public final GetPendingSessionRequestByTopicUseCaseInterface getPendingSessionRequestByTopicUseCase;
    public final GetPendingSessionRequests getPendingSessionRequests;
    public final GetSessionProposalsUseCaseInterface getSessionProposalsUseCase;
    public final GetSessionsUseCaseInterface getSessionsUseCase;
    public final GetVerifyContextByIdUseCaseInterface getVerifyContextByIdUseCase;
    public final InsertTelemetryEventUseCase insertEventUseCase;
    public Job internalErrorsJob;
    public final RelayJsonRpcInteractorInterface jsonRpcInteractor;
    public Job jsonRpcRequestsJob;
    public Job jsonRpcResponsesJob;
    public final LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractor;
    public final Logger logger;
    public final MetadataStorageRepositoryInterface metadataStorageRepository;
    public final OnSessionAuthenticateUseCase onAuthenticateSessionUseCase;
    public final OnPingUseCase onPingUseCase;
    public final OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase;
    public final OnSessionDeleteUseCase onSessionDeleteUseCase;
    public final OnSessionEventUseCase onSessionEventUseCase;
    public final OnSessionExtendUseCase onSessionExtendUseCase;
    public final OnSessionProposalResponseUseCase onSessionProposalResponseUseCase;
    public final OnSessionProposalUseCase onSessionProposeUse;
    public final OnSessionRequestResponseUseCase onSessionRequestResponseUseCase;
    public final OnSessionRequestUseCase onSessionRequestUseCase;
    public final OnSessionSettleResponseUseCase onSessionSettleResponseUseCase;
    public final OnSessionSettleUseCase onSessionSettleUseCase;
    public final OnSessionUpdateResponseUseCase onSessionUpdateResponseUseCase;
    public final OnSessionUpdateUseCase onSessionUpdateUseCase;
    public final PairUseCaseInterface pairUseCase;
    public final PairingControllerInterface pairingController;
    public final PingUseCaseInterface pingUseCase;
    public final ProposalStorageRepository proposalStorageRepository;
    public final ProposeSessionUseCaseInterface proposeSessionUseCase;
    public final RejectSessionAuthenticateUseCaseInterface rejectSessionAuthenticateUseCase;
    public final RejectSessionUseCaseInterface rejectSessionUseCase;
    public final RespondSessionRequestUseCaseInterface respondSessionRequestUseCase;
    public final SessionRequestUseCaseInterface sessionRequestUseCase;
    public final SessionStorageRepository sessionStorageRepository;
    public final SessionUpdateUseCaseInterface sessionUpdateUseCase;
    public Job signEventsJob;
    public final VerifyContextStorageRepository verifyContextStorageRepository;
    public final StateFlow<WSSConnectionState> wssConnection;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.ApproveSessionUseCaseInterface
    public Object approve(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.approveSessionUseCase.approve(str, map, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.ApproveSessionAuthenticateUseCaseInterface
    public Object approveSessionAuthenticate(long j, @NotNull List<Cacao> list, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.approveSessionAuthenticateUseCase.approveSessionAuthenticate(j, list, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.SessionAuthenticateUseCaseInterface
    public Object authenticate(@NotNull EngineDO.Authenticate authenticate, List<String> list, String str, Expiry expiry, String str2, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        return this.authenticateSessionUseCase.authenticate(authenticate, list, str, expiry, str2, function1, function12, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.push.notifications.DecryptMessageUseCaseInterface
    public Object decryptNotification(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Core.Model.Message, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        return this.decryptMessageUseCase.decryptNotification(str, str2, function1, function12, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.DisconnectSessionUseCaseInterface
    public Object disconnect(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.disconnectSessionUseCase.disconnect(str, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void dispatchEnvelope(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.linkModeJsonRpcInteractor.dispatchEnvelope(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.EmitEventUseCaseInterface
    public Object emit(@NotNull String str, @NotNull EngineDO.Event event, Long l, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.emitEventUseCase.emit(str, event, l, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.ExtendSessionUseCaseInterface
    public Object extend(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.extendSessionUseCase.extend(str, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.FormatAuthenticateMessageUseCaseInterface
    public Object formatMessage(@NotNull EngineDO.PayloadParams payloadParams, @NotNull String str, @NotNull Continuation<? super String> continuation) {
        return this.formatAuthenticateMessageUseCase.formatMessage(payloadParams, str, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCRequest> getClientSyncJsonRpc() {
        return this.linkModeJsonRpcInteractor.getClientSyncJsonRpc();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<EngineEvent> getEngineEvent() {
        return this.engineEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface
    public SharedFlow<SDKError> getErrors() {
        return this.sessionRequestUseCase.getErrors();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface
    public SharedFlow<EngineEvent> getEvents() {
        return this.respondSessionRequestUseCase.getEvents();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<SDKError> getInternalErrors() {
        return this.linkModeJsonRpcInteractor.getInternalErrors();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetPairingsUseCaseInterface
    public Object getListOfSettledPairings(@NotNull Continuation<? super List<EngineDO.PairingSettle>> continuation) {
        return this.getPairingsUseCase.getListOfSettledPairings(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetSessionsUseCaseInterface
    public Object getListOfSettledSessions(@NotNull Continuation<? super List<EngineDO.Session>> continuation) {
        return this.getSessionsUseCase.getListOfSettledSessions(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetListOfVerifyContextsUseCaseInterface
    public Object getListOfVerifyContexts(@NotNull Continuation<? super List<EngineDO.VerifyContext>> continuation) {
        return this.getListOfVerifyContextsUseCase.getListOfVerifyContexts(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.JsonRpcInteractorInterface
    public SharedFlow<WCResponse> getPeerResponse() {
        return this.linkModeJsonRpcInteractor.getPeerResponse();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetPendingAuthenticateRequestUseCaseInterface
    public Object getPendingAuthenticateRequests(@NotNull Continuation<? super List<Request<SignParams.SessionAuthenticateParams>>> continuation) {
        return this.getPendingAuthenticateRequestUseCase.getPendingAuthenticateRequests(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.json_rpc.domain.GetPendingRequestsUseCaseByTopicInterface
    public Object getPendingRequests(@NotNull Topic topic, @NotNull Continuation<? super List<Request<String>>> continuation) {
        return this.getPendingRequestsByTopicUseCase.getPendingRequests(topic, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.json_rpc.domain.GetPendingSessionRequestByTopicUseCaseInterface
    public Object getPendingSessionRequests(@NotNull Topic topic, @NotNull Continuation<? super List<EngineDO.SessionRequest>> continuation) {
        return this.getPendingSessionRequestByTopicUseCase.getPendingSessionRequests(topic, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetSessionProposalsUseCaseInterface
    public Object getSessionProposals(@NotNull Continuation<? super List<EngineDO.SessionProposal>> continuation) {
        return this.getSessionProposalsUseCase.getSessionProposals(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.GetVerifyContextByIdUseCaseInterface
    public Object getVerifyContext(long j, @NotNull Continuation<? super EngineDO.VerifyContext> continuation) {
        return this.getVerifyContextByIdUseCase.getVerifyContext(j, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<WSSConnectionState> getWssConnection() {
        return this.wssConnection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.PairUseCaseInterface
    public Object pair(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.pairUseCase.pair(str, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.PingUseCaseInterface
    /* JADX INFO: renamed from: ping-zkXUZaI, reason: not valid java name */
    public Object mo7342pingzkXUZaI(@NotNull String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, long j, @NotNull Continuation<? super Unit> continuation) {
        return this.pingUseCase.mo7342pingzkXUZaI(str, function1, function12, j, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.ProposeSessionUseCaseInterface
    public Object proposeSession(Map<String, EngineDO.Namespace.Proposal> map, Map<String, EngineDO.Namespace.Proposal> map2, Map<String, String> map3, @NotNull Pairing pairing, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.proposeSessionUseCase.proposeSession(map, map2, map3, pairing, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.RejectSessionUseCaseInterface
    public Object reject(@NotNull String str, @NotNull String str2, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.rejectSessionUseCase.reject(str, str2, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.RejectSessionAuthenticateUseCaseInterface
    public Object rejectSessionAuthenticate(long j, @NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.rejectSessionAuthenticateUseCase.rejectSessionAuthenticate(j, str, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.RespondSessionRequestUseCaseInterface
    public Object respondSessionRequest(@NotNull String str, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.respondSessionRequestUseCase.respondSessionRequest(str, jsonRpcResponse, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.SessionRequestUseCaseInterface
    public Object sessionRequest(@NotNull EngineDO.Request request, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        return this.sessionRequestUseCase.sessionRequest(request, function1, function12, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.sign.engine.use_case.calls.SessionUpdateUseCaseInterface
    public Object sessionUpdate(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return this.sessionUpdateUseCase.sessionUpdate(str, map, function0, function1, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void triggerRequest(@NotNull JsonRpcClientSync<?> jsonRpcClientSync, @NotNull Topic topic, @NotNull String str, @NotNull EnvelopeType envelopeType) {
        Intrinsics.checkNotNullParameter(jsonRpcClientSync, "");
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        this.linkModeJsonRpcInteractor.triggerRequest(jsonRpcClientSync, topic, str, envelopeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface
    public void triggerResponse(@NotNull Topic topic, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull String str, Participants participants, @NotNull EnvelopeType envelopeType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(envelopeType, "");
        this.linkModeJsonRpcInteractor.triggerResponse(topic, jsonRpcResponse, str, participants, envelopeType);
    }

    public SignEngine(@NotNull RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, @NotNull GetPendingRequestsUseCaseByTopicInterface getPendingRequestsUseCaseByTopicInterface, @NotNull GetPendingSessionRequestByTopicUseCaseInterface getPendingSessionRequestByTopicUseCaseInterface, @NotNull GetPendingSessionRequests getPendingSessionRequests, @NotNull GetPendingAuthenticateRequestUseCaseInterface getPendingAuthenticateRequestUseCaseInterface, @NotNull DeleteRequestByIdUseCase deleteRequestByIdUseCase, @NotNull KeyManagementRepository keyManagementRepository, @NotNull AuthenticateResponseTopicRepository authenticateResponseTopicRepository, @NotNull ProposalStorageRepository proposalStorageRepository, @NotNull SessionStorageRepository sessionStorageRepository, @NotNull MetadataStorageRepositoryInterface metadataStorageRepositoryInterface, @NotNull PairingControllerInterface pairingControllerInterface, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull ProposeSessionUseCaseInterface proposeSessionUseCaseInterface, @NotNull SessionAuthenticateUseCaseInterface sessionAuthenticateUseCaseInterface, @NotNull PairUseCaseInterface pairUseCaseInterface, @NotNull RejectSessionUseCaseInterface rejectSessionUseCaseInterface, @NotNull ApproveSessionUseCaseInterface approveSessionUseCaseInterface, @NotNull ApproveSessionAuthenticateUseCaseInterface approveSessionAuthenticateUseCaseInterface, @NotNull RejectSessionAuthenticateUseCaseInterface rejectSessionAuthenticateUseCaseInterface, @NotNull SessionUpdateUseCaseInterface sessionUpdateUseCaseInterface, @NotNull SessionRequestUseCaseInterface sessionRequestUseCaseInterface, @NotNull RespondSessionRequestUseCaseInterface respondSessionRequestUseCaseInterface, @NotNull PingUseCaseInterface pingUseCaseInterface, @NotNull FormatAuthenticateMessageUseCaseInterface formatAuthenticateMessageUseCaseInterface, @NotNull EmitEventUseCaseInterface emitEventUseCaseInterface, @NotNull ExtendSessionUseCaseInterface extendSessionUseCaseInterface, @NotNull DisconnectSessionUseCaseInterface disconnectSessionUseCaseInterface, @NotNull DecryptMessageUseCaseInterface decryptMessageUseCaseInterface, @NotNull GetSessionsUseCaseInterface getSessionsUseCaseInterface, @NotNull GetPairingsUseCaseInterface getPairingsUseCaseInterface, @NotNull GetSessionProposalsUseCaseInterface getSessionProposalsUseCaseInterface, @NotNull GetVerifyContextByIdUseCaseInterface getVerifyContextByIdUseCaseInterface, @NotNull GetListOfVerifyContextsUseCaseInterface getListOfVerifyContextsUseCaseInterface, @NotNull OnSessionProposalUseCase onSessionProposalUseCase, @NotNull OnSessionAuthenticateUseCase onSessionAuthenticateUseCase, @NotNull OnSessionSettleUseCase onSessionSettleUseCase, @NotNull OnSessionRequestUseCase onSessionRequestUseCase, @NotNull OnSessionDeleteUseCase onSessionDeleteUseCase, @NotNull OnSessionEventUseCase onSessionEventUseCase, @NotNull OnSessionUpdateUseCase onSessionUpdateUseCase, @NotNull OnSessionExtendUseCase onSessionExtendUseCase, @NotNull OnPingUseCase onPingUseCase, @NotNull OnSessionProposalResponseUseCase onSessionProposalResponseUseCase, @NotNull OnSessionAuthenticateResponseUseCase onSessionAuthenticateResponseUseCase, @NotNull OnSessionSettleResponseUseCase onSessionSettleResponseUseCase, @NotNull OnSessionUpdateResponseUseCase onSessionUpdateResponseUseCase, @NotNull OnSessionRequestResponseUseCase onSessionRequestResponseUseCase, @NotNull InsertTelemetryEventUseCase insertTelemetryEventUseCase, @NotNull LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(relayJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(getPendingRequestsUseCaseByTopicInterface, "");
        Intrinsics.checkNotNullParameter(getPendingSessionRequestByTopicUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getPendingSessionRequests, "");
        Intrinsics.checkNotNullParameter(getPendingAuthenticateRequestUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(deleteRequestByIdUseCase, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(authenticateResponseTopicRepository, "");
        Intrinsics.checkNotNullParameter(proposalStorageRepository, "");
        Intrinsics.checkNotNullParameter(sessionStorageRepository, "");
        Intrinsics.checkNotNullParameter(metadataStorageRepositoryInterface, "");
        Intrinsics.checkNotNullParameter(pairingControllerInterface, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(proposeSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(sessionAuthenticateUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(pairUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(rejectSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(approveSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(approveSessionAuthenticateUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(rejectSessionAuthenticateUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(sessionUpdateUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(sessionRequestUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(respondSessionRequestUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(pingUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(formatAuthenticateMessageUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(emitEventUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(extendSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(disconnectSessionUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(decryptMessageUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getSessionsUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getPairingsUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getSessionProposalsUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getVerifyContextByIdUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(getListOfVerifyContextsUseCaseInterface, "");
        Intrinsics.checkNotNullParameter(onSessionProposalUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionAuthenticateUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionSettleUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionRequestUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionDeleteUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionEventUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionUpdateUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionExtendUseCase, "");
        Intrinsics.checkNotNullParameter(onPingUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionProposalResponseUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionAuthenticateResponseUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionSettleResponseUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionUpdateResponseUseCase, "");
        Intrinsics.checkNotNullParameter(onSessionRequestResponseUseCase, "");
        Intrinsics.checkNotNullParameter(insertTelemetryEventUseCase, "");
        Intrinsics.checkNotNullParameter(linkModeJsonRpcInteractorInterface, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.jsonRpcInteractor = relayJsonRpcInteractorInterface;
        this.getPendingRequestsByTopicUseCase = getPendingRequestsUseCaseByTopicInterface;
        this.getPendingSessionRequestByTopicUseCase = getPendingSessionRequestByTopicUseCaseInterface;
        this.getPendingSessionRequests = getPendingSessionRequests;
        this.getPendingAuthenticateRequestUseCase = getPendingAuthenticateRequestUseCaseInterface;
        this.deleteRequestByIdUseCase = deleteRequestByIdUseCase;
        this.crypto = keyManagementRepository;
        this.authenticateResponseTopicRepository = authenticateResponseTopicRepository;
        this.proposalStorageRepository = proposalStorageRepository;
        this.sessionStorageRepository = sessionStorageRepository;
        this.metadataStorageRepository = metadataStorageRepositoryInterface;
        this.pairingController = pairingControllerInterface;
        this.verifyContextStorageRepository = verifyContextStorageRepository;
        this.proposeSessionUseCase = proposeSessionUseCaseInterface;
        this.authenticateSessionUseCase = sessionAuthenticateUseCaseInterface;
        this.pairUseCase = pairUseCaseInterface;
        this.rejectSessionUseCase = rejectSessionUseCaseInterface;
        this.approveSessionUseCase = approveSessionUseCaseInterface;
        this.approveSessionAuthenticateUseCase = approveSessionAuthenticateUseCaseInterface;
        this.rejectSessionAuthenticateUseCase = rejectSessionAuthenticateUseCaseInterface;
        this.sessionUpdateUseCase = sessionUpdateUseCaseInterface;
        this.sessionRequestUseCase = sessionRequestUseCaseInterface;
        this.respondSessionRequestUseCase = respondSessionRequestUseCaseInterface;
        this.pingUseCase = pingUseCaseInterface;
        this.formatAuthenticateMessageUseCase = formatAuthenticateMessageUseCaseInterface;
        this.emitEventUseCase = emitEventUseCaseInterface;
        this.extendSessionUseCase = extendSessionUseCaseInterface;
        this.disconnectSessionUseCase = disconnectSessionUseCaseInterface;
        this.decryptMessageUseCase = decryptMessageUseCaseInterface;
        this.getSessionsUseCase = getSessionsUseCaseInterface;
        this.getPairingsUseCase = getPairingsUseCaseInterface;
        this.getSessionProposalsUseCase = getSessionProposalsUseCaseInterface;
        this.getVerifyContextByIdUseCase = getVerifyContextByIdUseCaseInterface;
        this.getListOfVerifyContextsUseCase = getListOfVerifyContextsUseCaseInterface;
        this.onSessionProposeUse = onSessionProposalUseCase;
        this.onAuthenticateSessionUseCase = onSessionAuthenticateUseCase;
        this.onSessionSettleUseCase = onSessionSettleUseCase;
        this.onSessionRequestUseCase = onSessionRequestUseCase;
        this.onSessionDeleteUseCase = onSessionDeleteUseCase;
        this.onSessionEventUseCase = onSessionEventUseCase;
        this.onSessionUpdateUseCase = onSessionUpdateUseCase;
        this.onSessionExtendUseCase = onSessionExtendUseCase;
        this.onPingUseCase = onPingUseCase;
        this.onSessionProposalResponseUseCase = onSessionProposalResponseUseCase;
        this.onSessionAuthenticateResponseUseCase = onSessionAuthenticateResponseUseCase;
        this.onSessionSettleResponseUseCase = onSessionSettleResponseUseCase;
        this.onSessionUpdateResponseUseCase = onSessionUpdateResponseUseCase;
        this.onSessionRequestResponseUseCase = onSessionRequestResponseUseCase;
        this.insertEventUseCase = insertTelemetryEventUseCase;
        this.linkModeJsonRpcInteractor = linkModeJsonRpcInteractorInterface;
        this.logger = logger;
        MutableSharedFlow<EngineEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._engineEvent = mutableSharedFlowMutableSharedFlow$default;
        this.engineEvent = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.wssConnection = relayJsonRpcInteractorInterface.getWssConnectionState();
        pairingControllerInterface.register(JsonRpcMethod.WC_SESSION_PROPOSE, JsonRpcMethod.WC_SESSION_AUTHENTICATE, JsonRpcMethod.WC_SESSION_SETTLE, JsonRpcMethod.WC_SESSION_REQUEST, JsonRpcMethod.WC_SESSION_EVENT, JsonRpcMethod.WC_SESSION_DELETE, JsonRpcMethod.WC_SESSION_EXTEND, JsonRpcMethod.WC_SESSION_PING, JsonRpcMethod.WC_SESSION_UPDATE);
        setupSequenceExpiration();
        propagatePendingSessionRequestsQueue();
        emitReceivedPendingRequestsWhilePairingOnTheSameURL();
        sessionProposalExpiryWatcher();
        sessionRequestsExpiryWatcher();
    }

    public final void setup() {
        handleLinkModeRequests();
        handleLinkModeResponses();
        if (this.signEventsJob == null) {
            this.signEventsJob = collectSignEvents();
        }
        if (this.internalErrorsJob == null) {
            this.internalErrorsJob = collectInternalErrors();
        }
        handleRelayRequestsAndResponses();
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleRelayRequestsAndResponses$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19621 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19621(Continuation<? super C19621> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19621(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((C19621) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleRelayRequestsAndResponses$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ SignEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07611(SignEngine signEngine, Continuation<? super C07611> continuation) {
                super(2, continuation);
                this.this$0 = signEngine;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07611(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleRelayRequestsAndResponses$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
                public /* synthetic */ Object L$0;
                public int label;
                public final /* synthetic */ SignEngine this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07621(SignEngine signEngine, Continuation<? super C07621> continuation) {
                    super(2, continuation);
                    this.this$0 = signEngine;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                    C07621 c07621 = new C07621(this.this$0, continuation);
                    c07621.L$0 = obj;
                    return c07621;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
                    return ((C07621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleRelayRequestsAndResponses$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C07631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int label;
                    public final /* synthetic */ SignEngine this$0;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07631(SignEngine signEngine, Continuation<? super C07631> continuation) {
                        super(2, continuation);
                        this.this$0 = signEngine;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                        return new C07631(this.this$0, continuation);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C07631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                        C56442yFn.copydefault();
                        if (this.label == 0) {
                            C56391yDq.AEQbTJ(obj);
                            this.this$0.resubscribeToSession();
                            this.this$0.resubscribeToPendingAuthenticateTopics();
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        return BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, Dispatchers.getIO(), null, new C07631(this.this$0, null), 2, null);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C07621 c07621 = new C07621(this.this$0, null);
                    this.label = 1;
                    if (SupervisorKt.supervisorScope(c07621, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                if (this.this$0.jsonRpcRequestsJob == null) {
                    SignEngine signEngine = this.this$0;
                    signEngine.jsonRpcRequestsJob = signEngine.collectJsonRpcRequests();
                }
                if (this.this$0.jsonRpcResponsesJob == null) {
                    SignEngine signEngine2 = this.this$0;
                    signEngine2.jsonRpcResponsesJob = signEngine2.collectJsonRpcResponses();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C07611(SignEngine.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void handleRelayRequestsAndResponses() {
        FlowKt.launchIn(FlowKt.onEach(this.jsonRpcInteractor.getOnResubscribe(), new C19621(null)), WalletConnectScopeKt.getScope());
    }

    public final void handleLinkModeResponses() {
        if (this.envelopeResponsesJob == null) {
            final SharedFlow<WCResponse> peerResponse = this.linkModeJsonRpcInteractor.getPeerResponse();
            this.envelopeResponsesJob = FlowKt.launchIn(FlowKt.onEach(new Flow<WCResponse>() { // from class: com.reown.sign.engine.domain.SignEngine$handleLinkModeResponses$$inlined$filter$1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector<? super WCResponse> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = peerResponse.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeResponses$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeResponses$$inlined$filter$1$2$1, reason: invalid class name */
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
                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
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
                            if (((WCResponse) obj).getParams() instanceof SignParams) {
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
            }, new C19612(null)), WalletConnectScopeKt.getScope());
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeResponses$2, reason: invalid class name and case insensitive filesystem */
    public static final class C19612 extends SuspendLambda implements Function2<WCResponse, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19612(Continuation<? super C19612> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19612 c19612 = SignEngine.this.new C19612(continuation);
            c19612.L$0 = obj;
            return c19612;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WCResponse wCResponse, Continuation<? super Unit> continuation) {
            return ((C19612) create(wCResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WCResponse wCResponse = (WCResponse) this.L$0;
                ClientParams params = wCResponse.getParams();
                if (params instanceof SignParams.SessionAuthenticateParams) {
                    this.label = 1;
                    if (SignEngine.this.onSessionAuthenticateResponseUseCase.invoke(wCResponse, (SignParams.SessionAuthenticateParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.SessionRequestParams) {
                    this.label = 2;
                    if (SignEngine.this.onSessionRequestResponseUseCase.invoke(wCResponse, (SignParams.SessionRequestParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void handleLinkModeRequests() {
        if (this.envelopeRequestsJob == null) {
            final SharedFlow<WCRequest> clientSyncJsonRpc = this.linkModeJsonRpcInteractor.getClientSyncJsonRpc();
            this.envelopeRequestsJob = FlowKt.launchIn(FlowKt.onEach(new Flow<WCRequest>() { // from class: com.reown.sign.engine.domain.SignEngine$handleLinkModeRequests$$inlined$filter$1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(@NotNull FlowCollector<? super WCRequest> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = clientSyncJsonRpc.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeRequests$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    public final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeRequests$$inlined$filter$1$2$1, reason: invalid class name */
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
                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
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
                            if (((WCRequest) obj).getParams() instanceof SignParams) {
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
            }, new C19602(null)), WalletConnectScopeKt.getScope());
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$handleLinkModeRequests$2, reason: invalid class name and case insensitive filesystem */
    public static final class C19602 extends SuspendLambda implements Function2<WCRequest, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19602(Continuation<? super C19602> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19602 c19602 = SignEngine.this.new C19602(continuation);
            c19602.L$0 = obj;
            return c19602;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WCRequest wCRequest, Continuation<? super Unit> continuation) {
            return ((C19602) create(wCRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WCRequest wCRequest = (WCRequest) this.L$0;
                ClientParams params = wCRequest.getParams();
                if (params instanceof SignParams.SessionAuthenticateParams) {
                    this.label = 1;
                    if (SignEngine.this.onAuthenticateSessionUseCase.invoke(wCRequest, (SignParams.SessionAuthenticateParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.SessionRequestParams) {
                    this.label = 2;
                    if (SignEngine.this.onSessionRequestUseCase.invoke(wCRequest, (SignParams.SessionRequestParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Job collectJsonRpcRequests() {
        final SharedFlow<WCRequest> clientSyncJsonRpc = this.jsonRpcInteractor.getClientSyncJsonRpc();
        return FlowKt.launchIn(FlowKt.onEach(new Flow<WCRequest>() { // from class: com.reown.sign.engine.domain.SignEngine$collectJsonRpcRequests$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WCRequest> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = clientSyncJsonRpc.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcRequests$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcRequests$$inlined$filter$1$2$1, reason: invalid class name */
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
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        if (((WCRequest) obj).getParams() instanceof SignParams) {
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
        }, new AnonymousClass2(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcRequests$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<WCRequest, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = SignEngine.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WCRequest wCRequest, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(wCRequest, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    WCRequest wCRequest = (WCRequest) this.L$0;
                    ClientParams params = wCRequest.getParams();
                    if (params instanceof SignParams.SessionProposeParams) {
                        this.label = 1;
                        if (SignEngine.this.onSessionProposeUse.invoke(wCRequest, (SignParams.SessionProposeParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.SessionAuthenticateParams) {
                        this.label = 2;
                        if (SignEngine.this.onAuthenticateSessionUseCase.invoke(wCRequest, (SignParams.SessionAuthenticateParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.SessionSettleParams) {
                        this.label = 3;
                        if (SignEngine.this.onSessionSettleUseCase.invoke(wCRequest, (SignParams.SessionSettleParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.SessionRequestParams) {
                        this.label = 4;
                        if (SignEngine.this.onSessionRequestUseCase.invoke(wCRequest, (SignParams.SessionRequestParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.DeleteParams) {
                        this.label = 5;
                        if (SignEngine.this.onSessionDeleteUseCase.invoke(wCRequest, (SignParams.DeleteParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.EventParams) {
                        this.label = 6;
                        if (SignEngine.this.onSessionEventUseCase.invoke(wCRequest, (SignParams.EventParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.UpdateNamespacesParams) {
                        this.label = 7;
                        if (SignEngine.this.onSessionUpdateUseCase.invoke(wCRequest, (SignParams.UpdateNamespacesParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.ExtendParams) {
                        this.label = 8;
                        if (SignEngine.this.onSessionExtendUseCase.invoke(wCRequest, (SignParams.ExtendParams) params, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else if (params instanceof SignParams.PingParams) {
                        OnPingUseCase onPingUseCase = SignEngine.this.onPingUseCase;
                        this.label = 9;
                        if (onPingUseCase.invoke(wCRequest, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    C56391yDq.AEQbTJ(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final Job collectJsonRpcResponses() {
        final SharedFlow<WCResponse> peerResponse = this.jsonRpcInteractor.getPeerResponse();
        return FlowKt.launchIn(FlowKt.onEach(new Flow<WCResponse>() { // from class: com.reown.sign.engine.domain.SignEngine$collectJsonRpcResponses$$inlined$filter$1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(@NotNull FlowCollector<? super WCResponse> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = peerResponse.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcResponses$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcResponses$$inlined$filter$1$2$1, reason: invalid class name */
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
                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
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
                        if (((WCResponse) obj).getParams() instanceof SignParams) {
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
        }, new C19572(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectJsonRpcResponses$2, reason: invalid class name and case insensitive filesystem */
    public static final class C19572 extends SuspendLambda implements Function2<WCResponse, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19572(Continuation<? super C19572> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19572 c19572 = SignEngine.this.new C19572(continuation);
            c19572.L$0 = obj;
            return c19572;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull WCResponse wCResponse, Continuation<? super Unit> continuation) {
            return ((C19572) create(wCResponse, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WCResponse wCResponse = (WCResponse) this.L$0;
                ClientParams params = wCResponse.getParams();
                if (params instanceof SignParams.SessionProposeParams) {
                    this.label = 1;
                    if (SignEngine.this.onSessionProposalResponseUseCase.invoke(wCResponse, (SignParams.SessionProposeParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.SessionAuthenticateParams) {
                    this.label = 2;
                    if (SignEngine.this.onSessionAuthenticateResponseUseCase.invoke(wCResponse, (SignParams.SessionAuthenticateParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.SessionSettleParams) {
                    OnSessionSettleResponseUseCase onSessionSettleResponseUseCase = SignEngine.this.onSessionSettleResponseUseCase;
                    this.label = 3;
                    if (onSessionSettleResponseUseCase.invoke(wCResponse, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.UpdateNamespacesParams) {
                    OnSessionUpdateResponseUseCase onSessionUpdateResponseUseCase = SignEngine.this.onSessionUpdateResponseUseCase;
                    this.label = 4;
                    if (onSessionUpdateResponseUseCase.invoke(wCResponse, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (params instanceof SignParams.SessionRequestParams) {
                    this.label = 5;
                    if (SignEngine.this.onSessionRequestResponseUseCase.invoke(wCResponse, (SignParams.SessionRequestParams) params, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
            } else {
                if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectInternalErrors$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<SDKError, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SignEngine.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull SDKError sDKError, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sDKError, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SDKError sDKError = (SDKError) this.L$0;
                MutableSharedFlow mutableSharedFlow = SignEngine.this._engineEvent;
                this.label = 1;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    public final Job collectInternalErrors() {
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.merge(this.jsonRpcInteractor.getInternalErrors(), this.linkModeJsonRpcInteractor.getInternalErrors(), this.pairingController.getFindWrongMethodsFlow(), this.sessionRequestUseCase.getErrors()), new AnonymousClass1(null)), WalletConnectScopeKt.getScope());
    }

    public final Job collectSignEvents() {
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.merge(this.respondSessionRequestUseCase.getEvents(), this.onSessionRequestUseCase.getEvents(), this.onSessionDeleteUseCase.getEvents(), this.onSessionProposeUse.getEvents(), this.onAuthenticateSessionUseCase.getEvents(), this.onSessionEventUseCase.getEvents(), this.onSessionSettleUseCase.getEvents(), this.onSessionUpdateUseCase.getEvents(), this.onSessionExtendUseCase.getEvents(), this.onSessionProposalResponseUseCase.getEvents(), this.onSessionSettleResponseUseCase.getEvents(), this.onSessionUpdateResponseUseCase.getEvents(), this.onSessionRequestResponseUseCase.getEvents(), this.onSessionAuthenticateResponseUseCase.getEvents()), new C19581(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$collectSignEvents$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19581 extends SuspendLambda implements Function2<EngineEvent, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19581(Continuation<? super C19581> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19581 c19581 = SignEngine.this.new C19581(continuation);
            c19581.L$0 = obj;
            return c19581;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull EngineEvent engineEvent, Continuation<? super Unit> continuation) {
            return ((C19581) create(engineEvent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                EngineEvent engineEvent = (EngineEvent) this.L$0;
                MutableSharedFlow mutableSharedFlow = SignEngine.this._engineEvent;
                this.label = 1;
                if (mutableSharedFlow.emit(engineEvent, this) == objCopydefault) {
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

    public final void resubscribeToSession() {
        Object objM7377constructorimpl;
        try {
            List listOfSessionVOsWithoutMetadata = this.sessionStorageRepository.getListOfSessionVOsWithoutMetadata();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listOfSessionVOsWithoutMetadata) {
                if (!UtilFunctionsKt.isSequenceValid(((SessionVO) obj).getExpiry())) {
                    arrayList.add(obj);
                } else {
                    arrayList2.add(obj);
                }
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.component1();
            List list2 = (List) pair.component2();
            ArrayList<Topic> arrayList3 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((SessionVO) it.next()).getTopic());
            }
            for (Topic topic : arrayList3) {
                try {
                    Result.Application application = Result.Companion;
                    this.crypto.removeKeys(topic.getValue());
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    this.logger.error(thM7380exceptionOrNullimpl);
                }
                this.sessionStorageRepository.deleteSession(topic);
            }
            ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((SessionVO) it2.next()).getTopic().getValue());
            }
            RelayJsonRpcInteractorInterface.DefaultImpls.batchSubscribe$default(this.jsonRpcInteractor, arrayList4, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.domain.SignEngine.resubscribeToSession.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$resubscribeToSession$4$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public final /* synthetic */ Throwable $error;
                    public int label;
                    public final /* synthetic */ SignEngine this$0;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(SignEngine signEngine, Throwable th, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = signEngine;
                        this.$error = th;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, this.$error, continuation);
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
                            MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                            SDKError sDKError = new SDKError(this.$error);
                            this.label = 1;
                            if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                    invoke2(th2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th2) {
                    Intrinsics.checkNotNullParameter(th2, "");
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(SignEngine.this, th2, null), 3, null);
                }
            }, 2, null);
        } catch (Exception e) {
            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass5(e, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$resubscribeToSession$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Exception $e;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Exception exc, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$e = exc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new AnonymousClass5(this.$e, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = SignEngine.this._engineEvent;
                SDKError sDKError = new SDKError(this.$e);
                this.label = 1;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$resubscribeToPendingAuthenticateTopics$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19651(Continuation<? super C19651> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19651(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    AuthenticateResponseTopicRepository authenticateResponseTopicRepository = SignEngine.this.authenticateResponseTopicRepository;
                    this.label = 1;
                    obj = authenticateResponseTopicRepository.getResponseTopics(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = SignEngine.this.jsonRpcInteractor;
                final SignEngine signEngine = SignEngine.this;
                RelayJsonRpcInteractorInterface.DefaultImpls.batchSubscribe$default(relayJsonRpcInteractorInterface, arrayList, null, new Function1<Throwable, Unit>() { // from class: com.reown.sign.engine.domain.SignEngine.resubscribeToPendingAuthenticateTopics.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(1);
                    }

                    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$resubscribeToPendingAuthenticateTopics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C07651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public final /* synthetic */ Throwable $error;
                        public int label;
                        public final /* synthetic */ SignEngine this$0;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C07651(SignEngine signEngine, Throwable th, Continuation<? super C07651> continuation) {
                            super(2, continuation);
                            this.this$0 = signEngine;
                            this.$error = th;
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                            return new C07651(this.this$0, this.$error, continuation);
                        }

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C07651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                            Object objCopydefault = C56442yFn.copydefault();
                            int i = this.label;
                            if (i == 0) {
                                C56391yDq.AEQbTJ(obj);
                                MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                                SDKError sDKError = new SDKError(this.$error);
                                this.label = 1;
                                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C07651(signEngine, th, null), 3, null);
                    }
                }, 2, null);
            } catch (Exception e) {
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass2(SignEngine.this, e, null), 3, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$resubscribeToPendingAuthenticateTopics$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Exception $e;
            public int label;
            public final /* synthetic */ SignEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SignEngine signEngine, Exception exc, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = signEngine;
                this.$e = exc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$e, continuation);
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
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                    SDKError sDKError = new SDKError(this.$e);
                    this.label = 1;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    public final void resubscribeToPendingAuthenticateTopics() {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19651(null), 3, null);
    }

    public final void setupSequenceExpiration() {
        try {
            this.sessionStorageRepository.setOnSessionExpired(new Function1<Topic, Unit>() { // from class: com.reown.sign.engine.domain.SignEngine.setupSequenceExpiration.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Topic topic) {
                    invoke2(topic);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final Topic topic) {
                    Intrinsics.checkNotNullParameter(topic, "");
                    RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface = SignEngine.this.jsonRpcInteractor;
                    final SignEngine signEngine = SignEngine.this;
                    RelayJsonRpcInteractorInterface.DefaultImpls.unsubscribe$default(relayJsonRpcInteractorInterface, topic, new Function0<Unit>() { // from class: com.reown.sign.engine.domain.SignEngine.setupSequenceExpiration.1.1
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
                            SignEngine signEngine2 = signEngine;
                            Topic topic2 = topic;
                            try {
                                Result.Application application = Result.Companion;
                                signEngine2.sessionStorageRepository.deleteSession(topic2);
                                signEngine2.crypto.removeKeys(topic2.getValue());
                                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                            } catch (Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            SignEngine signEngine3 = signEngine;
                            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                            if (thM7380exceptionOrNullimpl != null) {
                                signEngine3.logger.error(thM7380exceptionOrNullimpl);
                            }
                        }
                    }, null, 4, null);
                }
            });
        } catch (Exception e) {
            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19692(e, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$setupSequenceExpiration$2, reason: invalid class name and case insensitive filesystem */
    public static final class C19692 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Exception $e;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19692(Exception exc, Continuation<? super C19692> continuation) {
            super(2, continuation);
            this.$e = exc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19692(this.$e, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow = SignEngine.this._engineEvent;
                SDKError sDKError = new SDKError(this.$e);
                this.label = 1;
                if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$propagatePendingSessionRequestsQueue$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19631(Continuation<? super C19631> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19631(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00d0 -> B:31:0x00d3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Iterator it;
            SignEngine signEngine;
            Collection collection;
            Object next;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                GetPendingSessionRequests getPendingSessionRequests = SignEngine.this.getPendingSessionRequests;
                this.label = 1;
                obj = getPendingSessionRequests.invoke(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                EngineDO.SessionRequest sessionRequest = (EngineDO.SessionRequest) this.L$4;
                Object next2 = this.L$3;
                it = (Iterator) this.L$2;
                collection = (Collection) this.L$1;
                signEngine = (SignEngine) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Iterator it2 = ((Iterable) obj).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.EZpvd((Object) ((EngineDO.Session) next).getTopic().getValue(), (Object) sessionRequest.getTopic())) {
                        break;
                    }
                }
                if (next != null) {
                    collection.add(next2);
                }
                if (it.hasNext()) {
                    next2 = it.next();
                    sessionRequest = (EngineDO.SessionRequest) next2;
                    GetSessionsUseCaseInterface getSessionsUseCaseInterface = signEngine.getSessionsUseCase;
                    this.L$0 = signEngine;
                    this.L$1 = collection;
                    this.L$2 = it;
                    this.L$3 = next2;
                    this.L$4 = sessionRequest;
                    this.label = 2;
                    obj = getSessionsUseCaseInterface.getListOfSettledSessions(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    Iterator it22 = ((Iterable) obj).iterator();
                    while (true) {
                        if (it22.hasNext()) {
                        }
                    }
                    if (next != null) {
                    }
                    if (it.hasNext()) {
                        SignEngine signEngine2 = SignEngine.this;
                        Iterator it3 = ((List) collection).iterator();
                        while (it3.hasNext()) {
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new SignEngine$propagatePendingSessionRequestsQueue$1$4$1(signEngine2, (EngineDO.SessionRequest) it3.next(), null), 3, null);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }
            Iterable<Request> iterable = (Iterable) obj;
            SignEngine signEngine3 = SignEngine.this;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
            for (Request request : iterable) {
                arrayList.add(EngineMapperKt.toSessionRequest(request, signEngine3.metadataStorageRepository.getByTopicAndType(request.getTopic(), AppMetaDataType.PEER)));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                Expiry expiry = ((EngineDO.SessionRequest) obj2).getExpiry();
                if (expiry != null && !CoreValidator.INSTANCE.isExpired(expiry)) {
                    arrayList2.add(obj2);
                }
            }
            SignEngine signEngine4 = SignEngine.this;
            ArrayList arrayList3 = new ArrayList();
            it = arrayList2.iterator();
            signEngine = signEngine4;
            collection = arrayList3;
            if (it.hasNext()) {
            }
        }
    }

    public final Job propagatePendingSessionRequestsQueue() {
        return BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C19631(null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$sessionProposalExpiryWatcher$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19661 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19661(Continuation<? super C19661> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19661(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Unit unit, Continuation<? super Unit> continuation) {
            return ((C19661) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: Exception -> 0x00b8, TryCatch #0 {Exception -> 0x00b8, blocks: (B:8:0x001d, B:22:0x005f, B:24:0x0065, B:26:0x0072, B:28:0x007a, B:31:0x009e, B:13:0x0039, B:14:0x003d, B:20:0x0053, B:17:0x0044), top: B:38:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b5 -> B:22:0x005f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Iterable iterable;
            SignEngine signEngine;
            Iterator it;
            SignEngine signEngine2;
            Iterable iterable2;
            Iterator it2;
            ProposalVO proposalVO;
            MutableSharedFlow mutableSharedFlow;
            EngineDO.ExpiredProposal expiredProposal;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                SignEngine.this.logger.error(e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                ProposalStorageRepository proposalStorageRepository = SignEngine.this.proposalStorageRepository;
                this.label = 1;
                obj = proposalStorageRepository.getProposals$sign_release(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        proposalVO = (ProposalVO) this.L$3;
                        it2 = (Iterator) this.L$2;
                        iterable2 = (Iterable) this.L$1;
                        signEngine2 = (SignEngine) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        mutableSharedFlow = signEngine2._engineEvent;
                        expiredProposal = EngineMapperKt.toExpiredProposal(proposalVO);
                        this.L$0 = signEngine2;
                        this.L$1 = iterable2;
                        this.L$2 = it2;
                        this.L$3 = null;
                        this.label = 3;
                        if (mutableSharedFlow.emit(expiredProposal, this) == objCopydefault) {
                        }
                        while (it2.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$2;
                    iterable = (Iterable) this.L$1;
                    signEngine = (SignEngine) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    signEngine2 = signEngine;
                    iterable2 = iterable;
                    it2 = it;
                    while (it2.hasNext()) {
                        proposalVO = (ProposalVO) it2.next();
                        Expiry expiry = proposalVO.getExpiry();
                        if (expiry != null && CoreValidator.INSTANCE.isExpired(expiry)) {
                            signEngine2.proposalStorageRepository.deleteProposal$sign_release(proposalVO.getProposerPublicKey());
                            DeleteRequestByIdUseCase deleteRequestByIdUseCase = signEngine2.deleteRequestByIdUseCase;
                            long requestId = proposalVO.getRequestId();
                            this.L$0 = signEngine2;
                            this.L$1 = iterable2;
                            this.L$2 = it2;
                            this.L$3 = proposalVO;
                            this.label = 2;
                            if (deleteRequestByIdUseCase.invoke(requestId, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow = signEngine2._engineEvent;
                            expiredProposal = EngineMapperKt.toExpiredProposal(proposalVO);
                            this.L$0 = signEngine2;
                            this.L$1 = iterable2;
                            this.L$2 = it2;
                            this.L$3 = null;
                            this.label = 3;
                            if (mutableSharedFlow.emit(expiredProposal, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            while (it2.hasNext()) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            iterable = (Iterable) obj;
            signEngine = SignEngine.this;
            it = iterable.iterator();
            signEngine2 = signEngine;
            iterable2 = iterable;
            it2 = it;
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void sessionProposalExpiryWatcher() {
        FlowKt.launchIn(FlowKt.onEach(repeatableFlow(), new C19661(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$sessionRequestsExpiryWatcher$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19671 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19671(Continuation<? super C19671> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return SignEngine.this.new C19671(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull Unit unit, Continuation<? super Unit> continuation) {
            return ((C19671) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[Catch: Exception -> 0x00ad, TryCatch #0 {Exception -> 0x00ad, blocks: (B:8:0x001d, B:22:0x005f, B:24:0x0065, B:26:0x0072, B:28:0x007a, B:31:0x0093, B:13:0x0039, B:14:0x003d, B:20:0x0053, B:17:0x0044), top: B:38:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00aa -> B:22:0x005f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Iterable iterable;
            SignEngine signEngine;
            Iterator it;
            SignEngine signEngine2;
            Iterable iterable2;
            Iterator it2;
            Request request;
            MutableSharedFlow mutableSharedFlow;
            EngineDO.ExpiredRequest expiredSessionRequest;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                SignEngine.this.logger.error(e);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                GetPendingSessionRequests getPendingSessionRequests = SignEngine.this.getPendingSessionRequests;
                this.label = 1;
                obj = getPendingSessionRequests.invoke(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        request = (Request) this.L$3;
                        it2 = (Iterator) this.L$2;
                        iterable2 = (Iterable) this.L$1;
                        signEngine2 = (SignEngine) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        mutableSharedFlow = signEngine2._engineEvent;
                        expiredSessionRequest = EngineMapperKt.toExpiredSessionRequest(request);
                        this.L$0 = signEngine2;
                        this.L$1 = iterable2;
                        this.L$2 = it2;
                        this.L$3 = null;
                        this.label = 3;
                        if (mutableSharedFlow.emit(expiredSessionRequest, this) == objCopydefault) {
                        }
                        while (it2.hasNext()) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.L$2;
                    iterable = (Iterable) this.L$1;
                    signEngine = (SignEngine) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    signEngine2 = signEngine;
                    iterable2 = iterable;
                    it2 = it;
                    while (it2.hasNext()) {
                        request = (Request) it2.next();
                        Expiry expiry = request.getExpiry();
                        if (expiry != null && CoreValidator.INSTANCE.isExpired(expiry)) {
                            DeleteRequestByIdUseCase deleteRequestByIdUseCase = signEngine2.deleteRequestByIdUseCase;
                            long id = request.getId();
                            this.L$0 = signEngine2;
                            this.L$1 = iterable2;
                            this.L$2 = it2;
                            this.L$3 = request;
                            this.label = 2;
                            if (deleteRequestByIdUseCase.invoke(id, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            mutableSharedFlow = signEngine2._engineEvent;
                            expiredSessionRequest = EngineMapperKt.toExpiredSessionRequest(request);
                            this.L$0 = signEngine2;
                            this.L$1 = iterable2;
                            this.L$2 = it2;
                            this.L$3 = null;
                            this.label = 3;
                            if (mutableSharedFlow.emit(expiredSessionRequest, this) == objCopydefault) {
                                return objCopydefault;
                            }
                            while (it2.hasNext()) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
            }
            iterable = (Iterable) obj;
            signEngine = SignEngine.this;
            it = iterable.iterator();
            signEngine2 = signEngine;
            iterable2 = iterable;
            it2 = it;
            while (it2.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    public final void sessionRequestsExpiryWatcher() {
        FlowKt.launchIn(FlowKt.onEach(repeatableFlow(), new C19671(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19591 extends SuspendLambda implements Function2<Pair<? extends Topic, ? extends List<String>>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19591(Continuation<? super C19591> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19591 c19591 = SignEngine.this.new C19591(continuation);
            c19591.L$0 = obj;
            return c19591;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Topic, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<Topic, ? extends List<String>>) pair, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull Pair<Topic, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
            return ((C19591) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:9:0x001f, B:59:0x01f3, B:61:0x01f7, B:62:0x020e, B:14:0x0032, B:54:0x01ba, B:17:0x0043, B:40:0x00d5, B:42:0x00d9, B:43:0x00f0, B:35:0x00b2, B:37:0x00b8, B:20:0x0052, B:26:0x007e, B:27:0x0089, B:29:0x008f, B:31:0x00a0, B:32:0x00a4, B:34:0x00ab, B:46:0x015d, B:48:0x0171, B:50:0x0179, B:55:0x01db, B:23:0x006b), top: B:67:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d9 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:9:0x001f, B:59:0x01f3, B:61:0x01f7, B:62:0x020e, B:14:0x0032, B:54:0x01ba, B:17:0x0043, B:40:0x00d5, B:42:0x00d9, B:43:0x00f0, B:35:0x00b2, B:37:0x00b8, B:20:0x0052, B:26:0x007e, B:27:0x0089, B:29:0x008f, B:31:0x00a0, B:32:0x00a4, B:34:0x00ab, B:46:0x015d, B:48:0x0171, B:50:0x0179, B:55:0x01db, B:23:0x006b), top: B:67:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x01f7 A[Catch: Exception -> 0x015a, TryCatch #0 {Exception -> 0x015a, blocks: (B:9:0x001f, B:59:0x01f3, B:61:0x01f7, B:62:0x020e, B:14:0x0032, B:54:0x01ba, B:17:0x0043, B:40:0x00d5, B:42:0x00d9, B:43:0x00f0, B:35:0x00b2, B:37:0x00b8, B:20:0x0052, B:26:0x007e, B:27:0x0089, B:29:0x008f, B:31:0x00a0, B:32:0x00a4, B:34:0x00ab, B:46:0x015d, B:48:0x0171, B:50:0x0179, B:55:0x01db, B:23:0x006b), top: B:67:0x000d }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d2 -> B:40:0x00d5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Topic topic;
            List list;
            Object pendingAuthenticateRequests;
            Object obj2;
            ProposalVO proposalVO;
            ProposalVO proposalVO2;
            Iterator it;
            SignEngine signEngine;
            VerifyContext verifyContext;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Exception e) {
                SignEngine.this.logger.log("No proposal or pending session authenticate request for pairing topic: " + e);
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass4(SignEngine.this, e, null), 3, null);
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Pair pair = (Pair) this.L$0;
                topic = (Topic) pair.component1();
                list = (List) pair.component2();
                GetPendingAuthenticateRequestUseCaseInterface getPendingAuthenticateRequestUseCaseInterface = SignEngine.this.getPendingAuthenticateRequestUseCase;
                this.L$0 = topic;
                this.L$1 = list;
                this.label = 1;
                pendingAuthenticateRequests = getPendingAuthenticateRequestUseCaseInterface.getPendingAuthenticateRequests(this);
                if (pendingAuthenticateRequests == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            proposalVO2 = (ProposalVO) this.L$0;
                            C56391yDq.AEQbTJ(obj);
                            SignEngine.this.proposalStorageRepository.deleteProposal$sign_release(proposalVO2.getProposerPublicKey());
                            BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass2(SignEngine.this, proposalVO2, null), 3, null);
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        proposalVO = (ProposalVO) this.L$1;
                        list = (List) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        obj2 = obj;
                        verifyContext = (VerifyContext) obj2;
                        if (verifyContext == null) {
                            long requestId = proposalVO.getRequestId();
                            C56529yIt c56529yIt = C56529yIt.KWHzl;
                            verifyContext = new VerifyContext(requestId, UtilFunctionsKt.getEmpty(c56529yIt), Validation.UNKNOWN, UtilFunctionsKt.getEmpty(c56529yIt), null);
                        }
                        EngineDO.SessionProposalEvent sessionProposalEvent = new EngineDO.SessionProposalEvent(EngineMapperKt.toEngineDO(proposalVO), EngineMapperKt.toEngineDO(verifyContext));
                        SignEngine.this.logger.log("Emitting session proposal from active pairing: " + sessionProposalEvent);
                        list.add(Trace.Pairing.EMIT_SESSION_PROPOSAL);
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass3(SignEngine.this, sessionProposalEvent, null), 3, null);
                        return Unit.INSTANCE;
                    }
                    Request request = (Request) this.L$2;
                    it = (Iterator) this.L$1;
                    signEngine = (SignEngine) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    Object obj3 = obj;
                    VerifyContext verifyContext2 = (VerifyContext) obj3;
                    if (verifyContext2 == null) {
                        long id = request.getId();
                        C56529yIt c56529yIt2 = C56529yIt.KWHzl;
                        verifyContext2 = new VerifyContext(id, UtilFunctionsKt.getEmpty(c56529yIt2), Validation.UNKNOWN, UtilFunctionsKt.getEmpty(c56529yIt2), null);
                    }
                    EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent = new EngineDO.SessionAuthenticateEvent(request.getId(), request.getTopic().getValue(), EngineMapperKt.toEngineDO(((SignParams.SessionAuthenticateParams) request.getParams()).getAuthPayload()), EngineMapperKt.toEngineDO(((SignParams.SessionAuthenticateParams) request.getParams()).getRequester()), ((SignParams.SessionAuthenticateParams) request.getParams()).getExpiryTimestamp(), EngineMapperKt.toEngineDO(verifyContext2));
                    signEngine.logger.log("Emitting pending authenticate request from active pairing: " + sessionAuthenticateEvent);
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1(signEngine, sessionAuthenticateEvent, null), 3, null);
                    if (it.hasNext()) {
                        request = (Request) it.next();
                        VerifyContextStorageRepository verifyContextStorageRepository = signEngine.verifyContextStorageRepository;
                        long id2 = request.getId();
                        this.L$0 = signEngine;
                        this.L$1 = it;
                        this.L$2 = request;
                        this.label = 2;
                        obj3 = verifyContextStorageRepository.get(id2, this);
                        if (obj3 == objCopydefault) {
                            return objCopydefault;
                        }
                        VerifyContext verifyContext22 = (VerifyContext) obj3;
                        if (verifyContext22 == null) {
                        }
                        EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent2 = new EngineDO.SessionAuthenticateEvent(request.getId(), request.getTopic().getValue(), EngineMapperKt.toEngineDO(((SignParams.SessionAuthenticateParams) request.getParams()).getAuthPayload()), EngineMapperKt.toEngineDO(((SignParams.SessionAuthenticateParams) request.getParams()).getRequester()), ((SignParams.SessionAuthenticateParams) request.getParams()).getExpiryTimestamp(), EngineMapperKt.toEngineDO(verifyContext22));
                        signEngine.logger.log("Emitting pending authenticate request from active pairing: " + sessionAuthenticateEvent2);
                        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$1$1(signEngine, sessionAuthenticateEvent2, null), 3, null);
                        if (it.hasNext()) {
                        }
                    }
                    return Unit.INSTANCE;
                }
                list = (List) this.L$1;
                topic = (Topic) this.L$0;
                C56391yDq.AEQbTJ(obj);
                pendingAuthenticateRequests = obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : (Iterable) pendingAuthenticateRequests) {
                if (Intrinsics.EZpvd(((Request) obj4).getTopic(), topic)) {
                    arrayList.add(obj4);
                }
            }
            if (!(!arrayList.isEmpty())) {
                ProposalVO proposalByTopic$sign_release = SignEngine.this.proposalStorageRepository.getProposalByTopic$sign_release(topic.getValue());
                Expiry expiry = proposalByTopic$sign_release.getExpiry();
                if (expiry == null || !CoreValidator.INSTANCE.isExpired(expiry)) {
                    VerifyContextStorageRepository verifyContextStorageRepository2 = SignEngine.this.verifyContextStorageRepository;
                    long requestId2 = proposalByTopic$sign_release.getRequestId();
                    this.L$0 = list;
                    this.L$1 = proposalByTopic$sign_release;
                    this.label = 4;
                    obj2 = verifyContextStorageRepository2.get(requestId2, this);
                    if (obj2 == objCopydefault) {
                        return objCopydefault;
                    }
                    proposalVO = proposalByTopic$sign_release;
                    verifyContext = (VerifyContext) obj2;
                    if (verifyContext == null) {
                    }
                    EngineDO.SessionProposalEvent sessionProposalEvent2 = new EngineDO.SessionProposalEvent(EngineMapperKt.toEngineDO(proposalVO), EngineMapperKt.toEngineDO(verifyContext));
                    SignEngine.this.logger.log("Emitting session proposal from active pairing: " + sessionProposalEvent2);
                    list.add(Trace.Pairing.EMIT_SESSION_PROPOSAL);
                    BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass3(SignEngine.this, sessionProposalEvent2, null), 3, null);
                    return Unit.INSTANCE;
                }
                InsertTelemetryEventUseCase insertTelemetryEventUseCase = SignEngine.this.insertEventUseCase;
                Props props = new Props(null, EventType.Error.PROPOSAL_EXPIRED, new Properties(null, null, null, null, null, null, list, topic.getValue(), null, null, null, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, null), 1, null);
                this.L$0 = proposalByTopic$sign_release;
                this.L$1 = null;
                this.label = 3;
                if (insertTelemetryEventUseCase.invoke(props, this) == objCopydefault) {
                    return objCopydefault;
                }
                proposalVO2 = proposalByTopic$sign_release;
                SignEngine.this.proposalStorageRepository.deleteProposal$sign_release(proposalVO2.getProposerPublicKey());
                BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass2(SignEngine.this, proposalVO2, null), 3, null);
                return Unit.INSTANCE;
            }
            SignEngine signEngine2 = SignEngine.this;
            it = arrayList.iterator();
            signEngine = signEngine2;
            if (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ ProposalVO $proposal;
            public int label;
            public final /* synthetic */ SignEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SignEngine signEngine, ProposalVO proposalVO, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = signEngine;
                this.$proposal = proposalVO;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$proposal, continuation);
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
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                    EngineDO.ExpiredProposal expiredProposal = EngineMapperKt.toExpiredProposal(this.$proposal);
                    this.label = 1;
                    if (mutableSharedFlow.emit(expiredProposal, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ EngineDO.SessionProposalEvent $sessionProposalEvent;
            public int label;
            public final /* synthetic */ SignEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(SignEngine signEngine, EngineDO.SessionProposalEvent sessionProposalEvent, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = signEngine;
                this.$sessionProposalEvent = sessionProposalEvent;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$sessionProposalEvent, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                    EngineDO.SessionProposalEvent sessionProposalEvent = this.$sessionProposalEvent;
                    this.label = 1;
                    if (mutableSharedFlow.emit(sessionProposalEvent, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$emitReceivedPendingRequestsWhilePairingOnTheSameURL$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Exception $e;
            public int label;
            public final /* synthetic */ SignEngine this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(SignEngine signEngine, Exception exc, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = signEngine;
                this.$e = exc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass4(this.this$0, this.$e, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MutableSharedFlow mutableSharedFlow = this.this$0._engineEvent;
                    SDKError sDKError = new SDKError(new Throwable("No proposal or pending session authenticate request for pairing topic: " + this.$e));
                    this.label = 1;
                    if (mutableSharedFlow.emit(sDKError, this) == objCopydefault) {
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

    public final void emitReceivedPendingRequestsWhilePairingOnTheSameURL() {
        FlowKt.launchIn(FlowKt.onEach(this.pairingController.getStoredPairingFlow(), new C19591(null)), WalletConnectScopeKt.getScope());
    }

    /* JADX INFO: renamed from: com.reown.sign.engine.domain.SignEngine$repeatableFlow$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19641 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C19641(Continuation<? super C19641> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            C19641 c19641 = new C19641(continuation);
            c19641.L$0 = obj;
            return c19641;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
            return ((C19641) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0047 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = o.C56437yFi.OLrzqt()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                o.C56391yDq.AEQbTJ(r7)
                goto L2e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                o.C56391yDq.AEQbTJ(r7)
                goto L3b
            L26:
                o.C56391yDq.AEQbTJ(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            L2e:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L3b
                return r0
            L3b:
                r6.L$0 = r1
                r6.label = r2
                r4 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r7 != r0) goto L2e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reown.sign.engine.domain.SignEngine.C19641.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final Flow<Unit> repeatableFlow() {
        return FlowKt.flow(new C19641(null));
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.domain.SignEngine.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
