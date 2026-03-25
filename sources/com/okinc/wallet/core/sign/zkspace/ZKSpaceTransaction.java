package com.okinc.wallet.core.sign.zkspace;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ZKSpaceTransaction {
    private String accountId;
    private String amount;
    private String chainId;
    private String fee;
    private ZKSpaceToken feeToken;
    private String from;
    private String nonce;
    private String to;
    private ZKSpaceToken token;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSpaceToken component6() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSpaceToken component8() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSpaceTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ZKSpaceToken zKSpaceToken, @NotNull String str6, @NotNull ZKSpaceToken zKSpaceToken2, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(zKSpaceToken, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(zKSpaceToken2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new ZKSpaceTransaction(str, str2, str3, str4, str5, zKSpaceToken, str6, zKSpaceToken2, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSpaceTransaction)) {
            return false;
        }
        ZKSpaceTransaction zKSpaceTransaction = (ZKSpaceTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) zKSpaceTransaction.type) && Intrinsics.EZpvd((Object) this.accountId, (Object) zKSpaceTransaction.accountId) && Intrinsics.EZpvd((Object) this.from, (Object) zKSpaceTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) zKSpaceTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) zKSpaceTransaction.amount) && Intrinsics.EZpvd(this.token, zKSpaceTransaction.token) && Intrinsics.EZpvd((Object) this.fee, (Object) zKSpaceTransaction.fee) && Intrinsics.EZpvd(this.feeToken, zKSpaceTransaction.feeToken) && Intrinsics.EZpvd((Object) this.chainId, (Object) zKSpaceTransaction.chainId) && Intrinsics.EZpvd((Object) this.nonce, (Object) zKSpaceTransaction.nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSpaceToken getFeeToken() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
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
    public final ZKSpaceToken getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.type.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.token.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.feeToken.hashCode()) * 31) + this.chainId.hashCode()) * 31) + this.nonce.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeToken(@NotNull ZKSpaceToken zKSpaceToken) {
        Intrinsics.checkNotNullParameter(zKSpaceToken, "");
        this.feeToken = zKSpaceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull ZKSpaceToken zKSpaceToken) {
        Intrinsics.checkNotNullParameter(zKSpaceToken, "");
        this.token = zKSpaceToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSpaceTransaction(type=" + this.type + ", accountId=" + this.accountId + ", from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", token=" + this.token + ", fee=" + this.fee + ", feeToken=" + this.feeToken + ", chainId=" + this.chainId + ", nonce=" + this.nonce + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.zkspace.ZKSpaceTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ZKSpaceTransaction> serializer() {
            return ZKSpaceTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ZKSpaceTransaction(int i, String str, String str2, String str3, String str4, String str5, ZKSpaceToken zKSpaceToken, String str6, ZKSpaceToken zKSpaceToken2, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, ZKSpaceTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.token = zKSpaceToken;
        this.fee = str6;
        this.feeToken = zKSpaceToken2;
        this.chainId = str7;
        this.nonce = str8;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ZKSpaceTransaction zKSpaceTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, zKSpaceTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, zKSpaceTransaction.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, zKSpaceTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, zKSpaceTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, zKSpaceTransaction.amount);
        ZKSpaceToken$$serializer zKSpaceToken$$serializer = ZKSpaceToken$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, zKSpaceToken$$serializer, zKSpaceTransaction.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, zKSpaceTransaction.fee);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, zKSpaceToken$$serializer, zKSpaceTransaction.feeToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, zKSpaceTransaction.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, zKSpaceTransaction.nonce);
    }

    public ZKSpaceTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ZKSpaceToken zKSpaceToken, @NotNull String str6, @NotNull ZKSpaceToken zKSpaceToken2, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(zKSpaceToken, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(zKSpaceToken2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.token = zKSpaceToken;
        this.fee = str6;
        this.feeToken = zKSpaceToken2;
        this.chainId = str7;
        this.nonce = str8;
    }
}
