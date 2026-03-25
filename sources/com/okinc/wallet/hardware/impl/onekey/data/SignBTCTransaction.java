package com.okinc.wallet.hardware.impl.onekey.data;

import com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams;
import com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
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
public final class SignBTCTransaction implements InterfaceC57144ycq {
    private final CommonParams commonParams;
    private final String connectId;
    private final String deviceId;
    private final BTCSignTransactionParams params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CommonParams.$stable | BTCSignTransactionParams.$stable;

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
    public final BTCSignTransactionParams getParams() {
        return this.params;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.SignBTCTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignBTCTransaction> serializer() {
            return SignBTCTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignBTCTransaction(int i, String str, String str2, BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SignBTCTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
        this.deviceId = str2;
        this.params = bTCSignTransactionParams;
        if ((i & 8) == 0) {
            this.commonParams = null;
        } else {
            this.commonParams = commonParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(SignBTCTransaction signBTCTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signBTCTransaction.getConnectId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signBTCTransaction.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BTCSignTransactionParams$$serializer.INSTANCE, signBTCTransaction.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && signBTCTransaction.commonParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, signBTCTransaction.commonParams);
    }

    public SignBTCTransaction(@NotNull String str, @NotNull String str2, @NotNull BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(bTCSignTransactionParams, "");
        this.connectId = str;
        this.deviceId = str2;
        this.params = bTCSignTransactionParams;
        this.commonParams = commonParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams)
  (wrap:com.okinc.wallet.hardware.api.onekey.CommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.CommonParams) : (r4v0 com.okinc.wallet.hardware.api.onekey.CommonParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void (m)] (LINE:10) call: com.okinc.wallet.hardware.impl.onekey.data.SignBTCTransaction.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.BTCSignTransactionParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void type: THIS */
    public /* synthetic */ SignBTCTransaction(String str, String str2, BTCSignTransactionParams bTCSignTransactionParams, CommonParams commonParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bTCSignTransactionParams, (i & 8) != 0 ? null : commonParams);
    }
}
