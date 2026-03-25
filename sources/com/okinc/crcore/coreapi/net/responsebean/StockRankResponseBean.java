package com.okinc.crcore.coreapi.net.responsebean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class StockRankResponseBean {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<StockTokenResponseBean> futures;
    private final List<StockTokenResponseBean> spot;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StockRankResponseBean() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.StockRankResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StockRankResponseBean copy$default(StockRankResponseBean stockRankResponseBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = stockRankResponseBean.spot;
        }
        if ((i & 2) != 0) {
            list2 = stockRankResponseBean.futures;
        }
        return stockRankResponseBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenResponseBean> component1() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenResponseBean> component2() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StockRankResponseBean copy(@NotNull List<StockTokenResponseBean> list, @NotNull List<StockTokenResponseBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new StockRankResponseBean(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockRankResponseBean)) {
            return false;
        }
        StockRankResponseBean stockRankResponseBean = (StockRankResponseBean) obj;
        return Intrinsics.EZpvd(this.spot, stockRankResponseBean.spot) && Intrinsics.EZpvd(this.futures, stockRankResponseBean.futures);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenResponseBean> getFutures() {
        return this.futures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StockTokenResponseBean> getSpot() {
        return this.spot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.spot.hashCode() * 31) + this.futures.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StockRankResponseBean(spot=" + this.spot + ", futures=" + this.futures + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.StockRankResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StockRankResponseBean> serializer() {
            return StockRankResponseBean$$serializer.INSTANCE;
        }
    }

    static {
        StockTokenResponseBean$$serializer stockTokenResponseBean$$serializer = StockTokenResponseBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stockTokenResponseBean$$serializer), new ArrayListSerializer(stockTokenResponseBean$$serializer)};
    }

    public /* synthetic */ StockRankResponseBean(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.spot = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.futures = yDY.AhwBna();
        } else {
            this.futures = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(StockRankResponseBean stockRankResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(stockRankResponseBean.spot, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], stockRankResponseBean.spot);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(stockRankResponseBean.futures, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], stockRankResponseBean.futures);
    }

    public StockRankResponseBean(@NotNull List<StockTokenResponseBean> list, @NotNull List<StockTokenResponseBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.spot = list;
        this.futures = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:27)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.StockTokenResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.StockTokenResponseBean>):void (m)] (LINE:26) call: com.okinc.crcore.coreapi.net.responsebean.StockRankResponseBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ StockRankResponseBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}
