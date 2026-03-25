package com.okinc.ok_kyc_core.data.remote.networkmodel;

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
public final class MultiVendorVerifyResponse {
    public static final int $stable = 0;
    private final long bizId;
    private final MultiVendorResultStatus status;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, MultiVendorResultStatus.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiVendorVerifyResponse copy$default(MultiVendorVerifyResponse multiVendorVerifyResponse, long j, MultiVendorResultStatus multiVendorResultStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            j = multiVendorVerifyResponse.bizId;
        }
        if ((i & 2) != 0) {
            multiVendorResultStatus = multiVendorVerifyResponse.status;
        }
        return multiVendorVerifyResponse.copy(j, multiVendorResultStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorResultStatus component2() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorVerifyResponse copy(long j, @NotNull MultiVendorResultStatus multiVendorResultStatus) {
        Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
        return new MultiVendorVerifyResponse(j, multiVendorResultStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiVendorVerifyResponse)) {
            return false;
        }
        MultiVendorVerifyResponse multiVendorVerifyResponse = (MultiVendorVerifyResponse) obj;
        return this.bizId == multiVendorVerifyResponse.bizId && this.status == multiVendorVerifyResponse.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorResultStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.bizId) * 31) + this.status.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiVendorVerifyResponse(bizId=" + this.bizId + ", status=" + this.status + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiVendorVerifyResponse> serializer() {
            return MultiVendorVerifyResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiVendorVerifyResponse(int i, long j, MultiVendorResultStatus multiVendorResultStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MultiVendorVerifyResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.bizId = j;
        if ((i & 2) == 0) {
            this.status = MultiVendorResultStatus.NoRecord;
        } else {
            this.status = multiVendorResultStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MultiVendorVerifyResponse multiVendorVerifyResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeLongElement(serialDescriptor, 0, multiVendorVerifyResponse.bizId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && multiVendorVerifyResponse.status == MultiVendorResultStatus.NoRecord) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], multiVendorVerifyResponse.status);
    }

    public MultiVendorVerifyResponse(long j, @NotNull MultiVendorResultStatus multiVendorResultStatus) {
        Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
        this.bizId = j;
        this.status = multiVendorResultStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 long)
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus:0x0004: SGET  A[WRAPPED] (LINE:49) com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus.NoRecord com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus) : (r3v0 com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus))
 A[MD:(long, com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus):void (m)] (LINE:45) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorVerifyResponse.<init>(long, com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus):void type: THIS */
    public /* synthetic */ MultiVendorVerifyResponse(long j, MultiVendorResultStatus multiVendorResultStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? MultiVendorResultStatus.NoRecord : multiVendorResultStatus);
    }
}
