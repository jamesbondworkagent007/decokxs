package com.okinc.planet_api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RichShareToFeedImage implements Parcelable {
    private String bitmapKey;
    private String filePath;
    private String pathUrl;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RichShareToFeedImage> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RichShareToFeedImage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichShareToFeedImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RichShareToFeedImage(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RichShareToFeedImage[] newArray(int i) {
            return new RichShareToFeedImage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RichShareToFeedImage() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RichShareToFeedImage copy$default(RichShareToFeedImage richShareToFeedImage, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richShareToFeedImage.bitmapKey;
        }
        if ((i & 2) != 0) {
            str2 = richShareToFeedImage.pathUrl;
        }
        if ((i & 4) != 0) {
            str3 = richShareToFeedImage.filePath;
        }
        return richShareToFeedImage.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichShareToFeedImage copy(String str, String str2, String str3) {
        return new RichShareToFeedImage(str, str2, str3);
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
        if (!(obj instanceof RichShareToFeedImage)) {
            return false;
        }
        RichShareToFeedImage richShareToFeedImage = (RichShareToFeedImage) obj;
        return Intrinsics.EZpvd((Object) this.bitmapKey, (Object) richShareToFeedImage.bitmapKey) && Intrinsics.EZpvd((Object) this.pathUrl, (Object) richShareToFeedImage.pathUrl) && Intrinsics.EZpvd((Object) this.filePath, (Object) richShareToFeedImage.filePath);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBitmapKey() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPathUrl() {
        return this.pathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.bitmapKey;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pathUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.filePath;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBitmapKey(String str) {
        this.bitmapKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilePath(String str) {
        this.filePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPathUrl(String str) {
        this.pathUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RichShareToFeedImage(bitmapKey=" + this.bitmapKey + ", pathUrl=" + this.pathUrl + ", filePath=" + this.filePath + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bitmapKey);
        parcel.writeString(this.pathUrl);
        parcel.writeString(this.filePath);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.RichShareToFeedImage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RichShareToFeedImage> serializer() {
            return RichShareToFeedImage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RichShareToFeedImage(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bitmapKey = "";
        } else {
            this.bitmapKey = str;
        }
        if ((i & 2) == 0) {
            this.pathUrl = "";
        } else {
            this.pathUrl = str2;
        }
        if ((i & 4) == 0) {
            this.filePath = "";
        } else {
            this.filePath = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(RichShareToFeedImage richShareToFeedImage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) richShareToFeedImage.bitmapKey, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, richShareToFeedImage.bitmapKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) richShareToFeedImage.pathUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, richShareToFeedImage.pathUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) richShareToFeedImage.filePath, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, richShareToFeedImage.filePath);
    }

    public RichShareToFeedImage(String str, String str2, String str3) {
        this.bitmapKey = str;
        this.pathUrl = str2;
        this.filePath = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:84) call: com.okinc.planet_api.RichShareToFeedImage.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RichShareToFeedImage(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
