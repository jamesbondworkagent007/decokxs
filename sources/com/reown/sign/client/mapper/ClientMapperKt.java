package com.reown.sign.client.mapper;

import com.reown.android.Core;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.ConnectionState;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.SDKError;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoKt;
import com.reown.android.internal.common.signing.cacao.CacaoType;
import com.reown.android.utils.ExtensionsKt;
import com.reown.sign.client.Sign;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.common.PayloadParams;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.engine.model.EngineDO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56403yEb;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class ClientMapperKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Validation.values().length];
            try {
                iArr[Validation.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Validation.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Validation.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ JsonRpcResponse toJsonRpcResponse(Sign.Model.JsonRpcResponse jsonRpcResponse) {
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        if (jsonRpcResponse instanceof Sign.Model.JsonRpcResponse.JsonRpcResult) {
            return toRpcResult((Sign.Model.JsonRpcResponse.JsonRpcResult) jsonRpcResponse);
        }
        if (jsonRpcResponse instanceof Sign.Model.JsonRpcResponse.JsonRpcError) {
            return toRpcError((Sign.Model.JsonRpcResponse.JsonRpcError) jsonRpcResponse);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.SettledSessionResponse toClientSettledSessionResponse(EngineDO.SettledSessionResponse settledSessionResponse) {
        Intrinsics.checkNotNullParameter(settledSessionResponse, "");
        if (settledSessionResponse instanceof EngineDO.SettledSessionResponse.Result) {
            return new Sign.Model.SettledSessionResponse.Result(toClientActiveSession(((EngineDO.SettledSessionResponse.Result) settledSessionResponse).getSettledSession()));
        }
        if (settledSessionResponse instanceof EngineDO.SettledSessionResponse.Error) {
            return new Sign.Model.SettledSessionResponse.Error(((EngineDO.SettledSessionResponse.Error) settledSessionResponse).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.SessionAuthenticateResponse toClientSessionAuthenticateResponse(EngineDO.SessionAuthenticateResponse sessionAuthenticateResponse) {
        Intrinsics.checkNotNullParameter(sessionAuthenticateResponse, "");
        if (!(sessionAuthenticateResponse instanceof EngineDO.SessionAuthenticateResponse.Result)) {
            if (!(sessionAuthenticateResponse instanceof EngineDO.SessionAuthenticateResponse.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            EngineDO.SessionAuthenticateResponse.Error error = (EngineDO.SessionAuthenticateResponse.Error) sessionAuthenticateResponse;
            return new Sign.Model.SessionAuthenticateResponse.Error(error.getId(), error.getCode(), error.getMessage());
        }
        EngineDO.SessionAuthenticateResponse.Result result = (EngineDO.SessionAuthenticateResponse.Result) sessionAuthenticateResponse;
        long id = result.getId();
        List client = toClient(result.getCacaos());
        EngineDO.Session session = result.getSession();
        return new Sign.Model.SessionAuthenticateResponse.Result(id, client, session != null ? toClientActiveSession(session) : null);
    }

    public static final /* synthetic */ Sign.Model.SessionUpdateResponse toClientUpdateSessionNamespacesResponse(EngineDO.SessionUpdateNamespacesResponse sessionUpdateNamespacesResponse) {
        Intrinsics.checkNotNullParameter(sessionUpdateNamespacesResponse, "");
        if (sessionUpdateNamespacesResponse instanceof EngineDO.SessionUpdateNamespacesResponse.Result) {
            EngineDO.SessionUpdateNamespacesResponse.Result result = (EngineDO.SessionUpdateNamespacesResponse.Result) sessionUpdateNamespacesResponse;
            return new Sign.Model.SessionUpdateResponse.Result(result.getTopic().getValue(), toMapOfClientNamespacesSession(result.getNamespaces()));
        }
        if (sessionUpdateNamespacesResponse instanceof EngineDO.SessionUpdateNamespacesResponse.Error) {
            return new Sign.Model.SessionUpdateResponse.Error(((EngineDO.SessionUpdateNamespacesResponse.Error) sessionUpdateNamespacesResponse).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse toClientJsonRpcResponse(EngineDO.JsonRpcResponse jsonRpcResponse) {
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        if (jsonRpcResponse instanceof EngineDO.JsonRpcResponse.JsonRpcResult) {
            return toClientJsonRpcResult((EngineDO.JsonRpcResponse.JsonRpcResult) jsonRpcResponse);
        }
        if (jsonRpcResponse instanceof EngineDO.JsonRpcResponse.JsonRpcError) {
            return toClientJsonRpcError((EngineDO.JsonRpcResponse.JsonRpcError) jsonRpcResponse);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.SessionProposal toClientSessionProposal(EngineDO.SessionProposal sessionProposal) {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        return new Sign.Model.SessionProposal(sessionProposal.getPairingTopic(), sessionProposal.getName(), sessionProposal.getDescription(), sessionProposal.getUrl(), sessionProposal.getIcons(), sessionProposal.getRedirect(), toMapOfClientNamespacesProposal(sessionProposal.getRequiredNamespaces()), toMapOfClientNamespacesProposal(sessionProposal.getOptionalNamespaces()), sessionProposal.getProperties(), sessionProposal.getProposerPublicKey(), sessionProposal.getRelayProtocol(), sessionProposal.getRelayData());
    }

    public static final /* synthetic */ Sign.Model.VerifyContext toCore(EngineDO.VerifyContext verifyContext) {
        Intrinsics.checkNotNullParameter(verifyContext, "");
        return new Sign.Model.VerifyContext(verifyContext.getId(), verifyContext.getOrigin(), toClientValidation(verifyContext.getValidation()), verifyContext.getVerifyUrl(), verifyContext.isScam());
    }

    public static final Sign.Model.Validation toClientValidation(@NotNull Validation validation) {
        Intrinsics.checkNotNullParameter(validation, "");
        int i = WhenMappings.$EnumSwitchMapping$0[validation.ordinal()];
        if (i == 1) {
            return Sign.Model.Validation.VALID;
        }
        if (i == 2) {
            return Sign.Model.Validation.INVALID;
        }
        if (i == 3) {
            return Sign.Model.Validation.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.SessionRequest toClientSessionRequest(EngineDO.SessionRequest sessionRequest) {
        Intrinsics.checkNotNullParameter(sessionRequest, "");
        String topic = sessionRequest.getTopic();
        String chainId = sessionRequest.getChainId();
        AppMetaData peerAppMetaData = sessionRequest.getPeerAppMetaData();
        return new Sign.Model.SessionRequest(topic, chainId, peerAppMetaData != null ? ExtensionsKt.toClient(peerAppMetaData) : null, new Sign.Model.SessionRequest.JSONRPCRequest(sessionRequest.getRequest().getId(), sessionRequest.getRequest().getMethod(), sessionRequest.getRequest().getParams()));
    }

    public static final /* synthetic */ EngineDO.PayloadParams toEngine(Sign.Model.PayloadParams payloadParams) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        String header = CacaoType.CAIP222.getHeader();
        List<String> chains = payloadParams.getChains();
        String domain = payloadParams.getDomain();
        String aud = payloadParams.getAud();
        return new EngineDO.PayloadParams(chains, domain, payloadParams.getNonce(), aud, header, payloadParams.getIat(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources(), "1");
    }

    public static final /* synthetic */ EngineDO.Authenticate toAuthenticate(Sign.Params.Authenticate authenticate) {
        Intrinsics.checkNotNullParameter(authenticate, "");
        String header = CacaoType.EIP4361.getHeader();
        return new EngineDO.Authenticate(null, authenticate.getChains(), authenticate.getDomain(), authenticate.getNonce(), authenticate.getUri(), header, authenticate.getNbf(), authenticate.getExp(), authenticate.getStatement(), authenticate.getRequestId(), authenticate.getResources(), authenticate.getMethods(), authenticate.getExpiry(), 1, null);
    }

    public static final /* synthetic */ Sign.Model.Cacao.Payload toCacaoPayload(Sign.Model.PayloadParams payloadParams, String str) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new Sign.Model.Cacao.Payload(str, payloadParams.getDomain(), payloadParams.getAud(), "1", payloadParams.getNonce(), payloadParams.getIat(), payloadParams.getNbf(), payloadParams.getExp(), getStatement(payloadParams), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final String getStatement(Sign.Model.PayloadParams payloadParams) {
        String statement = payloadParams.getStatement();
        if (statement != null && StringsKt__StringsKt.contains$default((CharSequence) statement, (CharSequence) CacaoKt.RECAPS_STATEMENT, false, 2, (Object) null)) {
            return payloadParams.getStatement();
        }
        return CacaoKt.getStatement(new Pair(payloadParams.getStatement(), payloadParams.getResources()));
    }

    public static final /* synthetic */ JsonRpcResponse.JsonRpcResult toRpcResult(Sign.Model.JsonRpcResponse.JsonRpcResult jsonRpcResult) {
        Intrinsics.checkNotNullParameter(jsonRpcResult, "");
        return new JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), null, jsonRpcResult.getResult(), 2, null);
    }

    public static final /* synthetic */ JsonRpcResponse.JsonRpcError toRpcError(Sign.Model.JsonRpcResponse.JsonRpcError jsonRpcError) {
        Intrinsics.checkNotNullParameter(jsonRpcError, "");
        return new JsonRpcResponse.JsonRpcError(jsonRpcError.getId(), null, new JsonRpcResponse.Error(jsonRpcError.getCode(), jsonRpcError.getMessage()), 2, null);
    }

    public static final /* synthetic */ EngineDO.Event toEngineEvent(Sign.Model.SessionEvent sessionEvent, String str) {
        Intrinsics.checkNotNullParameter(sessionEvent, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EngineDO.Event(sessionEvent.getName(), sessionEvent.getData(), str);
    }

    public static final /* synthetic */ Sign.Model.DeletedSession toClientDeletedSession(EngineDO.SessionDelete sessionDelete) {
        Intrinsics.checkNotNullParameter(sessionDelete, "");
        return new Sign.Model.DeletedSession.Success(sessionDelete.getTopic(), sessionDelete.getReason());
    }

    public static final /* synthetic */ Sign.Model.SessionEvent toClientSessionEvent(EngineDO.SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "");
        return new Sign.Model.SessionEvent(sessionEvent.getName(), sessionEvent.getData());
    }

    public static final /* synthetic */ Sign.Model.SessionAuthenticate toClientSessionAuthenticate(EngineDO.SessionAuthenticateEvent sessionAuthenticateEvent) {
        Intrinsics.checkNotNullParameter(sessionAuthenticateEvent, "");
        sessionAuthenticateEvent.getPayloadParams();
        return new Sign.Model.SessionAuthenticate(sessionAuthenticateEvent.getId(), sessionAuthenticateEvent.getPairingTopic(), toClient(sessionAuthenticateEvent.getParticipant()), toClient(sessionAuthenticateEvent.getPayloadParams()), sessionAuthenticateEvent.getExpiryTimestamp());
    }

    public static final /* synthetic */ Sign.Model.SessionAuthenticate.Participant toClient(EngineDO.Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "");
        return new Sign.Model.SessionAuthenticate.Participant(participant.getPublicKey(), ExtensionsKt.toClient(participant.getMetadata()));
    }

    public static final /* synthetic */ Sign.Model.PayloadParams toClient(EngineDO.PayloadParams payloadParams) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        String type = payloadParams.getType();
        List<String> chains = payloadParams.getChains();
        String domain = payloadParams.getDomain();
        String aud = payloadParams.getAud();
        return new Sign.Model.PayloadParams(chains, domain, payloadParams.getNonce(), aud, type, payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getIat(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final /* synthetic */ Sign.Model.Event toClientEvent(EngineDO.SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "");
        return new Sign.Model.Event(sessionEvent.getTopic(), sessionEvent.getName(), sessionEvent.getData(), sessionEvent.getChainId());
    }

    public static final /* synthetic */ Sign.Model.Session toClientActiveSession(EngineDO.Session session) {
        Intrinsics.checkNotNullParameter(session, "");
        String pairingTopic = session.getPairingTopic();
        String value = session.getTopic().getValue();
        long seconds = session.getExpiry().getSeconds();
        Map mapOfClientNamespacesProposal = toMapOfClientNamespacesProposal(session.getRequiredNamespaces());
        Map<String, EngineDO.Namespace.Proposal> optionalNamespaces = session.getOptionalNamespaces();
        Map mapOfClientNamespacesProposal2 = optionalNamespaces != null ? toMapOfClientNamespacesProposal(optionalNamespaces) : null;
        Map mapOfClientNamespacesSession = toMapOfClientNamespacesSession(session.getNamespaces());
        AppMetaData peerAppMetaData = session.getPeerAppMetaData();
        return new Sign.Model.Session(pairingTopic, value, seconds, mapOfClientNamespacesProposal, mapOfClientNamespacesProposal2, mapOfClientNamespacesSession, peerAppMetaData != null ? ExtensionsKt.toClient(peerAppMetaData) : null);
    }

    public static final /* synthetic */ Sign.Model.Session toClientActiveSession(EngineDO.SessionExtend sessionExtend) {
        Intrinsics.checkNotNullParameter(sessionExtend, "");
        String pairingTopic = sessionExtend.getPairingTopic();
        String value = sessionExtend.getTopic().getValue();
        long seconds = sessionExtend.getExpiry().getSeconds();
        Map mapOfClientNamespacesProposal = toMapOfClientNamespacesProposal(sessionExtend.getRequiredNamespaces());
        Map<String, EngineDO.Namespace.Proposal> optionalNamespaces = sessionExtend.getOptionalNamespaces();
        Map mapOfClientNamespacesProposal2 = optionalNamespaces != null ? toMapOfClientNamespacesProposal(optionalNamespaces) : null;
        Map mapOfClientNamespacesSession = toMapOfClientNamespacesSession(sessionExtend.getNamespaces());
        AppMetaData peerAppMetaData = sessionExtend.getPeerAppMetaData();
        return new Sign.Model.Session(pairingTopic, value, seconds, mapOfClientNamespacesProposal, mapOfClientNamespacesProposal2, mapOfClientNamespacesSession, peerAppMetaData != null ? ExtensionsKt.toClient(peerAppMetaData) : null);
    }

    public static final /* synthetic */ Sign.Model.RejectedSession toClientSessionRejected(EngineDO.SessionRejected sessionRejected) {
        Intrinsics.checkNotNullParameter(sessionRejected, "");
        return new Sign.Model.RejectedSession(sessionRejected.getTopic(), sessionRejected.getReason());
    }

    public static final /* synthetic */ Sign.Model.ApprovedSession toClientSessionApproved(EngineDO.SessionApproved sessionApproved) {
        Intrinsics.checkNotNullParameter(sessionApproved, "");
        String topic = sessionApproved.getTopic();
        AppMetaData peerAppMetaData = sessionApproved.getPeerAppMetaData();
        return new Sign.Model.ApprovedSession(topic, peerAppMetaData != null ? ExtensionsKt.toClient(peerAppMetaData) : null, toMapOfClientNamespacesSession(sessionApproved.getNamespaces()), sessionApproved.getAccounts());
    }

    public static final /* synthetic */ EngineDO.Request toEngineDORequest(Sign.Params.Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        String sessionTopic = request.getSessionTopic();
        String method = request.getMethod();
        String params = request.getParams();
        String chainId = request.getChainId();
        Long expiry = request.getExpiry();
        return new EngineDO.Request(sessionTopic, method, params, chainId, expiry != null ? new Expiry(expiry.longValue()) : null);
    }

    public static final /* synthetic */ Sign.Model.SentRequest toSentRequest(Sign.Params.Request request, long j) {
        Intrinsics.checkNotNullParameter(request, "");
        return new Sign.Model.SentRequest(j, request.getSessionTopic(), request.getMethod(), request.getParams(), request.getChainId());
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse.JsonRpcResult toClientJsonRpcResult(EngineDO.JsonRpcResponse.JsonRpcResult jsonRpcResult) {
        Intrinsics.checkNotNullParameter(jsonRpcResult, "");
        return new Sign.Model.JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), jsonRpcResult.getResult());
    }

    public static final /* synthetic */ Sign.Model.UpdatedSession toClientSessionsNamespaces(EngineDO.SessionUpdateNamespaces sessionUpdateNamespaces) {
        Intrinsics.checkNotNullParameter(sessionUpdateNamespaces, "");
        return new Sign.Model.UpdatedSession(sessionUpdateNamespaces.getTopic().getValue(), toMapOfClientNamespacesSession(sessionUpdateNamespaces.getNamespaces()));
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse.JsonRpcError toClientJsonRpcError(EngineDO.JsonRpcResponse.JsonRpcError jsonRpcError) {
        Intrinsics.checkNotNullParameter(jsonRpcError, "");
        return new Sign.Model.JsonRpcResponse.JsonRpcError(jsonRpcError.getId(), jsonRpcError.getError().getCode(), jsonRpcError.getError().getMessage());
    }

    public static final /* synthetic */ Sign.Model.Pairing toClientSettledPairing(EngineDO.PairingSettle pairingSettle) {
        Intrinsics.checkNotNullParameter(pairingSettle, "");
        String value = pairingSettle.getTopic().getValue();
        AppMetaData appMetaData = pairingSettle.getAppMetaData();
        return new Sign.Model.Pairing(value, appMetaData != null ? ExtensionsKt.toClient(appMetaData) : null);
    }

    public static final /* synthetic */ Sign.Model.SessionAuthenticate toClient(Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return new Sign.Model.SessionAuthenticate(request.getId(), request.getTopic().getValue(), new Sign.Model.SessionAuthenticate.Participant(((SignParams.SessionAuthenticateParams) request.getParams()).getRequester().getPublicKey(), ExtensionsKt.toClient(((SignParams.SessionAuthenticateParams) request.getParams()).getRequester().getMetadata())), toClient((SignParams.SessionAuthenticateParams) request.getParams()), ((SignParams.SessionAuthenticateParams) request.getParams()).getExpiryTimestamp());
    }

    public static final /* synthetic */ Sign.Model.PayloadParams toClient(SignParams.SessionAuthenticateParams sessionAuthenticateParams) {
        Intrinsics.checkNotNullParameter(sessionAuthenticateParams, "");
        PayloadParams authPayload = sessionAuthenticateParams.getAuthPayload();
        String type = authPayload.getType();
        List<String> chains = authPayload.getChains();
        String domain = authPayload.getDomain();
        String aud = authPayload.getAud();
        return new Sign.Model.PayloadParams(chains, domain, authPayload.getNonce(), aud, type, authPayload.getNbf(), authPayload.getExp(), authPayload.getIat(), authPayload.getStatement(), authPayload.getRequestId(), authPayload.getResources());
    }

    public static final /* synthetic */ Sign.Model.SessionRequestResponse toClientSessionPayloadResponse(EngineDO.SessionPayloadResponse sessionPayloadResponse) {
        Intrinsics.checkNotNullParameter(sessionPayloadResponse, "");
        return new Sign.Model.SessionRequestResponse(sessionPayloadResponse.getTopic(), sessionPayloadResponse.getChainId(), sessionPayloadResponse.getMethod(), toClientJsonRpcResponse(sessionPayloadResponse.getResult()));
    }

    public static final /* synthetic */ Sign.Model.ConnectionState toClientConnectionState(ConnectionState connectionState) {
        Intrinsics.checkNotNullParameter(connectionState, "");
        return new Sign.Model.ConnectionState(connectionState.isAvailable(), null, 2, null);
    }

    public static final /* synthetic */ Sign.Model.ExpiredProposal toClient(EngineDO.ExpiredProposal expiredProposal) {
        Intrinsics.checkNotNullParameter(expiredProposal, "");
        return new Sign.Model.ExpiredProposal(expiredProposal.getPairingTopic(), expiredProposal.getProposerPublicKey());
    }

    public static final /* synthetic */ Sign.Model.ExpiredRequest toClient(EngineDO.ExpiredRequest expiredRequest) {
        Intrinsics.checkNotNullParameter(expiredRequest, "");
        return new Sign.Model.ExpiredRequest(expiredRequest.getTopic(), expiredRequest.getId());
    }

    public static final /* synthetic */ Sign.Model.Error toClientError(SDKError sDKError) {
        Intrinsics.checkNotNullParameter(sDKError, "");
        return new Sign.Model.Error(sDKError.getException());
    }

    public static final /* synthetic */ Sign.Model.Message.SessionProposal toSign(Core.Model.Message.SessionProposal sessionProposal) {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        return new Sign.Model.Message.SessionProposal(sessionProposal.getId(), sessionProposal.getPairingTopic(), sessionProposal.getName(), sessionProposal.getDescription(), sessionProposal.getUrl(), sessionProposal.getIcons(), sessionProposal.getRedirect(), toSign(sessionProposal.getRequiredNamespaces()), toSign(sessionProposal.getOptionalNamespaces()), sessionProposal.getProperties(), sessionProposal.getProposerPublicKey(), sessionProposal.getRelayProtocol(), sessionProposal.getRelayData());
    }

    public static final /* synthetic */ Sign.Model.Message.SessionAuthenticate toSign(Core.Model.Message.SessionAuthenticate sessionAuthenticate) {
        Intrinsics.checkNotNullParameter(sessionAuthenticate, "");
        return new Sign.Model.Message.SessionAuthenticate(sessionAuthenticate.getId(), sessionAuthenticate.getTopic(), sessionAuthenticate.getMetadata(), toClient(sessionAuthenticate.getPayloadParams()), sessionAuthenticate.getExpiry());
    }

    public static final Sign.Model.PayloadParams toClient(Core.Model.Message.SessionAuthenticate.PayloadParams payloadParams) {
        return new Sign.Model.PayloadParams(payloadParams.getChains(), payloadParams.getDomain(), payloadParams.getNonce(), payloadParams.getAud(), payloadParams.getType(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getIat(), payloadParams.getRequestId(), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final /* synthetic */ Sign.Model.Message.SessionRequest toSign(Core.Model.Message.SessionRequest sessionRequest) {
        Intrinsics.checkNotNullParameter(sessionRequest, "");
        return new Sign.Model.Message.SessionRequest(sessionRequest.getTopic(), sessionRequest.getChainId(), sessionRequest.getPeerMetaData(), new Sign.Model.Message.SessionRequest.JSONRPCRequest(sessionRequest.getRequest().getId(), sessionRequest.getRequest().getMethod(), sessionRequest.getRequest().getParams()));
    }

    public static final /* synthetic */ List toCommon(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sign.Model.Cacao cacao = (Sign.Model.Cacao) it.next();
            arrayList.add(new Cacao(new Cacao.Header(cacao.getHeader().getT()), new Cacao.Payload(cacao.getPayload().getIss(), cacao.getPayload().getDomain(), cacao.getPayload().getAud(), cacao.getPayload().getVersion(), cacao.getPayload().getNonce(), cacao.getPayload().getIat(), cacao.getPayload().getNbf(), cacao.getPayload().getExp(), cacao.getPayload().getStatement(), cacao.getPayload().getRequestId(), cacao.getPayload().getResources()), new Cacao.Signature(cacao.getSignature().getT(), cacao.getSignature().getS(), cacao.getSignature().getM())));
        }
        return arrayList;
    }

    public static final /* synthetic */ List toClient(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Cacao cacao = (Cacao) it.next();
            arrayList.add(new Sign.Model.Cacao(new Sign.Model.Cacao.Header(cacao.getHeader().getT()), new Sign.Model.Cacao.Payload(cacao.getPayload().getIss(), cacao.getPayload().getDomain(), cacao.getPayload().getAud(), cacao.getPayload().getVersion(), cacao.getPayload().getNonce(), cacao.getPayload().getIat(), cacao.getPayload().getNbf(), cacao.getPayload().getExp(), cacao.getPayload().getStatement(), cacao.getPayload().getRequestId(), cacao.getPayload().getResources()), new Sign.Model.Cacao.Signature(cacao.getSignature().getT(), cacao.getSignature().getS(), cacao.getSignature().getM())));
        }
        return arrayList;
    }

    public static final /* synthetic */ Map toMapOfClientNamespacesSession(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.Namespace.Session session = (EngineDO.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ List mapToPendingRequests(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            arrayList.add(new Sign.Model.PendingRequest(request.getId(), request.getTopic().getValue(), request.getMethod(), request.getChainId(), (String) request.getParams()));
        }
        return arrayList;
    }

    public static final /* synthetic */ List mapToPendingSessionRequests(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toClientSessionRequest((EngineDO.SessionRequest) it.next()));
        }
        return arrayList;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesRequired(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Proposal proposal = (Sign.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesOptional(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Proposal proposal = (Sign.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfClientNamespacesProposal(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.Namespace.Proposal proposal = (EngineDO.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesSession(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Session session = (Sign.Model.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toProposalNamespacesVO(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Proposal proposal = (Sign.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Namespace.Proposal(proposal.getMethods(), proposal.getChains(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toSessionNamespacesVO(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Session session = (Sign.Model.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toCore(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Namespace.Session session = (Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toSign(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Core.Model.Namespace.Proposal proposal = (Core.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }
}
