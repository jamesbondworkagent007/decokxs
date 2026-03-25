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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InputSelectAppModel extends UIComponentAppModel implements Parcelable {
    private final Boolean allowCustomValue;
    private Float bottomMargin;
    private final Choices choices;
    private String countryFlagUrl;
    private final String customId;
    private final FreeTextAppModel dialogBottomText;
    private final CTAButtonAppModel editCtaButton;
    private final Boolean enabled;
    private String id;
    private final Boolean isControlOtherViewShow;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private String textColor;
    private String value;
    private String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputSelectAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputSelectAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectAppModel createFromParcel(Parcel parcel) {
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
            FreeTextAppModel freeTextAppModelCreateFromParcel = parcel.readInt() == 0 ? null : FreeTextAppModel.CREATOR.createFromParcel(parcel);
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
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
            return new InputSelectAppModel(string, string2, choicesCreateFromParcel, boolValueOf, boolValueOf2, string3, boolValueOf3, string4, string5, string6, freeTextAppModelCreateFromParcel, cTAButtonAppModelCreateFromParcel, string7, boolValueOf4, string8, string9, fValueOf, fValueOf2, boolValueOf5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputSelectAppModel[] newArray(int i) {
            return new InputSelectAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputSelectAppModel copy$default(InputSelectAppModel inputSelectAppModel, String str, String str2, Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeTextAppModel freeTextAppModel, CTAButtonAppModel cTAButtonAppModel, String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5, int i, Object obj) {
        return inputSelectAppModel.copy((i & 1) != 0 ? inputSelectAppModel.label : str, (i & 2) != 0 ? inputSelectAppModel.placeholder : str2, (i & 4) != 0 ? inputSelectAppModel.choices : choices, (i & 8) != 0 ? inputSelectAppModel.enabled : bool, (i & 16) != 0 ? inputSelectAppModel.isHidden : bool2, (i & 32) != 0 ? inputSelectAppModel.valueName : str3, (i & 64) != 0 ? inputSelectAppModel.allowCustomValue : bool3, (i & 128) != 0 ? inputSelectAppModel.customId : str4, (i & 256) != 0 ? inputSelectAppModel.countryFlagUrl : str5, (i & 512) != 0 ? inputSelectAppModel.textColor : str6, (i & 1024) != 0 ? inputSelectAppModel.dialogBottomText : freeTextAppModel, (i & 2048) != 0 ? inputSelectAppModel.editCtaButton : cTAButtonAppModel, (i & 4096) != 0 ? inputSelectAppModel.id : str7, (i & 8192) != 0 ? inputSelectAppModel.required : bool4, (i & 16384) != 0 ? inputSelectAppModel.version : str8, (i & 32768) != 0 ? inputSelectAppModel.value : str9, (i & 65536) != 0 ? inputSelectAppModel.bottomMargin : f, (i & 131072) != 0 ? inputSelectAppModel.leftMargin : f2, (i & 262144) != 0 ? inputSelectAppModel.isControlOtherViewShow : bool5);
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
    public final FreeTextAppModel component11() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel component12() {
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
    public final InputSelectAppModel copy(String str, String str2, @NotNull Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeTextAppModel freeTextAppModel, CTAButtonAppModel cTAButtonAppModel, @NotNull String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(choices, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InputSelectAppModel(str, str2, choices, bool, bool2, str3, bool3, str4, str5, str6, freeTextAppModel, cTAButtonAppModel, str7, bool4, str8, str9, f, f2, bool5);
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
        if (!(obj instanceof InputSelectAppModel)) {
            return false;
        }
        InputSelectAppModel inputSelectAppModel = (InputSelectAppModel) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputSelectAppModel.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputSelectAppModel.placeholder) && Intrinsics.EZpvd(this.choices, inputSelectAppModel.choices) && Intrinsics.EZpvd(this.enabled, inputSelectAppModel.enabled) && Intrinsics.EZpvd(this.isHidden, inputSelectAppModel.isHidden) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputSelectAppModel.valueName) && Intrinsics.EZpvd(this.allowCustomValue, inputSelectAppModel.allowCustomValue) && Intrinsics.EZpvd((Object) this.customId, (Object) inputSelectAppModel.customId) && Intrinsics.EZpvd((Object) this.countryFlagUrl, (Object) inputSelectAppModel.countryFlagUrl) && Intrinsics.EZpvd((Object) this.textColor, (Object) inputSelectAppModel.textColor) && Intrinsics.EZpvd(this.dialogBottomText, inputSelectAppModel.dialogBottomText) && Intrinsics.EZpvd(this.editCtaButton, inputSelectAppModel.editCtaButton) && Intrinsics.EZpvd((Object) this.id, (Object) inputSelectAppModel.id) && Intrinsics.EZpvd(this.required, inputSelectAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputSelectAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputSelectAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputSelectAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputSelectAppModel.leftMargin) && Intrinsics.EZpvd(this.isControlOtherViewShow, inputSelectAppModel.isControlOtherViewShow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowCustomValue() {
        return this.allowCustomValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
    public final FreeTextAppModel getDialogBottomText() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getEditCtaButton() {
        return this.editCtaButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        int iHashCode11 = freeTextAppModel == null ? 0 : freeTextAppModel.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.editCtaButton;
        int iHashCode12 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryFlagUrl(String str) {
        this.countryFlagUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTextColor(String str) {
        this.textColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValueName(String str) {
        this.valueName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputSelectAppModel(label=" + this.label + ", placeholder=" + this.placeholder + ", choices=" + this.choices + ", enabled=" + this.enabled + ", isHidden=" + this.isHidden + ", valueName=" + this.valueName + ", allowCustomValue=" + this.allowCustomValue + ", customId=" + this.customId + ", countryFlagUrl=" + this.countryFlagUrl + ", textColor=" + this.textColor + ", dialogBottomText=" + this.dialogBottomText + ", editCtaButton=" + this.editCtaButton + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isControlOtherViewShow=" + this.isControlOtherViewShow + ")";
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
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        if (freeTextAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeTextAppModel.writeToParcel(parcel, i);
        }
        CTAButtonAppModel cTAButtonAppModel = this.editCtaButton;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputSelectAppModel> serializer() {
            return InputSelectAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputSelectAppModel(int i, String str, String str2, Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeTextAppModel freeTextAppModel, CTAButtonAppModel cTAButtonAppModel, String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (249860 != (i & 249860)) {
            PluginExceptionsKt.throwMissingFieldException(i, 249860, InputSelectAppModel$$serializer.INSTANCE.getDescriptor());
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
            this.dialogBottomText = freeTextAppModel;
        }
        if ((i & 2048) == 0) {
            this.editCtaButton = null;
        } else {
            this.editCtaButton = cTAButtonAppModel;
        }
        this.id = str7;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str8;
        this.value = str9;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isControlOtherViewShow = (i & 262144) == 0 ? Boolean.FALSE : bool5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputSelectAppModel inputSelectAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputSelectAppModel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputSelectAppModel.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputSelectAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputSelectAppModel.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputSelectAppModel.placeholder);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, inputSelectAppModel.choices);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(inputSelectAppModel.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inputSelectAppModel.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputSelectAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputSelectAppModel.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inputSelectAppModel.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, inputSelectAppModel.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputSelectAppModel.allowCustomValue, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputSelectAppModel.allowCustomValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || inputSelectAppModel.customId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, inputSelectAppModel.customId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || inputSelectAppModel.countryFlagUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, inputSelectAppModel.countryFlagUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inputSelectAppModel.textColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, inputSelectAppModel.textColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || inputSelectAppModel.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FreeTextAppModel$$serializer.INSTANCE, inputSelectAppModel.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || inputSelectAppModel.editCtaButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, CTAButtonAppModel$$serializer.INSTANCE, inputSelectAppModel.editCtaButton);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, inputSelectAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(inputSelectAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, inputSelectAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, inputSelectAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, inputSelectAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, inputSelectAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, inputSelectAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(inputSelectAppModel.isControlOtherViewShow, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, inputSelectAppModel.isControlOtherViewShow);
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
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel:?: TERNARY null = ((wrap:int:0x0053: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel) : (r33v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x005b: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r34v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (r35v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0063: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0069: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.Float)
  (r40v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0070: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0075: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4073) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputSelectAppModel.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InputSelectAppModel(String str, String str2, Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeTextAppModel freeTextAppModel, CTAButtonAppModel cTAButtonAppModel, String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, choices, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.FALSE : bool3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : freeTextAppModel, (i & 2048) != 0 ? null : cTAButtonAppModel, str7, (i & 8192) != 0 ? Boolean.FALSE : bool4, str8, str9, f, f2, (i & 262144) != 0 ? Boolean.FALSE : bool5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputSelectAppModel(String str, String str2, @NotNull Choices choices, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, String str6, FreeTextAppModel freeTextAppModel, CTAButtonAppModel cTAButtonAppModel, @NotNull String str7, Boolean bool4, String str8, String str9, Float f, Float f2, Boolean bool5) {
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
        this.dialogBottomText = freeTextAppModel;
        this.editCtaButton = cTAButtonAppModel;
        this.id = str7;
        this.required = bool4;
        this.version = str8;
        this.value = str9;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isControlOtherViewShow = bool5;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputSelectAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
