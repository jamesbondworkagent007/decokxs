package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CommonDexInfo {
    public static final int $stable = 0;
    private final String blockTime;
    private final TokenInfo fromToken;
    private final String fromTokenAmount;
    private final String fromTokenUsdAmount;
    private final String priceImpact;
    private final TokenInfo toToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CommonDexInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CommonDexInfo copy$default(CommonDexInfo commonDexInfo, TokenInfo tokenInfo, TokenInfo tokenInfo2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenInfo = commonDexInfo.fromToken;
        }
        if ((i & 2) != 0) {
            tokenInfo2 = commonDexInfo.toToken;
        }
        TokenInfo tokenInfo3 = tokenInfo2;
        if ((i & 4) != 0) {
            str = commonDexInfo.fromTokenAmount;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = commonDexInfo.fromTokenUsdAmount;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = commonDexInfo.priceImpact;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = commonDexInfo.blockTime;
        }
        return commonDexInfo.copy(tokenInfo, tokenInfo3, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component1() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo component2() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fromTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceImpact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo copy(@NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CommonDexInfo(tokenInfo, tokenInfo2, str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDexInfo)) {
            return false;
        }
        CommonDexInfo commonDexInfo = (CommonDexInfo) obj;
        return Intrinsics.EZpvd(this.fromToken, commonDexInfo.fromToken) && Intrinsics.EZpvd(this.toToken, commonDexInfo.toToken) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) commonDexInfo.fromTokenAmount) && Intrinsics.EZpvd((Object) this.fromTokenUsdAmount, (Object) commonDexInfo.fromTokenUsdAmount) && Intrinsics.EZpvd((Object) this.priceImpact, (Object) commonDexInfo.priceImpact) && Intrinsics.EZpvd((Object) this.blockTime, (Object) commonDexInfo.blockTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockTime() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenUsdAmount() {
        return this.fromTokenUsdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceImpact() {
        return this.priceImpact;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo getToToken() {
        return this.toToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.fromToken.hashCode() * 31) + this.toToken.hashCode()) * 31) + this.fromTokenAmount.hashCode()) * 31) + this.fromTokenUsdAmount.hashCode()) * 31) + this.priceImpact.hashCode()) * 31) + this.blockTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CommonDexInfo(fromToken=" + this.fromToken + ", toToken=" + this.toToken + ", fromTokenAmount=" + this.fromTokenAmount + ", fromTokenUsdAmount=" + this.fromTokenUsdAmount + ", priceImpact=" + this.priceImpact + ", blockTime=" + this.blockTime + ")";
    }

    public CommonDexInfo(@NotNull TokenInfo tokenInfo, @NotNull TokenInfo tokenInfo2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        Intrinsics.checkNotNullParameter(tokenInfo2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.fromToken = tokenInfo;
        this.toToken = tokenInfo2;
        this.fromTokenAmount = str;
        this.fromTokenUsdAmount = str2;
        this.priceImpact = str3;
        this.blockTime = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:45) call: com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo))
  (wrap:com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo:?: TERNARY null = ((wrap:int:0x0015: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  (null java.lang.String)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:46) call: com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r18v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo, com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:44) call: com.okinc.business.dex.api.bean.sa_small_assets.CommonDexInfo.<init>(com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo, com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CommonDexInfo(TokenInfo tokenInfo, TokenInfo tokenInfo2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TokenInfo(null, null, null, null, 0, null, 63, null) : tokenInfo, (i & 2) != 0 ? new TokenInfo(null, null, null, null, 0, null, 63, null) : tokenInfo2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
