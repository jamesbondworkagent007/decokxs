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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class MultiVendorResultResp {
    public static final int $stable = 0;
    private final long bizId;
    private final String message;
    private final MultiVendorResultStatus status;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {MultiVendorResultStatus.Companion.serializer(), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiVendorResultResp copy$default(MultiVendorResultResp multiVendorResultResp, MultiVendorResultStatus multiVendorResultStatus, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            multiVendorResultStatus = multiVendorResultResp.status;
        }
        if ((i & 2) != 0) {
            j = multiVendorResultResp.bizId;
        }
        if ((i & 4) != 0) {
            str = multiVendorResultResp.message;
        }
        return multiVendorResultResp.copy(multiVendorResultStatus, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorResultStatus component1() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorResultResp copy(@NotNull MultiVendorResultStatus multiVendorResultStatus, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MultiVendorResultResp(multiVendorResultStatus, j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiVendorResultResp)) {
            return false;
        }
        MultiVendorResultResp multiVendorResultResp = (MultiVendorResultResp) obj;
        return this.status == multiVendorResultResp.status && this.bizId == multiVendorResultResp.bizId && Intrinsics.EZpvd((Object) this.message, (Object) multiVendorResultResp.message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBizId() {
        return this.bizId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorResultStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.status.hashCode() * 31) + Long.hashCode(this.bizId)) * 31) + this.message.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiVendorResultResp(status=" + this.status + ", bizId=" + this.bizId + ", message=" + this.message + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiVendorResultResp> serializer() {
            return MultiVendorResultResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiVendorResultResp(int i, MultiVendorResultStatus multiVendorResultStatus, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, MultiVendorResultResp$$serializer.INSTANCE.getDescriptor());
        }
        this.status = multiVendorResultStatus;
        this.bizId = j;
        if ((i & 4) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(MultiVendorResultResp multiVendorResultResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], multiVendorResultResp.status);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, multiVendorResultResp.bizId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) multiVendorResultResp.message, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, multiVendorResultResp.message);
    }

    public MultiVendorResultResp(@NotNull MultiVendorResultStatus multiVendorResultStatus, long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(multiVendorResultStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.status = multiVendorResultStatus;
        this.bizId = j;
        this.message = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus)
  (r2v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus, long, java.lang.String):void (m)] (LINE:31) call: com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultResp.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorResultStatus, long, java.lang.String):void type: THIS */
    public /* synthetic */ MultiVendorResultResp(MultiVendorResultStatus multiVendorResultStatus, long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiVendorResultStatus, j, (i & 4) != 0 ? "" : str);
    }
}
