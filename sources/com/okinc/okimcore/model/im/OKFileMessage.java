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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKFileMessage extends OKMediaMessageContent implements Parcelable {
    private final String fileExtension;
    private final String fileName;
    private final Long fileSize;
    private Uri localUri;
    private final MediaUrlPaths urlPaths;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKFileMessage> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, InHouseIMContentType.Companion.serializer(), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<OKFileMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKFileMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OKFileMessage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? MediaUrlPaths.CREATOR.createFromParcel(parcel) : null, (Uri) parcel.readParcelable(OKFileMessage.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKFileMessage[] newArray(int i) {
            return new OKFileMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKFileMessage() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKFileMessage copy$default(OKFileMessage oKFileMessage, String str, String str2, Long l, MediaUrlPaths mediaUrlPaths, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oKFileMessage.fileName;
        }
        if ((i & 2) != 0) {
            str2 = oKFileMessage.fileExtension;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            l = oKFileMessage.fileSize;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            mediaUrlPaths = oKFileMessage.urlPaths;
        }
        MediaUrlPaths mediaUrlPaths2 = mediaUrlPaths;
        if ((i & 16) != 0) {
            uri = oKFileMessage.localUri;
        }
        return oKFileMessage.copy(str, str3, l2, mediaUrlPaths2, uri);
    }

    @Serializable(with = UriSerializer.class)
    public static /* synthetic */ void getLocalUri$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths component4() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component5() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKFileMessage copy(String str, String str2, Long l, MediaUrlPaths mediaUrlPaths, Uri uri) {
        return new OKFileMessage(str, str2, l, mediaUrlPaths, uri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKFileMessage)) {
            return false;
        }
        OKFileMessage oKFileMessage = (OKFileMessage) obj;
        return Intrinsics.EZpvd((Object) this.fileName, (Object) oKFileMessage.fileName) && Intrinsics.EZpvd((Object) this.fileExtension, (Object) oKFileMessage.fileExtension) && Intrinsics.EZpvd(this.fileSize, oKFileMessage.fileSize) && Intrinsics.EZpvd(this.urlPaths, oKFileMessage.urlPaths) && Intrinsics.EZpvd(this.localUri, oKFileMessage.localUri);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public Uri getLocalUri() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths getUrlPaths() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fileName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fileExtension;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.fileSize;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        int iHashCode4 = mediaUrlPaths == null ? 0 : mediaUrlPaths.hashCode();
        Uri uri = this.localUri;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (uri != null ? uri.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent
    public void setLocalUri(Uri uri) {
        this.localUri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKFileMessage(fileName=" + this.fileName + ", fileExtension=" + this.fileExtension + ", fileSize=" + this.fileSize + ", urlPaths=" + this.urlPaths + ", localUri=" + this.localUri + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okimcore.model.im.OKMediaMessageContent, com.okinc.okimcore.model.im.OKMessageContent, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileExtension);
        Long l = this.fileSize;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        if (mediaUrlPaths == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaUrlPaths.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.localUri, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKFileMessage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKFileMessage> serializer() {
            return OKFileMessage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKFileMessage(int i, String str, OKUserInfo oKUserInfo, OKMentionedInfo oKMentionedInfo, String str2, boolean z, long j, InHouseIMContentType inHouseIMContentType, boolean z2, Uri uri, Uri uri2, String str3, String str4, String str5, Long l, MediaUrlPaths mediaUrlPaths, Uri uri3, SerializationConstructorMarker serializationConstructorMarker) {
        OKFileMessage oKFileMessage;
        int i2;
        super(i, str, oKUserInfo, oKMentionedInfo, str2, z, j, inHouseIMContentType, z2, uri, uri2, str3, serializationConstructorMarker);
        if ((i & 2048) == 0) {
            oKFileMessage = this;
            i2 = i;
            oKFileMessage.fileName = null;
        } else {
            oKFileMessage = this;
            i2 = i;
            oKFileMessage.fileName = str4;
        }
        if ((i2 & 4096) == 0) {
            oKFileMessage.fileExtension = null;
        } else {
            oKFileMessage.fileExtension = str5;
        }
        if ((i2 & 8192) == 0) {
            oKFileMessage.fileSize = null;
        } else {
            oKFileMessage.fileSize = l;
        }
        if ((i2 & 16384) == 0) {
            oKFileMessage.urlPaths = null;
        } else {
            oKFileMessage.urlPaths = mediaUrlPaths;
        }
        oKFileMessage.localUri = (i2 & 32768) != 0 ? uri3 : null;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKFileMessage oKFileMessage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKMediaMessageContent.write$Self((OKMediaMessageContent) oKFileMessage, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || oKFileMessage.fileName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, oKFileMessage.fileName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || oKFileMessage.fileExtension != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, oKFileMessage.fileExtension);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || oKFileMessage.fileSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, oKFileMessage.fileSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || oKFileMessage.urlPaths != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, MediaUrlPaths$$serializer.INSTANCE, oKFileMessage.urlPaths);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && oKFileMessage.getLocalUri() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, UriSerializer.INSTANCE, oKFileMessage.getLocalUri());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths) : (r8v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths))
  (wrap:android.net.Uri:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null android.net.Uri) : (r9v0 android.net.Uri))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, android.net.Uri):void (m)] (LINE:23) call: com.okinc.okimcore.model.im.OKFileMessage.<init>(java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, android.net.Uri):void type: THIS */
    public /* synthetic */ OKFileMessage(String str, String str2, Long l, MediaUrlPaths mediaUrlPaths, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : mediaUrlPaths, (i & 16) != 0 ? null : uri);
    }

    public OKFileMessage(String str, String str2, Long l, MediaUrlPaths mediaUrlPaths, Uri uri) {
        this.fileName = str;
        this.fileExtension = str2;
        this.fileSize = l;
        this.urlPaths = mediaUrlPaths;
        this.localUri = uri;
    }
}
