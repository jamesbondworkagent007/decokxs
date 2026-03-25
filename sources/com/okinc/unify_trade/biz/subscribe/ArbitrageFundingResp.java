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
public final class ArbitrageFundingResp implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private List<FundingRateArbitrageData> USD;
    private List<FundingRateArbitrageData> USDC;
    private List<FundingRateArbitrageData> USDT;
    private List<FundingRateArbitrageData> inverse;
    private List<FundingRateArbitrageData> linear;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ArbitrageFundingResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ArbitrageFundingResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageFundingResp createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList5 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList6.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList7.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList8.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList9.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList9;
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList5 = new ArrayList(i9);
                for (int i10 = 0; i10 != i9; i10++) {
                    arrayList5.add(FundingRateArbitrageData.CREATOR.createFromParcel(parcel));
                }
            }
            return new ArbitrageFundingResp(arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ArbitrageFundingResp[] newArray(int i) {
            return new ArbitrageFundingResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArbitrageFundingResp() {
        this((List) null, (List) null, (List) null, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.subscribe.ArbitrageFundingResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArbitrageFundingResp copy$default(ArbitrageFundingResp arbitrageFundingResp, List list, List list2, List list3, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = arbitrageFundingResp.inverse;
        }
        if ((i & 2) != 0) {
            list2 = arbitrageFundingResp.linear;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = arbitrageFundingResp.USDT;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = arbitrageFundingResp.USDC;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = arbitrageFundingResp.USD;
        }
        return arbitrageFundingResp.copy(list, list6, list7, list8, list5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> component1() {
        return this.inverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> component2() {
        return this.linear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> component3() {
        return this.USDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> component4() {
        return this.USDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> component5() {
        return this.USD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArbitrageFundingResp copy(List<FundingRateArbitrageData> list, List<FundingRateArbitrageData> list2, List<FundingRateArbitrageData> list3, List<FundingRateArbitrageData> list4, List<FundingRateArbitrageData> list5) {
        return new ArbitrageFundingResp(list, list2, list3, list4, list5);
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
        if (!(obj instanceof ArbitrageFundingResp)) {
            return false;
        }
        ArbitrageFundingResp arbitrageFundingResp = (ArbitrageFundingResp) obj;
        return Intrinsics.EZpvd(this.inverse, arbitrageFundingResp.inverse) && Intrinsics.EZpvd(this.linear, arbitrageFundingResp.linear) && Intrinsics.EZpvd(this.USDT, arbitrageFundingResp.USDT) && Intrinsics.EZpvd(this.USDC, arbitrageFundingResp.USDC) && Intrinsics.EZpvd(this.USD, arbitrageFundingResp.USD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> getInverse() {
        return this.inverse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> getLinear() {
        return this.linear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> getUSD() {
        return this.USD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> getUSDC() {
        return this.USDC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FundingRateArbitrageData> getUSDT() {
        return this.USDT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<FundingRateArbitrageData> list = this.inverse;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<FundingRateArbitrageData> list2 = this.linear;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<FundingRateArbitrageData> list3 = this.USDT;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<FundingRateArbitrageData> list4 = this.USDC;
        int iHashCode4 = list4 == null ? 0 : list4.hashCode();
        List<FundingRateArbitrageData> list5 = this.USD;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list5 != null ? list5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInverse(List<FundingRateArbitrageData> list) {
        this.inverse = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinear(List<FundingRateArbitrageData> list) {
        this.linear = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSD(List<FundingRateArbitrageData> list) {
        this.USD = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSDC(List<FundingRateArbitrageData> list) {
        this.USDC = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUSDT(List<FundingRateArbitrageData> list) {
        this.USDT = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArbitrageFundingResp(inverse=" + this.inverse + ", linear=" + this.linear + ", USDT=" + this.USDT + ", USDC=" + this.USDC + ", USD=" + this.USD + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FundingRateArbitrageData> list = this.inverse;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<FundingRateArbitrageData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<FundingRateArbitrageData> list2 = this.linear;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<FundingRateArbitrageData> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<FundingRateArbitrageData> list3 = this.USDT;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<FundingRateArbitrageData> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<FundingRateArbitrageData> list4 = this.USDC;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<FundingRateArbitrageData> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        List<FundingRateArbitrageData> list5 = this.USD;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list5.size());
        Iterator<FundingRateArbitrageData> it5 = list5.iterator();
        while (it5.hasNext()) {
            it5.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.ArbitrageFundingResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ArbitrageFundingResp> serializer() {
            return ArbitrageFundingResp$$serializer.INSTANCE;
        }
    }

    static {
        FundingRateArbitrageData$$serializer fundingRateArbitrageData$$serializer = FundingRateArbitrageData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(fundingRateArbitrageData$$serializer), new ArrayListSerializer(fundingRateArbitrageData$$serializer), new ArrayListSerializer(fundingRateArbitrageData$$serializer), new ArrayListSerializer(fundingRateArbitrageData$$serializer), new ArrayListSerializer(fundingRateArbitrageData$$serializer)};
    }

    public /* synthetic */ ArbitrageFundingResp(int i, List list, List list2, List list3, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inverse = null;
        } else {
            this.inverse = list;
        }
        if ((i & 2) == 0) {
            this.linear = null;
        } else {
            this.linear = list2;
        }
        if ((i & 4) == 0) {
            this.USDT = null;
        } else {
            this.USDT = list3;
        }
        if ((i & 8) == 0) {
            this.USDC = null;
        } else {
            this.USDC = list4;
        }
        if ((i & 16) == 0) {
            this.USD = null;
        } else {
            this.USD = list5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ArbitrageFundingResp arbitrageFundingResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || arbitrageFundingResp.inverse != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], arbitrageFundingResp.inverse);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || arbitrageFundingResp.linear != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], arbitrageFundingResp.linear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || arbitrageFundingResp.USDT != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], arbitrageFundingResp.USDT);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || arbitrageFundingResp.USDC != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], arbitrageFundingResp.USDC);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && arbitrageFundingResp.USD == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], arbitrageFundingResp.USD);
    }

    public ArbitrageFundingResp(List<FundingRateArbitrageData> list, List<FundingRateArbitrageData> list2, List<FundingRateArbitrageData> list3, List<FundingRateArbitrageData> list4, List<FundingRateArbitrageData> list5) {
        this.inverse = list;
        this.linear = list2;
        this.USDT = list3;
        this.USDC = list4;
        this.USD = list5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData>, java.util.List<com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData>, java.util.List<com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData>, java.util.List<com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData>, java.util.List<com.okinc.unify_trade.biz.subscribe.FundingRateArbitrageData>):void (m)] (LINE:276) call: com.okinc.unify_trade.biz.subscribe.ArbitrageFundingResp.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ ArbitrageFundingResp(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5);
    }
}
