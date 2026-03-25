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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C43716ruY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class CommonPopUpAppModel extends PopUpComponentAppModel implements Parcelable {
    private Boolean allowClose;
    private final CtaPopUp cta;
    private final FreeTextAppModel dialogBottomText;
    private final String iconState;
    private final String id;
    private final Boolean isDismissable;
    private final List<UIComponentAppModel> items;
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
    public static final Parcelable.Creator<CommonPopUpAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(UIComponentAppModel.Companion.serializer()), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<CommonPopUpAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPopUpAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            DialogStyle dialogStyleValueOf = parcel.readInt() == 0 ? null : DialogStyle.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            CtaPopUp ctaPopUpCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUp.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CommonPopUpAppModel.class.getClassLoader()));
            }
            return new CommonPopUpAppModel(dialogStyleValueOf, string, string2, string3, string4, ctaPopUpCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : FreeTextAppModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CommonPopUpAppModel[] newArray(int i) {
            return new CommonPopUpAppModel[i];
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
    public final Boolean component10() {
        return this.allowClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isDismissable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp component6() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> component7() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.shouldShowCloseButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeTextAppModel component9() {
        return this.dialogBottomText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonPopUpAppModel copy(DialogStyle dialogStyle, @NotNull String str, String str2, String str3, String str4, CtaPopUp ctaPopUp, @NotNull List<? extends UIComponentAppModel> list, Boolean bool, FreeTextAppModel freeTextAppModel, Boolean bool2, Boolean bool3, @NotNull String str5, Boolean bool4, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new CommonPopUpAppModel(dialogStyle, str, str2, str3, str4, ctaPopUp, list, bool, freeTextAppModel, bool2, bool3, str5, bool4, str6, str7);
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
        if (!(obj instanceof CommonPopUpAppModel)) {
            return false;
        }
        CommonPopUpAppModel commonPopUpAppModel = (CommonPopUpAppModel) obj;
        return this.position == commonPopUpAppModel.position && Intrinsics.EZpvd((Object) this.type, (Object) commonPopUpAppModel.type) && Intrinsics.EZpvd((Object) this.title, (Object) commonPopUpAppModel.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) commonPopUpAppModel.subtitle) && Intrinsics.EZpvd((Object) this.iconState, (Object) commonPopUpAppModel.iconState) && Intrinsics.EZpvd(this.cta, commonPopUpAppModel.cta) && Intrinsics.EZpvd(this.items, commonPopUpAppModel.items) && Intrinsics.EZpvd(this.shouldShowCloseButton, commonPopUpAppModel.shouldShowCloseButton) && Intrinsics.EZpvd(this.dialogBottomText, commonPopUpAppModel.dialogBottomText) && Intrinsics.EZpvd(this.allowClose, commonPopUpAppModel.allowClose) && Intrinsics.EZpvd(this.isDismissable, commonPopUpAppModel.isDismissable) && Intrinsics.EZpvd((Object) this.id, (Object) commonPopUpAppModel.id) && Intrinsics.EZpvd(this.required, commonPopUpAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) commonPopUpAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) commonPopUpAppModel.value);
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
    public final String getIconState() {
        return this.iconState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UIComponentAppModel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DialogStyle getPosition() {
        return this.position;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        DialogStyle dialogStyle = this.position;
        int iHashCode = dialogStyle == null ? 0 : dialogStyle.hashCode();
        int iHashCode2 = this.type.hashCode();
        String str = this.title;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconState;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        CtaPopUp ctaPopUp = this.cta;
        int iHashCode6 = ctaPopUp == null ? 0 : ctaPopUp.hashCode();
        int iHashCode7 = this.items.hashCode();
        Boolean bool = this.shouldShowCloseButton;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        int iHashCode9 = freeTextAppModel == null ? 0 : freeTextAppModel.hashCode();
        Boolean bool2 = this.allowClose;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.isDismissable;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode12 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode13 = bool4 == null ? 0 : bool4.hashCode();
        String str4 = this.version;
        int iHashCode14 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str5 == null ? 0 : str5.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDismissable() {
        return this.isDismissable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowClose(Boolean bool) {
        this.allowClose = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonPopUpAppModel(position=" + this.position + ", type=" + this.type + ", title=" + this.title + ", subtitle=" + this.subtitle + ", iconState=" + this.iconState + ", cta=" + this.cta + ", items=" + this.items + ", shouldShowCloseButton=" + this.shouldShowCloseButton + ", dialogBottomText=" + this.dialogBottomText + ", allowClose=" + this.allowClose + ", isDismissable=" + this.isDismissable + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ")";
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
        parcel.writeString(this.type);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.iconState);
        CtaPopUp ctaPopUp = this.cta;
        if (ctaPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUp.writeToParcel(parcel, i);
        }
        List<UIComponentAppModel> list = this.items;
        parcel.writeInt(list.size());
        Iterator<UIComponentAppModel> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        Boolean bool = this.shouldShowCloseButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        FreeTextAppModel freeTextAppModel = this.dialogBottomText;
        if (freeTextAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freeTextAppModel.writeToParcel(parcel, i);
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUpAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CommonPopUpAppModel> serializer() {
            return CommonPopUpAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommonPopUpAppModel(int i, DialogStyle dialogStyle, String str, String str2, String str3, String str4, CtaPopUp ctaPopUp, List list, Boolean bool, FreeTextAppModel freeTextAppModel, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (26750 != (i & 26750)) {
            PluginExceptionsKt.throwMissingFieldException(i, 26750, CommonPopUpAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.position = (i & 1) == 0 ? DialogStyle.CENTER : dialogStyle;
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconState = str4;
        this.cta = ctaPopUp;
        this.items = list;
        if ((i & 128) == 0) {
            this.shouldShowCloseButton = null;
        } else {
            this.shouldShowCloseButton = bool;
        }
        if ((i & 256) == 0) {
            this.dialogBottomText = null;
        } else {
            this.dialogBottomText = freeTextAppModel;
        }
        if ((i & 512) == 0) {
            this.allowClose = null;
        } else {
            this.allowClose = bool2;
        }
        if ((i & 1024) == 0) {
            this.isDismissable = null;
        } else {
            this.isDismissable = bool3;
        }
        this.id = str5;
        this.required = (i & 4096) == 0 ? Boolean.FALSE : bool4;
        this.version = str6;
        this.value = str7;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel.write$Self(com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(CommonPopUpAppModel commonPopUpAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        PopUpComponentAppModel.write$Self(commonPopUpAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || commonPopUpAppModel.position != DialogStyle.CENTER) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, C43716ruY.KWHzl, commonPopUpAppModel.position);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, commonPopUpAppModel.type);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, commonPopUpAppModel.title);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, commonPopUpAppModel.subtitle);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, commonPopUpAppModel.iconState);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CtaPopUp$$serializer.INSTANCE, commonPopUpAppModel.cta);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], commonPopUpAppModel.items);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || commonPopUpAppModel.shouldShowCloseButton != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, commonPopUpAppModel.shouldShowCloseButton);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || commonPopUpAppModel.dialogBottomText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, FreeTextAppModel$$serializer.INSTANCE, commonPopUpAppModel.dialogBottomText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || commonPopUpAppModel.allowClose != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, commonPopUpAppModel.allowClose);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || commonPopUpAppModel.isDismissable != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, commonPopUpAppModel.isDismissable);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, commonPopUpAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(commonPopUpAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, commonPopUpAppModel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, commonPopUpAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, commonPopUpAppModel.getValue());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:4818) com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle.CENTER com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle))
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp)
  (r25v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r26v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel:?: TERNARY null = ((wrap:int:0x0015: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel) : (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (r30v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel>, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void (m)] (LINE:4817) call: com.okinc.ok_kyc_core.data.remote.networkmodel.CommonPopUpAppModel.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.DialogStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.util.List, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.FreeTextAppModel, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonPopUpAppModel(DialogStyle dialogStyle, String str, String str2, String str3, String str4, CtaPopUp ctaPopUp, List list, Boolean bool, FreeTextAppModel freeTextAppModel, Boolean bool2, Boolean bool3, String str5, Boolean bool4, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DialogStyle.CENTER : dialogStyle, str, str2, str3, str4, ctaPopUp, list, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? null : freeTextAppModel, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : bool3, str5, (i & 4096) != 0 ? Boolean.FALSE : bool4, str6, str7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommonPopUpAppModel(DialogStyle dialogStyle, @NotNull String str, String str2, String str3, String str4, CtaPopUp ctaPopUp, @NotNull List<? extends UIComponentAppModel> list, Boolean bool, FreeTextAppModel freeTextAppModel, Boolean bool2, Boolean bool3, @NotNull String str5, Boolean bool4, String str6, String str7) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.position = dialogStyle;
        this.type = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconState = str4;
        this.cta = ctaPopUp;
        this.items = list;
        this.shouldShowCloseButton = bool;
        this.dialogBottomText = freeTextAppModel;
        this.allowClose = bool2;
        this.isDismissable = bool3;
        this.id = str5;
        this.required = bool4;
        this.version = str6;
        this.value = str7;
    }
}
