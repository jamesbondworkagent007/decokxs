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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ButtonDialogData implements Parcelable {
    private Boolean allowClose;
    private final CtaPopUpData cta;
    private final FreeText dialogBottomText;
    private final DialogCheckbox dialogCheckbox;
    private final String entryPageId;
    private final Boolean isDismissable;
    private final Boolean isFullPage;
    private final JsonArray items;
    private final String pageId;
    private final DialogStyle position;
    private final Boolean shouldShowCloseButton;
    private final Boolean showOnPageLoad;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ButtonDialogData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ButtonDialogData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonDialogData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Intrinsics.checkNotNullParameter(parcel, "");
            DialogStyle dialogStyleValueOf = parcel.readInt() == 0 ? null : DialogStyle.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
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
            CtaPopUpData ctaPopUpDataCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUpData.CREATOR.createFromParcel(parcel);
            JsonArray jsonArray = (JsonArray) parcel.readValue(ButtonDialogData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            FreeText freeTextCreateFromParcel = parcel.readInt() == 0 ? null : FreeText.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DialogCheckbox dialogCheckboxCreateFromParcel = parcel.readInt() == 0 ? null : DialogCheckbox.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ButtonDialogData(dialogStyleValueOf, string, string2, string3, string4, boolValueOf, boolValueOf2, ctaPopUpDataCreateFromParcel, jsonArray, boolValueOf3, freeTextCreateFromParcel, boolValueOf4, dialogCheckboxCreateFromParcel, boolValueOf5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonDialogData[] newArray(int i) {
            return new ButtonDialogData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ButtonDialogData() {
        this((DialogStyle) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (CtaPopUpData) null, (JsonArray) null, (Boolean) null, (FreeText) null, (Boolean) null, (DialogCheckbox) null, (Boolean) null, 16383, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C43716ruY.class)
    public static /* synthetic */ void getPosition$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText component11() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCheckbox component13() {
        return this.dialogCheckbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component14() {
        return this.isDismissable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.entryPageId;
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
    public final Boolean component6() {
        return this.isFullPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.showOnPageLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData component8() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component9() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialogData copy(DialogStyle dialogStyle, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool3, FreeText freeText, Boolean bool4, DialogCheckbox dialogCheckbox, Boolean bool5) {
        return new ButtonDialogData(dialogStyle, str, str2, str3, str4, bool, bool2, ctaPopUpData, jsonArray, bool3, freeText, bool4, dialogCheckbox, bool5);
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
        if (!(obj instanceof ButtonDialogData)) {
            return false;
        }
        ButtonDialogData buttonDialogData = (ButtonDialogData) obj;
        return this.position == buttonDialogData.position && Intrinsics.EZpvd((Object) this.pageId, (Object) buttonDialogData.pageId) && Intrinsics.EZpvd((Object) this.entryPageId, (Object) buttonDialogData.entryPageId) && Intrinsics.EZpvd((Object) this.title, (Object) buttonDialogData.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) buttonDialogData.subtitle) && Intrinsics.EZpvd(this.isFullPage, buttonDialogData.isFullPage) && Intrinsics.EZpvd(this.showOnPageLoad, buttonDialogData.showOnPageLoad) && Intrinsics.EZpvd(this.cta, buttonDialogData.cta) && Intrinsics.EZpvd(this.items, buttonDialogData.items) && Intrinsics.EZpvd(this.allowClose, buttonDialogData.allowClose) && Intrinsics.EZpvd(this.dialogBottomText, buttonDialogData.dialogBottomText) && Intrinsics.EZpvd(this.shouldShowCloseButton, buttonDialogData.shouldShowCloseButton) && Intrinsics.EZpvd(this.dialogCheckbox, buttonDialogData.dialogCheckbox) && Intrinsics.EZpvd(this.isDismissable, buttonDialogData.isDismissable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowClose() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeText getDialogBottomText() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCheckbox getDialogCheckbox() {
        return this.dialogCheckbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPageId() {
        return this.entryPageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageId() {
        return this.pageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShouldShowCloseButton() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowOnPageLoad() {
        return this.showOnPageLoad;
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
    public int hashCode() {
        DialogStyle dialogStyle = this.position;
        int iHashCode = dialogStyle == null ? 0 : dialogStyle.hashCode();
        String str = this.pageId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.entryPageId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subtitle;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.isFullPage;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.showOnPageLoad;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        CtaPopUpData ctaPopUpData = this.cta;
        int iHashCode8 = ctaPopUpData == null ? 0 : ctaPopUpData.hashCode();
        JsonArray jsonArray = this.items;
        int iHashCode9 = jsonArray == null ? 0 : jsonArray.hashCode();
        Boolean bool3 = this.allowClose;
        int iHashCode10 = bool3 == null ? 0 : bool3.hashCode();
        FreeText freeText = this.dialogBottomText;
        int iHashCode11 = freeText == null ? 0 : freeText.hashCode();
        Boolean bool4 = this.shouldShowCloseButton;
        int iHashCode12 = bool4 == null ? 0 : bool4.hashCode();
        DialogCheckbox dialogCheckbox = this.dialogCheckbox;
        int iHashCode13 = dialogCheckbox == null ? 0 : dialogCheckbox.hashCode();
        Boolean bool5 = this.isDismissable;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bool5 != null ? bool5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDismissable() {
        return this.isDismissable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isFullPage() {
        return this.isFullPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowClose(Boolean bool) {
        this.allowClose = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ButtonDialogData(position=" + this.position + ", pageId=" + this.pageId + ", entryPageId=" + this.entryPageId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", isFullPage=" + this.isFullPage + ", showOnPageLoad=" + this.showOnPageLoad + ", cta=" + this.cta + ", items=" + this.items + ", allowClose=" + this.allowClose + ", dialogBottomText=" + this.dialogBottomText + ", shouldShowCloseButton=" + this.shouldShowCloseButton + ", dialogCheckbox=" + this.dialogCheckbox + ", isDismissable=" + this.isDismissable + ")";
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
        parcel.writeString(this.pageId);
        parcel.writeString(this.entryPageId);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Boolean bool = this.isFullPage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showOnPageLoad;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        CtaPopUpData ctaPopUpData = this.cta;
        if (ctaPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUpData.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.items);
        Boolean bool3 = this.allowClose;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        FreeText freeText = this.dialogBottomText;
        if (freeText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeText.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.shouldShowCloseButton;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        DialogCheckbox dialogCheckbox = this.dialogCheckbox;
        if (dialogCheckbox == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogCheckbox.writeToParcel(parcel, i);
        }
        Boolean bool5 = this.isDismissable;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ButtonDialogData> serializer() {
            return ButtonDialogData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ButtonDialogData(int i, DialogStyle dialogStyle, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool3, FreeText freeText, Boolean bool4, DialogCheckbox dialogCheckbox, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
        this.position = (i & 1) == 0 ? DialogStyle.CENTER : dialogStyle;
        if ((i & 2) == 0) {
            this.pageId = null;
        } else {
            this.pageId = str;
        }
        if ((i & 4) == 0) {
            this.entryPageId = null;
        } else {
            this.entryPageId = str2;
        }
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        this.subtitle = (i & 16) == 0 ? "" : str4;
        this.isFullPage = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.showOnPageLoad = (i & 64) == 0 ? Boolean.FALSE : bool2;
        if ((i & 128) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUpData;
        }
        if ((i & 256) == 0) {
            this.items = null;
        } else {
            this.items = jsonArray;
        }
        if ((i & 512) == 0) {
            this.allowClose = null;
        } else {
            this.allowClose = bool3;
        }
        if ((i & 1024) == 0) {
            this.dialogBottomText = null;
        } else {
            this.dialogBottomText = freeText;
        }
        if ((i & 2048) == 0) {
            this.shouldShowCloseButton = null;
        } else {
            this.shouldShowCloseButton = bool4;
        }
        if ((i & 4096) == 0) {
            this.dialogCheckbox = null;
        } else {
            this.dialogCheckbox = dialogCheckbox;
        }
        if ((i & 8192) == 0) {
            this.isDismissable = null;
        } else {
            this.isDismissable = bool5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ButtonDialogData buttonDialogData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buttonDialogData.position != DialogStyle.CENTER) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, buttonDialogData.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buttonDialogData.pageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buttonDialogData.pageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || buttonDialogData.entryPageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, buttonDialogData.entryPageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || buttonDialogData.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, buttonDialogData.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) buttonDialogData.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, buttonDialogData.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(buttonDialogData.isFullPage, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, buttonDialogData.isFullPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(buttonDialogData.showOnPageLoad, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, buttonDialogData.showOnPageLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || buttonDialogData.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, CtaPopUpData$$serializer.INSTANCE, buttonDialogData.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || buttonDialogData.items != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, JsonArraySerializer.INSTANCE, buttonDialogData.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || buttonDialogData.allowClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, buttonDialogData.allowClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || buttonDialogData.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, FreeText$$serializer.INSTANCE, buttonDialogData.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || buttonDialogData.shouldShowCloseButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, buttonDialogData.shouldShowCloseButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || buttonDialogData.dialogCheckbox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, DialogCheckbox$$serializer.INSTANCE, buttonDialogData.dialogCheckbox);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && buttonDialogData.isDismissable == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, buttonDialogData.isDismissable);
    }

    public ButtonDialogData(DialogStyle dialogStyle, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool3, FreeText freeText, Boolean bool4, DialogCheckbox dialogCheckbox, Boolean bool5) {
        this.position = dialogStyle;
        this.pageId = str;
        this.entryPageId = str2;
        this.title = str3;
        this.subtitle = str4;
        this.isFullPage = bool;
        this.showOnPageLoad = bool2;
        this.cta = ctaPopUpData;
        this.items = jsonArray;
        this.allowClose = bool3;
        this.dialogBottomText = freeText;
        this.shouldShowCloseButton = bool4;
        this.dialogCheckbox = dialogCheckbox;
        this.isDismissable = bool5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0094: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:1507) com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle.CENTER com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle) : (r16v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData:?: TERNARY null = ((wrap:int:0x003f: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x0047: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r24v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText:?: TERNARY null = ((wrap:int:0x0057: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox:?: TERNARY null = ((wrap:int:0x0067: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006f: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, kotlinx.serialization.json.JsonArray, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox, java.lang.Boolean):void (m)] (LINE:1505) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialogData.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, kotlinx.serialization.json.JsonArray, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeText, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckbox, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ButtonDialogData(DialogStyle dialogStyle, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, CtaPopUpData ctaPopUpData, JsonArray jsonArray, Boolean bool3, FreeText freeText, Boolean bool4, DialogCheckbox dialogCheckbox, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DialogStyle.CENTER : dialogStyle, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? Boolean.FALSE : bool2, (i & 128) != 0 ? null : ctaPopUpData, (i & 256) != 0 ? null : jsonArray, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : freeText, (i & 2048) != 0 ? null : bool4, (i & 4096) != 0 ? null : dialogCheckbox, (i & 8192) == 0 ? bool5 : null);
    }
}
