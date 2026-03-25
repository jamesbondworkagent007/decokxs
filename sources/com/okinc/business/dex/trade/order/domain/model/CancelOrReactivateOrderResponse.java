package com.okinc.business.dex.trade.order.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CancelOrReactivateOrderResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int updateNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CancelOrReactivateOrderResponse copy$default(CancelOrReactivateOrderResponse cancelOrReactivateOrderResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cancelOrReactivateOrderResponse.updateNum;
        }
        return cancelOrReactivateOrderResponse.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.updateNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelOrReactivateOrderResponse copy(int i) {
        return new CancelOrReactivateOrderResponse(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelOrReactivateOrderResponse) && this.updateNum == ((CancelOrReactivateOrderResponse) obj).updateNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUpdateNum() {
        return this.updateNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.updateNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CancelOrReactivateOrderResponse(updateNum=" + this.updateNum + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.domain.model.CancelOrReactivateOrderResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CancelOrReactivateOrderResponse> serializer() {
            return CancelOrReactivateOrderResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CancelOrReactivateOrderResponse(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CancelOrReactivateOrderResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.updateNum = i2;
    }

    public CancelOrReactivateOrderResponse(int i) {
        this.updateNum = i;
    }
}
