package com.okinc.wallet.hardware.impl.onekey.data;

import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams;
import com.okinc.wallet.hardware.api.onekey.BTCGetAddressParams$$serializer;
import com.okinc.wallet.hardware.api.onekey.CommonParams;
import com.okinc.wallet.hardware.api.onekey.CommonParams$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.InterfaceC57144ycq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class GetMultipleBTCAddresses implements InterfaceC57144ycq {
    private final CommonParams commonParams;
    private final String connectId;
    private final String deviceId;
    private final Params params;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetMultipleBTCAddresses copy$default(GetMultipleBTCAddresses getMultipleBTCAddresses, String str, String str2, Params params, CommonParams commonParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMultipleBTCAddresses.connectId;
        }
        if ((i & 2) != 0) {
            str2 = getMultipleBTCAddresses.deviceId;
        }
        if ((i & 4) != 0) {
            params = getMultipleBTCAddresses.params;
        }
        if ((i & 8) != 0) {
            commonParams = getMultipleBTCAddresses.commonParams;
        }
        return getMultipleBTCAddresses.copy(str, str2, params, commonParams);
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
    public final Params component3() {
        return this.params;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonParams component4() {
        return this.commonParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetMultipleBTCAddresses copy(@NotNull String str, @NotNull String str2, @NotNull Params params, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(params, "");
        return new GetMultipleBTCAddresses(str, str2, params, commonParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMultipleBTCAddresses)) {
            return false;
        }
        GetMultipleBTCAddresses getMultipleBTCAddresses = (GetMultipleBTCAddresses) obj;
        return Intrinsics.EZpvd((Object) this.connectId, (Object) getMultipleBTCAddresses.connectId) && Intrinsics.EZpvd((Object) this.deviceId, (Object) getMultipleBTCAddresses.deviceId) && Intrinsics.EZpvd(this.params, getMultipleBTCAddresses.params) && Intrinsics.EZpvd(this.commonParams, getMultipleBTCAddresses.commonParams);
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
    public final Params getParams() {
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
        return "GetMultipleBTCAddresses(connectId=" + this.connectId + ", deviceId=" + this.deviceId + ", params=" + this.params + ", commonParams=" + this.commonParams + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetMultipleBTCAddresses> serializer() {
            return GetMultipleBTCAddresses$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetMultipleBTCAddresses(int i, String str, String str2, Params params, CommonParams commonParams, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, GetMultipleBTCAddresses$$serializer.INSTANCE.getDescriptor());
        }
        this.connectId = str;
        this.deviceId = str2;
        this.params = params;
        if ((i & 8) == 0) {
            this.commonParams = null;
        } else {
            this.commonParams = commonParams;
        }
    }

    public static final /* synthetic */ void write$Self$OKHardwareWallet_hardware_wallet_impl(GetMultipleBTCAddresses getMultipleBTCAddresses, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getMultipleBTCAddresses.getConnectId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getMultipleBTCAddresses.deviceId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, GetMultipleBTCAddresses$Params$$serializer.INSTANCE, getMultipleBTCAddresses.params);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && getMultipleBTCAddresses.commonParams == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, CommonParams$$serializer.INSTANCE, getMultipleBTCAddresses.commonParams);
    }

    public GetMultipleBTCAddresses(@NotNull String str, @NotNull String str2, @NotNull Params params, CommonParams commonParams) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(params, "");
        this.connectId = str;
        this.deviceId = str2;
        this.params = params;
        this.commonParams = commonParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses$Params)
  (wrap:com.okinc.wallet.hardware.api.onekey.CommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.hardware.api.onekey.CommonParams) : (r4v0 com.okinc.wallet.hardware.api.onekey.CommonParams))
 A[MD:(java.lang.String, java.lang.String, com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses$Params, com.okinc.wallet.hardware.api.onekey.CommonParams):void (m)] (LINE:19) call: com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses.<init>(java.lang.String, java.lang.String, com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses$Params, com.okinc.wallet.hardware.api.onekey.CommonParams):void type: THIS */
    public /* synthetic */ GetMultipleBTCAddresses(String str, String str2, Params params, CommonParams commonParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, params, (i & 8) != 0 ? null : commonParams);
    }

    @Serializable
    public static final class Params {
        private final List<BTCGetAddressParams> bundle;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(BTCGetAddressParams$$serializer.INSTANCE)};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses$Params */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Params copy$default(Params params, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = params.bundle;
            }
            return params.copy(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BTCGetAddressParams> component1() {
            return this.bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Params copy(@NotNull List<BTCGetAddressParams> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Params(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && Intrinsics.EZpvd(this.bundle, ((Params) obj).bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<BTCGetAddressParams> getBundle() {
            return this.bundle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.bundle.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Params(bundle=" + this.bundle + ")";
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.hardware.impl.onekey.data.GetMultipleBTCAddresses.Params.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Params> serializer() {
                return GetMultipleBTCAddresses$Params$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Params(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, GetMultipleBTCAddresses$Params$$serializer.INSTANCE.getDescriptor());
            }
            this.bundle = list;
        }

        public Params(@NotNull List<BTCGetAddressParams> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.bundle = list;
        }
    }
}
