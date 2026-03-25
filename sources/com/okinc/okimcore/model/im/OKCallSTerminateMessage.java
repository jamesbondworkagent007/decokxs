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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKCallSTerminateMessage extends OKMessageContent {
    private String childExtra;
    private String content;
    private String direction;
    public OKCallCommon.OKCallMediaType mediaType;
    private OKCallCommon.OKCallDisconnectedReason reason;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallDisconnectedReason", OKCallCommon.OKCallDisconnectedReason.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType", OKCallCommon.OKCallMediaType.values()), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildExtra() {
        return this.childExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCallCommon.OKCallDisconnectedReason getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildExtra(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.childExtra = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaType(@NotNull OKCallCommon.OKCallMediaType oKCallMediaType) {
        Intrinsics.checkNotNullParameter(oKCallMediaType, "");
        this.mediaType = oKCallMediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReason(OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        this.reason = oKCallDisconnectedReason;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCallSTerminateMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason, OKCallCommon.OKCallMediaType oKCallMediaType, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if (2048 != (i & 2048)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2048, OKCallSTerminateMessage$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 256) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 512) == 0) {
            this.direction = null;
        } else {
            this.direction = str4;
        }
        if ((i & 1024) == 0) {
            this.reason = null;
        } else {
            this.reason = oKCallDisconnectedReason;
        }
        this.mediaType = oKCallMediaType;
        this.childExtra = (i & 4096) == 0 ? "" : str5;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallSTerminateMessage oKCallSTerminateMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKCallSTerminateMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKCallSTerminateMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKCallSTerminateMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKCallSTerminateMessage.direction != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKCallSTerminateMessage.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKCallSTerminateMessage.reason != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKCallSTerminateMessage.reason);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], oKCallSTerminateMessage.getMediaType());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) oKCallSTerminateMessage.childExtra, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, oKCallSTerminateMessage.childExtra);
    }

    public final OKCallCommon.OKCallMediaType getMediaType() {
        OKCallCommon.OKCallMediaType oKCallMediaType = this.mediaType;
        if (oKCallMediaType != null) {
            return oKCallMediaType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public OKCallSTerminateMessage() {
        this.childExtra = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCallSTerminateMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.childExtra = "";
        this.content = parcel.readString();
        this.direction = parcel.readString();
        this.reason = (OKCallCommon.OKCallDisconnectedReason) parcel.readParcelable(OKCallCommon.OKCallDisconnectedReason.class.getClassLoader());
        Parcelable parcelable = parcel.readParcelable(OKCallCommon.OKCallMediaType.class.getClassLoader());
        Intrinsics.copydefault(parcelable);
        setMediaType((OKCallCommon.OKCallMediaType) parcelable);
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        this.childExtra = string;
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.content);
        parcel.writeString(this.direction);
        parcel.writeParcelable(this.reason, i);
        parcel.writeParcelable(getMediaType(), i);
        parcel.writeString(this.childExtra);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKCallSTerminateMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallSTerminateMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKCallSTerminateMessage> serializer() {
            return OKCallSTerminateMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallSTerminateMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCallSTerminateMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallSTerminateMessage[] newArray(int i) {
            return new OKCallSTerminateMessage[i];
        }
    }
}
