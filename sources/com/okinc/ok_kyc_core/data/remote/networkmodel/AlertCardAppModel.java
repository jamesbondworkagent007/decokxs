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
public final class AlertCardAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Boolean closable;
    private final Float cornerRadius;
    private final CtaPopUp cta;
    private final CTAButtonAppModel ctaArrow;
    private final String desc;
    private String id;
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
    public static final Parcelable.Creator<AlertCardAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AlertCardAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertCardAppModel createFromParcel(Parcel parcel) {
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
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            CtaPopUp ctaPopUpCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUp.CREATOR.createFromParcel(parcel);
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
            return new AlertCardAppModel(string, string2, string3, boolValueOf, boolValueOf2, cTAButtonAppModelCreateFromParcel, ctaPopUpCreateFromParcel, fValueOf, boolValueOf3, string4, boolValueOf4, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlertCardAppModel[] newArray(int i) {
            return new AlertCardAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AlertCardAppModel copy$default(AlertCardAppModel alertCardAppModel, String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, CtaPopUp ctaPopUp, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3, int i, Object obj) {
        return alertCardAppModel.copy((i & 1) != 0 ? alertCardAppModel.style : str, (i & 2) != 0 ? alertCardAppModel.title : str2, (i & 4) != 0 ? alertCardAppModel.desc : str3, (i & 8) != 0 ? alertCardAppModel.closable : bool, (i & 16) != 0 ? alertCardAppModel.showIcon : bool2, (i & 32) != 0 ? alertCardAppModel.ctaArrow : cTAButtonAppModel, (i & 64) != 0 ? alertCardAppModel.cta : ctaPopUp, (i & 128) != 0 ? alertCardAppModel.cornerRadius : f, (i & 256) != 0 ? alertCardAppModel.isHidden : bool3, (i & 512) != 0 ? alertCardAppModel.id : str4, (i & 1024) != 0 ? alertCardAppModel.required : bool4, (i & 2048) != 0 ? alertCardAppModel.version : str5, (i & 4096) != 0 ? alertCardAppModel.value : str6, (i & 8192) != 0 ? alertCardAppModel.bottomMargin : f2, (i & 16384) != 0 ? alertCardAppModel.leftMargin : f3);
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
    public final CTAButtonAppModel component6() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp component7() {
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
    public final AlertCardAppModel copy(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, CtaPopUp ctaPopUp, Float f, Boolean bool3, @NotNull String str4, Boolean bool4, String str5, String str6, Float f2, Float f3) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new AlertCardAppModel(str, str2, str3, bool, bool2, cTAButtonAppModel, ctaPopUp, f, bool3, str4, bool4, str5, str6, f2, f3);
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
        if (!(obj instanceof AlertCardAppModel)) {
            return false;
        }
        AlertCardAppModel alertCardAppModel = (AlertCardAppModel) obj;
        return Intrinsics.EZpvd((Object) this.style, (Object) alertCardAppModel.style) && Intrinsics.EZpvd((Object) this.title, (Object) alertCardAppModel.title) && Intrinsics.EZpvd((Object) this.desc, (Object) alertCardAppModel.desc) && Intrinsics.EZpvd(this.closable, alertCardAppModel.closable) && Intrinsics.EZpvd(this.showIcon, alertCardAppModel.showIcon) && Intrinsics.EZpvd(this.ctaArrow, alertCardAppModel.ctaArrow) && Intrinsics.EZpvd(this.cta, alertCardAppModel.cta) && Intrinsics.EZpvd(this.cornerRadius, alertCardAppModel.cornerRadius) && Intrinsics.EZpvd(this.isHidden, alertCardAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) alertCardAppModel.id) && Intrinsics.EZpvd(this.required, alertCardAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) alertCardAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) alertCardAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, alertCardAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, alertCardAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
    public final CtaPopUp getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCtaArrow() {
        return this.ctaArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
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
        CTAButtonAppModel cTAButtonAppModel = this.ctaArrow;
        int iHashCode6 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        CtaPopUp ctaPopUp = this.cta;
        int iHashCode7 = ctaPopUp == null ? 0 : ctaPopUp.hashCode();
        Float f = this.cornerRadius;
        int iHashCode8 = f == null ? 0 : f.hashCode();
        Boolean bool3 = this.isHidden;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode10 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode11 = bool4 == null ? 0 : bool4.hashCode();
        String str4 = this.version;
        int iHashCode12 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode13 = str5 == null ? 0 : str5.hashCode();
        Float f2 = this.bottomMargin;
        int iHashCode14 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.leftMargin;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (f3 == null ? 0 : f3.hashCode());
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AlertCardAppModel(style=" + this.style + ", title=" + this.title + ", desc=" + this.desc + ", closable=" + this.closable + ", showIcon=" + this.showIcon + ", ctaArrow=" + this.ctaArrow + ", cta=" + this.cta + ", cornerRadius=" + this.cornerRadius + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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
        CTAButtonAppModel cTAButtonAppModel = this.ctaArrow;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        CtaPopUp ctaPopUp = this.cta;
        if (ctaPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUp.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AlertCardAppModel> serializer() {
            return AlertCardAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlertCardAppModel(int i, String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, CtaPopUp ctaPopUp, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (31232 != (i & 31232)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31232, AlertCardAppModel$$serializer.INSTANCE.getDescriptor());
        }
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
            this.ctaArrow = cTAButtonAppModel;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUp;
        }
        if ((i & 128) == 0) {
            this.cornerRadius = null;
        } else {
            this.cornerRadius = f;
        }
        this.isHidden = (i & 256) == 0 ? Boolean.FALSE : bool3;
        this.id = str4;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool4;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AlertCardAppModel alertCardAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(alertCardAppModel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || alertCardAppModel.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, alertCardAppModel.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alertCardAppModel.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, alertCardAppModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alertCardAppModel.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, alertCardAppModel.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(alertCardAppModel.closable, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, alertCardAppModel.closable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(alertCardAppModel.showIcon, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, alertCardAppModel.showIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || alertCardAppModel.ctaArrow != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, CTAButtonAppModel$$serializer.INSTANCE, alertCardAppModel.ctaArrow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || alertCardAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CtaPopUp$$serializer.INSTANCE, alertCardAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || alertCardAppModel.cornerRadius != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, alertCardAppModel.cornerRadius);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(alertCardAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, alertCardAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, alertCardAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(alertCardAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, alertCardAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, alertCardAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, alertCardAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, alertCardAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, alertCardAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0067: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x002f: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp:?: TERNARY null = ((wrap:int:0x0037: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp) : (r26v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x003f: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r27v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (r29v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0051: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0057: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.Float)
  (r34v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2273) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AlertCardAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, java.lang.Float, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AlertCardAppModel(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, CtaPopUp ctaPopUp, Float f, Boolean bool3, String str4, Boolean bool4, String str5, String str6, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) != 0 ? Boolean.TRUE : bool2, (i & 32) != 0 ? null : cTAButtonAppModel, (i & 64) != 0 ? null : ctaPopUp, (i & 128) != 0 ? null : f, (i & 256) != 0 ? Boolean.FALSE : bool3, str4, (i & 1024) != 0 ? Boolean.FALSE : bool4, str5, str6, f2, f3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertCardAppModel(String str, String str2, String str3, Boolean bool, Boolean bool2, CTAButtonAppModel cTAButtonAppModel, CtaPopUp ctaPopUp, Float f, Boolean bool3, @NotNull String str4, Boolean bool4, String str5, String str6, Float f2, Float f3) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        this.style = str;
        this.title = str2;
        this.desc = str3;
        this.closable = bool;
        this.showIcon = bool2;
        this.ctaArrow = cTAButtonAppModel;
        this.cta = ctaPopUp;
        this.cornerRadius = f;
        this.isHidden = bool3;
        this.id = str4;
        this.required = bool4;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public AlertCardAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
