package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OrderUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int projectId;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String tradeOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OrderUopRequest copy$default(OrderUopRequest orderUopRequest, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = orderUopRequest.tokenAmount;
        }
        if ((i2 & 2) != 0) {
            str2 = orderUopRequest.tokenCoinTypeNo;
        }
        if ((i2 & 4) != 0) {
            i = orderUopRequest.projectId;
        }
        if ((i2 & 8) != 0) {
            str3 = orderUopRequest.tradeOrderId;
        }
        return orderUopRequest.copy(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderUopRequest copy(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderUopRequest(str, str2, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderUopRequest)) {
            return false;
        }
        OrderUopRequest orderUopRequest = (OrderUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.tokenAmount, (Object) orderUopRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) orderUopRequest.tokenCoinTypeNo) && this.projectId == orderUopRequest.projectId && Intrinsics.EZpvd((Object) this.tradeOrderId, (Object) orderUopRequest.tradeOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeOrderId() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.tokenAmount.hashCode() * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + Integer.hashCode(this.projectId)) * 31) + this.tradeOrderId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderUopRequest(tokenAmount=" + this.tokenAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", projectId=" + this.projectId + ", tradeOrderId=" + this.tradeOrderId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.OrderUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderUopRequest> serializer() {
            return OrderUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderUopRequest(int i, String str, String str2, int i2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OrderUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenAmount = str;
        this.tokenCoinTypeNo = str2;
        this.projectId = i2;
        this.tradeOrderId = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OrderUopRequest orderUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, orderUopRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderUopRequest.tokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, orderUopRequest.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, orderUopRequest.tradeOrderId);
    }

    public OrderUopRequest(@NotNull String str, @NotNull String str2, int i, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tokenAmount = str;
        this.tokenCoinTypeNo = str2;
        this.projectId = i;
        this.tradeOrderId = str3;
    }
}
