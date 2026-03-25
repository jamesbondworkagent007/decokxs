package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43716ruY;
import o.C43747rvC;
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("generic-popup")
@Serializable
public final class CommonPopUp extends UIComponent implements Parcelable {
    private Boolean allowClose;
    private Float bottomMargin;
    private final CtaPopUpData cta;
    private final Cta ctaModel;
    private final FreeText dialogBottomText;
    private final String iconState;
    private final String id;
    private final Boolean isDismissable;
    private Boolean isHidden;
    private final JsonArray items;
    private final Float leftMargin;
    private final DialogStyle position;
    private final Boolean required;
    private final Boolean shouldShowCloseButton;
    private final String subtitle;
    private final String title;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CommonPopUp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CommonPopUp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPopUp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf5 = null;
            DialogStyle dialogStyleValueOf = parcel.readInt() == 0 ? null : DialogStyle.valueOf(parcel.readString());
            Cta cta = (Cta) parcel.readParcelable(CommonPopUp.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CtaPopUpData ctaPopUpDataCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUpData.CREATOR.createFromParcel(parcel);
            JsonArray jsonArray = (JsonArray) parcel.readValue(CommonPopUp.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            FreeText freeTextCreateFromParcel = parcel.readInt() == 0 ? null : FreeText.CREATOR.createFromParcel(parcel);
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
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CommonPopUp(dialogStyleValueOf, cta, string, string2, string3, string4, ctaPopUpDataCreateFromParcel, jsonArray, boolValueOf, freeTextCreateFromParcel, boolValueOf2, boolValueOf3, string5, boolValueOf4, string6, string7, fValueOf, fValueOf2, boolValueOf5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPopUp[] newArray(int i) {
            return new CommonPopUp[i];
        }
    }

    @Serializable(with = C43716ruY.class)
    public static /* synthetic */ void getPosition$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText component10() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isDismissable;
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
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component2() {
        return this.ctaModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component8() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonPopUp copy(DialogStyle dialogStyle, Cta cta, @NotNull String str, String str2, String str3, String str4, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool, FreeText freeText, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, Float f, Float f2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CommonPopUp(dialogStyle, cta, str, str2, str3, str4, ctaPopUpData, jsonArray, bool, freeText, bool2, bool3, str5, bool4, str6, str7, f, f2, bool5);
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
        if (!(obj instanceof CommonPopUp)) {
            return false;
        }
        CommonPopUp commonPopUp = (CommonPopUp) obj;
        return this.position == commonPopUp.position && Intrinsics.EZpvd(this.ctaModel, commonPopUp.ctaModel) && Intrinsics.EZpvd((Object) this.type, (Object) commonPopUp.type) && Intrinsics.EZpvd((Object) this.title, (Object) commonPopUp.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) commonPopUp.subtitle) && Intrinsics.EZpvd((Object) this.iconState, (Object) commonPopUp.iconState) && Intrinsics.EZpvd(this.cta, commonPopUp.cta) && Intrinsics.EZpvd(this.items, commonPopUp.items) && Intrinsics.EZpvd(this.shouldShowCloseButton, commonPopUp.shouldShowCloseButton) && Intrinsics.EZpvd(this.dialogBottomText, commonPopUp.dialogBottomText) && Intrinsics.EZpvd(this.allowClose, commonPopUp.allowClose) && Intrinsics.EZpvd(this.isDismissable, commonPopUp.isDismissable) && Intrinsics.EZpvd((Object) this.id, (Object) commonPopUp.id) && Intrinsics.EZpvd(this.required, commonPopUp.required) && Intrinsics.EZpvd((Object) this.version, (Object) commonPopUp.version) && Intrinsics.EZpvd((Object) this.value, (Object) commonPopUp.value) && Intrinsics.EZpvd(this.bottomMargin, commonPopUp.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, commonPopUp.leftMargin) && Intrinsics.EZpvd(this.isHidden, commonPopUp.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowClose() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta getCtaModel() {
        return this.ctaModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText getDialogBottomText() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconState() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldShowCloseButton() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
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
        DialogStyle dialogStyle = this.position;
        int iHashCode = dialogStyle == null ? 0 : dialogStyle.hashCode();
        Cta cta = this.ctaModel;
        int iHashCode2 = cta == null ? 0 : cta.hashCode();
        int iHashCode3 = this.type.hashCode();
        String str = this.title;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconState;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        CtaPopUpData ctaPopUpData = this.cta;
        int iHashCode7 = ctaPopUpData == null ? 0 : ctaPopUpData.hashCode();
        JsonArray jsonArray = this.items;
        int iHashCode8 = jsonArray == null ? 0 : jsonArray.hashCode();
        Boolean bool = this.shouldShowCloseButton;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        FreeText freeText = this.dialogBottomText;
        int iHashCode10 = freeText == null ? 0 : freeText.hashCode();
        Boolean bool2 = this.allowClose;
        int iHashCode11 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isDismissable;
        int iHashCode12 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.id;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        Boolean bool4 = this.required;
        int iHashCode14 = bool4 == null ? 0 : bool4.hashCode();
        String str5 = this.version;
        int iHashCode15 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode16 = str6 == null ? 0 : str6.hashCode();
        Float f = this.bottomMargin;
        int iHashCode17 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode18 = f2 == null ? 0 : f2.hashCode();
        Boolean bool5 = this.isHidden;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (bool5 == null ? 0 : bool5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDismissable() {
        return this.isDismissable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowClose(Boolean bool) {
        this.allowClose = bool;
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
        return "CommonPopUp(position=" + this.position + ", ctaModel=" + this.ctaModel + ", type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", iconState=" + this.iconState + ", cta=" + this.cta + ", items=" + this.items + ", shouldShowCloseButton=" + this.shouldShowCloseButton + ", dialogBottomText=" + this.dialogBottomText + ", allowClose=" + this.allowClose + ", isDismissable=" + this.isDismissable + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        DialogStyle dialogStyle = this.position;
        if (dialogStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dialogStyle.name());
        }
        parcel.writeParcelable(this.ctaModel, i);
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.iconState);
        CtaPopUpData ctaPopUpData = this.cta;
        if (ctaPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUpData.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.items);
        Boolean bool = this.shouldShowCloseButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        FreeText freeText = this.dialogBottomText;
        if (freeText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeText.writeToParcel(parcel, i);
        }
        Boolean bool2 = this.allowClose;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.isDismissable;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
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
        Boolean bool5 = this.isHidden;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonPopUp> serializer() {
            return CommonPopUp$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonPopUp(int i, DialogStyle dialogStyle, Cta cta, String str, String str2, String str3, String str4, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool, FreeText freeText, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, Float f, Float f2, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (249980 != (i & 249980)) {
            PluginExceptionsKt.throwMissingFieldException(i, 249980, CommonPopUp$$serializer.INSTANCE.getDescriptor());
        }
        this.position = (i & 1) == 0 ? DialogStyle.CENTER : dialogStyle;
        if ((i & 2) == 0) {
            this.ctaModel = null;
        } else {
            this.ctaModel = cta;
        }
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconState = str4;
        this.cta = ctaPopUpData;
        if ((i & 128) == 0) {
            this.items = null;
        } else {
            this.items = jsonArray;
        }
        if ((i & 256) == 0) {
            this.shouldShowCloseButton = null;
        } else {
            this.shouldShowCloseButton = bool;
        }
        if ((i & 512) == 0) {
            this.dialogBottomText = null;
        } else {
            this.dialogBottomText = freeText;
        }
        if ((i & 1024) == 0) {
            this.allowClose = null;
        } else {
            this.allowClose = bool2;
        }
        if ((i & 2048) == 0) {
            this.isDismissable = null;
        } else {
            this.isDismissable = bool3;
        }
        this.id = str5;
        this.required = (i & 8192) == 0 ? Boolean.FALSE : bool4;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 262144) == 0 ? Boolean.FALSE : bool5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CommonPopUp commonPopUp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(commonPopUp, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || commonPopUp.position != DialogStyle.CENTER) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, commonPopUp.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || commonPopUp.ctaModel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, commonPopUp.ctaModel);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, commonPopUp.type);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, commonPopUp.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, commonPopUp.subtitle);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, commonPopUp.iconState);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, commonPopUp.cta);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || commonPopUp.items != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, JsonArraySerializer.INSTANCE, commonPopUp.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || commonPopUp.shouldShowCloseButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, commonPopUp.shouldShowCloseButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || commonPopUp.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, FreeText$$serializer.INSTANCE, commonPopUp.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || commonPopUp.allowClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, commonPopUp.allowClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || commonPopUp.isDismissable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, commonPopUp.isDismissable);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, commonPopUp.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(commonPopUp.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, commonPopUp.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, commonPopUp.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, commonPopUp.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, commonPopUp.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, floatSerializer, commonPopUp.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && Intrinsics.EZpvd(commonPopUp.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BooleanSerializer.INSTANCE, commonPopUp.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006a: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:4771) com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle.CENTER com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData)
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x0015: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r30v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText:?: TERNARY null = ((wrap:int:0x0025: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText) : (r32v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (r35v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r36v0 java.lang.Boolean))
  (r37v0 java.lang.String)
  (r38v0 java.lang.String)
  (r39v0 java.lang.Float)
  (r40v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r41v0 java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, kotlinx.serialization.json.JsonArray, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4770) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUp.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, kotlinx.serialization.json.JsonArray, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ CommonPopUp(DialogStyle dialogStyle, Cta cta, String str, String str2, String str3, String str4, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool, FreeText freeText, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, Float f, Float f2, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DialogStyle.CENTER : dialogStyle, (i & 2) != 0 ? null : cta, str, str2, str3, str4, ctaPopUpData, (i & 128) != 0 ? null : jsonArray, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : freeText, (i & 1024) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3, str5, (i & 8192) != 0 ? Boolean.FALSE : bool4, str6, str7, f, f2, (i & 262144) != 0 ? Boolean.FALSE : bool5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPopUp(DialogStyle dialogStyle, Cta cta, @NotNull String str, String str2, String str3, String str4, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool, FreeText freeText, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, Float f, Float f2, Boolean bool5) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.position = dialogStyle;
        this.ctaModel = cta;
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconState = str4;
        this.cta = ctaPopUpData;
        this.items = jsonArray;
        this.shouldShowCloseButton = bool;
        this.dialogBottomText = freeText;
        this.allowClose = bool2;
        this.isDismissable = bool3;
        this.id = str5;
        this.required = bool4;
        this.version = str6;
        this.value = str7;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool5;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public CommonPopUpAppModel toAppModel() {
        List arrayList;
        DialogStyle dialogStyle = this.position;
        String str = this.type;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.iconState;
        CtaPopUpData ctaPopUpData = this.cta;
        CtaPopUp ctaPopUpKWHzl = ctaPopUpData != null ? C43780rvj.KWHzl(ctaPopUpData) : null;
        JsonArray jsonArray = this.items;
        if (jsonArray == null || (arrayList = C43747rvC.copydefault(jsonArray)) == null) {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        Boolean bool = this.shouldShowCloseButton;
        FreeText freeText = this.dialogBottomText;
        FreeTextAppModel appModel = freeText != null ? freeText.toAppModel() : null;
        Boolean bool2 = this.allowClose;
        Boolean bool3 = this.isDismissable;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new CommonPopUpAppModel(dialogStyle, str, str2, str3, str4, ctaPopUpKWHzl, list, bool, appModel, bool2, bool3, id, getRequired(), getVersion(), getValue());
    }
}
