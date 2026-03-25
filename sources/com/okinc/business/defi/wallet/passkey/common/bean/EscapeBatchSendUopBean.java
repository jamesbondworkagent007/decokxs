package com.okinc.business.defi.wallet.passkey.common.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EscapeBatchSendUopBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long orderId;
    private final long parentOrderId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeBatchSendUopBean copy$default(EscapeBatchSendUopBean escapeBatchSendUopBean, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = escapeBatchSendUopBean.orderId;
        }
        if ((i & 2) != 0) {
            j2 = escapeBatchSendUopBean.parentOrderId;
        }
        return escapeBatchSendUopBean.copy(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeBatchSendUopBean copy(long j, long j2) {
        return new EscapeBatchSendUopBean(j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EscapeBatchSendUopBean)) {
            return false;
        }
        EscapeBatchSendUopBean escapeBatchSendUopBean = (EscapeBatchSendUopBean) obj;
        return this.orderId == escapeBatchSendUopBean.orderId && this.parentOrderId == escapeBatchSendUopBean.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getParentOrderId() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.orderId) * 31) + Long.hashCode(this.parentOrderId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeBatchSendUopBean(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.EscapeBatchSendUopBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeBatchSendUopBean> serializer() {
            return EscapeBatchSendUopBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeBatchSendUopBean(int i, long j, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EscapeBatchSendUopBean$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = j;
        this.parentOrderId = j2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeBatchSendUopBean escapeBatchSendUopBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, escapeBatchSendUopBean.orderId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, escapeBatchSendUopBean.parentOrderId);
    }

    public EscapeBatchSendUopBean(long j, long j2) {
        this.orderId = j;
        this.parentOrderId = j2;
    }
}
