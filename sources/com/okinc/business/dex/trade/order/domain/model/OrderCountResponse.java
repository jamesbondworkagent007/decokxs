package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.gKV;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class OrderCountResponse implements gKV {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int numLimit;
    private final int orderNum;
    private final int strategyNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderCountResponse() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderCountResponse copy$default(OrderCountResponse orderCountResponse, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = orderCountResponse.orderNum;
        }
        if ((i4 & 2) != 0) {
            i2 = orderCountResponse.numLimit;
        }
        if ((i4 & 4) != 0) {
            i3 = orderCountResponse.strategyNum;
        }
        return orderCountResponse.copy(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.orderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.numLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.strategyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderCountResponse copy(int i, int i2, int i3) {
        return new OrderCountResponse(i, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderCountResponse)) {
            return false;
        }
        OrderCountResponse orderCountResponse = (OrderCountResponse) obj;
        return this.orderNum == orderCountResponse.orderNum && this.numLimit == orderCountResponse.numLimit && this.strategyNum == orderCountResponse.strategyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getNumLimit() {
        return this.numLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKV
    public int getOrderNum() {
        return this.orderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gKV
    public int getStrategyNum() {
        return this.strategyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.orderNum) * 31) + Integer.hashCode(this.numLimit)) * 31) + Integer.hashCode(this.strategyNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderCountResponse(orderNum=" + this.orderNum + ", numLimit=" + this.numLimit + ", strategyNum=" + this.strategyNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.OrderCountResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderCountResponse> serializer() {
            return OrderCountResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderCountResponse(int i, int i2, int i3, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderNum = 0;
        } else {
            this.orderNum = i2;
        }
        if ((i & 2) == 0) {
            this.numLimit = 0;
        } else {
            this.numLimit = i3;
        }
        if ((i & 4) == 0) {
            this.strategyNum = 0;
        } else {
            this.strategyNum = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderCountResponse orderCountResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || orderCountResponse.getOrderNum() != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, orderCountResponse.getOrderNum());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || orderCountResponse.getNumLimit() != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, orderCountResponse.getNumLimit());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && orderCountResponse.getStrategyNum() == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, orderCountResponse.getStrategyNum());
    }

    public OrderCountResponse(int i, int i2, int i3) {
        this.orderNum = i;
        this.numLimit = i2;
        this.strategyNum = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(int, int, int):void (m)] (LINE:9) call: com.okinc.business.dex.trade.order.domain.model.OrderCountResponse.<init>(int, int, int):void type: THIS */
    public /* synthetic */ OrderCountResponse(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
