package com.okinc.im.imui.pushnotification.model;

import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class VoiceCallNotificationData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Integer callType;
    private final String callerNickname;
    private final String channelId;
    private final String seq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VoiceCallNotificationData() {
        this((Integer) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VoiceCallNotificationData copy$default(VoiceCallNotificationData voiceCallNotificationData, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = voiceCallNotificationData.callType;
        }
        if ((i & 2) != 0) {
            str = voiceCallNotificationData.callerNickname;
        }
        if ((i & 4) != 0) {
            str2 = voiceCallNotificationData.channelId;
        }
        if ((i & 8) != 0) {
            str3 = voiceCallNotificationData.seq;
        }
        return voiceCallNotificationData.copy(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.callerNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoiceCallNotificationData copy(Integer num, String str, String str2, String str3) {
        return new VoiceCallNotificationData(num, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VoiceCallNotificationData)) {
            return false;
        }
        VoiceCallNotificationData voiceCallNotificationData = (VoiceCallNotificationData) obj;
        return Intrinsics.EZpvd(this.callType, voiceCallNotificationData.callType) && Intrinsics.EZpvd((Object) this.callerNickname, (Object) voiceCallNotificationData.callerNickname) && Intrinsics.EZpvd((Object) this.channelId, (Object) voiceCallNotificationData.channelId) && Intrinsics.EZpvd((Object) this.seq, (Object) voiceCallNotificationData.seq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallerNickname() {
        return this.callerNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.callType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.callerNickname;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.channelId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.seq;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VoiceCallNotificationData(callType=" + this.callType + ", callerNickname=" + this.callerNickname + ", channelId=" + this.channelId + ", seq=" + this.seq + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.pushnotification.model.VoiceCallNotificationData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceCallNotificationData> serializer() {
            return VoiceCallNotificationData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VoiceCallNotificationData(int i, Integer num, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.callType = null;
        } else {
            this.callType = num;
        }
        if ((i & 2) == 0) {
            this.callerNickname = null;
        } else {
            this.callerNickname = str;
        }
        if ((i & 4) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str2;
        }
        if ((i & 8) == 0) {
            this.seq = null;
        } else {
            this.seq = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_impl(VoiceCallNotificationData voiceCallNotificationData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || voiceCallNotificationData.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, voiceCallNotificationData.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || voiceCallNotificationData.callerNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, voiceCallNotificationData.callerNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || voiceCallNotificationData.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, voiceCallNotificationData.channelId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && voiceCallNotificationData.seq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, voiceCallNotificationData.seq);
    }

    public VoiceCallNotificationData(Integer num, String str, String str2, String str3) {
        this.callType = num;
        this.callerNickname = str;
        this.channelId = str2;
        this.seq = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:14) call: com.okinc.im.imui.pushnotification.model.VoiceCallNotificationData.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VoiceCallNotificationData(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final OKConversationType getConversationType() {
        Integer num = this.callType;
        if (num == null) {
            return null;
        }
        num.intValue();
        return OKConversationType.Companion.EZpvd(this.callType.intValue());
    }
}
