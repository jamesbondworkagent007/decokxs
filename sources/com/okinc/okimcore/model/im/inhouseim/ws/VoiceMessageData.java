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
public final class VoiceMessageData implements Parcelable {
    private Integer duration;
    private String fileId;
    private final String localUri;
    private String quotedMsgSeq;
    private final MediaUrlPaths urlPaths;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VoiceMessageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VoiceMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoiceMessageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VoiceMessageData(parcel.readInt() == 0 ? null : MediaUrlPaths.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VoiceMessageData[] newArray(int i) {
            return new VoiceMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VoiceMessageData() {
        this((MediaUrlPaths) null, (Integer) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VoiceMessageData copy$default(VoiceMessageData voiceMessageData, MediaUrlPaths mediaUrlPaths, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaUrlPaths = voiceMessageData.urlPaths;
        }
        if ((i & 2) != 0) {
            num = voiceMessageData.duration;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = voiceMessageData.localUri;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = voiceMessageData.quotedMsgSeq;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = voiceMessageData.fileId;
        }
        return voiceMessageData.copy(mediaUrlPaths, num2, str4, str5, str3);
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

    @SerialName("urlPaths")
    public static /* synthetic */ void getUrlPaths$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths component1() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.duration;
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
    public final String component5() {
        return this.fileId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VoiceMessageData copy(MediaUrlPaths mediaUrlPaths, Integer num, String str, String str2, String str3) {
        return new VoiceMessageData(mediaUrlPaths, num, str, str2, str3);
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
        if (!(obj instanceof VoiceMessageData)) {
            return false;
        }
        VoiceMessageData voiceMessageData = (VoiceMessageData) obj;
        return Intrinsics.EZpvd(this.urlPaths, voiceMessageData.urlPaths) && Intrinsics.EZpvd(this.duration, voiceMessageData.duration) && Intrinsics.EZpvd((Object) this.localUri, (Object) voiceMessageData.localUri) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) voiceMessageData.quotedMsgSeq) && Intrinsics.EZpvd((Object) this.fileId, (Object) voiceMessageData.fileId);
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
    public final MediaUrlPaths getUrlPaths() {
        return this.urlPaths;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MediaUrlPaths mediaUrlPaths = this.urlPaths;
        int iHashCode = mediaUrlPaths == null ? 0 : mediaUrlPaths.hashCode();
        Integer num = this.duration;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str = this.localUri;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.quotedMsgSeq;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fileId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDuration(Integer num) {
        this.duration = num;
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
    public String toString() {
        return "VoiceMessageData(urlPaths=" + this.urlPaths + ", duration=" + this.duration + ", localUri=" + this.localUri + ", quotedMsgSeq=" + this.quotedMsgSeq + ", fileId=" + this.fileId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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
        parcel.writeString(this.localUri);
        parcel.writeString(this.quotedMsgSeq);
        parcel.writeString(this.fileId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VoiceMessageData> serializer() {
            return VoiceMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VoiceMessageData(int i, MediaUrlPaths mediaUrlPaths, Integer num, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.urlPaths = null;
        } else {
            this.urlPaths = mediaUrlPaths;
        }
        if ((i & 2) == 0) {
            this.duration = null;
        } else {
            this.duration = num;
        }
        if ((i & 4) == 0) {
            this.localUri = null;
        } else {
            this.localUri = str;
        }
        if ((i & 8) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str2;
        }
        if ((i & 16) == 0) {
            this.fileId = null;
        } else {
            this.fileId = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(VoiceMessageData voiceMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || voiceMessageData.urlPaths != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MediaUrlPaths$$serializer.INSTANCE, voiceMessageData.urlPaths);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || voiceMessageData.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, voiceMessageData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || voiceMessageData.localUri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, voiceMessageData.localUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || voiceMessageData.quotedMsgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, voiceMessageData.quotedMsgSeq);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && voiceMessageData.fileId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, voiceMessageData.fileId);
    }

    public VoiceMessageData(MediaUrlPaths mediaUrlPaths, Integer num, String str, String str2, String str3) {
        this.urlPaths = mediaUrlPaths;
        this.duration = num;
        this.localUri = str;
        this.quotedMsgSeq = str2;
        this.fileId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths) : (r5v0 com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.inhouseim.ws.VoiceMessageData.<init>(com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ VoiceMessageData(MediaUrlPaths mediaUrlPaths, Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mediaUrlPaths, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
