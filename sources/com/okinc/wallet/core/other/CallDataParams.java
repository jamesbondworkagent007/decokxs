package com.okinc.wallet.core.other;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class CallDataParams {
    private long chainId;
    private int contractFunctionType;
    private String params;
    private int tokenType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallDataParams() {
        this(0L, 0, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CallDataParams copy$default(CallDataParams callDataParams, long j, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = callDataParams.chainId;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = callDataParams.tokenType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = callDataParams.contractFunctionType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = callDataParams.params;
        }
        return callDataParams.copy(j2, i4, i5, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.contractFunctionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallDataParams copy(long j, int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CallDataParams(j, i, i2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallDataParams)) {
            return false;
        }
        CallDataParams callDataParams = (CallDataParams) obj;
        return this.chainId == callDataParams.chainId && this.tokenType == callDataParams.tokenType && this.contractFunctionType == callDataParams.contractFunctionType && Intrinsics.EZpvd((Object) this.params, (Object) callDataParams.params);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getContractFunctionType() {
        return this.contractFunctionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.chainId) * 31) + Integer.hashCode(this.tokenType)) * 31) + Integer.hashCode(this.contractFunctionType)) * 31) + this.params.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractFunctionType(int i) {
        this.contractFunctionType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.params = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(int i) {
        this.tokenType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallDataParams(chainId=" + this.chainId + ", tokenType=" + this.tokenType + ", contractFunctionType=" + this.contractFunctionType + ", params=" + this.params + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.other.CallDataParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CallDataParams> serializer() {
            return CallDataParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CallDataParams(int i, long j, int i2, int i3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : j;
        if ((i & 2) == 0) {
            this.tokenType = 0;
        } else {
            this.tokenType = i2;
        }
        if ((i & 4) == 0) {
            this.contractFunctionType = 0;
        } else {
            this.contractFunctionType = i3;
        }
        if ((i & 8) == 0) {
            this.params = "";
        } else {
            this.params = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(CallDataParams callDataParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || callDataParams.chainId != -1) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, callDataParams.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || callDataParams.tokenType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, callDataParams.tokenType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || callDataParams.contractFunctionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, callDataParams.contractFunctionType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) callDataParams.params, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, callDataParams.params);
    }

    public CallDataParams(long j, int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = j;
        this.tokenType = i;
        this.contractFunctionType = i2;
        this.params = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r7v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(long, int, int, java.lang.String):void (m)] (LINE:32) call: com.okinc.wallet.core.other.CallDataParams.<init>(long, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ CallDataParams(long j, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1L : j, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str);
    }
}
