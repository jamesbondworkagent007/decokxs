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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import o.C43747rvC;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@SerialName("list-picker-popup")
@Serializable
public final class ListPickerPopUp extends UIComponent implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<ListPickerPopUpChoice> additionalChoices;
    private Float bottomMargin;
    private final List<ListPickerPopUpChoice> choices;
    private final Cta cta;
    private final String defaultChoice;
    private final String id;
    private Boolean isHidden;
    private final JsonArray items;
    private final JsonArray itemsTop;
    private final Float leftMargin;
    private final Boolean required;
    private final String type;
    private String value;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ListPickerPopUp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ListPickerPopUp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            JsonArray jsonArray = (JsonArray) parcel.readValue(ListPickerPopUp.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ListPickerPopUpChoice.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(ListPickerPopUpChoice.CREATOR.createFromParcel(parcel));
                }
            }
            return new ListPickerPopUp(string, jsonArray, arrayList, arrayList2, (JsonArray) parcel.readValue(ListPickerPopUp.class.getClassLoader()), parcel.readString(), (Cta) parcel.readParcelable(ListPickerPopUp.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPickerPopUp[] newArray(int i) {
            return new ListPickerPopUp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
    public final Boolean component14() {
        return this.isHidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component2() {
        return this.itemsTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> component3() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> component4() {
        return this.additionalChoices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component5() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.defaultChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta component7() {
        return this.cta;
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
    public final ListPickerPopUp copy(@NotNull String str, JsonArray jsonArray, List<ListPickerPopUpChoice> list, List<ListPickerPopUpChoice> list2, JsonArray jsonArray2, String str2, Cta cta, @NotNull String str3, Boolean bool, String str4, String str5, Float f, Float f2, Boolean bool2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ListPickerPopUp(str, jsonArray, list, list2, jsonArray2, str2, cta, str3, bool, str4, str5, f, f2, bool2);
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
        if (!(obj instanceof ListPickerPopUp)) {
            return false;
        }
        ListPickerPopUp listPickerPopUp = (ListPickerPopUp) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) listPickerPopUp.type) && Intrinsics.EZpvd(this.itemsTop, listPickerPopUp.itemsTop) && Intrinsics.EZpvd(this.choices, listPickerPopUp.choices) && Intrinsics.EZpvd(this.additionalChoices, listPickerPopUp.additionalChoices) && Intrinsics.EZpvd(this.items, listPickerPopUp.items) && Intrinsics.EZpvd((Object) this.defaultChoice, (Object) listPickerPopUp.defaultChoice) && Intrinsics.EZpvd(this.cta, listPickerPopUp.cta) && Intrinsics.EZpvd((Object) this.id, (Object) listPickerPopUp.id) && Intrinsics.EZpvd(this.required, listPickerPopUp.required) && Intrinsics.EZpvd((Object) this.version, (Object) listPickerPopUp.version) && Intrinsics.EZpvd((Object) this.value, (Object) listPickerPopUp.value) && Intrinsics.EZpvd(this.bottomMargin, listPickerPopUp.bottomMargin) && Intrinsics.EZpvd(this.leftMargin, listPickerPopUp.leftMargin) && Intrinsics.EZpvd(this.isHidden, listPickerPopUp.isHidden);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> getAdditionalChoices() {
        return this.additionalChoices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public Float getBottomMargin() {
        return this.bottomMargin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ListPickerPopUpChoice> getChoices() {
        return this.choices;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Cta getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultChoice() {
        return this.defaultChoice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getItemsTop() {
        return this.itemsTop;
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
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        JsonArray jsonArray = this.itemsTop;
        int iHashCode2 = jsonArray == null ? 0 : jsonArray.hashCode();
        List<ListPickerPopUpChoice> list = this.choices;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<ListPickerPopUpChoice> list2 = this.additionalChoices;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        JsonArray jsonArray2 = this.items;
        int iHashCode5 = jsonArray2 == null ? 0 : jsonArray2.hashCode();
        String str = this.defaultChoice;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        Cta cta = this.cta;
        int iHashCode7 = cta == null ? 0 : cta.hashCode();
        int iHashCode8 = this.id.hashCode();
        Boolean bool = this.required;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str2 = this.version;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.value;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        Float f = this.bottomMargin;
        int iHashCode12 = f == null ? 0 : f.hashCode();
        Float f2 = this.leftMargin;
        int iHashCode13 = f2 == null ? 0 : f2.hashCode();
        Boolean bool2 = this.isHidden;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (bool2 != null ? bool2.hashCode() : 0);
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
        return "ListPickerPopUp(type=" + this.type + ", itemsTop=" + this.itemsTop + ", choices=" + this.choices + ", additionalChoices=" + this.additionalChoices + ", items=" + this.items + ", defaultChoice=" + this.defaultChoice + ", cta=" + this.cta + ", id=" + this.id + ", required=" + this.required + ", version=" + this.version + ", value=" + this.value + ", bottomMargin=" + this.bottomMargin + ", leftMargin=" + this.leftMargin + ", isHidden=" + this.isHidden + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.type);
        parcel.writeValue(this.itemsTop);
        List<ListPickerPopUpChoice> list = this.choices;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<ListPickerPopUpChoice> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<ListPickerPopUpChoice> list2 = this.additionalChoices;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<ListPickerPopUpChoice> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeValue(this.items);
        parcel.writeString(this.defaultChoice);
        parcel.writeParcelable(this.cta, i);
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ListPickerPopUp> serializer() {
            return ListPickerPopUp$$serializer.INSTANCE;
        }
    }

    static {
        ListPickerPopUpChoice$$serializer listPickerPopUpChoice$$serializer = ListPickerPopUpChoice$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(listPickerPopUpChoice$$serializer), new ArrayListSerializer(listPickerPopUpChoice$$serializer), null, null, null, null, null, null, null, null, null, null};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListPickerPopUp(int i, String str, JsonArray jsonArray, List list, List list2, JsonArray jsonArray2, String str2, Cta cta, String str3, Boolean bool, String str4, String str5, Float f, Float f2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (6144 != (i & 6144)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6144, ListPickerPopUp$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.itemsTop = null;
        } else {
            this.itemsTop = jsonArray;
        }
        if ((i & 4) == 0) {
            this.choices = null;
        } else {
            this.choices = list;
        }
        if ((i & 8) == 0) {
            this.additionalChoices = null;
        } else {
            this.additionalChoices = list2;
        }
        if ((i & 16) == 0) {
            this.items = null;
        } else {
            this.items = jsonArray2;
        }
        if ((i & 32) == 0) {
            this.defaultChoice = null;
        } else {
            this.defaultChoice = str2;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = cta;
        }
        if ((i & 128) == 0) {
            this.id = "";
        } else {
            this.id = str3;
        }
        this.required = (i & 256) == 0 ? Boolean.FALSE : bool;
        if ((i & 512) == 0) {
            this.version = "";
        } else {
            this.version = str4;
        }
        if ((i & 1024) == 0) {
            this.value = "";
        } else {
            this.value = str5;
        }
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = (i & 8192) == 0 ? Boolean.FALSE : bool2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(ListPickerPopUp listPickerPopUp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        UIComponent.write$Self(listPickerPopUp, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) listPickerPopUp.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, listPickerPopUp.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || listPickerPopUp.itemsTop != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.INSTANCE, listPickerPopUp.itemsTop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || listPickerPopUp.choices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], listPickerPopUp.choices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || listPickerPopUp.additionalChoices != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], listPickerPopUp.additionalChoices);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || listPickerPopUp.items != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, JsonArraySerializer.INSTANCE, listPickerPopUp.items);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || listPickerPopUp.defaultChoice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, listPickerPopUp.defaultChoice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || listPickerPopUp.cta != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, Cta$$serializer.INSTANCE, listPickerPopUp.cta);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) listPickerPopUp.getId(), (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, listPickerPopUp.getId());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(listPickerPopUp.getRequired(), Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, listPickerPopUp.getRequired());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) listPickerPopUp.getVersion(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, listPickerPopUp.getVersion());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) listPickerPopUp.getValue(), (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, listPickerPopUp.getValue());
        }
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, listPickerPopUp.getBottomMargin());
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, listPickerPopUp.getLeftMargin());
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd(listPickerPopUp.isHidden(), Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, listPickerPopUp.isHidden());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r20v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:kotlinx.serialization.json.JsonArray:?: TERNARY null = ((wrap:int:0x0025: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonArray) : (r23v0 kotlinx.serialization.json.JsonArray))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.Cta:?: TERNARY null = ((wrap:int:0x0035: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.Cta) : (r25v0 com.okinc.ok_kyc_core.data.remote.networkmodel.Cta))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0045: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r27v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0057: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (r30v0 java.lang.Float)
  (r31v0 java.lang.Float)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0065: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
 A[MD:(java.lang.String, kotlinx.serialization.json.JsonArray, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice>, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUpChoice>, kotlinx.serialization.json.JsonArray, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void (m)] (LINE:4918) call: com.okinc.ok_kyc_core.data.remote.networkmodel.ListPickerPopUp.<init>(java.lang.String, kotlinx.serialization.json.JsonArray, java.util.List, java.util.List, kotlinx.serialization.json.JsonArray, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.Cta, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Float, java.lang.Float, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ListPickerPopUp(String str, JsonArray jsonArray, List list, List list2, JsonArray jsonArray2, String str2, Cta cta, String str3, Boolean bool, String str4, String str5, Float f, Float f2, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : jsonArray, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : jsonArray2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : cta, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? "" : str5, f, f2, (i & 8192) != 0 ? Boolean.FALSE : bool2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListPickerPopUp(@NotNull String str, JsonArray jsonArray, List<ListPickerPopUpChoice> list, List<ListPickerPopUpChoice> list2, JsonArray jsonArray2, String str2, Cta cta, @NotNull String str3, Boolean bool, String str4, String str5, Float f, Float f2, Boolean bool2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.type = str;
        this.itemsTop = jsonArray;
        this.choices = list;
        this.additionalChoices = list2;
        this.items = jsonArray2;
        this.defaultChoice = str2;
        this.cta = cta;
        this.id = str3;
        this.required = bool;
        this.version = str4;
        this.value = str5;
        this.bottomMargin = f;
        this.leftMargin = f2;
        this.isHidden = bool2;
    }

    /* JADX DEBUG: Method merged with bridge method: toAppModel()Lo/ruV; */
    @Override // com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponent
    public ListPickerPopUpAppModel toAppModel() {
        List<UIComponentAppModel> listAhwBna;
        List<UIComponentAppModel> listAhwBna2;
        String str = this.type;
        JsonArray jsonArray = this.itemsTop;
        if (jsonArray == null || (listAhwBna = C43747rvC.copydefault(jsonArray)) == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<UIComponentAppModel> list = listAhwBna;
        List<ListPickerPopUpChoice> list2 = this.choices;
        List<ListPickerPopUpChoice> list3 = this.additionalChoices;
        JsonArray jsonArray2 = this.items;
        if (jsonArray2 == null || (listAhwBna2 = C43747rvC.copydefault(jsonArray2)) == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        List<UIComponentAppModel> list4 = listAhwBna2;
        String str2 = this.defaultChoice;
        Cta cta = this.cta;
        return new ListPickerPopUpAppModel(str, list, list2, list3, list4, str2, cta != null ? cta.toAppModel() : null, getId(), getRequired(), getVersion(), getValue());
    }
}
