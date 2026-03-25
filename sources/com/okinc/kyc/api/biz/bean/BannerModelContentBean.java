package com.okinc.kyc.api.biz.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class BannerModelContentBean implements Parcelable {
    public static final int $stable = 0;
    private final String backgroundColorDark;
    private final String backgroundColorLight;
    private final String content;
    private final String icon;
    private final String iconTintColorDark;
    private final String iconTintColorLight;
    private final boolean isSticky;
    private final String position;
    private final String textColorDark;
    private final String textColorLight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BannerModelContentBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BannerModelContentBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerModelContentBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BannerModelContentBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BannerModelContentBean[] newArray(int i) {
            return new BannerModelContentBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BannerModelContentBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.backgroundColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isSticky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.backgroundColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconTintColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconTintColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.textColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.textColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BannerModelContentBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new BannerModelContentBean(str, str2, str3, str4, str5, str6, str7, str8, str9, z);
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
        if (!(obj instanceof BannerModelContentBean)) {
            return false;
        }
        BannerModelContentBean bannerModelContentBean = (BannerModelContentBean) obj;
        return Intrinsics.EZpvd((Object) this.backgroundColorLight, (Object) bannerModelContentBean.backgroundColorLight) && Intrinsics.EZpvd((Object) this.backgroundColorDark, (Object) bannerModelContentBean.backgroundColorDark) && Intrinsics.EZpvd((Object) this.icon, (Object) bannerModelContentBean.icon) && Intrinsics.EZpvd((Object) this.iconTintColorLight, (Object) bannerModelContentBean.iconTintColorLight) && Intrinsics.EZpvd((Object) this.iconTintColorDark, (Object) bannerModelContentBean.iconTintColorDark) && Intrinsics.EZpvd((Object) this.content, (Object) bannerModelContentBean.content) && Intrinsics.EZpvd((Object) this.textColorDark, (Object) bannerModelContentBean.textColorDark) && Intrinsics.EZpvd((Object) this.textColorLight, (Object) bannerModelContentBean.textColorLight) && Intrinsics.EZpvd((Object) this.position, (Object) bannerModelContentBean.position) && this.isSticky == bannerModelContentBean.isSticky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColorDark() {
        return this.backgroundColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColorLight() {
        return this.backgroundColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconTintColorDark() {
        return this.iconTintColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconTintColorLight() {
        return this.iconTintColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColorDark() {
        return this.textColorDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColorLight() {
        return this.textColorLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.backgroundColorLight.hashCode() * 31) + this.backgroundColorDark.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.iconTintColorLight.hashCode()) * 31) + this.iconTintColorDark.hashCode()) * 31) + this.content.hashCode()) * 31) + this.textColorDark.hashCode()) * 31) + this.textColorLight.hashCode()) * 31) + this.position.hashCode()) * 31) + Boolean.hashCode(this.isSticky);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSticky() {
        return this.isSticky;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BannerModelContentBean(backgroundColorLight=" + this.backgroundColorLight + ", backgroundColorDark=" + this.backgroundColorDark + ", icon=" + this.icon + ", iconTintColorLight=" + this.iconTintColorLight + ", iconTintColorDark=" + this.iconTintColorDark + ", content=" + this.content + ", textColorDark=" + this.textColorDark + ", textColorLight=" + this.textColorLight + ", position=" + this.position + ", isSticky=" + this.isSticky + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.backgroundColorLight);
        parcel.writeString(this.backgroundColorDark);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconTintColorLight);
        parcel.writeString(this.iconTintColorDark);
        parcel.writeString(this.content);
        parcel.writeString(this.textColorDark);
        parcel.writeString(this.textColorLight);
        parcel.writeString(this.position);
        parcel.writeInt(this.isSticky ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.kyc.api.biz.bean.BannerModelContentBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BannerModelContentBean> serializer() {
            return BannerModelContentBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BannerModelContentBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.backgroundColorLight = "";
        } else {
            this.backgroundColorLight = str;
        }
        if ((i & 2) == 0) {
            this.backgroundColorDark = "";
        } else {
            this.backgroundColorDark = str2;
        }
        if ((i & 4) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 8) == 0) {
            this.iconTintColorLight = "";
        } else {
            this.iconTintColorLight = str4;
        }
        if ((i & 16) == 0) {
            this.iconTintColorDark = "";
        } else {
            this.iconTintColorDark = str5;
        }
        if ((i & 32) == 0) {
            this.content = "";
        } else {
            this.content = str6;
        }
        if ((i & 64) == 0) {
            this.textColorDark = "";
        } else {
            this.textColorDark = str7;
        }
        if ((i & 128) == 0) {
            this.textColorLight = "";
        } else {
            this.textColorLight = str8;
        }
        if ((i & 256) == 0) {
            this.position = "";
        } else {
            this.position = str9;
        }
        if ((i & 512) == 0) {
            this.isSticky = false;
        } else {
            this.isSticky = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(BannerModelContentBean bannerModelContentBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bannerModelContentBean.backgroundColorLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bannerModelContentBean.backgroundColorLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bannerModelContentBean.backgroundColorDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bannerModelContentBean.backgroundColorDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bannerModelContentBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bannerModelContentBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bannerModelContentBean.iconTintColorLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bannerModelContentBean.iconTintColorLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bannerModelContentBean.iconTintColorDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, bannerModelContentBean.iconTintColorDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bannerModelContentBean.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, bannerModelContentBean.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) bannerModelContentBean.textColorDark, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, bannerModelContentBean.textColorDark);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) bannerModelContentBean.textColorLight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, bannerModelContentBean.textColorLight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) bannerModelContentBean.position, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, bannerModelContentBean.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || bannerModelContentBean.isSticky) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 9, bannerModelContentBean.isSticky);
        }
    }

    public BannerModelContentBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.backgroundColorLight = str;
        this.backgroundColorDark = str2;
        this.icon = str3;
        this.iconTintColorLight = str4;
        this.iconTintColorDark = str5;
        this.content = str6;
        this.textColorDark = str7;
        this.textColorLight = str8;
        this.position = str9;
        this.isSticky = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:20) call: com.okinc.kyc.api.biz.bean.BannerModelContentBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BannerModelContentBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "", (i & 512) != 0 ? false : z);
    }
}
