package com.okinc.okimcore.model.im;

import android.content.Context;
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
import kotlinx.serialization.internal.StringSerializer;
import o.C44472sRb;
import o.C44473sRc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKSightMessage extends OKMediaMessageContent {
    private String base64;
    private int duration;
    private boolean isOriginal;
    private Uri remoteUri;
    private long size;
    private Uri thumbUri;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};

    @SerialName("content")
    public static /* synthetic */ void getBase64$annotations() {
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("sightUrl")
    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getRemoteUri$annotations() {
    }

    @SerialName("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @SerialName("thumbUri")
    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getThumbUri$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBase64() {
        return this.base64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public Uri getRemoteUri() {
        return this.remoteUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getThumbUri() {
        return this.thumbUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOriginal() {
        return this.isOriginal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBase64(String str) {
        this.base64 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(int i) {
        this.duration = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginal(boolean z) {
        this.isOriginal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public void setRemoteUri(Uri uri) {
        this.remoteUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSize(long j) {
        this.size = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setThumbUri(Uri uri) {
        this.thumbUri = uri;
    }

    public /* synthetic */ OKSightMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, Uri uri3, String str4, int i2, long j2, boolean z3, Uri uri4, SerializationConstructorMarker serializationConstructorMarker) {
        OKSightMessage oKSightMessage;
        int i3;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKSightMessage = this;
            i3 = i;
            oKSightMessage.thumbUri = null;
        } else {
            oKSightMessage = this;
            i3 = i;
            oKSightMessage.thumbUri = uri3;
        }
        if ((i3 & 4096) == 0) {
            oKSightMessage.base64 = null;
        } else {
            oKSightMessage.base64 = str4;
        }
        if ((i3 & 8192) == 0) {
            oKSightMessage.duration = 0;
        } else {
            oKSightMessage.duration = i2;
        }
        oKSightMessage.size = (i3 & 16384) == 0 ? 0L : j2;
        if ((32768 & i3) == 0) {
            oKSightMessage.isOriginal = false;
        } else {
            oKSightMessage.isOriginal = z3;
        }
        oKSightMessage.remoteUri = (i3 & 65536) != 0 ? uri4 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKSightMessage oKSightMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKSightMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKSightMessage.thumbUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, UriSerializer.INSTANCE, oKSightMessage.thumbUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKSightMessage.base64 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKSightMessage.base64);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKSightMessage.duration != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, oKSightMessage.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKSightMessage.size != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, oKSightMessage.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || oKSightMessage.isOriginal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 15, oKSightMessage.isOriginal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && oKSightMessage.getRemoteUri() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, UriSerializer.INSTANCE, oKSightMessage.getRemoteUri());
    }

    public OKSightMessage() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKSightMessage(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "");
        this.thumbUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.base64 = parcel.readString();
        this.duration = parcel.readInt();
        this.size = parcel.readLong();
        this.isOriginal = parcel.readByte() != 0;
    }

    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.thumbUri, i);
        parcel.writeString(this.base64);
        parcel.writeInt(this.duration);
        parcel.writeLong(this.size);
        parcel.writeByte(this.isOriginal ? (byte) 1 : (byte) 0);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OKSightMessage> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKSightMessage.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public final KSerializer<OKSightMessage> serializer() {
            return OKSightMessage$$serializer.INSTANCE;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSightMessage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKSightMessage(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OKSightMessage[] newArray(int i) {
            return new OKSightMessage[i];
        }

        public static /* synthetic */ OKSightMessage obtain$default(CREATOR creator, Context context, Uri uri, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return creator.obtain(context, uri, i);
        }

        public final OKSightMessage obtain(@NotNull Context context, @NotNull Uri uri, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(uri, "");
            C44472sRb c44472sRbEZpvd = C44473sRc.EZpvd(context, uri);
            OKSightMessage oKSightMessage = new OKSightMessage();
            oKSightMessage.setDuration(i);
            oKSightMessage.setLocalUri(uri);
            String strKWHzl = c44472sRbEZpvd != null ? c44472sRbEZpvd.KWHzl() : null;
            oKSightMessage.setName(strKWHzl != null ? strKWHzl : "");
            oKSightMessage.setSize(c44472sRbEZpvd != null ? c44472sRbEZpvd.OLrzqt() : 0L);
            return oKSightMessage;
        }
    }
}
