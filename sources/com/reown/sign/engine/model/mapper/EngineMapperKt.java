package com.reown.sign.engine.model.mapper;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SessionProposer;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoKt;
import com.reown.android.internal.common.signing.cacao.CacaoType;
import com.reown.android.internal.common.signing.cacao.Issuer;
import com.reown.android.verify.model.VerifyContext;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.exceptions.PeerError;
import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.common.PayloadParams;
import com.reown.sign.common.model.vo.clientsync.common.Requester;
import com.reown.sign.common.model.vo.clientsync.common.SessionParticipant;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.common.model.vo.sequence.SessionVO;
import com.reown.sign.engine.model.EngineDO;
import com.reown.sign.engine.model.ValidationError;
import com.reown.sign.json_rpc.model.JsonRpcMethod;
import com.reown.util.UtilFunctionsKt;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.C56406yEe;
import o.C56423yEv;
import o.C56424yEw;
import o.C56529yIt;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class EngineMapperKt {
    public static final /* synthetic */ String toAbsoluteString(EngineDO.WalletConnectUri walletConnectUri) {
        Intrinsics.checkNotNullParameter(walletConnectUri, "");
        return "wc:" + walletConnectUri.getTopic().getValue() + "@" + walletConnectUri.getVersion() + "?" + getQuery(walletConnectUri) + "&symKey=" + walletConnectUri.m7343getSymKeyC2wS6ak();
    }

    public static final String getQuery(EngineDO.WalletConnectUri walletConnectUri) {
        String str = "relay-protocol=" + walletConnectUri.getRelay().getProtocol();
        if (walletConnectUri.getRelay().getData() == null) {
            return str;
        }
        return str + "&relay-data=" + walletConnectUri.getRelay().getData();
    }

    public static final /* synthetic */ EngineDO.SessionProposal toEngineDO(SignParams.SessionProposeParams sessionProposeParams, Topic topic) {
        String empty;
        Map mapKWHzl;
        Intrinsics.checkNotNullParameter(sessionProposeParams, "");
        Intrinsics.checkNotNullParameter(topic, "");
        String value = topic.getValue();
        String name = sessionProposeParams.getProposer().getMetadata().getName();
        String description = sessionProposeParams.getProposer().getMetadata().getDescription();
        String url = sessionProposeParams.getProposer().getMetadata().getUrl();
        List<String> icons = sessionProposeParams.getProposer().getMetadata().getIcons();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = icons.iterator();
        while (it.hasNext()) {
            URI uriConvertToURI = convertToURI((String) it.next());
            if (uriConvertToURI != null) {
                arrayList.add(uriConvertToURI);
            }
        }
        Redirect redirect = sessionProposeParams.getProposer().getMetadata().getRedirect();
        if (redirect == null || (empty = redirect.getNative()) == null) {
            empty = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str = empty;
        Map mapOfEngineNamespacesRequired = toMapOfEngineNamespacesRequired(sessionProposeParams.getRequiredNamespaces());
        Map<String, Namespace.Proposal> optionalNamespaces = sessionProposeParams.getOptionalNamespaces();
        if (optionalNamespaces == null || (mapKWHzl = toMapOfEngineNamespacesOptional(optionalNamespaces)) == null) {
            mapKWHzl = C56424yEw.KWHzl();
        }
        return new EngineDO.SessionProposal(value, name, description, url, arrayList, str, mapOfEngineNamespacesRequired, mapKWHzl, sessionProposeParams.getProperties(), sessionProposeParams.getProposer().getPublicKey(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getProtocol(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getData());
    }

    public static final /* synthetic */ ProposalVO toVO(SignParams.SessionProposeParams sessionProposeParams, Topic topic, long j) {
        String empty;
        Intrinsics.checkNotNullParameter(sessionProposeParams, "");
        Intrinsics.checkNotNullParameter(topic, "");
        String name = sessionProposeParams.getProposer().getMetadata().getName();
        String description = sessionProposeParams.getProposer().getMetadata().getDescription();
        String url = sessionProposeParams.getProposer().getMetadata().getUrl();
        List<String> icons = sessionProposeParams.getProposer().getMetadata().getIcons();
        Redirect redirect = sessionProposeParams.getProposer().getMetadata().getRedirect();
        if (redirect == null || (empty = redirect.getNative()) == null) {
            empty = UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        String str = empty;
        Map<String, Namespace.Proposal> requiredNamespaces = sessionProposeParams.getRequiredNamespaces();
        Map<String, Namespace.Proposal> optionalNamespaces = sessionProposeParams.getOptionalNamespaces();
        if (optionalNamespaces == null) {
            optionalNamespaces = C56424yEw.KWHzl();
        }
        return new ProposalVO(j, topic, name, description, url, icons, str, requiredNamespaces, optionalNamespaces, sessionProposeParams.getProperties(), sessionProposeParams.getProposer().getPublicKey(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getProtocol(), ((RelayProtocolOptions) CollectionsKt___CollectionsKt.AuCTelauCTel(sessionProposeParams.getRelays())).getData(), sessionProposeParams.getExpiryTimestamp() != null ? new Expiry(sessionProposeParams.getExpiryTimestamp().longValue()) : null);
    }

    public static final /* synthetic */ WCRequest toSessionProposeRequest(ProposalVO proposalVO) {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        Topic pairingTopic = proposalVO.getPairingTopic();
        long requestId = proposalVO.getRequestId();
        List listEZpvd = C56402yEa.EZpvd(new RelayProtocolOptions(proposalVO.getRelayProtocol(), proposalVO.getRelayData()));
        SessionProposer sessionProposer = new SessionProposer(proposalVO.getProposerPublicKey(), new AppMetaData(proposalVO.getDescription(), proposalVO.getUrl(), proposalVO.getIcons(), proposalVO.getName(), null, null, 48, null));
        Map<String, Namespace.Proposal> requiredNamespaces = proposalVO.getRequiredNamespaces();
        Map<String, Namespace.Proposal> optionalNamespaces = proposalVO.getOptionalNamespaces();
        Map<String, String> properties = proposalVO.getProperties();
        Expiry expiry = proposalVO.getExpiry();
        return new WCRequest(pairingTopic, requestId, JsonRpcMethod.WC_SESSION_PROPOSE, new SignParams.SessionProposeParams(requiredNamespaces, optionalNamespaces, listEZpvd, sessionProposer, properties, expiry != null ? Long.valueOf(expiry.getSeconds()) : null), null, 0L, null, null, TransportType.RELAY, PsExtractor.VIDEO_STREAM_MASK, null);
    }

    public static final /* synthetic */ EngineDO.SessionRequest toEngineDO(SignParams.SessionRequestParams sessionRequestParams, WCRequest wCRequest, AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(sessionRequestParams, "");
        Intrinsics.checkNotNullParameter(wCRequest, "");
        return new EngineDO.SessionRequest(wCRequest.getTopic().getValue(), sessionRequestParams.getChainId(), appMetaData, new EngineDO.SessionRequest.JSONRPCRequest(wCRequest.getId(), sessionRequestParams.getRequest().getMethod(), sessionRequestParams.getRequest().getParams()), sessionRequestParams.getRequest().getExpiryTimestamp() != null ? new Expiry(sessionRequestParams.getRequest().getExpiryTimestamp().longValue()) : null);
    }

    public static final /* synthetic */ EngineDO.SessionDelete toEngineDO(SignParams.DeleteParams deleteParams, Topic topic) {
        Intrinsics.checkNotNullParameter(deleteParams, "");
        Intrinsics.checkNotNullParameter(topic, "");
        return new EngineDO.SessionDelete(topic.getValue(), deleteParams.getMessage());
    }

    public static final /* synthetic */ EngineDO.SessionEvent toEngineDO(SignParams.EventParams eventParams, Topic topic) {
        Intrinsics.checkNotNullParameter(eventParams, "");
        Intrinsics.checkNotNullParameter(topic, "");
        return new EngineDO.SessionEvent(topic.getValue(), eventParams.getEvent().getName(), eventParams.getEvent().getData().toString(), eventParams.getChainId());
    }

    public static final /* synthetic */ EngineDO.Session toEngineDO(SessionVO sessionVO) {
        Intrinsics.checkNotNullParameter(sessionVO, "");
        Topic topic = sessionVO.getTopic();
        Expiry expiry = sessionVO.getExpiry();
        String pairingTopic = sessionVO.getPairingTopic();
        Map mapOfEngineNamespacesRequired = toMapOfEngineNamespacesRequired(sessionVO.getRequiredNamespaces());
        Map<String, Namespace.Proposal> optionalNamespaces = sessionVO.getOptionalNamespaces();
        return new EngineDO.Session(topic, expiry, pairingTopic, mapOfEngineNamespacesRequired, optionalNamespaces != null ? toMapOfEngineNamespacesOptional(optionalNamespaces) : null, toMapOfEngineNamespacesSession(sessionVO.getSessionNamespaces()), sessionVO.getPeerAppMetaData());
    }

    public static final /* synthetic */ EngineDO.SessionExtend toEngineDOSessionExtend(SessionVO sessionVO, Expiry expiry) {
        Intrinsics.checkNotNullParameter(sessionVO, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        Topic topic = sessionVO.getTopic();
        String pairingTopic = sessionVO.getPairingTopic();
        Map mapOfEngineNamespacesRequired = toMapOfEngineNamespacesRequired(sessionVO.getRequiredNamespaces());
        Map<String, Namespace.Proposal> optionalNamespaces = sessionVO.getOptionalNamespaces();
        return new EngineDO.SessionExtend(topic, expiry, pairingTopic, mapOfEngineNamespacesRequired, optionalNamespaces != null ? toMapOfEngineNamespacesOptional(optionalNamespaces) : null, toMapOfEngineNamespacesSession(sessionVO.getSessionNamespaces()), sessionVO.getSelfAppMetaData());
    }

    public static final /* synthetic */ EngineDO.SessionApproved toSessionApproved(SessionVO sessionVO) {
        Intrinsics.checkNotNullParameter(sessionVO, "");
        String value = sessionVO.getTopic().getValue();
        AppMetaData peerAppMetaData = sessionVO.getPeerAppMetaData();
        Map<String, Namespace.Session> sessionNamespaces = sessionVO.getSessionNamespaces();
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, Namespace.Session>> it = sessionNamespaces.entrySet().iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, it.next().getValue().getAccounts());
        }
        return new EngineDO.SessionApproved(value, peerAppMetaData, arrayList, toMapOfEngineNamespacesSession(sessionVO.getSessionNamespaces()));
    }

    public static final /* synthetic */ SignParams.SessionSettleParams toSessionSettleParams(ProposalVO proposalVO, SessionParticipant sessionParticipant, long j, Map map) {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        Intrinsics.checkNotNullParameter(sessionParticipant, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new SignParams.SessionSettleParams(new RelayProtocolOptions(proposalVO.getRelayProtocol(), proposalVO.getRelayData()), sessionParticipant, toMapOfNamespacesVOSession(map), j, proposalVO.getProperties());
    }

    /* JADX INFO: renamed from: toSessionProposeParams-94aGZGE, reason: not valid java name */
    public static final /* synthetic */ SignParams.SessionProposeParams m7345toSessionProposeParams94aGZGE(List list, Map map, Map map2, Map map3, String str, AppMetaData appMetaData, Expiry expiry) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        if (list == null) {
            list = C56402yEa.EZpvd(new RelayProtocolOptions(null, null, 3, null));
        }
        SessionProposer sessionProposer = new SessionProposer(str, appMetaData);
        return new SignParams.SessionProposeParams(toNamespacesVORequired(map), toNamespacesVOOptional(map2), list, sessionProposer, map3, Long.valueOf(expiry.getSeconds()));
    }

    public static final /* synthetic */ EngineDO.SessionProposal toEngineDO(ProposalVO proposalVO) {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        String value = proposalVO.getPairingTopic().getValue();
        String name = proposalVO.getName();
        String description = proposalVO.getDescription();
        String url = proposalVO.getUrl();
        List<String> icons = proposalVO.getIcons();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = icons.iterator();
        while (it.hasNext()) {
            URI uriConvertToURI = convertToURI((String) it.next());
            if (uriConvertToURI != null) {
                arrayList.add(uriConvertToURI);
            }
        }
        String redirect = proposalVO.getRedirect();
        String relayData = proposalVO.getRelayData();
        String relayProtocol = proposalVO.getRelayProtocol();
        return new EngineDO.SessionProposal(value, name, description, url, arrayList, redirect, toMapOfEngineNamespacesRequired(proposalVO.getRequiredNamespaces()), toMapOfEngineNamespacesOptional(proposalVO.getOptionalNamespaces()), proposalVO.getProperties(), proposalVO.getProposerPublicKey(), relayProtocol, relayData);
    }

    public static final /* synthetic */ EngineDO.ExpiredProposal toExpiredProposal(ProposalVO proposalVO) {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        return new EngineDO.ExpiredProposal(proposalVO.getPairingTopic().getValue(), proposalVO.getProposerPublicKey());
    }

    public static final /* synthetic */ EngineDO.ExpiredRequest toExpiredSessionRequest(Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return new EngineDO.ExpiredRequest(request.getTopic().getValue(), request.getId());
    }

    public static final URI convertToURI(String str) {
        try {
            return new URI(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final /* synthetic */ EngineDO.JsonRpcResponse.JsonRpcResult toEngineDO(JsonRpcResponse.JsonRpcResult jsonRpcResult) {
        Intrinsics.checkNotNullParameter(jsonRpcResult, "");
        return new EngineDO.JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), null, jsonRpcResult.getResult().toString(), 2, null);
    }

    public static final /* synthetic */ EngineDO.JsonRpcResponse.JsonRpcError toEngineDO(JsonRpcResponse.JsonRpcError jsonRpcError) {
        Intrinsics.checkNotNullParameter(jsonRpcError, "");
        return new EngineDO.JsonRpcResponse.JsonRpcError(jsonRpcError.getId(), null, new EngineDO.JsonRpcResponse.Error(jsonRpcError.getError().getCode(), jsonRpcError.getError().getMessage()), 2, null);
    }

    /* JADX INFO: renamed from: toSessionApproveParams-zo5FKG8, reason: not valid java name */
    public static final /* synthetic */ CoreSignParams.ApprovalParams m7344toSessionApproveParamszo5FKG8(ProposalVO proposalVO, String str) {
        Intrinsics.checkNotNullParameter(proposalVO, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CoreSignParams.ApprovalParams(new RelayProtocolOptions(proposalVO.getRelayProtocol(), proposalVO.getRelayData()), str);
    }

    public static final /* synthetic */ EngineDO.Request toEngineDO(SignParams.SessionRequestParams sessionRequestParams, Topic topic) {
        Intrinsics.checkNotNullParameter(sessionRequestParams, "");
        Intrinsics.checkNotNullParameter(topic, "");
        return new EngineDO.Request(topic.getValue(), sessionRequestParams.getRequest().getMethod(), sessionRequestParams.getRequest().getParams(), sessionRequestParams.getChainId(), null, 16, null);
    }

    public static final /* synthetic */ EngineDO.Event toEngineDOEvent(SignParams.EventParams eventParams) {
        Intrinsics.checkNotNullParameter(eventParams, "");
        return new EngineDO.Event(eventParams.getEvent().getName(), eventParams.getEvent().getData().toString(), eventParams.getChainId());
    }

    public static final /* synthetic */ EngineDO.SessionRequest toSessionRequest(Request request, AppMetaData appMetaData) {
        Intrinsics.checkNotNullParameter(request, "");
        return new EngineDO.SessionRequest(request.getTopic().getValue(), request.getChainId(), appMetaData, new EngineDO.SessionRequest.JSONRPCRequest(request.getId(), request.getMethod(), (String) request.getParams()), request.getExpiry());
    }

    public static final /* synthetic */ PeerError toPeerError(ValidationError validationError) {
        Intrinsics.checkNotNullParameter(validationError, "");
        if (validationError instanceof ValidationError.UnsupportedNamespaceKey) {
            return new PeerError.CAIP25.UnsupportedNamespaceKey(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UnsupportedChains) {
            return new PeerError.CAIP25.UnsupportedChains(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.InvalidEvent) {
            return new PeerError.Invalid.Event(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.InvalidExtendRequest) {
            return new PeerError.Invalid.ExtendRequest(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.InvalidSessionRequest) {
            return new PeerError.Invalid.Method(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UnauthorizedEvent) {
            return new PeerError.Unauthorized.Event(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UnauthorizedMethod) {
            return new PeerError.Unauthorized.Method(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UserRejected) {
            return new PeerError.CAIP25.UserRejected(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UserRejectedEvents) {
            return new PeerError.CAIP25.UserRejectedEvents(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UserRejectedMethods) {
            return new PeerError.CAIP25.UserRejectedMethods(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.UserRejectedChains) {
            return new PeerError.CAIP25.UserRejectedChains(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.InvalidSessionProperties) {
            return new PeerError.CAIP25.InvalidSessionPropertiesObject(validationError.getMessage());
        }
        if (validationError instanceof ValidationError.EmptyNamespaces) {
            return new PeerError.CAIP25.EmptySessionNamespaces(validationError.getMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ EngineDO.VerifyContext toEngineDO(VerifyContext verifyContext) {
        Intrinsics.checkNotNullParameter(verifyContext, "");
        return new EngineDO.VerifyContext(verifyContext.getId(), verifyContext.getOrigin(), verifyContext.getValidation(), verifyContext.getVerifyUrl(), verifyContext.isScam());
    }

    public static final /* synthetic */ EngineDO.Participant toEngineDO(Requester requester) {
        Intrinsics.checkNotNullParameter(requester, "");
        return new EngineDO.Participant(requester.getPublicKey(), requester.getMetadata());
    }

    public static final /* synthetic */ PayloadParams toCommon(EngineDO.Authenticate authenticate) {
        Intrinsics.checkNotNullParameter(authenticate, "");
        String domain = authenticate.getDomain();
        String aud = authenticate.getAud();
        String nonce = authenticate.getNonce();
        String nbf = authenticate.getNbf();
        String exp = authenticate.getExp();
        String statement = authenticate.getStatement();
        String requestId = authenticate.getRequestId();
        List<String> resources = authenticate.getResources();
        List<String> chains = authenticate.getChains();
        String type = authenticate.getType();
        if (type == null) {
            type = CacaoType.EIP4361.getHeader();
        }
        String str = type;
        String str2 = new SimpleDateFormat(Cacao.Payload.ISO_8601_PATTERN).format(Calendar.getInstance().getTime());
        Intrinsics.copydefault((Object) str2);
        return new PayloadParams(str, chains, domain, aud, nonce, "1", str2, nbf, exp, statement, requestId, resources);
    }

    public static final /* synthetic */ EngineDO.PayloadParams toEngineDO(PayloadParams payloadParams) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        String domain = payloadParams.getDomain();
        String aud = payloadParams.getAud();
        return new EngineDO.PayloadParams(payloadParams.getChains(), domain, payloadParams.getNonce(), aud, payloadParams.getType(), payloadParams.getIat(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources(), "1");
    }

    public static final /* synthetic */ Cacao.Payload toCacaoPayload(EngineDO.PayloadParams payloadParams, Issuer issuer) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        Intrinsics.checkNotNullParameter(issuer, "");
        return new Cacao.Payload(issuer.getValue(), payloadParams.getDomain(), payloadParams.getAud(), payloadParams.getVersion(), payloadParams.getNonce(), payloadParams.getIat(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final /* synthetic */ String toCAIP222Message(EngineDO.PayloadParams payloadParams, Issuer issuer, String str) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        Intrinsics.checkNotNullParameter(issuer, "");
        Intrinsics.checkNotNullParameter(str, "");
        return CacaoKt.toCAIP222Message(toCacaoPayload(payloadParams, issuer), str);
    }

    public static final /* synthetic */ Map toNamespacesVORequired(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.Namespace.Proposal proposal = (EngineDO.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Namespace.Proposal(proposal.getMethods(), proposal.getChains(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toNamespacesVOOptional(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.Namespace.Proposal proposal = (EngineDO.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Namespace.Proposal(proposal.getMethods(), proposal.getChains(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesRequired(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Namespace.Proposal proposal = (Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesOptional(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Namespace.Proposal proposal = (Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfEngineNamespacesSession(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Namespace.Session session = (Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new EngineDO.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toMapOfNamespacesVOSession(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            EngineDO.Namespace.Session session = (EngineDO.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }
}
