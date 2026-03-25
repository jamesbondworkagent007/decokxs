package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKCallSession implements Parcelable {
    private final Long activeTime;
    private String callId;
    private final OKCallCommon.OKVoiceCallType callType;
    private final String callerUserId;
    private String contactId;
    private OKConversationType conversationType;
    private final String inviterUserId;
    private final OKCallCommon.OKCallMediaType mediaType;
    private final String selfUserId;
    private final Long startTime;
    private String targetId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKCallSession> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, OKConversationType.Companion.serializer(), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType", OKCallCommon.OKCallMediaType.values()), null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKVoiceCallType", OKCallCommon.OKVoiceCallType.values())};

    public static final class Creator implements Parcelable.Creator<OKCallSession> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKCallSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCallSession(parcel.readString(), parcel.readInt() == 0 ? null : OKConversationType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : OKCallCommon.OKCallMediaType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? OKCallCommon.OKVoiceCallType.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKCallSession[] newArray(int i) {
            return new OKCallSession[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getActiveTime() {
        return this.activeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKVoiceCallType getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallerUserId() {
        return this.callerUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType getConversationType() {
        return this.conversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterUserId() {
        return this.inviterUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKCallMediaType getMediaType() {
        return this.mediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelfUserId() {
        return this.selfUserId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallId(String str) {
        this.callId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContactId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contactId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConversationType(OKConversationType oKConversationType) {
        this.conversationType = oKConversationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.callId);
        OKConversationType oKConversationType = this.conversationType;
        if (oKConversationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKConversationType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.targetId);
        parcel.writeString(this.contactId);
        Long l = this.startTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        OKCallCommon.OKCallMediaType oKCallMediaType = this.mediaType;
        if (oKCallMediaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKCallMediaType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.callerUserId);
        parcel.writeString(this.selfUserId);
        Long l2 = this.activeTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.inviterUserId);
        OKCallCommon.OKVoiceCallType oKVoiceCallType = this.callType;
        if (oKVoiceCallType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKVoiceCallType.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallSession.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCallSession> serializer() {
            return OKCallSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKCallSession(int i, String str, OKConversationType oKConversationType, String str2, String str3, Long l, OKCallCommon.OKCallMediaType oKCallMediaType, String str4, String str5, Long l2, String str6, OKCallCommon.OKVoiceCallType oKVoiceCallType, SerializationConstructorMarker serializationConstructorMarker) {
        if (44 != (i & 44)) {
            PluginExceptionsKt.throwMissingFieldException(i, 44, OKCallSession$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.callId = null;
        } else {
            this.callId = str;
        }
        if ((i & 2) == 0) {
            this.conversationType = null;
        } else {
            this.conversationType = oKConversationType;
        }
        this.targetId = str2;
        this.contactId = str3;
        if ((i & 16) == 0) {
            this.startTime = 0L;
        } else {
            this.startTime = l;
        }
        this.mediaType = oKCallMediaType;
        if ((i & 64) == 0) {
            this.callerUserId = null;
        } else {
            this.callerUserId = str4;
        }
        if ((i & 128) == 0) {
            this.selfUserId = null;
        } else {
            this.selfUserId = str5;
        }
        if ((i & 256) == 0) {
            this.activeTime = 0L;
        } else {
            this.activeTime = l2;
        }
        if ((i & 512) == 0) {
            this.inviterUserId = null;
        } else {
            this.inviterUserId = str6;
        }
        if ((i & 1024) == 0) {
            this.callType = null;
        } else {
            this.callType = oKVoiceCallType;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallSession oKCallSession, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oKCallSession.callId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oKCallSession.callId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKCallSession.conversationType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], oKCallSession.conversationType);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oKCallSession.targetId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, oKCallSession.contactId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (l2 = oKCallSession.startTime) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, oKCallSession.startTime);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], oKCallSession.mediaType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || oKCallSession.callerUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, oKCallSession.callerUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || oKCallSession.selfUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, oKCallSession.selfUserId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || (l = oKCallSession.activeTime) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, oKCallSession.activeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKCallSession.inviterUserId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKCallSession.inviterUserId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && oKCallSession.callType == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKCallSession.callType);
    }

    public OKCallSession(String str, OKConversationType oKConversationType, @NotNull String str2, @NotNull String str3, Long l, OKCallCommon.OKCallMediaType oKCallMediaType, String str4, String str5, Long l2, String str6, OKCallCommon.OKVoiceCallType oKVoiceCallType) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.callId = str;
        this.conversationType = oKConversationType;
        this.targetId = str2;
        this.contactId = str3;
        this.startTime = l;
        this.mediaType = oKCallMediaType;
        this.callerUserId = str4;
        this.selfUserId = str5;
        this.activeTime = l2;
        this.inviterUserId = str6;
        this.callType = oKVoiceCallType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKConversationType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKConversationType) : (r17v0 com.okinc.okimcore.model.im.OKConversationType))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 java.lang.Long))
  (r21v0 com.okinc.okimcore.model.im.OKCallCommon$OKCallMediaType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0031: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.OKCallCommon$OKVoiceCallType:?: TERNARY null = ((wrap:int:0x0045: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.OKCallCommon$OKVoiceCallType) : (r26v0 com.okinc.okimcore.model.im.OKCallCommon$OKVoiceCallType))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.OKConversationType, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.OKCallCommon$OKCallMediaType, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.okinc.okimcore.model.im.OKCallCommon$OKVoiceCallType):void (m)] (LINE:17) call: com.okinc.okimcore.model.im.OKCallSession.<init>(java.lang.String, com.okinc.okimcore.model.im.OKConversationType, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.OKCallCommon$OKCallMediaType, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.okinc.okimcore.model.im.OKCallCommon$OKVoiceCallType):void type: THIS */
    public /* synthetic */ OKCallSession(String str, OKConversationType oKConversationType, String str2, String str3, Long l, OKCallCommon.OKCallMediaType oKCallMediaType, String str4, String str5, Long l2, String str6, OKCallCommon.OKVoiceCallType oKVoiceCallType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : oKConversationType, str2, str3, (i & 16) != 0 ? 0L : l, oKCallMediaType, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? 0L : l2, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : oKVoiceCallType);
    }
}
