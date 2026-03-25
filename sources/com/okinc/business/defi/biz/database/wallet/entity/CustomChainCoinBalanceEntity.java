package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainCoinBalanceEntity {
    public static final int $stable = 8;
    private String amount;
    private String ccyAmount;
    private long coinId;
    private long createAt;
    private int orderValue;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainCoinBalanceEntity() {
        this(null, 0L, null, null, 0, 0L, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
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
        return this.ccyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinBalanceEntity copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, int i, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CustomChainCoinBalanceEntity(str, j, str2, str3, i, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainCoinBalanceEntity)) {
            return false;
        }
        CustomChainCoinBalanceEntity customChainCoinBalanceEntity = (CustomChainCoinBalanceEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) customChainCoinBalanceEntity.walletId) && this.coinId == customChainCoinBalanceEntity.coinId && Intrinsics.EZpvd((Object) this.amount, (Object) customChainCoinBalanceEntity.amount) && Intrinsics.EZpvd((Object) this.ccyAmount, (Object) customChainCoinBalanceEntity.ccyAmount) && this.orderValue == customChainCoinBalanceEntity.orderValue && this.createAt == customChainCoinBalanceEntity.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
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
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderValue() {
        return this.orderValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.amount.hashCode()) * 31) + this.ccyAmount.hashCode()) * 31) + Integer.hashCode(this.orderValue)) * 31) + Long.hashCode(this.createAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
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
    public final void setCreateAt(long j) {
        this.createAt = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderValue(int i) {
        this.orderValue = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainCoinBalanceEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", amount=" + this.amount + ", ccyAmount=" + this.ccyAmount + ", orderValue=" + this.orderValue + ", createAt=" + this.createAt + ")";
    }

    public CustomChainCoinBalanceEntity(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, int i, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.walletId = str;
        this.coinId = j;
        this.amount = str2;
        this.ccyAmount = str3;
        this.orderValue = i;
        this.createAt = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : ("0"))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r15v0 int))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r16v0 long) : (0 long))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, int, long):void (m)] (LINE:32) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, int, long):void type: THIS */
    public /* synthetic */ CustomChainCoinBalanceEntity(String str, long j, String str2, String str3, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "0" : str2, (i2 & 8) == 0 ? str3 : "0", (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? j2 : 0L);
    }
}
