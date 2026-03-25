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
public final class VideoMessageData implements Parcelable {
    private final Integer duration;
    private String fileId;
    private final String localUri;
    private String quotedMsgSeq;
    private final Long size;
    private final String thumbnail;
    private final MediaUrlPaths urlPaths;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VideoMessageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VideoMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMessageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VideoMessageData(parcel.readString(), parcel.readInt() == 0 ? null : MediaUrlPaths.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoMessageData[] newArray(int i) {
            return new VideoMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VideoMessageData() {
        this((String) null, (MediaUrlPaths) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoMessageData copy$default(VideoMessageData videoMessageData, String str, MediaUrlPaths mediaUrlPaths, Integer num, Long l, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoMessageData.thumbnail;
        }
        if ((i & 2) != 0) {
            mediaUrlPaths = videoMessageData.urlPaths;
        }
        MediaUrlPaths mediaUrlPaths2 = mediaUrlPaths;
        if ((i & 4) != 0) {
            num = videoMessageData.duration;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            l = videoMessageData.size;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            str2 = videoMessageData.localUri;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = videoMessageData.quotedMsgSeq;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = videoMessageData.fileId;
        }
        return videoMessageData.copy(str, mediaUrlPaths2, num2, l2, str5, str6, str4);
    }

    @SerialName("duration")
    public static /* synthetic */ void getDuration$annotations() {
    }

    @SerialName("fileId")
    public static /* synthetic */ void getFileId$annotations() {
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

    @SerialName("thumbnail")
    public static /* synthetic */ void getThumbnail$annotations() {
    }

    @SerialName("urlPaths")
    public static /* synthetic */ void getUrlPaths$annotations() {
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
    public final Integer component3() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoMessageData copy(String str, MediaUrlPaths mediaUrlPaths, Integer num, Long l, String str2, String str3, String str4) {
        return new VideoMessageData(str, mediaUrlPaths, num, l, str2, str3, str4);
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
        if (!(obj instanceof VideoMessageData)) {
            return false;
        }
        VideoMessageData videoMessageData = (VideoMessageData) obj;
        return Intrinsics.EZpvd((Object) this.thumbnail, (Object) videoMessageData.thumbnail) && Intrinsics.EZpvd(this.urlPaths, videoMessageData.urlPaths) && Intrinsics.EZpvd(this.duration, videoMessageData.duration) && Intrinsics.EZpvd(this.size, videoMessageData.size) && Intrinsics.EZpvd((Object) this.localUri, (Object) videoMessageData.localUri) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) videoMessageData.quotedMsgSeq) && Intrinsics.EZpvd((Object) this.fileId, (Object) videoMessageData.fileId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileId() {
        return this.fileId;
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
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths getUrlPaths() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.thumbnail;
        int iHashCode = str == null ? 0 : str.hashCode();
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        int iHashCode2 = mediaUrlPaths == null ? 0 : mediaUrlPaths.hashCode();
        Integer num = this.duration;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Long l = this.size;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str2 = this.localUri;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quotedMsgSeq;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fileId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileId(String str) {
        this.fileId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotedMsgSeq(String str) {
        this.quotedMsgSeq = str;
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
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.size;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.localUri);
        parcel.writeString(this.quotedMsgSeq);
        parcel.writeString(this.fileId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VideoMessageData> serializer() {
            return VideoMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VideoMessageData(int i, String str, MediaUrlPaths mediaUrlPaths, Integer num, Long l, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.duration = null;
        } else {
            this.duration = num;
        }
        if ((i & 8) == 0) {
            this.size = null;
        } else {
            this.size = l;
        }
        if ((i & 16) == 0) {
            this.localUri = null;
        } else {
            this.localUri = str2;
        }
        if ((i & 32) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str3;
        }
        if ((i & 64) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(VideoMessageData videoMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || videoMessageData.thumbnail != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, videoMessageData.thumbnail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || videoMessageData.urlPaths != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MediaUrlPaths$$serializer.INSTANCE, videoMessageData.urlPaths);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || videoMessageData.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, videoMessageData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || videoMessageData.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, videoMessageData.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || videoMessageData.localUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, videoMessageData.localUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || videoMessageData.quotedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, videoMessageData.quotedMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && videoMessageData.fileId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, videoMessageData.fileId);
    }

    public VideoMessageData(String str, MediaUrlPaths mediaUrlPaths, Integer num, Long l, String str2, String str3, String str4) {
        this.thumbnail = str;
        this.urlPaths = mediaUrlPaths;
        this.duration = num;
        this.size = l;
        this.localUri = str2;
        this.quotedMsgSeq = str3;
        this.fileId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths) : (r8v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.inhouseim.ws.VideoMessageData.<init>(java.lang.String, com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VideoMessageData(String str, MediaUrlPaths mediaUrlPaths, Integer num, Long l, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mediaUrlPaths, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }

    public String toString() {
        return "VideoMessageData(urlPaths=" + this.urlPaths + ", duration=" + this.duration + ", size=" + this.size + ", localUri=" + this.localUri + ", quotedMsgSeq=" + this.quotedMsgSeq + ")";
    }
}
