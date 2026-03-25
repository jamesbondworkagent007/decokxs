package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class SubInput implements Parcelable {
    private final String hint;
    private String id;
    private final Boolean isNumber;
    private final String label;
    private final String placeholder;
    private final Integer precision;
    private final String prefix;
    private final Boolean required;
    private final List<Rule> rules;
    private final String suffix;
    private final String type;
    private String value;
    private final Rule warningRule;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SubInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<SubInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubInput createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new SubInput(string, string2, string3, string4, string5, string6, string7, string8, arrayList, parcel.readInt() == 0 ? null : Rule.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SubInput[] newArray(int i) {
            return new SubInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule component10() {
        return this.warningRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component12() {
        return this.isNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.hint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.suffix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component9() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SubInput copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Rule> list, Rule rule, Boolean bool, Boolean bool2, Integer num) {
        return new SubInput(str, str2, str3, str4, str5, str6, str7, str8, list, rule, bool, bool2, num);
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
        if (!(obj instanceof SubInput)) {
            return false;
        }
        SubInput subInput = (SubInput) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) subInput.type) && Intrinsics.EZpvd((Object) this.label, (Object) subInput.label) && Intrinsics.EZpvd((Object) this.id, (Object) subInput.id) && Intrinsics.EZpvd((Object) this.value, (Object) subInput.value) && Intrinsics.EZpvd((Object) this.hint, (Object) subInput.hint) && Intrinsics.EZpvd((Object) this.placeholder, (Object) subInput.placeholder) && Intrinsics.EZpvd((Object) this.prefix, (Object) subInput.prefix) && Intrinsics.EZpvd((Object) this.suffix, (Object) subInput.suffix) && Intrinsics.EZpvd(this.rules, subInput.rules) && Intrinsics.EZpvd(this.warningRule, subInput.warningRule) && Intrinsics.EZpvd(this.required, subInput.required) && Intrinsics.EZpvd(this.isNumber, subInput.isNumber) && Intrinsics.EZpvd(this.precision, subInput.precision);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHint() {
        return this.hint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
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
    public final Boolean getRequired() {
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
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rule getWarningRule() {
        return this.warningRule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.type;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.label;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.id;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.hint;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.placeholder;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.prefix;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.suffix;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        List<Rule> list = this.rules;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        Rule rule = this.warningRule;
        int iHashCode10 = rule == null ? 0 : rule.hashCode();
        Boolean bool = this.required;
        int iHashCode11 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isNumber;
        int iHashCode12 = bool2 == null ? 0 : bool2.hashCode();
        Integer num = this.precision;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isNumber() {
        return this.isNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(String str) {
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SubInput(type=" + this.type + ", label=" + this.label + ", id=" + this.id + ", value=" + this.value + ", hint=" + this.hint + ", placeholder=" + this.placeholder + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", rules=" + this.rules + ", warningRule=" + this.warningRule + ", required=" + this.required + ", isNumber=" + this.isNumber + ", precision=" + this.precision + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.label);
        parcel.writeString(this.id);
        parcel.writeString(this.value);
        parcel.writeString(this.hint);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.prefix);
        parcel.writeString(this.suffix);
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
        Rule rule = this.warningRule;
        if (rule == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rule.writeToParcel(parcel, i);
        }
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isNumber;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.precision;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SubInput> serializer() {
            return SubInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SubInput(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Rule rule, Boolean bool, Boolean bool2, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (768 != (i & 768)) {
            PluginExceptionsKt.throwMissingFieldException(i, 768, SubInput$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.id = null;
        } else {
            this.id = str3;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 16) == 0) {
            this.hint = "";
        } else {
            this.hint = str5;
        }
        if ((i & 32) == 0) {
            this.placeholder = "";
        } else {
            this.placeholder = str6;
        }
        if ((i & 64) == 0) {
            this.prefix = "";
        } else {
            this.prefix = str7;
        }
        if ((i & 128) == 0) {
            this.suffix = "";
        } else {
            this.suffix = str8;
        }
        this.rules = list;
        this.warningRule = rule;
        this.required = (i & 1024) == 0 ? Boolean.FALSE : bool;
        this.isNumber = (i & 2048) == 0 ? Boolean.FALSE : bool2;
        this.precision = (i & 4096) == 0 ? 0 : num;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(SubInput subInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subInput.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subInput.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || subInput.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subInput.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subInput.id != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subInput.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) subInput.value, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subInput.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) subInput.hint, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subInput.hint);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) subInput.placeholder, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subInput.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) subInput.prefix, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subInput.prefix);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) subInput.suffix, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subInput.suffix);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], subInput.rules);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, subInput.warningRule);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(subInput.required, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, subInput.required);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(subInput.isNumber, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, subInput.isNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || (num = subInput.precision) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, subInput.precision);
        }
    }

    public SubInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Rule> list, Rule rule, Boolean bool, Boolean bool2, Integer num) {
        this.type = str;
        this.label = str2;
        this.id = str3;
        this.value = str4;
        this.hint = str5;
        this.placeholder = str6;
        this.prefix = str7;
        this.suffix = str8;
        this.rules = list;
        this.warningRule = rule;
        this.required = bool;
        this.isNumber = bool2;
        this.precision = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (r26v0 java.util.List)
  (r27v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Rule)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r29v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0059: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void (m)] (LINE:4212) call: com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.Rule, java.lang.Boolean, java.lang.Boolean, java.lang.Integer):void type: THIS */
    public /* synthetic */ SubInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Rule rule, Boolean bool, Boolean bool2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, list, rule, (i & 1024) != 0 ? Boolean.FALSE : bool, (i & 2048) != 0 ? Boolean.FALSE : bool2, (i & 4096) != 0 ? 0 : num);
    }
}
