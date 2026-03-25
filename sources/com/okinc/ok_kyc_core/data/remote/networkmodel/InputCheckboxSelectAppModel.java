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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InputCheckboxSelectAppModel extends UIComponentAppModel {
    private Float bottomMargin;
    private final Boolean enableSelectAll;
    private final List<CheckboxGroupedValues> groupedValues;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final String selectAllText;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputCheckboxSelectAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CheckboxGroupedValues$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputCheckboxSelectAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxSelectAppModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CheckboxGroupedValues.CREATOR.createFromParcel(parcel));
            }
            return new InputCheckboxSelectAppModel(arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputCheckboxSelectAppModel[] newArray(int i) {
            return new InputCheckboxSelectAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelectAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputCheckboxSelectAppModel copy$default(InputCheckboxSelectAppModel inputCheckboxSelectAppModel, List list, String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, Boolean bool3, Float f, Float f2, int i, Object obj) {
        return inputCheckboxSelectAppModel.copy((i & 1) != 0 ? inputCheckboxSelectAppModel.groupedValues : list, (i & 2) != 0 ? inputCheckboxSelectAppModel.selectAllText : str, (i & 4) != 0 ? inputCheckboxSelectAppModel.enableSelectAll : bool, (i & 8) != 0 ? inputCheckboxSelectAppModel.id : str2, (i & 16) != 0 ? inputCheckboxSelectAppModel.required : bool2, (i & 32) != 0 ? inputCheckboxSelectAppModel.version : str3, (i & 64) != 0 ? inputCheckboxSelectAppModel.value : str4, (i & 128) != 0 ? inputCheckboxSelectAppModel.isHidden : bool3, (i & 256) != 0 ? inputCheckboxSelectAppModel.bottomMargin : f, (i & 512) != 0 ? inputCheckboxSelectAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CheckboxGroupedValues> component1() {
        return this.groupedValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.selectAllText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.enableSelectAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputCheckboxSelectAppModel copy(@NotNull List<CheckboxGroupedValues> list, String str, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Boolean bool3, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new InputCheckboxSelectAppModel(list, str, bool, str2, bool2, str3, str4, bool3, f, f2);
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
        if (!(obj instanceof InputCheckboxSelectAppModel)) {
            return false;
        }
        InputCheckboxSelectAppModel inputCheckboxSelectAppModel = (InputCheckboxSelectAppModel) obj;
        return Intrinsics.EZpvd(this.groupedValues, inputCheckboxSelectAppModel.groupedValues) && Intrinsics.EZpvd((Object) this.selectAllText, (Object) inputCheckboxSelectAppModel.selectAllText) && Intrinsics.EZpvd(this.enableSelectAll, inputCheckboxSelectAppModel.enableSelectAll) && Intrinsics.EZpvd((Object) this.id, (Object) inputCheckboxSelectAppModel.id) && Intrinsics.EZpvd(this.required, inputCheckboxSelectAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputCheckboxSelectAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputCheckboxSelectAppModel.value) && Intrinsics.EZpvd(this.isHidden, inputCheckboxSelectAppModel.isHidden) && Intrinsics.EZpvd(this.bottomMargin, inputCheckboxSelectAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputCheckboxSelectAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnableSelectAll() {
        return this.enableSelectAll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CheckboxGroupedValues> getGroupedValues() {
        return this.groupedValues;
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
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSelectAllText() {
        return this.selectAllText;
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
        int iHashCode = this.groupedValues.hashCode();
        String str = this.selectAllText;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Boolean bool = this.enableSelectAll;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        int iHashCode4 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode5 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        Boolean bool3 = this.isHidden;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode9 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (f2 != null ? f2.hashCode() : 0);
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
        return "InputCheckboxSelectAppModel(groupedValues=" + this.groupedValues + ", selectAllText=" + this.selectAllText + ", enableSelectAll=" + this.enableSelectAll + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", isHidden=" + this.isHidden + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CheckboxGroupedValues> list = this.groupedValues;
        parcel.writeInt(list.size());
        Iterator<CheckboxGroupedValues> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectAllText);
        Boolean bool = this.enableSelectAll;
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
        Boolean bool3 = this.isHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelectAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputCheckboxSelectAppModel> serializer() {
            return InputCheckboxSelectAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputCheckboxSelectAppModel(int i, List list, String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, Boolean bool3, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (808 != (i & 808)) {
            PluginExceptionsKt.throwMissingFieldException(i, 808, InputCheckboxSelectAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.groupedValues = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.selectAllText = "";
        } else {
            this.selectAllText = str;
        }
        if ((i & 4) == 0) {
            this.enableSelectAll = Boolean.FALSE;
        } else {
            this.enableSelectAll = bool;
        }
        this.id = str2;
        if ((i & 16) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str3;
        if ((i & 64) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 128) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool3;
        }
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputCheckboxSelectAppModel inputCheckboxSelectAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputCheckboxSelectAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(inputCheckboxSelectAppModel.groupedValues, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], inputCheckboxSelectAppModel.groupedValues);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inputCheckboxSelectAppModel.selectAllText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputCheckboxSelectAppModel.selectAllText);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(inputCheckboxSelectAppModel.enableSelectAll, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, inputCheckboxSelectAppModel.enableSelectAll);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, inputCheckboxSelectAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputCheckboxSelectAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputCheckboxSelectAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, inputCheckboxSelectAppModel.getVersion());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) inputCheckboxSelectAppModel.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, inputCheckboxSelectAppModel.getValue());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(inputCheckboxSelectAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, inputCheckboxSelectAppModel.isHidden());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, inputCheckboxSelectAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, inputCheckboxSelectAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0045: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:5226)) : (r14v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (r22v0 java.lang.Float)
  (r23v0 java.lang.Float)
 A[MD:(java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.CheckboxGroupedValues>, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void (m)] (LINE:5225) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputCheckboxSelectAppModel.<init>(java.util.List, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputCheckboxSelectAppModel(List list, String str, Boolean bool, String str2, Boolean bool2, String str3, String str4, Boolean bool3, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? Boolean.FALSE : bool, str2, (i & 16) != 0 ? Boolean.FALSE : bool2, str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? Boolean.FALSE : bool3, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputCheckboxSelectAppModel(@NotNull List<CheckboxGroupedValues> list, String str, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Boolean bool3, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.groupedValues = list;
        this.selectAllText = str;
        this.enableSelectAll = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.isHidden = bool3;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputCheckboxSelectAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
