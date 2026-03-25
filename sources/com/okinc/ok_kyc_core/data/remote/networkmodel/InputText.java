package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("input-text")
@Serializable
public final class InputText extends UIComponent implements Parcelable {
    private final AddressAutoComplete addressAutoComplete;
    private Float bottomMargin;
    private final Boolean enabled;
    private final String id;
    private Boolean isHidden;
    private final Boolean isNumber;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Integer precision;
    private final String prefix;
    private final Boolean required;
    private final List<Rule> rules;
    private final String suffix;
    private final String tip;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputText> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputText> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputText createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputText(string, string2, string3, string4, string5, numValueOf, boolValueOf, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : AddressAutoComplete.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputText[] newArray(int i) {
            return new InputText[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAutoComplete component10() {
        return this.addressAutoComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isHidden;
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
    public final Float component16() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component17() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.suffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component8() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputText copy(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, List<Rule> list, Boolean bool2, AddressAutoComplete addressAutoComplete, Boolean bool3, @NotNull String str6, Boolean bool4, String str7, String str8, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str6, "");
        return new InputText(str, str2, str3, str4, str5, num, bool, list, bool2, addressAutoComplete, bool3, str6, bool4, str7, str8, f, f2);
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
        if (!(obj instanceof InputText)) {
            return false;
        }
        InputText inputText = (InputText) obj;
        return Intrinsics.EZpvd((Object) this.tip, (Object) inputText.tip) && Intrinsics.EZpvd((Object) this.label, (Object) inputText.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputText.placeholder) && Intrinsics.EZpvd((Object) this.prefix, (Object) inputText.prefix) && Intrinsics.EZpvd((Object) this.suffix, (Object) inputText.suffix) && Intrinsics.EZpvd(this.precision, inputText.precision) && Intrinsics.EZpvd(this.isNumber, inputText.isNumber) && Intrinsics.EZpvd(this.rules, inputText.rules) && Intrinsics.EZpvd(this.enabled, inputText.enabled) && Intrinsics.EZpvd(this.addressAutoComplete, inputText.addressAutoComplete) && Intrinsics.EZpvd(this.isHidden, inputText.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputText.id) && Intrinsics.EZpvd(this.required, inputText.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputText.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputText.value) && Intrinsics.EZpvd(this.bottomMargin, inputText.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputText.leftMargin);
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
    public final Boolean getEnabled() {
        return this.enabled;
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
    public final Integer getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuffix() {
        return this.suffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
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
        String str = this.tip;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.placeholder;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.prefix;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.suffix;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.precision;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isNumber;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        List<Rule> list = this.rules;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        Boolean bool2 = this.enabled;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        int iHashCode10 = addressAutoComplete == null ? 0 : addressAutoComplete.hashCode();
        Boolean bool3 = this.isHidden;
        int iHashCode11 = bool3 == null ? 0 : bool3.hashCode();
        int iHashCode12 = this.id.hashCode();
        Boolean bool4 = this.required;
        int iHashCode13 = bool4 == null ? 0 : bool4.hashCode();
        String str6 = this.version;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.value;
        int iHashCode15 = str7 == null ? 0 : str7.hashCode();
        Float f = this.bottomMargin;
        int iHashCode16 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (f2 == null ? 0 : f2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isNumber() {
        return this.isNumber;
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
        return "InputText(tip=" + this.tip + ", label=" + this.label + ", placeholder=" + this.placeholder + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", precision=" + this.precision + ", isNumber=" + this.isNumber + ", rules=" + this.rules + ", enabled=" + this.enabled + ", addressAutoComplete=" + this.addressAutoComplete + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tip);
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.prefix);
        parcel.writeString(this.suffix);
        Integer num = this.precision;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isNumber;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<Rule> list = this.rules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool2 = this.enabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        AddressAutoComplete addressAutoComplete = this.addressAutoComplete;
        if (addressAutoComplete == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressAutoComplete.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputText.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputText> serializer() {
            return InputText$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputText(int i, String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, List list, Boolean bool2, AddressAutoComplete addressAutoComplete, Boolean bool3, String str6, Boolean bool4, String str7, String str8, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (125056 != (i & 125056)) {
            PluginExceptionsKt.throwMissingFieldException(i, 125056, InputText$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.tip = "";
        } else {
            this.tip = str;
        }
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.placeholder = "";
        } else {
            this.placeholder = str3;
        }
        if ((i & 8) == 0) {
            this.prefix = "";
        } else {
            this.prefix = str4;
        }
        if ((i & 16) == 0) {
            this.suffix = "";
        } else {
            this.suffix = str5;
        }
        this.precision = (i & 32) == 0 ? 0 : num;
        this.isNumber = (i & 64) == 0 ? Boolean.FALSE : bool;
        this.rules = list;
        this.enabled = (i & 256) == 0 ? Boolean.TRUE : bool2;
        this.addressAutoComplete = (i & 512) == 0 ? null : addressAutoComplete;
        this.isHidden = (i & 1024) == 0 ? Boolean.FALSE : bool3;
        this.id = str6;
        this.required = (i & 4096) == 0 ? Boolean.FALSE : bool4;
        this.version = str7;
        this.value = str8;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputText inputText, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        UIComponent.write$Self(inputText, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputText.tip, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputText.tip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inputText.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputText.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) inputText.placeholder, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputText.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) inputText.prefix, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inputText.prefix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) inputText.suffix, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, inputText.suffix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = inputText.precision) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, inputText.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputText.isNumber, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputText.isNumber);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], inputText.rules);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(inputText.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inputText.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || inputText.addressAutoComplete != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, AddressAutoComplete$$serializer.INSTANCE, inputText.addressAutoComplete);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(inputText.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, inputText.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, inputText.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(inputText.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, inputText.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, inputText.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, inputText.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, inputText.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, floatSerializer, inputText.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r39v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (r29v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0043: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete:?: TERNARY null = ((wrap:int:0x004d: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete) : (r31v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
  (r33v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0060: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r34v0 java.lang.Boolean))
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.Float)
  (r38v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3531) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputText.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.List, java.lang.Boolean, com.okinc.ok_kyc_core.data.remote.networkmodel.AddressAutoComplete, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputText(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, List list, Boolean bool2, AddressAutoComplete addressAutoComplete, Boolean bool3, String str6, Boolean bool4, String str7, String str8, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? Boolean.FALSE : bool, list, (i & 256) != 0 ? Boolean.TRUE : bool2, (i & 512) != 0 ? null : addressAutoComplete, (i & 1024) != 0 ? Boolean.FALSE : bool3, str6, (i & 4096) != 0 ? Boolean.FALSE : bool4, str7, str8, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputText(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, List<Rule> list, Boolean bool2, AddressAutoComplete addressAutoComplete, Boolean bool3, @NotNull String str6, Boolean bool4, String str7, String str8, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str6, "");
        this.tip = str;
        this.label = str2;
        this.placeholder = str3;
        this.prefix = str4;
        this.suffix = str5;
        this.precision = num;
        this.isNumber = bool;
        this.rules = list;
        this.enabled = bool2;
        this.addressAutoComplete = addressAutoComplete;
        this.isHidden = bool3;
        this.id = str6;
        this.required = bool4;
        this.version = str7;
        this.value = str8;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InputTextAppModel toAppModel() {
        return new InputTextAppModel(this.tip, this.label, this.placeholder, this.prefix, this.suffix, this.precision, this.isNumber, this.rules, this.enabled, this.addressAutoComplete, isHidden(), getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
