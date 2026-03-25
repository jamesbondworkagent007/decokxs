package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class TextStyle implements Parcelable {
    public static final int $stable = 0;
    private final String color;
    private final Integer fontSize;
    private final Boolean isBold;
    private final Float lineHeight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TextStyle> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TextStyle> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextStyle createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TextStyle(numValueOf, string, boolValueOf, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TextStyle[] newArray(int i) {
            return new TextStyle[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, Integer num, String str, Boolean bool, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            num = textStyle.fontSize;
        }
        if ((i & 2) != 0) {
            str = textStyle.color;
        }
        if ((i & 4) != 0) {
            bool = textStyle.isBold;
        }
        if ((i & 8) != 0) {
            f = textStyle.lineHeight;
        }
        return textStyle.copy(num, str, bool, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextStyle copy(Integer num, String str, Boolean bool, Float f) {
        return new TextStyle(num, str, bool, f);
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
        if (!(obj instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) obj;
        return Intrinsics.EZpvd(this.fontSize, textStyle.fontSize) && Intrinsics.EZpvd((Object) this.color, (Object) textStyle.color) && Intrinsics.EZpvd(this.isBold, textStyle.isBold) && Intrinsics.EZpvd(this.lineHeight, textStyle.lineHeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.fontSize;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.color;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.isBold;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        Float f = this.lineHeight;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f != null ? f.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBold() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TextStyle(fontSize=" + this.fontSize + ", color=" + this.color + ", isBold=" + this.isBold + ", lineHeight=" + this.lineHeight + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.fontSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.color);
        Boolean bool = this.isBold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Float f = this.lineHeight;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TextStyle> serializer() {
            return TextStyle$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TextStyle(int i, Integer num, String str, Boolean bool, Float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2, TextStyle$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        this.color = str;
        if ((i & 4) == 0) {
            this.isBold = Boolean.FALSE;
        } else {
            this.isBold = bool;
        }
        if ((i & 8) == 0) {
            this.lineHeight = null;
        } else {
            this.lineHeight = f;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(TextStyle textStyle, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || textStyle.fontSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, textStyle.fontSize);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, textStyle.color);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(textStyle.isBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, textStyle.isBold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && textStyle.lineHeight == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, FloatSerializer.INSTANCE, textStyle.lineHeight);
    }

    public TextStyle(Integer num, String str, Boolean bool, Float f) {
        this.fontSize = num;
        this.color = str;
        this.isBold = bool;
        this.lineHeight = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (r3v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r5v0 java.lang.Float))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Float):void (m)] (LINE:5178) call: com.okinc.ok_kyc_core.data.remote.networkmodel.TextStyle.<init>(java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Float):void type: THIS */
    public /* synthetic */ TextStyle(Integer num, String str, Boolean bool, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, str, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : f);
    }
}
