package com.okinc.wallet.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DappSupportCheck implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean aaResult;
    private final boolean mpcResult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappSupportCheck copy$default(DappSupportCheck dappSupportCheck, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dappSupportCheck.mpcResult;
        }
        if ((i & 2) != 0) {
            z2 = dappSupportCheck.aaResult;
        }
        return dappSupportCheck.copy(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.mpcResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.aaResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappSupportCheck copy(boolean z, boolean z2) {
        return new DappSupportCheck(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DappSupportCheck)) {
            return false;
        }
        DappSupportCheck dappSupportCheck = (DappSupportCheck) obj;
        return this.mpcResult == dappSupportCheck.mpcResult && this.aaResult == dappSupportCheck.aaResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAaResult() {
        return this.aaResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMpcResult() {
        return this.mpcResult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.mpcResult) * 31) + Boolean.hashCode(this.aaResult);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappSupportCheck(mpcResult=" + this.mpcResult + ", aaResult=" + this.aaResult + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.bean.DappSupportCheck.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappSupportCheck> serializer() {
            return DappSupportCheck$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DappSupportCheck(int i, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, DappSupportCheck$$serializer.INSTANCE.getDescriptor());
        }
        this.mpcResult = z;
        this.aaResult = z2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(DappSupportCheck dappSupportCheck, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, dappSupportCheck.mpcResult);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, dappSupportCheck.aaResult);
    }

    public DappSupportCheck(boolean z, boolean z2) {
        this.mpcResult = z;
        this.aaResult = z2;
    }
}
