package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.utility.UriSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKGIFMessage extends OKMediaMessageContent {
    private long gifDataSize;
    private int height;
    private boolean isUpLoadExp;
    private Uri remoteUri;
    private int width;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null};

    @SerialName("gifDataSize")
    public static /* synthetic */ void getGifDataSize$annotations() {
    }

    @SerialName("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("remoteUrl")
    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getRemoteUri$annotations() {
    }

    @SerialName("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    @SerialName("exp")
    public static /* synthetic */ void isUpLoadExp$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGifDataSize() {
        return this.gifDataSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public Uri getRemoteUri() {
        return this.remoteUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUpLoadExp() {
        return this.isUpLoadExp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGifDataSize(long j) {
        this.gifDataSize = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(int i) {
        this.height = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public void setRemoteUri(Uri uri) {
        this.remoteUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpLoadExp(boolean z) {
        this.isUpLoadExp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(int i) {
        this.width = i;
    }

    public /* synthetic */ OKGIFMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, boolean z3, int i2, int i3, long j2, Uri uri3, SerializationConstructorMarker serializationConstructorMarker) {
        OKGIFMessage oKGIFMessage;
        int i4;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKGIFMessage = this;
            i4 = i;
            oKGIFMessage.isUpLoadExp = false;
        } else {
            oKGIFMessage = this;
            i4 = i;
            oKGIFMessage.isUpLoadExp = z3;
        }
        if ((i4 & 4096) == 0) {
            oKGIFMessage.width = 0;
        } else {
            oKGIFMessage.width = i2;
        }
        oKGIFMessage.height = (i4 & 8192) != 0 ? i3 : 0;
        oKGIFMessage.gifDataSize = (i4 & 16384) == 0 ? 0L : j2;
        oKGIFMessage.remoteUri = (32768 & i4) == 0 ? null : uri3;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKGIFMessage oKGIFMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKGIFMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKGIFMessage.isUpLoadExp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, oKGIFMessage.isUpLoadExp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKGIFMessage.width != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, oKGIFMessage.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKGIFMessage.height != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, oKGIFMessage.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKGIFMessage.gifDataSize != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, oKGIFMessage.gifDataSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && oKGIFMessage.getRemoteUri() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, UriSerializer.INSTANCE, oKGIFMessage.getRemoteUri());
    }

    public OKGIFMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKGIFMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.isUpLoadExp = parcel.readInt() == 1;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.gifDataSize = parcel.readLong();
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.isUpLoadExp ? 1 : 0);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeLong(this.gifDataSize);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKGIFMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKGIFMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKGIFMessage> serializer() {
            return OKGIFMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGIFMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKGIFMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKGIFMessage[] newArray(int i) {
            return new OKGIFMessage[i];
        }

        public static /* synthetic */ OKGIFMessage obtain$default(CREATOR creator, Uri uri, Uri uri2, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = null;
            }
            if ((i & 2) != 0) {
                uri2 = null;
            }
            return creator.obtain(uri, uri2);
        }

        public final OKGIFMessage obtain(Uri uri, Uri uri2) {
            OKGIFMessage oKGIFMessage = new OKGIFMessage();
            oKGIFMessage.setLocalUri(uri);
            oKGIFMessage.setRemoteUri(uri2);
            return oKGIFMessage;
        }
    }
}
