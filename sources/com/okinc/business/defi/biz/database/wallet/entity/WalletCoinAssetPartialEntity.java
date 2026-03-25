package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletCoinAssetPartialEntity {
    public static final int $stable = 8;
    private String address;
    private String ccyAmount;
    private long coinId;
    private String unPnl;
    private String unPnlYield;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletCoinAssetPartialEntity() {
        this(null, 0L, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletCoinAssetPartialEntity copy$default(WalletCoinAssetPartialEntity walletCoinAssetPartialEntity, String str, long j, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletCoinAssetPartialEntity.walletId;
        }
        if ((i & 2) != 0) {
            j = walletCoinAssetPartialEntity.coinId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = walletCoinAssetPartialEntity.address;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = walletCoinAssetPartialEntity.ccyAmount;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = walletCoinAssetPartialEntity.unPnl;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = walletCoinAssetPartialEntity.unPnlYield;
        }
        return walletCoinAssetPartialEntity.copy(str, j2, str6, str7, str8, str5);
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
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ccyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCoinAssetPartialEntity copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new WalletCoinAssetPartialEntity(str, j, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletCoinAssetPartialEntity)) {
            return false;
        }
        WalletCoinAssetPartialEntity walletCoinAssetPartialEntity = (WalletCoinAssetPartialEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletCoinAssetPartialEntity.walletId) && this.coinId == walletCoinAssetPartialEntity.coinId && Intrinsics.EZpvd((Object) this.address, (Object) walletCoinAssetPartialEntity.address) && Intrinsics.EZpvd((Object) this.ccyAmount, (Object) walletCoinAssetPartialEntity.ccyAmount) && Intrinsics.EZpvd((Object) this.unPnl, (Object) walletCoinAssetPartialEntity.unPnl) && Intrinsics.EZpvd((Object) this.unPnlYield, (Object) walletCoinAssetPartialEntity.unPnlYield);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
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
    public final String getUnPnl() {
        return this.unPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnPnlYield() {
        return this.unPnlYield;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.address.hashCode()) * 31) + this.ccyAmount.hashCode()) * 31) + this.unPnl.hashCode()) * 31) + this.unPnlYield.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
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
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletCoinAssetPartialEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", address=" + this.address + ", ccyAmount=" + this.ccyAmount + ", unPnl=" + this.unPnl + ", unPnlYield=" + this.unPnlYield + ")";
    }

    public WalletCoinAssetPartialEntity(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.walletId = str;
        this.coinId = j;
        this.address = str2;
        this.ccyAmount = str3;
        this.unPnl = str4;
        this.unPnlYield = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:long:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:0x001d: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("0") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPartialEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletCoinAssetPartialEntity(String str, long j, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "0" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
