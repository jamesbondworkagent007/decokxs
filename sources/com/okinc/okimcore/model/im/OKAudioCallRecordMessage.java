package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKAudioCallRecordMessage extends OKMessageContent {
    private long activeTime;
    private String caller;
    private long duration;
    private String inviter;
    private OKCallCommon.OKCallMediaType mediaType;
    private OKCallCommon.OKCallDisconnectedReason reason;
    private long startTime;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType", OKCallCommon.OKCallMediaType.values()), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallDisconnectedReason", OKCallCommon.OKCallDisconnectedReason.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getActiveTime() {
        return this.activeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCaller() {
        return this.caller;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviter() {
        return this.inviter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKCallMediaType getMediaType() {
        return this.mediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKCallDisconnectedReason getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActiveTime(long j) {
        this.activeTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCaller(String str) {
        this.caller = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(long j) {
        this.duration = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviter(String str) {
        this.inviter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaType(OKCallCommon.OKCallMediaType oKCallMediaType) {
        this.mediaType = oKCallMediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReason(OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        this.reason = oKCallDisconnectedReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public /* synthetic */ OKAudioCallRecordMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, OKCallCommon.OKCallMediaType oKCallMediaType, long j2, long j3, long j4, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.caller = null;
        } else {
            this.caller = str3;
        }
        if ((i & 512) == 0) {
            this.inviter = null;
        } else {
            this.inviter = str4;
        }
        if ((i & 1024) == 0) {
            this.mediaType = null;
        } else {
            this.mediaType = oKCallMediaType;
        }
        if ((i & 2048) == 0) {
            this.startTime = 0L;
        } else {
            this.startTime = j2;
        }
        if ((i & 4096) == 0) {
            this.activeTime = 0L;
        } else {
            this.activeTime = j3;
        }
        this.duration = (i & 8192) != 0 ? j4 : 0L;
        if ((i & 16384) == 0) {
            this.reason = null;
        } else {
            this.reason = oKCallDisconnectedReason;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKAudioCallRecordMessage oKAudioCallRecordMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKAudioCallRecordMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKAudioCallRecordMessage.caller != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKAudioCallRecordMessage.caller);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKAudioCallRecordMessage.inviter != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKAudioCallRecordMessage.inviter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKAudioCallRecordMessage.mediaType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKAudioCallRecordMessage.mediaType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKAudioCallRecordMessage.startTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 11, oKAudioCallRecordMessage.startTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKAudioCallRecordMessage.activeTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 12, oKAudioCallRecordMessage.activeTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKAudioCallRecordMessage.duration != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 13, oKAudioCallRecordMessage.duration);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && oKAudioCallRecordMessage.reason == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKAudioCallRecordMessage.reason);
    }

    public OKAudioCallRecordMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKAudioCallRecordMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.caller = parcel.readString();
        this.inviter = parcel.readString();
        this.mediaType = (OKCallCommon.OKCallMediaType) parcel.readParcelable(OKCallCommon.OKCallMediaType.class.getClassLoader());
        this.startTime = parcel.readLong();
        this.activeTime = parcel.readLong();
        this.duration = parcel.readLong();
        this.reason = (OKCallCommon.OKCallDisconnectedReason) parcel.readParcelable(OKCallCommon.OKCallDisconnectedReason.class.getClassLoader());
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.caller);
        parcel.writeString(this.inviter);
        parcel.writeParcelable(this.mediaType, i);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.activeTime);
        parcel.writeLong(this.duration);
        parcel.writeParcelable(this.reason, i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKAudioCallRecordMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKAudioCallRecordMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKAudioCallRecordMessage> serializer() {
            return OKAudioCallRecordMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKAudioCallRecordMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKAudioCallRecordMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKAudioCallRecordMessage[] newArray(int i) {
            return new OKAudioCallRecordMessage[i];
        }
    }
}
