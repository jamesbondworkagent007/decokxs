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
@SerialName("input-select")
@Serializable
public final class InputSelect extends UIComponent implements Parcelable {
    private final Boolean allowCustomValue;
    private Float bottomMargin;
    private final Choices choices;
    private final String countryFlagUrl;
    private final String customId;
    private final FreeText dialogBottomText;
    private final CTAButton editCtaButton;
    private final Boolean enabled;
    private final String id;
    private final Boolean isControlOtherViewShow;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private String textColor;
    private String value;
    private final String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputSelect> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputSelect> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelect createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Choices choicesCreateFromParcel = Choices.CREATOR.createFromParcel(parcel);
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            FreeText freeTextCreateFromParcel = parcel.readInt() == 0 ? null : FreeText.CREATOR.createFromParcel(parcel);
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputSelect(string, string2, choicesCreateFromParcel, boolValueOf, boolValueOf2, string3, boolValueOf3, string4, string5, string6, freeTextCreateFromParcel, cTAButtonCreateFromParcel, string7, boolValueOf4, string8, string9, fValueOf, fValueOf2, boolValueOf5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelect[] newArray(int i) {
            return new InputSelect[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText component11() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component12() {
        return this.editCtaButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component17() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component18() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component19() {
        return this.isControlOtherViewShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices component3() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.allowCustomValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.customId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.countryFlagUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputSelect copy(String str, String str2, @NotNull Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeText freeText, CTAButton cTAButton, @NotNull String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(choices, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InputSelect(str, str2, choices, bool, bool2, str3, bool3, str4, str5, str6, freeText, cTAButton, str7, bool4, str8, str9, f, f2, bool5);
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
        if (!(obj instanceof InputSelect)) {
            return false;
        }
        InputSelect inputSelect = (InputSelect) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputSelect.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputSelect.placeholder) && Intrinsics.EZpvd(this.choices, inputSelect.choices) && Intrinsics.EZpvd(this.enabled, inputSelect.enabled) && Intrinsics.EZpvd(this.isHidden, inputSelect.isHidden) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputSelect.valueName) && Intrinsics.EZpvd(this.allowCustomValue, inputSelect.allowCustomValue) && Intrinsics.EZpvd((Object) this.customId, (Object) inputSelect.customId) && Intrinsics.EZpvd((Object) this.countryFlagUrl, (Object) inputSelect.countryFlagUrl) && Intrinsics.EZpvd((Object) this.textColor, (Object) inputSelect.textColor) && Intrinsics.EZpvd(this.dialogBottomText, inputSelect.dialogBottomText) && Intrinsics.EZpvd(this.editCtaButton, inputSelect.editCtaButton) && Intrinsics.EZpvd((Object) this.id, (Object) inputSelect.id) && Intrinsics.EZpvd(this.required, inputSelect.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputSelect.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputSelect.value) && Intrinsics.EZpvd(this.bottomMargin, inputSelect.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputSelect.leftMargin) && Intrinsics.EZpvd(this.isControlOtherViewShow, inputSelect.isControlOtherViewShow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowCustomValue() {
        return this.allowCustomValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryFlagUrl() {
        return this.countryFlagUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomId() {
        return this.customId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText getDialogBottomText() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getEditCtaButton() {
        return this.editCtaButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.label;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.placeholder;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.choices.hashCode();
        Boolean bool = this.enabled;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.valueName;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool3 = this.allowCustomValue;
        int iHashCode7 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.customId;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.countryFlagUrl;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.textColor;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        FreeText freeText = this.dialogBottomText;
        int iHashCode11 = freeText == null ? 0 : freeText.hashCode();
        CTAButton cTAButton = this.editCtaButton;
        int iHashCode12 = cTAButton == null ? 0 : cTAButton.hashCode();
        int iHashCode13 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        String str7 = this.version;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.value;
        int iHashCode16 = str8 == null ? 0 : str8.hashCode();
        Float f = this.bottomMargin;
        int iHashCode17 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode18 = f2 == null ? 0 : f2.hashCode();
        Boolean bool5 = this.isControlOtherViewShow;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool5 == null ? 0 : bool5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isControlOtherViewShow() {
        return this.isControlOtherViewShow;
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
    public final void setTextColor(String str) {
        this.textColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputSelect(label=" + this.label + ", placeholder=" + this.placeholder + ", choices=" + this.choices + ", enabled=" + this.enabled + ", isHidden=" + this.isHidden + ", valueName=" + this.valueName + ", allowCustomValue=" + this.allowCustomValue + ", customId=" + this.customId + ", countryFlagUrl=" + this.countryFlagUrl + ", textColor=" + this.textColor + ", dialogBottomText=" + this.dialogBottomText + ", editCtaButton=" + this.editCtaButton + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isControlOtherViewShow=" + this.isControlOtherViewShow + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        this.choices.writeToParcel(parcel, i);
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
        parcel.writeString(this.valueName);
        Boolean bool3 = this.allowCustomValue;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.customId);
        parcel.writeString(this.countryFlagUrl);
        parcel.writeString(this.textColor);
        FreeText freeText = this.dialogBottomText;
        if (freeText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeText.writeToParcel(parcel, i);
        }
        CTAButton cTAButton = this.editCtaButton;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        parcel.writeString(this.id);
        Boolean bool4 = this.required;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
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
        Boolean bool5 = this.isControlOtherViewShow;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelect.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputSelect> serializer() {
            return InputSelect$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputSelect(int i, String str, String str2, Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeText freeText, CTAButton cTAButton, String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (249860 != (i & 249860)) {
            PluginExceptionsKt.throwMissingFieldException(i, 249860, InputSelect$$serializer.INSTANCE.getDescriptor());
        }
        this.label = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str2;
        }
        this.choices = choices;
        this.enabled = (i & 8) == 0 ? Boolean.TRUE : bool;
        this.isHidden = (i & 16) == 0 ? Boolean.FALSE : bool2;
        if ((i & 32) == 0) {
            this.valueName = null;
        } else {
            this.valueName = str3;
        }
        this.allowCustomValue = (i & 64) == 0 ? Boolean.FALSE : bool3;
        if ((i & 128) == 0) {
            this.customId = null;
        } else {
            this.customId = str4;
        }
        if ((i & 256) == 0) {
            this.countryFlagUrl = null;
        } else {
            this.countryFlagUrl = str5;
        }
        if ((i & 512) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str6;
        }
        if ((i & 1024) == 0) {
            this.dialogBottomText = null;
        } else {
            this.dialogBottomText = freeText;
        }
        if ((i & 2048) == 0) {
            this.editCtaButton = null;
        } else {
            this.editCtaButton = cTAButton;
        }
        this.id = str7;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str8;
        this.value = str9;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isControlOtherViewShow = (i & 262144) == 0 ? Boolean.FALSE : bool5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputSelect inputSelect, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(inputSelect, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputSelect.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputSelect.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputSelect.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputSelect.placeholder);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, inputSelect.choices);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(inputSelect.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inputSelect.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputSelect.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputSelect.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inputSelect.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inputSelect.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputSelect.allowCustomValue, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputSelect.allowCustomValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inputSelect.customId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, inputSelect.customId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inputSelect.countryFlagUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, inputSelect.countryFlagUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inputSelect.textColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, inputSelect.textColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inputSelect.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FreeText$$serializer.INSTANCE, inputSelect.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inputSelect.editCtaButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, CTAButton$$serializer.INSTANCE, inputSelect.editCtaButton);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, inputSelect.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(inputSelect.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, inputSelect.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, inputSelect.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, inputSelect.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, inputSelect.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, inputSelect.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(inputSelect.isControlOtherViewShow, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, inputSelect.isControlOtherViewShow);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001f: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText:?: TERNARY null = ((wrap:int:0x0053: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText) : (r33v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x005b: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r34v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (r35v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0069: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.Float)
  (r40v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0070: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0075: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4026) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelect.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InputSelect(String str, String str2, Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeText freeText, CTAButton cTAButton, String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, choices, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.FALSE : bool3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : freeText, (i & 2048) != 0 ? null : cTAButton, str7, (i & 8192) != 0 ? Boolean.FALSE : bool4, str8, str9, f, f2, (i & 262144) != 0 ? Boolean.FALSE : bool5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelect(String str, String str2, @NotNull Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeText freeText, CTAButton cTAButton, @NotNull String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5) {
        super(null);
        Intrinsics.checkNotNullParameter(choices, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.label = str;
        this.placeholder = str2;
        this.choices = choices;
        this.enabled = bool;
        this.isHidden = bool2;
        this.valueName = str3;
        this.allowCustomValue = bool3;
        this.customId = str4;
        this.countryFlagUrl = str5;
        this.textColor = str6;
        this.dialogBottomText = freeText;
        this.editCtaButton = cTAButton;
        this.id = str7;
        this.required = bool4;
        this.version = str8;
        this.value = str9;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isControlOtherViewShow = bool5;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InputSelectAppModel toAppModel() {
        String str = this.label;
        String str2 = this.placeholder;
        Choices choices = this.choices;
        Boolean bool = this.enabled;
        Boolean boolIsHidden = isHidden();
        String str3 = this.valueName;
        Boolean bool2 = this.allowCustomValue;
        String str4 = this.customId;
        String str5 = this.countryFlagUrl;
        String str6 = this.textColor;
        FreeText freeText = this.dialogBottomText;
        FreeTextAppModel appModel = freeText != null ? freeText.toAppModel() : null;
        CTAButton cTAButton = this.editCtaButton;
        return new InputSelectAppModel(str, str2, choices, bool, boolIsHidden, str3, bool2, str4, str5, str6, appModel, cTAButton != null ? cTAButton.toAppModel() : null, getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), this.isControlOtherViewShow);
    }
}
