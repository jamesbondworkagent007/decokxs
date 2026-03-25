package com.okinc.unify_trade.dex.assets.data.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class DexTokenPriceResponse {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String price;
    private final String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexTokenPriceResponse copy$default(DexTokenPriceResponse dexTokenPriceResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexTokenPriceResponse.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = dexTokenPriceResponse.tokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = dexTokenPriceResponse.price;
        }
        return dexTokenPriceResponse.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenPriceResponse copy(String str, String str2, String str3) {
        return new DexTokenPriceResponse(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexTokenPriceResponse)) {
            return false;
        }
        DexTokenPriceResponse dexTokenPriceResponse = (DexTokenPriceResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexTokenPriceResponse.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexTokenPriceResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) dexTokenPriceResponse.price);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainIndex;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.price;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexTokenPriceResponse(chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ")";
    }

    public DexTokenPriceResponse(String str, String str2, String str3) {
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.price = str3;
    }
}
