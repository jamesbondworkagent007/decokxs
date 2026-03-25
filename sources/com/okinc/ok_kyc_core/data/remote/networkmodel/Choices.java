package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class Choices implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<GroupedValue> groupedValues;
    private final Boolean isGroupedValueUri;
    private final String maxNumOfOptions;
    private final Map<String, String> params;
    private final Boolean search;
    private final String subtitle;
    private final String title;
    private final String uri;
    private List<Value> values;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Choices> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Choices> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Choices createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList3.add(Value.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            String string3 = parcel.readString();
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList2 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList2.add(GroupedValue.CREATOR.createFromParcel(parcel));
                }
            }
            return new Choices(boolValueOf, string, string2, arrayList, linkedHashMap, string3, boolValueOf2, string4, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Choices[] newArray(int i) {
            return new Choices[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Choices() {
        this((Boolean) null, (String) null, (String) null, (List) null, (Map) null, (String) null, (Boolean) null, (String) null, (List) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.search;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Value> component4() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component5() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isGroupedValueUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxNumOfOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupedValue> component9() {
        return this.groupedValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Choices copy(Boolean bool, String str, String str2, List<Value> list, Map<String, String> map, String str3, Boolean bool2, String str4, List<GroupedValue> list2) {
        return new Choices(bool, str, str2, list, map, str3, bool2, str4, list2);
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
        if (!(obj instanceof Choices)) {
            return false;
        }
        Choices choices = (Choices) obj;
        return Intrinsics.EZpvd(this.search, choices.search) && Intrinsics.EZpvd((Object) this.title, (Object) choices.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) choices.subtitle) && Intrinsics.EZpvd(this.values, choices.values) && Intrinsics.EZpvd(this.params, choices.params) && Intrinsics.EZpvd((Object) this.uri, (Object) choices.uri) && Intrinsics.EZpvd(this.isGroupedValueUri, choices.isGroupedValueUri) && Intrinsics.EZpvd((Object) this.maxNumOfOptions, (Object) choices.maxNumOfOptions) && Intrinsics.EZpvd(this.groupedValues, choices.groupedValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupedValue> getGroupedValues() {
        return this.groupedValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxNumOfOptions() {
        return this.maxNumOfOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSearch() {
        return this.search;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUri() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Value> getValues() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.search;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subtitle;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<Value> list = this.values;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Map<String, String> map = this.params;
        int iHashCode5 = map == null ? 0 : map.hashCode();
        String str3 = this.uri;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        Boolean bool2 = this.isGroupedValueUri;
        int iHashCode7 = bool2 == null ? 0 : bool2.hashCode();
        String str4 = this.maxNumOfOptions;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        List<GroupedValue> list2 = this.groupedValues;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isGroupedValueUri() {
        return this.isGroupedValueUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValues(List<Value> list) {
        this.values = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Choices(search=" + this.search + ", title=" + this.title + ", subtitle=" + this.subtitle + ", values=" + this.values + ", params=" + this.params + ", uri=" + this.uri + ", isGroupedValueUri=" + this.isGroupedValueUri + ", maxNumOfOptions=" + this.maxNumOfOptions + ", groupedValues=" + this.groupedValues + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.search;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List<Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Value> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Map<String, String> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }
        parcel.writeString(this.uri);
        Boolean bool2 = this.isGroupedValueUri;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.maxNumOfOptions);
        List<GroupedValue> list2 = this.groupedValues;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<GroupedValue> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.Choices.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Choices> serializer() {
            return Choices$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(Value$$serializer.INSTANCE), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, null, new ArrayListSerializer(GroupedValue$$serializer.INSTANCE)};
    }

    public /* synthetic */ Choices(int i, Boolean bool, String str, String str2, List list, Map map, String str3, Boolean bool2, String str4, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.search = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = str2;
        }
        if ((i & 8) == 0) {
            this.values = null;
        } else {
            this.values = list;
        }
        if ((i & 16) == 0) {
            this.params = null;
        } else {
            this.params = map;
        }
        if ((i & 32) == 0) {
            this.uri = null;
        } else {
            this.uri = str3;
        }
        if ((i & 64) == 0) {
            this.isGroupedValueUri = Boolean.FALSE;
        } else {
            this.isGroupedValueUri = bool2;
        }
        if ((i & 128) == 0) {
            this.maxNumOfOptions = "1";
        } else {
            this.maxNumOfOptions = str4;
        }
        if ((i & 256) == 0) {
            this.groupedValues = null;
        } else {
            this.groupedValues = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(Choices choices, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(choices.search, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, choices.search);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || choices.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, choices.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || choices.subtitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, choices.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || choices.values != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], choices.values);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || choices.params != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], choices.params);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || choices.uri != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, choices.uri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(choices.isGroupedValueUri, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, choices.isGroupedValueUri);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) choices.maxNumOfOptions, (Object) "1")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, choices.maxNumOfOptions);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && choices.groupedValues == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], choices.groupedValues);
    }

    public Choices(Boolean bool, String str, String str2, List<Value> list, Map<String, String> map, String str3, Boolean bool2, String str4, List<GroupedValue> list2) {
        this.search = bool;
        this.title = str;
        this.subtitle = str2;
        this.values = list;
        this.params = map;
        this.uri = str3;
        this.isGroupedValueUri = bool2;
        this.maxNumOfOptions = str4;
        this.groupedValues = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r15v0 java.util.Map))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("1") : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.Value>, java.util.Map<java.lang.String, java.lang.String>, java.lang.String, java.lang.Boolean, java.lang.String, java.util.List<com.okinc.ok_kyc_core.data.remote.networkmodel.GroupedValue>):void (m)] (LINE:4159) call: com.okinc.ok_kyc_core.data.remote.networkmodel.Choices.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.lang.String, java.lang.Boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ Choices(Boolean bool, String str, String str2, List list, Map map, String str3, Boolean bool2, String str4, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? Boolean.FALSE : bool2, (i & 128) != 0 ? "1" : str4, (i & 256) == 0 ? list2 : null);
    }
}
