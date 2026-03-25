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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class StickerMessageData implements Parcelable {
    private final String path;
    private String quotedMsgSeq;
    private final String stickerId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<StickerMessageData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<StickerMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerMessageData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new StickerMessageData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StickerMessageData[] newArray(int i) {
            return new StickerMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StickerMessageData copy$default(StickerMessageData stickerMessageData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stickerMessageData.stickerId;
        }
        if ((i & 2) != 0) {
            str2 = stickerMessageData.path;
        }
        if ((i & 4) != 0) {
            str3 = stickerMessageData.quotedMsgSeq;
        }
        return stickerMessageData.copy(str, str2, str3);
    }

    @SerialName("path")
    public static /* synthetic */ void getPath$annotations() {
    }

    @SerialName("quotedMsgSeq")
    public static /* synthetic */ void getQuotedMsgSeq$annotations() {
    }

    @SerialName("stickerId")
    public static /* synthetic */ void getStickerId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StickerMessageData copy(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new StickerMessageData(str, str2, str3);
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
        if (!(obj instanceof StickerMessageData)) {
            return false;
        }
        StickerMessageData stickerMessageData = (StickerMessageData) obj;
        return Intrinsics.EZpvd((Object) this.stickerId, (Object) stickerMessageData.stickerId) && Intrinsics.EZpvd((Object) this.path, (Object) stickerMessageData.path) && Intrinsics.EZpvd((Object) this.quotedMsgSeq, (Object) stickerMessageData.quotedMsgSeq);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotedMsgSeq() {
        return this.quotedMsgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStickerId() {
        return this.stickerId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.stickerId.hashCode();
        int iHashCode2 = this.path.hashCode();
        String str = this.quotedMsgSeq;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuotedMsgSeq(String str) {
        this.quotedMsgSeq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StickerMessageData(stickerId=" + this.stickerId + ", path=" + this.path + ", quotedMsgSeq=" + this.quotedMsgSeq + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.quotedMsgSeq);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StickerMessageData> serializer() {
            return StickerMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StickerMessageData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, StickerMessageData$$serializer.INSTANCE.getDescriptor());
        }
        this.stickerId = str;
        this.path = str2;
        if ((i & 4) == 0) {
            this.quotedMsgSeq = null;
        } else {
            this.quotedMsgSeq = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(StickerMessageData stickerMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, stickerMessageData.stickerId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, stickerMessageData.path);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && stickerMessageData.quotedMsgSeq == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, stickerMessageData.quotedMsgSeq);
    }

    public StickerMessageData(@NotNull String str, @NotNull String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.stickerId = str;
        this.path = str2;
        this.quotedMsgSeq = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.okimcore.model.im.inhouseim.ws.StickerMessageData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ StickerMessageData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
