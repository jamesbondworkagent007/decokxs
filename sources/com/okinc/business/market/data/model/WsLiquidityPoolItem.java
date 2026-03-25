package com.okinc.business.market.data.model;

import com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class WsLiquidityPoolItem {
    public final List<CoinDetailPoolList> data;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(CoinDetailPoolList$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WsLiquidityPoolItem() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.WsLiquidityPoolItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsLiquidityPoolItem copy$default(WsLiquidityPoolItem wsLiquidityPoolItem, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wsLiquidityPoolItem.data;
        }
        return wsLiquidityPoolItem.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WsLiquidityPoolItem copydefault(@NotNull List<CoinDetailPoolList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new WsLiquidityPoolItem(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinDetailPoolList> copydefault() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WsLiquidityPoolItem) && Intrinsics.EZpvd(this.data, ((WsLiquidityPoolItem) obj).data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.data.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WsLiquidityPoolItem(data=" + this.data + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.WsLiquidityPoolItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WsLiquidityPoolItem> serializer() {
            return WsLiquidityPoolItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WsLiquidityPoolItem(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.data = yDY.AhwBna();
        } else {
            this.data = list;
        }
    }

    public static final /* synthetic */ void KWHzl(WsLiquidityPoolItem wsLiquidityPoolItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(wsLiquidityPoolItem.data, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], wsLiquidityPoolItem.data);
    }

    public WsLiquidityPoolItem(@NotNull List<CoinDetailPoolList> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.data = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.dexlogic.main.market.bean.CoinDetailPoolList>):void (m)] (LINE:8) call: com.okinc.business.market.data.model.WsLiquidityPoolItem.<init>(java.util.List):void type: THIS */
    public /* synthetic */ WsLiquidityPoolItem(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
