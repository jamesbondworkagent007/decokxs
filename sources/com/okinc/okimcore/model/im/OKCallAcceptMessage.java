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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKCallAcceptMessage extends OKMessageContent {
    public String callId;
    public String deviceId;
    public String mediaId;
    public OKCallCommon.OKCallMediaType mediaType;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType", OKCallCommon.OKCallMediaType.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mediaId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaType(@NotNull OKCallCommon.OKCallMediaType oKCallMediaType) {
        Intrinsics.checkNotNullParameter(oKCallMediaType, "");
        this.mediaType = oKCallMediaType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCallAcceptMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, OKCallCommon.OKCallMediaType oKCallMediaType, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if (3840 != (i & 3840)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3840, OKCallAcceptMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.callId = str3;
        this.mediaId = str4;
        this.deviceId = str5;
        this.mediaType = oKCallMediaType;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallAcceptMessage oKCallAcceptMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKCallAcceptMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKCallAcceptMessage.getCallId());
        compositeEncoder.encodeStringElement(serialDescriptor, 9, oKCallAcceptMessage.getMediaId());
        compositeEncoder.encodeStringElement(serialDescriptor, 10, oKCallAcceptMessage.getDeviceId());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], oKCallAcceptMessage.getMediaType());
    }

    public final String getCallId() {
        String str = this.callId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String getMediaId() {
        String str = this.mediaId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String getDeviceId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final OKCallCommon.OKCallMediaType getMediaType() {
        OKCallCommon.OKCallMediaType oKCallMediaType = this.mediaType;
        if (oKCallMediaType != null) {
            return oKCallMediaType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public OKCallAcceptMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCallAcceptMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        setCallId(string);
        String string2 = parcel.readString();
        Intrinsics.copydefault((Object) string2);
        setMediaId(string2);
        String string3 = parcel.readString();
        Intrinsics.copydefault((Object) string3);
        setDeviceId(string3);
        Parcelable parcelable = parcel.readParcelable(OKCallCommon.OKCallMediaType.class.getClassLoader());
        Intrinsics.copydefault(parcelable);
        setMediaType((OKCallCommon.OKCallMediaType) parcelable);
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getCallId());
        parcel.writeString(getMediaId());
        parcel.writeString(getDeviceId());
        parcel.writeParcelable(getMediaType(), i);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKCallAcceptMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallAcceptMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKCallAcceptMessage> serializer() {
            return OKCallAcceptMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallAcceptMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCallAcceptMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallAcceptMessage[] newArray(int i) {
            return new OKCallAcceptMessage[i];
        }
    }
}
