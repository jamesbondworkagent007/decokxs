package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletTotalAssetEntity {
    public static final int $stable = 8;
    private String defiAsset;
    private String nftAsset;
    private String tokenAsset;
    private String tokenAssetFilterSmall;
    private String updateTime;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletTotalAssetEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletTotalAssetEntity copy$default(WalletTotalAssetEntity walletTotalAssetEntity, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletTotalAssetEntity.walletId;
        }
        if ((i & 2) != 0) {
            str2 = walletTotalAssetEntity.tokenAsset;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = walletTotalAssetEntity.tokenAssetFilterSmall;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = walletTotalAssetEntity.nftAsset;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = walletTotalAssetEntity.defiAsset;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = walletTotalAssetEntity.updateTime;
        }
        return walletTotalAssetEntity.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAssetFilterSmall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletTotalAssetEntity copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new WalletTotalAssetEntity(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletTotalAssetEntity)) {
            return false;
        }
        WalletTotalAssetEntity walletTotalAssetEntity = (WalletTotalAssetEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) walletTotalAssetEntity.walletId) && Intrinsics.EZpvd((Object) this.tokenAsset, (Object) walletTotalAssetEntity.tokenAsset) && Intrinsics.EZpvd((Object) this.tokenAssetFilterSmall, (Object) walletTotalAssetEntity.tokenAssetFilterSmall) && Intrinsics.EZpvd((Object) this.nftAsset, (Object) walletTotalAssetEntity.nftAsset) && Intrinsics.EZpvd((Object) this.defiAsset, (Object) walletTotalAssetEntity.defiAsset) && Intrinsics.EZpvd((Object) this.updateTime, (Object) walletTotalAssetEntity.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiAsset() {
        return this.defiAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftAsset() {
        return this.nftAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAsset() {
        return this.tokenAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAssetFilterSmall() {
        return this.tokenAssetFilterSmall;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + this.tokenAsset.hashCode()) * 31) + this.tokenAssetFilterSmall.hashCode()) * 31) + this.nftAsset.hashCode()) * 31) + this.defiAsset.hashCode()) * 31) + this.updateTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiAsset(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.defiAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftAsset(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nftAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAsset(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAsset = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAssetFilterSmall(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenAssetFilterSmall = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.updateTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletTotalAssetEntity(walletId=" + this.walletId + ", tokenAsset=" + this.tokenAsset + ", tokenAssetFilterSmall=" + this.tokenAssetFilterSmall + ", nftAsset=" + this.nftAsset + ", defiAsset=" + this.defiAsset + ", updateTime=" + this.updateTime + ")";
    }

    public WalletTotalAssetEntity(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.walletId = str;
        this.tokenAsset = str2;
        this.tokenAssetFilterSmall = str3;
        this.nftAsset = str4;
        this.defiAsset = str5;
        this.updateTime = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WalletTotalAssetEntity(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
