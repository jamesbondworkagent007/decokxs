package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CoinIdsReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<Long> aggregationCoinIdList;
    private List<Long> coinIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinIdsReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinIdsReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinIdsReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList3.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList3;
            }
            return new CoinIdsReq(arrayList2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinIdsReq[] newArray(int i) {
            return new CoinIdsReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.CoinIdsReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinIdsReq copy$default(CoinIdsReq coinIdsReq, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = coinIdsReq.coinIdList;
        }
        if ((i & 2) != 0) {
            list2 = coinIdsReq.aggregationCoinIdList;
        }
        return coinIdsReq.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.coinIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component2() {
        return this.aggregationCoinIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinIdsReq copy(@NotNull List<Long> list, List<Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new CoinIdsReq(list, list2);
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
        if (!(obj instanceof CoinIdsReq)) {
            return false;
        }
        CoinIdsReq coinIdsReq = (CoinIdsReq) obj;
        return Intrinsics.EZpvd(this.coinIdList, coinIdsReq.coinIdList) && Intrinsics.EZpvd(this.aggregationCoinIdList, coinIdsReq.aggregationCoinIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAggregationCoinIdList() {
        return this.aggregationCoinIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getCoinIdList() {
        return this.coinIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.coinIdList.hashCode();
        List<Long> list = this.aggregationCoinIdList;
        return (iHashCode * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAggregationCoinIdList(List<Long> list) {
        this.aggregationCoinIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinIdList(@NotNull List<Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinIdsReq(coinIdList=" + this.coinIdList + ", aggregationCoinIdList=" + this.aggregationCoinIdList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.coinIdList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        List<Long> list2 = this.aggregationCoinIdList;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list2.size());
        Iterator<Long> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeLong(it2.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CoinIdsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CoinIdsReq> serializer() {
            return CoinIdsReq$$serializer.INSTANCE;
        }
    }

    static {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(longSerializer), new ArrayListSerializer(longSerializer)};
    }

    public /* synthetic */ CoinIdsReq(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CoinIdsReq$$serializer.INSTANCE.getDescriptor());
        }
        this.coinIdList = list;
        if ((i & 2) == 0) {
            this.aggregationCoinIdList = null;
        } else {
            this.aggregationCoinIdList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CoinIdsReq coinIdsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], coinIdsReq.coinIdList);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && coinIdsReq.aggregationCoinIdList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], coinIdsReq.aggregationCoinIdList);
    }

    public CoinIdsReq(@NotNull List<Long> list, List<Long> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.coinIdList = list;
        this.aggregationCoinIdList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
 A[MD:(java.util.List<java.lang.Long>, java.util.List<java.lang.Long>):void (m)] (LINE:593) call: com.okinc.business.defi.biz.net.bean.CoinIdsReq.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ CoinIdsReq(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
