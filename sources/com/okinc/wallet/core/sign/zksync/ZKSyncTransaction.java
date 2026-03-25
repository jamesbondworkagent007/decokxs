package com.okinc.wallet.core.sign.zksync;

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
public final class ZKSyncTransaction {
    private String accountId;
    private String amount;
    private String fee;
    private String from;
    private String nonce;
    private String to;
    private ZKSyncToken token;
    private String type;
    private String validFrom;
    private String validUntil;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.validUntil;
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
    public final ZKSyncToken component6() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.validFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ZKSyncToken zKSyncToken, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new ZKSyncTransaction(str, str2, str3, str4, str5, zKSyncToken, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSyncTransaction)) {
            return false;
        }
        ZKSyncTransaction zKSyncTransaction = (ZKSyncTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) zKSyncTransaction.type) && Intrinsics.EZpvd((Object) this.accountId, (Object) zKSyncTransaction.accountId) && Intrinsics.EZpvd((Object) this.from, (Object) zKSyncTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) zKSyncTransaction.to) && Intrinsics.EZpvd((Object) this.amount, (Object) zKSyncTransaction.amount) && Intrinsics.EZpvd(this.token, zKSyncTransaction.token) && Intrinsics.EZpvd((Object) this.fee, (Object) zKSyncTransaction.fee) && Intrinsics.EZpvd((Object) this.nonce, (Object) zKSyncTransaction.nonce) && Intrinsics.EZpvd((Object) this.validFrom, (Object) zKSyncTransaction.validFrom) && Intrinsics.EZpvd((Object) this.validUntil, (Object) zKSyncTransaction.validUntil);
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
    public final String getFee() {
        return this.fee;
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
    public final ZKSyncToken getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidFrom() {
        return this.validFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValidUntil() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.type.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.token.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUntil.hashCode();
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
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
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
    public final void setToken(@NotNull ZKSyncToken zKSyncToken) {
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        this.token = zKSyncToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.validFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValidUntil(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.validUntil = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSyncTransaction(type=" + this.type + ", accountId=" + this.accountId + ", from=" + this.from + ", to=" + this.to + ", amount=" + this.amount + ", token=" + this.token + ", fee=" + this.fee + ", nonce=" + this.nonce + ", validFrom=" + this.validFrom + ", validUntil=" + this.validUntil + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.zksync.ZKSyncTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ZKSyncTransaction> serializer() {
            return ZKSyncTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ZKSyncTransaction(int i, String str, String str2, String str3, String str4, String str5, ZKSyncToken zKSyncToken, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, ZKSyncTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.token = zKSyncToken;
        this.fee = str6;
        this.nonce = str7;
        this.validFrom = str8;
        this.validUntil = str9;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ZKSyncTransaction zKSyncTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, zKSyncTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, zKSyncTransaction.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, zKSyncTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, zKSyncTransaction.to);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, zKSyncTransaction.amount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, ZKSyncToken$$serializer.INSTANCE, zKSyncTransaction.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, zKSyncTransaction.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, zKSyncTransaction.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, zKSyncTransaction.validFrom);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, zKSyncTransaction.validUntil);
    }

    public ZKSyncTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull ZKSyncToken zKSyncToken, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.to = str4;
        this.amount = str5;
        this.token = zKSyncToken;
        this.fee = str6;
        this.nonce = str7;
        this.validFrom = str8;
        this.validUntil = str9;
    }
}
