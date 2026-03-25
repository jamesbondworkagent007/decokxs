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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class HelperLabelText implements Parcelable {
    public static final int $stable = 0;
    private final String color;
    private final String content;
    private final Integer fontSize;
    private final Boolean isBold;
    private final Double lineHeight;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HelperLabelText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HelperLabelText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabelText createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HelperLabelText(string, numValueOf, string2, boolValueOf, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelperLabelText[] newArray(int i) {
            return new HelperLabelText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HelperLabelText() {
        this((String) null, (Integer) null, (String) null, (Boolean) null, (Double) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HelperLabelText copy$default(HelperLabelText helperLabelText, String str, Integer num, String str2, Boolean bool, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = helperLabelText.content;
        }
        if ((i & 2) != 0) {
            num = helperLabelText.fontSize;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str2 = helperLabelText.color;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            bool = helperLabelText.isBold;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            d = helperLabelText.lineHeight;
        }
        return helperLabelText.copy(str, num2, str3, bool2, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component5() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HelperLabelText copy(String str, Integer num, String str2, Boolean bool, Double d) {
        return new HelperLabelText(str, num, str2, bool, d);
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
        if (!(obj instanceof HelperLabelText)) {
            return false;
        }
        HelperLabelText helperLabelText = (HelperLabelText) obj;
        return Intrinsics.EZpvd((Object) this.content, (Object) helperLabelText.content) && Intrinsics.EZpvd(this.fontSize, helperLabelText.fontSize) && Intrinsics.EZpvd((Object) this.color, (Object) helperLabelText.color) && Intrinsics.EZpvd(this.isBold, helperLabelText.isBold) && Intrinsics.EZpvd(this.lineHeight, helperLabelText.lineHeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getLineHeight() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.content;
        int iHashCode = str == null ? 0 : str.hashCode();
        Integer num = this.fontSize;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        String str2 = this.color;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isBold;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Double d = this.lineHeight;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (d != null ? d.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBold() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HelperLabelText(content=" + this.content + ", fontSize=" + this.fontSize + ", color=" + this.color + ", isBold=" + this.isBold + ", lineHeight=" + this.lineHeight + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.content);
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
        Double d = this.lineHeight;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HelperLabelText> serializer() {
            return HelperLabelText$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HelperLabelText(int i, String str, Integer num, String str2, Boolean bool, Double d, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.content = null;
        } else {
            this.content = str;
        }
        if ((i & 2) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        if ((i & 4) == 0) {
            this.color = null;
        } else {
            this.color = str2;
        }
        if ((i & 8) == 0) {
            this.isBold = Boolean.FALSE;
        } else {
            this.isBold = bool;
        }
        if ((i & 16) == 0) {
            this.lineHeight = null;
        } else {
            this.lineHeight = d;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(HelperLabelText helperLabelText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || helperLabelText.content != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, helperLabelText.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || helperLabelText.fontSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, helperLabelText.fontSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || helperLabelText.color != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, helperLabelText.color);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(helperLabelText.isBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, helperLabelText.isBold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && helperLabelText.lineHeight == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, DoubleSerializer.INSTANCE, helperLabelText.lineHeight);
    }

    public HelperLabelText(String str, Integer num, String str2, Boolean bool, Double d) {
        this.content = str;
        this.fontSize = num;
        this.color = str2;
        this.isBold = bool;
        this.lineHeight = d;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.Boolean:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x001a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r8v0 java.lang.Boolean))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r9v0 java.lang.Double))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Double):void (m)] (LINE:2188) call: com.okinc.ok_kyc_core.data.remote.networkmodel.HelperLabelText.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.lang.Double):void type: THIS */
    public /* synthetic */ HelperLabelText(String str, Integer num, String str2, Boolean bool, Double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? null : d);
    }
}
