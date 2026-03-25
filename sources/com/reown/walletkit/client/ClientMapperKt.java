package com.reown.walletkit.client;

import com.reown.android.internal.common.signing.cacao.CacaoType;
import com.reown.sign.client.Sign;
import com.reown.walletkit.client.Wallet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C56423yEv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ClientMapperKt {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Sign.Model.Validation.values().length];
            try {
                iArr[Sign.Model.Validation.VALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Sign.Model.Validation.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Sign.Model.Validation.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse toSign(Wallet.Model.JsonRpcResponse jsonRpcResponse) {
        Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
        if (jsonRpcResponse instanceof Wallet.Model.JsonRpcResponse.JsonRpcResult) {
            return toSign((Wallet.Model.JsonRpcResponse.JsonRpcResult) jsonRpcResponse);
        }
        if (jsonRpcResponse instanceof Wallet.Model.JsonRpcResponse.JsonRpcError) {
            return toSign((Wallet.Model.JsonRpcResponse.JsonRpcError) jsonRpcResponse);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse.JsonRpcResult toSign(Wallet.Model.JsonRpcResponse.JsonRpcResult jsonRpcResult) {
        Intrinsics.checkNotNullParameter(jsonRpcResult, "");
        return new Sign.Model.JsonRpcResponse.JsonRpcResult(jsonRpcResult.getId(), jsonRpcResult.getResult());
    }

    public static final /* synthetic */ Sign.Model.JsonRpcResponse.JsonRpcError toSign(Wallet.Model.JsonRpcResponse.JsonRpcError jsonRpcError) {
        Intrinsics.checkNotNullParameter(jsonRpcError, "");
        return new Sign.Model.JsonRpcResponse.JsonRpcError(jsonRpcError.getId(), jsonRpcError.getCode(), jsonRpcError.getMessage());
    }

    public static final /* synthetic */ Sign.Model.Cacao.Signature toSign(Wallet.Model.Cacao.Signature signature) {
        Intrinsics.checkNotNullParameter(signature, "");
        return new Sign.Model.Cacao.Signature(signature.getT(), signature.getS(), signature.getM());
    }

    public static final /* synthetic */ Sign.Model.SessionEvent toSign(Wallet.Model.SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "");
        return new Sign.Model.SessionEvent(sessionEvent.getName(), sessionEvent.getData());
    }

    public static final /* synthetic */ Sign.Model.Event toSign(Wallet.Model.Event event) {
        Intrinsics.checkNotNullParameter(event, "");
        return new Sign.Model.Event(event.getTopic(), event.getName(), event.getData(), event.getChainId());
    }

    public static final /* synthetic */ Sign.Model.PayloadParams toSign(Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams) {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        String type = payloadAuthRequestParams.getType();
        if (type == null) {
            type = CacaoType.CAIP222.getHeader();
        }
        List<String> chains = payloadAuthRequestParams.getChains();
        String domain = payloadAuthRequestParams.getDomain();
        String aud = payloadAuthRequestParams.getAud();
        return new Sign.Model.PayloadParams(chains, domain, payloadAuthRequestParams.getNonce(), aud, type, payloadAuthRequestParams.getNbf(), payloadAuthRequestParams.getExp(), payloadAuthRequestParams.getIat(), payloadAuthRequestParams.getStatement(), payloadAuthRequestParams.getRequestId(), payloadAuthRequestParams.getResources());
    }

    public static final /* synthetic */ Wallet.Model.Session toWallet(Sign.Model.Session session) {
        Intrinsics.checkNotNullParameter(session, "");
        String pairingTopic = session.getPairingTopic();
        String topic = session.getTopic();
        long expiry = session.getExpiry();
        Map walletProposalNamespaces = toWalletProposalNamespaces(session.getRequiredNamespaces());
        Map<String, Sign.Model.Namespace.Proposal> optionalNamespaces = session.getOptionalNamespaces();
        return new Wallet.Model.Session(pairingTopic, topic, expiry, walletProposalNamespaces, optionalNamespaces != null ? toWalletProposalNamespaces(optionalNamespaces) : null, toWallet(session.getNamespaces()), session.getMetaData());
    }

    public static final /* synthetic */ Wallet.Model.SessionProposal toWallet(Sign.Model.SessionProposal sessionProposal) {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        return new Wallet.Model.SessionProposal(sessionProposal.getPairingTopic(), sessionProposal.getName(), sessionProposal.getDescription(), sessionProposal.getUrl(), sessionProposal.getIcons(), sessionProposal.getRedirect(), toWalletProposalNamespaces(sessionProposal.getRequiredNamespaces()), toWalletProposalNamespaces(sessionProposal.getOptionalNamespaces()), sessionProposal.getProperties(), sessionProposal.getProposerPublicKey(), sessionProposal.getRelayProtocol(), sessionProposal.getRelayData());
    }

    public static final /* synthetic */ Wallet.Model.SessionAuthenticate toWallet(Sign.Model.SessionAuthenticate sessionAuthenticate) {
        Intrinsics.checkNotNullParameter(sessionAuthenticate, "");
        return new Wallet.Model.SessionAuthenticate(sessionAuthenticate.getId(), sessionAuthenticate.getTopic(), toWallet(sessionAuthenticate.getParticipant()), toWallet(sessionAuthenticate.getPayloadParams()));
    }

    public static final /* synthetic */ Wallet.Model.SessionAuthenticate.Participant toWallet(Sign.Model.SessionAuthenticate.Participant participant) {
        Intrinsics.checkNotNullParameter(participant, "");
        return new Wallet.Model.SessionAuthenticate.Participant(participant.getPublicKey(), participant.getMetadata());
    }

    public static final /* synthetic */ Wallet.Model.PayloadAuthRequestParams toWallet(Sign.Model.PayloadParams payloadParams) {
        Intrinsics.checkNotNullParameter(payloadParams, "");
        List<String> chains = payloadParams.getChains();
        String type = payloadParams.getType();
        if (type == null) {
            type = CacaoType.CAIP222.getHeader();
        }
        String domain = payloadParams.getDomain();
        String aud = payloadParams.getAud();
        return new Wallet.Model.PayloadAuthRequestParams(chains, domain, payloadParams.getNonce(), aud, type, payloadParams.getIat(), payloadParams.getNbf(), payloadParams.getExp(), payloadParams.getStatement(), payloadParams.getRequestId(), payloadParams.getResources());
    }

    public static final Wallet.Model.VerifyContext toWallet(@NotNull Sign.Model.VerifyContext verifyContext) {
        Intrinsics.checkNotNullParameter(verifyContext, "");
        return new Wallet.Model.VerifyContext(verifyContext.getId(), verifyContext.getOrigin(), toWallet(verifyContext.getValidation()), verifyContext.getVerifyUrl(), verifyContext.isScam());
    }

    public static final Wallet.Model.Validation toWallet(@NotNull Sign.Model.Validation validation) {
        Intrinsics.checkNotNullParameter(validation, "");
        int i = WhenMappings.$EnumSwitchMapping$0[validation.ordinal()];
        if (i == 1) {
            return Wallet.Model.Validation.VALID;
        }
        if (i == 2) {
            return Wallet.Model.Validation.INVALID;
        }
        if (i == 3) {
            return Wallet.Model.Validation.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Wallet.Model.SessionRequest toWallet(Sign.Model.SessionRequest sessionRequest) {
        Intrinsics.checkNotNullParameter(sessionRequest, "");
        return new Wallet.Model.SessionRequest(sessionRequest.getTopic(), sessionRequest.getChainId(), sessionRequest.getPeerMetaData(), new Wallet.Model.SessionRequest.JSONRPCRequest(sessionRequest.getRequest().getId(), sessionRequest.getRequest().getMethod(), sessionRequest.getRequest().getParams()));
    }

    public static final /* synthetic */ Wallet.Model.SessionDelete toWallet(Sign.Model.DeletedSession deletedSession) {
        Intrinsics.checkNotNullParameter(deletedSession, "");
        if (deletedSession instanceof Sign.Model.DeletedSession.Success) {
            Sign.Model.DeletedSession.Success success = (Sign.Model.DeletedSession.Success) deletedSession;
            return new Wallet.Model.SessionDelete.Success(success.getTopic(), success.getReason());
        }
        if (deletedSession instanceof Sign.Model.DeletedSession.Error) {
            return new Wallet.Model.SessionDelete.Error(((Sign.Model.DeletedSession.Error) deletedSession).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Wallet.Model.SettledSessionResponse toWallet(Sign.Model.SettledSessionResponse settledSessionResponse) {
        Intrinsics.checkNotNullParameter(settledSessionResponse, "");
        if (settledSessionResponse instanceof Sign.Model.SettledSessionResponse.Result) {
            return new Wallet.Model.SettledSessionResponse.Result(toWallet(((Sign.Model.SettledSessionResponse.Result) settledSessionResponse).getSession()));
        }
        if (settledSessionResponse instanceof Sign.Model.SettledSessionResponse.Error) {
            return new Wallet.Model.SettledSessionResponse.Error(((Sign.Model.SettledSessionResponse.Error) settledSessionResponse).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Wallet.Model.SessionUpdateResponse toWallet(Sign.Model.SessionUpdateResponse sessionUpdateResponse) {
        Intrinsics.checkNotNullParameter(sessionUpdateResponse, "");
        if (sessionUpdateResponse instanceof Sign.Model.SessionUpdateResponse.Result) {
            Sign.Model.SessionUpdateResponse.Result result = (Sign.Model.SessionUpdateResponse.Result) sessionUpdateResponse;
            return new Wallet.Model.SessionUpdateResponse.Result(result.getTopic(), toWallet(result.getNamespaces()));
        }
        if (sessionUpdateResponse instanceof Sign.Model.SessionUpdateResponse.Error) {
            return new Wallet.Model.SessionUpdateResponse.Error(((Sign.Model.SessionUpdateResponse.Error) sessionUpdateResponse).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Wallet.Model.ExpiredProposal toWallet(Sign.Model.ExpiredProposal expiredProposal) {
        Intrinsics.checkNotNullParameter(expiredProposal, "");
        return new Wallet.Model.ExpiredProposal(expiredProposal.getPairingTopic(), expiredProposal.getProposerPublicKey());
    }

    public static final /* synthetic */ Wallet.Model.ExpiredRequest toWallet(Sign.Model.ExpiredRequest expiredRequest) {
        Intrinsics.checkNotNullParameter(expiredRequest, "");
        return new Wallet.Model.ExpiredRequest(expiredRequest.getTopic(), expiredRequest.getId());
    }

    public static final /* synthetic */ Sign.Model.SessionProposal toSign(Wallet.Model.SessionProposal sessionProposal) {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        return new Sign.Model.SessionProposal(sessionProposal.getPairingTopic(), sessionProposal.getName(), sessionProposal.getDescription(), sessionProposal.getUrl(), sessionProposal.getIcons(), sessionProposal.getRedirect(), toSignProposalNamespaces(sessionProposal.getRequiredNamespaces()), toSignProposalNamespaces(sessionProposal.getOptionalNamespaces()), sessionProposal.getProperties(), sessionProposal.getProposerPublicKey(), sessionProposal.getRelayProtocol(), sessionProposal.getRelayData());
    }

    public static final /* synthetic */ Wallet.Model.Message.SessionProposal toWallet(Sign.Model.Message.SessionProposal sessionProposal) {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        return new Wallet.Model.Message.SessionProposal(sessionProposal.getId(), sessionProposal.getPairingTopic(), sessionProposal.getName(), sessionProposal.getDescription(), sessionProposal.getUrl(), sessionProposal.getIcons(), sessionProposal.getRedirect(), toWalletProposalNamespaces(sessionProposal.getRequiredNamespaces()), toWalletProposalNamespaces(sessionProposal.getOptionalNamespaces()), sessionProposal.getProperties(), sessionProposal.getProposerPublicKey(), sessionProposal.getRelayProtocol(), sessionProposal.getRelayData());
    }

    public static final /* synthetic */ Wallet.Model.Message.SessionRequest toWallet(Sign.Model.Message.SessionRequest sessionRequest) {
        Intrinsics.checkNotNullParameter(sessionRequest, "");
        return new Wallet.Model.Message.SessionRequest(sessionRequest.getTopic(), sessionRequest.getChainId(), sessionRequest.getPeerMetaData(), new Wallet.Model.Message.SessionRequest.JSONRPCRequest(sessionRequest.getRequest().getId(), sessionRequest.getRequest().getMethod(), sessionRequest.getRequest().getParams()));
    }

    public static final /* synthetic */ List toSign(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Wallet.Model.Cacao cacao = (Wallet.Model.Cacao) it.next();
            arrayList.add(new Sign.Model.Cacao(new Sign.Model.Cacao.Header(cacao.getHeader().getT()), new Sign.Model.Cacao.Payload(cacao.getPayload().getIss(), cacao.getPayload().getDomain(), cacao.getPayload().getAud(), cacao.getPayload().getVersion(), cacao.getPayload().getNonce(), cacao.getPayload().getIat(), cacao.getPayload().getNbf(), cacao.getPayload().getExp(), cacao.getPayload().getStatement(), cacao.getPayload().getRequestId(), cacao.getPayload().getResources()), new Sign.Model.Cacao.Signature(cacao.getSignature().getT(), cacao.getSignature().getS(), cacao.getSignature().getM())));
        }
        return arrayList;
    }

    public static final /* synthetic */ Wallet.Model.Cacao toWallet(Sign.Model.Cacao cacao) {
        Intrinsics.checkNotNullParameter(cacao, "");
        return new Wallet.Model.Cacao(new Wallet.Model.Cacao.Header(cacao.getHeader().getT()), new Wallet.Model.Cacao.Payload(cacao.getPayload().getIss(), cacao.getPayload().getDomain(), cacao.getPayload().getAud(), cacao.getPayload().getVersion(), cacao.getPayload().getNonce(), cacao.getPayload().getIat(), cacao.getPayload().getNbf(), cacao.getPayload().getExp(), cacao.getPayload().getStatement(), cacao.getPayload().getRequestId(), cacao.getPayload().getResources()), new Wallet.Model.Cacao.Signature(cacao.getSignature().getT(), cacao.getSignature().getS(), cacao.getSignature().getM()));
    }

    public static final /* synthetic */ Wallet.Model.ConnectionState.Reason toWallet(Sign.Model.ConnectionState.Reason reason) {
        Intrinsics.checkNotNullParameter(reason, "");
        if (reason instanceof Sign.Model.ConnectionState.Reason.ConnectionClosed) {
            return new Wallet.Model.ConnectionState.Reason.ConnectionClosed(((Sign.Model.ConnectionState.Reason.ConnectionClosed) reason).getMessage());
        }
        if (reason instanceof Sign.Model.ConnectionState.Reason.ConnectionFailed) {
            return new Wallet.Model.ConnectionState.Reason.ConnectionFailed(((Sign.Model.ConnectionState.Reason.ConnectionFailed) reason).getThrowable());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Map toSign(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Wallet.Model.Namespace.Session session = (Wallet.Model.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toWallet(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Session session = (Sign.Model.Namespace.Session) entry.getValue();
            linkedHashMap.put(key, new Wallet.Model.Namespace.Session(session.getChains(), session.getAccounts(), session.getMethods(), session.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toWalletProposalNamespaces(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Sign.Model.Namespace.Proposal proposal = (Sign.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Wallet.Model.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ Map toSignProposalNamespaces(Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Wallet.Model.Namespace.Proposal proposal = (Wallet.Model.Namespace.Proposal) entry.getValue();
            linkedHashMap.put(key, new Sign.Model.Namespace.Proposal(proposal.getChains(), proposal.getMethods(), proposal.getEvents()));
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ List mapToPendingRequests(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sign.Model.PendingRequest pendingRequest = (Sign.Model.PendingRequest) it.next();
            arrayList.add(new Wallet.Model.PendingSessionRequest(pendingRequest.getRequestId(), pendingRequest.getTopic(), pendingRequest.getMethod(), pendingRequest.getChainId(), pendingRequest.getParams()));
        }
        return arrayList;
    }

    public static final /* synthetic */ List mapToPendingSessionRequests(List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sign.Model.SessionRequest sessionRequest = (Sign.Model.SessionRequest) it.next();
            arrayList.add(new Wallet.Model.SessionRequest(sessionRequest.getTopic(), sessionRequest.getChainId(), sessionRequest.getPeerMetaData(), new Wallet.Model.SessionRequest.JSONRPCRequest(sessionRequest.getRequest().getId(), sessionRequest.getRequest().getMethod(), sessionRequest.getRequest().getParams())));
        }
        return arrayList;
    }
}
