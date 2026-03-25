package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainWalletCoinEntity {
    public static final int $stable = 8;
    private long coinId;
    private long createAt;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainWalletCoinEntity() {
        this(null, 0L, 0L, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomChainWalletCoinEntity copy$default(CustomChainWalletCoinEntity customChainWalletCoinEntity, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customChainWalletCoinEntity.walletId;
        }
        if ((i & 2) != 0) {
            j = customChainWalletCoinEntity.coinId;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = customChainWalletCoinEntity.createAt;
        }
        return customChainWalletCoinEntity.copy(str, j3, j2);
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
    public final long component3() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainWalletCoinEntity copy(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CustomChainWalletCoinEntity(str, j, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainWalletCoinEntity)) {
            return false;
        }
        CustomChainWalletCoinEntity customChainWalletCoinEntity = (CustomChainWalletCoinEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) customChainWalletCoinEntity.walletId) && this.coinId == customChainWalletCoinEntity.coinId && this.createAt == customChainWalletCoinEntity.createAt;
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
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + Long.hashCode(this.createAt);
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
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainWalletCoinEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", createAt=" + this.createAt + ")";
    }

    public CustomChainWalletCoinEntity(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
        this.coinId = j;
        this.createAt = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
 A[MD:(java.lang.String, long, long):void (m)] (LINE:32) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity.<init>(java.lang.String, long, long):void type: THIS */
    public /* synthetic */ CustomChainWalletCoinEntity(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
