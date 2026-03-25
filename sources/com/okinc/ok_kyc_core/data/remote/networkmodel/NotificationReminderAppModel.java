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
public final class NotificationReminderAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Boolean closable;
    private final CtaPopUp cta;
    private final CtaButtonStyle ctaButtonStyle;
    private final String desc;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String style;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationReminderAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NotificationReminderAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReminderAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf3 = null;
            CtaPopUp ctaPopUpCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUp.CREATOR.createFromParcel(parcel);
            CtaButtonStyle ctaButtonStyleCreateFromParcel = parcel.readInt() == 0 ? null : CtaButtonStyle.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NotificationReminderAppModel(ctaPopUpCreateFromParcel, ctaButtonStyleCreateFromParcel, string, string2, string3, boolValueOf, string4, boolValueOf2, string5, string6, fValueOf, fValueOf2, boolValueOf3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReminderAppModel[] newArray(int i) {
            return new NotificationReminderAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NotificationReminderAppModel copy$default(NotificationReminderAppModel notificationReminderAppModel, CtaPopUp ctaPopUp, CtaButtonStyle ctaButtonStyle, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3, int i, Object obj) {
        return notificationReminderAppModel.copy((i & 1) != 0 ? notificationReminderAppModel.cta : ctaPopUp, (i & 2) != 0 ? notificationReminderAppModel.ctaButtonStyle : ctaButtonStyle, (i & 4) != 0 ? notificationReminderAppModel.title : str, (i & 8) != 0 ? notificationReminderAppModel.desc : str2, (i & 16) != 0 ? notificationReminderAppModel.style : str3, (i & 32) != 0 ? notificationReminderAppModel.closable : bool, (i & 64) != 0 ? notificationReminderAppModel.id : str4, (i & 128) != 0 ? notificationReminderAppModel.required : bool2, (i & 256) != 0 ? notificationReminderAppModel.version : str5, (i & 512) != 0 ? notificationReminderAppModel.value : str6, (i & 1024) != 0 ? notificationReminderAppModel.bottomMargin : f, (i & 2048) != 0 ? notificationReminderAppModel.leftMargin : f2, (i & 4096) != 0 ? notificationReminderAppModel.isHidden : bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUp component1() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaButtonStyle component2() {
        return this.ctaButtonStyle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.closable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationReminderAppModel copy(CtaPopUp ctaPopUp, CtaButtonStyle ctaButtonStyle, @NotNull String str, String str2, @NotNull String str3, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new NotificationReminderAppModel(ctaPopUp, ctaButtonStyle, str, str2, str3, bool, str4, bool2, str5, str6, f, f2, bool3);
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
        if (!(obj instanceof NotificationReminderAppModel)) {
            return false;
        }
        NotificationReminderAppModel notificationReminderAppModel = (NotificationReminderAppModel) obj;
        return Intrinsics.EZpvd(this.cta, notificationReminderAppModel.cta) && Intrinsics.EZpvd(this.ctaButtonStyle, notificationReminderAppModel.ctaButtonStyle) && Intrinsics.EZpvd((Object) this.title, (Object) notificationReminderAppModel.title) && Intrinsics.EZpvd((Object) this.desc, (Object) notificationReminderAppModel.desc) && Intrinsics.EZpvd((Object) this.style, (Object) notificationReminderAppModel.style) && Intrinsics.EZpvd(this.closable, notificationReminderAppModel.closable) && Intrinsics.EZpvd((Object) this.id, (Object) notificationReminderAppModel.id) && Intrinsics.EZpvd(this.required, notificationReminderAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) notificationReminderAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) notificationReminderAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, notificationReminderAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, notificationReminderAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, notificationReminderAppModel.isHidden);
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
    public final CtaPopUp getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaButtonStyle getCtaButtonStyle() {
        return this.ctaButtonStyle;
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
        CtaPopUp ctaPopUp = this.cta;
        int iHashCode = ctaPopUp == null ? 0 : ctaPopUp.hashCode();
        CtaButtonStyle ctaButtonStyle = this.ctaButtonStyle;
        int iHashCode2 = ctaButtonStyle == null ? 0 : ctaButtonStyle.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.desc;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.style.hashCode();
        Boolean bool = this.closable;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Boolean bool3 = this.isHidden;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool3 != null ? bool3.hashCode() : 0);
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
        return "NotificationReminderAppModel(cta=" + this.cta + ", ctaButtonStyle=" + this.ctaButtonStyle + ", title=" + this.title + ", desc=" + this.desc + ", style=" + this.style + ", closable=" + this.closable + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CtaPopUp ctaPopUp = this.cta;
        if (ctaPopUp == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUp.writeToParcel(parcel, i);
        }
        CtaButtonStyle ctaButtonStyle = this.ctaButtonStyle;
        if (ctaButtonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaButtonStyle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        parcel.writeString(this.style);
        Boolean bool = this.closable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.id);
        Boolean bool2 = this.required;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
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
        Boolean bool3 = this.isHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationReminderAppModel> serializer() {
            return NotificationReminderAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationReminderAppModel(int i, CtaPopUp ctaPopUp, CtaButtonStyle ctaButtonStyle, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3904 != (i & 3904)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3904, NotificationReminderAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUp;
        }
        if ((i & 2) == 0) {
            this.ctaButtonStyle = null;
        } else {
            this.ctaButtonStyle = ctaButtonStyle;
        }
        if ((i & 4) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 8) == 0) {
            this.desc = null;
        } else {
            this.desc = str2;
        }
        if ((i & 16) == 0) {
            this.style = "";
        } else {
            this.style = str3;
        }
        this.closable = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.id = str4;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 4096) == 0 ? Boolean.FALSE : bool3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(NotificationReminderAppModel notificationReminderAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(notificationReminderAppModel, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || notificationReminderAppModel.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CtaPopUp$$serializer.INSTANCE, notificationReminderAppModel.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || notificationReminderAppModel.ctaButtonStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, notificationReminderAppModel.ctaButtonStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) notificationReminderAppModel.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, notificationReminderAppModel.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || notificationReminderAppModel.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, notificationReminderAppModel.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) notificationReminderAppModel.style, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, notificationReminderAppModel.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(notificationReminderAppModel.closable, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, notificationReminderAppModel.closable);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, notificationReminderAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(notificationReminderAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, notificationReminderAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, notificationReminderAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, notificationReminderAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, notificationReminderAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, notificationReminderAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(notificationReminderAppModel.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, notificationReminderAppModel.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0058: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:261) call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminderAppModel.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUp, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ NotificationReminderAppModel(CtaPopUp ctaPopUp, CtaButtonStyle ctaButtonStyle, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ctaPopUp, (i & 2) != 0 ? null : ctaButtonStyle, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? Boolean.FALSE : bool, str4, (i & 128) != 0 ? Boolean.FALSE : bool2, str5, str6, f, f2, (i & 4096) != 0 ? Boolean.FALSE : bool3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationReminderAppModel(CtaPopUp ctaPopUp, CtaButtonStyle ctaButtonStyle, @NotNull String str, String str2, @NotNull String str3, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.cta = ctaPopUp;
        this.ctaButtonStyle = ctaButtonStyle;
        this.title = str;
        this.desc = str2;
        this.style = str3;
        this.closable = bool;
        this.id = str4;
        this.required = bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool3;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public NotificationReminderAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
