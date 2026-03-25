package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
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
import o.C43747rvC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("edit-card")
@Serializable
public final class EditCard extends UIComponent {
    private Float bottomMargin;
    private final JsonArray contentList;
    private final Cta cta;
    private final CTAButton ctaArrow;
    private final String errorMsg;
    private final String icon;
    private final String iconHeight;
    private final String iconRenderColor;
    private final String iconWidth;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final FreetextStep step;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditCard> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EditCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCard createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            FreetextStep freetextStepCreateFromParcel = parcel.readInt() == 0 ? null : FreetextStep.CREATOR.createFromParcel(parcel);
            JsonArray jsonArray = (JsonArray) parcel.readValue(EditCard.class.getClassLoader());
            Cta cta = (Cta) parcel.readParcelable(EditCard.class.getClassLoader());
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EditCard(string, string2, string3, string4, string5, freetextStepCreateFromParcel, jsonArray, cta, cTAButtonCreateFromParcel, string6, boolValueOf, string7, string8, boolValueOf2, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCard[] newArray(int i) {
            return new EditCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
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
    public final Boolean component14() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component15() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component16() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.iconWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconRenderColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreetextStep component6() {
        return this.step;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component7() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component8() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component9() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCard copy(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, @NotNull JsonArray jsonArray, Cta cta, CTAButton cTAButton, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        return new EditCard(str, str2, str3, str4, str5, freetextStep, jsonArray, cta, cTAButton, str6, bool, str7, str8, bool2, f, f2);
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
        if (!(obj instanceof EditCard)) {
            return false;
        }
        EditCard editCard = (EditCard) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) editCard.icon) && Intrinsics.EZpvd((Object) this.iconHeight, (Object) editCard.iconHeight) && Intrinsics.EZpvd((Object) this.iconWidth, (Object) editCard.iconWidth) && Intrinsics.EZpvd((Object) this.iconRenderColor, (Object) editCard.iconRenderColor) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) editCard.errorMsg) && Intrinsics.EZpvd(this.step, editCard.step) && Intrinsics.EZpvd(this.contentList, editCard.contentList) && Intrinsics.EZpvd(this.cta, editCard.cta) && Intrinsics.EZpvd(this.ctaArrow, editCard.ctaArrow) && Intrinsics.EZpvd((Object) this.id, (Object) editCard.id) && Intrinsics.EZpvd(this.required, editCard.required) && Intrinsics.EZpvd((Object) this.version, (Object) editCard.version) && Intrinsics.EZpvd((Object) this.value, (Object) editCard.value) && Intrinsics.EZpvd(this.isHidden, editCard.isHidden) && Intrinsics.EZpvd(this.bottomMargin, editCard.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, editCard.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getContentList() {
        return this.contentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCtaArrow() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconHeight() {
        return this.iconHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconRenderColor() {
        return this.iconRenderColor;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreetextStep getStep() {
        return this.step;
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
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.iconHeight;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.iconWidth;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.iconRenderColor;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.errorMsg;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        FreetextStep freetextStep = this.step;
        int iHashCode6 = freetextStep == null ? 0 : freetextStep.hashCode();
        int iHashCode7 = this.contentList.hashCode();
        Cta cta = this.cta;
        int iHashCode8 = cta == null ? 0 : cta.hashCode();
        CTAButton cTAButton = this.ctaArrow;
        int iHashCode9 = cTAButton == null ? 0 : cTAButton.hashCode();
        String str6 = this.id;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.required;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        String str7 = this.version;
        int iHashCode12 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.value;
        int iHashCode13 = str8 == null ? 0 : str8.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode14 = bool2 == null ? 0 : bool2.hashCode();
        Float f = this.bottomMargin;
        int iHashCode15 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (f2 == null ? 0 : f2.hashCode());
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
        return "EditCard(icon=" + this.icon + ", iconHeight=" + this.iconHeight + ", iconWidth=" + this.iconWidth + ", iconRenderColor=" + this.iconRenderColor + ", errorMsg=" + this.errorMsg + ", step=" + this.step + ", contentList=" + this.contentList + ", cta=" + this.cta + ", ctaArrow=" + this.ctaArrow + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeString(this.iconHeight);
        parcel.writeString(this.iconWidth);
        parcel.writeString(this.iconRenderColor);
        parcel.writeString(this.errorMsg);
        FreetextStep freetextStep = this.step;
        if (freetextStep == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            freetextStep.writeToParcel(parcel, i);
        }
        parcel.writeValue(this.contentList);
        parcel.writeParcelable(this.cta, i);
        CTAButton cTAButton = this.ctaArrow;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditCard> serializer() {
            return EditCard$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditCard(int i, String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, JsonArray jsonArray, Cta cta, CTAButton cTAButton, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (55360 != (i & 55360)) {
            PluginExceptionsKt.throwMissingFieldException(i, 55360, EditCard$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.icon = null;
        } else {
            this.icon = str;
        }
        if ((i & 2) == 0) {
            this.iconHeight = null;
        } else {
            this.iconHeight = str2;
        }
        if ((i & 4) == 0) {
            this.iconWidth = null;
        } else {
            this.iconWidth = str3;
        }
        if ((i & 8) == 0) {
            this.iconRenderColor = null;
        } else {
            this.iconRenderColor = str4;
        }
        if ((i & 16) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str5;
        }
        if ((i & 32) == 0) {
            this.step = null;
        } else {
            this.step = freetextStep;
        }
        this.contentList = jsonArray;
        if ((i & 128) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 256) == 0) {
            this.ctaArrow = null;
        } else {
            this.ctaArrow = cTAButton;
        }
        this.id = (i & 512) == 0 ? "" : str6;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool;
        this.version = str7;
        this.value = str8;
        this.isHidden = (i & 8192) == 0 ? Boolean.FALSE : bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(EditCard editCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(editCard, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || editCard.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, editCard.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || editCard.iconHeight != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, editCard.iconHeight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || editCard.iconWidth != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, editCard.iconWidth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || editCard.iconRenderColor != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, editCard.iconRenderColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || editCard.errorMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, editCard.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || editCard.step != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, FreetextStep$$serializer.INSTANCE, editCard.step);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, JsonArraySerializer.INSTANCE, editCard.contentList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || editCard.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, Cta$$serializer.INSTANCE, editCard.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || editCard.ctaArrow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, CTAButton$$serializer.INSTANCE, editCard.ctaArrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) editCard.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, editCard.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(editCard.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, editCard.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, editCard.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, editCard.getValue());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(editCard.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, editCard.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, editCard.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, editCard.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep))
  (r27v0 kotlinx.serialization.json.JsonArray)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0033: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r28v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x003b: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r29v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004d: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r31v0 java.lang.Boolean))
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0057: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (r35v0 java.lang.Float)
  (r36v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:4665) call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.FreetextStep, kotlinx.serialization.json.JsonArray, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ EditCard(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, JsonArray jsonArray, Cta cta, CTAButton cTAButton, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : freetextStep, jsonArray, (i & 128) != 0 ? null : cta, (i & 256) != 0 ? null : cTAButton, (i & 512) != 0 ? "" : str6, (i & 1024) != 0 ? Boolean.FALSE : bool, str7, str8, (i & 8192) != 0 ? Boolean.FALSE : bool2, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditCard(String str, String str2, String str3, String str4, String str5, FreetextStep freetextStep, @NotNull JsonArray jsonArray, Cta cta, CTAButton cTAButton, String str6, Boolean bool, String str7, String str8, Boolean bool2, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        this.icon = str;
        this.iconHeight = str2;
        this.iconWidth = str3;
        this.iconRenderColor = str4;
        this.errorMsg = str5;
        this.step = freetextStep;
        this.contentList = jsonArray;
        this.cta = cta;
        this.ctaArrow = cTAButton;
        this.id = str6;
        this.required = bool;
        this.version = str7;
        this.value = str8;
        this.isHidden = bool2;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public EditCardAppModel toAppModel() {
        String str = this.icon;
        String str2 = this.iconHeight;
        String str3 = this.iconWidth;
        String str4 = this.iconRenderColor;
        String str5 = this.errorMsg;
        FreetextStep freetextStep = this.step;
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.contentList);
        Cta cta = this.cta;
        CtaAppModel appModel = cta != null ? cta.toAppModel() : null;
        CTAButton cTAButton = this.ctaArrow;
        CTAButtonAppModel appModel2 = cTAButton != null ? cTAButton.toAppModel() : null;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new EditCardAppModel(str, str2, str3, str4, str5, freetextStep, listCopydefault, appModel, appModel2, id, getRequired(), getVersion(), getValue(), isHidden(), getBottomMargin(), getLeftMargin());
    }
}
