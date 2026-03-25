package com.okinc.business.dexlogic.main.market.bean;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class LiquidityPairData implements Parcelable {
    private final List<CoinDetailPoolList> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiquidityPairData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CoinDetailPoolList$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<LiquidityPairData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPairData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CoinDetailPoolList.CREATOR.createFromParcel(parcel));
            }
            return new LiquidityPairData(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPairData[] newArray(int i) {
            return new LiquidityPairData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityPairData() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.main.market.bean.LiquidityPairData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityPairData copy$default(LiquidityPairData liquidityPairData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liquidityPairData.list;
        }
        return liquidityPairData.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinDetailPoolList> component1() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPairData copy(@NotNull List<CoinDetailPoolList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LiquidityPairData(list);
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
        return (obj instanceof LiquidityPairData) && Intrinsics.EZpvd(this.list, ((LiquidityPairData) obj).list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinDetailPoolList> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityPairData(list=" + this.list + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CoinDetailPoolList> list = this.list;
        parcel.writeInt(list.size());
        Iterator<CoinDetailPoolList> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.market.bean.LiquidityPairData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityPairData> serializer() {
            return LiquidityPairData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityPairData(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.list = new ArrayList();
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LiquidityPairData liquidityPairData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(liquidityPairData.list, new ArrayList())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], liquidityPairData.list);
    }

    public LiquidityPairData(@NotNull List<CoinDetailPoolList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:21) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList>):void (m)] (LINE:20) call: com.okinc.business.dexlogic.main.market.bean.LiquidityPairData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ LiquidityPairData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
