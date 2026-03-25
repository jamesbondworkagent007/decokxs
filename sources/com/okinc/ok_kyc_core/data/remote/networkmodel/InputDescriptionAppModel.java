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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InputDescriptionAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final Boolean enabled;
    private String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private final List<Rule> rules;
    private boolean showInput;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDescriptionAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputDescriptionAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDescriptionAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Rule.CREATOR.createFromParcel(parcel));
                }
            }
            return new InputDescriptionAppModel(string, string2, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDescriptionAppModel[] newArray(int i) {
            return new InputDescriptionAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescriptionAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDescriptionAppModel copy$default(InputDescriptionAppModel inputDescriptionAppModel, String str, String str2, List list, Boolean bool, boolean z, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, int i, Object obj) {
        return inputDescriptionAppModel.copy((i & 1) != 0 ? inputDescriptionAppModel.label : str, (i & 2) != 0 ? inputDescriptionAppModel.placeholder : str2, (i & 4) != 0 ? inputDescriptionAppModel.rules : list, (i & 8) != 0 ? inputDescriptionAppModel.enabled : bool, (i & 16) != 0 ? inputDescriptionAppModel.showInput : z, (i & 32) != 0 ? inputDescriptionAppModel.isHidden : bool2, (i & 64) != 0 ? inputDescriptionAppModel.id : str3, (i & 128) != 0 ? inputDescriptionAppModel.required : bool3, (i & 256) != 0 ? inputDescriptionAppModel.version : str4, (i & 512) != 0 ? inputDescriptionAppModel.value : str5, (i & 1024) != 0 ? inputDescriptionAppModel.bottomMargin : f, (i & 2048) != 0 ? inputDescriptionAppModel.leftMargin : f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.label;
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
        return this.placeholder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component3() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.showInput;
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
    public final InputDescriptionAppModel copy(String str, String str2, List<Rule> list, Boolean bool, boolean z, Boolean bool2, @NotNull String str3, Boolean bool3, String str4, String str5, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str3, "");
        return new InputDescriptionAppModel(str, str2, list, bool, z, bool2, str3, bool3, str4, str5, f, f2);
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
        if (!(obj instanceof InputDescriptionAppModel)) {
            return false;
        }
        InputDescriptionAppModel inputDescriptionAppModel = (InputDescriptionAppModel) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputDescriptionAppModel.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputDescriptionAppModel.placeholder) && Intrinsics.EZpvd(this.rules, inputDescriptionAppModel.rules) && Intrinsics.EZpvd(this.enabled, inputDescriptionAppModel.enabled) && this.showInput == inputDescriptionAppModel.showInput && Intrinsics.EZpvd(this.isHidden, inputDescriptionAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputDescriptionAppModel.id) && Intrinsics.EZpvd(this.required, inputDescriptionAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputDescriptionAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputDescriptionAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputDescriptionAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputDescriptionAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
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
    public final String getPlaceholder() {
        return this.placeholder;
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
    public final boolean getShowInput() {
        return this.showInput;
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
        String str = this.label;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.placeholder;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<Rule> list = this.rules;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        Boolean bool = this.enabled;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        int iHashCode5 = Boolean.hashCode(this.showInput);
        Boolean bool2 = this.isHidden;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        int iHashCode7 = this.id.hashCode();
        Boolean bool3 = this.required;
        int iHashCode8 = bool3 == null ? 0 : bool3.hashCode();
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
    public final void setShowInput(boolean z) {
        this.showInput = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InputDescriptionAppModel(label=" + this.label + ", placeholder=" + this.placeholder + ", rules=" + this.rules + ", enabled=" + this.enabled + ", showInput=" + this.showInput + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
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
        parcel.writeInt(this.showInput ? 1 : 0);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescriptionAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDescriptionAppModel> serializer() {
            return InputDescriptionAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputDescriptionAppModel(int i, String str, String str2, List list, Boolean bool, boolean z, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3908 != (i & 3908)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3908, InputDescriptionAppModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.placeholder = "";
        } else {
            this.placeholder = str2;
        }
        this.rules = list;
        this.enabled = (i & 8) == 0 ? Boolean.TRUE : bool;
        this.showInput = (i & 16) == 0 ? true : z;
        this.isHidden = (i & 32) == 0 ? Boolean.FALSE : bool2;
        this.id = str3;
        this.required = (i & 128) == 0 ? Boolean.FALSE : bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDescriptionAppModel inputDescriptionAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputDescriptionAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputDescriptionAppModel.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputDescriptionAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) inputDescriptionAppModel.placeholder, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputDescriptionAppModel.placeholder);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], inputDescriptionAppModel.rules);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(inputDescriptionAppModel.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, inputDescriptionAppModel.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !inputDescriptionAppModel.showInput) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, inputDescriptionAppModel.showInput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(inputDescriptionAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, inputDescriptionAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, inputDescriptionAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(inputDescriptionAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, inputDescriptionAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, inputDescriptionAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, inputDescriptionAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, inputDescriptionAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, inputDescriptionAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (r19v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
  (r23v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Float)
  (r28v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3906) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDescriptionAppModel.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputDescriptionAppModel(String str, String str2, List list, Boolean bool, boolean z, Boolean bool2, String str3, Boolean bool3, String str4, String str5, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, list, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? true : z, (i & 32) != 0 ? Boolean.FALSE : bool2, str3, (i & 128) != 0 ? Boolean.FALSE : bool3, str4, str5, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDescriptionAppModel(String str, String str2, List<Rule> list, Boolean bool, boolean z, Boolean bool2, @NotNull String str3, Boolean bool3, String str4, String str5, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str3, "");
        this.label = str;
        this.placeholder = str2;
        this.rules = list;
        this.enabled = bool;
        this.showInput = z;
        this.isHidden = bool2;
        this.id = str3;
        this.required = bool3;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputDescriptionAppModel clone() {
        return copy$default(this, null, null, null, null, false, null, null, null, null, null, null, null, 4095, null);
    }
}
