package com.okinc.okimcore.model.remote.groupvoicecall;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class JoinGroupVoiceCallResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long agoraUid;
    private final String appId;
    private final String channelName;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JoinGroupVoiceCallResponse() {
        this((Long) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JoinGroupVoiceCallResponse copy$default(JoinGroupVoiceCallResponse joinGroupVoiceCallResponse, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = joinGroupVoiceCallResponse.agoraUid;
        }
        if ((i & 2) != 0) {
            str = joinGroupVoiceCallResponse.token;
        }
        if ((i & 4) != 0) {
            str2 = joinGroupVoiceCallResponse.channelName;
        }
        if ((i & 8) != 0) {
            str3 = joinGroupVoiceCallResponse.appId;
        }
        return joinGroupVoiceCallResponse.copy(l, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.agoraUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JoinGroupVoiceCallResponse copy(Long l, String str, String str2, String str3) {
        return new JoinGroupVoiceCallResponse(l, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinGroupVoiceCallResponse)) {
            return false;
        }
        JoinGroupVoiceCallResponse joinGroupVoiceCallResponse = (JoinGroupVoiceCallResponse) obj;
        return Intrinsics.EZpvd(this.agoraUid, joinGroupVoiceCallResponse.agoraUid) && Intrinsics.EZpvd((Object) this.token, (Object) joinGroupVoiceCallResponse.token) && Intrinsics.EZpvd((Object) this.channelName, (Object) joinGroupVoiceCallResponse.channelName) && Intrinsics.EZpvd((Object) this.appId, (Object) joinGroupVoiceCallResponse.appId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAgoraUid() {
        return this.agoraUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.agoraUid;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.token;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.channelName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.appId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JoinGroupVoiceCallResponse(agoraUid=" + this.agoraUid + ", token=" + this.token + ", channelName=" + this.channelName + ", appId=" + this.appId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JoinGroupVoiceCallResponse> serializer() {
            return JoinGroupVoiceCallResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JoinGroupVoiceCallResponse(int i, Long l, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.agoraUid = null;
        } else {
            this.agoraUid = l;
        }
        if ((i & 2) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
        if ((i & 4) == 0) {
            this.channelName = null;
        } else {
            this.channelName = str2;
        }
        if ((i & 8) == 0) {
            this.appId = null;
        } else {
            this.appId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(JoinGroupVoiceCallResponse joinGroupVoiceCallResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || joinGroupVoiceCallResponse.agoraUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, joinGroupVoiceCallResponse.agoraUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || joinGroupVoiceCallResponse.token != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, joinGroupVoiceCallResponse.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || joinGroupVoiceCallResponse.channelName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, joinGroupVoiceCallResponse.channelName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && joinGroupVoiceCallResponse.appId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, joinGroupVoiceCallResponse.appId);
    }

    public JoinGroupVoiceCallResponse(Long l, String str, String str2, String str3) {
        this.agoraUid = l;
        this.token = str;
        this.channelName = str2;
        this.appId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.groupvoicecall.JoinGroupVoiceCallResponse.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ JoinGroupVoiceCallResponse(Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
