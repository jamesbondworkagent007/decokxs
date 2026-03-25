package com.okinc.okex.feedback.net.bean;

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
public final class ReceiptReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int feedbackId;
    private final String rejectMsg;
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReceiptReq copy$default(ReceiptReq receiptReq, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = receiptReq.feedbackId;
        }
        if ((i3 & 2) != 0) {
            i2 = receiptReq.type;
        }
        if ((i3 & 4) != 0) {
            str = receiptReq.rejectMsg;
        }
        return receiptReq.copy(i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.feedbackId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.rejectMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceiptReq copy(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ReceiptReq(i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptReq)) {
            return false;
        }
        ReceiptReq receiptReq = (ReceiptReq) obj;
        return this.feedbackId == receiptReq.feedbackId && this.type == receiptReq.type && Intrinsics.EZpvd((Object) this.rejectMsg, (Object) receiptReq.rejectMsg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeedbackId() {
        return this.feedbackId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRejectMsg() {
        return this.rejectMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.feedbackId) * 31) + Integer.hashCode(this.type)) * 31) + this.rejectMsg.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceiptReq(feedbackId=" + this.feedbackId + ", type=" + this.type + ", rejectMsg=" + this.rejectMsg + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.net.bean.ReceiptReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReceiptReq> serializer() {
            return ReceiptReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReceiptReq(int i, int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ReceiptReq$$serializer.INSTANCE.getDescriptor());
        }
        this.feedbackId = i2;
        this.type = i3;
        this.rejectMsg = str;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(ReceiptReq receiptReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, receiptReq.feedbackId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, receiptReq.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, receiptReq.rejectMsg);
    }

    public ReceiptReq(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feedbackId = i;
        this.type = i2;
        this.rejectMsg = str;
    }
}
