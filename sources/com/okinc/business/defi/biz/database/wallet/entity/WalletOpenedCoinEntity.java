package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletOpenedCoinEntity {
    public static final int $stable = 8;
    private long coinId;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletOpenedCoinEntity() {
        this(null, 0L, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletOpenedCoinEntity copy$default(WalletOpenedCoinEntity walletOpenedCoinEntity, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletOpenedCoinEntity.walletId;
        }
        if ((i & 2) != 0) {
            j = walletOpenedCoinEntity.coinId;
        }
        return walletOpenedCoinEntity.copy(str, j);
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
    public final WalletOpenedCoinEntity copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WalletOpenedCoinEntity(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletOpenedCoinEntity)) {
            return false;
        }
        WalletOpenedCoinEntity walletOpenedCoinEntity = (WalletOpenedCoinEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletOpenedCoinEntity.walletId) && this.coinId == walletOpenedCoinEntity.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletId.hashCode() * 31) + Long.hashCode(this.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletOpenedCoinEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ")";
    }

    public WalletOpenedCoinEntity(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
        this.coinId = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(java.lang.String, long):void (m)] (LINE:20) call: com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity.<init>(java.lang.String, long):void type: THIS */
    public /* synthetic */ WalletOpenedCoinEntity(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
    }
}
