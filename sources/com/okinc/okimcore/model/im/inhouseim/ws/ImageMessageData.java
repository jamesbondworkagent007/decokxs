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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ImageMessageData implements Parcelable {
    private String fileId;
    private Integer height;
    private final String localUri;
    private String quotedMsgSeq;
    private final String thumbnail;
    private final MediaUrlPaths urlPaths;
    private Integer width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageMessageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ImageMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageMessageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageMessageData(parcel.readString(), parcel.readInt() == 0 ? null : MediaUrlPaths.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageMessageData[] newArray(int i) {
            return new ImageMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageMessageData() {
        this((String) null, (MediaUrlPaths) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageMessageData copy$default(ImageMessageData imageMessageData, String str, MediaUrlPaths mediaUrlPaths, String str2, String str3, Integer num, Integer num2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = imageMessageData.thumbnail;
        }
        if ((i & 2) != 0) {
            mediaUrlPaths = imageMessageData.urlPaths;
        }
        MediaUrlPaths mediaUrlPaths2 = mediaUrlPaths;
        if ((i & 4) != 0) {
            str2 = imageMessageData.localUri;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = imageMessageData.quotedMsgSeq;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            num = imageMessageData.height;
        }
        Integer num3 = num;
        if ((i & 32) != 0) {
            num2 = imageMessageData.width;
        }
        Integer num4 = num2;
        if ((i & 64) != 0) {
            str4 = imageMessageData.fileId;
        }
        return imageMessageData.copy(str, mediaUrlPaths2, str5, str6, num3, num4, str4);
    }

    @SerialName("fileId")
    public static /* synthetic */ void getFileId$annotations() {
    }

    @SerialName("height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("localUri")
    public static /* synthetic */ void getLocalUri$annotations() {
    }

    @SerialName("quotedMsgSeq")
    public static /* synthetic */ void getQuotedMsgSeq$annotations() {
    }

    @SerialName("thumbnail")
    public static /* synthetic */ void getThumbnail$annotations() {
    }

    @SerialName("urlPaths")
    public static /* synthetic */ void getUrlPaths$annotations() {
    }

    @SerialName("width")
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths component2() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageMessageData copy(String str, MediaUrlPaths mediaUrlPaths, String str2, String str3, Integer num, Integer num2, String str4) {
        return new ImageMessageData(str, mediaUrlPaths, str2, str3, num, num2, str4);
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
        if (!(obj instanceof ImageMessageData)) {
            return false;
        }
        ImageMessageData imageMessageData = (ImageMessageData) obj;
        return Intrinsics.EZpvd((Object) this.thumbnail, (Object) imageMessageData.thumbnail) && Intrinsics.EZpvd(this.urlPaths, imageMessageData.urlPaths) && Intrinsics.EZpvd((Object) this.localUri, (Object) imageMessageData.localUri) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) imageMessageData.quotedMsgSeq) && Intrinsics.EZpvd(this.height, imageMessageData.height) && Intrinsics.EZpvd(this.width, imageMessageData.width) && Intrinsics.EZpvd((Object) this.fileId, (Object) imageMessageData.fileId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHeight() {
        return this.height;
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
    public final String getThumbnail() {
        return this.thumbnail;
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
    public int hashCode() {
        String str = this.thumbnail;
        int iHashCode = str == null ? 0 : str.hashCode();
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        int iHashCode2 = mediaUrlPaths == null ? 0 : mediaUrlPaths.hashCode();
        String str2 = this.localUri;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quotedMsgSeq;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.height;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.width;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.fileId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileId(String str) {
        this.fileId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(Integer num) {
        this.height = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotedMsgSeq(String str) {
        this.quotedMsgSeq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(Integer num) {
        this.width = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.thumbnail);
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        if (mediaUrlPaths == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mediaUrlPaths.writeToParcel(parcel, i);
        }
        parcel.writeString(this.localUri);
        parcel.writeString(this.quotedMsgSeq);
        Integer num = this.height;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.width;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.fileId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImageMessageData> serializer() {
            return ImageMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ImageMessageData(int i, String str, MediaUrlPaths mediaUrlPaths, String str2, String str3, Integer num, Integer num2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.thumbnail = null;
        } else {
            this.thumbnail = str;
        }
        if ((i & 2) == 0) {
            this.urlPaths = null;
        } else {
            this.urlPaths = mediaUrlPaths;
        }
        if ((i & 4) == 0) {
            this.localUri = null;
        } else {
            this.localUri = str2;
        }
        if ((i & 8) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str3;
        }
        if ((i & 16) == 0) {
            this.height = null;
        } else {
            this.height = num;
        }
        if ((i & 32) == 0) {
            this.width = null;
        } else {
            this.width = num2;
        }
        if ((i & 64) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ImageMessageData imageMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || imageMessageData.thumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, imageMessageData.thumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || imageMessageData.urlPaths != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MediaUrlPaths$$serializer.INSTANCE, imageMessageData.urlPaths);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || imageMessageData.localUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, imageMessageData.localUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || imageMessageData.quotedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, imageMessageData.quotedMsgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || imageMessageData.height != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, imageMessageData.height);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || imageMessageData.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, imageMessageData.width);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && imageMessageData.fileId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, imageMessageData.fileId);
    }

    public ImageMessageData(String str, MediaUrlPaths mediaUrlPaths, String str2, String str3, Integer num, Integer num2, String str4) {
        this.thumbnail = str;
        this.urlPaths = mediaUrlPaths;
        this.localUri = str2;
        this.quotedMsgSeq = str3;
        this.height = num;
        this.width = num2;
        this.fileId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths) : (r8v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:13) call: com.okinc.okimcore.model.im.inhouseim.ws.ImageMessageData.<init>(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ImageMessageData(String str, MediaUrlPaths mediaUrlPaths, String str2, String str3, Integer num, Integer num2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mediaUrlPaths, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str4);
    }

    public String toString() {
        return "ImageMessageData(urlPaths=" + this.urlPaths + ", localUri=" + this.localUri + ", quotedMsgSeq=" + this.quotedMsgSeq + ")";
    }
}
