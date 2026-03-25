package com.okinc.business.defi.biz.database.wallet.entity;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainAddressEntity {
    public static final int $stable = 8;
    private String address;
    private long coinId;
    private long createAt;
    private String derivePath;
    private String publicKey;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainAddressEntity() {
        this(null, 0L, null, null, null, 0L, 63, null);
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
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainAddressEntity copy(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CustomChainAddressEntity(str, j, str2, str3, str4, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomChainAddressEntity)) {
            return false;
        }
        CustomChainAddressEntity customChainAddressEntity = (CustomChainAddressEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) customChainAddressEntity.walletId) && this.coinId == customChainAddressEntity.coinId && Intrinsics.EZpvd((Object) this.address, (Object) customChainAddressEntity.address) && Intrinsics.EZpvd((Object) this.publicKey, (Object) customChainAddressEntity.publicKey) && Intrinsics.EZpvd((Object) this.derivePath, (Object) customChainAddressEntity.derivePath) && this.createAt == customChainAddressEntity.createAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
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
    public final String getDerivePath() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.coinId)) * 31) + this.address.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.derivePath.hashCode()) * 31) + Long.hashCode(this.createAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
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
    public final void setDerivePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.derivePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.publicKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainAddressEntity(walletId=" + this.walletId + ", coinId=" + this.coinId + ", address=" + this.address + ", publicKey=" + this.publicKey + ", derivePath=" + this.derivePath + ", createAt=" + this.createAt + ")";
    }

    public CustomChainAddressEntity(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.walletId = str;
        this.coinId = j;
        this.address = str2;
        this.publicKey = str3;
        this.derivePath = str4;
        this.createAt = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r16v0 long) : (0 long))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:32) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ CustomChainAddressEntity(String str, long j, String str2, String str3, String str4, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) == 0 ? j2 : 0L);
    }
}
