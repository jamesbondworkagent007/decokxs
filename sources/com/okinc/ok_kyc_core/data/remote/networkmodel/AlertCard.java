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
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("alert-card")
@Serializable
public final class AlertCard extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final Boolean closable;
    private final Float cornerRadius;
    private final CtaPopUpData cta;
    private final CTAButton ctaArrow;
    private final String desc;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final Boolean showIcon;
    private final String style;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AlertCard> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AlertCard> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertCard createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
            CtaPopUpData ctaPopUpDataCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUpData.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AlertCard(string, string2, string3, boolValueOf, boolValueOf2, cTAButtonCreateFromParcel, ctaPopUpDataCreateFromParcel, fValueOf, boolValueOf3, string4, boolValueOf4, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertCard[] newArray(int i) {
            return new AlertCard[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AlertCard() {
        this((String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (CTAButton) null, (CtaPopUpData) null, (Float) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (String) null, (Float) null, (Float) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.style;
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
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.closable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.showIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component6() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertCard copy(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButton cTAButton, CtaPopUpData ctaPopUpData, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3) {
        return new AlertCard(str, str2, str3, bool, bool2, cTAButton, ctaPopUpData, f, bool3, str4, bool4, str5, str6, f2, f3);
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
        if (!(obj instanceof AlertCard)) {
            return false;
        }
        AlertCard alertCard = (AlertCard) obj;
        return Intrinsics.EZpvd((Object) this.style, (Object) alertCard.style) && Intrinsics.EZpvd((Object) this.title, (Object) alertCard.title) && Intrinsics.EZpvd((Object) this.desc, (Object) alertCard.desc) && Intrinsics.EZpvd(this.closable, alertCard.closable) && Intrinsics.EZpvd(this.showIcon, alertCard.showIcon) && Intrinsics.EZpvd(this.ctaArrow, alertCard.ctaArrow) && Intrinsics.EZpvd(this.cta, alertCard.cta) && Intrinsics.EZpvd(this.cornerRadius, alertCard.cornerRadius) && Intrinsics.EZpvd(this.isHidden, alertCard.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) alertCard.id) && Intrinsics.EZpvd(this.required, alertCard.required) && Intrinsics.EZpvd((Object) this.version, (Object) alertCard.version) && Intrinsics.EZpvd((Object) this.value, (Object) alertCard.value) && Intrinsics.EZpvd(this.bottomMargin, alertCard.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, alertCard.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getClosable() {
        return this.closable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getCornerRadius() {
        return this.cornerRadius;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCtaArrow() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
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
    public final Boolean getShowIcon() {
        return this.showIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
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
        String str = this.style;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.desc;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.closable;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.showIcon;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        CTAButton cTAButton = this.ctaArrow;
        int iHashCode6 = cTAButton == null ? 0 : cTAButton.hashCode();
        CtaPopUpData ctaPopUpData = this.cta;
        int iHashCode7 = ctaPopUpData == null ? 0 : ctaPopUpData.hashCode();
        Float f = this.cornerRadius;
        int iHashCode8 = f == null ? 0 : f.hashCode();
        Boolean bool3 = this.isHidden;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.id;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Boolean bool4 = this.required;
        int iHashCode11 = bool4 == null ? 0 : bool4.hashCode();
        String str5 = this.version;
        int iHashCode12 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.value;
        int iHashCode13 = str6 == null ? 0 : str6.hashCode();
        Float f2 = this.bottomMargin;
        int iHashCode14 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f3 == null ? 0 : f3.hashCode());
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
        return "AlertCard(style=" + this.style + ", title=" + this.title + ", desc=" + this.desc + ", closable=" + this.closable + ", showIcon=" + this.showIcon + ", ctaArrow=" + this.ctaArrow + ", cta=" + this.cta + ", cornerRadius=" + this.cornerRadius + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.style);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        Boolean bool = this.closable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showIcon;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        CTAButton cTAButton = this.ctaArrow;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
        CtaPopUpData ctaPopUpData = this.cta;
        if (ctaPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUpData.writeToParcel(parcel, i);
        }
        Float f = this.cornerRadius;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Boolean bool3 = this.isHidden;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertCard> serializer() {
            return AlertCard$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AlertCard(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButton cTAButton, CtaPopUpData ctaPopUpData, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if ((i & 1) == 0) {
            this.style = null;
        } else {
            this.style = str;
        }
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.desc = null;
        } else {
            this.desc = str3;
        }
        this.closable = (i & 8) == 0 ? Boolean.FALSE : bool;
        this.showIcon = (i & 16) == 0 ? Boolean.TRUE : bool2;
        if ((i & 32) == 0) {
            this.ctaArrow = null;
        } else {
            this.ctaArrow = cTAButton;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUpData;
        }
        if ((i & 128) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = f;
        }
        this.isHidden = (i & 256) == 0 ? Boolean.FALSE : bool3;
        if ((i & 512) == 0) {
            this.id = null;
        } else {
            this.id = str4;
        }
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool4;
        if ((i & 2048) == 0) {
            this.version = null;
        } else {
            this.version = str5;
        }
        if ((i & 4096) == 0) {
            this.value = null;
        } else {
            this.value = str6;
        }
        if ((i & 8192) == 0) {
            this.bottomMargin = null;
        } else {
            this.bottomMargin = f2;
        }
        if ((i & 16384) == 0) {
            this.leftMargin = null;
        } else {
            this.leftMargin = f3;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AlertCard alertCard, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(alertCard, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || alertCard.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, alertCard.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alertCard.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, alertCard.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertCard.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, alertCard.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(alertCard.closable, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, alertCard.closable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(alertCard.showIcon, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, alertCard.showIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || alertCard.ctaArrow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CTAButton$$serializer.INSTANCE, alertCard.ctaArrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || alertCard.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaPopUpData$$serializer.INSTANCE, alertCard.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || alertCard.cornerRadius != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, alertCard.cornerRadius);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(alertCard.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, alertCard.isHidden());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || alertCard.getId() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, alertCard.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(alertCard.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, alertCard.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || alertCard.getVersion() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, alertCard.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || alertCard.getValue() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, alertCard.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || alertCard.getBottomMargin() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, FloatSerializer.INSTANCE, alertCard.getBottomMargin());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && alertCard.getLeftMargin() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, alertCard.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0028: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r22v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r24v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005f: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x006f: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r30v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0077: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Float) : (null java.lang.Float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2234) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCard.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AlertCard(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButton cTAButton, CtaPopUpData ctaPopUpData, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.TRUE : bool2, (i & 32) != 0 ? null : cTAButton, (i & 64) != 0 ? null : ctaPopUpData, (i & 128) != 0 ? null : f, (i & 256) != 0 ? Boolean.FALSE : bool3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? Boolean.FALSE : bool4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : f2, (i & 16384) == 0 ? f3 : null);
    }

    public AlertCard(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButton cTAButton, CtaPopUpData ctaPopUpData, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3) {
        super(null);
        this.style = str;
        this.title = str2;
        this.desc = str3;
        this.closable = bool;
        this.showIcon = bool2;
        this.ctaArrow = cTAButton;
        this.cta = ctaPopUpData;
        this.cornerRadius = f;
        this.isHidden = bool3;
        this.id = str4;
        this.required = bool4;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AlertCardAppModel toAppModel() {
        String str = this.style;
        String str2 = this.title;
        String str3 = this.desc;
        Boolean bool = this.closable;
        Boolean bool2 = this.showIcon;
        CTAButton cTAButton = this.ctaArrow;
        CTAButtonAppModel appModel = cTAButton != null ? cTAButton.toAppModel() : null;
        CtaPopUpData ctaPopUpData = this.cta;
        CtaPopUp ctaPopUpKWHzl = ctaPopUpData != null ? C43780rvj.KWHzl(ctaPopUpData) : null;
        Float f = this.cornerRadius;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new AlertCardAppModel(str, str2, str3, bool, bool2, appModel, ctaPopUpKWHzl, f, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
