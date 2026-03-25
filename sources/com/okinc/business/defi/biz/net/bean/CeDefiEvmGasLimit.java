package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiEvmGasLimit {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String callGasLimit;
    private final String l1GasLimit;
    private final String paymasterPostOpGasLimit;
    private final String paymasterVerificationGasLimit;
    private final String preVerificationGas;
    private final String verificationGasLimit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiEvmGasLimit copy$default(CeDefiEvmGasLimit ceDefiEvmGasLimit, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ceDefiEvmGasLimit.callGasLimit;
        }
        if ((i & 2) != 0) {
            str2 = ceDefiEvmGasLimit.verificationGasLimit;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = ceDefiEvmGasLimit.preVerificationGas;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = ceDefiEvmGasLimit.paymasterVerificationGasLimit;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = ceDefiEvmGasLimit.paymasterPostOpGasLimit;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = ceDefiEvmGasLimit.l1GasLimit;
        }
        return ceDefiEvmGasLimit.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasLimit copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new CeDefiEvmGasLimit(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiEvmGasLimit)) {
            return false;
        }
        CeDefiEvmGasLimit ceDefiEvmGasLimit = (CeDefiEvmGasLimit) obj;
        return Intrinsics.EZpvd((Object) this.callGasLimit, (Object) ceDefiEvmGasLimit.callGasLimit) && Intrinsics.EZpvd((Object) this.verificationGasLimit, (Object) ceDefiEvmGasLimit.verificationGasLimit) && Intrinsics.EZpvd((Object) this.preVerificationGas, (Object) ceDefiEvmGasLimit.preVerificationGas) && Intrinsics.EZpvd((Object) this.paymasterVerificationGasLimit, (Object) ceDefiEvmGasLimit.paymasterVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterPostOpGasLimit, (Object) ceDefiEvmGasLimit.paymasterPostOpGasLimit) && Intrinsics.EZpvd((Object) this.l1GasLimit, (Object) ceDefiEvmGasLimit.l1GasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallGasLimit() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasLimit() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreVerificationGas() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerificationGasLimit() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.callGasLimit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.verificationGasLimit;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.preVerificationGas;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.paymasterVerificationGasLimit;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.paymasterPostOpGasLimit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.l1GasLimit;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiEvmGasLimit(callGasLimit=" + this.callGasLimit + ", verificationGasLimit=" + this.verificationGasLimit + ", preVerificationGas=" + this.preVerificationGas + ", paymasterVerificationGasLimit=" + this.paymasterVerificationGasLimit + ", paymasterPostOpGasLimit=" + this.paymasterPostOpGasLimit + ", l1GasLimit=" + this.l1GasLimit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiEvmGasLimit> serializer() {
            return CeDefiEvmGasLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiEvmGasLimit(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, CeDefiEvmGasLimit$$serializer.INSTANCE.getDescriptor());
        }
        this.callGasLimit = str;
        this.verificationGasLimit = str2;
        this.preVerificationGas = str3;
        this.paymasterVerificationGasLimit = str4;
        this.paymasterPostOpGasLimit = str5;
        this.l1GasLimit = str6;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiEvmGasLimit ceDefiEvmGasLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, ceDefiEvmGasLimit.callGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, ceDefiEvmGasLimit.verificationGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, ceDefiEvmGasLimit.preVerificationGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, ceDefiEvmGasLimit.paymasterVerificationGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, ceDefiEvmGasLimit.paymasterPostOpGasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, ceDefiEvmGasLimit.l1GasLimit);
    }

    public CeDefiEvmGasLimit(String str, String str2, String str3, String str4, String str5, String str6) {
        this.callGasLimit = str;
        this.verificationGasLimit = str2;
        this.preVerificationGas = str3;
        this.paymasterVerificationGasLimit = str4;
        this.paymasterPostOpGasLimit = str5;
        this.l1GasLimit = str6;
    }
}
