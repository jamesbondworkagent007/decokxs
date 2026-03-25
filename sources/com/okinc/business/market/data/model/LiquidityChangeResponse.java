package com.okinc.business.market.data.model;

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
public final class LiquidityChangeResponse {
    public final int hasMore;
    public final List<LiquidityChangeData> list;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(LiquidityChangeData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChangeResponse() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.LiquidityChangeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityChangeResponse copy$default(LiquidityChangeResponse liquidityChangeResponse, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liquidityChangeResponse.hasMore;
        }
        if ((i2 & 2) != 0) {
            list = liquidityChangeResponse.list;
        }
        return liquidityChangeResponse.KWHzl(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LiquidityChangeData> AEQbTJ() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.hasMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChangeResponse KWHzl(int i, @NotNull List<LiquidityChangeData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LiquidityChangeResponse(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiquidityChangeResponse)) {
            return false;
        }
        LiquidityChangeResponse liquidityChangeResponse = (LiquidityChangeResponse) obj;
        return this.hasMore == liquidityChangeResponse.hasMore && Intrinsics.EZpvd(this.list, liquidityChangeResponse.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.hasMore) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChangeResponse(hasMore=" + this.hasMore + ", list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.LiquidityChangeResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiquidityChangeResponse> serializer() {
            return LiquidityChangeResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiquidityChangeResponse(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.hasMore = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.list = yDY.AhwBna();
        } else {
            this.list = list;
        }
    }

    public static final /* synthetic */ void AEQbTJ(LiquidityChangeResponse liquidityChangeResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liquidityChangeResponse.hasMore != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, liquidityChangeResponse.hasMore);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(liquidityChangeResponse.list, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], liquidityChangeResponse.list);
    }

    public LiquidityChangeResponse(int i, @NotNull List<LiquidityChangeData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.hasMore = i;
        this.list = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.business.market.data.model.LiquidityChangeData>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.LiquidityChangeResponse.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ LiquidityChangeResponse(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }
}
