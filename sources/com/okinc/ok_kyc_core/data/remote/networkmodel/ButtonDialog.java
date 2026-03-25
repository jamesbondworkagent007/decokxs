package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class ButtonDialog implements Parcelable {
    private Boolean allowClose;
    private final CtaPopUp cta;
    private final FreeTextAppModel dialogBottomText;
    private final DialogCheckboxAppModel dialogCheckbox;
    private final String entryPageId;
    private final String iconState;
    private final Boolean isDismissable;
    private final Boolean isFullPage;
    private final List<UIComponentAppModel> items;
    private final String pageId;
    private final DialogStyle position;
    private final Boolean shouldShowCloseButton;
    private Boolean showOnPageLoad;
    private final String subtitle;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ButtonDialog> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<ButtonDialog> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonDialog createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            DialogStyle dialogStyleValueOf = parcel.readInt() == 0 ? null : DialogStyle.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            CtaPopUp ctaPopUpCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUp.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(ButtonDialog.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new ButtonDialog(dialogStyleValueOf, string, string2, string3, string4, string5, boolValueOf, boolValueOf2, ctaPopUpCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : FreeTextAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : DialogCheckboxAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ButtonDialog[] newArray(int i) {
            return new ButtonDialog[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ButtonDialog() {
        this((DialogStyle) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (CtaPopUp) null, (List) null, (Boolean) null, (FreeTextAppModel) null, (Boolean) null, (DialogCheckboxAppModel) null, (Boolean) null, 32767, (DefaultConstructorMarker) null);
    }

    @Serializable(with = C43716ruY.class)
    public static /* synthetic */ void getPosition$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle component1() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component10() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeTextAppModel component12() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCheckboxAppModel component14() {
        return this.dialogCheckbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
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
    public final String component6() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isFullPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.showOnPageLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp component9() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ButtonDialog copy(DialogStyle dialogStyle, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, CtaPopUp ctaPopUp, List<? extends UIComponentAppModel> list, Boolean bool3, FreeTextAppModel freeTextAppModel, Boolean bool4, DialogCheckboxAppModel dialogCheckboxAppModel, Boolean bool5) {
        return new ButtonDialog(dialogStyle, str, str2, str3, str4, str5, bool, bool2, ctaPopUp, list, bool3, freeTextAppModel, bool4, dialogCheckboxAppModel, bool5);
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
        if (!(obj instanceof ButtonDialog)) {
            return false;
        }
        ButtonDialog buttonDialog = (ButtonDialog) obj;
        return this.position == buttonDialog.position && Intrinsics.EZpvd((Object) this.pageId, (Object) buttonDialog.pageId) && Intrinsics.EZpvd((Object) this.entryPageId, (Object) buttonDialog.entryPageId) && Intrinsics.EZpvd((Object) this.title, (Object) buttonDialog.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) buttonDialog.subtitle) && Intrinsics.EZpvd((Object) this.iconState, (Object) buttonDialog.iconState) && Intrinsics.EZpvd(this.isFullPage, buttonDialog.isFullPage) && Intrinsics.EZpvd(this.showOnPageLoad, buttonDialog.showOnPageLoad) && Intrinsics.EZpvd(this.cta, buttonDialog.cta) && Intrinsics.EZpvd(this.items, buttonDialog.items) && Intrinsics.EZpvd(this.allowClose, buttonDialog.allowClose) && Intrinsics.EZpvd(this.dialogBottomText, buttonDialog.dialogBottomText) && Intrinsics.EZpvd(this.shouldShowCloseButton, buttonDialog.shouldShowCloseButton) && Intrinsics.EZpvd(this.dialogCheckbox, buttonDialog.dialogCheckbox) && Intrinsics.EZpvd(this.isDismissable, buttonDialog.isDismissable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAllowClose() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeTextAppModel getDialogBottomText() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogCheckboxAppModel getDialogCheckbox() {
        return this.dialogCheckbox;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEntryPageId() {
        return this.entryPageId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconState() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getItems() {
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
        String str5 = this.iconState;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.isFullPage;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.showOnPageLoad;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        CtaPopUp ctaPopUp = this.cta;
        int iHashCode9 = ctaPopUp == null ? 0 : ctaPopUp.hashCode();
        List<UIComponentAppModel> list = this.items;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        Boolean bool3 = this.allowClose;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        int iHashCode12 = freeTextAppModel == null ? 0 : freeTextAppModel.hashCode();
        Boolean bool4 = this.shouldShowCloseButton;
        int iHashCode13 = bool4 == null ? 0 : bool4.hashCode();
        DialogCheckboxAppModel dialogCheckboxAppModel = this.dialogCheckbox;
        int iHashCode14 = dialogCheckboxAppModel == null ? 0 : dialogCheckboxAppModel.hashCode();
        Boolean bool5 = this.isDismissable;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (bool5 == null ? 0 : bool5.hashCode());
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
    public final void setShowOnPageLoad(Boolean bool) {
        this.showOnPageLoad = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ButtonDialog(position=" + this.position + ", pageId=" + this.pageId + ", entryPageId=" + this.entryPageId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", iconState=" + this.iconState + ", isFullPage=" + this.isFullPage + ", showOnPageLoad=" + this.showOnPageLoad + ", cta=" + this.cta + ", items=" + this.items + ", allowClose=" + this.allowClose + ", dialogBottomText=" + this.dialogBottomText + ", shouldShowCloseButton=" + this.shouldShowCloseButton + ", dialogCheckbox=" + this.dialogCheckbox + ", isDismissable=" + this.isDismissable + ")";
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
        parcel.writeString(this.iconState);
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
        CtaPopUp ctaPopUp = this.cta;
        if (ctaPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUp.writeToParcel(parcel, i);
        }
        List<UIComponentAppModel> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<UIComponentAppModel> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }
        Boolean bool3 = this.allowClose;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        if (freeTextAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeTextAppModel.writeToParcel(parcel, i);
        }
        Boolean bool4 = this.shouldShowCloseButton;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        DialogCheckboxAppModel dialogCheckboxAppModel = this.dialogCheckbox;
        if (dialogCheckboxAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogCheckboxAppModel.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ButtonDialog> serializer() {
            return ButtonDialog$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ButtonDialog(int i, DialogStyle dialogStyle, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, CtaPopUp ctaPopUp, List list, Boolean bool3, FreeTextAppModel freeTextAppModel, Boolean bool4, DialogCheckboxAppModel dialogCheckboxAppModel, Boolean bool5, SerializationConstructorMarker serializationConstructorMarker) {
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
        if ((i & 32) == 0) {
            this.iconState = null;
        } else {
            this.iconState = str5;
        }
        this.isFullPage = (i & 64) == 0 ? Boolean.FALSE : bool;
        this.showOnPageLoad = (i & 128) == 0 ? Boolean.FALSE : bool2;
        if ((i & 256) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUp;
        }
        if ((i & 512) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
        if ((i & 1024) == 0) {
            this.allowClose = null;
        } else {
            this.allowClose = bool3;
        }
        if ((i & 2048) == 0) {
            this.dialogBottomText = null;
        } else {
            this.dialogBottomText = freeTextAppModel;
        }
        if ((i & 4096) == 0) {
            this.shouldShowCloseButton = null;
        } else {
            this.shouldShowCloseButton = bool4;
        }
        if ((i & 8192) == 0) {
            this.dialogCheckbox = null;
        } else {
            this.dialogCheckbox = dialogCheckboxAppModel;
        }
        if ((i & 16384) == 0) {
            this.isDismissable = null;
        } else {
            this.isDismissable = bool5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ButtonDialog buttonDialog, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || buttonDialog.position != DialogStyle.CENTER) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, buttonDialog.position);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buttonDialog.pageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, buttonDialog.pageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || buttonDialog.entryPageId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, buttonDialog.entryPageId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || buttonDialog.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, buttonDialog.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) buttonDialog.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, buttonDialog.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || buttonDialog.iconState != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, buttonDialog.iconState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(buttonDialog.isFullPage, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, buttonDialog.isFullPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(buttonDialog.showOnPageLoad, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, buttonDialog.showOnPageLoad);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || buttonDialog.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, CtaPopUp$$serializer.INSTANCE, buttonDialog.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || buttonDialog.items != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], buttonDialog.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || buttonDialog.allowClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, buttonDialog.allowClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || buttonDialog.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, FreeTextAppModel$$serializer.INSTANCE, buttonDialog.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || buttonDialog.shouldShowCloseButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, buttonDialog.shouldShowCloseButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || buttonDialog.dialogCheckbox != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, DialogCheckboxAppModel$$serializer.INSTANCE, buttonDialog.dialogCheckbox);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && buttonDialog.isDismissable == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, buttonDialog.isDismissable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonDialog(DialogStyle dialogStyle, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, CtaPopUp ctaPopUp, List<? extends UIComponentAppModel> list, Boolean bool3, FreeTextAppModel freeTextAppModel, Boolean bool4, DialogCheckboxAppModel dialogCheckboxAppModel, Boolean bool5) {
        this.position = dialogStyle;
        this.pageId = str;
        this.entryPageId = str2;
        this.title = str3;
        this.subtitle = str4;
        this.iconState = str5;
        this.isFullPage = bool;
        this.showOnPageLoad = bool2;
        this.cta = ctaPopUp;
        this.items = list;
        this.allowClose = bool3;
        this.dialogBottomText = freeTextAppModel;
        this.shouldShowCloseButton = bool4;
        this.dialogCheckbox = dialogCheckboxAppModel;
        this.isDismissable = bool5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009e: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:1528) com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle.CENTER com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0057: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel:?: TERNARY null = ((wrap:int:0x006f: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel) : (r30v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel, java.lang.Boolean):void (m)] (LINE:1526) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonDialog.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.util.List, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DialogCheckboxAppModel, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ButtonDialog(DialogStyle dialogStyle, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, CtaPopUp ctaPopUp, List list, Boolean bool3, FreeTextAppModel freeTextAppModel, Boolean bool4, DialogCheckboxAppModel dialogCheckboxAppModel, Boolean bool5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DialogStyle.CENTER : dialogStyle, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? Boolean.FALSE : bool2, (i & 256) != 0 ? null : ctaPopUp, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : bool3, (i & 2048) != 0 ? null : freeTextAppModel, (i & 4096) != 0 ? null : bool4, (i & 8192) != 0 ? null : dialogCheckboxAppModel, (i & 16384) == 0 ? bool5 : null);
    }
}
