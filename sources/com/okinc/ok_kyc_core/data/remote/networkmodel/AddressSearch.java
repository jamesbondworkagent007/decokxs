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
@SerialName("search-address")
@Serializable
public final class AddressSearch extends UIComponent implements Parcelable {
    private final AddressAutoComplete addressAutoComplete;
    private Float bottomMargin;
    private final CTAButton ctaButton;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressSearch> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<AddressSearch> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearch createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            CTAButton cTAButtonCreateFromParcel = parcel.readInt() == 0 ? null : CTAButton.CREATOR.createFromParcel(parcel);
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
            return new AddressSearch(string, cTAButtonCreateFromParcel, string2, addressAutoCompleteCreateFromParcel, boolValueOf, string3, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSearch[] newArray(int i) {
            return new AddressSearch[i];
        }
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
    public final CTAButton component2() {
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
    public final AddressSearch copy(@NotNull String str, CTAButton cTAButton, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AddressSearch(str, cTAButton, str2, addressAutoComplete, bool, str3, bool2, str4, str5, f, f2);
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
        if (!(obj instanceof AddressSearch)) {
            return false;
        }
        AddressSearch addressSearch = (AddressSearch) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) addressSearch.type) && Intrinsics.EZpvd(this.ctaButton, addressSearch.ctaButton) && Intrinsics.EZpvd((Object) this.placeholder, (Object) addressSearch.placeholder) && Intrinsics.EZpvd(this.addressAutoComplete, addressSearch.addressAutoComplete) && Intrinsics.EZpvd(this.isHidden, addressSearch.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) addressSearch.id) && Intrinsics.EZpvd(this.required, addressSearch.required) && Intrinsics.EZpvd((Object) this.version, (Object) addressSearch.version) && Intrinsics.EZpvd((Object) this.value, (Object) addressSearch.value) && Intrinsics.EZpvd(this.bottomMargin, addressSearch.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, addressSearch.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAutoComplete getAddressAutoComplete() {
        return this.addressAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCtaButton() {
        return this.ctaButton;
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
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
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
        int iHashCode = this.type.hashCode();
        CTAButton cTAButton = this.ctaButton;
        int iHashCode2 = cTAButton == null ? 0 : cTAButton.hashCode();
        String str = this.placeholder;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        int iHashCode4 = addressAutoComplete == null ? 0 : addressAutoComplete.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        String str2 = this.id;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        Boolean bool2 = this.required;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str3 = this.version;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode9 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode10 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "AddressSearch(type=" + this.type + ", ctaButton=" + this.ctaButton + ", placeholder=" + this.placeholder + ", addressAutoComplete=" + this.addressAutoComplete + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        CTAButton cTAButton = this.ctaButton;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearch.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressSearch> serializer() {
            return AddressSearch$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressSearch(int i, String str, CTAButton cTAButton, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1959 != (i & 1959)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1959, AddressSearch$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.ctaButton = cTAButton;
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

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(AddressSearch addressSearch, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(addressSearch, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, addressSearch.type);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, CTAButton$$serializer.INSTANCE, addressSearch.ctaButton);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, addressSearch.placeholder);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || addressSearch.addressAutoComplete != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, AddressAutoComplete$$serializer.INSTANCE, addressSearch.addressAutoComplete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(addressSearch.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, addressSearch.isHidden());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, addressSearch.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(addressSearch.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, addressSearch.getRequired());
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, addressSearch.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, addressSearch.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, addressSearch.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, addressSearch.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton)
  (r16v0 java.lang.String)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete:?: TERNARY null = ((wrap:int:0x0000: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete) : (r17v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.Float)
  (r24v0 java.lang.Float)
 A[MD:(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2101) call: com.okinc.ok_kyc_core.data.remote.networkmodel.AddressSearch.<init>(java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ AddressSearch(String str, CTAButton cTAButton, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cTAButton, str2, (i & 8) != 0 ? null : addressAutoComplete, (i & 16) != 0 ? Boolean.FALSE : bool, str3, (i & 64) != 0 ? Boolean.FALSE : bool2, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressSearch(@NotNull String str, CTAButton cTAButton, String str2, AddressAutoComplete addressAutoComplete, Boolean bool, String str3, Boolean bool2, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.ctaButton = cTAButton;
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

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public AddressSearchAppModel toAppModel() {
        String str = this.type;
        CTAButton cTAButton = this.ctaButton;
        CTAButtonAppModel appModel = cTAButton != null ? cTAButton.toAppModel() : null;
        String str2 = this.placeholder;
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        Boolean boolIsHidden = isHidden();
        String id = getId();
        if (id == null) {
            id = "";
        }
        return new AddressSearchAppModel(str, appModel, str2, addressAutoComplete, boolIsHidden, id, getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
