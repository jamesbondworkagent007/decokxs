package com.okinc.business.defi.wallet.hardware.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HardWareConnectGuide implements Parcelable {
    private String imageDimensionRatio;
    private Float imageMarginBottom;
    private final String imageRes;
    private final CharSequence primaryText;
    private Boolean secondaryHasClickSpan;
    private CharSequence secondaryText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HardWareConnectGuide> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), new PolymorphicSerializer(C56524yIo.AEQbTJ(CharSequence.class), new Annotation[0]), null, null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<HardWareConnectGuide> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardWareConnectGuide createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
            CharSequence charSequence = (CharSequence) creator.createFromParcel(parcel);
            CharSequence charSequence2 = (CharSequence) creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HardWareConnectGuide(string, charSequence, charSequence2, boolValueOf, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardWareConnectGuide[] newArray(int i) {
            return new HardWareConnectGuide[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HardWareConnectGuide copy$default(HardWareConnectGuide hardWareConnectGuide, String str, CharSequence charSequence, CharSequence charSequence2, Boolean bool, Float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hardWareConnectGuide.imageRes;
        }
        if ((i & 2) != 0) {
            charSequence = hardWareConnectGuide.primaryText;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = hardWareConnectGuide.secondaryText;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            bool = hardWareConnectGuide.secondaryHasClickSpan;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            f = hardWareConnectGuide.imageMarginBottom;
        }
        Float f2 = f;
        if ((i & 32) != 0) {
            str2 = hardWareConnectGuide.imageDimensionRatio;
        }
        return hardWareConnectGuide.copy(str, charSequence3, charSequence4, bool2, f2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component2() {
        return this.primaryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence component3() {
        return this.secondaryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.secondaryHasClickSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.imageMarginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.imageDimensionRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HardWareConnectGuide copy(@NotNull String str, CharSequence charSequence, CharSequence charSequence2, Boolean bool, Float f, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new HardWareConnectGuide(str, charSequence, charSequence2, bool, f, str2);
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
        if (!(obj instanceof HardWareConnectGuide)) {
            return false;
        }
        HardWareConnectGuide hardWareConnectGuide = (HardWareConnectGuide) obj;
        return Intrinsics.EZpvd((Object) this.imageRes, (Object) hardWareConnectGuide.imageRes) && Intrinsics.EZpvd(this.primaryText, hardWareConnectGuide.primaryText) && Intrinsics.EZpvd(this.secondaryText, hardWareConnectGuide.secondaryText) && Intrinsics.EZpvd(this.secondaryHasClickSpan, hardWareConnectGuide.secondaryHasClickSpan) && Intrinsics.EZpvd(this.imageMarginBottom, hardWareConnectGuide.imageMarginBottom) && Intrinsics.EZpvd((Object) this.imageDimensionRatio, (Object) hardWareConnectGuide.imageDimensionRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageDimensionRatio() {
        return this.imageDimensionRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getImageMarginBottom() {
        return this.imageMarginBottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageRes() {
        return this.imageRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getPrimaryText() {
        return this.primaryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSecondaryHasClickSpan() {
        return this.secondaryHasClickSpan;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CharSequence getSecondaryText() {
        return this.secondaryText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.imageRes.hashCode();
        CharSequence charSequence = this.primaryText;
        int iHashCode2 = charSequence == null ? 0 : charSequence.hashCode();
        CharSequence charSequence2 = this.secondaryText;
        int iHashCode3 = charSequence2 == null ? 0 : charSequence2.hashCode();
        Boolean bool = this.secondaryHasClickSpan;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Float f = this.imageMarginBottom;
        int iHashCode5 = f == null ? 0 : f.hashCode();
        String str = this.imageDimensionRatio;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageDimensionRatio(String str) {
        this.imageDimensionRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageMarginBottom(Float f) {
        this.imageMarginBottom = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryHasClickSpan(Boolean bool) {
        this.secondaryHasClickSpan = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondaryText(CharSequence charSequence) {
        this.secondaryText = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        String str = this.imageRes;
        CharSequence charSequence = this.primaryText;
        CharSequence charSequence2 = this.secondaryText;
        return "HardWareConnectGuide(imageRes=" + str + ", primaryText=" + ((Object) charSequence) + ", secondaryText=" + ((Object) charSequence2) + ", secondaryHasClickSpan=" + this.secondaryHasClickSpan + ", imageMarginBottom=" + this.imageMarginBottom + ", imageDimensionRatio=" + this.imageDimensionRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.imageRes);
        TextUtils.writeToParcel(this.primaryText, parcel, i);
        TextUtils.writeToParcel(this.secondaryText, parcel, i);
        Boolean bool = this.secondaryHasClickSpan;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f = this.imageMarginBottom;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeString(this.imageDimensionRatio);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HardWareConnectGuide> serializer() {
            return HardWareConnectGuide$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HardWareConnectGuide(int i, String str, CharSequence charSequence, CharSequence charSequence2, Boolean bool, Float f, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, HardWareConnectGuide$$serializer.INSTANCE.getDescriptor());
        }
        this.imageRes = str;
        if ((i & 2) == 0) {
            this.primaryText = null;
        } else {
            this.primaryText = charSequence;
        }
        if ((i & 4) == 0) {
            this.secondaryText = null;
        } else {
            this.secondaryText = charSequence2;
        }
        if ((i & 8) == 0) {
            this.secondaryHasClickSpan = Boolean.FALSE;
        } else {
            this.secondaryHasClickSpan = bool;
        }
        if ((i & 16) == 0) {
            this.imageMarginBottom = Float.valueOf(0.0f);
        } else {
            this.imageMarginBottom = f;
        }
        if ((i & 32) == 0) {
            this.imageDimensionRatio = "375:260";
        } else {
            this.imageDimensionRatio = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(HardWareConnectGuide hardWareConnectGuide, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hardWareConnectGuide.imageRes);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || hardWareConnectGuide.primaryText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], hardWareConnectGuide.primaryText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || hardWareConnectGuide.secondaryText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], hardWareConnectGuide.secondaryText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(hardWareConnectGuide.secondaryHasClickSpan, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, hardWareConnectGuide.secondaryHasClickSpan);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(hardWareConnectGuide.imageMarginBottom, Float.valueOf(0.0f))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, FloatSerializer.INSTANCE, hardWareConnectGuide.imageMarginBottom);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) hardWareConnectGuide.imageDimensionRatio, (Object) "375:260")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, hardWareConnectGuide.imageDimensionRatio);
    }

    public HardWareConnectGuide(@NotNull String str, CharSequence charSequence, CharSequence charSequence2, Boolean bool, Float f, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageRes = str;
        this.primaryText = charSequence;
        this.secondaryText = charSequence2;
        this.secondaryHasClickSpan = bool;
        this.imageMarginBottom = f;
        this.imageDimensionRatio = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r6v0 java.lang.String)
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.CharSequence) : (r7v0 java.lang.CharSequence))
  (wrap:java.lang.CharSequence:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.CharSequence) : (null java.lang.CharSequence))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: INVOKE (0.0f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED] (LINE:16)) : (r10v0 java.lang.Float))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("375:260") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.Boolean, java.lang.Float, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.hardware.bean.HardWareConnectGuide.<init>(java.lang.String, java.lang.CharSequence, java.lang.CharSequence, java.lang.Boolean, java.lang.Float, java.lang.String):void type: THIS */
    public /* synthetic */ HardWareConnectGuide(String str, CharSequence charSequence, CharSequence charSequence2, Boolean bool, Float f, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence, (i & 4) == 0 ? charSequence2 : null, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Float.valueOf(0.0f) : f, (i & 32) != 0 ? "375:260" : str2);
    }
}
