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
public final class InputChoiceAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Choices choices;
    private String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final Boolean required;
    private String searchText;
    private final String type;
    private String value;
    private final String valueName;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputChoiceAppModel> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InputChoiceAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputChoiceAppModel createFromParcel(Parcel parcel) {
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
            return new InputChoiceAppModel(string, string2, string3, choicesCreateFromParcel, boolValueOf, string4, boolValueOf2, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputChoiceAppModel[] newArray(int i) {
            return new InputChoiceAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InputChoiceAppModel copy$default(InputChoiceAppModel inputChoiceAppModel, String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, String str7, int i, Object obj) {
        return inputChoiceAppModel.copy((i & 1) != 0 ? inputChoiceAppModel.type : str, (i & 2) != 0 ? inputChoiceAppModel.label : str2, (i & 4) != 0 ? inputChoiceAppModel.valueName : str3, (i & 8) != 0 ? inputChoiceAppModel.choices : choices, (i & 16) != 0 ? inputChoiceAppModel.isHidden : bool, (i & 32) != 0 ? inputChoiceAppModel.id : str4, (i & 64) != 0 ? inputChoiceAppModel.required : bool2, (i & 128) != 0 ? inputChoiceAppModel.version : str5, (i & 256) != 0 ? inputChoiceAppModel.value : str6, (i & 512) != 0 ? inputChoiceAppModel.bottomMargin : f, (i & 1024) != 0 ? inputChoiceAppModel.leftMargin : f2, (i & 2048) != 0 ? inputChoiceAppModel.searchText : str7);
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
    public final String component12() {
        return this.searchText;
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
    public final InputChoiceAppModel copy(@NotNull String str, String str2, String str3, Choices choices, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new InputChoiceAppModel(str, str2, str3, choices, bool, str4, bool2, str5, str6, f, f2, str7);
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
        if (!(obj instanceof InputChoiceAppModel)) {
            return false;
        }
        InputChoiceAppModel inputChoiceAppModel = (InputChoiceAppModel) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) inputChoiceAppModel.type) && Intrinsics.EZpvd((Object) this.label, (Object) inputChoiceAppModel.label) && Intrinsics.EZpvd((Object) this.valueName, (Object) inputChoiceAppModel.valueName) && Intrinsics.EZpvd(this.choices, inputChoiceAppModel.choices) && Intrinsics.EZpvd(this.isHidden, inputChoiceAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputChoiceAppModel.id) && Intrinsics.EZpvd(this.required, inputChoiceAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputChoiceAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputChoiceAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputChoiceAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputChoiceAppModel.leftMargin) && Intrinsics.EZpvd((Object) this.searchText, (Object) inputChoiceAppModel.searchText);
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
    public final String getSearchText() {
        return this.searchText;
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
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (f2 != null ? f2.hashCode() : 0)) * 31) + this.searchText.hashCode();
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
    public final void setSearchText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.searchText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputChoiceAppModel(type=" + this.type + ", label=" + this.label + ", valueName=" + this.valueName + ", choices=" + this.choices + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", searchText=" + this.searchText + ")";
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
        parcel.writeString(this.searchText);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputChoiceAppModel> serializer() {
            return InputChoiceAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputChoiceAppModel(int i, String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1953 != (i & 1953)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1953, InputChoiceAppModel$$serializer.INSTANCE.getDescriptor());
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
        this.isHidden = (i & 16) == 0 ? Boolean.FALSE : bool;
        this.id = str4;
        this.required = (i & 64) == 0 ? Boolean.FALSE : bool2;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.searchText = (i & 2048) == 0 ? "" : str7;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputChoiceAppModel inputChoiceAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputChoiceAppModel, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, inputChoiceAppModel.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputChoiceAppModel.label != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputChoiceAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputChoiceAppModel.valueName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputChoiceAppModel.valueName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputChoiceAppModel.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Choices$$serializer.INSTANCE, inputChoiceAppModel.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputChoiceAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputChoiceAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, inputChoiceAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputChoiceAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputChoiceAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, inputChoiceAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, inputChoiceAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, inputChoiceAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, inputChoiceAppModel.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) inputChoiceAppModel.searchText, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, inputChoiceAppModel.searchText);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0047: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Choices:?: TERNARY null = ((wrap:int:0x0013: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Choices) : (r20v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Choices))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.Float)
  (r27v0 java.lang.Float)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String):void (m)] (LINE:2880) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputChoiceAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Choices, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.String):void type: THIS */
    public /* synthetic */ InputChoiceAppModel(String str, String str2, String str3, Choices choices, Boolean bool, String str4, Boolean bool2, String str5, String str6, Float f, Float f2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : choices, (i & 16) != 0 ? Boolean.FALSE : bool, str4, (i & 64) != 0 ? Boolean.FALSE : bool2, str5, str6, f, f2, (i & 2048) != 0 ? "" : str7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputChoiceAppModel(@NotNull String str, String str2, String str3, Choices choices, Boolean bool, @NotNull String str4, Boolean bool2, String str5, String str6, Float f, Float f2, @NotNull String str7) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
        this.searchText = str7;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputChoiceAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
