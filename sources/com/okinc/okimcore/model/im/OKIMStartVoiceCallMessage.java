package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKIMStartVoiceCallMessage extends OKMessageContent {
    public static final int $stable = 0;
    private final Integer callType;
    private final String callerUid;
    private final Long duration;
    private final Integer errorCode;
    private final Integer signalType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OKIMStartVoiceCallMessage> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<OKIMStartVoiceCallMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKIMStartVoiceCallMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKIMStartVoiceCallMessage(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKIMStartVoiceCallMessage[] newArray(int i) {
            return new OKIMStartVoiceCallMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKIMStartVoiceCallMessage() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKIMStartVoiceCallMessage copy$default(OKIMStartVoiceCallMessage oKIMStartVoiceCallMessage, Integer num, Integer num2, Long l, String str, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = oKIMStartVoiceCallMessage.callType;
        }
        if ((i & 2) != 0) {
            num2 = oKIMStartVoiceCallMessage.signalType;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            l = oKIMStartVoiceCallMessage.duration;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str = oKIMStartVoiceCallMessage.callerUid;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            num3 = oKIMStartVoiceCallMessage.errorCode;
        }
        return oKIMStartVoiceCallMessage.copy(num, num4, l2, str2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKIMStartVoiceCallMessage copy(Integer num, Integer num2, Long l, String str, Integer num3) {
        return new OKIMStartVoiceCallMessage(num, num2, l, str, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKIMStartVoiceCallMessage)) {
            return false;
        }
        OKIMStartVoiceCallMessage oKIMStartVoiceCallMessage = (OKIMStartVoiceCallMessage) obj;
        return Intrinsics.EZpvd(this.callType, oKIMStartVoiceCallMessage.callType) && Intrinsics.EZpvd(this.signalType, oKIMStartVoiceCallMessage.signalType) && Intrinsics.EZpvd(this.duration, oKIMStartVoiceCallMessage.duration) && Intrinsics.EZpvd((Object) this.callerUid, (Object) oKIMStartVoiceCallMessage.callerUid) && Intrinsics.EZpvd(this.errorCode, oKIMStartVoiceCallMessage.errorCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallerUid() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignalType() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.callType;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.signalType;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Long l = this.duration;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str = this.callerUid;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Integer num3 = this.errorCode;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKIMStartVoiceCallMessage(callType=" + this.callType + ", signalType=" + this.signalType + ", duration=" + this.duration + ", callerUid=" + this.callerUid + ", errorCode=" + this.errorCode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.callType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.signalType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Long l = this.duration;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.callerUid);
        Integer num3 = this.errorCode;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKIMStartVoiceCallMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKIMStartVoiceCallMessage> serializer() {
            return OKIMStartVoiceCallMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKIMStartVoiceCallMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Integer num, Integer num2, Long l, String str3, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.callType = null;
        } else {
            this.callType = num;
        }
        if ((i & 512) == 0) {
            this.signalType = null;
        } else {
            this.signalType = num2;
        }
        if ((i & 1024) == 0) {
            this.duration = null;
        } else {
            this.duration = l;
        }
        if ((i & 2048) == 0) {
            this.callerUid = null;
        } else {
            this.callerUid = str3;
        }
        if ((i & 4096) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKIMStartVoiceCallMessage oKIMStartVoiceCallMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKIMStartVoiceCallMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKIMStartVoiceCallMessage.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, oKIMStartVoiceCallMessage.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKIMStartVoiceCallMessage.signalType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, oKIMStartVoiceCallMessage.signalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKIMStartVoiceCallMessage.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, oKIMStartVoiceCallMessage.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKIMStartVoiceCallMessage.callerUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKIMStartVoiceCallMessage.callerUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && oKIMStartVoiceCallMessage.errorCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, oKIMStartVoiceCallMessage.errorCode);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.OKIMStartVoiceCallMessage.<init>(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ OKIMStartVoiceCallMessage(Integer num, Integer num2, Long l, String str, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num3);
    }

    public OKIMStartVoiceCallMessage(Integer num, Integer num2, Long l, String str, Integer num3) {
        this.callType = num;
        this.signalType = num2;
        this.duration = l;
        this.callerUid = str;
        this.errorCode = num3;
    }
}
