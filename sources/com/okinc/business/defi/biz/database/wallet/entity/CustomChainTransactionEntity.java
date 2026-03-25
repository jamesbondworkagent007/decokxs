package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainTransactionEntity {
    public static final int $stable = 8;
    private long chainId;
    private String coinAmount;
    private long coinId;
    private long confirmAt;
    private long createAt;
    private String failReason;
    private String fromAddress;
    private String gasLimit;
    private String gasPrice;
    private String inputData;
    private long nonce;
    private String originTxHash;
    private String rawTx;
    private int repeatTxType;
    private String subTxHashes;
    private String toAddress;
    private String txHash;
    private String txId;
    private int txStatus;
    private int txType;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainTransactionEntity() {
        this(null, 0L, null, null, null, null, 0L, 0, 0, 0, null, null, 0L, null, null, null, null, null, null, 0L, 0L, 2097151, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomChainTransactionEntity copy$default(CustomChainTransactionEntity customChainTransactionEntity, String str, long j, String str2, String str3, String str4, String str5, long j2, int i, int i2, int i3, String str6, String str7, long j3, String str8, String str9, String str10, String str11, String str12, String str13, long j4, long j5, int i4, Object obj) {
        String str14 = (i4 & 1) != 0 ? customChainTransactionEntity.walletId : str;
        long j6 = (i4 & 2) != 0 ? customChainTransactionEntity.coinId : j;
        String str15 = (i4 & 4) != 0 ? customChainTransactionEntity.txHash : str2;
        String str16 = (i4 & 8) != 0 ? customChainTransactionEntity.txId : str3;
        String str17 = (i4 & 16) != 0 ? customChainTransactionEntity.originTxHash : str4;
        String str18 = (i4 & 32) != 0 ? customChainTransactionEntity.subTxHashes : str5;
        long j7 = (i4 & 64) != 0 ? customChainTransactionEntity.chainId : j2;
        int i5 = (i4 & 128) != 0 ? customChainTransactionEntity.txType : i;
        int i6 = (i4 & 256) != 0 ? customChainTransactionEntity.repeatTxType : i2;
        int i7 = (i4 & 512) != 0 ? customChainTransactionEntity.txStatus : i3;
        String str19 = (i4 & 1024) != 0 ? customChainTransactionEntity.fromAddress : str6;
        return customChainTransactionEntity.copy(str14, j6, str15, str16, str17, str18, j7, i5, i6, i7, str19, (i4 & 2048) != 0 ? customChainTransactionEntity.toAddress : str7, (i4 & 4096) != 0 ? customChainTransactionEntity.nonce : j3, (i4 & 8192) != 0 ? customChainTransactionEntity.gasPrice : str8, (i4 & 16384) != 0 ? customChainTransactionEntity.gasLimit : str9, (i4 & 32768) != 0 ? customChainTransactionEntity.coinAmount : str10, (i4 & 65536) != 0 ? customChainTransactionEntity.inputData : str11, (i4 & 131072) != 0 ? customChainTransactionEntity.rawTx : str12, (i4 & 262144) != 0 ? customChainTransactionEntity.failReason : str13, (i4 & 524288) != 0 ? customChainTransactionEntity.createAt : j4, (i4 & 1048576) != 0 ? customChainTransactionEntity.confirmAt : j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.rawTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component20() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component21() {
        return this.confirmAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.originTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subTxHashes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainTransactionEntity copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j2, int i, int i2, int i3, @NotNull String str6, @NotNull String str7, long j3, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, long j4, long j5) {
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
        return new CustomChainTransactionEntity(str, j, str2, str3, str4, str5, j2, i, i2, i3, str6, str7, j3, str8, str9, str10, str11, str12, str13, j4, j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainTransactionEntity)) {
            return false;
        }
        CustomChainTransactionEntity customChainTransactionEntity = (CustomChainTransactionEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) customChainTransactionEntity.walletId) && this.coinId == customChainTransactionEntity.coinId && Intrinsics.EZpvd((Object) this.txHash, (Object) customChainTransactionEntity.txHash) && Intrinsics.EZpvd((Object) this.txId, (Object) customChainTransactionEntity.txId) && Intrinsics.EZpvd((Object) this.originTxHash, (Object) customChainTransactionEntity.originTxHash) && Intrinsics.EZpvd((Object) this.subTxHashes, (Object) customChainTransactionEntity.subTxHashes) && this.chainId == customChainTransactionEntity.chainId && this.txType == customChainTransactionEntity.txType && this.repeatTxType == customChainTransactionEntity.repeatTxType && this.txStatus == customChainTransactionEntity.txStatus && Intrinsics.EZpvd((Object) this.fromAddress, (Object) customChainTransactionEntity.fromAddress) && Intrinsics.EZpvd((Object) this.toAddress, (Object) customChainTransactionEntity.toAddress) && this.nonce == customChainTransactionEntity.nonce && Intrinsics.EZpvd((Object) this.gasPrice, (Object) customChainTransactionEntity.gasPrice) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) customChainTransactionEntity.gasLimit) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) customChainTransactionEntity.coinAmount) && Intrinsics.EZpvd((Object) this.inputData, (Object) customChainTransactionEntity.inputData) && Intrinsics.EZpvd((Object) this.rawTx, (Object) customChainTransactionEntity.rawTx) && Intrinsics.EZpvd((Object) this.failReason, (Object) customChainTransactionEntity.failReason) && this.createAt == customChainTransactionEntity.createAt && this.confirmAt == customChainTransactionEntity.confirmAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getConfirmAt() {
        return this.confirmAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFailReason() {
        return this.failReason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginTxHash() {
        return this.originTxHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTx() {
        return this.rawTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRepeatTxType() {
        return this.repeatTxType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubTxHashes() {
        return this.subTxHashes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxStatus() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.txHash.hashCode()) * 31) + this.txId.hashCode()) * 31) + this.originTxHash.hashCode()) * 31) + this.subTxHashes.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + Integer.hashCode(this.txType)) * 31) + Integer.hashCode(this.repeatTxType)) * 31) + Integer.hashCode(this.txStatus)) * 31) + this.fromAddress.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + Long.hashCode(this.nonce)) * 31) + this.gasPrice.hashCode()) * 31) + this.gasLimit.hashCode()) * 31) + this.coinAmount.hashCode()) * 31) + this.inputData.hashCode()) * 31) + this.rawTx.hashCode()) * 31) + this.failReason.hashCode()) * 31) + Long.hashCode(this.createAt)) * 31) + Long.hashCode(this.confirmAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirmAt(long j) {
        this.confirmAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFailReason(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.failReason = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(long j) {
        this.nonce = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originTxHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRawTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rawTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRepeatTxType(int i) {
        this.repeatTxType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubTxHashes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subTxHashes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxStatus(int i) {
        this.txStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(int i) {
        this.txType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainTransactionEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", txHash=" + this.txHash + ", txId=" + this.txId + ", originTxHash=" + this.originTxHash + ", subTxHashes=" + this.subTxHashes + ", chainId=" + this.chainId + ", txType=" + this.txType + ", repeatTxType=" + this.repeatTxType + ", txStatus=" + this.txStatus + ", fromAddress=" + this.fromAddress + ", toAddress=" + this.toAddress + ", nonce=" + this.nonce + ", gasPrice=" + this.gasPrice + ", gasLimit=" + this.gasLimit + ", coinAmount=" + this.coinAmount + ", inputData=" + this.inputData + ", rawTx=" + this.rawTx + ", failReason=" + this.failReason + ", createAt=" + this.createAt + ", confirmAt=" + this.confirmAt + ")";
    }

    public CustomChainTransactionEntity(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, long j2, int i, int i2, int i3, @NotNull String str6, @NotNull String str7, long j3, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, long j4, long j5) {
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
        this.walletId = str;
        this.coinId = j;
        this.txHash = str2;
        this.txId = str3;
        this.originTxHash = str4;
        this.subTxHashes = str5;
        this.chainId = j2;
        this.txType = i;
        this.repeatTxType = i2;
        this.txStatus = i3;
        this.fromAddress = str6;
        this.toAddress = str7;
        this.nonce = j3;
        this.gasPrice = str8;
        this.gasLimit = str9;
        this.coinAmount = str10;
        this.inputData = str11;
        this.rawTx = str12;
        this.failReason = str13;
        this.createAt = j4;
        this.confirmAt = j5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r55v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r55v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r55v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r55v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r55v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r55v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0035: ARITH (r55v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r36v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003e: ARITH (r55v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r55v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004f: ARITH (r55v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r40v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r55v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r55v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0068: ARITH (r55v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r43v0 long))
  (wrap:java.lang.String:0x007a: TERNARY null = ((wrap:int:0x0071: ARITH (r55v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r55v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r55v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r55v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r55v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r55v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r55v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r51v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r55v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r53v0 long))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void (m)] (LINE:32) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainTransactionEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, int, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void type: THIS */
    public /* synthetic */ CustomChainTransactionEntity(String str, long j, String str2, String str3, String str4, String str5, long j2, int i, int i2, int i3, String str6, String str7, long j3, String str8, String str9, String str10, String str11, String str12, String str13, long j4, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? 0L : j2, (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) == 0 ? i3 : 0, (i4 & 1024) != 0 ? "" : str6, (i4 & 2048) != 0 ? "" : str7, (i4 & 4096) != 0 ? 0L : j3, (i4 & 8192) != 0 ? "" : str8, (i4 & 16384) != 0 ? "" : str9, (i4 & 32768) != 0 ? "" : str10, (i4 & 65536) != 0 ? "" : str11, (i4 & 131072) != 0 ? "" : str12, (i4 & 262144) != 0 ? "" : str13, (i4 & 524288) != 0 ? 0L : j4, (i4 & 1048576) != 0 ? 0L : j5);
    }
}
