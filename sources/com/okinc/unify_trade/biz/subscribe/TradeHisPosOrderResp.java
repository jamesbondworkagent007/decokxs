package com.okinc.unify_trade.biz.subscribe;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class TradeHisPosOrderResp implements Parcelable {
    private List<TradeHisPosDedupOrder> dedupOrders;
    private String minBillId;
    private String minBillIdCreateTime;
    private List<TradeHisPosOrder> orders;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TradeHisPosOrderResp> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(TradeHisPosOrder$$serializer.INSTANCE), null, null, new ArrayListSerializer(TradeHisPosDedupOrder$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<TradeHisPosOrderResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrderResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(TradeHisPosOrder.CREATOR.createFromParcel(parcel));
                }
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(TradeHisPosDedupOrder.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new TradeHisPosOrderResp(arrayList, string, string2, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TradeHisPosOrderResp[] newArray(int i) {
            return new TradeHisPosOrderResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeHisPosOrderResp() {
        this((List) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TradeHisPosOrderResp copy$default(TradeHisPosOrderResp tradeHisPosOrderResp, List list, String str, String str2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tradeHisPosOrderResp.orders;
        }
        if ((i & 2) != 0) {
            str = tradeHisPosOrderResp.minBillId;
        }
        if ((i & 4) != 0) {
            str2 = tradeHisPosOrderResp.minBillIdCreateTime;
        }
        if ((i & 8) != 0) {
            list2 = tradeHisPosOrderResp.dedupOrders;
        }
        return tradeHisPosOrderResp.copy(list, str, str2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosOrder> component1() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.minBillId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minBillIdCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosDedupOrder> component4() {
        return this.dedupOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeHisPosOrderResp copy(List<TradeHisPosOrder> list, String str, String str2, List<TradeHisPosDedupOrder> list2) {
        return new TradeHisPosOrderResp(list, str, str2, list2);
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
        if (!(obj instanceof TradeHisPosOrderResp)) {
            return false;
        }
        TradeHisPosOrderResp tradeHisPosOrderResp = (TradeHisPosOrderResp) obj;
        return Intrinsics.EZpvd(this.orders, tradeHisPosOrderResp.orders) && Intrinsics.EZpvd((Object) this.minBillId, (Object) tradeHisPosOrderResp.minBillId) && Intrinsics.EZpvd((Object) this.minBillIdCreateTime, (Object) tradeHisPosOrderResp.minBillIdCreateTime) && Intrinsics.EZpvd(this.dedupOrders, tradeHisPosOrderResp.dedupOrders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosDedupOrder> getDedupOrders() {
        return this.dedupOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinBillId() {
        return this.minBillId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinBillIdCreateTime() {
        return this.minBillIdCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TradeHisPosOrder> getOrders() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<TradeHisPosOrder> list = this.orders;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.minBillId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.minBillIdCreateTime;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<TradeHisPosDedupOrder> list2 = this.dedupOrders;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDedupOrders(List<TradeHisPosDedupOrder> list) {
        this.dedupOrders = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinBillId(String str) {
        this.minBillId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinBillIdCreateTime(String str) {
        this.minBillIdCreateTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrders(List<TradeHisPosOrder> list) {
        this.orders = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeHisPosOrderResp(orders=" + this.orders + ", minBillId=" + this.minBillId + ", minBillIdCreateTime=" + this.minBillIdCreateTime + ", dedupOrders=" + this.dedupOrders + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TradeHisPosOrder> list = this.orders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<TradeHisPosOrder> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.minBillId);
        parcel.writeString(this.minBillIdCreateTime);
        List<TradeHisPosDedupOrder> list2 = this.dedupOrders;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<TradeHisPosDedupOrder> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeHisPosOrderResp> serializer() {
            return TradeHisPosOrderResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeHisPosOrderResp(int i, List list, String str, String str2, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orders = null;
        } else {
            this.orders = list;
        }
        if ((i & 2) == 0) {
            this.minBillId = null;
        } else {
            this.minBillId = str;
        }
        if ((i & 4) == 0) {
            this.minBillIdCreateTime = null;
        } else {
            this.minBillIdCreateTime = str2;
        }
        if ((i & 8) == 0) {
            this.dedupOrders = null;
        } else {
            this.dedupOrders = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeHisPosOrderResp tradeHisPosOrderResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tradeHisPosOrderResp.orders != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], tradeHisPosOrderResp.orders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tradeHisPosOrderResp.minBillId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, tradeHisPosOrderResp.minBillId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tradeHisPosOrderResp.minBillIdCreateTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tradeHisPosOrderResp.minBillIdCreateTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && tradeHisPosOrderResp.dedupOrders == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], tradeHisPosOrderResp.dedupOrders);
    }

    public TradeHisPosOrderResp(List<TradeHisPosOrder> list, String str, String str2, List<TradeHisPosDedupOrder> list2) {
        this.orders = list;
        this.minBillId = str;
        this.minBillIdCreateTime = str2;
        this.dedupOrders = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.subscribe.TradeHisPosOrder>, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.TradeHisPosDedupOrder>):void (m)] (LINE:118) call: com.okinc.unify_trade.biz.subscribe.TradeHisPosOrderResp.<init>(java.util.List, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TradeHisPosOrderResp(List list, String str, String str2, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list2);
    }
}
