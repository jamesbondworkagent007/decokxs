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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class MediaUrlPaths implements Parcelable {
    public static final int $stable = 0;
    private final String cN;
    private final String cdn;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final String f80default;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MediaUrlPaths> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MediaUrlPaths> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaUrlPaths createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MediaUrlPaths(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MediaUrlPaths[] newArray(int i) {
            return new MediaUrlPaths[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaUrlPaths() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MediaUrlPaths copy$default(MediaUrlPaths mediaUrlPaths, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mediaUrlPaths.cN;
        }
        if ((i & 2) != 0) {
            str2 = mediaUrlPaths.f80default;
        }
        if ((i & 4) != 0) {
            str3 = mediaUrlPaths.cdn;
        }
        return mediaUrlPaths.copy(str, str2, str3);
    }

    @SerialName("CN")
    public static /* synthetic */ void getCN$annotations() {
    }

    @SerialName("cdn")
    public static /* synthetic */ void getCdn$annotations() {
    }

    @SerialName("default")
    public static /* synthetic */ void getDefault$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.f80default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.cdn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MediaUrlPaths copy(String str, String str2, String str3) {
        return new MediaUrlPaths(str, str2, str3);
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
        if (!(obj instanceof MediaUrlPaths)) {
            return false;
        }
        MediaUrlPaths mediaUrlPaths = (MediaUrlPaths) obj;
        return Intrinsics.EZpvd((Object) this.cN, (Object) mediaUrlPaths.cN) && Intrinsics.EZpvd((Object) this.f80default, (Object) mediaUrlPaths.f80default) && Intrinsics.EZpvd((Object) this.cdn, (Object) mediaUrlPaths.cdn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCN() {
        return this.cN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCdn() {
        return this.cdn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefault() {
        return this.f80default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cN;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f80default;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cdn;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MediaUrlPaths(cN=" + this.cN + ", default=" + this.f80default + ", cdn=" + this.cdn + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cN);
        parcel.writeString(this.f80default);
        parcel.writeString(this.cdn);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MediaUrlPaths> serializer() {
            return MediaUrlPaths$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MediaUrlPaths(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cN = null;
        } else {
            this.cN = str;
        }
        if ((i & 2) == 0) {
            this.f80default = null;
        } else {
            this.f80default = str2;
        }
        if ((i & 4) == 0) {
            this.cdn = null;
        } else {
            this.cdn = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(MediaUrlPaths mediaUrlPaths, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || mediaUrlPaths.cN != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, mediaUrlPaths.cN);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || mediaUrlPaths.f80default != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, mediaUrlPaths.f80default);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && mediaUrlPaths.cdn == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, mediaUrlPaths.cdn);
    }

    public MediaUrlPaths(String str, String str2, String str3) {
        this.cN = str;
        this.f80default = str2;
        this.cdn = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.okimcore.model.im.inhouseim.ws.MediaUrlPaths.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MediaUrlPaths(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
