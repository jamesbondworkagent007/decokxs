package com.okinc.business.web3pay.lib.core.network.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C31270lqp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GasFeeSubResponse extends C31270lqp {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String baseFee;
    private final String chainIndex;
    private final String l1GasPrice;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GasFeeSubResponse copy$default(GasFeeSubResponse gasFeeSubResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gasFeeSubResponse.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = gasFeeSubResponse.baseFee;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = gasFeeSubResponse.maxFeePerGas;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = gasFeeSubResponse.maxPriorityFeePerGas;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = gasFeeSubResponse.l1GasPrice;
        }
        return gasFeeSubResponse.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasFeeSubResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GasFeeSubResponse(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GasFeeSubResponse)) {
            return false;
        }
        GasFeeSubResponse gasFeeSubResponse = (GasFeeSubResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) gasFeeSubResponse.chainIndex) && Intrinsics.EZpvd((Object) this.baseFee, (Object) gasFeeSubResponse.baseFee) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) gasFeeSubResponse.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) gasFeeSubResponse.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) gasFeeSubResponse.l1GasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
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
        return (((((((this.chainIndex.hashCode() * 31) + this.baseFee.hashCode()) * 31) + this.maxFeePerGas.hashCode()) * 31) + this.maxPriorityFeePerGas.hashCode()) * 31) + this.l1GasPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasFeeSubResponse(chainIndex=" + this.chainIndex + ", baseFee=" + this.baseFee + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", l1GasPrice=" + this.l1GasPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.network.ws.GasFeeSubResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasFeeSubResponse> serializer() {
            return GasFeeSubResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasFeeSubResponse(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, GasFeeSubResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.baseFee = str2;
        this.maxFeePerGas = str3;
        this.maxPriorityFeePerGas = str4;
        this.l1GasPrice = str5;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GasFeeSubResponse gasFeeSubResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gasFeeSubResponse.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gasFeeSubResponse.baseFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gasFeeSubResponse.maxFeePerGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, gasFeeSubResponse.maxPriorityFeePerGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, gasFeeSubResponse.l1GasPrice);
    }

    public GasFeeSubResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainIndex = str;
        this.baseFee = str2;
        this.maxFeePerGas = str3;
        this.maxPriorityFeePerGas = str4;
        this.l1GasPrice = str5;
    }
}
