package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class ChartDataReq implements Parcelable {
    private final List<String> accountIds;
    private final Long chainId;
    private final Integer chartTypeId;
    private final Integer hasNft;
    private final List<Long> hideCoinList;
    private final Double tinyThreshold;
    private final String userUniqueId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChartDataReq> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<ChartDataReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartDataReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string = parcel.readString();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
            }
            return new ChartDataReq(arrayListCreateStringArrayList, string, numValueOf, lValueOf, numValueOf2, dValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChartDataReq[] newArray(int i) {
            return new ChartDataReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChartDataReq() {
        this((List) null, (String) null, (Integer) null, (Long) null, (Integer) null, (Double) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.defi.api.bean.ChartDataReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDataReq copy$default(ChartDataReq chartDataReq, List list, String str, Integer num, Long l, Integer num2, Double d, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chartDataReq.accountIds;
        }
        if ((i & 2) != 0) {
            str = chartDataReq.userUniqueId;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            num = chartDataReq.chartTypeId;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            l = chartDataReq.chainId;
        }
        Long l2 = l;
        if ((i & 16) != 0) {
            num2 = chartDataReq.hasNft;
        }
        Integer num4 = num2;
        if ((i & 32) != 0) {
            d = chartDataReq.tinyThreshold;
        }
        Double d2 = d;
        if ((i & 64) != 0) {
            list2 = chartDataReq.hideCoinList;
        }
        return chartDataReq.copy(list, str2, num3, l2, num4, d2, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.chartTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.hasNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component6() {
        return this.tinyThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component7() {
        return this.hideCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartDataReq copy(List<String> list, String str, Integer num, Long l, Integer num2, Double d, List<Long> list2) {
        return new ChartDataReq(list, str, num, l, num2, d, list2);
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
        if (!(obj instanceof ChartDataReq)) {
            return false;
        }
        ChartDataReq chartDataReq = (ChartDataReq) obj;
        return Intrinsics.EZpvd(this.accountIds, chartDataReq.accountIds) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) chartDataReq.userUniqueId) && Intrinsics.EZpvd(this.chartTypeId, chartDataReq.chartTypeId) && Intrinsics.EZpvd(this.chainId, chartDataReq.chainId) && Intrinsics.EZpvd(this.hasNft, chartDataReq.hasNft) && Intrinsics.EZpvd(this.tinyThreshold, chartDataReq.tinyThreshold) && Intrinsics.EZpvd(this.hideCoinList, chartDataReq.hideCoinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAccountIds() {
        return this.accountIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChartTypeId() {
        return this.chartTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getHasNft() {
        return this.hasNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getHideCoinList() {
        return this.hideCoinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getTinyThreshold() {
        return this.tinyThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.accountIds;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.userUniqueId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.chartTypeId;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Long l = this.chainId;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Integer num2 = this.hasNft;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Double d = this.tinyThreshold;
        int iHashCode6 = d == null ? 0 : d.hashCode();
        List<Long> list2 = this.hideCoinList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartDataReq(accountIds=" + this.accountIds + ", userUniqueId=" + this.userUniqueId + ", chartTypeId=" + this.chartTypeId + ", chainId=" + this.chainId + ", hasNft=" + this.hasNft + ", tinyThreshold=" + this.tinyThreshold + ", hideCoinList=" + this.hideCoinList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.accountIds);
        parcel.writeString(this.userUniqueId);
        Integer num = this.chartTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Integer num2 = this.hasNft;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Double d = this.tinyThreshold;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        List<Long> list = this.hideCoinList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.ChartDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChartDataReq> serializer() {
            return ChartDataReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChartDataReq(int i, List list, String str, Integer num, Long l, Integer num2, Double d, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountIds = null;
        } else {
            this.accountIds = list;
        }
        if ((i & 2) == 0) {
            this.userUniqueId = null;
        } else {
            this.userUniqueId = str;
        }
        if ((i & 4) == 0) {
            this.chartTypeId = null;
        } else {
            this.chartTypeId = num;
        }
        if ((i & 8) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 16) == 0) {
            this.hasNft = null;
        } else {
            this.hasNft = num2;
        }
        if ((i & 32) == 0) {
            this.tinyThreshold = null;
        } else {
            this.tinyThreshold = d;
        }
        if ((i & 64) == 0) {
            this.hideCoinList = null;
        } else {
            this.hideCoinList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(ChartDataReq chartDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || chartDataReq.accountIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], chartDataReq.accountIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || chartDataReq.userUniqueId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, chartDataReq.userUniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || chartDataReq.chartTypeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, chartDataReq.chartTypeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || chartDataReq.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, chartDataReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || chartDataReq.hasNft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, chartDataReq.hasNft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || chartDataReq.tinyThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, chartDataReq.tinyThreshold);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && chartDataReq.hideCoinList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], chartDataReq.hideCoinList);
    }

    public ChartDataReq(List<String> list, String str, Integer num, Long l, Integer num2, Double d, List<Long> list2) {
        this.accountIds = list;
        this.userUniqueId = str;
        this.chartTypeId = num;
        this.chainId = l;
        this.hasNft = num2;
        this.tinyThreshold = d;
        this.hideCoinList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r10v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r12v0 java.lang.Double))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Double, java.util.List<java.lang.Long>):void (m)] (LINE:388) call: com.okinc.business.defi.api.bean.ChartDataReq.<init>(java.util.List, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.Double, java.util.List):void type: THIS */
    public /* synthetic */ ChartDataReq(List list, String str, Integer num, Long l, Integer num2, Double d, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : list2);
    }
}
