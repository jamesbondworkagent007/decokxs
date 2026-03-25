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
public final class OKSystemRouterNotificationMessage extends OKMessageContent {
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
    public final void setUrl(String str) {
        this.url = str;
    }

    public /* synthetic */ OKSystemRouterNotificationMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, String str3, String str4, String str5, int i2, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 1024) == 0) {
            this.url = null;
        } else {
            this.url = str5;
        }
        this.jumpStatus = (i & 2048) == 0 ? 1 : i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKSystemRouterNotificationMessage oKSystemRouterNotificationMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMessageContent.write$Self(oKSystemRouterNotificationMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || oKSystemRouterNotificationMessage.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, oKSystemRouterNotificationMessage.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || oKSystemRouterNotificationMessage.pushTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, oKSystemRouterNotificationMessage.pushTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || oKSystemRouterNotificationMessage.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, oKSystemRouterNotificationMessage.url);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && oKSystemRouterNotificationMessage.jumpStatus == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 11, oKSystemRouterNotificationMessage.jumpStatus);
    }

    public OKSystemRouterNotificationMessage() {
        this.jumpStatus = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKSystemRouterNotificationMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.jumpStatus = 1;
        this.content = parcel.readString();
        this.pushTitle = parcel.readString();
        this.url = parcel.readString();
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
    public static final class CREATOR implements Parcelable.Creator<OKSystemRouterNotificationMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKSystemRouterNotificationMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKSystemRouterNotificationMessage> serializer() {
            return OKSystemRouterNotificationMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSystemRouterNotificationMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKSystemRouterNotificationMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSystemRouterNotificationMessage[] newArray(int i) {
            return new OKSystemRouterNotificationMessage[i];
        }
    }
}
