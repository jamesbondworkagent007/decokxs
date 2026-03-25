package com.okinc.okimcore.model.im.inhouseim.ws;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MediaMessageData implements Parcelable {
    private final Integer contentType;
    private final String fileExtension;
    private final String fileId;
    private final String fileName;
    private final String localUri;
    private String quotedMsgSeq;
    private final Long size;
    private final MediaUrlPaths urlPaths;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MediaMessageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MediaMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaMessageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MediaMessageData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? MediaUrlPaths.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaMessageData[] newArray(int i) {
            return new MediaMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaMessageData() {
        this((String) null, (String) null, (Long) null, (String) null, (Integer) null, (MediaUrlPaths) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    @SerialName("contentType")
    public static /* synthetic */ void getContentType$annotations() {
    }

    @SerialName("fileExtension")
    public static /* synthetic */ void getFileExtension$annotations() {
    }

    @SerialName("fileId")
    public static /* synthetic */ void getFileId$annotations() {
    }

    @SerialName("fileName")
    public static /* synthetic */ void getFileName$annotations() {
    }

    @SerialName("localUri")
    public static /* synthetic */ void getLocalUri$annotations() {
    }

    @SerialName("quotedMsgSeq")
    public static /* synthetic */ void getQuotedMsgSeq$annotations() {
    }

    @SerialName("size")
    public static /* synthetic */ void getSize$annotations() {
    }

    @SerialName("urlPaths")
    public static /* synthetic */ void getUrlPaths$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths component6() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaMessageData copy(String str, String str2, Long l, String str3, Integer num, MediaUrlPaths mediaUrlPaths, String str4, String str5) {
        return new MediaMessageData(str, str2, l, str3, num, mediaUrlPaths, str4, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaMessageData)) {
            return false;
        }
        MediaMessageData mediaMessageData = (MediaMessageData) obj;
        return Intrinsics.EZpvd((Object) this.fileId, (Object) mediaMessageData.fileId) && Intrinsics.EZpvd((Object) this.fileName, (Object) mediaMessageData.fileName) && Intrinsics.EZpvd(this.size, mediaMessageData.size) && Intrinsics.EZpvd((Object) this.fileExtension, (Object) mediaMessageData.fileExtension) && Intrinsics.EZpvd(this.contentType, mediaMessageData.contentType) && Intrinsics.EZpvd(this.urlPaths, mediaMessageData.urlPaths) && Intrinsics.EZpvd((Object) this.localUri, (Object) mediaMessageData.localUri) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) mediaMessageData.quotedMsgSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileExtension() {
        return this.fileExtension;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalUri() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotedMsgSeq() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths getUrlPaths() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fileId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fileName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Long l = this.size;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str3 = this.fileExtension;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.contentType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        int iHashCode6 = mediaUrlPaths == null ? 0 : mediaUrlPaths.hashCode();
        String str4 = this.localUri;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.quotedMsgSeq;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotedMsgSeq(String str) {
        this.quotedMsgSeq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fileId);
        parcel.writeString(this.fileName);
        Long l = this.size;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.fileExtension);
        Integer num = this.contentType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        if (mediaUrlPaths == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaUrlPaths.writeToParcel(parcel, i);
        }
        parcel.writeString(this.localUri);
        parcel.writeString(this.quotedMsgSeq);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaMessageData> serializer() {
            return MediaMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaMessageData(int i, String str, String str2, Long l, String str3, Integer num, MediaUrlPaths mediaUrlPaths, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str;
        }
        if ((i & 2) == 0) {
            this.fileName = null;
        } else {
            this.fileName = str2;
        }
        if ((i & 4) == 0) {
            this.size = null;
        } else {
            this.size = l;
        }
        if ((i & 8) == 0) {
            this.fileExtension = null;
        } else {
            this.fileExtension = str3;
        }
        if ((i & 16) == 0) {
            this.contentType = null;
        } else {
            this.contentType = num;
        }
        if ((i & 32) == 0) {
            this.urlPaths = null;
        } else {
            this.urlPaths = mediaUrlPaths;
        }
        if ((i & 64) == 0) {
            this.localUri = null;
        } else {
            this.localUri = str4;
        }
        if ((i & 128) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(MediaMessageData mediaMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mediaMessageData.fileId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mediaMessageData.fileId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mediaMessageData.fileName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mediaMessageData.fileName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || mediaMessageData.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, mediaMessageData.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || mediaMessageData.fileExtension != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, mediaMessageData.fileExtension);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || mediaMessageData.contentType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, mediaMessageData.contentType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || mediaMessageData.urlPaths != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, MediaUrlPaths$$serializer.INSTANCE, mediaMessageData.urlPaths);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || mediaMessageData.localUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, mediaMessageData.localUri);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && mediaMessageData.quotedMsgSeq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, mediaMessageData.quotedMsgSeq);
    }

    public MediaMessageData(String str, String str2, Long l, String str3, Integer num, MediaUrlPaths mediaUrlPaths, String str4, String str5) {
        this.fileId = str;
        this.fileName = str2;
        this.size = l;
        this.fileExtension = str3;
        this.contentType = num;
        this.urlPaths = mediaUrlPaths;
        this.localUri = str4;
        this.quotedMsgSeq = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r12v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths) : (r15v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.inhouseim.ws.MediaMessageData.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Integer, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MediaMessageData(String str, String str2, Long l, String str3, Integer num, MediaUrlPaths mediaUrlPaths, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : mediaUrlPaths, (i & 64) != 0 ? null : str4, (i & 128) == 0 ? str5 : null);
    }

    public String toString() {
        return "MediaMessageData(fileId=" + this.fileId + ", fileName=" + this.fileName + ", size=" + this.size + ", fileExtension=" + this.fileExtension + ", urlPaths=" + this.urlPaths + ", localUri=" + this.localUri + ")";
    }
}
