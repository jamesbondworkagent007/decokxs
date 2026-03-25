package com.okinc.wallet.core.sign.near;

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
public final class NearTokenTransaction {
    private String blockHash;
    private String contractAddress;
    private String depositGas;
    private String depositValue;
    private String from;
    private String minTransferTokenValue;
    private String nonce;
    private boolean shouldDeposit;
    private String to;
    private String transferGas;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.depositValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.minTransferTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.transferGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.shouldDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.depositGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NearTokenTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new NearTokenTransaction(str, str2, str3, str4, str5, str6, str7, z, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearTokenTransaction)) {
            return false;
        }
        NearTokenTransaction nearTokenTransaction = (NearTokenTransaction) obj;
        return Intrinsics.EZpvd((Object) this.blockHash, (Object) nearTokenTransaction.blockHash) && Intrinsics.EZpvd((Object) this.nonce, (Object) nearTokenTransaction.nonce) && Intrinsics.EZpvd((Object) this.value, (Object) nearTokenTransaction.value) && Intrinsics.EZpvd((Object) this.from, (Object) nearTokenTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) nearTokenTransaction.to) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) nearTokenTransaction.contractAddress) && Intrinsics.EZpvd((Object) this.transferGas, (Object) nearTokenTransaction.transferGas) && this.shouldDeposit == nearTokenTransaction.shouldDeposit && Intrinsics.EZpvd((Object) this.depositGas, (Object) nearTokenTransaction.depositGas) && Intrinsics.EZpvd((Object) this.depositValue, (Object) nearTokenTransaction.depositValue) && Intrinsics.EZpvd((Object) this.minTransferTokenValue, (Object) nearTokenTransaction.minTransferTokenValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockHash() {
        return this.blockHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositGas() {
        return this.depositGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositValue() {
        return this.depositValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinTransferTokenValue() {
        return this.minTransferTokenValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldDeposit() {
        return this.shouldDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferGas() {
        return this.transferGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.blockHash.hashCode() * 31) + this.nonce.hashCode()) * 31) + this.value.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + this.transferGas.hashCode()) * 31) + Boolean.hashCode(this.shouldDeposit)) * 31) + this.depositGas.hashCode()) * 31) + this.depositValue.hashCode()) * 31) + this.minTransferTokenValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinTransferTokenValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minTransferTokenValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldDeposit(boolean z) {
        this.shouldDeposit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferGas(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.transferGas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NearTokenTransaction(blockHash=" + this.blockHash + ", nonce=" + this.nonce + ", value=" + this.value + ", from=" + this.from + ", to=" + this.to + ", contractAddress=" + this.contractAddress + ", transferGas=" + this.transferGas + ", shouldDeposit=" + this.shouldDeposit + ", depositGas=" + this.depositGas + ", depositValue=" + this.depositValue + ", minTransferTokenValue=" + this.minTransferTokenValue + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.near.NearTokenTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NearTokenTransaction> serializer() {
            return NearTokenTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NearTokenTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, NearTokenTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.blockHash = str;
        this.nonce = str2;
        this.value = str3;
        this.from = str4;
        this.to = str5;
        this.contractAddress = str6;
        this.transferGas = str7;
        this.shouldDeposit = z;
        this.depositGas = str8;
        this.depositValue = str9;
        this.minTransferTokenValue = str10;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(NearTokenTransaction nearTokenTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, nearTokenTransaction.blockHash);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, nearTokenTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, nearTokenTransaction.value);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, nearTokenTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, nearTokenTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, nearTokenTransaction.contractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, nearTokenTransaction.transferGas);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 7, nearTokenTransaction.shouldDeposit);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, nearTokenTransaction.depositGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, nearTokenTransaction.depositValue);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, nearTokenTransaction.minTransferTokenValue);
    }

    public NearTokenTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, boolean z, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.blockHash = str;
        this.nonce = str2;
        this.value = str3;
        this.from = str4;
        this.to = str5;
        this.contractAddress = str6;
        this.transferGas = str7;
        this.shouldDeposit = z;
        this.depositGas = str8;
        this.depositValue = str9;
        this.minTransferTokenValue = str10;
    }
}
