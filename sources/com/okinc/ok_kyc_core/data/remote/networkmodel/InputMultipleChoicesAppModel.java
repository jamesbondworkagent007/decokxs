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
public final class InputMultipleChoicesAppModel extends UIComponentAppModel implements Parcelable {
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
    public static final Parcelable.Creator<InputMultipleChoicesAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputMultipleChoicesAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputMultipleChoicesAppModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Choices choicesCreateFromParcel = parcel.readInt() == 0 ? null : Choices.CREATOR.createFromParcel(parcel);
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
            return new InputMultipleChoicesAppModel(string, string2, string3, choicesCreateFromParcel, boolValueOf, string4, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputMultipleChoicesAppModel[] newArray(int i) {
            return new InputMultipleChoicesAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputMultipleChoicesAppModel copy$default(InputMultipleChoicesAppModel inputMultipleChoicesAppModel, String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, int i, Object obj) {
        return inputMultipleChoicesAppModel.copy((i & 1) != 0 ? inputMultipleChoicesAppModel.type : str, (i & 2) != 0 ? inputMultipleChoicesAppModel.label : str2, (i & 4) != 0 ? inputMultipleChoicesAppModel.valueName : str3, (i & 8) != 0 ? inputMultipleChoicesAppModel.choices : choices, (i & 16) != 0 ? inputMultipleChoicesAppModel.isHidden : bool, (i & 32) != 0 ? inputMultipleChoicesAppModel.id : str4, (i & 64) != 0 ? inputMultipleChoicesAppModel.required : bool2, (i & 128) != 0 ? inputMultipleChoicesAppModel.version : str5, (i & 256) != 0 ? inputMultipleChoicesAppModel.value : str6, (i & 512) != 0 ? inputMultipleChoicesAppModel.bottomMargin : f, (i & 1024) != 0 ? inputMultipleChoicesAppModel.leftMargin : f2);
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
    public final InputMultipleChoicesAppModel copy(@NotNull String str, String str2, String str3, Choices choices, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputMultipleChoicesAppModel(str, str2, str3, choices, bool, str4, bool2, str5, str6, f, f2);
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
        if (!(obj instanceof InputMultipleChoicesAppModel)) {
            return false;
        }
        InputMultipleChoicesAppModel inputMultipleChoicesAppModel = (InputMultipleChoicesAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) inputMultipleChoicesAppModel.type) && Intrinsics.EZpvd((Object) this.label, (Object) inputMultipleChoicesAppModel.label) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputMultipleChoicesAppModel.valueName) && Intrinsics.EZpvd(this.choices, inputMultipleChoicesAppModel.choices) && Intrinsics.EZpvd(this.isHidden, inputMultipleChoicesAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputMultipleChoicesAppModel.id) && Intrinsics.EZpvd(this.required, inputMultipleChoicesAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputMultipleChoicesAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputMultipleChoicesAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputMultipleChoicesAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputMultipleChoicesAppModel.leftMargin);
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
        Boolean bool = this.isHidden;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        int iHashCode6 = this.id.hashCode();
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
        return "InputMultipleChoicesAppModel(type=" + this.type + ", label=" + this.label + ", valueName=" + this.valueName + ", choices=" + this.choices + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputMultipleChoicesAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputMultipleChoicesAppModel> serializer() {
            return InputMultipleChoicesAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputMultipleChoicesAppModel(int i, String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1953 != (i & 1953)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1953, InputMultipleChoicesAppModel$$serializer.INSTANCE.getDescriptor());
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
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str4;
        if ((i & 64) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputMultipleChoicesAppModel inputMultipleChoicesAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputMultipleChoicesAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inputMultipleChoicesAppModel.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputMultipleChoicesAppModel.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputMultipleChoicesAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputMultipleChoicesAppModel.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputMultipleChoicesAppModel.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputMultipleChoicesAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, inputMultipleChoicesAppModel.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputMultipleChoicesAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputMultipleChoicesAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, inputMultipleChoicesAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputMultipleChoicesAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputMultipleChoicesAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, inputMultipleChoicesAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, inputMultipleChoicesAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, inputMultipleChoicesAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, inputMultipleChoicesAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r18v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (r20v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0029: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.Float)
  (r25v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3044) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputMultipleChoicesAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputMultipleChoicesAppModel(String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : choices, (i & 16) != 0 ? Boolean.FALSE : bool, str4, (i & 64) != 0 ? Boolean.FALSE : bool2, str5, str6, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputMultipleChoicesAppModel(@NotNull String str, String str2, String str3, Choices choices, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.label = str2;
        this.valueName = str3;
        this.choices = choices;
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
    public InputMultipleChoicesAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
