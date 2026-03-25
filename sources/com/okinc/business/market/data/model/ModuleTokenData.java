package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ModuleTokenData {
    public static final int $stable = 8;
    private final String chainId;
    private final List<CompactTagData> t;
    private final String tokenAddress;
    private final String tokenLogoUrl;
    private final String tokenMarketCap;
    private final String tokenPrice;
    private final String tokenPriceChange;
    private final String tokenScoreRank;
    private final String tokenSymbol;
    private final String tokenVolume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleTokenData() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> component10() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenPriceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenScoreRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleTokenData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ModuleTokenData(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleTokenData)) {
            return false;
        }
        ModuleTokenData moduleTokenData = (ModuleTokenData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) moduleTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) moduleTokenData.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) moduleTokenData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenMarketCap, (Object) moduleTokenData.tokenMarketCap) && Intrinsics.EZpvd((Object) this.tokenPrice, (Object) moduleTokenData.tokenPrice) && Intrinsics.EZpvd((Object) this.tokenPriceChange, (Object) moduleTokenData.tokenPriceChange) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) moduleTokenData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenVolume, (Object) moduleTokenData.tokenVolume) && Intrinsics.EZpvd((Object) this.tokenScoreRank, (Object) moduleTokenData.tokenScoreRank) && Intrinsics.EZpvd(this.t, moduleTokenData.t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> getT() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenMarketCap() {
        return this.tokenMarketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPriceChange() {
        return this.tokenPriceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenScoreRank() {
        return this.tokenScoreRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenVolume() {
        return this.tokenVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogoUrl;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenMarketCap;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenPrice;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenPriceChange;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenSymbol;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenVolume;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.tokenScoreRank;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0)) * 31) + this.t.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleTokenData(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenMarketCap=" + this.tokenMarketCap + ", tokenPrice=" + this.tokenPrice + ", tokenPriceChange=" + this.tokenPriceChange + ", tokenSymbol=" + this.tokenSymbol + ", tokenVolume=" + this.tokenVolume + ", tokenScoreRank=" + this.tokenScoreRank + ", t=" + this.t + ")";
    }

    public ModuleTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull List<CompactTagData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.tokenLogoUrl = str3;
        this.tokenMarketCap = str4;
        this.tokenPrice = str5;
        this.tokenPriceChange = str6;
        this.tokenSymbol = str7;
        this.tokenVolume = str8;
        this.tokenScoreRank = str9;
        this.t = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0046: ARITH (r22v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:42)) : (r21v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>):void (m)] (LINE:32) call: com.okinc.business.market.data.model.ModuleTokenData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ModuleTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null, (i & 512) != 0 ? yDY.AhwBna() : list);
    }
}
