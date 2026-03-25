package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("editable-list")
@Serializable
public final class EditableList extends UIComponent {
    private AddMore addMore;
    private Float bottomMargin;
    private final Integer count;
    private final Integer defaultCount;
    private final Float deleteTopMargin;
    private final String id;
    private Boolean isHidden;
    private final Float leftMargin;
    private final Boolean required;
    private final JsonArray template;
    private String value;
    private List<? extends HashMap<String, ValueAndName>> values;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditableList> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(new HashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(ValueAndName$$serializer.INSTANCE))), null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<EditableList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditableList createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Float fValueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            JsonArray jsonArray = (JsonArray) parcel.readValue(EditableList.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    int i3 = parcel.readInt();
                    HashMap map = new HashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        map.put(parcel.readString(), parcel.readInt() == 0 ? null : ValueAndName.CREATOR.createFromParcel(parcel));
                    }
                    arrayList2.add(map);
                }
                arrayList = arrayList2;
            }
            return new EditableList(numValueOf, numValueOf2, fValueOf, boolValueOf, jsonArray, arrayList, parcel.readInt() == 0 ? null : AddMore.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditableList[] newArray(int i) {
            return new EditableList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.count;
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
    public final Integer component2() {
        return this.defaultCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.deleteTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component5() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, java.util.List<java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>> */
    public final List<HashMap<String, ValueAndName>> component6() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddMore component7() {
        return this.addMore;
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
    public final EditableList copy(Integer num, Integer num2, Float f, Boolean bool, @NotNull JsonArray jsonArray, List<? extends HashMap<String, ValueAndName>> list, AddMore addMore, @NotNull String str, Boolean bool2, String str2, String str3, Float f2, Float f3) {
        Intrinsics.checkNotNullParameter(jsonArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EditableList(num, num2, f, bool, jsonArray, list, addMore, str, bool2, str2, str3, f2, f3);
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
        if (!(obj instanceof EditableList)) {
            return false;
        }
        EditableList editableList = (EditableList) obj;
        return Intrinsics.EZpvd(this.count, editableList.count) && Intrinsics.EZpvd(this.defaultCount, editableList.defaultCount) && Intrinsics.EZpvd(this.deleteTopMargin, editableList.deleteTopMargin) && Intrinsics.EZpvd(this.isHidden, editableList.isHidden) && Intrinsics.EZpvd(this.template, editableList.template) && Intrinsics.EZpvd(this.values, editableList.values) && Intrinsics.EZpvd(this.addMore, editableList.addMore) && Intrinsics.EZpvd((Object) this.id, (Object) editableList.id) && Intrinsics.EZpvd(this.required, editableList.required) && Intrinsics.EZpvd((Object) this.version, (Object) editableList.version) && Intrinsics.EZpvd((Object) this.value, (Object) editableList.value) && Intrinsics.EZpvd(this.bottomMargin, editableList.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, editableList.leftMargin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddMore getAddMore() {
        return this.addMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCount() {
        return this.count;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDefaultCount() {
        return this.defaultCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getDeleteTopMargin() {
        return this.deleteTopMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getLeftMargin() {
        return this.leftMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean getRequired() {
        return this.required;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getTemplate() {
        return this.template;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, java.util.List<java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>> */
    public final List<HashMap<String, ValueAndName>> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.count;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.defaultCount;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Float f = this.deleteTopMargin;
        int iHashCode3 = f == null ? 0 : f.hashCode();
        Boolean bool = this.isHidden;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        int iHashCode5 = this.template.hashCode();
        List<? extends HashMap<String, ValueAndName>> list = this.values;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        AddMore addMore = this.addMore;
        int iHashCode7 = addMore == null ? 0 : addMore.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool2 = this.required;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        String str = this.version;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.value;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        Float f2 = this.bottomMargin;
        int iHashCode12 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.leftMargin;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (f3 != null ? f3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Boolean isHidden() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddMore(AddMore addMore) {
        this.addMore = addMore;
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
    public final void setValues(List<? extends HashMap<String, ValueAndName>> list) {
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditableList(count=" + this.count + ", defaultCount=" + this.defaultCount + ", deleteTopMargin=" + this.deleteTopMargin + ", isHidden=" + this.isHidden + ", template=" + this.template + ", values=" + this.values + ", addMore=" + this.addMore + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.defaultCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Float f = this.deleteTopMargin;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeValue(this.template);
        List<? extends HashMap<String, ValueAndName>> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (HashMap<String, ValueAndName> map : list) {
                parcel.writeInt(map.size());
                for (Map.Entry<String, ValueAndName> entry : map.entrySet()) {
                    parcel.writeString(entry.getKey());
                    ValueAndName value = entry.getValue();
                    if (value == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        value.writeToParcel(parcel, i);
                    }
                }
            }
        }
        AddMore addMore = this.addMore;
        if (addMore == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addMore.writeToParcel(parcel, i);
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
        Float f2 = this.bottomMargin;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.leftMargin;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EditableList> serializer() {
            return EditableList$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditableList(int i, Integer num, Integer num2, Float f, Boolean bool, JsonArray jsonArray, List list, AddMore addMore, String str, Boolean bool2, String str2, String str3, Float f2, Float f3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (7824 != (i & 7824)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7824, EditableList$$serializer.INSTANCE.getDescriptor());
        }
        this.count = (i & 1) == 0 ? 1 : num;
        this.defaultCount = (i & 2) == 0 ? 0 : num2;
        this.deleteTopMargin = (i & 4) == 0 ? Float.valueOf(0.0f) : f;
        this.isHidden = (i & 8) == 0 ? Boolean.FALSE : bool;
        this.template = jsonArray;
        if ((i & 32) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
        if ((i & 64) == 0) {
            this.addMore = null;
        } else {
            this.addMore = addMore;
        }
        this.id = str;
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(EditableList editableList, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        UIComponent.write$Self(editableList, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num2 = editableList.count) == null || num2.intValue() != 1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, editableList.count);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = editableList.defaultCount) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, editableList.defaultCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(editableList.deleteTopMargin, Float.valueOf(0.0f))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, FloatSerializer.INSTANCE, editableList.deleteTopMargin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(editableList.isHidden(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, editableList.isHidden());
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, JsonArraySerializer.INSTANCE, editableList.template);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || editableList.values != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], editableList.values);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || editableList.addMore != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, AddMore$$serializer.INSTANCE, editableList.addMore);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, editableList.getId());
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(editableList.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, editableList.getRequired());
        }
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, editableList.getVersion());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, editableList.getValue());
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, editableList.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, editableList.getLeftMargin());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005c: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r18v0 java.lang.Integer))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x001c: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: INVOKE (0.0f float) STATIC call: java.lang.Float.valueOf(float):java.lang.Float A[MD:(float):java.lang.Float (c), WRAPPED] (LINE:2445)) : (r19v0 java.lang.Float))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (r21v0 kotlinx.serialization.json.JsonArray)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore:?: TERNARY null = ((wrap:int:0x003c: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore) : (r23v0 com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore))
  (r24v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.Float)
  (r29v0 java.lang.Float)
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.util.List<? extends java.util.HashMap<java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.ValueAndName>>, com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void (m)] (LINE:2442) call: com.okinc.ok_kyc_core.data.remote.networkmodel.EditableList.<init>(java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Boolean, kotlinx.serialization.json.JsonArray, java.util.List, com.okinc.ok_kyc_core.data.remote.networkmodel.AddMore, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float):void type: THIS */
    public /* synthetic */ EditableList(Integer num, Integer num2, Float f, Boolean bool, JsonArray jsonArray, List list, AddMore addMore, String str, Boolean bool2, String str2, String str3, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? Float.valueOf(0.0f) : f, (i & 8) != 0 ? Boolean.FALSE : bool, jsonArray, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : addMore, str, (i & 256) != 0 ? Boolean.FALSE : bool2, str2, str3, f2, f3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableList(Integer num, Integer num2, Float f, Boolean bool, @NotNull JsonArray jsonArray, List<? extends HashMap<String, ValueAndName>> list, AddMore addMore, @NotNull String str, Boolean bool2, String str2, String str3, Float f2, Float f3) {
        super(null);
        Intrinsics.checkNotNullParameter(jsonArray, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.count = num;
        this.defaultCount = num2;
        this.deleteTopMargin = f;
        this.isHidden = bool;
        this.template = jsonArray;
        this.values = list;
        this.addMore = addMore;
        this.id = str;
        this.required = bool2;
        this.version = str2;
        this.value = str3;
        this.bottomMargin = f2;
        this.leftMargin = f3;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public EditableListAppModel toAppModel() {
        Integer num = this.count;
        int iIntValue = num != null ? num.intValue() : 1;
        Integer num2 = this.defaultCount;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Float f = this.deleteTopMargin;
        Boolean boolIsHidden = isHidden();
        List<UIComponentAppModel> listCopydefault = C43747rvC.copydefault(this.template);
        List<? extends HashMap<String, ValueAndName>> list = this.values;
        AddMore addMore = this.addMore;
        String id = getId();
        Boolean required = getRequired();
        String version = getVersion();
        String value = getValue();
        Float bottomMargin = getBottomMargin();
        Float leftMargin = getLeftMargin();
        Integer num3 = this.count;
        return new EditableListAppModel(iIntValue, iIntValue2, f, boolIsHidden, listCopydefault, list, addMore, id, required, version, value, bottomMargin, leftMargin, num3 != null ? num3.intValue() : 1, (List) null, (List) null, 49152, (DefaultConstructorMarker) null);
    }
}
