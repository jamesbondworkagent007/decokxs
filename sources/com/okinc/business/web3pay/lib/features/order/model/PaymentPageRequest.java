package com.okinc.business.web3pay.lib.features.order.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PaymentPageRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String tradeOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaymentPageRequest copy$default(PaymentPageRequest paymentPageRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentPageRequest.tradeOrderId;
        }
        return paymentPageRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentPageRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PaymentPageRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentPageRequest) && Intrinsics.EZpvd((Object) this.tradeOrderId, (Object) ((PaymentPageRequest) obj).tradeOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeOrderId() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tradeOrderId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentPageRequest(tradeOrderId=" + this.tradeOrderId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.order.model.PaymentPageRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentPageRequest> serializer() {
            return PaymentPageRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaymentPageRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PaymentPageRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeOrderId = str;
    }

    public PaymentPageRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tradeOrderId = str;
    }
}
