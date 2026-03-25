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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43712ruU;
import o.C43772rvb;
import o.C43780rvj;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("cta-button")
@Serializable
public final class CTAButton extends UIComponent implements Parcelable {
    public final ButtonAction action;
    public final ActionParams actionParams;
    public final UIAlignment align;
    public final String backgroundColor;
    public Float bottomMargin;
    public final Boolean closeVerifyCenter;
    public ButtonDialogData dialog;
    public final DynamicTitle dynamicText;
    public final Boolean enabled;
    public final CtaIcon icon;
    public final String id;
    public Boolean isHidden;
    public final Float leftMargin;
    public Boolean loadingInDialog;
    public String playbook;
    public final Boolean required;
    public final ButtonStyle style;
    public final String target;
    public final String text;
    public final ToastModel toast;
    public String value;
    public final String version;
    public final String width;
    public final String widthWeight;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CTAButton> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CTAButton> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CTAButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            ActionParams actionParamsCreateFromParcel = parcel.readInt() == 0 ? null : ActionParams.CREATOR.createFromParcel(parcel);
            ButtonStyle buttonStyleValueOf = parcel.readInt() == 0 ? null : ButtonStyle.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CtaIcon ctaIconCreateFromParcel = parcel.readInt() == 0 ? null : CtaIcon.CREATOR.createFromParcel(parcel);
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string8 = parcel.readString();
            ButtonDialogData buttonDialogDataCreateFromParcel = parcel.readInt() == 0 ? null : ButtonDialogData.CREATOR.createFromParcel(parcel);
            ToastModel toastModelCreateFromParcel = parcel.readInt() == 0 ? null : ToastModel.CREATOR.createFromParcel(parcel);
            DynamicTitle dynamicTitleCreateFromParcel = parcel.readInt() == 0 ? null : DynamicTitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CTAButton(string, buttonActionValueOf, actionParamsCreateFromParcel, buttonStyleValueOf, string2, string3, string4, ctaIconCreateFromParcel, uIAlignmentValueOf, string5, boolValueOf, string6, string7, fValueOf, fValueOf2, boolValueOf2, boolValueOf3, boolValueOf4, string8, buttonDialogDataCreateFromParcel, toastModelCreateFromParcel, dynamicTitleCreateFromParcel, boolValueOf5, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CTAButton[] newArray(int i) {
            return new CTAButton[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CTAButton() {
        this((String) null, (ButtonAction) null, (ActionParams) null, (ButtonStyle) null, (String) null, (String) null, (String) null, (CtaIcon) null, (UIAlignment) null, (String) null, (Boolean) null, (String) null, (String) null, (Float) null, (Float) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (ButtonDialogData) null, (ToastModel) null, (DynamicTitle) null, (Boolean) null, (String) null, 16777215, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton copy(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, Boolean bool4, String str8, ButtonDialogData buttonDialogData, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool5, String str9) {
        return new CTAButton(str, buttonAction, actionParams, buttonStyle, str2, str3, str4, ctaIcon, uIAlignment, str5, bool, str6, str7, f, f2, bool2, bool3, bool4, str8, buttonDialogData, toastModel, dynamicTitle, bool5, str9);
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
        if (!(obj instanceof CTAButton)) {
            return false;
        }
        CTAButton cTAButton = (CTAButton) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) cTAButton.text) && this.action == cTAButton.action && Intrinsics.EZpvd(this.actionParams, cTAButton.actionParams) && this.style == cTAButton.style && Intrinsics.EZpvd((Object) this.target, (Object) cTAButton.target) && Intrinsics.EZpvd((Object) this.width, (Object) cTAButton.width) && Intrinsics.EZpvd((Object) this.widthWeight, (Object) cTAButton.widthWeight) && Intrinsics.EZpvd(this.icon, cTAButton.icon) && this.align == cTAButton.align && Intrinsics.EZpvd((Object) this.id, (Object) cTAButton.id) && Intrinsics.EZpvd(this.required, cTAButton.required) && Intrinsics.EZpvd((Object) this.version, (Object) cTAButton.version) && Intrinsics.EZpvd((Object) this.value, (Object) cTAButton.value) && Intrinsics.EZpvd(this.bottomMargin, cTAButton.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, cTAButton.leftMargin) && Intrinsics.EZpvd(this.isHidden, cTAButton.isHidden) && Intrinsics.EZpvd(this.enabled, cTAButton.enabled) && Intrinsics.EZpvd(this.closeVerifyCenter, cTAButton.closeVerifyCenter) && Intrinsics.EZpvd((Object) this.playbook, (Object) cTAButton.playbook) && Intrinsics.EZpvd(this.dialog, cTAButton.dialog) && Intrinsics.EZpvd(this.toast, cTAButton.toast) && Intrinsics.EZpvd(this.dynamicText, cTAButton.dynamicText) && Intrinsics.EZpvd(this.loadingInDialog, cTAButton.loadingInDialog) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) cTAButton.backgroundColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
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
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        ButtonAction buttonAction = this.action;
        int iHashCode2 = buttonAction == null ? 0 : buttonAction.hashCode();
        ActionParams actionParams = this.actionParams;
        int iHashCode3 = actionParams == null ? 0 : actionParams.hashCode();
        ButtonStyle buttonStyle = this.style;
        int iHashCode4 = buttonStyle == null ? 0 : buttonStyle.hashCode();
        String str2 = this.target;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.width;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.widthWeight;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        CtaIcon ctaIcon = this.icon;
        int iHashCode8 = ctaIcon == null ? 0 : ctaIcon.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode9 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        String str5 = this.id;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.required;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        String str6 = this.version;
        int iHashCode12 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.value;
        int iHashCode13 = str7 == null ? 0 : str7.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode15 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.enabled;
        int iHashCode17 = bool3 == null ? 0 : bool3.hashCode();
        Boolean bool4 = this.closeVerifyCenter;
        int iHashCode18 = bool4 == null ? 0 : bool4.hashCode();
        String str8 = this.playbook;
        int iHashCode19 = str8 == null ? 0 : str8.hashCode();
        ButtonDialogData buttonDialogData = this.dialog;
        int iHashCode20 = buttonDialogData == null ? 0 : buttonDialogData.hashCode();
        ToastModel toastModel = this.toast;
        int iHashCode21 = toastModel == null ? 0 : toastModel.hashCode();
        DynamicTitle dynamicTitle = this.dynamicText;
        int iHashCode22 = dynamicTitle == null ? 0 : dynamicTitle.hashCode();
        Boolean bool5 = this.loadingInDialog;
        int iHashCode23 = bool5 == null ? 0 : bool5.hashCode();
        String str9 = this.backgroundColor;
        return (((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public void setHidden(Boolean bool) {
        this.isHidden = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTAButton(text=" + this.text + ", action=" + this.action + ", actionParams=" + this.actionParams + ", style=" + this.style + ", target=" + this.target + ", width=" + this.width + ", widthWeight=" + this.widthWeight + ", icon=" + this.icon + ", align=" + this.align + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ", enabled=" + this.enabled + ", closeVerifyCenter=" + this.closeVerifyCenter + ", playbook=" + this.playbook + ", dialog=" + this.dialog + ", toast=" + this.toast + ", dynamicText=" + this.dynamicText + ", loadingInDialog=" + this.loadingInDialog + ", backgroundColor=" + this.backgroundColor + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        ButtonAction buttonAction = this.action;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        ActionParams actionParams = this.actionParams;
        if (actionParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionParams.writeToParcel(parcel, i);
        }
        ButtonStyle buttonStyle = this.style;
        if (buttonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonStyle.name());
        }
        parcel.writeString(this.target);
        parcel.writeString(this.width);
        parcel.writeString(this.widthWeight);
        CtaIcon ctaIcon = this.icon;
        if (ctaIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaIcon.writeToParcel(parcel, i);
        }
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.enabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.closeVerifyCenter;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.playbook);
        ButtonDialogData buttonDialogData = this.dialog;
        if (buttonDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonDialogData.writeToParcel(parcel, i);
        }
        ToastModel toastModel = this.toast;
        if (toastModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            toastModel.writeToParcel(parcel, i);
        }
        DynamicTitle dynamicTitle = this.dynamicText;
        if (dynamicTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicTitle.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.loadingInDialog;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.backgroundColor);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTAButton> serializer() {
            return CTAButton$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CTAButton(int i, String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, Boolean bool4, String str8, ButtonDialogData buttonDialogData, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool5, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = buttonAction;
        }
        if ((i & 4) == 0) {
            this.actionParams = null;
        } else {
            this.actionParams = actionParams;
        }
        this.style = (i & 8) == 0 ? ButtonStyle.Primary : buttonStyle;
        if ((i & 16) == 0) {
            this.target = null;
        } else {
            this.target = str2;
        }
        if ((i & 32) == 0) {
            this.width = null;
        } else {
            this.width = str3;
        }
        if ((i & 64) == 0) {
            this.widthWeight = null;
        } else {
            this.widthWeight = str4;
        }
        if ((i & 128) == 0) {
            this.icon = null;
        } else {
            this.icon = ctaIcon;
        }
        if ((i & 256) == 0) {
            this.align = null;
        } else {
            this.align = uIAlignment;
        }
        this.id = (i & 512) == 0 ? "" : str5;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool;
        if ((i & 2048) == 0) {
            this.version = null;
        } else {
            this.version = str6;
        }
        if ((i & 4096) == 0) {
            this.value = null;
        } else {
            this.value = str7;
        }
        if ((i & 8192) == 0) {
            this.bottomMargin = null;
        } else {
            this.bottomMargin = f;
        }
        if ((i & 16384) == 0) {
            this.leftMargin = null;
        } else {
            this.leftMargin = f2;
        }
        this.isHidden = (32768 & i) == 0 ? Boolean.FALSE : bool2;
        this.enabled = (65536 & i) == 0 ? Boolean.TRUE : bool3;
        this.closeVerifyCenter = (131072 & i) == 0 ? Boolean.TRUE : bool4;
        if ((262144 & i) == 0) {
            this.playbook = null;
        } else {
            this.playbook = str8;
        }
        if ((524288 & i) == 0) {
            this.dialog = null;
        } else {
            this.dialog = buttonDialogData;
        }
        if ((1048576 & i) == 0) {
            this.toast = null;
        } else {
            this.toast = toastModel;
        }
        if ((2097152 & i) == 0) {
            this.dynamicText = null;
        } else {
            this.dynamicText = dynamicTitle;
        }
        this.loadingInDialog = (4194304 & i) == 0 ? Boolean.FALSE : bool5;
        if ((i & 8388608) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str9;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent.write$Self(com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void KWHzl(CTAButton cTAButton, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(cTAButton, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cTAButton.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cTAButton.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || cTAButton.action != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, C43712ruU.KWHzl, cTAButton.action);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || cTAButton.actionParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ActionParams$$serializer.INSTANCE, cTAButton.actionParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTAButton.style != ButtonStyle.Primary) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43772rvb.copydefault, cTAButton.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cTAButton.target != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cTAButton.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cTAButton.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cTAButton.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cTAButton.widthWeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cTAButton.widthWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cTAButton.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CtaIcon$$serializer.INSTANCE, cTAButton.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || cTAButton.align != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, C43788rvr.KWHzl, cTAButton.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) cTAButton.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, cTAButton.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(cTAButton.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, cTAButton.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || cTAButton.getVersion() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, cTAButton.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || cTAButton.getValue() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, cTAButton.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || cTAButton.getBottomMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, cTAButton.getBottomMargin());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || cTAButton.getLeftMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, cTAButton.getLeftMargin());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(cTAButton.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, cTAButton.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(cTAButton.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, cTAButton.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(cTAButton.closeVerifyCenter, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, cTAButton.closeVerifyCenter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || cTAButton.playbook != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, cTAButton.playbook);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || cTAButton.dialog != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, ButtonDialogData$$serializer.INSTANCE, cTAButton.dialog);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || cTAButton.toast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, ToastModel$$serializer.INSTANCE, cTAButton.toast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || cTAButton.dynamicText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, DynamicTitle$$serializer.INSTANCE, cTAButton.dynamicText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(cTAButton.loadingInDialog, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, cTAButton.loadingInDialog);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) && cTAButton.backgroundColor == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, cTAButton.backgroundColor);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0112: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction:?: TERNARY null = ((wrap:int:0x000a: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams:?: TERNARY null = ((wrap:int:0x0012: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x001a: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] (LINE:1374) com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle.Primary com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon:?: TERNARY null = ((wrap:int:0x003b: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon) : (r33v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0043: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r34v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r50v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x006d: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r39v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0075: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r40v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0080: ARITH (r50v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0084: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x008b: ARITH (r50v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008f: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r42v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0096: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r43v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData) : (r45v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel:?: TERNARY null = ((wrap:int:0x00b7: ARITH (r50v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel) : (r46v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle:?: TERNARY null = ((wrap:int:0x00c2: ARITH (r50v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle) : (r47v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00cd: ARITH (r50v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00d1: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r48v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d8: ARITH (r50v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.Boolean, java.lang.String):void (m)] (LINE:1370) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CTAButton(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, Boolean bool4, String str8, ButtonDialogData buttonDialogData, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool5, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : buttonAction, (i & 4) != 0 ? null : actionParams, (i & 8) != 0 ? ButtonStyle.Primary : buttonStyle, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : ctaIcon, (i & 256) != 0 ? null : uIAlignment, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? Boolean.FALSE : bool, (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : f, (i & 16384) != 0 ? null : f2, (i & 32768) != 0 ? Boolean.FALSE : bool2, (i & 65536) != 0 ? Boolean.TRUE : bool3, (i & 131072) != 0 ? Boolean.TRUE : bool4, (i & 262144) != 0 ? null : str8, (i & 524288) != 0 ? null : buttonDialogData, (i & 1048576) != 0 ? null : toastModel, (i & 2097152) != 0 ? null : dynamicTitle, (i & 4194304) != 0 ? Boolean.FALSE : bool5, (i & 8388608) != 0 ? null : str9);
    }

    public CTAButton(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, Boolean bool4, String str8, ButtonDialogData buttonDialogData, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool5, String str9) {
        super(null);
        this.text = str;
        this.action = buttonAction;
        this.actionParams = actionParams;
        this.style = buttonStyle;
        this.target = str2;
        this.width = str3;
        this.widthWeight = str4;
        this.icon = ctaIcon;
        this.align = uIAlignment;
        this.id = str5;
        this.required = bool;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
        this.enabled = bool3;
        this.closeVerifyCenter = bool4;
        this.playbook = str8;
        this.dialog = buttonDialogData;
        this.toast = toastModel;
        this.dynamicText = dynamicTitle;
        this.loadingInDialog = bool5;
        this.backgroundColor = str9;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public CTAButtonAppModel toAppModel() {
        String str = this.text;
        ButtonAction buttonAction = this.action;
        ActionParams actionParams = this.actionParams;
        ButtonStyle buttonStyle = this.style;
        if (buttonStyle == null) {
            buttonStyle = ButtonStyle.Primary;
        }
        ButtonStyle buttonStyle2 = buttonStyle;
        String str2 = this.target;
        String str3 = this.width;
        String str4 = this.widthWeight;
        CtaIcon ctaIcon = this.icon;
        UIAlignment uIAlignment = this.align;
        String id = getId();
        if (id == null) {
            id = "";
        }
        String str5 = id;
        Boolean required = getRequired();
        boolean zBooleanValue = required != null ? required.booleanValue() : false;
        String version = getVersion();
        String value = getValue();
        Float bottomMargin = getBottomMargin();
        Float leftMargin = getLeftMargin();
        Boolean boolIsHidden = isHidden();
        Boolean bool = this.enabled;
        Boolean bool2 = this.closeVerifyCenter;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        String str6 = this.playbook;
        ButtonDialogData buttonDialogData = this.dialog;
        return new CTAButtonAppModel(str, buttonAction, actionParams, buttonStyle2, str2, str3, str4, ctaIcon, uIAlignment, str5, Boolean.valueOf(zBooleanValue), version, value, bottomMargin, leftMargin, boolIsHidden, bool, zBooleanValue2, str6, buttonDialogData != null ? C43780rvj.copydefault(buttonDialogData) : null, this.toast, this.dynamicText, this.loadingInDialog, this.backgroundColor, (Boolean) null, (String) null, 50331648, (DefaultConstructorMarker) null);
    }
}
