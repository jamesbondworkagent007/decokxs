package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
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
import o.C43780rvj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName(NotificationCompat.CATEGORY_REMINDER)
@Serializable
public final class NotificationReminder extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final Boolean closable;
    private final CtaPopUpData cta;
    private final CtaButtonStyle ctaButtonStyle;
    private final String desc;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String style;
    private final String title;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationReminder> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NotificationReminder> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReminder createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf3 = null;
            CtaPopUpData ctaPopUpDataCreateFromParcel = parcel.readInt() == 0 ? null : CtaPopUpData.CREATOR.createFromParcel(parcel);
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
            return new NotificationReminder(ctaPopUpDataCreateFromParcel, ctaButtonStyleCreateFromParcel, string, string2, string3, boolValueOf, string4, boolValueOf2, string5, string6, fValueOf, fValueOf2, boolValueOf3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationReminder[] newArray(int i) {
            return new NotificationReminder[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CtaPopUpData component1() {
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
    public final NotificationReminder copy(CtaPopUpData ctaPopUpData, CtaButtonStyle ctaButtonStyle, @NotNull String str, String str2, @NotNull String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new NotificationReminder(ctaPopUpData, ctaButtonStyle, str, str2, str3, bool, str4, bool2, str5, str6, f, f2, bool3);
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
        if (!(obj instanceof NotificationReminder)) {
            return false;
        }
        NotificationReminder notificationReminder = (NotificationReminder) obj;
        return Intrinsics.EZpvd(this.cta, notificationReminder.cta) && Intrinsics.EZpvd(this.ctaButtonStyle, notificationReminder.ctaButtonStyle) && Intrinsics.EZpvd((Object) this.title, (Object) notificationReminder.title) && Intrinsics.EZpvd((Object) this.desc, (Object) notificationReminder.desc) && Intrinsics.EZpvd((Object) this.style, (Object) notificationReminder.style) && Intrinsics.EZpvd(this.closable, notificationReminder.closable) && Intrinsics.EZpvd((Object) this.id, (Object) notificationReminder.id) && Intrinsics.EZpvd(this.required, notificationReminder.required) && Intrinsics.EZpvd((Object) this.version, (Object) notificationReminder.version) && Intrinsics.EZpvd((Object) this.value, (Object) notificationReminder.value) && Intrinsics.EZpvd(this.bottomMargin, notificationReminder.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, notificationReminder.leftMargin) && Intrinsics.EZpvd(this.isHidden, notificationReminder.isHidden);
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
    public final CtaPopUpData getCta() {
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
        CtaPopUpData ctaPopUpData = this.cta;
        int iHashCode = ctaPopUpData == null ? 0 : ctaPopUpData.hashCode();
        CtaButtonStyle ctaButtonStyle = this.ctaButtonStyle;
        int iHashCode2 = ctaButtonStyle == null ? 0 : ctaButtonStyle.hashCode();
        int iHashCode3 = this.title.hashCode();
        String str = this.desc;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.style.hashCode();
        Boolean bool = this.closable;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str2 = this.id;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Boolean bool3 = this.isHidden;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool3 != null ? bool3.hashCode() : 0);
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
        return "NotificationReminder(cta=" + this.cta + ", ctaButtonStyle=" + this.ctaButtonStyle + ", title=" + this.title + ", desc=" + this.desc + ", style=" + this.style + ", closable=" + this.closable + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CtaPopUpData ctaPopUpData = this.cta;
        if (ctaPopUpData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ctaPopUpData.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminder.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationReminder> serializer() {
            return NotificationReminder$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationReminder(int i, CtaPopUpData ctaPopUpData, CtaButtonStyle ctaButtonStyle, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3840 != (i & 3840)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3840, NotificationReminder$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.cta = null;
        } else {
            this.cta = ctaPopUpData;
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
        if ((i & 64) == 0) {
            this.id = "";
        } else {
            this.id = str4;
        }
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 4096) == 0 ? Boolean.FALSE : bool3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(NotificationReminder notificationReminder, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(notificationReminder, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || notificationReminder.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CtaPopUpData$$serializer.INSTANCE, notificationReminder.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || notificationReminder.ctaButtonStyle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CtaButtonStyle$$serializer.INSTANCE, notificationReminder.ctaButtonStyle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) notificationReminder.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, notificationReminder.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || notificationReminder.desc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, notificationReminder.desc);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) notificationReminder.style, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, notificationReminder.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(notificationReminder.closable, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, notificationReminder.closable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) notificationReminder.getId(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, notificationReminder.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(notificationReminder.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, notificationReminder.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, notificationReminder.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, notificationReminder.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, notificationReminder.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, notificationReminder.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd(notificationReminder.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, notificationReminder.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005e: CONSTRUCTOR 
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0045: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0049: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:218) call: com.okinc.ok_kyc_core.data.remote.networkmodel.NotificationReminder.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.CtaPopUpData, com.okinc.ok_kyc_core.data.remote.networkmodel.CtaButtonStyle, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ NotificationReminder(CtaPopUpData ctaPopUpData, CtaButtonStyle ctaButtonStyle, String str, String str2, String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ctaPopUpData, (i & 2) != 0 ? null : ctaButtonStyle, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? Boolean.FALSE : bool, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? Boolean.FALSE : bool2, str5, str6, f, f2, (i & 4096) != 0 ? Boolean.FALSE : bool3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationReminder(CtaPopUpData ctaPopUpData, CtaButtonStyle ctaButtonStyle, @NotNull String str, String str2, @NotNull String str3, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, Boolean bool3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.cta = ctaPopUpData;
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

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public NotificationReminderAppModel toAppModel() {
        CtaPopUpData ctaPopUpData = this.cta;
        CtaPopUp ctaPopUpKWHzl = ctaPopUpData != null ? C43780rvj.KWHzl(ctaPopUpData) : null;
        CtaButtonStyle ctaButtonStyle = this.ctaButtonStyle;
        String str = this.title;
        String str2 = this.desc;
        String str3 = this.style;
        Boolean bool = this.closable;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new NotificationReminderAppModel(ctaPopUpKWHzl, ctaButtonStyle, str, str2, str3, bool, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
