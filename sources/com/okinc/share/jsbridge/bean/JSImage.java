package com.okinc.share.jsbridge.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.share.bean.image.ImageFooterConfig;
import com.okinc.share.bean.image.ImageFooterConfig$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class JSImage implements Parcelable {
    private ImageFooterConfig footer;
    private String imageBase64;
    private Integer imageHeight;
    private String imageUrl;
    private Integer imageWidth;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<JSImage> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<JSImage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JSImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JSImage(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ImageFooterConfig) parcel.readParcelable(JSImage.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JSImage[] newArray(int i) {
            return new JSImage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JSImage() {
        this((String) null, (String) null, (Integer) null, (Integer) null, (ImageFooterConfig) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JSImage copy$default(JSImage jSImage, String str, String str2, Integer num, Integer num2, ImageFooterConfig imageFooterConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jSImage.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = jSImage.imageBase64;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            num = jSImage.imageWidth;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = jSImage.imageHeight;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            imageFooterConfig = jSImage.footer;
        }
        return jSImage.copy(str, str3, num3, num4, imageFooterConfig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.imageBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.imageWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.imageHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageFooterConfig component5() {
        return this.footer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSImage copy(String str, String str2, Integer num, Integer num2, ImageFooterConfig imageFooterConfig) {
        return new JSImage(str, str2, num, num2, imageFooterConfig);
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
        if (!(obj instanceof JSImage)) {
            return false;
        }
        JSImage jSImage = (JSImage) obj;
        return Intrinsics.EZpvd((Object) this.imageUrl, (Object) jSImage.imageUrl) && Intrinsics.EZpvd((Object) this.imageBase64, (Object) jSImage.imageBase64) && Intrinsics.EZpvd(this.imageWidth, jSImage.imageWidth) && Intrinsics.EZpvd(this.imageHeight, jSImage.imageHeight) && Intrinsics.EZpvd(this.footer, jSImage.footer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageFooterConfig getFooter() {
        return this.footer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageBase64() {
        return this.imageBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.imageBase64;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.imageWidth;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.imageHeight;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        ImageFooterConfig imageFooterConfig = this.footer;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (imageFooterConfig != null ? imageFooterConfig.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFooter(ImageFooterConfig imageFooterConfig) {
        this.footer = imageFooterConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageBase64(String str) {
        this.imageBase64 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageHeight(Integer num) {
        this.imageHeight = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageWidth(Integer num) {
        this.imageWidth = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JSImage(imageUrl=" + this.imageUrl + ", imageBase64=" + this.imageBase64 + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", footer=" + this.footer + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.imageBase64);
        Integer num = this.imageWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.imageHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.footer, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.jsbridge.bean.JSImage.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JSImage> serializer() {
            return JSImage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ JSImage(int i, String str, String str2, Integer num, Integer num2, ImageFooterConfig imageFooterConfig, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i & 2) == 0) {
            this.imageBase64 = null;
        } else {
            this.imageBase64 = str2;
        }
        if ((i & 4) == 0) {
            this.imageWidth = null;
        } else {
            this.imageWidth = num;
        }
        if ((i & 8) == 0) {
            this.imageHeight = null;
        } else {
            this.imageHeight = num2;
        }
        if ((i & 16) == 0) {
            this.footer = null;
        } else {
            this.footer = imageFooterConfig;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(JSImage jSImage, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || jSImage.imageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, jSImage.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || jSImage.imageBase64 != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, jSImage.imageBase64);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || jSImage.imageWidth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, jSImage.imageWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || jSImage.imageHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, jSImage.imageHeight);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && jSImage.footer == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ImageFooterConfig$$serializer.INSTANCE, jSImage.footer);
    }

    public JSImage(String str, String str2, Integer num, Integer num2, ImageFooterConfig imageFooterConfig) {
        this.imageUrl = str;
        this.imageBase64 = str2;
        this.imageWidth = num;
        this.imageHeight = num2;
        this.footer = imageFooterConfig;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r7v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:com.okinc.share.bean.image.ImageFooterConfig:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.share.bean.image.ImageFooterConfig) : (r9v0 com.okinc.share.bean.image.ImageFooterConfig))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.share.bean.image.ImageFooterConfig):void (m)] (LINE:57) call: com.okinc.share.jsbridge.bean.JSImage.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, com.okinc.share.bean.image.ImageFooterConfig):void type: THIS */
    public /* synthetic */ JSImage(String str, String str2, Integer num, Integer num2, ImageFooterConfig imageFooterConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : imageFooterConfig);
    }
}
