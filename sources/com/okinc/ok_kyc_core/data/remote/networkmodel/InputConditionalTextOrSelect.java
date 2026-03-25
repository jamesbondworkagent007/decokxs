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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("input-conditional-text-or-select")
@Serializable
public final class InputConditionalTextOrSelect extends UIComponent implements Parcelable {
    private Float bottomMargin;
    private final Choices choices;
    private final Boolean enabled;
    private final String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private final List<Rule> rules;
    private String value;
    private final String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputConditionalTextOrSelect> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputConditionalTextOrSelect> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputConditionalTextOrSelect createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            Choices choicesCreateFromParcel = parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputConditionalTextOrSelect(string, string2, choicesCreateFromParcel, string3, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputConditionalTextOrSelect[] newArray(int i) {
            return new InputConditionalTextOrSelect[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices component3() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component5() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputConditionalTextOrSelect copy(String str, String str2, Choices choices, String str3, List<Rule> list, Boolean bool, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputConditionalTextOrSelect(str, str2, choices, str3, list, bool, bool2, str4, bool3, str5, str6, f, f2);
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
        if (!(obj instanceof InputConditionalTextOrSelect)) {
            return false;
        }
        InputConditionalTextOrSelect inputConditionalTextOrSelect = (InputConditionalTextOrSelect) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputConditionalTextOrSelect.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputConditionalTextOrSelect.placeholder) && Intrinsics.EZpvd(this.choices, inputConditionalTextOrSelect.choices) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputConditionalTextOrSelect.valueName) && Intrinsics.EZpvd(this.rules, inputConditionalTextOrSelect.rules) && Intrinsics.EZpvd(this.enabled, inputConditionalTextOrSelect.enabled) && Intrinsics.EZpvd(this.isHidden, inputConditionalTextOrSelect.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputConditionalTextOrSelect.id) && Intrinsics.EZpvd(this.required, inputConditionalTextOrSelect.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputConditionalTextOrSelect.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputConditionalTextOrSelect.value) && Intrinsics.EZpvd(this.bottomMargin, inputConditionalTextOrSelect.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputConditionalTextOrSelect.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices getChoices() {
        return this.choices;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.label;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.placeholder;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Choices choices = this.choices;
        int iHashCode3 = choices == null ? 0 : choices.hashCode();
        String str3 = this.valueName;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<Rule> list = this.rules;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Boolean bool = this.enabled;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isHidden;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode9 = bool3 == null ? 0 : bool3.hashCode();
        String str4 = this.version;
        int iHashCode10 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.value;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        Float f = this.bottomMargin;
        int iHashCode12 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "InputConditionalTextOrSelect(label=" + this.label + ", placeholder=" + this.placeholder + ", choices=" + this.choices + ", valueName=" + this.valueName + ", rules=" + this.rules + ", enabled=" + this.enabled + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        Choices choices = this.choices;
        if (choices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            choices.writeToParcel(parcel, i);
        }
        parcel.writeString(this.valueName);
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
        Boolean bool = this.enabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelect.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputConditionalTextOrSelect> serializer() {
            return InputConditionalTextOrSelect$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputConditionalTextOrSelect(int i, String str, String str2, Choices choices, String str3, List list, Boolean bool, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (8084 != (i & 8084)) {
            PluginExceptionsKt.throwMissingFieldException(i, 8084, InputConditionalTextOrSelect$$serializer.INSTANCE.getDescriptor());
        }
        this.label = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str2;
        }
        this.choices = choices;
        if ((i & 8) == 0) {
            this.valueName = null;
        } else {
            this.valueName = str3;
        }
        this.rules = list;
        this.enabled = (i & 32) == 0 ? Boolean.TRUE : bool;
        this.isHidden = (i & 64) == 0 ? Boolean.FALSE : bool2;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputConditionalTextOrSelect inputConditionalTextOrSelect, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(inputConditionalTextOrSelect, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputConditionalTextOrSelect.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputConditionalTextOrSelect.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputConditionalTextOrSelect.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputConditionalTextOrSelect.placeholder);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, Choices$$serializer.INSTANCE, inputConditionalTextOrSelect.choices);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputConditionalTextOrSelect.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, inputConditionalTextOrSelect.valueName);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], inputConditionalTextOrSelect.rules);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(inputConditionalTextOrSelect.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inputConditionalTextOrSelect.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputConditionalTextOrSelect.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputConditionalTextOrSelect.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, inputConditionalTextOrSelect.getId());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inputConditionalTextOrSelect.getRequired());
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, inputConditionalTextOrSelect.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, inputConditionalTextOrSelect.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, inputConditionalTextOrSelect.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, inputConditionalTextOrSelect.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0040: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (r20v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (r24v0 java.lang.Boolean)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3966) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputConditionalTextOrSelect.<init>(java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputConditionalTextOrSelect(String str, String str2, Choices choices, String str3, List list, Boolean bool, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, choices, (i & 8) != 0 ? null : str3, list, (i & 32) != 0 ? Boolean.TRUE : bool, (i & 64) != 0 ? Boolean.FALSE : bool2, str4, bool3, str5, str6, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputConditionalTextOrSelect(String str, String str2, Choices choices, String str3, List<Rule> list, Boolean bool, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        this.label = str;
        this.placeholder = str2;
        this.choices = choices;
        this.valueName = str3;
        this.rules = list;
        this.enabled = bool;
        this.isHidden = bool2;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public InputConditionalTextOrSelectAppModel toAppModel() {
        return new InputConditionalTextOrSelectAppModel(this.label, this.placeholder, this.choices, this.valueName, this.rules, this.enabled, isHidden(), getId(), getRequired(), getVersion(), getValue(), getBottomMargin(), getLeftMargin());
    }
}
