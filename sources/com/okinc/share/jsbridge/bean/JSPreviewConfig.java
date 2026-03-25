package com.okinc.share.jsbridge.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class JSPreviewConfig implements Parcelable {
    public static final int IMAGE_PREVIEW_TYPE_FIT_HEIGHT = 0;
    public static final int IMAGE_PREVIEW_TYPE_FIT_WIDTH = 1;
    private int contentType;
    private String imageBottomTips;
    private Integer imagePreviewType;
    private CharSequence linkPreviewBody;
    private String linkPreviewImage;
    private String previewSubtitle;
    private String previewTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<JSPreviewConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0])};

    public static final class Creator implements Parcelable.Creator<JSPreviewConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JSPreviewConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new JSPreviewConfig(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final JSPreviewConfig[] newArray(int i) {
            return new JSPreviewConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ JSPreviewConfig copy$default(JSPreviewConfig jSPreviewConfig, int i, String str, String str2, Integer num, String str3, String str4, CharSequence charSequence, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = jSPreviewConfig.contentType;
        }
        if ((i2 & 2) != 0) {
            str = jSPreviewConfig.previewTitle;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = jSPreviewConfig.previewSubtitle;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            num = jSPreviewConfig.imagePreviewType;
        }
        Integer num2 = num;
        if ((i2 & 16) != 0) {
            str3 = jSPreviewConfig.imageBottomTips;
        }
        String str7 = str3;
        if ((i2 & 32) != 0) {
            str4 = jSPreviewConfig.linkPreviewImage;
        }
        String str8 = str4;
        if ((i2 & 64) != 0) {
            charSequence = jSPreviewConfig.linkPreviewBody;
        }
        return jSPreviewConfig.copy(i, str5, str6, num2, str7, str8, charSequence);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.previewSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.imagePreviewType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageBottomTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.linkPreviewImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component7() {
        return this.linkPreviewBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSPreviewConfig copy(int i, String str, String str2, Integer num, String str3, String str4, CharSequence charSequence) {
        return new JSPreviewConfig(i, str, str2, num, str3, str4, charSequence);
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
        if (!(obj instanceof JSPreviewConfig)) {
            return false;
        }
        JSPreviewConfig jSPreviewConfig = (JSPreviewConfig) obj;
        return this.contentType == jSPreviewConfig.contentType && Intrinsics.EZpvd((Object) this.previewTitle, (Object) jSPreviewConfig.previewTitle) && Intrinsics.EZpvd((Object) this.previewSubtitle, (Object) jSPreviewConfig.previewSubtitle) && Intrinsics.EZpvd(this.imagePreviewType, jSPreviewConfig.imagePreviewType) && Intrinsics.EZpvd((Object) this.imageBottomTips, (Object) jSPreviewConfig.imageBottomTips) && Intrinsics.EZpvd((Object) this.linkPreviewImage, (Object) jSPreviewConfig.linkPreviewImage) && Intrinsics.EZpvd(this.linkPreviewBody, jSPreviewConfig.linkPreviewBody);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getContentType() {
        return this.contentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageBottomTips() {
        return this.imageBottomTips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getImagePreviewType() {
        return this.imagePreviewType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getLinkPreviewBody() {
        return this.linkPreviewBody;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinkPreviewImage() {
        return this.linkPreviewImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewSubtitle() {
        return this.previewSubtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewTitle() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.contentType);
        String str = this.previewTitle;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.previewSubtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.imagePreviewType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str3 = this.imageBottomTips;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.linkPreviewImage;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        CharSequence charSequence = this.linkPreviewBody;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (charSequence != null ? charSequence.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContentType(int i) {
        this.contentType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageBottomTips(String str) {
        this.imageBottomTips = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImagePreviewType(Integer num) {
        this.imagePreviewType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkPreviewBody(CharSequence charSequence) {
        this.linkPreviewBody = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkPreviewImage(String str) {
        this.linkPreviewImage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewSubtitle(String str) {
        this.previewSubtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewTitle(String str) {
        this.previewTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "JSPreviewConfig(contentType=" + this.contentType + ", previewTitle=" + this.previewTitle + ", previewSubtitle=" + this.previewSubtitle + ", imagePreviewType=" + this.imagePreviewType + ", imageBottomTips=" + this.imageBottomTips + ", linkPreviewImage=" + this.linkPreviewImage + ", linkPreviewBody=" + ((Object) this.linkPreviewBody) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.contentType);
        parcel.writeString(this.previewTitle);
        parcel.writeString(this.previewSubtitle);
        Integer num = this.imagePreviewType;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.imageBottomTips);
        parcel.writeString(this.linkPreviewImage);
        TextUtils.writeToParcel(this.linkPreviewBody, parcel, i);
    }

    public /* synthetic */ JSPreviewConfig(int i, int i2, String str, String str2, Integer num, String str3, String str4, CharSequence charSequence, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, JSPreviewConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.contentType = i2;
        if ((i & 2) == 0) {
            this.previewTitle = null;
        } else {
            this.previewTitle = str;
        }
        if ((i & 4) == 0) {
            this.previewSubtitle = null;
        } else {
            this.previewSubtitle = str2;
        }
        if ((i & 8) == 0) {
            this.imagePreviewType = null;
        } else {
            this.imagePreviewType = num;
        }
        if ((i & 16) == 0) {
            this.imageBottomTips = null;
        } else {
            this.imageBottomTips = str3;
        }
        if ((i & 32) == 0) {
            this.linkPreviewImage = null;
        } else {
            this.linkPreviewImage = str4;
        }
        if ((i & 64) == 0) {
            this.linkPreviewBody = null;
        } else {
            this.linkPreviewBody = charSequence;
        }
    }

    public static final /* synthetic */ void write$Self$OKShare_sdk_share_impl(JSPreviewConfig jSPreviewConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeIntElement(serialDescriptor, 0, jSPreviewConfig.contentType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || jSPreviewConfig.previewTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, jSPreviewConfig.previewTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || jSPreviewConfig.previewSubtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, jSPreviewConfig.previewSubtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || jSPreviewConfig.imagePreviewType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, jSPreviewConfig.imagePreviewType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || jSPreviewConfig.imageBottomTips != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, jSPreviewConfig.imageBottomTips);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || jSPreviewConfig.linkPreviewImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, jSPreviewConfig.linkPreviewImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && jSPreviewConfig.linkPreviewBody == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], jSPreviewConfig.linkPreviewBody);
    }

    public JSPreviewConfig(int i, String str, String str2, Integer num, String str3, String str4, CharSequence charSequence) {
        this.contentType = i;
        this.previewTitle = str;
        this.previewSubtitle = str2;
        this.imagePreviewType = num;
        this.imageBottomTips = str3;
        this.linkPreviewImage = str4;
        this.linkPreviewBody = charSequence;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r8v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0024: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.CharSequence) : (null java.lang.CharSequence))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.CharSequence):void (m)] (LINE:39) call: com.okinc.share.jsbridge.bean.JSPreviewConfig.<init>(int, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.CharSequence):void type: THIS */
    public /* synthetic */ JSPreviewConfig(int i, String str, String str2, Integer num, String str3, String str4, CharSequence charSequence, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) == 0 ? charSequence : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.jsbridge.bean.JSPreviewConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<JSPreviewConfig> serializer() {
            return JSPreviewConfig$$serializer.INSTANCE;
        }
    }
}
