package com.okinc.wallet.core.sign.eos;

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
public final class EosTransaction {
    private String amount;
    private String chainid;
    private String contract;
    private String expiration;
    private String from;
    private String memo;
    private String precision;
    private String ref_block_number;
    private String ref_block_prefix;
    private String symbol;
    private String to;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.chainid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ref_block_prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        return new EosTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EosTransaction)) {
            return false;
        }
        EosTransaction eosTransaction = (EosTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) eosTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) eosTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) eosTransaction.amount) && Intrinsics.EZpvd((Object) this.memo, (Object) eosTransaction.memo) && Intrinsics.EZpvd((Object) this.expiration, (Object) eosTransaction.expiration) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) eosTransaction.ref_block_number) && Intrinsics.EZpvd((Object) this.ref_block_prefix, (Object) eosTransaction.ref_block_prefix) && Intrinsics.EZpvd((Object) this.precision, (Object) eosTransaction.precision) && Intrinsics.EZpvd((Object) this.symbol, (Object) eosTransaction.symbol) && Intrinsics.EZpvd((Object) this.contract, (Object) eosTransaction.contract) && Intrinsics.EZpvd((Object) this.chainid, (Object) eosTransaction.chainid);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainid() {
        return this.chainid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContract() {
        return this.contract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_number() {
        return this.ref_block_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRef_block_prefix() {
        return this.ref_block_prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.memo.hashCode()) * 31) + this.expiration.hashCode()) * 31) + this.ref_block_number.hashCode()) * 31) + this.ref_block_prefix.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.contract.hashCode()) * 31) + this.chainid.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContract(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contract = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiration(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expiration = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.precision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_number(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ref_block_number = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRef_block_prefix(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ref_block_prefix = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosTransaction(from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", memo=" + this.memo + ", expiration=" + this.expiration + ", ref_block_number=" + this.ref_block_number + ", ref_block_prefix=" + this.ref_block_prefix + ", precision=" + this.precision + ", symbol=" + this.symbol + ", contract=" + this.contract + ", chainid=" + this.chainid + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.eos.EosTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosTransaction> serializer() {
            return EosTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, EosTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.from = str;
        this.to = str2;
        this.amount = str3;
        this.memo = str4;
        this.expiration = str5;
        this.ref_block_number = str6;
        this.ref_block_prefix = str7;
        this.precision = str8;
        this.symbol = str9;
        this.contract = str10;
        this.chainid = str11;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(EosTransaction eosTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eosTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eosTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eosTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eosTransaction.memo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eosTransaction.expiration);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, eosTransaction.ref_block_number);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eosTransaction.ref_block_prefix);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, eosTransaction.precision);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, eosTransaction.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, eosTransaction.contract);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, eosTransaction.chainid);
    }

    public EosTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        this.amount = str3;
        this.memo = str4;
        this.expiration = str5;
        this.ref_block_number = str6;
        this.ref_block_prefix = str7;
        this.precision = str8;
        this.symbol = str9;
        this.contract = str10;
        this.chainid = str11;
    }
}
