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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("address-cascader")
@Serializable
public final class AddressCascader extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final DivisionTitle divisionTitle;
    private final Boolean enabled;
    private final AddressCascaderFildValue fieldValue;
    private final String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCascader> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressCascader> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCascader createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DivisionTitle divisionTitleCreateFromParcel = parcel.readInt() == 0 ? null : DivisionTitle.CREATOR.createFromParcel(parcel);
            AddressCascaderFildValue addressCascaderFildValueCreateFromParcel = parcel.readInt() == 0 ? null : AddressCascaderFildValue.CREATOR.createFromParcel(parcel);
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
            return new AddressCascader(string, string2, boolValueOf, divisionTitleCreateFromParcel, addressCascaderFildValueCreateFromParcel, boolValueOf2, string3, boolValueOf3, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCascader[] newArray(int i) {
            return new AddressCascader[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.placeholder;
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
    public final String component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DivisionTitle component4() {
        return this.divisionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderFildValue component5() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isHidden;
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
    public final AddressCascader copy(String str, String str2, Boolean bool, DivisionTitle divisionTitle, AddressCascaderFildValue addressCascaderFildValue, Boolean bool2, @NotNull String str3, Boolean bool3, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressCascader(str, str2, bool, divisionTitle, addressCascaderFildValue, bool2, str3, bool3, str4, str5, f, f2);
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
        if (!(obj instanceof AddressCascader)) {
            return false;
        }
        AddressCascader addressCascader = (AddressCascader) obj;
        return Intrinsics.EZpvd((Object) this.placeholder, (Object) addressCascader.placeholder) && Intrinsics.EZpvd((Object) this.label, (Object) addressCascader.label) && Intrinsics.EZpvd(this.enabled, addressCascader.enabled) && Intrinsics.EZpvd(this.divisionTitle, addressCascader.divisionTitle) && Intrinsics.EZpvd(this.fieldValue, addressCascader.fieldValue) && Intrinsics.EZpvd(this.isHidden, addressCascader.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) addressCascader.id) && Intrinsics.EZpvd(this.required, addressCascader.required) && Intrinsics.EZpvd((Object) this.version, (Object) addressCascader.version) && Intrinsics.EZpvd((Object) this.value, (Object) addressCascader.value) && Intrinsics.EZpvd(this.bottomMargin, addressCascader.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, addressCascader.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DivisionTitle getDivisionTitle() {
        return this.divisionTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCascaderFildValue getFieldValue() {
        return this.fieldValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
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
        String str = this.placeholder;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.enabled;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        DivisionTitle divisionTitle = this.divisionTitle;
        int iHashCode4 = divisionTitle == null ? 0 : divisionTitle.hashCode();
        AddressCascaderFildValue addressCascaderFildValue = this.fieldValue;
        int iHashCode5 = addressCascaderFildValue == null ? 0 : addressCascaderFildValue.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
        String str3 = this.version;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode11 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "AddressCascader(placeholder=" + this.placeholder + ", label=" + this.label + ", enabled=" + this.enabled + ", divisionTitle=" + this.divisionTitle + ", fieldValue=" + this.fieldValue + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.placeholder);
        parcel.writeString(this.label);
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        DivisionTitle divisionTitle = this.divisionTitle;
        if (divisionTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            divisionTitle.writeToParcel(parcel, i);
        }
        AddressCascaderFildValue addressCascaderFildValue = this.fieldValue;
        if (addressCascaderFildValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressCascaderFildValue.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascader.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCascader> serializer() {
            return AddressCascader$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressCascader(int i, String str, String str2, Boolean bool, DivisionTitle divisionTitle, AddressCascaderFildValue addressCascaderFildValue, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3904 != (i & 3904)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3904, AddressCascader$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str;
        }
        this.label = (i & 2) == 0 ? "" : str2;
        this.enabled = (i & 4) == 0 ? Boolean.TRUE : bool;
        if ((i & 8) == 0) {
            this.divisionTitle = null;
        } else {
            this.divisionTitle = divisionTitle;
        }
        if ((i & 16) == 0) {
            this.fieldValue = null;
        } else {
            this.fieldValue = addressCascaderFildValue;
        }
        this.isHidden = (i & 32) == 0 ? Boolean.FALSE : bool2;
        this.id = str3;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressCascader addressCascader, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(addressCascader, compositeEncoder, serialDescriptor);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || addressCascader.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, addressCascader.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressCascader.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addressCascader.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(addressCascader.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, addressCascader.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressCascader.divisionTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, DivisionTitle$$serializer.INSTANCE, addressCascader.divisionTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || addressCascader.fieldValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, AddressCascaderFildValue$$serializer.INSTANCE, addressCascader.fieldValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(addressCascader.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, addressCascader.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, addressCascader.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(addressCascader.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, addressCascader.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, addressCascader.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, addressCascader.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, addressCascader.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, addressCascader.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0015: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001b: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle:?: TERNARY null = ((wrap:int:0x001f: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue:?: TERNARY null = ((wrap:int:0x0027: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3792) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascader.<init>(java.lang.String, java.lang.String, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.DivisionTitle, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressCascaderFildValue, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AddressCascader(String str, String str2, Boolean bool, DivisionTitle divisionTitle, AddressCascaderFildValue addressCascaderFildValue, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.TRUE : bool, (i & 8) != 0 ? null : divisionTitle, (i & 16) != 0 ? null : addressCascaderFildValue, (i & 32) != 0 ? Boolean.FALSE : bool2, str3, (i & 128) != 0 ? Boolean.FALSE : bool3, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressCascader(String str, String str2, Boolean bool, DivisionTitle divisionTitle, AddressCascaderFildValue addressCascaderFildValue, Boolean bool2, @NotNull String str3, Boolean bool3, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.placeholder = str;
        this.label = str2;
        this.enabled = bool;
        this.divisionTitle = divisionTitle;
        this.fieldValue = addressCascaderFildValue;
        this.isHidden = bool2;
        this.id = str3;
        this.required = bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AddressCascaderAppModel toAppModel() {
        return new AddressCascaderAppModel(this.placeholder, this.label, this.enabled, this.divisionTitle, this.fieldValue, isHidden(), getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
