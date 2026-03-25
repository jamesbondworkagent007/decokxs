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
public final class InputCardAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Choices choices;
    private String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final Boolean required;
    private final String type;
    private String value;
    private final String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputCardAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputCardAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCardAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Choices choicesCreateFromParcel = parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Float fValueOf2 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InputCardAppModel(string, string2, string3, choicesCreateFromParcel, string4, boolValueOf, string5, string6, fValueOf, fValueOf2, boolValueOf2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCardAppModel[] newArray(int i) {
            return new InputCardAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputCardAppModel copy$default(InputCardAppModel inputCardAppModel, String str, String str2, String str3, Choices choices, String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2, int i, Object obj) {
        return inputCardAppModel.copy((i & 1) != 0 ? inputCardAppModel.type : str, (i & 2) != 0 ? inputCardAppModel.label : str2, (i & 4) != 0 ? inputCardAppModel.valueName : str3, (i & 8) != 0 ? inputCardAppModel.choices : choices, (i & 16) != 0 ? inputCardAppModel.id : str4, (i & 32) != 0 ? inputCardAppModel.required : bool, (i & 64) != 0 ? inputCardAppModel.version : str5, (i & 128) != 0 ? inputCardAppModel.value : str6, (i & 256) != 0 ? inputCardAppModel.bottomMargin : f, (i & 512) != 0 ? inputCardAppModel.leftMargin : f2, (i & 1024) != 0 ? inputCardAppModel.isHidden : bool2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.isHidden;
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
    public final String component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputCardAppModel copy(@NotNull String str, String str2, String str3, Choices choices, @NotNull String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputCardAppModel(str, str2, str3, choices, str4, bool, str5, str6, f, f2, bool2);
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
        if (!(obj instanceof InputCardAppModel)) {
            return false;
        }
        InputCardAppModel inputCardAppModel = (InputCardAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) inputCardAppModel.type) && Intrinsics.EZpvd((Object) this.label, (Object) inputCardAppModel.label) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputCardAppModel.valueName) && Intrinsics.EZpvd(this.choices, inputCardAppModel.choices) && Intrinsics.EZpvd((Object) this.id, (Object) inputCardAppModel.id) && Intrinsics.EZpvd(this.required, inputCardAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputCardAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputCardAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputCardAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputCardAppModel.leftMargin) && Intrinsics.EZpvd(this.isHidden, inputCardAppModel.isHidden);
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
        int iHashCode5 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str3 = this.version;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.value;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        Float f = this.bottomMargin;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode10 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool2 != null ? bool2.hashCode() : 0);
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
        return "InputCardAppModel(type=" + this.type + ", label=" + this.label + ", valueName=" + this.valueName + ", choices=" + this.choices + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
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
        parcel.writeString(this.id);
        Boolean bool = this.required;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
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
        Boolean bool2 = this.isHidden;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputCardAppModel> serializer() {
            return InputCardAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputCardAppModel(int i, String str, String str2, String str3, Choices choices, String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (977 != (i & 977)) {
            PluginExceptionsKt.throwMissingFieldException(i, 977, InputCardAppModel$$serializer.INSTANCE.getDescriptor());
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
        this.id = str4;
        if ((i & 32) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool;
        }
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        if ((i & 1024) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputCardAppModel inputCardAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputCardAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inputCardAppModel.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputCardAppModel.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputCardAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputCardAppModel.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputCardAppModel.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputCardAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, inputCardAppModel.choices);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, inputCardAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(inputCardAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inputCardAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, inputCardAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, inputCardAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, inputCardAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, inputCardAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(inputCardAppModel.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, inputCardAppModel.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r19v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (r20v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.Float)
  (r25v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r26v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:2417) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCardAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ InputCardAppModel(String str, String str2, String str3, Choices choices, String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : choices, str4, (i & 32) != 0 ? Boolean.FALSE : bool, str5, str6, f, f2, (i & 1024) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCardAppModel(@NotNull String str, String str2, String str3, Choices choices, @NotNull String str4, Boolean bool, String str5, String str6, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.label = str2;
        this.valueName = str3;
        this.choices = choices;
        this.id = str4;
        this.required = bool;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputCardAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
