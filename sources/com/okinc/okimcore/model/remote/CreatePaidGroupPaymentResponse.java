package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreatePaidGroupPaymentResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String tradeOrderId;
    private final long transactionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreatePaidGroupPaymentResponse copy$default(CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createPaidGroupPaymentResponse.transactionId;
        }
        if ((i & 2) != 0) {
            str = createPaidGroupPaymentResponse.tradeOrderId;
        }
        return createPaidGroupPaymentResponse.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreatePaidGroupPaymentResponse copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CreatePaidGroupPaymentResponse(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePaidGroupPaymentResponse)) {
            return false;
        }
        CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse = (CreatePaidGroupPaymentResponse) obj;
        return this.transactionId == createPaidGroupPaymentResponse.transactionId && Intrinsics.EZpvd((Object) this.tradeOrderId, (Object) createPaidGroupPaymentResponse.tradeOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeOrderId() {
        return this.tradeOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.transactionId) * 31) + this.tradeOrderId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreatePaidGroupPaymentResponse(transactionId=" + this.transactionId + ", tradeOrderId=" + this.tradeOrderId + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreatePaidGroupPaymentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePaidGroupPaymentResponse> serializer() {
            return CreatePaidGroupPaymentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreatePaidGroupPaymentResponse(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CreatePaidGroupPaymentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.transactionId = j;
        this.tradeOrderId = str;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CreatePaidGroupPaymentResponse createPaidGroupPaymentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, createPaidGroupPaymentResponse.transactionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, createPaidGroupPaymentResponse.tradeOrderId);
    }

    public CreatePaidGroupPaymentResponse(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transactionId = j;
        this.tradeOrderId = str;
    }
}
