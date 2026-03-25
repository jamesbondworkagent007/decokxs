package com.okinc.business.web3pay.lib.features.paytransaction.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CancelClaimRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String orderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CancelClaimRequest copy$default(CancelClaimRequest cancelClaimRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelClaimRequest.orderId;
        }
        return cancelClaimRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CancelClaimRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CancelClaimRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CancelClaimRequest) && Intrinsics.EZpvd((Object) this.orderId, (Object) ((CancelClaimRequest) obj).orderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.orderId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CancelClaimRequest(orderId=" + this.orderId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.paytransaction.model.CancelClaimRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CancelClaimRequest> serializer() {
            return CancelClaimRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CancelClaimRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CancelClaimRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
    }

    public CancelClaimRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.orderId = str;
    }
}
