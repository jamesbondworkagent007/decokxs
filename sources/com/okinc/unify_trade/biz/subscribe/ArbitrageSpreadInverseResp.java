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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class ArbitrageSpreadInverseResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<SpreadArbitrageData> futures_futures;
    private List<SpreadArbitrageData> futures_spot;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageSpreadInverseResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageSpreadInverseResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageSpreadInverseResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SpreadArbitrageData.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(SpreadArbitrageData.CREATOR.createFromParcel(parcel));
                }
            }
            return new ArbitrageSpreadInverseResp(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageSpreadInverseResp[] newArray(int i) {
            return new ArbitrageSpreadInverseResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageSpreadInverseResp() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArbitrageSpreadInverseResp copy$default(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = arbitrageSpreadInverseResp.futures_spot;
        }
        if ((i & 2) != 0) {
            list2 = arbitrageSpreadInverseResp.futures_futures;
        }
        return arbitrageSpreadInverseResp.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpreadArbitrageData> component1() {
        return this.futures_spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpreadArbitrageData> component2() {
        return this.futures_futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageSpreadInverseResp copy(List<SpreadArbitrageData> list, List<SpreadArbitrageData> list2) {
        return new ArbitrageSpreadInverseResp(list, list2);
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
        if (!(obj instanceof ArbitrageSpreadInverseResp)) {
            return false;
        }
        ArbitrageSpreadInverseResp arbitrageSpreadInverseResp = (ArbitrageSpreadInverseResp) obj;
        return Intrinsics.EZpvd(this.futures_spot, arbitrageSpreadInverseResp.futures_spot) && Intrinsics.EZpvd(this.futures_futures, arbitrageSpreadInverseResp.futures_futures);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpreadArbitrageData> getFutures_futures() {
        return this.futures_futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SpreadArbitrageData> getFutures_spot() {
        return this.futures_spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SpreadArbitrageData> list = this.futures_spot;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<SpreadArbitrageData> list2 = this.futures_futures;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFutures_futures(List<SpreadArbitrageData> list) {
        this.futures_futures = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFutures_spot(List<SpreadArbitrageData> list) {
        this.futures_spot = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageSpreadInverseResp(futures_spot=" + this.futures_spot + ", futures_futures=" + this.futures_futures + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SpreadArbitrageData> list = this.futures_spot;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SpreadArbitrageData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<SpreadArbitrageData> list2 = this.futures_futures;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<SpreadArbitrageData> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageSpreadInverseResp> serializer() {
            return ArbitrageSpreadInverseResp$$serializer.INSTANCE;
        }
    }

    static {
        SpreadArbitrageData$$serializer spreadArbitrageData$$serializer = SpreadArbitrageData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(spreadArbitrageData$$serializer), new ArrayListSerializer(spreadArbitrageData$$serializer)};
    }

    public /* synthetic */ ArbitrageSpreadInverseResp(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.futures_spot = null;
        } else {
            this.futures_spot = list;
        }
        if ((i & 2) == 0) {
            this.futures_futures = null;
        } else {
            this.futures_futures = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageSpreadInverseResp arbitrageSpreadInverseResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageSpreadInverseResp.futures_spot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], arbitrageSpreadInverseResp.futures_spot);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && arbitrageSpreadInverseResp.futures_futures == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], arbitrageSpreadInverseResp.futures_futures);
    }

    public ArbitrageSpreadInverseResp(List<SpreadArbitrageData> list, List<SpreadArbitrageData> list2) {
        this.futures_spot = list;
        this.futures_futures = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData>, java.util.List<com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData>):void (m)] (LINE:266) call: com.okinc.unify_trade.biz.subscribe.ArbitrageSpreadInverseResp.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ArbitrageSpreadInverseResp(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
