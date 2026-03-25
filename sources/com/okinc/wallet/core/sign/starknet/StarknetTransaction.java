package com.okinc.wallet.core.sign.starknet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class StarknetTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String amount;
    private final String contractAddress;
    private final String from;
    private final String l1DataGasConsumed;
    private final String l1DataGasPrice;
    private final String l1GasConsumed;
    private final String l1GasPrice;
    private final String l2GasConsumed;
    private final String l2GasPrice;
    private final String nonce;
    private final String to;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.l2GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.l2GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.l1GasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.l1DataGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.l1DataGasConsumed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StarknetTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new StarknetTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarknetTransaction)) {
            return false;
        }
        StarknetTransaction starknetTransaction = (StarknetTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) starknetTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) starknetTransaction.to) && Intrinsics.EZpvd((Object) this.nonce, (Object) starknetTransaction.nonce) && Intrinsics.EZpvd((Object) this.amount, (Object) starknetTransaction.amount) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) starknetTransaction.contractAddress) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) starknetTransaction.l1GasPrice) && Intrinsics.EZpvd((Object) this.l1GasConsumed, (Object) starknetTransaction.l1GasConsumed) && Intrinsics.EZpvd((Object) this.l1DataGasPrice, (Object) starknetTransaction.l1DataGasPrice) && Intrinsics.EZpvd((Object) this.l1DataGasConsumed, (Object) starknetTransaction.l1DataGasConsumed) && Intrinsics.EZpvd((Object) this.l2GasPrice, (Object) starknetTransaction.l2GasPrice) && Intrinsics.EZpvd((Object) this.l2GasConsumed, (Object) starknetTransaction.l2GasConsumed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
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
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + this.l1GasPrice.hashCode()) * 31) + this.l1GasConsumed.hashCode()) * 31) + this.l1DataGasPrice.hashCode()) * 31) + this.l1DataGasConsumed.hashCode()) * 31) + this.l2GasPrice.hashCode()) * 31) + this.l2GasConsumed.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StarknetTransaction(from=" + this.from + ", to=" + this.to + ", nonce=" + this.nonce + ", amount=" + this.amount + ", contractAddress=" + this.contractAddress + ", l1GasPrice=" + this.l1GasPrice + ", l1GasConsumed=" + this.l1GasConsumed + ", l1DataGasPrice=" + this.l1DataGasPrice + ", l1DataGasConsumed=" + this.l1DataGasConsumed + ", l2GasPrice=" + this.l2GasPrice + ", l2GasConsumed=" + this.l2GasConsumed + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.starknet.StarknetTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<StarknetTransaction> serializer() {
            return StarknetTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StarknetTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, StarknetTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.nonce = str3;
        this.amount = str4;
        this.contractAddress = str5;
        this.l1GasPrice = str6;
        this.l1GasConsumed = str7;
        this.l1DataGasPrice = str8;
        this.l1DataGasConsumed = str9;
        this.l2GasPrice = str10;
        this.l2GasConsumed = str11;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(StarknetTransaction starknetTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, starknetTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, starknetTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, starknetTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, starknetTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, starknetTransaction.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, starknetTransaction.l1GasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, starknetTransaction.l1GasConsumed);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, starknetTransaction.l1DataGasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, starknetTransaction.l1DataGasConsumed);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, starknetTransaction.l2GasPrice);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, starknetTransaction.l2GasConsumed);
    }

    public StarknetTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.from = str;
        this.to = str2;
        this.nonce = str3;
        this.amount = str4;
        this.contractAddress = str5;
        this.l1GasPrice = str6;
        this.l1GasConsumed = str7;
        this.l1DataGasPrice = str8;
        this.l1DataGasConsumed = str9;
        this.l2GasPrice = str10;
        this.l2GasConsumed = str11;
    }
}
