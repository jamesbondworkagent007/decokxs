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
public final class InputChoiceWithSubInputAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Choices choices;
    private String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final Boolean required;
    private Value selectValue;
    private final String type;
    private String value;
    private final String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputChoiceWithSubInputAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputChoiceWithSubInputAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputChoiceWithSubInputAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Choices choicesCreateFromParcel = parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel);
            Value valueCreateFromParcel = parcel.readInt() == 0 ? null : Value.CREATOR.createFromParcel(parcel);
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
            return new InputChoiceWithSubInputAppModel(string, string2, string3, choicesCreateFromParcel, valueCreateFromParcel, boolValueOf, string4, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputChoiceWithSubInputAppModel[] newArray(int i) {
            return new InputChoiceWithSubInputAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputChoiceWithSubInputAppModel copy$default(InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel, String str, String str2, String str3, Choices choices, Value value, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, int i, Object obj) {
        return inputChoiceWithSubInputAppModel.copy((i & 1) != 0 ? inputChoiceWithSubInputAppModel.type : str, (i & 2) != 0 ? inputChoiceWithSubInputAppModel.label : str2, (i & 4) != 0 ? inputChoiceWithSubInputAppModel.valueName : str3, (i & 8) != 0 ? inputChoiceWithSubInputAppModel.choices : choices, (i & 16) != 0 ? inputChoiceWithSubInputAppModel.selectValue : value, (i & 32) != 0 ? inputChoiceWithSubInputAppModel.isHidden : bool, (i & 64) != 0 ? inputChoiceWithSubInputAppModel.id : str4, (i & 128) != 0 ? inputChoiceWithSubInputAppModel.required : bool2, (i & 256) != 0 ? inputChoiceWithSubInputAppModel.version : str5, (i & 512) != 0 ? inputChoiceWithSubInputAppModel.value : str6, (i & 1024) != 0 ? inputChoiceWithSubInputAppModel.bottomMargin : f, (i & 2048) != 0 ? inputChoiceWithSubInputAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
    public final String component3() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices component4() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Value component5() {
        return this.selectValue;
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
    public final InputChoiceWithSubInputAppModel copy(@NotNull String str, String str2, String str3, Choices choices, Value value, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputChoiceWithSubInputAppModel(str, str2, str3, choices, value, bool, str4, bool2, str5, str6, f, f2);
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
        if (!(obj instanceof InputChoiceWithSubInputAppModel)) {
            return false;
        }
        InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel = (InputChoiceWithSubInputAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) inputChoiceWithSubInputAppModel.type) && Intrinsics.EZpvd((Object) this.label, (Object) inputChoiceWithSubInputAppModel.label) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputChoiceWithSubInputAppModel.valueName) && Intrinsics.EZpvd(this.choices, inputChoiceWithSubInputAppModel.choices) && Intrinsics.EZpvd(this.selectValue, inputChoiceWithSubInputAppModel.selectValue) && Intrinsics.EZpvd(this.isHidden, inputChoiceWithSubInputAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputChoiceWithSubInputAppModel.id) && Intrinsics.EZpvd(this.required, inputChoiceWithSubInputAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputChoiceWithSubInputAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputChoiceWithSubInputAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputChoiceWithSubInputAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputChoiceWithSubInputAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
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
    public final Value getSelectValue() {
        return this.selectValue;
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
    public final String getValueName() {
        return this.valueName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.label;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.valueName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Choices choices = this.choices;
        int iHashCode4 = choices == null ? 0 : choices.hashCode();
        Value value = this.selectValue;
        int iHashCode5 = value == null ? 0 : value.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode8 = bool2 == null ? 0 : bool2.hashCode();
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
    public final void setSelectValue(Value value) {
        this.selectValue = value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputChoiceWithSubInputAppModel(type=" + this.type + ", label=" + this.label + ", valueName=" + this.valueName + ", choices=" + this.choices + ", selectValue=" + this.selectValue + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeString(this.label);
        parcel.writeString(this.valueName);
        Choices choices = this.choices;
        if (choices == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            choices.writeToParcel(parcel, i);
        }
        Value value = this.selectValue;
        if (value == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            value.writeToParcel(parcel, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInputAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputChoiceWithSubInputAppModel> serializer() {
            return InputChoiceWithSubInputAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputChoiceWithSubInputAppModel(int i, String str, String str2, String str3, Choices choices, Value value, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3905 != (i & 3905)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3905, InputChoiceWithSubInputAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i & 4) == 0) {
            this.valueName = null;
        } else {
            this.valueName = str3;
        }
        if ((i & 8) == 0) {
            this.choices = null;
        } else {
            this.choices = choices;
        }
        if ((i & 16) == 0) {
            this.selectValue = null;
        } else {
            this.selectValue = value;
        }
        this.isHidden = (i & 32) == 0 ? Boolean.FALSE : bool;
        this.id = str4;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputChoiceWithSubInputAppModel inputChoiceWithSubInputAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputChoiceWithSubInputAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inputChoiceWithSubInputAppModel.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputChoiceWithSubInputAppModel.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputChoiceWithSubInputAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputChoiceWithSubInputAppModel.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputChoiceWithSubInputAppModel.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputChoiceWithSubInputAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, inputChoiceWithSubInputAppModel.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || inputChoiceWithSubInputAppModel.selectValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, Value$$serializer.INSTANCE, inputChoiceWithSubInputAppModel.selectValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(inputChoiceWithSubInputAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inputChoiceWithSubInputAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, inputChoiceWithSubInputAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(inputChoiceWithSubInputAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, inputChoiceWithSubInputAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, inputChoiceWithSubInputAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, inputChoiceWithSubInputAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, inputChoiceWithSubInputAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, inputChoiceWithSubInputAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Value:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Value) : (r21v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Value))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, com.okinc.ok_kyc_core.data.remote.networkmodel.Value, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2756) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceWithSubInputAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, com.okinc.ok_kyc_core.data.remote.networkmodel.Value, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputChoiceWithSubInputAppModel(String str, String str2, String str3, Choices choices, Value value, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : choices, (i & 16) != 0 ? null : value, (i & 32) != 0 ? Boolean.FALSE : bool, str4, (i & 128) != 0 ? Boolean.FALSE : bool2, str5, str6, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputChoiceWithSubInputAppModel(@NotNull String str, String str2, String str3, Choices choices, Value value, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.label = str2;
        this.valueName = str3;
        this.choices = choices;
        this.selectValue = value;
        this.isHidden = bool;
        this.id = str4;
        this.required = bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputChoiceWithSubInputAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
