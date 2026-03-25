package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ImageItem implements Parcelable {
    private String adaptiveMode;
    private final String icon;
    private final Integer imageHeight;
    private final String imageName;
    private final Integer imageWidth;
    private final String text;
    private final Integer textLines;
    private final String url;
    private final String urlDark;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageItem> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ImageItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageItem[] newArray(int i) {
            return new ImageItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageItem() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.imageHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.imageWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.urlDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.textLines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.adaptiveMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageItem copy(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6) {
        return new ImageItem(str, num, str2, num2, str3, str4, str5, num3, str6);
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
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) imageItem.icon) && Intrinsics.EZpvd(this.imageHeight, imageItem.imageHeight) && Intrinsics.EZpvd((Object) this.imageName, (Object) imageItem.imageName) && Intrinsics.EZpvd(this.imageWidth, imageItem.imageWidth) && Intrinsics.EZpvd((Object) this.text, (Object) imageItem.text) && Intrinsics.EZpvd((Object) this.url, (Object) imageItem.url) && Intrinsics.EZpvd((Object) this.urlDark, (Object) imageItem.urlDark) && Intrinsics.EZpvd(this.textLines, imageItem.textLines) && Intrinsics.EZpvd((Object) this.adaptiveMode, (Object) imageItem.adaptiveMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdaptiveMode() {
        return this.adaptiveMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImageHeight() {
        return this.imageHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageName() {
        return this.imageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImageWidth() {
        return this.imageWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTextLines() {
        return this.textLines;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrlDark() {
        return this.urlDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.imageHeight;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.imageName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num2 = this.imageWidth;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str3 = this.text;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.url;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.urlDark;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Integer num3 = this.textLines;
        int iHashCode8 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.adaptiveMode;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdaptiveMode(String str) {
        this.adaptiveMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageItem(icon=" + this.icon + ", imageHeight=" + this.imageHeight + ", imageName=" + this.imageName + ", imageWidth=" + this.imageWidth + ", text=" + this.text + ", url=" + this.url + ", urlDark=" + this.urlDark + ", textLines=" + this.textLines + ", adaptiveMode=" + this.adaptiveMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        Integer num = this.imageHeight;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.imageName);
        Integer num2 = this.imageWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        parcel.writeString(this.urlDark);
        Integer num3 = this.textLines;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.adaptiveMode);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ImageItem> serializer() {
            return ImageItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ImageItem(int i, String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.icon = "";
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.imageHeight = 0;
        } else {
            this.imageHeight = num;
        }
        if ((i & 4) == 0) {
            this.imageName = "";
        } else {
            this.imageName = str2;
        }
        if ((i & 8) == 0) {
            this.imageWidth = 0;
        } else {
            this.imageWidth = num2;
        }
        if ((i & 16) == 0) {
            this.text = "";
        } else {
            this.text = str3;
        }
        if ((i & 32) == 0) {
            this.url = "";
        } else {
            this.url = str4;
        }
        if ((i & 64) == 0) {
            this.urlDark = "";
        } else {
            this.urlDark = str5;
        }
        if ((i & 128) == 0) {
            this.textLines = 0;
        } else {
            this.textLines = num3;
        }
        if ((i & 256) == 0) {
            this.adaptiveMode = "";
        } else {
            this.adaptiveMode = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ImageItem imageItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) imageItem.icon, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, imageItem.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num3 = imageItem.imageHeight) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, imageItem.imageHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) imageItem.imageName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, imageItem.imageName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (num2 = imageItem.imageWidth) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, imageItem.imageWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) imageItem.text, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, imageItem.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) imageItem.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, imageItem.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) imageItem.urlDark, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, imageItem.urlDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num = imageItem.textLines) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, imageItem.textLines);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) imageItem.adaptiveMode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, imageItem.adaptiveMode);
    }

    public ImageItem(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6) {
        this.icon = str;
        this.imageHeight = num;
        this.imageName = str2;
        this.imageWidth = num2;
        this.text = str3;
        this.url = str4;
        this.urlDark = str5;
        this.textLines = num3;
        this.adaptiveMode = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003f: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r19v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r21v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:2343) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ImageItem.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ ImageItem(String str, Integer num, String str2, Integer num2, String str3, String str4, String str5, Integer num3, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0 : num2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? 0 : num3, (i & 256) == 0 ? str6 : "");
    }
}
