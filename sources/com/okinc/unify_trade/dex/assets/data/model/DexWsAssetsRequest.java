package com.okinc.unify_trade.dex.assets.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class DexWsAssetsRequest {
    public static final int $stable = 8;
    private String chainIndex;
    private boolean hideSmallBalance;
    private int limit;
    private String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexWsAssetsRequest() {
        this(false, 0, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexWsAssetsRequest copy$default(DexWsAssetsRequest dexWsAssetsRequest, boolean z, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dexWsAssetsRequest.hideSmallBalance;
        }
        if ((i2 & 2) != 0) {
            i = dexWsAssetsRequest.limit;
        }
        if ((i2 & 4) != 0) {
            str = dexWsAssetsRequest.chainIndex;
        }
        if ((i2 & 8) != 0) {
            str2 = dexWsAssetsRequest.tokenAddress;
        }
        return dexWsAssetsRequest.copy(z, i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.hideSmallBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexWsAssetsRequest copy(boolean z, int i, String str, String str2) {
        return new DexWsAssetsRequest(z, i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexWsAssetsRequest)) {
            return false;
        }
        DexWsAssetsRequest dexWsAssetsRequest = (DexWsAssetsRequest) obj;
        return this.hideSmallBalance == dexWsAssetsRequest.hideSmallBalance && this.limit == dexWsAssetsRequest.limit && Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexWsAssetsRequest.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexWsAssetsRequest.tokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHideSmallBalance() {
        return this.hideSmallBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.hideSmallBalance);
        int iHashCode2 = Integer.hashCode(this.limit);
        String str = this.chainIndex;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(String str) {
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHideSmallBalance(boolean z) {
        this.hideSmallBalance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(int i) {
        this.limit = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexWsAssetsRequest(hideSmallBalance=" + this.hideSmallBalance + ", limit=" + this.limit + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ")";
    }

    public DexWsAssetsRequest(boolean z, int i, String str, String str2) {
        this.hideSmallBalance = z;
        this.limit = i;
        this.chainIndex = str;
        this.tokenAddress = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(boolean, int, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.unify_trade.dex.assets.data.model.DexWsAssetsRequest.<init>(boolean, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexWsAssetsRequest(boolean z, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2);
    }
}
