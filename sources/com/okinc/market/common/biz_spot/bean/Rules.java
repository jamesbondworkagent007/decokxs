package com.okinc.market.common.biz_spot.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class Rules implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<Long> cedefiPriceRuleIds;

    @SerializedName("cefiRuleIds")
    private final List<Long> cefiPriceRuleIds;
    private final List<Long> indicatorRuleIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<Rules> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<Rules> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rules createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new Rules(arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Rules[] newArray(int i) {
            return new Rules[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rules() {
        this((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.market.common.biz_spot.bean.Rules */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rules copy$default(Rules rules, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rules.cefiPriceRuleIds;
        }
        if ((i & 2) != 0) {
            list2 = rules.cedefiPriceRuleIds;
        }
        if ((i & 4) != 0) {
            list3 = rules.indicatorRuleIds;
        }
        return rules.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.cefiPriceRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.cedefiPriceRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component3() {
        return this.indicatorRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Rules copy(List<Long> list, List<Long> list2, List<Long> list3) {
        return new Rules(list, list2, list3);
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
        if (!(obj instanceof Rules)) {
            return false;
        }
        Rules rules = (Rules) obj;
        return Intrinsics.EZpvd(this.cefiPriceRuleIds, rules.cefiPriceRuleIds) && Intrinsics.EZpvd(this.cedefiPriceRuleIds, rules.cedefiPriceRuleIds) && Intrinsics.EZpvd(this.indicatorRuleIds, rules.indicatorRuleIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCedefiPriceRuleIds() {
        return this.cedefiPriceRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCefiPriceRuleIds() {
        return this.cefiPriceRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getIndicatorRuleIds() {
        return this.indicatorRuleIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Long> list = this.cefiPriceRuleIds;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<Long> list2 = this.cedefiPriceRuleIds;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<Long> list3 = this.indicatorRuleIds;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Rules(cefiPriceRuleIds=" + this.cefiPriceRuleIds + ", cedefiPriceRuleIds=" + this.cedefiPriceRuleIds + ", indicatorRuleIds=" + this.indicatorRuleIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.cefiPriceRuleIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        List<Long> list2 = this.cedefiPriceRuleIds;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Long> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeLong(it2.next().longValue());
            }
        }
        List<Long> list3 = this.indicatorRuleIds;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<Long> it3 = list3.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(it3.next().longValue());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.market.common.biz_spot.bean.Rules.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Rules> serializer() {
            return Rules$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer)};
    }

    public /* synthetic */ Rules(int i, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cefiPriceRuleIds = null;
        } else {
            this.cefiPriceRuleIds = list;
        }
        if ((i & 2) == 0) {
            this.cedefiPriceRuleIds = null;
        } else {
            this.cedefiPriceRuleIds = list2;
        }
        if ((i & 4) == 0) {
            this.indicatorRuleIds = null;
        } else {
            this.indicatorRuleIds = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKMarket_market_api(Rules rules, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rules.cefiPriceRuleIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], rules.cefiPriceRuleIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rules.cedefiPriceRuleIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], rules.cedefiPriceRuleIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && rules.indicatorRuleIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], rules.indicatorRuleIds);
    }

    public Rules(List<Long> list, List<Long> list2, List<Long> list3) {
        this.cefiPriceRuleIds = list;
        this.cedefiPriceRuleIds = list2;
        this.indicatorRuleIds = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.util.List<java.lang.Long>, java.util.List<java.lang.Long>, java.util.List<java.lang.Long>):void (m)] (LINE:99) call: com.okinc.market.common.biz_spot.bean.Rules.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ Rules(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }
}
