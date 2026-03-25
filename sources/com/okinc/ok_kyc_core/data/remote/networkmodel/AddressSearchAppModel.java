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
public final class AddressSearchAppModel extends UIComponentAppModel implements Parcelable {
    private final AddressAutoComplete addressAutoComplete;
    private Float bottomMargin;
    private final CTAButtonAppModel ctaButton;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressSearchAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressSearchAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            CTAButtonAppModel cTAButtonAppModelCreateFromParcel = parcel.readInt() == 0 ? null : CTAButtonAppModel.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            AddressAutoComplete addressAutoCompleteCreateFromParcel = parcel.readInt() == 0 ? null : AddressAutoComplete.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressSearchAppModel(string, cTAButtonAppModelCreateFromParcel, string2, addressAutoCompleteCreateFromParcel, boolValueOf, string3, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearchAppModel[] newArray(int i) {
            return new AddressSearchAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressSearchAppModel copy$default(AddressSearchAppModel addressSearchAppModel, String str, CTAButtonAppModel cTAButtonAppModel, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, Object obj) {
        return addressSearchAppModel.copy((i & 1) != 0 ? addressSearchAppModel.type : str, (i & 2) != 0 ? addressSearchAppModel.ctaButton : cTAButtonAppModel, (i & 4) != 0 ? addressSearchAppModel.placeholder : str2, (i & 8) != 0 ? addressSearchAppModel.addressAutoComplete : addressAutoComplete, (i & 16) != 0 ? addressSearchAppModel.isHidden : bool, (i & 32) != 0 ? addressSearchAppModel.id : str3, (i & 64) != 0 ? addressSearchAppModel.required : bool2, (i & 128) != 0 ? addressSearchAppModel.version : str4, (i & 256) != 0 ? addressSearchAppModel.value : str5, (i & 512) != 0 ? addressSearchAppModel.bottomMargin : f, (i & 1024) != 0 ? addressSearchAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
    public final CTAButtonAppModel component2() {
        return this.ctaButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAutoComplete component4() {
        return this.addressAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isHidden;
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
    public final AddressSearchAppModel copy(@NotNull String str, CTAButtonAppModel cTAButtonAppModel, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, @NotNull String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddressSearchAppModel(str, cTAButtonAppModel, str2, addressAutoComplete, bool, str3, bool2, str4, str5, f, f2);
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
        if (!(obj instanceof AddressSearchAppModel)) {
            return false;
        }
        AddressSearchAppModel addressSearchAppModel = (AddressSearchAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) addressSearchAppModel.type) && Intrinsics.EZpvd(this.ctaButton, addressSearchAppModel.ctaButton) && Intrinsics.EZpvd((Object) this.placeholder, (Object) addressSearchAppModel.placeholder) && Intrinsics.EZpvd(this.addressAutoComplete, addressSearchAppModel.addressAutoComplete) && Intrinsics.EZpvd(this.isHidden, addressSearchAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) addressSearchAppModel.id) && Intrinsics.EZpvd(this.required, addressSearchAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) addressSearchAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) addressSearchAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, addressSearchAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, addressSearchAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAutoComplete getAddressAutoComplete() {
        return this.addressAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCtaButton() {
        return this.ctaButton;
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
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
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
        int iHashCode = this.type.hashCode();
        CTAButtonAppModel cTAButtonAppModel = this.ctaButton;
        int iHashCode2 = cTAButtonAppModel == null ? 0 : cTAButtonAppModel.hashCode();
        String str = this.placeholder;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        int iHashCode4 = addressAutoComplete == null ? 0 : addressAutoComplete.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        int iHashCode6 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode10 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "AddressSearchAppModel(type=" + this.type + ", ctaButton=" + this.ctaButton + ", placeholder=" + this.placeholder + ", addressAutoComplete=" + this.addressAutoComplete + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        CTAButtonAppModel cTAButtonAppModel = this.ctaButton;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.placeholder);
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        if (addressAutoComplete == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressAutoComplete.writeToParcel(parcel, i);
        }
        Boolean bool = this.isHidden;
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
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressSearchAppModel> serializer() {
            return AddressSearchAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSearchAppModel(int i, String str, CTAButtonAppModel cTAButtonAppModel, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1959 != (i & 1959)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1959, AddressSearchAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.ctaButton = cTAButtonAppModel;
        this.placeholder = str2;
        if ((i & 8) == 0) {
            this.addressAutoComplete = null;
        } else {
            this.addressAutoComplete = addressAutoComplete;
        }
        if ((i & 16) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str3;
        if ((i & 64) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressSearchAppModel addressSearchAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(addressSearchAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressSearchAppModel.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CTAButtonAppModel$$serializer.INSTANCE, addressSearchAppModel.ctaButton);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, addressSearchAppModel.placeholder);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressSearchAppModel.addressAutoComplete != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, AddressAutoComplete$$serializer.INSTANCE, addressSearchAppModel.addressAutoComplete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(addressSearchAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, addressSearchAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, addressSearchAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(addressSearchAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, addressSearchAppModel.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, addressSearchAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, addressSearchAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, addressSearchAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, addressSearchAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel)
  (r16v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete:?: TERNARY null = ((wrap:int:0x0000: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.Float)
  (r24v0 java.lang.Float)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2132) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearchAppModel.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AddressSearchAppModel(String str, CTAButtonAppModel cTAButtonAppModel, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cTAButtonAppModel, str2, (i & 8) != 0 ? null : addressAutoComplete, (i & 16) != 0 ? Boolean.FALSE : bool, str3, (i & 64) != 0 ? Boolean.FALSE : bool2, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSearchAppModel(@NotNull String str, CTAButtonAppModel cTAButtonAppModel, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, @NotNull String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.ctaButton = cTAButtonAppModel;
        this.placeholder = str2;
        this.addressAutoComplete = addressAutoComplete;
        this.isHidden = bool;
        this.id = str3;
        this.required = bool2;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public AddressSearchAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
