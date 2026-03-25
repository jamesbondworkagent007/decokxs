package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class WithdrawPaidGroupPaymentRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WithdrawPaidGroupPaymentRequest copy$default(WithdrawPaidGroupPaymentRequest withdrawPaidGroupPaymentRequest, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = withdrawPaidGroupPaymentRequest.groupId;
        }
        return withdrawPaidGroupPaymentRequest.copy(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawPaidGroupPaymentRequest copy(long j) {
        return new WithdrawPaidGroupPaymentRequest(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WithdrawPaidGroupPaymentRequest) && this.groupId == ((WithdrawPaidGroupPaymentRequest) obj).groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Long.hashCode(this.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawPaidGroupPaymentRequest(groupId=" + this.groupId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.WithdrawPaidGroupPaymentRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WithdrawPaidGroupPaymentRequest> serializer() {
            return WithdrawPaidGroupPaymentRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WithdrawPaidGroupPaymentRequest(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WithdrawPaidGroupPaymentRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
    }

    public WithdrawPaidGroupPaymentRequest(long j) {
        this.groupId = j;
    }
}
