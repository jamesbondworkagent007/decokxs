package com.okinc.wallet.hardware.impl.onekey.data;

import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params;
import com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params$$serializer;
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

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class SignEVMEIP712Message implements InterfaceC57144ycq {
    private final CommonParams commonParams;
    private final String connectId;
    private final String deviceId;
    private final EVMSignMessageEIP712Params params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CommonParams.$stable | EVMSignMessageEIP712Params.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignEVMEIP712Message copy$default(SignEVMEIP712Message signEVMEIP712Message, String str, String str2, EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signEVMEIP712Message.connectId;
        }
        if ((i & 2) != 0) {
            str2 = signEVMEIP712Message.deviceId;
        }
        if ((i & 4) != 0) {
            eVMSignMessageEIP712Params = signEVMEIP712Message.params;
        }
        if ((i & 8) != 0) {
            commonParams = signEVMEIP712Message.commonParams;
        }
        return signEVMEIP712Message.copy(str, str2, eVMSignMessageEIP712Params, commonParams);
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
    public final EVMSignMessageEIP712Params component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonParams component4() {
        return this.commonParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignEVMEIP712Message copy(@NotNull String str, @NotNull String str2, @NotNull EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMSignMessageEIP712Params, "");
        return new SignEVMEIP712Message(str, str2, eVMSignMessageEIP712Params, commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignEVMEIP712Message)) {
            return false;
        }
        SignEVMEIP712Message signEVMEIP712Message = (SignEVMEIP712Message) obj;
        return Intrinsics.EZpvd((Object) this.connectId, (Object) signEVMEIP712Message.connectId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) signEVMEIP712Message.deviceId) && Intrinsics.EZpvd(this.params, signEVMEIP712Message.params) && Intrinsics.EZpvd(this.commonParams, signEVMEIP712Message.commonParams);
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
    public final EVMSignMessageEIP712Params getParams() {
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
        return "SignEVMEIP712Message(connectId=" + this.connectId + ", deviceId=" + this.deviceId + ", params=" + this.params + ", commonParams=" + this.commonParams + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.SignEVMEIP712Message.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignEVMEIP712Message> serializer() {
            return SignEVMEIP712Message$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignEVMEIP712Message(int i, String str, String str2, EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, SignEVMEIP712Message$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMSignMessageEIP712Params;
        if ((i & 8) == 0) {
            this.commonParams = null;
        } else {
            this.commonParams = commonParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(SignEVMEIP712Message signEVMEIP712Message, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, signEVMEIP712Message.getConnectId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, signEVMEIP712Message.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EVMSignMessageEIP712Params$$serializer.INSTANCE, signEVMEIP712Message.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && signEVMEIP712Message.commonParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, signEVMEIP712Message.commonParams);
    }

    public SignEVMEIP712Message(@NotNull String str, @NotNull String str2, @NotNull EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMSignMessageEIP712Params, "");
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMSignMessageEIP712Params;
        this.commonParams = commonParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params)
  (wrap:com.okinc.wallet.hardware.api.onekey.CommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.CommonParams) : (r4v0 com.okinc.wallet.hardware.api.onekey.CommonParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params, com.okinc.wallet.hardware.api.onekey.CommonParams):void (m)] (LINE:20) call: com.okinc.wallet.hardware.impl.onekey.data.SignEVMEIP712Message.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMSignMessageEIP712Params, com.okinc.wallet.hardware.api.onekey.CommonParams):void type: THIS */
    public /* synthetic */ SignEVMEIP712Message(String str, String str2, EVMSignMessageEIP712Params eVMSignMessageEIP712Params, CommonParams commonParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, eVMSignMessageEIP712Params, (i & 8) != 0 ? null : commonParams);
    }
}
