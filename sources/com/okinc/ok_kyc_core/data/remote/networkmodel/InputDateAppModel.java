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
public final class InputDateAppModel extends UIComponentAppModel implements Parcelable {
    private Float bottomMargin;
    private final String dateFormat;
    private final Boolean enabled;
    private final List<String> hiddenOnErrorItemIds;
    private String id;
    private Boolean isHidden;
    private final String label;
    private final Float leftMargin;
    private final String placeholder;
    private final Boolean required;
    private final List<Rule> rules;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InputDateAppModel> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(Rule$$serializer.INSTANCE), null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InputDateAppModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateAppModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
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
            return new InputDateAppModel(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InputDateAppModel[] newArray(int i) {
            return new InputDateAppModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDateAppModel copy$default(InputDateAppModel inputDateAppModel, String str, String str2, String str3, List list, Boolean bool, List list2, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, int i, Object obj) {
        return inputDateAppModel.copy((i & 1) != 0 ? inputDateAppModel.label : str, (i & 2) != 0 ? inputDateAppModel.placeholder : str2, (i & 4) != 0 ? inputDateAppModel.dateFormat : str3, (i & 8) != 0 ? inputDateAppModel.rules : list, (i & 16) != 0 ? inputDateAppModel.enabled : bool, (i & 32) != 0 ? inputDateAppModel.hiddenOnErrorItemIds : list2, (i & 64) != 0 ? inputDateAppModel.isHidden : bool2, (i & 128) != 0 ? inputDateAppModel.id : str4, (i & 256) != 0 ? inputDateAppModel.required : bool3, (i & 512) != 0 ? inputDateAppModel.version : str5, (i & 1024) != 0 ? inputDateAppModel.value : str6, (i & 2048) != 0 ? inputDateAppModel.bottomMargin : f, (i & 4096) != 0 ? inputDateAppModel.leftMargin : f2);
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
    public final String component3() {
        return this.dateFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Rule> component4() {
        return this.rules;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.hiddenOnErrorItemIds;
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
    public final InputDateAppModel copy(String str, String str2, String str3, List<Rule> list, Boolean bool, List<String> list2, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new InputDateAppModel(str, str2, str3, list, bool, list2, bool2, str4, bool3, str5, str6, f, f2);
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
        if (!(obj instanceof InputDateAppModel)) {
            return false;
        }
        InputDateAppModel inputDateAppModel = (InputDateAppModel) obj;
        return Intrinsics.EZpvd((Object) this.label, (Object) inputDateAppModel.label) && Intrinsics.EZpvd((Object) this.placeholder, (Object) inputDateAppModel.placeholder) && Intrinsics.EZpvd((Object) this.dateFormat, (Object) inputDateAppModel.dateFormat) && Intrinsics.EZpvd(this.rules, inputDateAppModel.rules) && Intrinsics.EZpvd(this.enabled, inputDateAppModel.enabled) && Intrinsics.EZpvd(this.hiddenOnErrorItemIds, inputDateAppModel.hiddenOnErrorItemIds) && Intrinsics.EZpvd(this.isHidden, inputDateAppModel.isHidden) && Intrinsics.EZpvd((Object) this.id, (Object) inputDateAppModel.id) && Intrinsics.EZpvd(this.required, inputDateAppModel.required) && Intrinsics.EZpvd((Object) this.version, (Object) inputDateAppModel.version) && Intrinsics.EZpvd((Object) this.value, (Object) inputDateAppModel.value) && Intrinsics.EZpvd(this.bottomMargin, inputDateAppModel.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, inputDateAppModel.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDateFormat() {
        return this.dateFormat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getHiddenOnErrorItemIds() {
        return this.hiddenOnErrorItemIds;
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
        String str3 = this.dateFormat;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<Rule> list = this.rules;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Boolean bool = this.enabled;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        List<String> list2 = this.hiddenOnErrorItemIds;
        int iHashCode6 = list2 == null ? 0 : list2.hashCode();
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
        return "InputDateAppModel(label=" + this.label + ", placeholder=" + this.placeholder + ", dateFormat=" + this.dateFormat + ", rules=" + this.rules + ", enabled=" + this.enabled + ", hiddenOnErrorItemIds=" + this.hiddenOnErrorItemIds + ", isHidden=" + this.isHidden + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.label);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.dateFormat);
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
        parcel.writeStringList(this.hiddenOnErrorItemIds);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InputDateAppModel> serializer() {
            return InputDateAppModel$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputDateAppModel(int i, String str, String str2, String str3, List list, Boolean bool, List list2, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (7808 != (i & 7808)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7808, InputDateAppModel$$serializer.INSTANCE.getDescriptor());
        }
        this.label = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str2;
        }
        if ((i & 4) == 0) {
            this.dateFormat = null;
        } else {
            this.dateFormat = str3;
        }
        if ((i & 8) == 0) {
            this.rules = null;
        } else {
            this.rules = list;
        }
        this.enabled = (i & 16) == 0 ? Boolean.TRUE : bool;
        if ((i & 32) == 0) {
            this.hiddenOnErrorItemIds = null;
        } else {
            this.hiddenOnErrorItemIds = list2;
        }
        this.isHidden = (i & 64) == 0 ? Boolean.FALSE : bool2;
        this.id = str4;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InputDateAppModel inputDateAppModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponentAppModel.write$Self(inputDateAppModel, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) inputDateAppModel.label, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, inputDateAppModel.label);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inputDateAppModel.placeholder != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inputDateAppModel.placeholder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || inputDateAppModel.dateFormat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, inputDateAppModel.dateFormat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || inputDateAppModel.rules != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], inputDateAppModel.rules);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(inputDateAppModel.enabled, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, inputDateAppModel.enabled);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || inputDateAppModel.hiddenOnErrorItemIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], inputDateAppModel.hiddenOnErrorItemIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(inputDateAppModel.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, inputDateAppModel.isHidden());
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, inputDateAppModel.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(inputDateAppModel.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, inputDateAppModel.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, inputDateAppModel.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, inputDateAppModel.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, inputDateAppModel.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, inputDateAppModel.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r20v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0025: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002f: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003d: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r23v0 java.lang.Boolean))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0041: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0047: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Rule>, java.lang.Boolean, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:3387) call: com.okinc.ok_kyc_core.data.remote.networkmodel.InputDateAppModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.util.List, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ InputDateAppModel(String str, String str2, String str3, List list, Boolean bool, List list2, Boolean bool2, String str4, Boolean bool3, String str5, String str6, Float f, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? Boolean.TRUE : bool, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? Boolean.FALSE : bool2, str4, (i & 256) != 0 ? Boolean.FALSE : bool3, str5, str6, f, f2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDateAppModel(String str, String str2, String str3, List<Rule> list, Boolean bool, List<String> list2, Boolean bool2, @NotNull String str4, Boolean bool3, String str5, String str6, Float f, Float f2) {
        super(null);
        Intrinsics.checkNotNullParameter(str4, "");
        this.label = str;
        this.placeholder = str2;
        this.dateFormat = str3;
        this.rules = list;
        this.enabled = bool;
        this.hiddenOnErrorItemIds = list2;
        this.isHidden = bool2;
        this.id = str4;
        this.required = bool3;
        this.version = str5;
        this.value = str6;
        this.bottomMargin = f;
        this.leftMargin = f2;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Lcom/okinc/ok_kyc_core/data/remote/networkmodel/UIComponentAppModel; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel
    public InputDateAppModel clone() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
