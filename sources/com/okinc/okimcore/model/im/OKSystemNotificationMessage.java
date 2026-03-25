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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKSystemNotificationMessage extends OKMessageContent {
    private String content;
    private int jumpStatus;
    private String pushTitle;
    private String url;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getJumpStatus() {
        return this.jumpStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPushTitle() {
        return this.pushTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJumpStatus(int i) {
        this.jumpStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPushTitle(String str) {
        this.pushTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    public /* synthetic */ OKSystemNotificationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, serializationConstructorMarker);
        if ((i & 256) == 0) {
            this.content = null;
        } else {
            this.content = str3;
        }
        if ((i & 512) == 0) {
            this.pushTitle = null;
        } else {
            this.pushTitle = str4;
        }
        this.url = (i & 1024) == 0 ? "" : str5;
        this.jumpStatus = (i & 2048) == 0 ? 1 : i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKSystemNotificationMessage oKSystemNotificationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKSystemNotificationMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKSystemNotificationMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKSystemNotificationMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKSystemNotificationMessage.pushTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKSystemNotificationMessage.pushTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) oKSystemNotificationMessage.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, oKSystemNotificationMessage.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && oKSystemNotificationMessage.jumpStatus == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 11, oKSystemNotificationMessage.jumpStatus);
    }

    public OKSystemNotificationMessage() {
        this.url = "";
        this.jumpStatus = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKSystemNotificationMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.url = "";
        this.jumpStatus = 1;
        this.content = parcel.readString();
        this.pushTitle = parcel.readString();
        String string = parcel.readString();
        Intrinsics.copydefault((Object) string);
        this.url = string;
        this.jumpStatus = parcel.readInt();
    }

    @Override // com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.content);
        parcel.writeString(this.pushTitle);
        parcel.writeString(this.url);
        parcel.writeInt(this.jumpStatus);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKSystemNotificationMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKSystemNotificationMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKSystemNotificationMessage> serializer() {
            return OKSystemNotificationMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSystemNotificationMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKSystemNotificationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSystemNotificationMessage[] newArray(int i) {
            return new OKSystemNotificationMessage[i];
        }
    }
}
