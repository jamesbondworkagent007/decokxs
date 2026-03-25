package com.okinc.business.defi.biz.database.wallet.entity;

import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainAddressEntity {
    public static final int $stable = 8;
    private String address;
    private int addressType;
    private long chainId;
    private String derivePath;
    private String eoaAddress;
    private String proxyAddress;
    private String publicKey;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainAddressEntity() {
        this(null, 0L, null, 0, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.proxyAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainAddressEntity copy(@NotNull String str, long j, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new ChainAddressEntity(str, j, str2, i, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainAddressEntity)) {
            return false;
        }
        ChainAddressEntity chainAddressEntity = (ChainAddressEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) chainAddressEntity.walletId) && this.chainId == chainAddressEntity.chainId && Intrinsics.EZpvd((Object) this.address, (Object) chainAddressEntity.address) && this.addressType == chainAddressEntity.addressType && Intrinsics.EZpvd((Object) this.publicKey, (Object) chainAddressEntity.publicKey) && Intrinsics.EZpvd((Object) this.derivePath, (Object) chainAddressEntity.derivePath) && Intrinsics.EZpvd((Object) this.proxyAddress, (Object) chainAddressEntity.proxyAddress) && Intrinsics.EZpvd((Object) this.eoaAddress, (Object) chainAddressEntity.eoaAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDerivePath() {
        return this.derivePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProxyAddress() {
        return this.proxyAddress;
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
        return (((((((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.addressType)) * 31) + this.publicKey.hashCode()) * 31) + this.derivePath.hashCode()) * 31) + this.proxyAddress.hashCode()) * 31) + this.eoaAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDerivePath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.derivePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEoaAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eoaAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProxyAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.proxyAddress = str;
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
        return "ChainAddressEntity(walletId=" + this.walletId + ", chainId=" + this.chainId + ", address=" + this.address + ", addressType=" + this.addressType + ", publicKey=" + this.publicKey + ", derivePath=" + this.derivePath + ", proxyAddress=" + this.proxyAddress + ", eoaAddress=" + this.eoaAddress + ")";
    }

    public ChainAddressEntity(@NotNull String str, long j, @NotNull String str2, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.walletId = str;
        this.chainId = j;
        this.address = str2;
        this.addressType = i;
        this.publicKey = str3;
        this.derivePath = str4;
        this.proxyAddress = str5;
        this.eoaAddress = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r12v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x001e: SGET  A[WRAPPED] (LINE:26) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:26)) : (r15v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity.<init>(java.lang.String, long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChainAddressEntity(String str, long j, String str2, int i, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? AddressType.Legacy.getValue() : i, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) == 0 ? str6 : "");
    }
}
