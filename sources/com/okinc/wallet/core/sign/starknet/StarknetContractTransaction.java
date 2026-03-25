package com.okinc.wallet.core.sign.starknet;

import androidx.core.app.FrameMetricsAggregator;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StarknetContractTransaction {
    private final List<StarknetCall> calls;
    private final String from;
    private final String l1DataGasConsumed;
    private final String l1DataGasPrice;
    private final String l1GasConsumed;
    private final String l1GasPrice;
    private final String l2GasConsumed;
    private final String l2GasPrice;
    private final String nonce;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, new ArrayListSerializer(StarknetCall$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.l1GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.l1DataGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.l1DataGasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.l2GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.l2GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StarknetCall> component9() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarknetContractTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<StarknetCall> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new StarknetContractTransaction(str, str2, str3, str4, str5, str6, str7, str8, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarknetContractTransaction)) {
            return false;
        }
        StarknetContractTransaction starknetContractTransaction = (StarknetContractTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) starknetContractTransaction.from) && Intrinsics.EZpvd((Object) this.nonce, (Object) starknetContractTransaction.nonce) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) starknetContractTransaction.l1GasPrice) && Intrinsics.EZpvd((Object) this.l1GasConsumed, (Object) starknetContractTransaction.l1GasConsumed) && Intrinsics.EZpvd((Object) this.l1DataGasPrice, (Object) starknetContractTransaction.l1DataGasPrice) && Intrinsics.EZpvd((Object) this.l1DataGasConsumed, (Object) starknetContractTransaction.l1DataGasConsumed) && Intrinsics.EZpvd((Object) this.l2GasPrice, (Object) starknetContractTransaction.l2GasPrice) && Intrinsics.EZpvd((Object) this.l2GasConsumed, (Object) starknetContractTransaction.l2GasConsumed) && Intrinsics.EZpvd(this.calls, starknetContractTransaction.calls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StarknetCall> getCalls() {
        return this.calls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1DataGasConsumed() {
        return this.l1DataGasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1DataGasPrice() {
        return this.l1DataGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasConsumed() {
        return this.l1GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasPrice() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL2GasConsumed() {
        return this.l2GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL2GasPrice() {
        return this.l2GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.from.hashCode() * 31) + this.nonce.hashCode()) * 31) + this.l1GasPrice.hashCode()) * 31) + this.l1GasConsumed.hashCode()) * 31) + this.l1DataGasPrice.hashCode()) * 31) + this.l1DataGasConsumed.hashCode()) * 31) + this.l2GasPrice.hashCode()) * 31) + this.l2GasConsumed.hashCode()) * 31) + this.calls.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarknetContractTransaction(from=" + this.from + ", nonce=" + this.nonce + ", l1GasPrice=" + this.l1GasPrice + ", l1GasConsumed=" + this.l1GasConsumed + ", l1DataGasPrice=" + this.l1DataGasPrice + ", l1DataGasConsumed=" + this.l1DataGasConsumed + ", l2GasPrice=" + this.l2GasPrice + ", l2GasConsumed=" + this.l2GasConsumed + ", calls=" + this.calls + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.starknet.StarknetContractTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarknetContractTransaction> serializer() {
            return StarknetContractTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarknetContractTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, StarknetContractTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.nonce = str2;
        this.l1GasPrice = str3;
        this.l1GasConsumed = str4;
        this.l1DataGasPrice = str5;
        this.l1DataGasConsumed = str6;
        this.l2GasPrice = str7;
        this.l2GasConsumed = str8;
        this.calls = list;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(StarknetContractTransaction starknetContractTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, starknetContractTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, starknetContractTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, starknetContractTransaction.l1GasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, starknetContractTransaction.l1GasConsumed);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, starknetContractTransaction.l1DataGasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, starknetContractTransaction.l1DataGasConsumed);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, starknetContractTransaction.l2GasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, starknetContractTransaction.l2GasConsumed);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], starknetContractTransaction.calls);
    }

    public StarknetContractTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<StarknetCall> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.from = str;
        this.nonce = str2;
        this.l1GasPrice = str3;
        this.l1GasConsumed = str4;
        this.l1DataGasPrice = str5;
        this.l1DataGasConsumed = str6;
        this.l2GasPrice = str7;
        this.l2GasConsumed = str8;
        this.calls = list;
    }
}
