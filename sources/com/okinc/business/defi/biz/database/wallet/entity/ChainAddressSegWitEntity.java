package com.okinc.business.defi.biz.database.wallet.entity;

import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ChainAddressSegWitEntity {
    public static final int $stable = 8;
    private String address;
    private int addressType;
    private long chainId;
    private String derivePath;
    private String publicKey;
    private String walletId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChainAddressSegWitEntity() {
        this(null, 0L, 0, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChainAddressSegWitEntity copy$default(ChainAddressSegWitEntity chainAddressSegWitEntity, String str, long j, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chainAddressSegWitEntity.walletId;
        }
        if ((i2 & 2) != 0) {
            j = chainAddressSegWitEntity.chainId;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            i = chainAddressSegWitEntity.addressType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = chainAddressSegWitEntity.address;
        }
        String str5 = str2;
        if ((i2 & 16) != 0) {
            str3 = chainAddressSegWitEntity.publicKey;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = chainAddressSegWitEntity.derivePath;
        }
        return chainAddressSegWitEntity.copy(str, j2, i3, str5, str6, str4);
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
    public final int component3() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.address;
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
    public final ChainAddressSegWitEntity copy(@NotNull String str, long j, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ChainAddressSegWitEntity(str, j, i, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChainAddressSegWitEntity)) {
            return false;
        }
        ChainAddressSegWitEntity chainAddressSegWitEntity = (ChainAddressSegWitEntity) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) chainAddressSegWitEntity.walletId) && this.chainId == chainAddressSegWitEntity.chainId && this.addressType == chainAddressSegWitEntity.addressType && Intrinsics.EZpvd((Object) this.address, (Object) chainAddressSegWitEntity.address) && Intrinsics.EZpvd((Object) this.publicKey, (Object) chainAddressSegWitEntity.publicKey) && Intrinsics.EZpvd((Object) this.derivePath, (Object) chainAddressSegWitEntity.derivePath);
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
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.walletId.hashCode() * 31) + Long.hashCode(this.chainId)) * 31) + Integer.hashCode(this.addressType)) * 31) + this.address.hashCode()) * 31) + this.publicKey.hashCode()) * 31) + this.derivePath.hashCode();
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
        return "ChainAddressSegWitEntity(walletId=" + this.walletId + ", chainId=" + this.chainId + ", addressType=" + this.addressType + ", address=" + this.address + ", publicKey=" + this.publicKey + ", derivePath=" + this.derivePath + ")";
    }

    public ChainAddressSegWitEntity(@NotNull String str, long j, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.walletId = str;
        this.chainId = j;
        this.addressType = i;
        this.address = str2;
        this.publicKey = str3;
        this.derivePath = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:long:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:int:0x001a: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0016: INVOKE 
  (wrap:com.okinc.wallet.api.bean.AddressType:0x0014: SGET  A[WRAPPED] (LINE:25) com.okinc.wallet.api.bean.AddressType.Legacy com.okinc.wallet.api.bean.AddressType)
 VIRTUAL call: com.okinc.wallet.api.bean.AddressType.getValue():int A[MD:():int (m), WRAPPED] (LINE:25)) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity.<init>(java.lang.String, long, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ChainAddressSegWitEntity(String str, long j, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? AddressType.Legacy.getValue() : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4);
    }
}
