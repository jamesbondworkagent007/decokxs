package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import o.C43712ruU;
import o.C43772rvb;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CTAButtonAppModel extends UIComponentAppModel implements Parcelable {
    private final ButtonAction action;
    private ActionParams actionParams;
    private final UIAlignment align;
    private final String backgroundColor;
    private Float bottomMargin;
    private final boolean closeVerifyCenter;
    private ButtonDialog dialog;
    private final DynamicTitle dynamicText;
    private final Boolean enabled;
    private final CtaIcon icon;
    private String id;
    private String infoFormId;
    private Boolean isDelete;
    private Boolean isHidden;
    private final Float leftMargin;
    private Boolean loadingInDialog;
    private String playbook;
    private final Boolean required;
    private final ButtonStyle style;
    private final String target;
    private final String text;
    private final ToastModel toast;
    private String value;
    private final String version;
    private final String width;
    private final String widthWeight;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CTAButtonAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CTAButtonAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CTAButtonAppModel createFromParcel(Parcel parcel) {
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
            boolean z = parcel.readInt() != 0;
            String string8 = parcel.readString();
            ButtonDialog buttonDialogCreateFromParcel = parcel.readInt() == 0 ? null : ButtonDialog.CREATOR.createFromParcel(parcel);
            ToastModel toastModelCreateFromParcel = parcel.readInt() == 0 ? null : ToastModel.CREATOR.createFromParcel(parcel);
            DynamicTitle dynamicTitleCreateFromParcel = parcel.readInt() == 0 ? null : DynamicTitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CTAButtonAppModel(string, buttonActionValueOf, actionParamsCreateFromParcel, buttonStyleValueOf, string2, string3, string4, ctaIconCreateFromParcel, uIAlignmentValueOf, string5, boolValueOf, string6, string7, fValueOf, fValueOf2, boolValueOf2, boolValueOf3, z, string8, buttonDialogCreateFromParcel, toastModelCreateFromParcel, dynamicTitleCreateFromParcel, boolValueOf4, string9, boolValueOf5, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CTAButtonAppModel[] newArray(int i) {
            return new CTAButtonAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CTAButtonAppModel copy$default(CTAButtonAppModel cTAButtonAppModel, String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, boolean z, String str8, ButtonDialog buttonDialog, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool4, String str9, Boolean bool5, String str10, int i, Object obj) {
        return cTAButtonAppModel.copy((i & 1) != 0 ? cTAButtonAppModel.text : str, (i & 2) != 0 ? cTAButtonAppModel.action : buttonAction, (i & 4) != 0 ? cTAButtonAppModel.actionParams : actionParams, (i & 8) != 0 ? cTAButtonAppModel.style : buttonStyle, (i & 16) != 0 ? cTAButtonAppModel.target : str2, (i & 32) != 0 ? cTAButtonAppModel.width : str3, (i & 64) != 0 ? cTAButtonAppModel.widthWeight : str4, (i & 128) != 0 ? cTAButtonAppModel.icon : ctaIcon, (i & 256) != 0 ? cTAButtonAppModel.align : uIAlignment, (i & 512) != 0 ? cTAButtonAppModel.id : str5, (i & 1024) != 0 ? cTAButtonAppModel.required : bool, (i & 2048) != 0 ? cTAButtonAppModel.version : str6, (i & 4096) != 0 ? cTAButtonAppModel.value : str7, (i & 8192) != 0 ? cTAButtonAppModel.bottomMargin : f, (i & 16384) != 0 ? cTAButtonAppModel.leftMargin : f2, (i & 32768) != 0 ? cTAButtonAppModel.isHidden : bool2, (i & 65536) != 0 ? cTAButtonAppModel.enabled : bool3, (i & 131072) != 0 ? cTAButtonAppModel.closeVerifyCenter : z, (i & 262144) != 0 ? cTAButtonAppModel.playbook : str8, (i & 524288) != 0 ? cTAButtonAppModel.dialog : buttonDialog, (i & 1048576) != 0 ? cTAButtonAppModel.toast : toastModel, (i & 2097152) != 0 ? cTAButtonAppModel.dynamicText : dynamicTitle, (i & 4194304) != 0 ? cTAButtonAppModel.loadingInDialog : bool4, (i & 8388608) != 0 ? cTAButtonAppModel.backgroundColor : str9, (i & 16777216) != 0 ? cTAButtonAppModel.isDelete : bool5, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? cTAButtonAppModel.infoFormId : str10);
    }

    @Serializable(with = C43712ruU.class)
    public static /* synthetic */ void getAction$annotations() {
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    @Serializable(with = C43772rvb.class)
    public static /* synthetic */ void getStyle$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
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
    public final Boolean component16() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component18() {
        return this.closeVerifyCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonAction component2() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog component20() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToastModel component21() {
        return this.toast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicTitle component22() {
        return this.dynamicText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component23() {
        return this.loadingInDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component25() {
        return this.isDelete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.infoFormId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionParams component3() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle component4() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.widthWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaIcon component8() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component9() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel copy(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, @NotNull String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, boolean z, String str8, ButtonDialog buttonDialog, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool4, String str9, Boolean bool5, String str10) {
        Intrinsics.checkNotNullParameter(str5, "");
        return new CTAButtonAppModel(str, buttonAction, actionParams, buttonStyle, str2, str3, str4, ctaIcon, uIAlignment, str5, bool, str6, str7, f, f2, bool2, bool3, z, str8, buttonDialog, toastModel, dynamicTitle, bool4, str9, bool5, str10);
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
        if (!(obj instanceof CTAButtonAppModel)) {
            return false;
        }
        CTAButtonAppModel cTAButtonAppModel = (CTAButtonAppModel) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) cTAButtonAppModel.text) && this.action == cTAButtonAppModel.action && Intrinsics.EZpvd(this.actionParams, cTAButtonAppModel.actionParams) && this.style == cTAButtonAppModel.style && Intrinsics.EZpvd((Object) this.target, (Object) cTAButtonAppModel.target) && Intrinsics.EZpvd((Object) this.width, (Object) cTAButtonAppModel.width) && Intrinsics.EZpvd((Object) this.widthWeight, (Object) cTAButtonAppModel.widthWeight) && Intrinsics.EZpvd(this.icon, cTAButtonAppModel.icon) && this.align == cTAButtonAppModel.align && Intrinsics.EZpvd((Object) this.id, (Object) cTAButtonAppModel.id) && Intrinsics.EZpvd(this.required, cTAButtonAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) cTAButtonAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) cTAButtonAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, cTAButtonAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, cTAButtonAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, cTAButtonAppModel.isHidden) && Intrinsics.EZpvd(this.enabled, cTAButtonAppModel.enabled) && this.closeVerifyCenter == cTAButtonAppModel.closeVerifyCenter && Intrinsics.EZpvd((Object) this.playbook, (Object) cTAButtonAppModel.playbook) && Intrinsics.EZpvd(this.dialog, cTAButtonAppModel.dialog) && Intrinsics.EZpvd(this.toast, cTAButtonAppModel.toast) && Intrinsics.EZpvd(this.dynamicText, cTAButtonAppModel.dynamicText) && Intrinsics.EZpvd(this.loadingInDialog, cTAButtonAppModel.loadingInDialog) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) cTAButtonAppModel.backgroundColor) && Intrinsics.EZpvd(this.isDelete, cTAButtonAppModel.isDelete) && Intrinsics.EZpvd((Object) this.infoFormId, (Object) cTAButtonAppModel.infoFormId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonAction getAction() {
        return this.action;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionParams getActionParams() {
        return this.actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getAlign() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCloseVerifyCenter() {
        return this.closeVerifyCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog getDialog() {
        return this.dialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicTitle getDynamicText() {
        return this.dynamicText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaIcon getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInfoFormId() {
        return this.infoFormId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLoadingInDialog() {
        return this.loadingInDialog;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaybook() {
        return this.playbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToastModel getToast() {
        return this.toast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidthWeight() {
        return this.widthWeight;
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
        int iHashCode10 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        String str5 = this.version;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        Float f = this.bottomMargin;
        int iHashCode14 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode15 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode16 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.enabled;
        int iHashCode17 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode18 = Boolean.hashCode(this.closeVerifyCenter);
        String str7 = this.playbook;
        int iHashCode19 = str7 == null ? 0 : str7.hashCode();
        ButtonDialog buttonDialog = this.dialog;
        int iHashCode20 = buttonDialog == null ? 0 : buttonDialog.hashCode();
        ToastModel toastModel = this.toast;
        int iHashCode21 = toastModel == null ? 0 : toastModel.hashCode();
        DynamicTitle dynamicTitle = this.dynamicText;
        int iHashCode22 = dynamicTitle == null ? 0 : dynamicTitle.hashCode();
        Boolean bool4 = this.loadingInDialog;
        int iHashCode23 = bool4 == null ? 0 : bool4.hashCode();
        String str8 = this.backgroundColor;
        int iHashCode24 = str8 == null ? 0 : str8.hashCode();
        Boolean bool5 = this.isDelete;
        int iHashCode25 = bool5 == null ? 0 : bool5.hashCode();
        String str9 = this.infoFormId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (str9 == null ? 0 : str9.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDelete() {
        return this.isDelete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActionParams(ActionParams actionParams) {
        this.actionParams = actionParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setBottomMargin(Float f) {
        this.bottomMargin = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDelete(Boolean bool) {
        this.isDelete = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDialog(ButtonDialog buttonDialog) {
        this.dialog = buttonDialog;
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
    public final void setInfoFormId(String str) {
        this.infoFormId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadingInDialog(Boolean bool) {
        this.loadingInDialog = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybook(String str) {
        this.playbook = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CTAButtonAppModel(text=" + this.text + ", action=" + this.action + ", actionParams=" + this.actionParams + ", style=" + this.style + ", target=" + this.target + ", width=" + this.width + ", widthWeight=" + this.widthWeight + ", icon=" + this.icon + ", align=" + this.align + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ", enabled=" + this.enabled + ", closeVerifyCenter=" + this.closeVerifyCenter + ", playbook=" + this.playbook + ", dialog=" + this.dialog + ", toast=" + this.toast + ", dynamicText=" + this.dynamicText + ", loadingInDialog=" + this.loadingInDialog + ", backgroundColor=" + this.backgroundColor + ", isDelete=" + this.isDelete + ", infoFormId=" + this.infoFormId + ")";
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
        parcel.writeInt(this.closeVerifyCenter ? 1 : 0);
        parcel.writeString(this.playbook);
        ButtonDialog buttonDialog = this.dialog;
        if (buttonDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonDialog.writeToParcel(parcel, i);
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
        Boolean bool4 = this.loadingInDialog;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.backgroundColor);
        Boolean bool5 = this.isDelete;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.infoFormId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CTAButtonAppModel> serializer() {
            return CTAButtonAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CTAButtonAppModel(int i, String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, boolean z, String str8, ButtonDialog buttonDialog, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool4, String str9, Boolean bool5, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (817414 != (i & 817414)) {
            PluginExceptionsKt.throwMissingFieldException(i, 817414, CTAButtonAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        this.action = buttonAction;
        this.actionParams = actionParams;
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
        this.align = uIAlignment;
        this.id = (i & 512) == 0 ? "" : str5;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (32768 & i) == 0 ? Boolean.FALSE : bool2;
        this.enabled = (65536 & i) == 0 ? Boolean.TRUE : bool3;
        this.closeVerifyCenter = (131072 & i) == 0 ? true : z;
        this.playbook = str8;
        this.dialog = buttonDialog;
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
        this.loadingInDialog = (4194304 & i) == 0 ? Boolean.FALSE : bool4;
        if ((8388608 & i) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str9;
        }
        this.isDelete = (16777216 & i) == 0 ? Boolean.FALSE : bool5;
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.infoFormId = null;
        } else {
            this.infoFormId = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CTAButtonAppModel cTAButtonAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(cTAButtonAppModel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || cTAButtonAppModel.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, cTAButtonAppModel.text);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, C43712ruU.KWHzl, cTAButtonAppModel.action);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ActionParams$$serializer.INSTANCE, cTAButtonAppModel.actionParams);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || cTAButtonAppModel.style != ButtonStyle.Primary) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, C43772rvb.copydefault, cTAButtonAppModel.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || cTAButtonAppModel.target != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, cTAButtonAppModel.target);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || cTAButtonAppModel.width != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, cTAButtonAppModel.width);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || cTAButtonAppModel.widthWeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, cTAButtonAppModel.widthWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || cTAButtonAppModel.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CtaIcon$$serializer.INSTANCE, cTAButtonAppModel.icon);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, C43788rvr.KWHzl, cTAButtonAppModel.align);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) cTAButtonAppModel.getId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, cTAButtonAppModel.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(cTAButtonAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, cTAButtonAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, cTAButtonAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, cTAButtonAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, cTAButtonAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, cTAButtonAppModel.getLeftMargin());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(cTAButtonAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, cTAButtonAppModel.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(cTAButtonAppModel.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, cTAButtonAppModel.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !cTAButtonAppModel.closeVerifyCenter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, cTAButtonAppModel.closeVerifyCenter);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, cTAButtonAppModel.playbook);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, ButtonDialog$$serializer.INSTANCE, cTAButtonAppModel.dialog);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || cTAButtonAppModel.toast != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, ToastModel$$serializer.INSTANCE, cTAButtonAppModel.toast);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || cTAButtonAppModel.dynamicText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, DynamicTitle$$serializer.INSTANCE, cTAButtonAppModel.dynamicText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(cTAButtonAppModel.loadingInDialog, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, BooleanSerializer.INSTANCE, cTAButtonAppModel.loadingInDialog);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || cTAButtonAppModel.backgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, cTAButtonAppModel.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd(cTAButtonAppModel.isDelete, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, BooleanSerializer.INSTANCE, cTAButtonAppModel.isDelete);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && cTAButtonAppModel.infoFormId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, stringSerializer, cTAButtonAppModel.infoFormId);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r57v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (r32v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction)
  (r33v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle:?: TERNARY null = ((wrap:int:0x000b: ARITH (r57v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: SGET  A[WRAPPED] (LINE:1432) com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle.Primary com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle) : (r34v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r57v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r57v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r57v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon:?: TERNARY null = ((wrap:int:0x002d: ARITH (r57v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon) : (r38v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon))
  (r39v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r57v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r57v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
  (r42v0 java.lang.String)
  (r43v0 java.lang.String)
  (r44v0 java.lang.Float)
  (r45v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (32768 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r46v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0058: ARITH (65536 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r47v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (131072 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? true : (r48v0 boolean))
  (r49v0 java.lang.String)
  (r50v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel:?: TERNARY null = ((wrap:int:0x006f: ARITH (1048576 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel) : (r51v0 com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle:?: TERNARY null = ((wrap:int:0x0079: ARITH (2097152 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle) : (r52v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0083: ARITH (4194304 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0088: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r53v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (8388608 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0099: ARITH (16777216 int) & (r57v0 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r55v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r57v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:1428) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction, com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonStyle, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaIcon, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean, java.lang.Boolean, boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog, com.okinc.ok_kyc_core.data.remote.networkmodel.ToastModel, com.okinc.ok_kyc_core.data.remote.networkmodel.DynamicTitle, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CTAButtonAppModel(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, boolean z, String str8, ButtonDialog buttonDialog, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool4, String str9, Boolean bool5, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, buttonAction, actionParams, (i & 8) != 0 ? ButtonStyle.Primary : buttonStyle, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : ctaIcon, uIAlignment, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? Boolean.FALSE : bool, str6, str7, f, f2, (32768 & i) != 0 ? Boolean.FALSE : bool2, (65536 & i) != 0 ? Boolean.TRUE : bool3, (131072 & i) != 0 ? true : z, str8, buttonDialog, (1048576 & i) != 0 ? null : toastModel, (2097152 & i) != 0 ? null : dynamicTitle, (4194304 & i) != 0 ? Boolean.FALSE : bool4, (8388608 & i) != 0 ? null : str9, (16777216 & i) != 0 ? Boolean.FALSE : bool5, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CTAButtonAppModel(String str, ButtonAction buttonAction, ActionParams actionParams, ButtonStyle buttonStyle, String str2, String str3, String str4, CtaIcon ctaIcon, UIAlignment uIAlignment, @NotNull String str5, Boolean bool, String str6, String str7, Float f, Float f2, Boolean bool2, Boolean bool3, boolean z, String str8, ButtonDialog buttonDialog, ToastModel toastModel, DynamicTitle dynamicTitle, Boolean bool4, String str9, Boolean bool5, String str10) {
        super(null);
        Intrinsics.checkNotNullParameter(str5, "");
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
        this.closeVerifyCenter = z;
        this.playbook = str8;
        this.dialog = buttonDialog;
        this.toast = toastModel;
        this.dynamicText = dynamicTitle;
        this.loadingInDialog = bool4;
        this.backgroundColor = str9;
        this.isDelete = bool5;
        this.infoFormId = str10;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public CTAButtonAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 67108863, null);
    }
}
