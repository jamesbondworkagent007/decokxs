package com.okinc.im.call.model;

import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CallSessionV2 {
    public static final int $stable = 0;
    public final String agoraAppId;
    public final String agoraGroupChannelName;
    public final String agoraToken;
    public final int agoraUid;
    public final String callId;
    public final CallType callType;
    public final String calleeUserId;
    public final String callerUserId;
    public final String conversationId;
    public final long createdAt;
    public final String groupId;
    public final boolean isGroupCallInitiator;
    public final MediaType mediaType;
    public final String meetingId;
    public final String nonLoginUUID;
    public final String nonLoginUserId;
    public final String selfUserId;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, CallType.Companion.serializer(), MediaType.Companion.serializer(), null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.conversationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.callerUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.meetingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.agoraToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallSessionV2 KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull CallType callType, @NotNull MediaType mediaType, String str8, String str9, String str10, long j, String str11, String str12, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(callType, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        return new CallSessionV2(str, str2, str3, str4, str5, str6, str7, i, callType, mediaType, str8, str9, str10, j, str11, str12, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.agoraAppId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.agoraUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallType djBIcL() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallSessionV2)) {
            return false;
        }
        CallSessionV2 callSessionV2 = (CallSessionV2) obj;
        return Intrinsics.EZpvd((Object) this.callId, (Object) callSessionV2.callId) && Intrinsics.EZpvd((Object) this.conversationId, (Object) callSessionV2.conversationId) && Intrinsics.EZpvd((Object) this.calleeUserId, (Object) callSessionV2.calleeUserId) && Intrinsics.EZpvd((Object) this.callerUserId, (Object) callSessionV2.callerUserId) && Intrinsics.EZpvd((Object) this.selfUserId, (Object) callSessionV2.selfUserId) && Intrinsics.EZpvd((Object) this.agoraToken, (Object) callSessionV2.agoraToken) && Intrinsics.EZpvd((Object) this.agoraAppId, (Object) callSessionV2.agoraAppId) && this.agoraUid == callSessionV2.agoraUid && this.callType == callSessionV2.callType && this.mediaType == callSessionV2.mediaType && Intrinsics.EZpvd((Object) this.meetingId, (Object) callSessionV2.meetingId) && Intrinsics.EZpvd((Object) this.nonLoginUserId, (Object) callSessionV2.nonLoginUserId) && Intrinsics.EZpvd((Object) this.nonLoginUUID, (Object) callSessionV2.nonLoginUUID) && this.createdAt == callSessionV2.createdAt && Intrinsics.EZpvd((Object) this.agoraGroupChannelName, (Object) callSessionV2.agoraGroupChannelName) && Intrinsics.EZpvd((Object) this.groupId, (Object) callSessionV2.groupId) && this.isGroupCallInitiator == callSessionV2.isGroupCallInitiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.nonLoginUUID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.callId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode;
        int i;
        int iHashCode2 = this.callId.hashCode();
        int iHashCode3 = this.conversationId.hashCode();
        int iHashCode4 = this.calleeUserId.hashCode();
        int iHashCode5 = this.callerUserId.hashCode();
        int iHashCode6 = this.selfUserId.hashCode();
        int iHashCode7 = this.agoraToken.hashCode();
        int iHashCode8 = this.agoraAppId.hashCode();
        int iHashCode9 = Integer.hashCode(this.agoraUid);
        int iHashCode10 = this.callType.hashCode();
        int iHashCode11 = this.mediaType.hashCode();
        String str = this.meetingId;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        String str2 = this.nonLoginUserId;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.nonLoginUUID;
        if (str3 == null) {
            i = iHashCode13;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
            i = iHashCode13;
        }
        int iHashCode14 = Long.hashCode(this.createdAt);
        String str4 = this.agoraGroupChannelName;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.groupId;
        return (((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + i) * 31) + iHashCode) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31) + Boolean.hashCode(this.isGroupCallInitiator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallSessionV2(callId=" + this.callId + ", conversationId=" + this.conversationId + ", calleeUserId=" + this.calleeUserId + ", callerUserId=" + this.callerUserId + ", selfUserId=" + this.selfUserId + ", agoraToken=" + this.agoraToken + ", agoraAppId=" + this.agoraAppId + ", agoraUid=" + this.agoraUid + ", callType=" + this.callType + ", mediaType=" + this.mediaType + ", meetingId=" + this.meetingId + ", nonLoginUserId=" + this.nonLoginUserId + ", nonLoginUUID=" + this.nonLoginUUID + ", createdAt=" + this.createdAt + ", agoraGroupChannelName=" + this.agoraGroupChannelName + ", groupId=" + this.groupId + ", isGroupCallInitiator=" + this.isGroupCallInitiator + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.selfUserId;
    }

    public /* synthetic */ CallSessionV2(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2, CallType callType, MediaType mediaType, String str8, String str9, String str10, long j, String str11, String str12, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (30 != (i & 30)) {
            PluginExceptionsKt.throwMissingFieldException(i, 30, CallSessionV2$$serializer.INSTANCE.getDescriptor());
        }
        this.callId = (i & 1) == 0 ? UUID.randomUUID().toString() : str;
        this.conversationId = str2;
        this.calleeUserId = str3;
        this.callerUserId = str4;
        this.selfUserId = str5;
        if ((i & 32) == 0) {
            this.agoraToken = "";
        } else {
            this.agoraToken = str6;
        }
        if ((i & 64) == 0) {
            this.agoraAppId = "";
        } else {
            this.agoraAppId = str7;
        }
        if ((i & 128) == 0) {
            this.agoraUid = 0;
        } else {
            this.agoraUid = i2;
        }
        this.callType = (i & 256) == 0 ? CallType.P2P : callType;
        this.mediaType = (i & 512) == 0 ? MediaType.AUDIO : mediaType;
        if ((i & 1024) == 0) {
            this.meetingId = null;
        } else {
            this.meetingId = str8;
        }
        if ((i & 2048) == 0) {
            this.nonLoginUserId = null;
        } else {
            this.nonLoginUserId = str9;
        }
        if ((i & 4096) == 0) {
            this.nonLoginUUID = null;
        } else {
            this.nonLoginUUID = str10;
        }
        this.createdAt = (i & 8192) == 0 ? System.currentTimeMillis() : j;
        if ((i & 16384) == 0) {
            this.agoraGroupChannelName = null;
        } else {
            this.agoraGroupChannelName = str11;
        }
        if ((32768 & i) == 0) {
            this.groupId = null;
        } else {
            this.groupId = str12;
        }
        if ((i & 65536) == 0) {
            this.isGroupCallInitiator = false;
        } else {
            this.isGroupCallInitiator = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [15=5] */
    public static final /* synthetic */ void KWHzl(CallSessionV2 callSessionV2, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) callSessionV2.callId, (Object) UUID.randomUUID().toString())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, callSessionV2.callId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, callSessionV2.conversationId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, callSessionV2.calleeUserId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, callSessionV2.callerUserId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, callSessionV2.selfUserId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) callSessionV2.agoraToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, callSessionV2.agoraToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) callSessionV2.agoraAppId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, callSessionV2.agoraAppId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || callSessionV2.agoraUid != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, callSessionV2.agoraUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || callSessionV2.callType != CallType.P2P) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], callSessionV2.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || callSessionV2.mediaType != MediaType.AUDIO) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], callSessionV2.mediaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || callSessionV2.meetingId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, callSessionV2.meetingId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || callSessionV2.nonLoginUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, callSessionV2.nonLoginUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || callSessionV2.nonLoginUUID != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, callSessionV2.nonLoginUUID);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || callSessionV2.createdAt != System.currentTimeMillis()) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, callSessionV2.createdAt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || callSessionV2.agoraGroupChannelName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, callSessionV2.agoraGroupChannelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || callSessionV2.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, callSessionV2.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || callSessionV2.isGroupCallInitiator) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 16, callSessionV2.isGroupCallInitiator);
        }
    }

    public CallSessionV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull CallType callType, @NotNull MediaType mediaType, String str8, String str9, String str10, long j, String str11, String str12, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(callType, "");
        Intrinsics.checkNotNullParameter(mediaType, "");
        this.callId = str;
        this.conversationId = str2;
        this.calleeUserId = str3;
        this.callerUserId = str4;
        this.selfUserId = str5;
        this.agoraToken = str6;
        this.agoraAppId = str7;
        this.agoraUid = i;
        this.callType = callType;
        this.mediaType = mediaType;
        this.meetingId = str8;
        this.nonLoginUserId = str9;
        this.nonLoginUUID = str10;
        this.createdAt = j;
        this.agoraGroupChannelName = str11;
        this.groupId = str12;
        this.isGroupCallInitiator = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: INVOKE 
  (wrap:java.util.UUID:0x0006: INVOKE  STATIC call: java.util.UUID.randomUUID():java.util.UUID A[MD:():java.util.UUID (c), WRAPPED] (LINE:21))
 VIRTUAL call: java.util.UUID.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:21)) : (r22v0 java.lang.String))
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:com.okinc.im.call.model.CallType:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] (LINE:67) com.okinc.im.call.model.CallType.P2P com.okinc.im.call.model.CallType) : (r30v0 com.okinc.im.call.model.CallType))
  (wrap:com.okinc.im.call.model.MediaType:?: TERNARY null = ((wrap:int:0x0037: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] (LINE:72) com.okinc.im.call.model.MediaType.AUDIO com.okinc.im.call.model.MediaType) : (r31v0 com.okinc.im.call.model.MediaType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0062: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:92)) : (r35v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (32768 int) & (r40v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.im.call.model.CallType, com.okinc.im.call.model.MediaType, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean):void (m)] (LINE:16) call: com.okinc.im.call.model.CallSessionV2.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.okinc.im.call.model.CallType, com.okinc.im.call.model.MediaType, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CallSessionV2(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, CallType callType, MediaType mediaType, String str8, String str9, String str10, long j, String str11, String str12, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, str3, str4, str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? CallType.P2P : callType, (i2 & 512) != 0 ? MediaType.AUDIO : mediaType, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : str10, (i2 & 8192) != 0 ? System.currentTimeMillis() : j, (i2 & 16384) != 0 ? null : str11, (32768 & i2) != 0 ? null : str12, (i2 & 65536) != 0 ? false : z);
    }

    public final String isConnected() {
        return Intrinsics.EZpvd((Object) this.selfUserId, (Object) this.callerUserId) ? this.calleeUserId : this.callerUserId;
    }

    public final boolean fJNWhG() {
        return this.callType == CallType.QUEUE;
    }

    public final boolean AuCTel() {
        return this.callType == CallType.GROUP;
    }

    public final boolean AkhnZx() {
        return (StringsKt__StringsKt.fARcdN((CharSequence) this.agoraToken) ^ true) && (StringsKt__StringsKt.fARcdN((CharSequence) this.agoraAppId) ^ true) && this.agoraUid != 0;
    }

    public final String AEQbTJ() {
        String str;
        return (!AuCTel() || (str = this.agoraGroupChannelName) == null) ? this.conversationId : str;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.call.model.CallSessionV2.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CallSessionV2> serializer() {
            return CallSessionV2$$serializer.INSTANCE;
        }

        public static /* synthetic */ CallSessionV2 forOutgoingCall$default(Companion companion, String str, String str2, String str3, CallType callType, int i, Object obj) {
            if ((i & 8) != 0) {
                callType = CallType.P2P;
            }
            return companion.KWHzl(str, str2, str3, callType);
        }

        public final CallSessionV2 KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CallType callType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(callType, "");
            return new CallSessionV2((String) null, str, str3, str2, str2, (String) null, (String) null, 0, callType, (MediaType) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, false, 130785, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CallSessionV2 forIncomingCall$default(Companion companion, String str, String str2, String str3, CallType callType, int i, Object obj) {
            if ((i & 8) != 0) {
                callType = CallType.P2P;
            }
            return companion.copydefault(str, str2, str3, callType);
        }

        public final CallSessionV2 copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull CallType callType) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(callType, "");
            return new CallSessionV2((String) null, str, str3, str2, str3, (String) null, (String) null, 0, callType, (MediaType) null, (String) null, (String) null, (String) null, 0L, (String) null, (String) null, false, 130785, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ CallSessionV2 forGroupCallInitiator$default(Companion companion, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                i = 1;
            }
            return companion.copydefault(str, str2, str3, str4, str5, i);
        }

        public final CallSessionV2 copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new CallSessionV2((String) null, str, "", str2, str2, str3, str4, i, CallType.GROUP, (MediaType) null, (String) null, (String) null, (String) null, 0L, str5, str, true, 15873, (DefaultConstructorMarker) null);
        }

        public final CallSessionV2 AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new CallSessionV2((String) null, str, str2, "", str2, str3, str4, i, CallType.GROUP, (MediaType) null, (String) null, (String) null, (String) null, 0L, str5, str, false, 15873, (DefaultConstructorMarker) null);
        }
    }
}
