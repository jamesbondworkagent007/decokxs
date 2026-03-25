package com.okinc.crcore.coreapi.net.responsebean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OrderSummary {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String totalPendingOrderNum;
    private final String totalnotionalUsd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OrderSummary() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderSummary copy$default(OrderSummary orderSummary, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderSummary.totalPendingOrderNum;
        }
        if ((i & 2) != 0) {
            str2 = orderSummary.totalnotionalUsd;
        }
        return orderSummary.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalnotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderSummary copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new OrderSummary(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderSummary)) {
            return false;
        }
        OrderSummary orderSummary = (OrderSummary) obj;
        return Intrinsics.EZpvd((Object) this.totalPendingOrderNum, (Object) orderSummary.totalPendingOrderNum) && Intrinsics.EZpvd((Object) this.totalnotionalUsd, (Object) orderSummary.totalnotionalUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalPendingOrderNum() {
        return this.totalPendingOrderNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalnotionalUsd() {
        return this.totalnotionalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.totalPendingOrderNum.hashCode() * 31) + this.totalnotionalUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderSummary(totalPendingOrderNum=" + this.totalPendingOrderNum + ", totalnotionalUsd=" + this.totalnotionalUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.OrderSummary.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderSummary> serializer() {
            return OrderSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderSummary(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalPendingOrderNum = "";
        } else {
            this.totalPendingOrderNum = str;
        }
        if ((i & 2) == 0) {
            this.totalnotionalUsd = "";
        } else {
            this.totalnotionalUsd = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(OrderSummary orderSummary, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) orderSummary.totalPendingOrderNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, orderSummary.totalPendingOrderNum);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) orderSummary.totalnotionalUsd, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderSummary.totalnotionalUsd);
    }

    public OrderSummary(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.totalPendingOrderNum = str;
        this.totalnotionalUsd = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.crcore.coreapi.net.responsebean.OrderSummary.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderSummary(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
