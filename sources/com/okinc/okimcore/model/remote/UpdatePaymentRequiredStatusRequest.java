package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class UpdatePaymentRequiredStatusRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupId;
    private final long memberUid;
    private final int paymentRequiredStatus;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdatePaymentRequiredStatusRequest copy$default(UpdatePaymentRequiredStatusRequest updatePaymentRequiredStatusRequest, long j, long j2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = updatePaymentRequiredStatusRequest.groupId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = updatePaymentRequiredStatusRequest.memberUid;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            i = updatePaymentRequiredStatusRequest.paymentRequiredStatus;
        }
        return updatePaymentRequiredStatusRequest.copy(j3, j4, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdatePaymentRequiredStatusRequest copy(long j, long j2, int i) {
        return new UpdatePaymentRequiredStatusRequest(j, j2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePaymentRequiredStatusRequest)) {
            return false;
        }
        UpdatePaymentRequiredStatusRequest updatePaymentRequiredStatusRequest = (UpdatePaymentRequiredStatusRequest) obj;
        return this.groupId == updatePaymentRequiredStatusRequest.groupId && this.memberUid == updatePaymentRequiredStatusRequest.memberUid && this.paymentRequiredStatus == updatePaymentRequiredStatusRequest.paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMemberUid() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPaymentRequiredStatus() {
        return this.paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.groupId) * 31) + Long.hashCode(this.memberUid)) * 31) + Integer.hashCode(this.paymentRequiredStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdatePaymentRequiredStatusRequest(groupId=" + this.groupId + ", memberUid=" + this.memberUid + ", paymentRequiredStatus=" + this.paymentRequiredStatus + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.UpdatePaymentRequiredStatusRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdatePaymentRequiredStatusRequest> serializer() {
            return UpdatePaymentRequiredStatusRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdatePaymentRequiredStatusRequest(int i, long j, long j2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, UpdatePaymentRequiredStatusRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        this.memberUid = j2;
        this.paymentRequiredStatus = i2;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(UpdatePaymentRequiredStatusRequest updatePaymentRequiredStatusRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, updatePaymentRequiredStatusRequest.groupId);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, updatePaymentRequiredStatusRequest.memberUid);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, updatePaymentRequiredStatusRequest.paymentRequiredStatus);
    }

    public UpdatePaymentRequiredStatusRequest(long j, long j2, int i) {
        this.groupId = j;
        this.memberUid = j2;
        this.paymentRequiredStatus = i;
    }
}
