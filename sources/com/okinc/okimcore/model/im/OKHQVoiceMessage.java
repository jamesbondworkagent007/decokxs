package com.okinc.okimcore.model.im;

import android.net.Uri;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKHQVoiceMessage extends OKMediaMessageContent {
    private int duration;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(int i) {
        this.duration = i;
    }

    public /* synthetic */ OKHQVoiceMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        OKHQVoiceMessage oKHQVoiceMessage;
        int i3;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            i3 = 0;
            oKHQVoiceMessage = this;
        } else {
            oKHQVoiceMessage = this;
            i3 = i2;
        }
        oKHQVoiceMessage.duration = i3;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKHQVoiceMessage oKHQVoiceMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKHQVoiceMessage, compositeEncoder, serialDescriptor);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && oKHQVoiceMessage.duration == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 11, oKHQVoiceMessage.duration);
    }

    public OKHQVoiceMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKHQVoiceMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.duration = parcel.readInt();
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.duration);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKHQVoiceMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKHQVoiceMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKHQVoiceMessage> serializer() {
            return OKHQVoiceMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKHQVoiceMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKHQVoiceMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKHQVoiceMessage[] newArray(int i) {
            return new OKHQVoiceMessage[i];
        }

        public final OKHQVoiceMessage obtain(@NotNull Uri uri, int i) {
            Intrinsics.checkNotNullParameter(uri, "");
            OKHQVoiceMessage oKHQVoiceMessage = new OKHQVoiceMessage();
            oKHQVoiceMessage.setDuration(i);
            oKHQVoiceMessage.setLocalUri(uri);
            return oKHQVoiceMessage;
        }
    }
}
