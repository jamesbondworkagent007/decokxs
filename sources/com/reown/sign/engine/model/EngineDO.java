package com.reown.sign.engine.model;

import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.model.type.EngineEvent;
import com.reown.android.internal.common.model.type.Sequence;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.foundation.common.model.Topic;
import com.squareup.moshi.JsonClass;
import java.net.URI;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class EngineDO {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EngineDO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EngineDO() {
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class WalletConnectUri extends EngineDO {
        public final RelayProtocolOptions relay;
        public final String symKey;
        public final Topic topic;
        public final String version;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.foundation.common.model.Topic)
  (r2v0 java.lang.String)
  (r3v0 com.reown.android.internal.common.model.RelayProtocolOptions)
  (r4v0 java.lang.String)
 A[MD:(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String):void (m)] call: com.reown.sign.engine.model.EngineDO.WalletConnectUri.<init>(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this(topic, str, relayProtocolOptions, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelayProtocolOptions getRelay() {
            return this.relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: getSymKey-C2wS6ak, reason: not valid java name */
        public final String m7343getSymKeyC2wS6ak() {
            return this.symKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 com.reown.foundation.common.model.Topic)
  (r8v0 java.lang.String)
  (r9v0 com.reown.android.internal.common.model.RelayProtocolOptions)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("2") : (r10v0 java.lang.String))
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:19) call: com.reown.sign.engine.model.EngineDO.WalletConnectUri.<init>(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
        public /* synthetic */ WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(topic, str, relayProtocolOptions, (i & 8) != 0 ? "2" : str2, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.topic = topic;
            this.symKey = str;
            this.relay = relayProtocolOptions;
            this.version = str2;
        }
    }

    public static final class SessionProposalEvent extends EngineDO implements EngineEvent {
        public final VerifyContext context;
        public final SessionProposal proposal;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionProposalEvent copy$default(SessionProposalEvent sessionProposalEvent, SessionProposal sessionProposal, VerifyContext verifyContext, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionProposal = sessionProposalEvent.proposal;
            }
            if ((i & 2) != 0) {
                verifyContext = sessionProposalEvent.context;
            }
            return sessionProposalEvent.copy(sessionProposal, verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposal component1() {
            return this.proposal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext component2() {
            return this.context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposalEvent copy(@NotNull SessionProposal sessionProposal, @NotNull VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(sessionProposal, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            return new SessionProposalEvent(sessionProposal, verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionProposalEvent)) {
                return false;
            }
            SessionProposalEvent sessionProposalEvent = (SessionProposalEvent) obj;
            return Intrinsics.EZpvd(this.proposal, sessionProposalEvent.proposal) && Intrinsics.EZpvd(this.context, sessionProposalEvent.context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext getContext() {
            return this.context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposal getProposal() {
            return this.proposal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.proposal.hashCode() * 31) + this.context.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionProposalEvent(proposal=" + this.proposal + ", context=" + this.context + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionProposalEvent(@NotNull SessionProposal sessionProposal, @NotNull VerifyContext verifyContext) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionProposal, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            this.proposal = sessionProposal;
            this.context = verifyContext;
        }
    }

    public static final class SessionRequestEvent extends EngineDO implements EngineEvent {
        public final VerifyContext context;
        public final SessionRequest request;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionRequestEvent copy$default(SessionRequestEvent sessionRequestEvent, SessionRequest sessionRequest, VerifyContext verifyContext, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRequest = sessionRequestEvent.request;
            }
            if ((i & 2) != 0) {
                verifyContext = sessionRequestEvent.context;
            }
            return sessionRequestEvent.copy(sessionRequest, verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequest component1() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext component2() {
            return this.context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequestEvent copy(@NotNull SessionRequest sessionRequest, @NotNull VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(sessionRequest, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            return new SessionRequestEvent(sessionRequest, verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequestEvent)) {
                return false;
            }
            SessionRequestEvent sessionRequestEvent = (SessionRequestEvent) obj;
            return Intrinsics.EZpvd(this.request, sessionRequestEvent.request) && Intrinsics.EZpvd(this.context, sessionRequestEvent.context);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext getContext() {
            return this.context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequest getRequest() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.request.hashCode() * 31) + this.context.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionRequestEvent(request=" + this.request + ", context=" + this.context + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionRequestEvent(@NotNull SessionRequest sessionRequest, @NotNull VerifyContext verifyContext) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionRequest, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            this.request = sessionRequest;
            this.context = verifyContext;
        }
    }

    public static final class SessionAuthenticateEvent extends EngineDO implements EngineEvent {
        public final long expiryTimestamp;
        public final long id;
        public final String pairingTopic;
        public final Participant participant;
        public final PayloadParams payloadParams;
        public final VerifyContext verifyContext;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadParams component3() {
            return this.payloadParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Participant component4() {
            return this.participant;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component5() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext component6() {
            return this.verifyContext;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionAuthenticateEvent copy(long j, @NotNull String str, @NotNull PayloadParams payloadParams, @NotNull Participant participant, long j2, @NotNull VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(payloadParams, "");
            Intrinsics.checkNotNullParameter(participant, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            return new SessionAuthenticateEvent(j, str, payloadParams, participant, j2, verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionAuthenticateEvent)) {
                return false;
            }
            SessionAuthenticateEvent sessionAuthenticateEvent = (SessionAuthenticateEvent) obj;
            return this.id == sessionAuthenticateEvent.id && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionAuthenticateEvent.pairingTopic) && Intrinsics.EZpvd(this.payloadParams, sessionAuthenticateEvent.payloadParams) && Intrinsics.EZpvd(this.participant, sessionAuthenticateEvent.participant) && this.expiryTimestamp == sessionAuthenticateEvent.expiryTimestamp && Intrinsics.EZpvd(this.verifyContext, sessionAuthenticateEvent.verifyContext);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpiryTimestamp() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Participant getParticipant() {
            return this.participant;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadParams getPayloadParams() {
            return this.payloadParams;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext getVerifyContext() {
            return this.verifyContext;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((Long.hashCode(this.id) * 31) + this.pairingTopic.hashCode()) * 31) + this.payloadParams.hashCode()) * 31) + this.participant.hashCode()) * 31) + Long.hashCode(this.expiryTimestamp)) * 31) + this.verifyContext.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionAuthenticateEvent(id=" + this.id + ", pairingTopic=" + this.pairingTopic + ", payloadParams=" + this.payloadParams + ", participant=" + this.participant + ", expiryTimestamp=" + this.expiryTimestamp + ", verifyContext=" + this.verifyContext + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionAuthenticateEvent(long j, @NotNull String str, @NotNull PayloadParams payloadParams, @NotNull Participant participant, long j2, @NotNull VerifyContext verifyContext) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(payloadParams, "");
            Intrinsics.checkNotNullParameter(participant, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            this.id = j;
            this.pairingTopic = str;
            this.payloadParams = payloadParams;
            this.participant = participant;
            this.expiryTimestamp = j2;
            this.verifyContext = verifyContext;
        }
    }

    public static final class PayloadParams extends EngineDO {
        public final String aud;
        public final List<String> chains;
        public final String domain;
        public final String exp;
        public final String iat;
        public final String nbf;
        public final String nonce;
        public final String requestId;
        public List<String> resources;
        public final String statement;
        public final String type;
        public final String version;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component1() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component11() {
            return this.resources;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.aud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.iat;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.nbf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.exp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadParams copy(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, List<String> list2, @NotNull String str10) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            return new PayloadParams(list, str, str2, str3, str4, str5, str6, str7, str8, str9, list2, str10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayloadParams)) {
                return false;
            }
            PayloadParams payloadParams = (PayloadParams) obj;
            return Intrinsics.EZpvd(this.chains, payloadParams.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) payloadParams.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) payloadParams.nonce) && Intrinsics.EZpvd((Object) this.aud, (Object) payloadParams.aud) && Intrinsics.EZpvd((Object) this.type, (Object) payloadParams.type) && Intrinsics.EZpvd((Object) this.iat, (Object) payloadParams.iat) && Intrinsics.EZpvd((Object) this.nbf, (Object) payloadParams.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) payloadParams.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) payloadParams.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) payloadParams.requestId) && Intrinsics.EZpvd(this.resources, payloadParams.resources) && Intrinsics.EZpvd((Object) this.version, (Object) payloadParams.version);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAud() {
            return this.aud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDomain() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExp() {
            return this.exp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getIat() {
            return this.iat;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNbf() {
            return this.nbf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getResources() {
            return this.resources;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatement() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVersion() {
            return this.version;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.chains.hashCode();
            int iHashCode2 = this.domain.hashCode();
            int iHashCode3 = this.nonce.hashCode();
            int iHashCode4 = this.aud.hashCode();
            String str = this.type;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            int iHashCode6 = this.iat.hashCode();
            String str2 = this.nbf;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.exp;
            int iHashCode8 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.statement;
            int iHashCode9 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.requestId;
            int iHashCode10 = str5 == null ? 0 : str5.hashCode();
            List<String> list = this.resources;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.version.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setResources(List<String> list) {
            this.resources = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PayloadParams(chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", aud=" + this.aud + ", type=" + this.type + ", iat=" + this.iat + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ", version=" + this.version + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayloadParams(@NotNull List<String> list, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, String str6, String str7, String str8, String str9, List<String> list2, @NotNull String str10) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.chains = list;
            this.domain = str;
            this.nonce = str2;
            this.aud = str3;
            this.type = str4;
            this.iat = str5;
            this.nbf = str6;
            this.exp = str7;
            this.statement = str8;
            this.requestId = str9;
            this.resources = list2;
            this.version = str10;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Authenticate extends EngineDO {
        public final String aud;
        public final List<String> chains;
        public final String domain;
        public final String exp;
        public final Long expiry;
        public final List<String> methods;
        public final String nbf;
        public final String nonce;
        public final String pairingTopic;
        public final String requestId;
        public List<String> resources;
        public final String statement;
        public final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component11() {
            return this.resources;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component12() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component13() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component2() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.aud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.nbf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.exp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Authenticate copy(String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, String str9, List<String> list2, List<String> list3, Long l) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Authenticate(str, list, str2, str3, str4, str5, str6, str7, str8, str9, list2, list3, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Authenticate)) {
                return false;
            }
            Authenticate authenticate = (Authenticate) obj;
            return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) authenticate.pairingTopic) && Intrinsics.EZpvd(this.chains, authenticate.chains) && Intrinsics.EZpvd((Object) this.domain, (Object) authenticate.domain) && Intrinsics.EZpvd((Object) this.nonce, (Object) authenticate.nonce) && Intrinsics.EZpvd((Object) this.aud, (Object) authenticate.aud) && Intrinsics.EZpvd((Object) this.type, (Object) authenticate.type) && Intrinsics.EZpvd((Object) this.nbf, (Object) authenticate.nbf) && Intrinsics.EZpvd((Object) this.exp, (Object) authenticate.exp) && Intrinsics.EZpvd((Object) this.statement, (Object) authenticate.statement) && Intrinsics.EZpvd((Object) this.requestId, (Object) authenticate.requestId) && Intrinsics.EZpvd(this.resources, authenticate.resources) && Intrinsics.EZpvd(this.methods, authenticate.methods) && Intrinsics.EZpvd(this.expiry, authenticate.expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAud() {
            return this.aud;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getChains() {
            return this.chains;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDomain() {
            return this.domain;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getExp() {
            return this.exp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getMethods() {
            return this.methods;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNbf() {
            return this.nbf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRequestId() {
            return this.requestId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getResources() {
            return this.resources;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatement() {
            return this.statement;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.pairingTopic;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = this.chains.hashCode();
            int iHashCode3 = this.domain.hashCode();
            int iHashCode4 = this.nonce.hashCode();
            int iHashCode5 = this.aud.hashCode();
            String str2 = this.type;
            int iHashCode6 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.nbf;
            int iHashCode7 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.exp;
            int iHashCode8 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.statement;
            int iHashCode9 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.requestId;
            int iHashCode10 = str6 == null ? 0 : str6.hashCode();
            List<String> list = this.resources;
            int iHashCode11 = list == null ? 0 : list.hashCode();
            List<String> list2 = this.methods;
            int iHashCode12 = list2 == null ? 0 : list2.hashCode();
            Long l = this.expiry;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setResources(List<String> list) {
            this.resources = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Authenticate(pairingTopic=" + this.pairingTopic + ", chains=" + this.chains + ", domain=" + this.domain + ", nonce=" + this.nonce + ", aud=" + this.aud + ", type=" + this.type + ", nbf=" + this.nbf + ", exp=" + this.exp + ", statement=" + this.statement + ", requestId=" + this.requestId + ", resources=" + this.resources + ", methods=" + this.methods + ", expiry=" + this.expiry + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (r17v0 java.util.List)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.util.List)
  (r27v0 java.util.List)
  (r28v0 java.lang.Long)
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.Long):void (m)] (LINE:60) call: com.reown.sign.engine.model.EngineDO.Authenticate.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Long):void type: THIS */
        public /* synthetic */ Authenticate(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list2, List list3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, list, str2, str3, str4, str5, str6, str7, str8, str9, list2, list3, l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Authenticate(String str, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, String str9, List<String> list2, List<String> list3, Long l) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.pairingTopic = str;
            this.chains = list;
            this.domain = str2;
            this.nonce = str3;
            this.aud = str4;
            this.type = str5;
            this.nbf = str6;
            this.exp = str7;
            this.statement = str8;
            this.requestId = str9;
            this.resources = list2;
            this.methods = list3;
            this.expiry = l;
        }
    }

    public static final class Participant extends EngineDO {
        public final AppMetaData metadata;
        public final String publicKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Participant copy$default(Participant participant, String str, AppMetaData appMetaData, int i, Object obj) {
            if ((i & 1) != 0) {
                str = participant.publicKey;
            }
            if ((i & 2) != 0) {
                appMetaData = participant.metadata;
            }
            return participant.copy(str, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.publicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component2() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Participant copy(@NotNull String str, @NotNull AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            return new Participant(str, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Participant)) {
                return false;
            }
            Participant participant = (Participant) obj;
            return Intrinsics.EZpvd((Object) this.publicKey, (Object) participant.publicKey) && Intrinsics.EZpvd(this.metadata, participant.metadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getMetadata() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPublicKey() {
            return this.publicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.publicKey.hashCode() * 31) + this.metadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Participant(publicKey=" + this.publicKey + ", metadata=" + this.metadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Participant(@NotNull String str, @NotNull AppMetaData appMetaData) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            this.publicKey = str;
            this.metadata = appMetaData;
        }
    }

    public static final class SessionProposal extends EngineDO implements EngineEvent {
        public final String description;
        public final List<URI> icons;
        public final String name;
        public final Map<String, Namespace.Proposal> optionalNamespaces;
        public final String pairingTopic;
        public final Map<String, String> properties;
        public final String proposerPublicKey;
        public final String redirect;
        public final String relayData;
        public final String relayProtocol;
        public final Map<String, Namespace.Proposal> requiredNamespaces;
        public final String url;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.proposerPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component11() {
            return this.relayProtocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component12() {
            return this.relayData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<URI> component5() {
            return this.icons;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.redirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component7() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component8() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component9() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposal copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<URI> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new SessionProposal(str, str2, str3, str4, list, str5, map, map2, map3, str6, str7, str8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionProposal)) {
                return false;
            }
            SessionProposal sessionProposal = (SessionProposal) obj;
            return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.name, (Object) sessionProposal.name) && Intrinsics.EZpvd((Object) this.description, (Object) sessionProposal.description) && Intrinsics.EZpvd((Object) this.url, (Object) sessionProposal.url) && Intrinsics.EZpvd(this.icons, sessionProposal.icons) && Intrinsics.EZpvd((Object) this.redirect, (Object) sessionProposal.redirect) && Intrinsics.EZpvd(this.requiredNamespaces, sessionProposal.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionProposal.optionalNamespaces) && Intrinsics.EZpvd(this.properties, sessionProposal.properties) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) sessionProposal.proposerPublicKey) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) sessionProposal.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) sessionProposal.relayData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDescription() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<URI> getIcons() {
            return this.icons;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getProperties() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProposerPublicKey() {
            return this.proposerPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRedirect() {
            return this.redirect;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRelayData() {
            return this.relayData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRelayProtocol() {
            return this.relayProtocol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUrl() {
            return this.url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.pairingTopic.hashCode();
            int iHashCode2 = this.name.hashCode();
            int iHashCode3 = this.description.hashCode();
            int iHashCode4 = this.url.hashCode();
            int iHashCode5 = this.icons.hashCode();
            int iHashCode6 = this.redirect.hashCode();
            int iHashCode7 = this.requiredNamespaces.hashCode();
            int iHashCode8 = this.optionalNamespaces.hashCode();
            Map<String, String> map = this.properties;
            int iHashCode9 = map == null ? 0 : map.hashCode();
            int iHashCode10 = this.proposerPublicKey.hashCode();
            int iHashCode11 = this.relayProtocol.hashCode();
            String str = this.relayData;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str != null ? str.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionProposal(pairingTopic=" + this.pairingTopic + ", name=" + this.name + ", description=" + this.description + ", url=" + this.url + ", icons=" + this.icons + ", redirect=" + this.redirect + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", proposerPublicKey=" + this.proposerPublicKey + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionProposal(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<URI> list, @NotNull String str5, @NotNull Map<String, Namespace.Proposal> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, String> map3, @NotNull String str6, @NotNull String str7, String str8) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.pairingTopic = str;
            this.name = str2;
            this.description = str3;
            this.url = str4;
            this.icons = list;
            this.redirect = str5;
            this.requiredNamespaces = map;
            this.optionalNamespaces = map2;
            this.properties = map3;
            this.proposerPublicKey = str6;
            this.relayProtocol = str7;
            this.relayData = str8;
        }
    }

    public static final class ExpiredProposal extends EngineDO implements EngineEvent {
        public final String pairingTopic;
        public final String proposerPublicKey;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ExpiredProposal copy$default(ExpiredProposal expiredProposal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = expiredProposal.pairingTopic;
            }
            if ((i & 2) != 0) {
                str2 = expiredProposal.proposerPublicKey;
            }
            return expiredProposal.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.proposerPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ExpiredProposal copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ExpiredProposal(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredProposal)) {
                return false;
            }
            ExpiredProposal expiredProposal = (ExpiredProposal) obj;
            return Intrinsics.EZpvd((Object) this.pairingTopic, (Object) expiredProposal.pairingTopic) && Intrinsics.EZpvd((Object) this.proposerPublicKey, (Object) expiredProposal.proposerPublicKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProposerPublicKey() {
            return this.proposerPublicKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.pairingTopic.hashCode() * 31) + this.proposerPublicKey.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExpiredProposal(pairingTopic=" + this.pairingTopic + ", proposerPublicKey=" + this.proposerPublicKey + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredProposal(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.pairingTopic = str;
            this.proposerPublicKey = str2;
        }
    }

    public static final class ExpiredRequest extends EngineDO implements EngineEvent {
        public final long id;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ExpiredRequest copy$default(ExpiredRequest expiredRequest, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = expiredRequest.topic;
            }
            if ((i & 2) != 0) {
                j = expiredRequest.id;
            }
            return expiredRequest.copy(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ExpiredRequest copy(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ExpiredRequest(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpiredRequest)) {
                return false;
            }
            ExpiredRequest expiredRequest = (ExpiredRequest) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) expiredRequest.topic) && this.id == expiredRequest.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.topic.hashCode() * 31) + Long.hashCode(this.id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExpiredRequest(topic=" + this.topic + ", id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredRequest(@NotNull String str, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.topic = str;
            this.id = j;
        }
    }

    public static final class VerifyContext extends EngineDO {
        public final long id;
        public final Boolean isScam;
        public final String origin;
        public final Validation validation;
        public final String verifyUrl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VerifyContext copy$default(VerifyContext verifyContext, long j, String str, Validation validation, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                j = verifyContext.id;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = verifyContext.origin;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                validation = verifyContext.validation;
            }
            Validation validation2 = validation;
            if ((i & 8) != 0) {
                str2 = verifyContext.verifyUrl;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                bool = verifyContext.isScam;
            }
            return verifyContext.copy(j2, str3, validation2, str4, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.origin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Validation component3() {
            return this.validation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.verifyUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component5() {
            return this.isScam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyContext copy(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(validation, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new VerifyContext(j, str, validation, str2, bool);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyContext)) {
                return false;
            }
            VerifyContext verifyContext = (VerifyContext) obj;
            return this.id == verifyContext.id && Intrinsics.EZpvd((Object) this.origin, (Object) verifyContext.origin) && this.validation == verifyContext.validation && Intrinsics.EZpvd((Object) this.verifyUrl, (Object) verifyContext.verifyUrl) && Intrinsics.EZpvd(this.isScam, verifyContext.isScam);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOrigin() {
            return this.origin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Validation getValidation() {
            return this.validation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVerifyUrl() {
            return this.verifyUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.id);
            int iHashCode2 = this.origin.hashCode();
            int iHashCode3 = this.validation.hashCode();
            int iHashCode4 = this.verifyUrl.hashCode();
            Boolean bool = this.isScam;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isScam() {
            return this.isScam;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VerifyContext(id=" + this.id + ", origin=" + this.origin + ", validation=" + this.validation + ", verifyUrl=" + this.verifyUrl + ", isScam=" + this.isScam + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerifyContext(long j, @NotNull String str, @NotNull Validation validation, @NotNull String str2, Boolean bool) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(validation, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.id = j;
            this.origin = str;
            this.validation = validation;
            this.verifyUrl = str2;
            this.isScam = bool;
        }
    }

    public static abstract class Namespace extends EngineDO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.Namespace.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Namespace(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Namespace() {
            super(null);
        }

        public static final class Proposal extends Namespace {
            public final List<String> chains;
            public final List<String> events;
            public final List<String> methods;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$Namespace$Proposal */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Proposal copy$default(Proposal proposal, List list, List list2, List list3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = proposal.chains;
                }
                if ((i & 2) != 0) {
                    list2 = proposal.methods;
                }
                if ((i & 4) != 0) {
                    list3 = proposal.events;
                }
                return proposal.copy(list, list2, list3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component1() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component2() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component3() {
                return this.events;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Proposal copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                return new Proposal(list, list2, list3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Proposal)) {
                    return false;
                }
                Proposal proposal = (Proposal) obj;
                return Intrinsics.EZpvd(this.chains, proposal.chains) && Intrinsics.EZpvd(this.methods, proposal.methods) && Intrinsics.EZpvd(this.events, proposal.events);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getChains() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getEvents() {
                return this.events;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getMethods() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                List<String> list = this.chains;
                return ((((list == null ? 0 : list.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Proposal(chains=" + this.chains + ", methods=" + this.methods + ", events=" + this.events + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:110) call: com.reown.sign.engine.model.EngineDO.Namespace.Proposal.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
            public /* synthetic */ Proposal(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, list2, list3);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Proposal(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3) {
                super(null);
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                this.chains = list;
                this.methods = list2;
                this.events = list3;
            }
        }

        public static final class Session extends Namespace {
            public final List<String> accounts;
            public final List<String> chains;
            public final List<String> events;
            public final List<String> methods;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$Namespace$Session */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Session copy$default(Session session, List list, List list2, List list3, List list4, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = session.chains;
                }
                if ((i & 2) != 0) {
                    list2 = session.accounts;
                }
                if ((i & 4) != 0) {
                    list3 = session.methods;
                }
                if ((i & 8) != 0) {
                    list4 = session.events;
                }
                return session.copy(list, list2, list3, list4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component1() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component2() {
                return this.accounts;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component3() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> component4() {
                return this.events;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session copy(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                Intrinsics.checkNotNullParameter(list4, "");
                return new Session(list, list2, list3, list4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Session)) {
                    return false;
                }
                Session session = (Session) obj;
                return Intrinsics.EZpvd(this.chains, session.chains) && Intrinsics.EZpvd(this.accounts, session.accounts) && Intrinsics.EZpvd(this.methods, session.methods) && Intrinsics.EZpvd(this.events, session.events);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getAccounts() {
                return this.accounts;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getChains() {
                return this.chains;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getEvents() {
                return this.events;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<String> getMethods() {
                return this.methods;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                List<String> list = this.chains;
                return ((((((list == null ? 0 : list.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.methods.hashCode()) * 31) + this.events.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Session(chains=" + this.chains + ", accounts=" + this.accounts + ", methods=" + this.methods + ", events=" + this.events + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (r2v0 java.util.List)
  (r3v0 java.util.List)
  (r4v0 java.util.List)
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:116) call: com.reown.sign.engine.model.EngineDO.Namespace.Session.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
            public /* synthetic */ Session(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : list, list2, list3, list4);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Session(List<String> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<String> list4) {
                super(null);
                Intrinsics.checkNotNullParameter(list2, "");
                Intrinsics.checkNotNullParameter(list3, "");
                Intrinsics.checkNotNullParameter(list4, "");
                this.chains = list;
                this.accounts = list2;
                this.methods = list3;
                this.events = list4;
            }
        }
    }

    public static final class SessionRequest extends EngineDO implements EngineEvent {
        public final String chainId;
        public final Expiry expiry;
        public final AppMetaData peerAppMetaData;
        public final JSONRPCRequest request;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionRequest copy$default(SessionRequest sessionRequest, String str, String str2, AppMetaData appMetaData, JSONRPCRequest jSONRPCRequest, Expiry expiry, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionRequest.topic;
            }
            if ((i & 2) != 0) {
                str2 = sessionRequest.chainId;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                appMetaData = sessionRequest.peerAppMetaData;
            }
            AppMetaData appMetaData2 = appMetaData;
            if ((i & 8) != 0) {
                jSONRPCRequest = sessionRequest.request;
            }
            JSONRPCRequest jSONRPCRequest2 = jSONRPCRequest;
            if ((i & 16) != 0) {
                expiry = sessionRequest.expiry;
            }
            return sessionRequest.copy(str, str3, appMetaData2, jSONRPCRequest2, expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component3() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JSONRPCRequest component4() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry component5() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequest copy(@NotNull String str, String str2, AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest, Expiry expiry) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
            return new SessionRequest(str, str2, appMetaData, jSONRPCRequest, expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequest)) {
                return false;
            }
            SessionRequest sessionRequest = (SessionRequest) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRequest.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequest.chainId) && Intrinsics.EZpvd(this.peerAppMetaData, sessionRequest.peerAppMetaData) && Intrinsics.EZpvd(this.request, sessionRequest.request) && Intrinsics.EZpvd(this.expiry, sessionRequest.expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getPeerAppMetaData() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JSONRPCRequest getRequest() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            String str = this.chainId;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            AppMetaData appMetaData = this.peerAppMetaData;
            int iHashCode3 = appMetaData == null ? 0 : appMetaData.hashCode();
            int iHashCode4 = this.request.hashCode();
            Expiry expiry = this.expiry;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (expiry != null ? expiry.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionRequest(topic=" + this.topic + ", chainId=" + this.chainId + ", peerAppMetaData=" + this.peerAppMetaData + ", request=" + this.request + ", expiry=" + this.expiry + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionRequest(@NotNull String str, String str2, AppMetaData appMetaData, @NotNull JSONRPCRequest jSONRPCRequest, Expiry expiry) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(jSONRPCRequest, "");
            this.topic = str;
            this.chainId = str2;
            this.peerAppMetaData = appMetaData;
            this.request = jSONRPCRequest;
            this.expiry = expiry;
        }

        public static final class JSONRPCRequest extends EngineDO {
            public final long id;
            public final String method;
            public final String params;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ JSONRPCRequest copy$default(JSONRPCRequest jSONRPCRequest, long j, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = jSONRPCRequest.id;
                }
                if ((i & 2) != 0) {
                    str = jSONRPCRequest.method;
                }
                if ((i & 4) != 0) {
                    str2 = jSONRPCRequest.params;
                }
                return jSONRPCRequest.copy(j, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JSONRPCRequest copy(long j, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new JSONRPCRequest(j, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JSONRPCRequest)) {
                    return false;
                }
                JSONRPCRequest jSONRPCRequest = (JSONRPCRequest) obj;
                return this.id == jSONRPCRequest.id && Intrinsics.EZpvd((Object) this.method, (Object) jSONRPCRequest.method) && Intrinsics.EZpvd((Object) this.params, (Object) jSONRPCRequest.params);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMethod() {
                return this.method;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getParams() {
                return this.params;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Long.hashCode(this.id) * 31) + this.method.hashCode()) * 31) + this.params.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "JSONRPCRequest(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JSONRPCRequest(long j, @NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.id = j;
                this.method = str;
                this.params = str2;
            }
        }
    }

    public static final class SessionPayloadResponse extends EngineDO implements EngineEvent {
        public final String chainId;
        public final String method;
        public final JsonRpcResponse result;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionPayloadResponse copy$default(SessionPayloadResponse sessionPayloadResponse, String str, String str2, String str3, JsonRpcResponse jsonRpcResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionPayloadResponse.topic;
            }
            if ((i & 2) != 0) {
                str2 = sessionPayloadResponse.chainId;
            }
            if ((i & 4) != 0) {
                str3 = sessionPayloadResponse.method;
            }
            if ((i & 8) != 0) {
                jsonRpcResponse = sessionPayloadResponse.result;
            }
            return sessionPayloadResponse.copy(str, str2, str3, jsonRpcResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonRpcResponse component4() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionPayloadResponse copy(@NotNull String str, String str2, @NotNull String str3, @NotNull JsonRpcResponse jsonRpcResponse) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
            return new SessionPayloadResponse(str, str2, str3, jsonRpcResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPayloadResponse)) {
                return false;
            }
            SessionPayloadResponse sessionPayloadResponse = (SessionPayloadResponse) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionPayloadResponse.topic) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionPayloadResponse.chainId) && Intrinsics.EZpvd((Object) this.method, (Object) sessionPayloadResponse.method) && Intrinsics.EZpvd(this.result, sessionPayloadResponse.result);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final JsonRpcResponse getResult() {
            return this.result;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            String str = this.chainId;
            return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.method.hashCode()) * 31) + this.result.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionPayloadResponse(topic=" + this.topic + ", chainId=" + this.chainId + ", method=" + this.method + ", result=" + this.result + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionPayloadResponse(@NotNull String str, String str2, @NotNull String str3, @NotNull JsonRpcResponse jsonRpcResponse) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(jsonRpcResponse, "");
            this.topic = str;
            this.chainId = str2;
            this.method = str3;
            this.result = jsonRpcResponse;
        }
    }

    public static final class SessionDelete extends EngineDO implements EngineEvent {
        public final String reason;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionDelete copy$default(SessionDelete sessionDelete, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDelete.topic;
            }
            if ((i & 2) != 0) {
                str2 = sessionDelete.reason;
            }
            return sessionDelete.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionDelete copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionDelete(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionDelete)) {
                return false;
            }
            SessionDelete sessionDelete = (SessionDelete) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionDelete.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) sessionDelete.reason);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.topic.hashCode() * 31) + this.reason.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionDelete(topic=" + this.topic + ", reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionDelete(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.topic = str;
            this.reason = str2;
        }
    }

    public static final class SessionEvent extends EngineDO implements EngineEvent {
        public final String chainId;
        public final String data;
        public final String name;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionEvent.topic;
            }
            if ((i & 2) != 0) {
                str2 = sessionEvent.name;
            }
            if ((i & 4) != 0) {
                str3 = sessionEvent.data;
            }
            if ((i & 8) != 0) {
                str4 = sessionEvent.chainId;
            }
            return sessionEvent.copy(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionEvent copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new SessionEvent(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionEvent)) {
                return false;
            }
            SessionEvent sessionEvent = (SessionEvent) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionEvent.topic) && Intrinsics.EZpvd((Object) this.name, (Object) sessionEvent.name) && Intrinsics.EZpvd((Object) this.data, (Object) sessionEvent.data) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionEvent.chainId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.topic.hashCode() * 31) + this.name.hashCode()) * 31) + this.data.hashCode()) * 31) + this.chainId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionEvent(topic=" + this.topic + ", name=" + this.name + ", data=" + this.data + ", chainId=" + this.chainId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.topic = str;
            this.name = str2;
            this.data = str3;
            this.chainId = str4;
        }
    }

    public static abstract class SessionAuthenticateResponse extends EngineDO implements EngineEvent {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.SessionAuthenticateResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SessionAuthenticateResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Result extends SessionAuthenticateResponse {
            public final List<Cacao> cacaos;
            public final long id;
            public final Session session;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$SessionAuthenticateResponse$Result */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Result copy$default(Result result, long j, List list, Session session, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = result.id;
                }
                if ((i & 2) != 0) {
                    list = result.cacaos;
                }
                if ((i & 4) != 0) {
                    session = result.session;
                }
                return result.copy(j, list, session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Cacao> component2() {
                return this.cacaos;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session component3() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Result copy(long j, @NotNull List<Cacao> list, Session session) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Result(j, list, session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return this.id == result.id && Intrinsics.EZpvd(this.cacaos, result.cacaos) && Intrinsics.EZpvd(this.session, result.session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<Cacao> getCacaos() {
                return this.cacaos;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = Long.hashCode(this.id);
                int iHashCode2 = this.cacaos.hashCode();
                Session session = this.session;
                return (((iHashCode * 31) + iHashCode2) * 31) + (session == null ? 0 : session.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Result(id=" + this.id + ", cacaos=" + this.cacaos + ", session=" + this.session + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Result(long j, @NotNull List<Cacao> list, Session session) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.id = j;
                this.cacaos = list;
                this.session = session;
            }
        }

        public SessionAuthenticateResponse() {
            super(null);
        }

        public static final class Error extends SessionAuthenticateResponse {
            public final int code;
            public final long id;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, long j, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    j = error.id;
                }
                if ((i2 & 2) != 0) {
                    i = error.code;
                }
                if ((i2 & 4) != 0) {
                    str = error.message;
                }
                return error.copy(j, i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component2() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(long j, int i, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(j, i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return this.id == error.id && this.code == error.code && Intrinsics.EZpvd((Object) this.message, (Object) error.message);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getCode() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMessage() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Long.hashCode(this.id) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(id=" + this.id + ", code=" + this.code + ", message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(long j, int i, @NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = j;
                this.code = i;
                this.message = str;
            }
        }
    }

    public static abstract class SettledSessionResponse extends EngineDO implements EngineEvent {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.SettledSessionResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SettledSessionResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Result extends SettledSessionResponse {
            public final Session settledSession;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Result copy$default(Result result, Session session, int i, Object obj) {
                if ((i & 1) != 0) {
                    session = result.settledSession;
                }
                return result.copy(session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session component1() {
                return this.settledSession;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Result copy(@NotNull Session session) {
                Intrinsics.checkNotNullParameter(session, "");
                return new Result(session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && Intrinsics.EZpvd(this.settledSession, ((Result) obj).settledSession);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Session getSettledSession() {
                return this.settledSession;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.settledSession.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Result(settledSession=" + this.settledSession + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Result(@NotNull Session session) {
                super(null);
                Intrinsics.checkNotNullParameter(session, "");
                this.settledSession = session;
            }
        }

        public SettledSessionResponse() {
            super(null);
        }

        public static final class Error extends SettledSessionResponse {
            public final String errorMessage;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                return error.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.errorMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) ((Error) obj).errorMessage);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(errorMessage=" + this.errorMessage + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }
        }
    }

    public static abstract class SessionUpdateNamespacesResponse extends EngineDO implements EngineEvent {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.SessionUpdateNamespacesResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ SessionUpdateNamespacesResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Result extends SessionUpdateNamespacesResponse {
            public final Map<String, Namespace.Session> namespaces;
            public final Topic topic;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$SessionUpdateNamespacesResponse$Result */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Result copy$default(Result result, Topic topic, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    topic = result.topic;
                }
                if ((i & 2) != 0) {
                    map = result.namespaces;
                }
                return result.copy(topic, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Topic component1() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> component2() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Result copy(@NotNull Topic topic, @NotNull Map<String, Namespace.Session> map) {
                Intrinsics.checkNotNullParameter(topic, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new Result(topic, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return Intrinsics.EZpvd(this.topic, result.topic) && Intrinsics.EZpvd(this.namespaces, result.namespaces);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, Namespace.Session> getNamespaces() {
                return this.namespaces;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Topic getTopic() {
                return this.topic;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.topic.hashCode() * 31) + this.namespaces.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Result(topic=" + this.topic + ", namespaces=" + this.namespaces + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Result(@NotNull Topic topic, @NotNull Map<String, Namespace.Session> map) {
                super(null);
                Intrinsics.checkNotNullParameter(topic, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.topic = topic;
                this.namespaces = map;
            }
        }

        public SessionUpdateNamespacesResponse() {
            super(null);
        }

        public static final class Error extends SessionUpdateNamespacesResponse {
            public final String errorMessage;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                return error.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.errorMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.EZpvd((Object) this.errorMessage, (Object) ((Error) obj).errorMessage);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getErrorMessage() {
                return this.errorMessage;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.errorMessage.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(errorMessage=" + this.errorMessage + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }
        }
    }

    public static final class SessionRejected extends EngineDO implements EngineEvent {
        public final String reason;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionRejected copy$default(SessionRejected sessionRejected, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionRejected.topic;
            }
            if ((i & 2) != 0) {
                str2 = sessionRejected.reason;
            }
            return sessionRejected.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRejected copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionRejected(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRejected)) {
                return false;
            }
            SessionRejected sessionRejected = (SessionRejected) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionRejected.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) sessionRejected.reason);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.topic.hashCode() * 31) + this.reason.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionRejected(topic=" + this.topic + ", reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionRejected(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.topic = str;
            this.reason = str2;
        }
    }

    public static final class SessionApproved extends EngineDO implements EngineEvent {
        public final List<String> accounts;
        public final Map<String, Namespace.Session> namespaces;
        public final AppMetaData peerAppMetaData;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$SessionApproved */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionApproved copy$default(SessionApproved sessionApproved, String str, AppMetaData appMetaData, List list, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionApproved.topic;
            }
            if ((i & 2) != 0) {
                appMetaData = sessionApproved.peerAppMetaData;
            }
            if ((i & 4) != 0) {
                list = sessionApproved.accounts;
            }
            if ((i & 8) != 0) {
                map = sessionApproved.namespaces;
            }
            return sessionApproved.copy(str, appMetaData, list, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component2() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> component3() {
            return this.accounts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> component4() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionApproved copy(@NotNull String str, AppMetaData appMetaData, @NotNull List<String> list, @NotNull Map<String, Namespace.Session> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new SessionApproved(str, appMetaData, list, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionApproved)) {
                return false;
            }
            SessionApproved sessionApproved = (SessionApproved) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) sessionApproved.topic) && Intrinsics.EZpvd(this.peerAppMetaData, sessionApproved.peerAppMetaData) && Intrinsics.EZpvd(this.accounts, sessionApproved.accounts) && Intrinsics.EZpvd(this.namespaces, sessionApproved.namespaces);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<String> getAccounts() {
            return this.accounts;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getPeerAppMetaData() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            AppMetaData appMetaData = this.peerAppMetaData;
            return (((((iHashCode * 31) + (appMetaData == null ? 0 : appMetaData.hashCode())) * 31) + this.accounts.hashCode()) * 31) + this.namespaces.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionApproved(topic=" + this.topic + ", peerAppMetaData=" + this.peerAppMetaData + ", accounts=" + this.accounts + ", namespaces=" + this.namespaces + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionApproved(@NotNull String str, AppMetaData appMetaData, @NotNull List<String> list, @NotNull Map<String, Namespace.Session> map) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.topic = str;
            this.peerAppMetaData = appMetaData;
            this.accounts = list;
            this.namespaces = map;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class PairingSettle extends EngineDO implements EngineEvent {
        public final AppMetaData appMetaData;
        public final Topic topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingSettle copy$default(PairingSettle pairingSettle, Topic topic, AppMetaData appMetaData, int i, Object obj) {
            if ((i & 1) != 0) {
                topic = pairingSettle.topic;
            }
            if ((i & 2) != 0) {
                appMetaData = pairingSettle.appMetaData;
            }
            return pairingSettle.copy(topic, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component2() {
            return this.appMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingSettle copy(@NotNull Topic topic, AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(topic, "");
            return new PairingSettle(topic, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingSettle)) {
                return false;
            }
            PairingSettle pairingSettle = (PairingSettle) obj;
            return Intrinsics.EZpvd(this.topic, pairingSettle.topic) && Intrinsics.EZpvd(this.appMetaData, pairingSettle.appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getAppMetaData() {
            return this.appMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            AppMetaData appMetaData = this.appMetaData;
            return (iHashCode * 31) + (appMetaData == null ? 0 : appMetaData.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingSettle(topic=" + this.topic + ", appMetaData=" + this.appMetaData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairingSettle(@NotNull Topic topic, AppMetaData appMetaData) {
            super(null);
            Intrinsics.checkNotNullParameter(topic, "");
            this.topic = topic;
            this.appMetaData = appMetaData;
        }
    }

    public static final class SessionUpdateNamespaces extends EngineDO implements EngineEvent {
        public final Map<String, Namespace.Session> namespaces;
        public final Topic topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.engine.model.EngineDO$SessionUpdateNamespaces */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionUpdateNamespaces copy$default(SessionUpdateNamespaces sessionUpdateNamespaces, Topic topic, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                topic = sessionUpdateNamespaces.topic;
            }
            if ((i & 2) != 0) {
                map = sessionUpdateNamespaces.namespaces;
            }
            return sessionUpdateNamespaces.copy(topic, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> component2() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionUpdateNamespaces copy(@NotNull Topic topic, @NotNull Map<String, Namespace.Session> map) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new SessionUpdateNamespaces(topic, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionUpdateNamespaces)) {
                return false;
            }
            SessionUpdateNamespaces sessionUpdateNamespaces = (SessionUpdateNamespaces) obj;
            return Intrinsics.EZpvd(this.topic, sessionUpdateNamespaces.topic) && Intrinsics.EZpvd(this.namespaces, sessionUpdateNamespaces.namespaces);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.topic.hashCode() * 31) + this.namespaces.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionUpdateNamespaces(topic=" + this.topic + ", namespaces=" + this.namespaces + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionUpdateNamespaces(@NotNull Topic topic, @NotNull Map<String, Namespace.Session> map) {
            super(null);
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.topic = topic;
            this.namespaces = map;
        }
    }

    public static final class SessionExtend extends EngineDO implements Sequence, EngineEvent {
        public final Expiry expiry;
        public final Map<String, Namespace.Session> namespaces;
        public final Map<String, Namespace.Proposal> optionalNamespaces;
        public final String pairingTopic;
        public final AppMetaData peerAppMetaData;
        public final Map<String, Namespace.Proposal> requiredNamespaces;
        public final Topic topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.reown.sign.engine.model.EngineDO$SessionExtend */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionExtend copy$default(SessionExtend sessionExtend, Topic topic, Expiry expiry, String str, Map map, Map map2, Map map3, AppMetaData appMetaData, int i, Object obj) {
            if ((i & 1) != 0) {
                topic = sessionExtend.topic;
            }
            if ((i & 2) != 0) {
                expiry = sessionExtend.expiry;
            }
            Expiry expiry2 = expiry;
            if ((i & 4) != 0) {
                str = sessionExtend.pairingTopic;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                map = sessionExtend.requiredNamespaces;
            }
            Map map4 = map;
            if ((i & 16) != 0) {
                map2 = sessionExtend.optionalNamespaces;
            }
            Map map5 = map2;
            if ((i & 32) != 0) {
                map3 = sessionExtend.namespaces;
            }
            Map map6 = map3;
            if ((i & 64) != 0) {
                appMetaData = sessionExtend.peerAppMetaData;
            }
            return sessionExtend.copy(topic, expiry2, str2, map4, map5, map6, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry component2() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component4() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component5() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> component6() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component7() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionExtend copy(@NotNull Topic topic, @NotNull Expiry expiry, @NotNull String str, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(expiry, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map3, "");
            return new SessionExtend(topic, expiry, str, map, map2, map3, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionExtend)) {
                return false;
            }
            SessionExtend sessionExtend = (SessionExtend) obj;
            return Intrinsics.EZpvd(this.topic, sessionExtend.topic) && Intrinsics.EZpvd(this.expiry, sessionExtend.expiry) && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionExtend.pairingTopic) && Intrinsics.EZpvd(this.requiredNamespaces, sessionExtend.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionExtend.optionalNamespaces) && Intrinsics.EZpvd(this.namespaces, sessionExtend.namespaces) && Intrinsics.EZpvd(this.peerAppMetaData, sessionExtend.peerAppMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Sequence
        public Expiry getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getPeerAppMetaData() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Sequence
        public Topic getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            int iHashCode2 = this.expiry.hashCode();
            int iHashCode3 = this.pairingTopic.hashCode();
            int iHashCode4 = this.requiredNamespaces.hashCode();
            Map<String, Namespace.Proposal> map = this.optionalNamespaces;
            int iHashCode5 = map == null ? 0 : map.hashCode();
            int iHashCode6 = this.namespaces.hashCode();
            AppMetaData appMetaData = this.peerAppMetaData;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionExtend(topic=" + this.topic + ", expiry=" + this.expiry + ", pairingTopic=" + this.pairingTopic + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", namespaces=" + this.namespaces + ", peerAppMetaData=" + this.peerAppMetaData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionExtend(@NotNull Topic topic, @NotNull Expiry expiry, @NotNull String str, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, AppMetaData appMetaData) {
            super(null);
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(expiry, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map3, "");
            this.topic = topic;
            this.expiry = expiry;
            this.pairingTopic = str;
            this.requiredNamespaces = map;
            this.optionalNamespaces = map2;
            this.namespaces = map3;
            this.peerAppMetaData = appMetaData;
        }
    }

    public static final class Session extends EngineDO implements Sequence, EngineEvent {
        public final Expiry expiry;
        public final Map<String, Namespace.Session> namespaces;
        public final Map<String, Namespace.Proposal> optionalNamespaces;
        public final String pairingTopic;
        public final AppMetaData peerAppMetaData;
        public final Map<String, Namespace.Proposal> requiredNamespaces;
        public final Topic topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.reown.sign.engine.model.EngineDO$Session */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Session copy$default(Session session, Topic topic, Expiry expiry, String str, Map map, Map map2, Map map3, AppMetaData appMetaData, int i, Object obj) {
            if ((i & 1) != 0) {
                topic = session.topic;
            }
            if ((i & 2) != 0) {
                expiry = session.expiry;
            }
            Expiry expiry2 = expiry;
            if ((i & 4) != 0) {
                str = session.pairingTopic;
            }
            String str2 = str;
            if ((i & 8) != 0) {
                map = session.requiredNamespaces;
            }
            Map map4 = map;
            if ((i & 16) != 0) {
                map2 = session.optionalNamespaces;
            }
            Map map5 = map2;
            if ((i & 32) != 0) {
                map3 = session.namespaces;
            }
            Map map6 = map3;
            if ((i & 64) != 0) {
                appMetaData = session.peerAppMetaData;
            }
            return session.copy(topic, expiry2, str2, map4, map5, map6, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Topic component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry component2() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component4() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component5() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> component6() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData component7() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Session copy(@NotNull Topic topic, @NotNull Expiry expiry, @NotNull String str, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, AppMetaData appMetaData) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(expiry, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map3, "");
            return new Session(topic, expiry, str, map, map2, map3, appMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return Intrinsics.EZpvd(this.topic, session.topic) && Intrinsics.EZpvd(this.expiry, session.expiry) && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) session.pairingTopic) && Intrinsics.EZpvd(this.requiredNamespaces, session.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, session.optionalNamespaces) && Intrinsics.EZpvd(this.namespaces, session.namespaces) && Intrinsics.EZpvd(this.peerAppMetaData, session.peerAppMetaData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Sequence
        public Expiry getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPairingTopic() {
            return this.pairingTopic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppMetaData getPeerAppMetaData() {
            return this.peerAppMetaData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.android.internal.common.model.type.Sequence
        public Topic getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            int iHashCode2 = this.expiry.hashCode();
            int iHashCode3 = this.pairingTopic.hashCode();
            int iHashCode4 = this.requiredNamespaces.hashCode();
            Map<String, Namespace.Proposal> map = this.optionalNamespaces;
            int iHashCode5 = map == null ? 0 : map.hashCode();
            int iHashCode6 = this.namespaces.hashCode();
            AppMetaData appMetaData = this.peerAppMetaData;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (appMetaData != null ? appMetaData.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Session(topic=" + this.topic + ", expiry=" + this.expiry + ", pairingTopic=" + this.pairingTopic + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", namespaces=" + this.namespaces + ", peerAppMetaData=" + this.peerAppMetaData + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Session(@NotNull Topic topic, @NotNull Expiry expiry, @NotNull String str, @NotNull Map<String, Namespace.Proposal> map, Map<String, Namespace.Proposal> map2, @NotNull Map<String, Namespace.Session> map3, AppMetaData appMetaData) {
            super(null);
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(expiry, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map3, "");
            this.topic = topic;
            this.expiry = expiry;
            this.pairingTopic = str;
            this.requiredNamespaces = map;
            this.optionalNamespaces = map2;
            this.namespaces = map3;
            this.peerAppMetaData = appMetaData;
        }
    }

    public static final class Event extends EngineDO {
        public final String chainId;
        public final String data;
        public final String name;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Event copy$default(Event event, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = event.name;
            }
            if ((i & 2) != 0) {
                str2 = event.data;
            }
            if ((i & 4) != 0) {
                str3 = event.chainId;
            }
            return event.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Event copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Event(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return Intrinsics.EZpvd((Object) this.name, (Object) event.name) && Intrinsics.EZpvd((Object) this.data, (Object) event.data) && Intrinsics.EZpvd((Object) this.chainId, (Object) event.chainId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.data.hashCode()) * 31) + this.chainId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Event(name=" + this.name + ", data=" + this.data + ", chainId=" + this.chainId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.name = str;
            this.data = str2;
            this.chainId = str3;
        }
    }

    public static abstract class JsonRpcResponse extends EngineDO {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.engine.model.EngineDO.JsonRpcResponse.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ JsonRpcResponse(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract long getId();

        private JsonRpcResponse() {
            super(null);
        }

        @JsonClass(generateAdapter = true)
        public static final class JsonRpcResult extends JsonRpcResponse {
            public final long id;
            public final String jsonrpc;
            public final String result;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ JsonRpcResult copy$default(JsonRpcResult jsonRpcResult, long j, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = jsonRpcResult.id;
                }
                if ((i & 2) != 0) {
                    str = jsonRpcResult.jsonrpc;
                }
                if ((i & 4) != 0) {
                    str2 = jsonRpcResult.result;
                }
                return jsonRpcResult.copy(j, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JsonRpcResult copy(long j, @NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new JsonRpcResult(j, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JsonRpcResult)) {
                    return false;
                }
                JsonRpcResult jsonRpcResult = (JsonRpcResult) obj;
                return this.id == jsonRpcResult.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcResult.jsonrpc) && Intrinsics.EZpvd((Object) this.result, (Object) jsonRpcResult.result);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.sign.engine.model.EngineDO.JsonRpcResponse
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getResult() {
                return this.result;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.result.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "JsonRpcResult(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", result=" + this.result + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
 A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:219) call: com.reown.sign.engine.model.EngineDO.JsonRpcResponse.JsonRpcResult.<init>(long, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ JsonRpcResult(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? "2.0" : str, str2);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JsonRpcResult(long j, @NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.id = j;
                this.jsonrpc = str;
                this.result = str2;
            }
        }

        @JsonClass(generateAdapter = true)
        public static final class JsonRpcError extends JsonRpcResponse {
            public final Error error;
            public final long id;
            public final String jsonrpc;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ JsonRpcError copy$default(JsonRpcError jsonRpcError, long j, String str, Error error, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = jsonRpcError.id;
                }
                if ((i & 2) != 0) {
                    str = jsonRpcError.jsonrpc;
                }
                if ((i & 4) != 0) {
                    error = jsonRpcError.error;
                }
                return jsonRpcError.copy(j, str, error);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final long component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error component3() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final JsonRpcError copy(long j, @NotNull String str, @NotNull Error error) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(error, "");
                return new JsonRpcError(j, str, error);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof JsonRpcError)) {
                    return false;
                }
                JsonRpcError jsonRpcError = (JsonRpcError) obj;
                return this.id == jsonRpcError.id && Intrinsics.EZpvd((Object) this.jsonrpc, (Object) jsonRpcError.jsonrpc) && Intrinsics.EZpvd(this.error, jsonRpcError.error);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error getError() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.reown.sign.engine.model.EngineDO.JsonRpcResponse
            public long getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getJsonrpc() {
                return this.jsonrpc;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((Long.hashCode(this.id) * 31) + this.jsonrpc.hashCode()) * 31) + this.error.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "JsonRpcError(id=" + this.id + ", jsonrpc=" + this.jsonrpc + ", error=" + this.error + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("2.0") : (r3v0 java.lang.String))
  (r4v0 com.reown.sign.engine.model.EngineDO$JsonRpcResponse$Error)
 A[MD:(long, java.lang.String, com.reown.sign.engine.model.EngineDO$JsonRpcResponse$Error):void (m)] (LINE:226) call: com.reown.sign.engine.model.EngineDO.JsonRpcResponse.JsonRpcError.<init>(long, java.lang.String, com.reown.sign.engine.model.EngineDO$JsonRpcResponse$Error):void type: THIS */
            public /* synthetic */ JsonRpcError(long j, String str, Error error, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(j, (i & 2) != 0 ? "2.0" : str, error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JsonRpcError(long j, @NotNull String str, @NotNull Error error) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(error, "");
                this.id = j;
                this.jsonrpc = str;
                this.error = error;
            }
        }

        public static final class Error {
            public final int code;
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Error copy$default(Error error, int i, String str, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = error.code;
                }
                if ((i2 & 2) != 0) {
                    str = error.message;
                }
                return error.copy(i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int component1() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Error copy(int i, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Error(i, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return this.code == error.code && Intrinsics.EZpvd((Object) this.message, (Object) error.message);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int getCode() {
                return this.code;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMessage() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (Integer.hashCode(this.code) * 31) + this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(code=" + this.code + ", message=" + this.message + ")";
            }

            public Error(int i, @NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.code = i;
                this.message = str;
            }
        }
    }

    public static final class Request extends EngineDO {
        public final String chainId;
        public final Expiry expiry;
        public final String method;
        public final String params;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, Expiry expiry, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.topic;
            }
            if ((i & 2) != 0) {
                str2 = request.method;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = request.params;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = request.chainId;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                expiry = request.expiry;
            }
            return request.copy(str, str5, str6, str7, expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry component5() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Request copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Expiry expiry) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Request(str, str2, str3, str4, expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) request.topic) && Intrinsics.EZpvd((Object) this.method, (Object) request.method) && Intrinsics.EZpvd((Object) this.params, (Object) request.params) && Intrinsics.EZpvd((Object) this.chainId, (Object) request.chainId) && Intrinsics.EZpvd(this.expiry, request.expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Expiry getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMethod() {
            return this.method;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getParams() {
            return this.params;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.topic.hashCode();
            int iHashCode2 = this.method.hashCode();
            int iHashCode3 = this.params.hashCode();
            int iHashCode4 = this.chainId.hashCode();
            Expiry expiry = this.expiry;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (expiry == null ? 0 : expiry.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Request(topic=" + this.topic + ", method=" + this.method + ", params=" + this.params + ", chainId=" + this.chainId + ", expiry=" + this.expiry + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:com.reown.android.internal.common.model.Expiry:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.Expiry) : (r11v0 com.reown.android.internal.common.model.Expiry))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.Expiry):void (m)] (LINE:238) call: com.reown.sign.engine.model.EngineDO.Request.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.Expiry):void type: THIS */
        public /* synthetic */ Request(String str, String str2, String str3, String str4, Expiry expiry, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? null : expiry);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Expiry expiry) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.topic = str;
            this.method = str2;
            this.params = str3;
            this.chainId = str4;
            this.expiry = expiry;
        }
    }
}
