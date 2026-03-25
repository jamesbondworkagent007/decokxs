package com.okinc.share.bean.image;

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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class ImageFooterConfig implements Parcelable {
    public static final int POSITION_BOTTOM_APPEND = 1;
    public static final int POSITION_BOTTOM_OVERLAY = 0;
    public static final int THEME_FIXED_DARK = 2;
    public static final int THEME_FIXED_LIGHT = 1;
    public static final int THEME_FIXED_VIP = 3;
    public static final int THEME_FOLLOW_APP = 0;
    private boolean enableLogo;
    private int position;
    private String qrcode;
    private String shareFrom;
    private String subtitle;
    private int theme;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageFooterConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ImageFooterConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageFooterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ImageFooterConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageFooterConfig[] newArray(int i) {
            return new ImageFooterConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageFooterConfig() {
        this((String) null, (String) null, (String) null, 0, 0, false, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ImageFooterConfig copy$default(ImageFooterConfig imageFooterConfig, String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = imageFooterConfig.title;
        }
        if ((i3 & 2) != 0) {
            str2 = imageFooterConfig.subtitle;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = imageFooterConfig.qrcode;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            i = imageFooterConfig.position;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = imageFooterConfig.theme;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = imageFooterConfig.enableLogo;
        }
        boolean z2 = z;
        if ((i3 & 64) != 0) {
            str4 = imageFooterConfig.shareFrom;
        }
        return imageFooterConfig.copy(str, str5, str6, i4, i5, z2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.theme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.enableLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageFooterConfig copy(String str, String str2, String str3, int i, int i2, boolean z, String str4) {
        return new ImageFooterConfig(str, str2, str3, i, i2, z, str4);
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
        if (!(obj instanceof ImageFooterConfig)) {
            return false;
        }
        ImageFooterConfig imageFooterConfig = (ImageFooterConfig) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) imageFooterConfig.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) imageFooterConfig.subtitle) && Intrinsics.EZpvd((Object) this.qrcode, (Object) imageFooterConfig.qrcode) && this.position == imageFooterConfig.position && this.theme == imageFooterConfig.theme && this.enableLogo == imageFooterConfig.enableLogo && Intrinsics.EZpvd((Object) this.shareFrom, (Object) imageFooterConfig.shareFrom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableLogo() {
        return this.enableLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQrcode() {
        return this.qrcode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTheme() {
        return this.theme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.qrcode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Integer.hashCode(this.position);
        int iHashCode5 = Integer.hashCode(this.theme);
        int iHashCode6 = Boolean.hashCode(this.enableLogo);
        String str4 = this.shareFrom;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableLogo(boolean z) {
        this.enableLogo = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosition(int i) {
        this.position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQrcode(String str) {
        this.qrcode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareFrom(String str) {
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTheme(int i) {
        this.theme = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageFooterConfig(title=" + this.title + ", subtitle=" + this.subtitle + ", qrcode=" + this.qrcode + ", position=" + this.position + ", theme=" + this.theme + ", enableLogo=" + this.enableLogo + ", shareFrom=" + this.shareFrom + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.qrcode);
        parcel.writeInt(this.position);
        parcel.writeInt(this.theme);
        parcel.writeInt(this.enableLogo ? 1 : 0);
        parcel.writeString(this.shareFrom);
    }

    public /* synthetic */ ImageFooterConfig(int i, String str, String str2, String str3, int i2, int i3, boolean z, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.qrcode = null;
        } else {
            this.qrcode = str3;
        }
        if ((i & 8) == 0) {
            this.position = 0;
        } else {
            this.position = i2;
        }
        if ((i & 16) == 0) {
            this.theme = 0;
        } else {
            this.theme = i3;
        }
        if ((i & 32) == 0) {
            this.enableLogo = true;
        } else {
            this.enableLogo = z;
        }
        if ((i & 64) == 0) {
            this.shareFrom = null;
        } else {
            this.shareFrom = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_share_api(ImageFooterConfig imageFooterConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || imageFooterConfig.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, imageFooterConfig.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || imageFooterConfig.subtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, imageFooterConfig.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || imageFooterConfig.qrcode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, imageFooterConfig.qrcode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || imageFooterConfig.position != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, imageFooterConfig.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || imageFooterConfig.theme != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, imageFooterConfig.theme);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !imageFooterConfig.enableLogo) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, imageFooterConfig.enableLogo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && imageFooterConfig.shareFrom == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, imageFooterConfig.shareFrom);
    }

    public ImageFooterConfig(String str, String str2, String str3, int i, int i2, boolean z, String str4) {
        this.title = str;
        this.subtitle = str2;
        this.qrcode = str3;
        this.position = i;
        this.theme = i2;
        this.enableLogo = z;
        this.shareFrom = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:boolean:0x002a: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r12v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String):void (m)] (LINE:14) call: com.okinc.share.bean.image.ImageFooterConfig.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ ImageFooterConfig(String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? true : z, (i3 & 64) != 0 ? null : str4);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.bean.image.ImageFooterConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ImageFooterConfig> serializer() {
            return ImageFooterConfig$$serializer.INSTANCE;
        }
    }
}
