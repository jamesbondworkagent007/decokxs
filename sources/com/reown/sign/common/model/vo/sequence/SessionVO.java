package com.reown.sign.common.model.vo.sequence;

import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Namespace;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.TransportType;
import com.reown.android.internal.common.model.type.Sequence;
import com.reown.android.internal.utils.Expiration;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.vo.clientsync.common.SessionParticipant;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import com.reown.sign.common.model.vo.proposal.ProposalVO;
import com.reown.sign.engine.model.mapper.EngineMapperKt;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SessionVO implements Sequence {
    public static final Companion Companion = new Companion(null);
    public final String controllerKey;
    public final Expiry expiry;
    public final boolean isAcknowledged;
    public final boolean isPeerController;
    public final boolean isSelfController;
    public final Map<String, Namespace.Proposal> optionalNamespaces;
    public final String pairingTopic;
    public final String peerAppLink;
    public final AppMetaData peerAppMetaData;
    public final Boolean peerLinkMode;
    public final String peerPublicKey;
    public final Map<String, String> properties;
    public final String relayData;
    public final String relayProtocol;
    public final Map<String, Namespace.Proposal> requiredNamespaces;
    public final AppMetaData selfAppMetaData;
    public final String selfPublicKey;
    public final Map<String, Namespace.Session> sessionNamespaces;
    public final Topic topic;
    public final TransportType transportType;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.foundation.common.model.Topic)
  (r2v0 com.reown.android.internal.common.model.Expiry)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (r7v0 com.reown.android.internal.common.model.AppMetaData)
  (r8v0 java.lang.String)
  (r9v0 com.reown.android.internal.common.model.AppMetaData)
  (r10v0 java.util.Map)
  (r11v0 java.util.Map)
  (r12v0 java.util.Map)
  (r13v0 java.util.Map)
  (r14v0 boolean)
  (r15v0 java.lang.String)
  (r16v0 com.reown.android.internal.common.model.TransportType)
 A[MD:(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.util.Map<java.lang.String, com.reown.android.internal.common.model.Namespace$Session>, java.util.Map<java.lang.String, com.reown.android.internal.common.model.Namespace$Proposal>, java.util.Map<java.lang.String, com.reown.android.internal.common.model.Namespace$Proposal>, java.util.Map<java.lang.String, java.lang.String>, boolean, java.lang.String, com.reown.android.internal.common.model.TransportType):void (m)] call: com.reown.sign.common.model.vo.sequence.SessionVO.<init>(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.util.Map, java.util.Map, java.util.Map, java.util.Map, boolean, java.lang.String, com.reown.android.internal.common.model.TransportType):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SessionVO(Topic topic, Expiry expiry, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map map, Map map2, Map map3, Map map4, boolean z, String str6, TransportType transportType, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, expiry, str, str2, str3, str4, appMetaData, str5, appMetaData2, map, map2, map3, map4, z, str6, transportType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Session> component10() {
        return this.sessionNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Proposal> component11() {
        return this.requiredNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Proposal> component12() {
        return this.optionalNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component13() {
        return this.properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.pairingTopic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType component16() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry component2() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.relayProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.relayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component5-eO6xuyU, reason: not valid java name */
    public final String m7333component5eO6xuyU() {
        return this.controllerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component6-uN_RPug, reason: not valid java name */
    public final String m7334component6uN_RPug() {
        return this.selfPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData component7() {
        return this.selfAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component8-eO6xuyU, reason: not valid java name */
    public final String m7335component8eO6xuyU() {
        return this.peerPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData component9() {
        return this.peerAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-BsNgfLQ, reason: not valid java name */
    public final SessionVO m7336copyBsNgfLQ(@NotNull Topic topic, @NotNull Expiry expiry, @NotNull String str, String str2, String str3, @NotNull String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, @NotNull Map<String, Namespace.Session> map, @NotNull Map<String, Namespace.Proposal> map2, Map<String, Namespace.Proposal> map3, Map<String, String> map4, boolean z, @NotNull String str6, TransportType transportType) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SessionVO(topic, expiry, str, str2, str3, str4, appMetaData, str5, appMetaData2, map, map2, map3, map4, z, str6, transportType, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionVO)) {
            return false;
        }
        SessionVO sessionVO = (SessionVO) obj;
        if (!Intrinsics.EZpvd(this.topic, sessionVO.topic) || !Intrinsics.EZpvd(this.expiry, sessionVO.expiry) || !Intrinsics.EZpvd((Object) this.relayProtocol, (Object) sessionVO.relayProtocol) || !Intrinsics.EZpvd((Object) this.relayData, (Object) sessionVO.relayData)) {
            return false;
        }
        String str = this.controllerKey;
        String str2 = sessionVO.controllerKey;
        if (str != null ? !(str2 != null && PublicKey.m7319equalsimpl0(str, str2)) : str2 != null) {
            return false;
        }
        if (!PublicKey.m7319equalsimpl0(this.selfPublicKey, sessionVO.selfPublicKey) || !Intrinsics.EZpvd(this.selfAppMetaData, sessionVO.selfAppMetaData)) {
            return false;
        }
        String str3 = this.peerPublicKey;
        String str4 = sessionVO.peerPublicKey;
        if (str3 != null ? str4 != null && PublicKey.m7319equalsimpl0(str3, str4) : str4 == null) {
            return Intrinsics.EZpvd(this.peerAppMetaData, sessionVO.peerAppMetaData) && Intrinsics.EZpvd(this.sessionNamespaces, sessionVO.sessionNamespaces) && Intrinsics.EZpvd(this.requiredNamespaces, sessionVO.requiredNamespaces) && Intrinsics.EZpvd(this.optionalNamespaces, sessionVO.optionalNamespaces) && Intrinsics.EZpvd(this.properties, sessionVO.properties) && this.isAcknowledged == sessionVO.isAcknowledged && Intrinsics.EZpvd((Object) this.pairingTopic, (Object) sessionVO.pairingTopic) && this.transportType == sessionVO.transportType;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getControllerKey-eO6xuyU, reason: not valid java name */
    public final String m7337getControllerKeyeO6xuyU() {
        return this.controllerKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.Sequence
    public Expiry getExpiry() {
        return this.expiry;
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
    public final String getPeerAppLink() {
        return this.peerAppLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData getPeerAppMetaData() {
        return this.peerAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPeerLinkMode() {
        return this.peerLinkMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getPeerPublicKey-eO6xuyU, reason: not valid java name */
    public final String m7338getPeerPublicKeyeO6xuyU() {
        return this.peerPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getProperties() {
        return this.properties;
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
    public final AppMetaData getSelfAppMetaData() {
        return this.selfAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getSelfPublicKey-uN_RPug, reason: not valid java name */
    public final String m7339getSelfPublicKeyuN_RPug() {
        return this.selfPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Namespace.Session> getSessionNamespaces() {
        return this.sessionNamespaces;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.Sequence
    public Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransportType getTransportType() {
        return this.transportType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topic.hashCode();
        int iHashCode2 = this.expiry.hashCode();
        int iHashCode3 = this.relayProtocol.hashCode();
        String str = this.relayData;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.controllerKey;
        int iM7321hashCodeimpl = str2 == null ? 0 : PublicKey.m7321hashCodeimpl(str2);
        int iM7321hashCodeimpl2 = PublicKey.m7321hashCodeimpl(this.selfPublicKey);
        AppMetaData appMetaData = this.selfAppMetaData;
        int iHashCode5 = appMetaData == null ? 0 : appMetaData.hashCode();
        String str3 = this.peerPublicKey;
        int iM7321hashCodeimpl3 = str3 == null ? 0 : PublicKey.m7321hashCodeimpl(str3);
        AppMetaData appMetaData2 = this.peerAppMetaData;
        int iHashCode6 = appMetaData2 == null ? 0 : appMetaData2.hashCode();
        int iHashCode7 = this.sessionNamespaces.hashCode();
        int iHashCode8 = this.requiredNamespaces.hashCode();
        Map<String, Namespace.Proposal> map = this.optionalNamespaces;
        int iHashCode9 = map == null ? 0 : map.hashCode();
        Map<String, String> map2 = this.properties;
        int iHashCode10 = map2 == null ? 0 : map2.hashCode();
        int iHashCode11 = Boolean.hashCode(this.isAcknowledged);
        int iHashCode12 = this.pairingTopic.hashCode();
        TransportType transportType = this.transportType;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iM7321hashCodeimpl) * 31) + iM7321hashCodeimpl2) * 31) + iHashCode5) * 31) + iM7321hashCodeimpl3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (transportType == null ? 0 : transportType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAcknowledged() {
        return this.isAcknowledged;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPeerController() {
        return this.isPeerController;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelfController() {
        return this.isSelfController;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        Topic topic = this.topic;
        Expiry expiry = this.expiry;
        String str = this.relayProtocol;
        String str2 = this.relayData;
        String str3 = this.controllerKey;
        String strM7322toStringimpl = AbstractJsonLexerKt.NULL;
        String strM7322toStringimpl2 = str3 == null ? AbstractJsonLexerKt.NULL : PublicKey.m7322toStringimpl(str3);
        String strM7322toStringimpl3 = PublicKey.m7322toStringimpl(this.selfPublicKey);
        AppMetaData appMetaData = this.selfAppMetaData;
        String str4 = this.peerPublicKey;
        if (str4 != null) {
            strM7322toStringimpl = PublicKey.m7322toStringimpl(str4);
        }
        return "SessionVO(topic=" + topic + ", expiry=" + expiry + ", relayProtocol=" + str + ", relayData=" + str2 + ", controllerKey=" + strM7322toStringimpl2 + ", selfPublicKey=" + strM7322toStringimpl3 + ", selfAppMetaData=" + appMetaData + ", peerPublicKey=" + strM7322toStringimpl + ", peerAppMetaData=" + this.peerAppMetaData + ", sessionNamespaces=" + this.sessionNamespaces + ", requiredNamespaces=" + this.requiredNamespaces + ", optionalNamespaces=" + this.optionalNamespaces + ", properties=" + this.properties + ", isAcknowledged=" + this.isAcknowledged + ", pairingTopic=" + this.pairingTopic + ", transportType=" + this.transportType + ")";
    }

    public SessionVO(Topic topic, Expiry expiry, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map<String, Namespace.Session> map, Map<String, Namespace.Proposal> map2, Map<String, Namespace.Proposal> map3, Map<String, String> map4, boolean z, String str6, TransportType transportType) {
        Redirect redirect;
        Redirect redirect2;
        String str7 = str3;
        String str8 = str5;
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.topic = topic;
        this.expiry = expiry;
        this.relayProtocol = str;
        this.relayData = str2;
        this.controllerKey = str7;
        this.selfPublicKey = str4;
        this.selfAppMetaData = appMetaData;
        this.peerPublicKey = str8;
        this.peerAppMetaData = appMetaData2;
        this.sessionNamespaces = map;
        this.requiredNamespaces = map2;
        this.optionalNamespaces = map3;
        this.properties = map4;
        this.isAcknowledged = z;
        this.pairingTopic = str6;
        this.transportType = transportType;
        String universal = null;
        this.isPeerController = Intrinsics.EZpvd((Object) (str8 == null ? null : str8), (Object) (str7 == null ? null : str7));
        this.isSelfController = Intrinsics.EZpvd((Object) str4, (Object) (str7 == null ? null : str7));
        this.peerLinkMode = (appMetaData2 == null || (redirect2 = appMetaData2.getRedirect()) == null) ? null : Boolean.valueOf(redirect2.getLinkMode());
        if (appMetaData2 != null && (redirect = appMetaData2.getRedirect()) != null) {
            universal = redirect.getUniversal();
        }
        this.peerAppLink = universal;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r22v0 com.reown.foundation.common.model.Topic)
  (r23v0 com.reown.android.internal.common.model.Expiry)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (r27v0 java.lang.String)
  (wrap:com.reown.android.internal.common.model.AppMetaData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.AppMetaData) : (r28v0 com.reown.android.internal.common.model.AppMetaData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:com.reown.android.internal.common.model.AppMetaData:?: TERNARY null = ((wrap:int:0x001b: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.AppMetaData) : (r30v0 com.reown.android.internal.common.model.AppMetaData))
  (r31v0 java.util.Map)
  (r32v0 java.util.Map)
  (r33v0 java.util.Map)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0023: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r34v0 java.util.Map))
  (r35v0 boolean)
  (r36v0 java.lang.String)
  (r37v0 com.reown.android.internal.common.model.TransportType)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.util.Map, java.util.Map, java.util.Map, java.util.Map, boolean, java.lang.String, com.reown.android.internal.common.model.TransportType, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:19) call: com.reown.sign.common.model.vo.sequence.SessionVO.<init>(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.lang.String, com.reown.android.internal.common.model.AppMetaData, java.util.Map, java.util.Map, java.util.Map, java.util.Map, boolean, java.lang.String, com.reown.android.internal.common.model.TransportType, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ SessionVO(Topic topic, Expiry expiry, String str, String str2, String str3, String str4, AppMetaData appMetaData, String str5, AppMetaData appMetaData2, Map map, Map map2, Map map3, Map map4, boolean z, String str6, TransportType transportType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, expiry, str, str2, (i & 16) != 0 ? null : str3, str4, (i & 64) != 0 ? null : appMetaData, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : appMetaData2, map, map2, map3, (i & 4096) != 0 ? null : map4, z, str6, transportType, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.sign.common.model.vo.sequence.SessionVO.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final /* synthetic */ SessionVO createUnacknowledgedSession$sign_release(Topic topic, ProposalVO proposalVO, SessionParticipant sessionParticipant, long j, Map map, String str) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(proposalVO, "");
            Intrinsics.checkNotNullParameter(sessionParticipant, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            Expiry expiry = new Expiry(j);
            String relayProtocol = proposalVO.getRelayProtocol();
            String relayData = proposalVO.getRelayData();
            String strM7317constructorimpl = PublicKey.m7317constructorimpl(proposalVO.getProposerPublicKey());
            AppMetaData appMetaData = proposalVO.getAppMetaData();
            return new SessionVO(topic, expiry, relayProtocol, relayData, PublicKey.m7317constructorimpl(sessionParticipant.getPublicKey()), PublicKey.m7317constructorimpl(sessionParticipant.getPublicKey()), sessionParticipant.getMetadata(), strM7317constructorimpl, appMetaData, EngineMapperKt.toMapOfNamespacesVOSession(map), proposalVO.getRequiredNamespaces(), proposalVO.getOptionalNamespaces(), proposalVO.getProperties(), false, str, TransportType.RELAY, null);
        }

        /* JADX INFO: renamed from: createAcknowledgedSession-TrzE-dc$sign_release, reason: not valid java name */
        public final /* synthetic */ SessionVO m7340createAcknowledgedSessionTrzEdc$sign_release(Topic topic, SignParams.SessionSettleParams sessionSettleParams, String str, AppMetaData appMetaData, Map map, Map map2, Map map3, String str2) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(sessionSettleParams, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new SessionVO(topic, new Expiry(sessionSettleParams.getExpiry()), sessionSettleParams.getRelay().getProtocol(), sessionSettleParams.getRelay().getData(), PublicKey.m7317constructorimpl(sessionSettleParams.getController().getPublicKey()), str, appMetaData, PublicKey.m7317constructorimpl(sessionSettleParams.getController().getPublicKey()), sessionSettleParams.getController().getMetadata(), sessionSettleParams.getNamespaces(), map, map2, map3, true, str2, TransportType.RELAY, null);
        }

        /* JADX INFO: renamed from: createAuthenticatedSession-tF0nsiE$sign_release, reason: not valid java name */
        public final /* synthetic */ SessionVO m7341createAuthenticatedSessiontF0nsiE$sign_release(Topic topic, String str, AppMetaData appMetaData, String str2, AppMetaData appMetaData2, String str3, Map map, Map map2, String str4, TransportType transportType) {
            Intrinsics.checkNotNullParameter(topic, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(appMetaData, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(appMetaData2, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new SessionVO(topic, new Expiry(Expiration.getACTIVE_SESSION()), "irn", null, str3, str2, appMetaData2, str, appMetaData, map2, map, null, null, true, str4, transportType, 4096, null);
        }
    }
}
