package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCoinAssetEntity {
    public static final int $stable = 8;
    private String address;
    private String amount;
    private String amountInt;
    private String ccyAmount;
    private long coinId;
    private String dailyChange;
    private String holdAvgPrice;
    private int orderValue;
    private String platformName;
    private String spotBalance;
    private String unPnl;
    private String unPnlYield;
    private int voucherToken;
    private String walletId;
    private String walletInvestmentType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCoinAssetEntity() {
        this(null, 0L, null, null, null, null, 0, null, 0, null, null, null, null, null, null, 32767, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.walletInvestmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.amountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ccyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.dailyChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCoinAssetEntity copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        return new WalletCoinAssetEntity(str, j, str2, str3, str4, str5, i, str6, i2, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletCoinAssetEntity)) {
            return false;
        }
        WalletCoinAssetEntity walletCoinAssetEntity = (WalletCoinAssetEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletCoinAssetEntity.walletId) && this.coinId == walletCoinAssetEntity.coinId && Intrinsics.EZpvd((Object) this.amount, (Object) walletCoinAssetEntity.amount) && Intrinsics.EZpvd((Object) this.amountInt, (Object) walletCoinAssetEntity.amountInt) && Intrinsics.EZpvd((Object) this.ccyAmount, (Object) walletCoinAssetEntity.ccyAmount) && Intrinsics.EZpvd((Object) this.dailyChange, (Object) walletCoinAssetEntity.dailyChange) && this.orderValue == walletCoinAssetEntity.orderValue && Intrinsics.EZpvd((Object) this.address, (Object) walletCoinAssetEntity.address) && this.voucherToken == walletCoinAssetEntity.voucherToken && Intrinsics.EZpvd((Object) this.unPnl, (Object) walletCoinAssetEntity.unPnl) && Intrinsics.EZpvd((Object) this.unPnlYield, (Object) walletCoinAssetEntity.unPnlYield) && Intrinsics.EZpvd((Object) this.platformName, (Object) walletCoinAssetEntity.platformName) && Intrinsics.EZpvd((Object) this.walletInvestmentType, (Object) walletCoinAssetEntity.walletInvestmentType) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) walletCoinAssetEntity.spotBalance) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) walletCoinAssetEntity.holdAvgPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmountInt() {
        return this.amountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcyAmount() {
        return this.ccyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDailyChange() {
        return this.dailyChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldAvgPrice() {
        return this.holdAvgPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformName() {
        return this.platformName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBalance() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnPnl() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnPnlYield() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVoucherToken() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletInvestmentType() {
        return this.walletInvestmentType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.amount.hashCode()) * 31) + this.amountInt.hashCode()) * 31) + this.ccyAmount.hashCode()) * 31) + this.dailyChange.hashCode()) * 31) + Integer.hashCode(this.orderValue)) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.voucherToken)) * 31) + this.unPnl.hashCode()) * 31) + this.unPnlYield.hashCode()) * 31) + this.platformName.hashCode()) * 31) + this.walletInvestmentType.hashCode()) * 31) + this.spotBalance.hashCode()) * 31) + this.holdAvgPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amountInt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCcyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ccyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDailyChange(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dailyChange = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoldAvgPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.holdAvgPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(int i) {
        this.orderValue = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlatformName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.platformName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpotBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.spotBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnPnl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnPnlYield(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unPnlYield = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVoucherToken(int i) {
        this.voucherToken = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletInvestmentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletInvestmentType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setZeroValues() {
        this.amount = "0";
        this.amountInt = "0";
        this.ccyAmount = "0";
        this.dailyChange = "0";
        this.unPnl = "";
        this.unPnlYield = "";
        this.spotBalance = "";
        this.holdAvgPrice = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCoinAssetEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", amount=" + this.amount + ", amountInt=" + this.amountInt + ", ccyAmount=" + this.ccyAmount + ", dailyChange=" + this.dailyChange + ", orderValue=" + this.orderValue + ", address=" + this.address + ", voucherToken=" + this.voucherToken + ", unPnl=" + this.unPnl + ", unPnlYield=" + this.unPnlYield + ", platformName=" + this.platformName + ", walletInvestmentType=" + this.walletInvestmentType + ", spotBalance=" + this.spotBalance + ", holdAvgPrice=" + this.holdAvgPrice + ")";
    }

    public WalletCoinAssetEntity(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull String str6, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        this.walletId = str;
        this.coinId = j;
        this.amount = str2;
        this.amountInt = str3;
        this.ccyAmount = str4;
        this.dailyChange = str5;
        this.orderValue = i;
        this.address = str6;
        this.voucherToken = i2;
        this.unPnl = str7;
        this.unPnlYield = str8;
        this.platformName = str9;
        this.walletInvestmentType = str10;
        this.spotBalance = str11;
        this.holdAvgPrice = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r33v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : ("0"))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0036: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r33v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r26v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0070: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0079: ARITH (r33v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletCoinAssetEntity(String str, long j, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, String str8, String str9, String str10, String str11, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? "0" : str2, (i3 & 8) != 0 ? "0" : str3, (i3 & 16) != 0 ? "0" : str4, (i3 & 32) == 0 ? str5 : "0", (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? "" : str6, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) != 0 ? "" : str9, (i3 & 4096) != 0 ? "" : str10, (i3 & 8192) != 0 ? "" : str11, (i3 & 16384) != 0 ? "" : str12);
    }
}
