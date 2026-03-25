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
public final class CeDefiEvmGasPrice {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseFee;
    private final String l1GasPrice;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiEvmGasPrice copy$default(CeDefiEvmGasPrice ceDefiEvmGasPrice, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ceDefiEvmGasPrice.baseFee;
        }
        if ((i & 2) != 0) {
            str2 = ceDefiEvmGasPrice.maxFeePerGas;
        }
        if ((i & 4) != 0) {
            str3 = ceDefiEvmGasPrice.maxPriorityFeePerGas;
        }
        if ((i & 8) != 0) {
            str4 = ceDefiEvmGasPrice.l1GasPrice;
        }
        return ceDefiEvmGasPrice.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiEvmGasPrice copy(String str, String str2, String str3, String str4) {
        return new CeDefiEvmGasPrice(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiEvmGasPrice)) {
            return false;
        }
        CeDefiEvmGasPrice ceDefiEvmGasPrice = (CeDefiEvmGasPrice) obj;
        return Intrinsics.EZpvd((Object) this.baseFee, (Object) ceDefiEvmGasPrice.baseFee) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) ceDefiEvmGasPrice.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) ceDefiEvmGasPrice.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) ceDefiEvmGasPrice.l1GasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasPrice() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.maxFeePerGas;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxPriorityFeePerGas;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.l1GasPrice;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiEvmGasPrice(baseFee=" + this.baseFee + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", l1GasPrice=" + this.l1GasPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiEvmGasPrice> serializer() {
            return CeDefiEvmGasPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiEvmGasPrice(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, CeDefiEvmGasPrice$$serializer.INSTANCE.getDescriptor());
        }
        this.baseFee = str;
        this.maxFeePerGas = str2;
        this.maxPriorityFeePerGas = str3;
        this.l1GasPrice = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiEvmGasPrice ceDefiEvmGasPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, ceDefiEvmGasPrice.baseFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, ceDefiEvmGasPrice.maxFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, ceDefiEvmGasPrice.maxPriorityFeePerGas);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, ceDefiEvmGasPrice.l1GasPrice);
    }

    public CeDefiEvmGasPrice(String str, String str2, String str3, String str4) {
        this.baseFee = str;
        this.maxFeePerGas = str2;
        this.maxPriorityFeePerGas = str3;
        this.l1GasPrice = str4;
    }
}
