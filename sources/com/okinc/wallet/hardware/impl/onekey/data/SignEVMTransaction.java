package com.okinc.wallet.hardware.impl.onekey.data;

import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC57144ycq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SignEVMTransaction implements InterfaceC57144ycq {
    private final CommonParams commonParams;
    private final String connectId;
    private final String deviceId;
    private final EVMSignTransactionParams params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CommonParams.$stable | EVMSignTransactionParams.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignEVMTransaction copy$default(SignEVMTransaction signEVMTransaction, String str, String str2, EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signEVMTransaction.connectId;
        }
        if ((i & 2) != 0) {
            str2 = signEVMTransaction.deviceId;
        }
        if ((i & 4) != 0) {
            eVMSignTransactionParams = signEVMTransaction.params;
        }
        if ((i & 8) != 0) {
            commonParams = signEVMTransaction.commonParams;
        }
        return signEVMTransaction.copy(str, str2, eVMSignTransactionParams, commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.connectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVMSignTransactionParams component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonParams component4() {
        return this.commonParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignEVMTransaction copy(@NotNull String str, @NotNull String str2, @NotNull EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMSignTransactionParams, "");
        return new SignEVMTransaction(str, str2, eVMSignTransactionParams, commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignEVMTransaction)) {
            return false;
        }
        SignEVMTransaction signEVMTransaction = (SignEVMTransaction) obj;
        return Intrinsics.EZpvd((Object) this.connectId, (Object) signEVMTransaction.connectId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) signEVMTransaction.deviceId) && Intrinsics.EZpvd(this.params, signEVMTransaction.params) && Intrinsics.EZpvd(this.commonParams, signEVMTransaction.commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonParams getCommonParams() {
        return this.commonParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57144ycq
    public String getConnectId() {
        return this.connectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVMSignTransactionParams getParams() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.connectId.hashCode();
        int iHashCode2 = this.deviceId.hashCode();
        int iHashCode3 = this.params.hashCode();
        CommonParams commonParams = this.commonParams;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (commonParams == null ? 0 : commonParams.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignEVMTransaction(connectId=" + this.connectId + ", deviceId=" + this.deviceId + ", params=" + this.params + ", commonParams=" + this.commonParams + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.SignEVMTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignEVMTransaction> serializer() {
            return SignEVMTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignEVMTransaction(int i, String str, String str2, EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SignEVMTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMSignTransactionParams;
        if ((i & 8) == 0) {
            this.commonParams = null;
        } else {
            this.commonParams = commonParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(SignEVMTransaction signEVMTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signEVMTransaction.getConnectId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signEVMTransaction.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EVMSignTransactionParams$$serializer.INSTANCE, signEVMTransaction.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && signEVMTransaction.commonParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, signEVMTransaction.commonParams);
    }

    public SignEVMTransaction(@NotNull String str, @NotNull String str2, @NotNull EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMSignTransactionParams, "");
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMSignTransactionParams;
        this.commonParams = commonParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams)
  (wrap:com.okinc.wallet.hardware.api.onekey.CommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.CommonParams) : (r4v0 com.okinc.wallet.hardware.api.onekey.CommonParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void (m)] (LINE:10) call: com.okinc.wallet.hardware.impl.onekey.data.SignEVMTransaction.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMSignTransactionParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void type: THIS */
    public /* synthetic */ SignEVMTransaction(String str, String str2, EVMSignTransactionParams eVMSignTransactionParams, CommonParams commonParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, eVMSignTransactionParams, (i & 8) != 0 ? null : commonParams);
    }
}
