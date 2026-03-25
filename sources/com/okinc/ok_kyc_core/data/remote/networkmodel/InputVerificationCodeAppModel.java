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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InputVerificationCodeAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Integer numOfDigits;
    private final Boolean required;
    private final List<Rule> rules;
    private final String size;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputVerificationCodeAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputVerificationCodeAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputVerificationCodeAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputVerificationCodeAppModel(numValueOf, string, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputVerificationCodeAppModel[] newArray(int i) {
            return new InputVerificationCodeAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputVerificationCodeAppModel copy$default(InputVerificationCodeAppModel inputVerificationCodeAppModel, Integer num, String str, List list, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, int i, Object obj) {
        return inputVerificationCodeAppModel.copy((i & 1) != 0 ? inputVerificationCodeAppModel.numOfDigits : num, (i & 2) != 0 ? inputVerificationCodeAppModel.size : str, (i & 4) != 0 ? inputVerificationCodeAppModel.rules : list, (i & 8) != 0 ? inputVerificationCodeAppModel.isHidden : bool, (i & 16) != 0 ? inputVerificationCodeAppModel.id : str2, (i & 32) != 0 ? inputVerificationCodeAppModel.required : bool2, (i & 64) != 0 ? inputVerificationCodeAppModel.version : str3, (i & 128) != 0 ? inputVerificationCodeAppModel.value : str4, (i & 256) != 0 ? inputVerificationCodeAppModel.bottomMargin : f, (i & 512) != 0 ? inputVerificationCodeAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.numOfDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component3() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isHidden;
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
    public final InputVerificationCodeAppModel copy(Integer num, String str, List<Rule> list, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new InputVerificationCodeAppModel(num, str, list, bool, str2, bool2, str3, str4, f, f2);
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
        if (!(obj instanceof InputVerificationCodeAppModel)) {
            return false;
        }
        InputVerificationCodeAppModel inputVerificationCodeAppModel = (InputVerificationCodeAppModel) obj;
        return Intrinsics.EZpvd(this.numOfDigits, inputVerificationCodeAppModel.numOfDigits) && Intrinsics.EZpvd((Object) this.size, (Object) inputVerificationCodeAppModel.size) && Intrinsics.EZpvd(this.rules, inputVerificationCodeAppModel.rules) && Intrinsics.EZpvd(this.isHidden, inputVerificationCodeAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputVerificationCodeAppModel.id) && Intrinsics.EZpvd(this.required, inputVerificationCodeAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputVerificationCodeAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputVerificationCodeAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputVerificationCodeAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputVerificationCodeAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
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
    public final Integer getNumOfDigits() {
        return this.numOfDigits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> getRules() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSize() {
        return this.size;
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
        Integer num = this.numOfDigits;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.size;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<Rule> list = this.rules;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        int iHashCode5 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        String str2 = this.version;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
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
        return "InputVerificationCodeAppModel(numOfDigits=" + this.numOfDigits + ", size=" + this.size + ", rules=" + this.rules + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.numOfDigits;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.size);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputVerificationCodeAppModel> serializer() {
            return InputVerificationCodeAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputVerificationCodeAppModel(int i, Integer num, String str, List list, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (976 != (i & 976)) {
            PluginExceptionsKt.throwMissingFieldException(i, 976, InputVerificationCodeAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.numOfDigits = (i & 1) == 0 ? 4 : num;
        if ((i & 2) == 0) {
            this.size = "md";
        } else {
            this.size = str;
        }
        if ((i & 4) == 0) {
            this.rules = null;
        } else {
            this.rules = list;
        }
        if ((i & 8) == 0) {
            this.isHidden = Boolean.FALSE;
        } else {
            this.isHidden = bool;
        }
        this.id = str2;
        if ((i & 32) == 0) {
            this.required = Boolean.FALSE;
        } else {
            this.required = bool2;
        }
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputVerificationCodeAppModel inputVerificationCodeAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        UIComponentAppModel.write$Self(inputVerificationCodeAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = inputVerificationCodeAppModel.numOfDigits) == null || num.intValue() != 4) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, inputVerificationCodeAppModel.numOfDigits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inputVerificationCodeAppModel.size, (Object) "md")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputVerificationCodeAppModel.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputVerificationCodeAppModel.rules != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], inputVerificationCodeAppModel.rules);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(inputVerificationCodeAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inputVerificationCodeAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, inputVerificationCodeAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(inputVerificationCodeAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inputVerificationCodeAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, inputVerificationCodeAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, inputVerificationCodeAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, inputVerificationCodeAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, inputVerificationCodeAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("md") : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0023: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (r17v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.Float)
  (r22v0 java.lang.Float)
 A[MD:(java.lang.Integer, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3771) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputVerificationCodeAppModel.<init>(java.lang.Integer, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputVerificationCodeAppModel(Integer num, String str, List list, Boolean bool, String str2, Boolean bool2, String str3, String str4, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 4 : num, (i & 2) != 0 ? "md" : str, (i & 4) != 0 ? null : list, (i & 8) != 0 ? Boolean.FALSE : bool, str2, (i & 32) != 0 ? Boolean.FALSE : bool2, str3, str4, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputVerificationCodeAppModel(Integer num, String str, List<Rule> list, Boolean bool, @NotNull String str2, Boolean bool2, String str3, String str4, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str2, "");
        this.numOfDigits = num;
        this.size = str;
        this.rules = list;
        this.isHidden = bool;
        this.id = str2;
        this.required = bool2;
        this.version = str3;
        this.value = str4;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputVerificationCodeAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
