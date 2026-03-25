package com.okinc.wallet.hardware.impl.onekey.data;

import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams$$serializer;
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
public final class GetEVMAddress implements InterfaceC57144ycq {
    private final CommonParams commonParams;
    private final String connectId;
    private final String deviceId;
    private final EVMGetAddressParams params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = CommonParams.$stable | EVMGetAddressParams.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetEVMAddress copy$default(GetEVMAddress getEVMAddress, String str, String str2, EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEVMAddress.connectId;
        }
        if ((i & 2) != 0) {
            str2 = getEVMAddress.deviceId;
        }
        if ((i & 4) != 0) {
            eVMGetAddressParams = getEVMAddress.params;
        }
        if ((i & 8) != 0) {
            commonParams = getEVMAddress.commonParams;
        }
        return getEVMAddress.copy(str, str2, eVMGetAddressParams, commonParams);
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
    public final EVMGetAddressParams component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonParams component4() {
        return this.commonParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetEVMAddress copy(@NotNull String str, @NotNull String str2, @NotNull EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMGetAddressParams, "");
        return new GetEVMAddress(str, str2, eVMGetAddressParams, commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetEVMAddress)) {
            return false;
        }
        GetEVMAddress getEVMAddress = (GetEVMAddress) obj;
        return Intrinsics.EZpvd((Object) this.connectId, (Object) getEVMAddress.connectId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) getEVMAddress.deviceId) && Intrinsics.EZpvd(this.params, getEVMAddress.params) && Intrinsics.EZpvd(this.commonParams, getEVMAddress.commonParams);
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
    public final EVMGetAddressParams getParams() {
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
        return "GetEVMAddress(connectId=" + this.connectId + ", deviceId=" + this.deviceId + ", params=" + this.params + ", commonParams=" + this.commonParams + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.GetEVMAddress.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetEVMAddress> serializer() {
            return GetEVMAddress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetEVMAddress(int i, String str, String str2, EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetEVMAddress$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMGetAddressParams;
        if ((i & 8) == 0) {
            this.commonParams = null;
        } else {
            this.commonParams = commonParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(GetEVMAddress getEVMAddress, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getEVMAddress.getConnectId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getEVMAddress.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, EVMGetAddressParams$$serializer.INSTANCE, getEVMAddress.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && getEVMAddress.commonParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, getEVMAddress.commonParams);
    }

    public GetEVMAddress(@NotNull String str, @NotNull String str2, @NotNull EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(eVMGetAddressParams, "");
        this.connectId = str;
        this.deviceId = str2;
        this.params = eVMGetAddressParams;
        this.commonParams = commonParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams)
  (wrap:com.okinc.wallet.hardware.api.onekey.CommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.CommonParams) : (r4v0 com.okinc.wallet.hardware.api.onekey.CommonParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void (m)] (LINE:11) call: com.okinc.wallet.hardware.impl.onekey.data.GetEVMAddress.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.api.onekey.EVMGetAddressParams, com.okinc.wallet.hardware.api.onekey.CommonParams):void type: THIS */
    public /* synthetic */ GetEVMAddress(String str, String str2, EVMGetAddressParams eVMGetAddressParams, CommonParams commonParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, eVMGetAddressParams, (i & 8) != 0 ? null : commonParams);
    }
}
