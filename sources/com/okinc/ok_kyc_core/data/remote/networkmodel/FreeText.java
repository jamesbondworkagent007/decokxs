package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43780rvj;
import o.C43788rvr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("free-text")
@Serializable
public final class FreeText extends UIComponent implements Parcelable {
    private final UIAlignment align;
    private final String backgroundColor;
    private Float bottomMargin;
    private final Integer fontSize;
    private final String fontWeight;
    private final String icon;
    private final String iconDarkUrl;
    private final String iconHeight;
    private final String iconPosition;
    private final String iconRenderColor;
    private final String iconUrl;
    private final String iconWidth;
    private final String id;
    private final Boolean isBold;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Float lineHeight;
    private final Boolean required;
    private final RichTextContentData richContent;
    private final FreetextStep step;
    private final UIAlignment textAlign;
    private final String textColor;
    private final String textContent;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FreeText> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FreeText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeText createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            RichTextContentData richTextContentDataCreateFromParcel = parcel.readInt() == 0 ? null : RichTextContentData.CREATOR.createFromParcel(parcel);
            FreetextStep freetextStepCreateFromParcel = parcel.readInt() == 0 ? null : FreetextStep.CREATOR.createFromParcel(parcel);
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UIAlignment uIAlignmentValueOf = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            UIAlignment uIAlignmentValueOf2 = parcel.readInt() == 0 ? null : UIAlignment.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FreeText(string, string2, string3, string4, string5, string6, string7, string8, string9, richTextContentDataCreateFromParcel, freetextStepCreateFromParcel, string10, string11, numValueOf, string12, fValueOf, boolValueOf, uIAlignmentValueOf, uIAlignmentValueOf2, boolValueOf2, string13, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeText[] newArray(int i) {
            return new FreeText[i];
        }
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getAlign$annotations() {
    }

    @Serializable(with = C43788rvr.class)
    public static /* synthetic */ void getTextAlign$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextContentData component10() {
        return this.richContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreetextStep component11() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.fontWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component16() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component17() {
        return this.isBold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component18() {
        return this.align;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment component19() {
        return this.textAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component20() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component22() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component25() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component26() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconRenderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconDarkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.iconWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.iconPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.textContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText copy(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RichTextContentData richTextContentData, FreetextStep freetextStep, String str10, String str11, Integer num, String str12, Float f, Boolean bool, UIAlignment uIAlignment, UIAlignment uIAlignment2, Boolean bool2, String str13, Boolean bool3, String str14, String str15, Float f2, Float f3) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FreeText(str, str2, str3, str4, str5, str6, str7, str8, str9, richTextContentData, freetextStep, str10, str11, num, str12, f, bool, uIAlignment, uIAlignment2, bool2, str13, bool3, str14, str15, f2, f3);
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
        if (!(obj instanceof FreeText)) {
            return false;
        }
        FreeText freeText = (FreeText) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) freeText.type) && Intrinsics.EZpvd((Object) this.icon, (Object) freeText.icon) && Intrinsics.EZpvd((Object) this.iconRenderColor, (Object) freeText.iconRenderColor) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) freeText.iconUrl) && Intrinsics.EZpvd((Object) this.iconDarkUrl, (Object) freeText.iconDarkUrl) && Intrinsics.EZpvd((Object) this.iconHeight, (Object) freeText.iconHeight) && Intrinsics.EZpvd((Object) this.iconWidth, (Object) freeText.iconWidth) && Intrinsics.EZpvd((Object) this.iconPosition, (Object) freeText.iconPosition) && Intrinsics.EZpvd((Object) this.textContent, (Object) freeText.textContent) && Intrinsics.EZpvd(this.richContent, freeText.richContent) && Intrinsics.EZpvd(this.step, freeText.step) && Intrinsics.EZpvd((Object) this.textColor, (Object) freeText.textColor) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) freeText.backgroundColor) && Intrinsics.EZpvd(this.fontSize, freeText.fontSize) && Intrinsics.EZpvd((Object) this.fontWeight, (Object) freeText.fontWeight) && Intrinsics.EZpvd(this.lineHeight, freeText.lineHeight) && Intrinsics.EZpvd(this.isBold, freeText.isBold) && this.align == freeText.align && this.textAlign == freeText.textAlign && Intrinsics.EZpvd(this.isHidden, freeText.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) freeText.id) && Intrinsics.EZpvd(this.required, freeText.required) && Intrinsics.EZpvd((Object) this.version, (Object) freeText.version) && Intrinsics.EZpvd((Object) this.value, (Object) freeText.value) && Intrinsics.EZpvd(this.bottomMargin, freeText.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, freeText.leftMargin);
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFontWeight() {
        return this.fontWeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDarkUrl() {
        return this.iconDarkUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconHeight() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconPosition() {
        return this.iconPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconRenderColor() {
        return this.iconRenderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconWidth() {
        return this.iconWidth;
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
    public final Float getLineHeight() {
        return this.lineHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RichTextContentData getRichContent() {
        return this.richContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreetextStep getStep() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIAlignment getTextAlign() {
        return this.textAlign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextColor() {
        return this.textColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTextContent() {
        return this.textContent;
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
        String str = this.icon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.iconRenderColor;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconDarkUrl;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.iconHeight;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.iconWidth;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.iconPosition;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.textContent;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        RichTextContentData richTextContentData = this.richContent;
        int iHashCode10 = richTextContentData == null ? 0 : richTextContentData.hashCode();
        FreetextStep freetextStep = this.step;
        int iHashCode11 = freetextStep == null ? 0 : freetextStep.hashCode();
        String str9 = this.textColor;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.backgroundColor;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        Integer num = this.fontSize;
        int iHashCode14 = num == null ? 0 : num.hashCode();
        String str11 = this.fontWeight;
        int iHashCode15 = str11 == null ? 0 : str11.hashCode();
        Float f = this.lineHeight;
        int iHashCode16 = f == null ? 0 : f.hashCode();
        Boolean bool = this.isBold;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        UIAlignment uIAlignment = this.align;
        int iHashCode18 = uIAlignment == null ? 0 : uIAlignment.hashCode();
        UIAlignment uIAlignment2 = this.textAlign;
        int iHashCode19 = uIAlignment2 == null ? 0 : uIAlignment2.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode20 = bool2 == null ? 0 : bool2.hashCode();
        String str12 = this.id;
        int iHashCode21 = str12 == null ? 0 : str12.hashCode();
        Boolean bool3 = this.required;
        int iHashCode22 = bool3 == null ? 0 : bool3.hashCode();
        String str13 = this.version;
        int iHashCode23 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.value;
        int iHashCode24 = str14 == null ? 0 : str14.hashCode();
        Float f2 = this.bottomMargin;
        int iHashCode25 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.leftMargin;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (f3 == null ? 0 : f3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBold() {
        return this.isBold;
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
        return "FreeText(type=" + this.type + ", icon=" + this.icon + ", iconRenderColor=" + this.iconRenderColor + ", iconUrl=" + this.iconUrl + ", iconDarkUrl=" + this.iconDarkUrl + ", iconHeight=" + this.iconHeight + ", iconWidth=" + this.iconWidth + ", iconPosition=" + this.iconPosition + ", textContent=" + this.textContent + ", richContent=" + this.richContent + ", step=" + this.step + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", fontSize=" + this.fontSize + ", fontWeight=" + this.fontWeight + ", lineHeight=" + this.lineHeight + ", isBold=" + this.isBold + ", align=" + this.align + ", textAlign=" + this.textAlign + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.icon);
        parcel.writeString(this.iconRenderColor);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.iconDarkUrl);
        parcel.writeString(this.iconHeight);
        parcel.writeString(this.iconWidth);
        parcel.writeString(this.iconPosition);
        parcel.writeString(this.textContent);
        RichTextContentData richTextContentData = this.richContent;
        if (richTextContentData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            richTextContentData.writeToParcel(parcel, i);
        }
        FreetextStep freetextStep = this.step;
        if (freetextStep == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freetextStep.writeToParcel(parcel, i);
        }
        parcel.writeString(this.textColor);
        parcel.writeString(this.backgroundColor);
        Integer num = this.fontSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.fontWeight);
        Float f = this.lineHeight;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Boolean bool = this.isBold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UIAlignment uIAlignment = this.align;
        if (uIAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment.name());
        }
        UIAlignment uIAlignment2 = this.textAlign;
        if (uIAlignment2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(uIAlignment2.name());
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
        Float f2 = this.bottomMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.leftMargin;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FreeText> serializer() {
            return FreeText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FreeText(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RichTextContentData richTextContentData, FreetextStep freetextStep, String str10, String str11, Integer num, String str12, Float f, Boolean bool, UIAlignment uIAlignment, UIAlignment uIAlignment2, Boolean bool2, String str13, Boolean bool3, String str14, String str15, Float f2, Float f3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, FreeText$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.icon = null;
        } else {
            this.icon = str2;
        }
        if ((i & 4) == 0) {
            this.iconRenderColor = null;
        } else {
            this.iconRenderColor = str3;
        }
        if ((i & 8) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str4;
        }
        if ((i & 16) == 0) {
            this.iconDarkUrl = null;
        } else {
            this.iconDarkUrl = str5;
        }
        if ((i & 32) == 0) {
            this.iconHeight = null;
        } else {
            this.iconHeight = str6;
        }
        if ((i & 64) == 0) {
            this.iconWidth = null;
        } else {
            this.iconWidth = str7;
        }
        if ((i & 128) == 0) {
            this.iconPosition = null;
        } else {
            this.iconPosition = str8;
        }
        if ((i & 256) == 0) {
            this.textContent = null;
        } else {
            this.textContent = str9;
        }
        if ((i & 512) == 0) {
            this.richContent = null;
        } else {
            this.richContent = richTextContentData;
        }
        if ((i & 1024) == 0) {
            this.step = null;
        } else {
            this.step = freetextStep;
        }
        if ((i & 2048) == 0) {
            this.textColor = null;
        } else {
            this.textColor = str10;
        }
        if ((i & 4096) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = str11;
        }
        if ((i & 8192) == 0) {
            this.fontSize = null;
        } else {
            this.fontSize = num;
        }
        if ((i & 16384) == 0) {
            this.fontWeight = null;
        } else {
            this.fontWeight = str12;
        }
        if ((32768 & i) == 0) {
            this.lineHeight = null;
        } else {
            this.lineHeight = f;
        }
        this.isBold = (65536 & i) == 0 ? Boolean.FALSE : bool;
        this.align = (131072 & i) == 0 ? UIAlignment.Leading : uIAlignment;
        if ((262144 & i) == 0) {
            this.textAlign = null;
        } else {
            this.textAlign = uIAlignment2;
        }
        this.isHidden = (524288 & i) == 0 ? Boolean.FALSE : bool2;
        if ((1048576 & i) == 0) {
            this.id = null;
        } else {
            this.id = str13;
        }
        this.required = (2097152 & i) == 0 ? Boolean.FALSE : bool3;
        if ((4194304 & i) == 0) {
            this.version = null;
        } else {
            this.version = str14;
        }
        if ((8388608 & i) == 0) {
            this.value = null;
        } else {
            this.value = str15;
        }
        if ((16777216 & i) == 0) {
            this.bottomMargin = null;
        } else {
            this.bottomMargin = f2;
        }
        if ((i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0) {
            this.leftMargin = null;
        } else {
            this.leftMargin = f3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(FreeText freeText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(freeText, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, freeText.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || freeText.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, freeText.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || freeText.iconRenderColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, freeText.iconRenderColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || freeText.iconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, freeText.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || freeText.iconDarkUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, freeText.iconDarkUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || freeText.iconHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, freeText.iconHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || freeText.iconWidth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, freeText.iconWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || freeText.iconPosition != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, freeText.iconPosition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || freeText.textContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, freeText.textContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || freeText.richContent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, RichTextContentData$$serializer.INSTANCE, freeText.richContent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || freeText.step != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FreetextStep$$serializer.INSTANCE, freeText.step);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || freeText.textColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, freeText.textColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || freeText.backgroundColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, freeText.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || freeText.fontSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, freeText.fontSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || freeText.fontWeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, freeText.fontWeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || freeText.lineHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, FloatSerializer.INSTANCE, freeText.lineHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(freeText.isBold, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.INSTANCE, freeText.isBold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || freeText.align != UIAlignment.Leading) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, C43788rvr.KWHzl, freeText.align);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || freeText.textAlign != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, C43788rvr.KWHzl, freeText.textAlign);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd(freeText.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.INSTANCE, freeText.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || freeText.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, freeText.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(freeText.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, BooleanSerializer.INSTANCE, freeText.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || freeText.getVersion() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, freeText.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || freeText.getValue() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, freeText.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || freeText.getBottomMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, FloatSerializer.INSTANCE, freeText.getBottomMargin());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) && freeText.getLeftMargin() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, FloatSerializer.INSTANCE, freeText.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0121: CONSTRUCTOR 
  (r28v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r54v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r54v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r54v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r54v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r54v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r54v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r54v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r54v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData:?: TERNARY null = ((wrap:int:0x0043: ARITH (r54v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData) : (r37v0 com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep:?: TERNARY null = ((wrap:int:0x004b: ARITH (r54v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep) : (r38v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r54v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r54v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0063: ARITH (r54v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r54v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0076: ARITH (r54v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r43v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0081: ARITH (r54v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0085: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r44v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x008c: ARITH (r54v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0090: SGET  A[WRAPPED] (LINE:2018) com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment.Leading com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r45v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment:?: TERNARY null = ((wrap:int:0x0097: ARITH (r54v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment) : (r46v0 com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00a2: ARITH (r54v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a6: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r47v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r54v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r54v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00bc: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r49v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r54v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r54v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x00d9: ARITH (r54v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r52v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x00e4: ARITH (r54v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) == (0 int)) ? (r53v0 java.lang.Float) : (null java.lang.Float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Float, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2000) call: com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.RichTextContentData, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Float, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, com.okinc.ok_kyc_core.data.remote.networkmodel.UIAlignment, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ FreeText(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RichTextContentData richTextContentData, FreetextStep freetextStep, String str10, String str11, Integer num, String str12, Float f, Boolean bool, UIAlignment uIAlignment, UIAlignment uIAlignment2, Boolean bool2, String str13, Boolean bool3, String str14, String str15, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : richTextContentData, (i & 1024) != 0 ? null : freetextStep, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : num, (i & 16384) != 0 ? null : str12, (i & 32768) != 0 ? null : f, (i & 65536) != 0 ? Boolean.FALSE : bool, (i & 131072) != 0 ? UIAlignment.Leading : uIAlignment, (i & 262144) != 0 ? null : uIAlignment2, (i & 524288) != 0 ? Boolean.FALSE : bool2, (i & 1048576) != 0 ? null : str13, (i & 2097152) != 0 ? Boolean.FALSE : bool3, (i & 4194304) != 0 ? null : str14, (i & 8388608) != 0 ? null : str15, (i & 16777216) != 0 ? null : f2, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? f3 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeText(@NotNull String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, RichTextContentData richTextContentData, FreetextStep freetextStep, String str10, String str11, Integer num, String str12, Float f, Boolean bool, UIAlignment uIAlignment, UIAlignment uIAlignment2, Boolean bool2, String str13, Boolean bool3, String str14, String str15, Float f2, Float f3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.icon = str2;
        this.iconRenderColor = str3;
        this.iconUrl = str4;
        this.iconDarkUrl = str5;
        this.iconHeight = str6;
        this.iconWidth = str7;
        this.iconPosition = str8;
        this.textContent = str9;
        this.richContent = richTextContentData;
        this.step = freetextStep;
        this.textColor = str10;
        this.backgroundColor = str11;
        this.fontSize = num;
        this.fontWeight = str12;
        this.lineHeight = f;
        this.isBold = bool;
        this.align = uIAlignment;
        this.textAlign = uIAlignment2;
        this.isHidden = bool2;
        this.id = str13;
        this.required = bool3;
        this.version = str14;
        this.value = str15;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public FreeTextAppModel toAppModel() {
        String str = this.type;
        String str2 = this.icon;
        String str3 = this.iconRenderColor;
        String str4 = this.iconUrl;
        String str5 = this.iconDarkUrl;
        String str6 = this.iconHeight;
        String str7 = this.iconWidth;
        String str8 = this.iconPosition;
        String str9 = this.textContent;
        RichTextContentData richTextContentData = this.richContent;
        RichTextContent richTextContentAEQbTJ = richTextContentData != null ? C43780rvj.AEQbTJ(richTextContentData) : null;
        FreetextStep freetextStep = this.step;
        String str10 = this.textColor;
        String str11 = this.backgroundColor;
        Integer num = this.fontSize;
        String str12 = this.fontWeight;
        Float f = this.lineHeight;
        Boolean bool = this.isBold;
        UIAlignment uIAlignment = this.align;
        UIAlignment uIAlignment2 = this.textAlign;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new FreeTextAppModel(str, str2, str3, str4, str5, str6, str7, str8, str9, richTextContentAEQbTJ, freetextStep, str10, str11, num, str12, f, bool, uIAlignment, uIAlignment2, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
