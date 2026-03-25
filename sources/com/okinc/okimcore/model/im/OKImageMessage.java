package com.okinc.okimcore.model.im;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths;
import com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths$$serializer;
import com.okinc.okimcore.model.utility.UriSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKImageMessage extends OKMediaMessageContent {
    private String base64;
    private Integer height;
    private boolean isFull;
    private boolean isUpLoadExp;
    private Uri thumbUri;
    private MediaUrlPaths urlPaths;
    private Integer width;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null};

    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getThumbUri$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBase64() {
        return this.base64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getThumbUri() {
        return this.thumbUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths getUrlPaths() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFull() {
        return this.isFull;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUpLoadExp() {
        return this.isUpLoadExp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBase64(String str) {
        this.base64 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFull(boolean z) {
        this.isFull = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(Integer num) {
        this.height = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThumbUri(Uri uri) {
        this.thumbUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpLoadExp(boolean z) {
        this.isUpLoadExp = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrlPaths(MediaUrlPaths mediaUrlPaths) {
        this.urlPaths = mediaUrlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(Integer num) {
        this.width = num;
    }

    public /* synthetic */ OKImageMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, Uri uri3, boolean z3, String str4, boolean z4, Integer num, Integer num2, MediaUrlPaths mediaUrlPaths, SerializationConstructorMarker serializationConstructorMarker) {
        OKImageMessage oKImageMessage;
        int i2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKImageMessage = this;
            i2 = i;
            oKImageMessage.thumbUri = null;
        } else {
            oKImageMessage = this;
            i2 = i;
            oKImageMessage.thumbUri = uri3;
        }
        if ((i2 & 4096) == 0) {
            oKImageMessage.isUpLoadExp = false;
        } else {
            oKImageMessage.isUpLoadExp = z3;
        }
        if ((i2 & 8192) == 0) {
            oKImageMessage.base64 = null;
        } else {
            oKImageMessage.base64 = str4;
        }
        if ((i2 & 16384) == 0) {
            oKImageMessage.isFull = false;
        } else {
            oKImageMessage.isFull = z4;
        }
        if ((32768 & i2) == 0) {
            oKImageMessage.height = null;
        } else {
            oKImageMessage.height = num;
        }
        if ((65536 & i2) == 0) {
            oKImageMessage.width = null;
        } else {
            oKImageMessage.width = num2;
        }
        oKImageMessage.urlPaths = (i2 & 131072) != 0 ? mediaUrlPaths : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKImageMessage oKImageMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKImageMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKImageMessage.thumbUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, UriSerializer.INSTANCE, oKImageMessage.thumbUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKImageMessage.isUpLoadExp) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, oKImageMessage.isUpLoadExp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKImageMessage.base64 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, oKImageMessage.base64);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKImageMessage.isFull) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, oKImageMessage.isFull);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || oKImageMessage.height != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, oKImageMessage.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || oKImageMessage.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, oKImageMessage.width);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && oKImageMessage.urlPaths == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, MediaUrlPaths$$serializer.INSTANCE, oKImageMessage.urlPaths);
    }

    public OKImageMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKImageMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.thumbUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.isUpLoadExp = parcel.readInt() == 1;
        this.base64 = parcel.readString();
        this.isFull = parcel.readInt() == 1;
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.thumbUri, i);
        parcel.writeInt(this.isUpLoadExp ? 1 : 0);
        parcel.writeString(this.base64);
        parcel.writeInt(this.isFull ? 1 : 0);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKMessageContent> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKImageMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKImageMessage> serializer() {
            return OKImageMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKImageMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKMessageContent[] newArray(int i) {
            return new OKMessageContent[i];
        }

        public final OKImageMessage obtain(Uri uri, Uri uri2, boolean z) {
            OKImageMessage oKImageMessage = new OKImageMessage();
            oKImageMessage.setLocalUri(uri2);
            oKImageMessage.setThumbUri(uri);
            oKImageMessage.setFull(z);
            return oKImageMessage;
        }

        public final OKImageMessage obtain(Uri uri) {
            OKImageMessage oKImageMessage = new OKImageMessage();
            oKImageMessage.setThumbUri(uri);
            oKImageMessage.setLocalUri(uri);
            return oKImageMessage;
        }
    }
}
