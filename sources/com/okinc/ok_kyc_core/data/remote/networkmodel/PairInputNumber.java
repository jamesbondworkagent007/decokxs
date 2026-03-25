package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("pair-input-number")
@Serializable
public final class PairInputNumber extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final PairInputValue fieldValue;
    private final String id;
    private final SubInput input;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String ratio;
    private final Boolean required;
    private final SubInput subInput;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PairInputNumber> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PairInputNumber> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairInputNumber createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            SubInput subInputCreateFromParcel = parcel.readInt() == 0 ? null : SubInput.CREATOR.createFromParcel(parcel);
            SubInput subInputCreateFromParcel2 = parcel.readInt() == 0 ? null : SubInput.CREATOR.createFromParcel(parcel);
            PairInputValue pairInputValueCreateFromParcel = parcel.readInt() == 0 ? null : PairInputValue.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PairInputNumber(string, string2, subInputCreateFromParcel, subInputCreateFromParcel2, pairInputValueCreateFromParcel, boolValueOf, string3, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairInputNumber[] newArray(int i) {
            return new PairInputNumber[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput component3() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput component4() {
        return this.subInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairInputValue component5() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairInputNumber copy(@NotNull String str, String str2, SubInput subInput, SubInput subInput2, PairInputValue pairInputValue, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PairInputNumber(str, str2, subInput, subInput2, pairInputValue, bool, str3, bool2, str4, str5, f, f2);
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
        if (!(obj instanceof PairInputNumber)) {
            return false;
        }
        PairInputNumber pairInputNumber = (PairInputNumber) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) pairInputNumber.type) && Intrinsics.EZpvd((Object) this.ratio, (Object) pairInputNumber.ratio) && Intrinsics.EZpvd(this.input, pairInputNumber.input) && Intrinsics.EZpvd(this.subInput, pairInputNumber.subInput) && Intrinsics.EZpvd(this.fieldValue, pairInputNumber.fieldValue) && Intrinsics.EZpvd(this.isHidden, pairInputNumber.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) pairInputNumber.id) && Intrinsics.EZpvd(this.required, pairInputNumber.required) && Intrinsics.EZpvd((Object) this.version, (Object) pairInputNumber.version) && Intrinsics.EZpvd((Object) this.value, (Object) pairInputNumber.value) && Intrinsics.EZpvd(this.bottomMargin, pairInputNumber.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, pairInputNumber.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairInputValue getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput getInput() {
        return this.input;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatio() {
        return this.ratio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput getSubInput() {
        return this.subInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.ratio;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        SubInput subInput = this.input;
        int iHashCode3 = subInput == null ? 0 : subInput.hashCode();
        SubInput subInput2 = this.subInput;
        int iHashCode4 = subInput2 == null ? 0 : subInput2.hashCode();
        PairInputValue pairInputValue = this.fieldValue;
        int iHashCode5 = pairInputValue == null ? 0 : pairInputValue.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str2 = this.id;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (f2 != null ? f2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PairInputNumber(type=" + this.type + ", ratio=" + this.ratio + ", input=" + this.input + ", subInput=" + this.subInput + ", fieldValue=" + this.fieldValue + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.ratio);
        SubInput subInput = this.input;
        if (subInput == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subInput.writeToParcel(parcel, i);
        }
        SubInput subInput2 = this.subInput;
        if (subInput2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            subInput2.writeToParcel(parcel, i);
        }
        PairInputValue pairInputValue = this.fieldValue;
        if (pairInputValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pairInputValue.writeToParcel(parcel, i);
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.version);
        parcel.writeString(this.value);
        Float f = this.bottomMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.leftMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumber.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PairInputNumber> serializer() {
            return PairInputNumber$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PairInputNumber(int i, String str, String str2, SubInput subInput, SubInput subInput2, PairInputValue pairInputValue, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3905 != (i & 3905)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3905, PairInputNumber$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.ratio = null;
        } else {
            this.ratio = str2;
        }
        if ((i & 4) == 0) {
            this.input = null;
        } else {
            this.input = subInput;
        }
        if ((i & 8) == 0) {
            this.subInput = null;
        } else {
            this.subInput = subInput2;
        }
        if ((i & 16) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = pairInputValue;
        }
        this.isHidden = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.id = str3;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(PairInputNumber pairInputNumber, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(pairInputNumber, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, pairInputNumber.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pairInputNumber.ratio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pairInputNumber.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pairInputNumber.input != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SubInput$$serializer.INSTANCE, pairInputNumber.input);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pairInputNumber.subInput != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, SubInput$$serializer.INSTANCE, pairInputNumber.subInput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || pairInputNumber.fieldValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, PairInputValue$$serializer.INSTANCE, pairInputNumber.fieldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(pairInputNumber.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, pairInputNumber.isHidden());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, pairInputNumber.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(pairInputNumber.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, pairInputNumber.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, pairInputNumber.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, pairInputNumber.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, pairInputNumber.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, pairInputNumber.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2782) call: com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputNumber.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput, com.okinc.ok_kyc_core.data.remote.networkmodel.PairInputValue, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ PairInputNumber(String str, String str2, SubInput subInput, SubInput subInput2, PairInputValue pairInputValue, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : subInput, (i & 8) != 0 ? null : subInput2, (i & 16) != 0 ? null : pairInputValue, (i & 32) != 0 ? Boolean.FALSE : bool, str3, (i & 128) != 0 ? Boolean.FALSE : bool2, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairInputNumber(@NotNull String str, String str2, SubInput subInput, SubInput subInput2, PairInputValue pairInputValue, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.ratio = str2;
        this.input = subInput;
        this.subInput = subInput2;
        this.fieldValue = pairInputValue;
        this.isHidden = bool;
        this.id = str3;
        this.required = bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public PairInputNumberAppModel toAppModel() {
        String str = this.type;
        String str2 = this.ratio;
        SubInput subInput = this.input;
        SubInput subInput2 = this.subInput;
        PairInputValue pairInputValue = this.fieldValue;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new PairInputNumberAppModel(str, str2, subInput, subInput2, pairInputValue, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
