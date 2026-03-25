package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.productmatrix.biz.bean.ProductMatrixRemoteConfig;
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
import o.C43707ruP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName(ProductMatrixRemoteConfig.ALERT)
@Serializable
public final class Alert extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final String description;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String message;
    private final Boolean required;
    private final Boolean showBg;
    private final Boolean showIcon;
    private final AlertStyle style;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Alert> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Alert> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Alert createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            AlertStyle alertStyleValueOf = parcel.readInt() == 0 ? null : AlertStyle.valueOf(parcel.readString());
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
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Alert(string, string2, alertStyleValueOf, boolValueOf, boolValueOf2, string3, boolValueOf3, string4, string5, fValueOf, fValueOf2, boolValueOf4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Alert[] newArray(int i) {
            return new Alert[i];
        }
    }

    @Serializable(with = C43707ruP.class)
    public static /* synthetic */ void getStyle$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertStyle component3() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.showIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.showBg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Alert copy(String str, String str2, AlertStyle alertStyle, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, Boolean bool4) {
        return new Alert(str, str2, alertStyle, bool, bool2, str3, bool3, str4, str5, f, f2, bool4);
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
        if (!(obj instanceof Alert)) {
            return false;
        }
        Alert alert = (Alert) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) alert.message) && Intrinsics.EZpvd((Object) this.description, (Object) alert.description) && this.style == alert.style && Intrinsics.EZpvd(this.showIcon, alert.showIcon) && Intrinsics.EZpvd(this.showBg, alert.showBg) && Intrinsics.EZpvd((Object) this.id, (Object) alert.id) && Intrinsics.EZpvd(this.required, alert.required) && Intrinsics.EZpvd((Object) this.version, (Object) alert.version) && Intrinsics.EZpvd((Object) this.value, (Object) alert.value) && Intrinsics.EZpvd(this.bottomMargin, alert.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, alert.leftMargin) && Intrinsics.EZpvd(this.isHidden, alert.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
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
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowBg() {
        return this.showBg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowIcon() {
        return this.showIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertStyle getStyle() {
        return this.style;
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
        String str = this.message;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        AlertStyle alertStyle = this.style;
        int iHashCode3 = alertStyle == null ? 0 : alertStyle.hashCode();
        Boolean bool = this.showIcon;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.showBg;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.id;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool3 = this.required;
        int iHashCode7 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.version;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        Float f = this.bottomMargin;
        int iHashCode10 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode11 = f2 == null ? 0 : f2.hashCode();
        Boolean bool4 = this.isHidden;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (bool4 != null ? bool4.hashCode() : 0);
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
        return "Alert(message=" + this.message + ", description=" + this.description + ", style=" + this.style + ", showIcon=" + this.showIcon + ", showBg=" + this.showBg + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.message);
        parcel.writeString(this.description);
        AlertStyle alertStyle = this.style;
        if (alertStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alertStyle.name());
        }
        Boolean bool = this.showIcon;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.showBg;
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
        Boolean bool4 = this.isHidden;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Alert.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Alert> serializer() {
            return Alert$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Alert(int i, String str, String str2, AlertStyle alertStyle, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, Boolean bool4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1952 != (i & 1952)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1952, Alert$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.style = null;
        } else {
            this.style = alertStyle;
        }
        this.showIcon = (i & 8) == 0 ? Boolean.TRUE : bool;
        this.showBg = (i & 16) == 0 ? Boolean.FALSE : bool2;
        this.id = str3;
        this.required = (i & 64) == 0 ? Boolean.FALSE : bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 2048) == 0 ? Boolean.FALSE : bool4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Alert alert, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(alert, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || alert.message != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, alert.message);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || alert.description != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, alert.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || alert.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, C43707ruP.OLrzqt, alert.style);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(alert.showIcon, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, alert.showIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(alert.showBg, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, alert.showBg);
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, alert.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(alert.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, alert.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, alert.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, alert.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, alert.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, alert.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd(alert.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, alert.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.Float)
  (r27v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:1656) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Alert.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AlertStyle, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ Alert(String str, String str2, AlertStyle alertStyle, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : alertStyle, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? Boolean.FALSE : bool2, str3, (i & 64) != 0 ? Boolean.FALSE : bool3, str4, str5, f, f2, (i & 2048) != 0 ? Boolean.FALSE : bool4);
    }

    public Alert(String str, String str2, AlertStyle alertStyle, Boolean bool, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, Boolean bool4) {
        super(null);
        this.message = str;
        this.description = str2;
        this.style = alertStyle;
        this.showIcon = bool;
        this.showBg = bool2;
        this.id = str3;
        this.required = bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool4;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AlertAppModel toAppModel() {
        String str = this.message;
        String str2 = this.description;
        AlertStyle alertStyle = this.style;
        Boolean bool = this.showIcon;
        Boolean bool2 = this.showBg;
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new AlertAppModel(str, str2, alertStyle, bool, bool2, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin(), isHidden());
    }
}
