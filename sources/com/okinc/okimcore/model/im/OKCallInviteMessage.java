package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKCallCommon;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKCallInviteMessage extends OKMessageContent {
    private static final KSerializer<Object>[] $childSerializers;
    public String callId;
    private String childExtra;
    public String deviceId;
    public OKCallCommon.CallEngineType engineType;
    private List<String> inviteUserIds;
    private String mediaId;
    public OKCallCommon.OKCallMediaType mediaType;
    private List<String> observerUserIds;
    private boolean useSignalServer;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChildExtra() {
        return this.childExtra;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInviteUserIds() {
        return this.inviteUserIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMediaId() {
        return this.mediaId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getObserverUserIds() {
        return this.observerUserIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getUseSignalServer() {
        return this.useSignalServer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.callId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChildExtra(String str) {
        this.childExtra = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deviceId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEngineType(@NotNull OKCallCommon.CallEngineType callEngineType) {
        Intrinsics.checkNotNullParameter(callEngineType, "");
        this.engineType = callEngineType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInviteUserIds(List<String> list) {
        this.inviteUserIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaId(String str) {
        this.mediaId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMediaType(@NotNull OKCallCommon.OKCallMediaType oKCallMediaType) {
        Intrinsics.checkNotNullParameter(oKCallMediaType, "");
        this.mediaType = oKCallMediaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setObserverUserIds(List<String> list) {
        this.observerUserIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUseSignalServer(boolean z) {
        this.useSignalServer = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCallInviteMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, OKCallCommon.CallEngineType callEngineType, String str4, boolean z3, List list, List list2, OKCallCommon.OKCallMediaType oKCallMediaType, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if (49920 != (i & 49920)) {
            PluginExceptionsKt.throwMissingFieldException(i, 49920, OKCallInviteMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.callId = str3;
        this.engineType = callEngineType;
        if ((i & 1024) == 0) {
            this.childExtra = null;
        } else {
            this.childExtra = str4;
        }
        this.useSignalServer = (i & 2048) == 0 ? false : z3;
        if ((i & 4096) == 0) {
            this.inviteUserIds = null;
        } else {
            this.inviteUserIds = list;
        }
        if ((i & 8192) == 0) {
            this.observerUserIds = null;
        } else {
            this.observerUserIds = list2;
        }
        this.mediaType = oKCallMediaType;
        this.deviceId = str5;
        if ((65536 & i) == 0) {
            this.mediaId = null;
        } else {
            this.mediaId = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallInviteMessage oKCallInviteMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKCallInviteMessage, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKCallInviteMessage.getCallId());
        compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], oKCallInviteMessage.getEngineType());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKCallInviteMessage.childExtra != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKCallInviteMessage.childExtra);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKCallInviteMessage.useSignalServer) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, oKCallInviteMessage.useSignalServer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKCallInviteMessage.inviteUserIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], oKCallInviteMessage.inviteUserIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKCallInviteMessage.observerUserIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr[13], oKCallInviteMessage.observerUserIds);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKCallInviteMessage.getMediaType());
        compositeEncoder.encodeStringElement(serialDescriptor, 15, oKCallInviteMessage.getDeviceId());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKCallInviteMessage.mediaId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, oKCallInviteMessage.mediaId);
    }

    public final String getCallId() {
        String str = this.callId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final OKCallCommon.CallEngineType getEngineType() {
        OKCallCommon.CallEngineType callEngineType = this.engineType;
        if (callEngineType != null) {
            return callEngineType;
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

    public final String getDeviceId() {
        String str = this.deviceId;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public OKCallInviteMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCallInviteMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        setCallId(string);
        Parcelable parcelable = parcel.readParcelable(OKCallCommon.CallEngineType.class.getClassLoader());
        Intrinsics.copydefault(parcelable);
        setEngineType((OKCallCommon.CallEngineType) parcelable);
        this.childExtra = parcel.readString();
        this.useSignalServer = parcel.readByte() != 0;
        this.inviteUserIds = parcel.createStringArrayList();
        this.observerUserIds = parcel.createStringArrayList();
        Parcelable parcelable2 = parcel.readParcelable(OKCallCommon.OKCallMediaType.class.getClassLoader());
        Intrinsics.copydefault(parcelable2);
        setMediaType((OKCallCommon.OKCallMediaType) parcelable2);
        String string2 = parcel.readString();
        Intrinsics.copydefault((Object) string2);
        setDeviceId(string2);
        this.mediaId = parcel.readString();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getCallId());
        parcel.writeParcelable(getEngineType(), i);
        parcel.writeString(this.childExtra);
        parcel.writeByte(this.useSignalServer ? (byte) 1 : (byte) 0);
        parcel.writeStringList(this.inviteUserIds);
        parcel.writeStringList(this.observerUserIds);
        parcel.writeParcelable(getMediaType(), i);
        parcel.writeString(getDeviceId());
        parcel.writeString(this.mediaId);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKCallInviteMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallInviteMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKCallInviteMessage> serializer() {
            return OKCallInviteMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallInviteMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCallInviteMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallInviteMessage[] newArray(int i) {
            return new OKCallInviteMessage[i];
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.CallEngineType", OKCallCommon.CallEngineType.values()), null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKCallCommon.OKCallMediaType", OKCallCommon.OKCallMediaType.values()), null, null};
    }
}
