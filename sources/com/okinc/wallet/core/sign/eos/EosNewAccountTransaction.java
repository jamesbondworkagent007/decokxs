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
public final class EosNewAccountTransaction {
    private String active_public_key;
    private String amount;
    private String chainid;
    private String contract;
    private String cpuAmount;
    private String expiration;
    private String from;
    private String memo;
    private String netAmount;
    private String owner_public_key;
    private String precision;
    private String ramAmount;
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
    public final String component12() {
        return this.owner_public_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.active_public_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.cpuAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.netAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.ramAmount;
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
    public final EosNewAccountTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        return new EosNewAccountTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EosNewAccountTransaction)) {
            return false;
        }
        EosNewAccountTransaction eosNewAccountTransaction = (EosNewAccountTransaction) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) eosNewAccountTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) eosNewAccountTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) eosNewAccountTransaction.amount) && Intrinsics.EZpvd((Object) this.memo, (Object) eosNewAccountTransaction.memo) && Intrinsics.EZpvd((Object) this.expiration, (Object) eosNewAccountTransaction.expiration) && Intrinsics.EZpvd((Object) this.ref_block_number, (Object) eosNewAccountTransaction.ref_block_number) && Intrinsics.EZpvd((Object) this.ref_block_prefix, (Object) eosNewAccountTransaction.ref_block_prefix) && Intrinsics.EZpvd((Object) this.precision, (Object) eosNewAccountTransaction.precision) && Intrinsics.EZpvd((Object) this.symbol, (Object) eosNewAccountTransaction.symbol) && Intrinsics.EZpvd((Object) this.contract, (Object) eosNewAccountTransaction.contract) && Intrinsics.EZpvd((Object) this.chainid, (Object) eosNewAccountTransaction.chainid) && Intrinsics.EZpvd((Object) this.owner_public_key, (Object) eosNewAccountTransaction.owner_public_key) && Intrinsics.EZpvd((Object) this.active_public_key, (Object) eosNewAccountTransaction.active_public_key) && Intrinsics.EZpvd((Object) this.cpuAmount, (Object) eosNewAccountTransaction.cpuAmount) && Intrinsics.EZpvd((Object) this.netAmount, (Object) eosNewAccountTransaction.netAmount) && Intrinsics.EZpvd((Object) this.ramAmount, (Object) eosNewAccountTransaction.ramAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActive_public_key() {
        return this.active_public_key;
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
    public final String getCpuAmount() {
        return this.cpuAmount;
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
    public final String getNetAmount() {
        return this.netAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOwner_public_key() {
        return this.owner_public_key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRamAmount() {
        return this.ramAmount;
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
        return (((((((((((((((((((((((((((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.memo.hashCode()) * 31) + this.expiration.hashCode()) * 31) + this.ref_block_number.hashCode()) * 31) + this.ref_block_prefix.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.contract.hashCode()) * 31) + this.chainid.hashCode()) * 31) + this.owner_public_key.hashCode()) * 31) + this.active_public_key.hashCode()) * 31) + this.cpuAmount.hashCode()) * 31) + this.netAmount.hashCode()) * 31) + this.ramAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActive_public_key(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.active_public_key = str;
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
    public final void setCpuAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cpuAmount = str;
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
    public final void setNetAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOwner_public_key(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.owner_public_key = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.precision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRamAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ramAmount = str;
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
        return "EosNewAccountTransaction(from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", memo=" + this.memo + ", expiration=" + this.expiration + ", ref_block_number=" + this.ref_block_number + ", ref_block_prefix=" + this.ref_block_prefix + ", precision=" + this.precision + ", symbol=" + this.symbol + ", contract=" + this.contract + ", chainid=" + this.chainid + ", owner_public_key=" + this.owner_public_key + ", active_public_key=" + this.active_public_key + ", cpuAmount=" + this.cpuAmount + ", netAmount=" + this.netAmount + ", ramAmount=" + this.ramAmount + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.eos.EosNewAccountTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosNewAccountTransaction> serializer() {
            return EosNewAccountTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosNewAccountTransaction(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i & 65535)) {
            PluginExceptionsKt.throwMissingFieldException(i, 65535, EosNewAccountTransaction$$serializer.INSTANCE.getDescriptor());
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
        this.owner_public_key = str12;
        this.active_public_key = str13;
        this.cpuAmount = str14;
        this.netAmount = str15;
        this.ramAmount = str16;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(EosNewAccountTransaction eosNewAccountTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, eosNewAccountTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, eosNewAccountTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, eosNewAccountTransaction.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, eosNewAccountTransaction.memo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, eosNewAccountTransaction.expiration);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, eosNewAccountTransaction.ref_block_number);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, eosNewAccountTransaction.ref_block_prefix);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, eosNewAccountTransaction.precision);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, eosNewAccountTransaction.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, eosNewAccountTransaction.contract);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, eosNewAccountTransaction.chainid);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, eosNewAccountTransaction.owner_public_key);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, eosNewAccountTransaction.active_public_key);
        compositeEncoder.encodeStringElement(serialDescriptor, 13, eosNewAccountTransaction.cpuAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 14, eosNewAccountTransaction.netAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 15, eosNewAccountTransaction.ramAmount);
    }

    public EosNewAccountTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
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
        this.owner_public_key = str12;
        this.active_public_key = str13;
        this.cpuAmount = str14;
        this.netAmount = str15;
        this.ramAmount = str16;
    }
}
