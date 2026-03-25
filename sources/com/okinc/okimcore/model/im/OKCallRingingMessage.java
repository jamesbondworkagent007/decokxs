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
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKCallRingingMessage extends OKMessageContent {
    public String callId;
    public String deviceId;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null};

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCallRingingMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if (768 != (i & 768)) {
            PluginExceptionsKt.throwMissingFieldException(i, 768, OKCallRingingMessage$$serializer.INSTANCE.getDescriptor());
        }
        this.callId = str3;
        this.deviceId = str4;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKCallRingingMessage oKCallRingingMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKCallRingingMessage, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKCallRingingMessage.getCallId());
        compositeEncoder.encodeStringElement(serialDescriptor, 9, oKCallRingingMessage.getDeviceId());
    }

    public final String getCallId() {
        String str = this.callId;
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

    public OKCallRingingMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKCallRingingMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        setCallId(string);
        String string2 = parcel.readString();
        Intrinsics.copydefault((Object) string2);
        setDeviceId(string2);
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(getCallId());
        parcel.writeString(getDeviceId());
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKCallRingingMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKCallRingingMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKCallRingingMessage> serializer() {
            return OKCallRingingMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallRingingMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKCallRingingMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKCallRingingMessage[] newArray(int i) {
            return new OKCallRingingMessage[i];
        }
    }
}
