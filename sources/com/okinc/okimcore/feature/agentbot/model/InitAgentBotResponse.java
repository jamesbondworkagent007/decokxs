package com.okinc.okimcore.feature.agentbot.model;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InitAgentBotResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String gbscTicketId;
    private final String imChannelId;
    private final String imToken;
    private final Boolean isNew;
    private final String queryId;
    private final String sessionState;
    private final Long startOffset;
    private final Boolean userLanguageSupported;
    private final Long uuid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InitAgentBotResponse() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Long) null, (Long) null, (Boolean) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @SerialName("gbscTicketId")
    public static /* synthetic */ void getGbscTicketId$annotations() {
    }

    @SerialName("imChannelId")
    public static /* synthetic */ void getImChannelId$annotations() {
    }

    @SerialName("imToken")
    public static /* synthetic */ void getImToken$annotations() {
    }

    @SerialName("queryId")
    public static /* synthetic */ void getQueryId$annotations() {
    }

    @SerialName("sessionState")
    public static /* synthetic */ void getSessionState$annotations() {
    }

    @SerialName("startOffset")
    public static /* synthetic */ void getStartOffset$annotations() {
    }

    @SerialName("userLanguageSupported")
    public static /* synthetic */ void getUserLanguageSupported$annotations() {
    }

    @SerialName("uuid")
    public static /* synthetic */ void getUuid$annotations() {
    }

    @SerialName(OtpEventTracker.OTP_EVENT_VALUE_NEW)
    public static /* synthetic */ void isNew$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gbscTicketId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.queryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sessionState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.startOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.userLanguageSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitAgentBotResponse copy(String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2) {
        return new InitAgentBotResponse(str, str2, str3, bool, str4, str5, l, l2, bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitAgentBotResponse)) {
            return false;
        }
        InitAgentBotResponse initAgentBotResponse = (InitAgentBotResponse) obj;
        return Intrinsics.EZpvd((Object) this.gbscTicketId, (Object) initAgentBotResponse.gbscTicketId) && Intrinsics.EZpvd((Object) this.imChannelId, (Object) initAgentBotResponse.imChannelId) && Intrinsics.EZpvd((Object) this.imToken, (Object) initAgentBotResponse.imToken) && Intrinsics.EZpvd(this.isNew, initAgentBotResponse.isNew) && Intrinsics.EZpvd((Object) this.queryId, (Object) initAgentBotResponse.queryId) && Intrinsics.EZpvd((Object) this.sessionState, (Object) initAgentBotResponse.sessionState) && Intrinsics.EZpvd(this.startOffset, initAgentBotResponse.startOffset) && Intrinsics.EZpvd(this.uuid, initAgentBotResponse.uuid) && Intrinsics.EZpvd(this.userLanguageSupported, initAgentBotResponse.userLanguageSupported);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGbscTicketId() {
        return this.gbscTicketId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImChannelId() {
        return this.imChannelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImToken() {
        return this.imToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQueryId() {
        return this.queryId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionState() {
        return this.sessionState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartOffset() {
        return this.startOffset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUserLanguageSupported() {
        return this.userLanguageSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUuid() {
        return this.uuid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gbscTicketId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.imChannelId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imToken;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.isNew;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str4 = this.queryId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.sessionState;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Long l = this.startOffset;
        int iHashCode7 = l == null ? 0 : l.hashCode();
        Long l2 = this.uuid;
        int iHashCode8 = l2 == null ? 0 : l2.hashCode();
        Boolean bool2 = this.userLanguageSupported;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isNew() {
        return this.isNew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitAgentBotResponse(gbscTicketId=" + this.gbscTicketId + ", imChannelId=" + this.imChannelId + ", imToken=" + this.imToken + ", isNew=" + this.isNew + ", queryId=" + this.queryId + ", sessionState=" + this.sessionState + ", startOffset=" + this.startOffset + ", uuid=" + this.uuid + ", userLanguageSupported=" + this.userLanguageSupported + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.agentbot.model.InitAgentBotResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InitAgentBotResponse> serializer() {
            return InitAgentBotResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitAgentBotResponse(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gbscTicketId = null;
        } else {
            this.gbscTicketId = str;
        }
        if ((i & 2) == 0) {
            this.imChannelId = null;
        } else {
            this.imChannelId = str2;
        }
        if ((i & 4) == 0) {
            this.imToken = null;
        } else {
            this.imToken = str3;
        }
        if ((i & 8) == 0) {
            this.isNew = null;
        } else {
            this.isNew = bool;
        }
        if ((i & 16) == 0) {
            this.queryId = null;
        } else {
            this.queryId = str4;
        }
        if ((i & 32) == 0) {
            this.sessionState = null;
        } else {
            this.sessionState = str5;
        }
        if ((i & 64) == 0) {
            this.startOffset = null;
        } else {
            this.startOffset = l;
        }
        if ((i & 128) == 0) {
            this.uuid = null;
        } else {
            this.uuid = l2;
        }
        if ((i & 256) == 0) {
            this.userLanguageSupported = null;
        } else {
            this.userLanguageSupported = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(InitAgentBotResponse initAgentBotResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || initAgentBotResponse.gbscTicketId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, initAgentBotResponse.gbscTicketId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || initAgentBotResponse.imChannelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, initAgentBotResponse.imChannelId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || initAgentBotResponse.imToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, initAgentBotResponse.imToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || initAgentBotResponse.isNew != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, initAgentBotResponse.isNew);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || initAgentBotResponse.queryId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, initAgentBotResponse.queryId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || initAgentBotResponse.sessionState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, initAgentBotResponse.sessionState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || initAgentBotResponse.startOffset != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, initAgentBotResponse.startOffset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || initAgentBotResponse.uuid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, initAgentBotResponse.uuid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && initAgentBotResponse.userLanguageSupported == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, initAgentBotResponse.userLanguageSupported);
    }

    public InitAgentBotResponse(String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2) {
        this.gbscTicketId = str;
        this.imChannelId = str2;
        this.imToken = str3;
        this.isNew = bool;
        this.queryId = str4;
        this.sessionState = str5;
        this.startOffset = l;
        this.uuid = l2;
        this.userLanguageSupported = bool2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean):void (m)] (LINE:9) call: com.okinc.okimcore.feature.agentbot.model.InitAgentBotResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InitAgentBotResponse(String str, String str2, String str3, Boolean bool, String str4, String str5, Long l, Long l2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : l2, (i & 256) == 0 ? bool2 : null);
    }
}
