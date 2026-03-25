package com.okinc.wallet.core.sign.zksync;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ZKSyncChangePubKeyTransaction {
    public static final int $stable = 8;
    private String accountId;
    private String fee;
    private ZKSyncToken feeToken;
    private String from;
    private String nonce;
    private String type;
    private String validFrom;
    private String validUntil;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
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
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncToken component5() {
        return this.feeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.validFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.validUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncChangePubKeyTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ZKSyncToken zKSyncToken, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new ZKSyncChangePubKeyTransaction(str, str2, str3, str4, zKSyncToken, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSyncChangePubKeyTransaction)) {
            return false;
        }
        ZKSyncChangePubKeyTransaction zKSyncChangePubKeyTransaction = (ZKSyncChangePubKeyTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) zKSyncChangePubKeyTransaction.type) && Intrinsics.EZpvd((Object) this.accountId, (Object) zKSyncChangePubKeyTransaction.accountId) && Intrinsics.EZpvd((Object) this.from, (Object) zKSyncChangePubKeyTransaction.from) && Intrinsics.EZpvd((Object) this.fee, (Object) zKSyncChangePubKeyTransaction.fee) && Intrinsics.EZpvd(this.feeToken, zKSyncChangePubKeyTransaction.feeToken) && Intrinsics.EZpvd((Object) this.nonce, (Object) zKSyncChangePubKeyTransaction.nonce) && Intrinsics.EZpvd((Object) this.validFrom, (Object) zKSyncChangePubKeyTransaction.validFrom) && Intrinsics.EZpvd((Object) this.validUntil, (Object) zKSyncChangePubKeyTransaction.validUntil);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSyncToken getFeeToken() {
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
        return (((((((((((((this.type.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.feeToken.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.validFrom.hashCode()) * 31) + this.validUntil.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeToken(@NotNull ZKSyncToken zKSyncToken) {
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        this.feeToken = zKSyncToken;
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
        return "ZKSyncChangePubKeyTransaction(type=" + this.type + ", accountId=" + this.accountId + ", from=" + this.from + ", fee=" + this.fee + ", feeToken=" + this.feeToken + ", nonce=" + this.nonce + ", validFrom=" + this.validFrom + ", validUntil=" + this.validUntil + ")";
    }

    public ZKSyncChangePubKeyTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull ZKSyncToken zKSyncToken, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(zKSyncToken, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.fee = str4;
        this.feeToken = zKSyncToken;
        this.nonce = str5;
        this.validFrom = str6;
        this.validUntil = str7;
    }
}
