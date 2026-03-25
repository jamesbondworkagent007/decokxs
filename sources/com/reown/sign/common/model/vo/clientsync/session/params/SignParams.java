package com.reown.sign.common.model.vo.clientsync.session.params;

import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.RelayProtocolOptions;
import com.reown.android.internal.common.model.SessionProposer;
import com.reown.android.internal.common.model.params.CoreSignParams;
import com.reown.sign.common.model.vo.clientsync.common.PayloadParams;
import com.reown.sign.common.model.vo.clientsync.common.Requester;
import com.reown.sign.common.model.vo.clientsync.common.SessionParticipant;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionEventVO;
import com.reown.sign.common.model.vo.clientsync.session.payload.SessionRequestVO;
import com.reown.utils.UtilFunctionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56523yIn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class SignParams extends CoreSignParams {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.model.vo.clientsync.session.params.SignParams.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SignParams() {
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionProposeParams extends SignParams {
        public final Long expiryTimestamp;
        public final Map<String, Namespace.Proposal> optionalNamespaces;
        public final Map<String, String> properties;
        public final SessionProposer proposer;
        public final List<RelayProtocolOptions> relays;
        public final Map<String, Namespace.Proposal> requiredNamespaces;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionProposeParams copy$default(SessionProposeParams sessionProposeParams, Map map, Map map2, List list, SessionProposer sessionProposer, Map map3, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                map = sessionProposeParams.requiredNamespaces;
            }
            if ((i & 2) != 0) {
                map2 = sessionProposeParams.optionalNamespaces;
            }
            Map map4 = map2;
            if ((i & 4) != 0) {
                list = sessionProposeParams.relays;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                sessionProposer = sessionProposeParams.proposer;
            }
            SessionProposer sessionProposer2 = sessionProposer;
            if ((i & 16) != 0) {
                map3 = sessionProposeParams.properties;
            }
            Map map5 = map3;
            if ((i & 32) != 0) {
                l = sessionProposeParams.expiryTimestamp;
            }
            return sessionProposeParams.copy(map, map4, list2, sessionProposer2, map5, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component1() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> component2() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<RelayProtocolOptions> component3() {
            return this.relays;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposer component4() {
            return this.proposer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component5() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component6() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposeParams copy(@Json(name = "requiredNamespaces") @NotNull Map<String, Namespace.Proposal> map, @Json(name = "optionalNamespaces") Map<String, Namespace.Proposal> map2, @Json(name = "relays") @NotNull List<RelayProtocolOptions> list, @Json(name = "proposer") @NotNull SessionProposer sessionProposer, @Json(name = "sessionProperties") Map<String, String> map3, @Json(name = "expiryTimestamp") Long l) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(sessionProposer, "");
            return new SessionProposeParams(map, map2, list, sessionProposer, map3, l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionProposeParams)) {
                return false;
            }
            SessionProposeParams sessionProposeParams = (SessionProposeParams) obj;
            return Intrinsics.EZpvd(this.requiredNamespaces, sessionProposeParams.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionProposeParams.optionalNamespaces) && Intrinsics.EZpvd(this.relays, sessionProposeParams.relays) && Intrinsics.EZpvd(this.proposer, sessionProposeParams.proposer) && Intrinsics.EZpvd(this.properties, sessionProposeParams.properties) && Intrinsics.EZpvd(this.expiryTimestamp, sessionProposeParams.expiryTimestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getExpiryTimestamp() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getOptionalNamespaces() {
            return this.optionalNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getProperties() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionProposer getProposer() {
            return this.proposer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<RelayProtocolOptions> getRelays() {
            return this.relays;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Proposal> getRequiredNamespaces() {
            return this.requiredNamespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.requiredNamespaces.hashCode();
            Map<String, Namespace.Proposal> map = this.optionalNamespaces;
            int iHashCode2 = map == null ? 0 : map.hashCode();
            int iHashCode3 = this.relays.hashCode();
            int iHashCode4 = this.proposer.hashCode();
            Map<String, String> map2 = this.properties;
            int iHashCode5 = map2 == null ? 0 : map2.hashCode();
            Long l = this.expiryTimestamp;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l != null ? l.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionProposeParams(requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", relays=" + this.relays + ", proposer=" + this.proposer + ", properties=" + this.properties + ", expiryTimestamp=" + this.expiryTimestamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionProposeParams(@Json(name = "requiredNamespaces") @NotNull Map<String, Namespace.Proposal> map, @Json(name = "optionalNamespaces") Map<String, Namespace.Proposal> map2, @Json(name = "relays") @NotNull List<RelayProtocolOptions> list, @Json(name = "proposer") @NotNull SessionProposer sessionProposer, @Json(name = "sessionProperties") Map<String, String> map3, @Json(name = "expiryTimestamp") Long l) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(sessionProposer, "");
            this.requiredNamespaces = map;
            this.optionalNamespaces = map2;
            this.relays = list;
            this.proposer = sessionProposer;
            this.properties = map3;
            this.expiryTimestamp = l;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionAuthenticateParams extends SignParams {
        public final String appLink;
        public final PayloadParams authPayload;
        public final long expiryTimestamp;
        public final Boolean linkMode;
        public final String metadataUrl;
        public final Requester requester;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionAuthenticateParams copy$default(SessionAuthenticateParams sessionAuthenticateParams, Requester requester, PayloadParams payloadParams, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                requester = sessionAuthenticateParams.requester;
            }
            if ((i & 2) != 0) {
                payloadParams = sessionAuthenticateParams.authPayload;
            }
            if ((i & 4) != 0) {
                j = sessionAuthenticateParams.expiryTimestamp;
            }
            return sessionAuthenticateParams.copy(requester, payloadParams, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Requester component1() {
            return this.requester;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadParams component2() {
            return this.authPayload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionAuthenticateParams copy(@Json(name = "requester") @NotNull Requester requester, @Json(name = "authPayload") @NotNull PayloadParams payloadParams, @Json(name = "expiryTimestamp") long j) {
            Intrinsics.checkNotNullParameter(requester, "");
            Intrinsics.checkNotNullParameter(payloadParams, "");
            return new SessionAuthenticateParams(requester, payloadParams, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionAuthenticateParams)) {
                return false;
            }
            SessionAuthenticateParams sessionAuthenticateParams = (SessionAuthenticateParams) obj;
            return Intrinsics.EZpvd(this.requester, sessionAuthenticateParams.requester) && Intrinsics.EZpvd(this.authPayload, sessionAuthenticateParams.authPayload) && this.expiryTimestamp == sessionAuthenticateParams.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAppLink() {
            return this.appLink;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PayloadParams getAuthPayload() {
            return this.authPayload;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpiryTimestamp() {
            return this.expiryTimestamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getLinkMode() {
            return this.linkMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMetadataUrl() {
            return this.metadataUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Requester getRequester() {
            return this.requester;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.requester.hashCode() * 31) + this.authPayload.hashCode()) * 31) + Long.hashCode(this.expiryTimestamp);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionAuthenticateParams(requester=" + this.requester + ", authPayload=" + this.authPayload + ", expiryTimestamp=" + this.expiryTimestamp + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionAuthenticateParams(@Json(name = "requester") @NotNull Requester requester, @Json(name = "authPayload") @NotNull PayloadParams payloadParams, @Json(name = "expiryTimestamp") long j) {
            super(0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(requester, "");
            Intrinsics.checkNotNullParameter(payloadParams, "");
            this.requester = requester;
            this.authPayload = payloadParams;
            this.expiryTimestamp = j;
            this.metadataUrl = requester.getMetadata().getUrl();
            Redirect redirect = requester.getMetadata().getRedirect();
            this.appLink = redirect != null ? redirect.getUniversal() : null;
            Redirect redirect2 = requester.getMetadata().getRedirect();
            this.linkMode = redirect2 != null ? Boolean.valueOf(redirect2.getLinkMode()) : null;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionSettleParams extends SignParams {
        public final SessionParticipant controller;
        public final long expiry;
        public final Map<String, Namespace.Session> namespaces;
        public final Map<String, String> properties;
        public final RelayProtocolOptions relay;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.reown.sign.common.model.vo.clientsync.session.params.SignParams$SessionSettleParams */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SessionSettleParams copy$default(SessionSettleParams sessionSettleParams, RelayProtocolOptions relayProtocolOptions, SessionParticipant sessionParticipant, Map map, long j, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                relayProtocolOptions = sessionSettleParams.relay;
            }
            if ((i & 2) != 0) {
                sessionParticipant = sessionSettleParams.controller;
            }
            SessionParticipant sessionParticipant2 = sessionParticipant;
            if ((i & 4) != 0) {
                map = sessionSettleParams.namespaces;
            }
            Map map3 = map;
            if ((i & 8) != 0) {
                j = sessionSettleParams.expiry;
            }
            long j2 = j;
            if ((i & 16) != 0) {
                map2 = sessionSettleParams.properties;
            }
            return sessionSettleParams.copy(relayProtocolOptions, sessionParticipant2, map3, j2, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelayProtocolOptions component1() {
            return this.relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionParticipant component2() {
            return this.controller;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> component3() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component4() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component5() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionSettleParams copy(@Json(name = "relay") @NotNull RelayProtocolOptions relayProtocolOptions, @Json(name = "controller") @NotNull SessionParticipant sessionParticipant, @Json(name = "namespaces") @NotNull Map<String, Namespace.Session> map, @Json(name = "expiry") long j, @Json(name = "sessionProperties") Map<String, String> map2) {
            Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
            Intrinsics.checkNotNullParameter(sessionParticipant, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new SessionSettleParams(relayProtocolOptions, sessionParticipant, map, j, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionSettleParams)) {
                return false;
            }
            SessionSettleParams sessionSettleParams = (SessionSettleParams) obj;
            return Intrinsics.EZpvd(this.relay, sessionSettleParams.relay) && Intrinsics.EZpvd(this.controller, sessionSettleParams.controller) && Intrinsics.EZpvd(this.namespaces, sessionSettleParams.namespaces) && this.expiry == sessionSettleParams.expiry && Intrinsics.EZpvd(this.properties, sessionSettleParams.properties);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionParticipant getController() {
            return this.controller;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getProperties() {
            return this.properties;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelayProtocolOptions getRelay() {
            return this.relay;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.relay.hashCode();
            int iHashCode2 = this.controller.hashCode();
            int iHashCode3 = this.namespaces.hashCode();
            int iHashCode4 = Long.hashCode(this.expiry);
            Map<String, String> map = this.properties;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionSettleParams(relay=" + this.relay + ", controller=" + this.controller + ", namespaces=" + this.namespaces + ", expiry=" + this.expiry + ", properties=" + this.properties + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionSettleParams(@Json(name = "relay") @NotNull RelayProtocolOptions relayProtocolOptions, @Json(name = "controller") @NotNull SessionParticipant sessionParticipant, @Json(name = "namespaces") @NotNull Map<String, Namespace.Session> map, @Json(name = "expiry") long j, @Json(name = "sessionProperties") Map<String, String> map2) {
            super(null);
            Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
            Intrinsics.checkNotNullParameter(sessionParticipant, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.relay = relayProtocolOptions;
            this.controller = sessionParticipant;
            this.namespaces = map;
            this.expiry = j;
            this.properties = map2;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class SessionRequestParams extends SignParams {
        public final String chainId;
        public final SessionRequestVO request;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SessionRequestParams copy$default(SessionRequestParams sessionRequestParams, SessionRequestVO sessionRequestVO, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionRequestVO = sessionRequestParams.request;
            }
            if ((i & 2) != 0) {
                str = sessionRequestParams.chainId;
            }
            return sessionRequestParams.copy(sessionRequestVO, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequestVO component1() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequestParams copy(@Json(name = "request") @NotNull SessionRequestVO sessionRequestVO, @Json(name = "chainId") @NotNull String str) {
            Intrinsics.checkNotNullParameter(sessionRequestVO, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new SessionRequestParams(sessionRequestVO, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequestParams)) {
                return false;
            }
            SessionRequestParams sessionRequestParams = (SessionRequestParams) obj;
            return Intrinsics.EZpvd(this.request, sessionRequestParams.request) && Intrinsics.EZpvd((Object) this.chainId, (Object) sessionRequestParams.chainId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionRequestVO getRequest() {
            return this.request;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.request.hashCode() * 31) + this.chainId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SessionRequestParams(request=" + this.request + ", chainId=" + this.chainId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionRequestParams(@Json(name = "request") @NotNull SessionRequestVO sessionRequestVO, @Json(name = "chainId") @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionRequestVO, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.request = sessionRequestVO;
            this.chainId = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class EventParams extends SignParams {
        public final String chainId;
        public final SessionEventVO event;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EventParams copy$default(EventParams eventParams, SessionEventVO sessionEventVO, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionEventVO = eventParams.event;
            }
            if ((i & 2) != 0) {
                str = eventParams.chainId;
            }
            return eventParams.copy(sessionEventVO, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionEventVO component1() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EventParams copy(@Json(name = "event") @NotNull SessionEventVO sessionEventVO, @Json(name = "chainId") @NotNull String str) {
            Intrinsics.checkNotNullParameter(sessionEventVO, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new EventParams(sessionEventVO, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventParams)) {
                return false;
            }
            EventParams eventParams = (EventParams) obj;
            return Intrinsics.EZpvd(this.event, eventParams.event) && Intrinsics.EZpvd((Object) this.chainId, (Object) eventParams.chainId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SessionEventVO getEvent() {
            return this.event;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.event.hashCode() * 31) + this.chainId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EventParams(event=" + this.event + ", chainId=" + this.chainId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventParams(@Json(name = "event") @NotNull SessionEventVO sessionEventVO, @Json(name = "chainId") @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(sessionEventVO, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.event = sessionEventVO;
            this.chainId = str;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class UpdateNamespacesParams extends SignParams {
        public final Map<String, Namespace.Session> namespaces;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, Namespace.Session> getNamespaces() {
            return this.namespaces;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateNamespacesParams(@Json(name = "namespaces") @NotNull Map<String, Namespace.Session> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.namespaces = map;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class ExtendParams extends SignParams {
        public final long expiry;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ExtendParams copy$default(ExtendParams extendParams, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = extendParams.expiry;
            }
            return extendParams.copy(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ExtendParams copy(@Json(name = "expiry") long j) {
            return new ExtendParams(j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExtendParams) && this.expiry == ((ExtendParams) obj).expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getExpiry() {
            return this.expiry;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Long.hashCode(this.expiry);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ExtendParams(expiry=" + this.expiry + ")";
        }

        public ExtendParams(@Json(name = "expiry") long j) {
            super(null);
            this.expiry = j;
        }
    }

    @JsonClass(generateAdapter = true)
    public static final class DeleteParams extends SignParams {
        public final int code;
        public final String message;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0006: INVOKE (wrap:o.yIn:0x0004: SGET  A[WRAPPED] (LINE:95) o.yIn.AEQbTJ o.yIn) STATIC call: com.reown.utils.UtilFunctionsKt.getDefaultId(o.yIn):int A[MD:(o.yIn):int (m), WRAPPED] (LINE:95)) : (r1v0 int))
  (r2v0 java.lang.String)
 A[MD:(int, java.lang.String):void (m)] (LINE:93) call: com.reown.sign.common.model.vo.clientsync.session.params.SignParams.DeleteParams.<init>(int, java.lang.String):void type: THIS */
        public /* synthetic */ DeleteParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? UtilFunctionsKt.getDefaultId(C56523yIn.AEQbTJ) : i, str);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteParams(@Json(name = "code") int i, @Json(name = "message") @NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.code = i;
            this.message = str;
        }
    }

    public static final class PingParams extends SignParams {
        public PingParams() {
            super(null);
        }
    }
}
