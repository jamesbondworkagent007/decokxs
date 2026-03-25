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
@SerialName("input-date-range")
@Serializable
public final class InputDateRange extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final String dateFormat;
    private final Boolean enabled;
    private final String endDatePlaceholderIfToPresent;
    private final InputDateRangeText fieldValue;
    private final String id;
    private Boolean isHidden;
    private final InputDateRangeText label;
    private final Float leftMargin;
    private final InputDateRangeText placeholder;
    private final Boolean required;
    private final Rule rule;
    private final String toPresentCheckboxText;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDateRange> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputDateRange> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRange createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            InputDateRangeText inputDateRangeTextCreateFromParcel = parcel.readInt() == 0 ? null : InputDateRangeText.CREATOR.createFromParcel(parcel);
            InputDateRangeText inputDateRangeTextCreateFromParcel2 = parcel.readInt() == 0 ? null : InputDateRangeText.CREATOR.createFromParcel(parcel);
            InputDateRangeText inputDateRangeTextCreateFromParcel3 = parcel.readInt() == 0 ? null : InputDateRangeText.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Rule ruleCreateFromParcel = parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputDateRange(inputDateRangeTextCreateFromParcel, inputDateRangeTextCreateFromParcel2, inputDateRangeTextCreateFromParcel3, string, string2, string3, ruleCreateFromParcel, boolValueOf, boolValueOf2, string4, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateRange[] newArray(int i) {
            return new InputDateRange[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText component2() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText component3() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dateFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toPresentCheckboxText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.endDatePlaceholderIfToPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule component7() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRange copy(InputDateRangeText inputDateRangeText, InputDateRangeText inputDateRangeText2, InputDateRangeText inputDateRangeText3, String str, String str2, String str3, Rule rule, Boolean bool, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputDateRange(inputDateRangeText, inputDateRangeText2, inputDateRangeText3, str, str2, str3, rule, bool, bool2, str4, bool3, str5, str6, f, f2);
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
        if (!(obj instanceof InputDateRange)) {
            return false;
        }
        InputDateRange inputDateRange = (InputDateRange) obj;
        return Intrinsics.EZpvd(this.label, inputDateRange.label) && Intrinsics.EZpvd(this.placeholder, inputDateRange.placeholder) && Intrinsics.EZpvd(this.fieldValue, inputDateRange.fieldValue) && Intrinsics.EZpvd((Object) this.dateFormat, (Object) inputDateRange.dateFormat) && Intrinsics.EZpvd((Object) this.toPresentCheckboxText, (Object) inputDateRange.toPresentCheckboxText) && Intrinsics.EZpvd((Object) this.endDatePlaceholderIfToPresent, (Object) inputDateRange.endDatePlaceholderIfToPresent) && Intrinsics.EZpvd(this.rule, inputDateRange.rule) && Intrinsics.EZpvd(this.enabled, inputDateRange.enabled) && Intrinsics.EZpvd(this.isHidden, inputDateRange.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputDateRange.id) && Intrinsics.EZpvd(this.required, inputDateRange.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputDateRange.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputDateRange.value) && Intrinsics.EZpvd(this.bottomMargin, inputDateRange.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputDateRange.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateFormat() {
        return this.dateFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndDatePlaceholderIfToPresent() {
        return this.endDatePlaceholderIfToPresent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputDateRangeText getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule getRule() {
        return this.rule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToPresentCheckboxText() {
        return this.toPresentCheckboxText;
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
        InputDateRangeText inputDateRangeText = this.label;
        int iHashCode = inputDateRangeText == null ? 0 : inputDateRangeText.hashCode();
        InputDateRangeText inputDateRangeText2 = this.placeholder;
        int iHashCode2 = inputDateRangeText2 == null ? 0 : inputDateRangeText2.hashCode();
        InputDateRangeText inputDateRangeText3 = this.fieldValue;
        int iHashCode3 = inputDateRangeText3 == null ? 0 : inputDateRangeText3.hashCode();
        String str = this.dateFormat;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.toPresentCheckboxText;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.endDatePlaceholderIfToPresent;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Rule rule = this.rule;
        int iHashCode7 = rule == null ? 0 : rule.hashCode();
        Boolean bool = this.enabled;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode10 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.version;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f2 == null ? 0 : f2.hashCode());
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
        return "InputDateRange(label=" + this.label + ", placeholder=" + this.placeholder + ", fieldValue=" + this.fieldValue + ", dateFormat=" + this.dateFormat + ", toPresentCheckboxText=" + this.toPresentCheckboxText + ", endDatePlaceholderIfToPresent=" + this.endDatePlaceholderIfToPresent + ", rule=" + this.rule + ", enabled=" + this.enabled + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InputDateRangeText inputDateRangeText = this.label;
        if (inputDateRangeText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputDateRangeText.writeToParcel(parcel, i);
        }
        InputDateRangeText inputDateRangeText2 = this.placeholder;
        if (inputDateRangeText2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputDateRangeText2.writeToParcel(parcel, i);
        }
        InputDateRangeText inputDateRangeText3 = this.fieldValue;
        if (inputDateRangeText3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputDateRangeText3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.dateFormat);
        parcel.writeString(this.toPresentCheckboxText);
        parcel.writeString(this.endDatePlaceholderIfToPresent);
        Rule rule = this.rule;
        if (rule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rule.writeToParcel(parcel, i);
        }
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool3 = this.required;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRange.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDateRange> serializer() {
            return InputDateRange$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputDateRange(int i, InputDateRangeText inputDateRangeText, InputDateRangeText inputDateRangeText2, InputDateRangeText inputDateRangeText3, String str, String str2, String str3, Rule rule, Boolean bool, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31232 != (i & 31232)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31232, InputDateRange$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = inputDateRangeText;
        }
        if ((i & 2) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = inputDateRangeText2;
        }
        if ((i & 4) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = inputDateRangeText3;
        }
        if ((i & 8) == 0) {
            this.dateFormat = null;
        } else {
            this.dateFormat = str;
        }
        if ((i & 16) == 0) {
            this.toPresentCheckboxText = null;
        } else {
            this.toPresentCheckboxText = str2;
        }
        if ((i & 32) == 0) {
            this.endDatePlaceholderIfToPresent = null;
        } else {
            this.endDatePlaceholderIfToPresent = str3;
        }
        if ((i & 64) == 0) {
            this.rule = null;
        } else {
            this.rule = rule;
        }
        this.enabled = (i & 128) == 0 ? Boolean.TRUE : bool;
        this.isHidden = (i & 256) == 0 ? Boolean.FALSE : bool2;
        this.id = str4;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDateRange inputDateRange, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(inputDateRange, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inputDateRange.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, InputDateRangeText$$serializer.INSTANCE, inputDateRange.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputDateRange.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InputDateRangeText$$serializer.INSTANCE, inputDateRange.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputDateRange.fieldValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InputDateRangeText$$serializer.INSTANCE, inputDateRange.fieldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputDateRange.dateFormat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inputDateRange.dateFormat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inputDateRange.toPresentCheckboxText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inputDateRange.toPresentCheckboxText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inputDateRange.endDatePlaceholderIfToPresent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inputDateRange.endDatePlaceholderIfToPresent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || inputDateRange.rule != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Rule$$serializer.INSTANCE, inputDateRange.rule);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(inputDateRange.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, inputDateRange.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(inputDateRange.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inputDateRange.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, inputDateRange.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(inputDateRange.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, inputDateRange.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, inputDateRange.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, inputDateRange.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, inputDateRange.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, inputDateRange.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Rule:?: TERNARY null = ((wrap:int:0x0033: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Rule) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Rule))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.Float)
  (r34v0 java.lang.Float)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3411) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRange.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateRangeText, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputDateRange(InputDateRangeText inputDateRangeText, InputDateRangeText inputDateRangeText2, InputDateRangeText inputDateRangeText3, String str, String str2, String str3, Rule rule, Boolean bool, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : inputDateRangeText, (i & 2) != 0 ? null : inputDateRangeText2, (i & 4) != 0 ? null : inputDateRangeText3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : rule, (i & 128) != 0 ? Boolean.TRUE : bool, (i & 256) != 0 ? Boolean.FALSE : bool2, str4, (i & 1024) != 0 ? Boolean.FALSE : bool3, str5, str6, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDateRange(InputDateRangeText inputDateRangeText, InputDateRangeText inputDateRangeText2, InputDateRangeText inputDateRangeText3, String str, String str2, String str3, Rule rule, Boolean bool, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        this.label = inputDateRangeText;
        this.placeholder = inputDateRangeText2;
        this.fieldValue = inputDateRangeText3;
        this.dateFormat = str;
        this.toPresentCheckboxText = str2;
        this.endDatePlaceholderIfToPresent = str3;
        this.rule = rule;
        this.enabled = bool;
        this.isHidden = bool2;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InputDateRangeAppModel toAppModel() {
        return new InputDateRangeAppModel(this.label, this.placeholder, this.fieldValue, this.dateFormat, this.toPresentCheckboxText, this.endDatePlaceholderIfToPresent, this.rule, this.enabled, isHidden(), getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
