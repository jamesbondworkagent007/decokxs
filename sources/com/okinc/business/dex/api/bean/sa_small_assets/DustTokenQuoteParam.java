package com.okinc.business.dex.api.bean.sa_small_assets;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class DustTokenQuoteParam {
    public static final int $stable = 8;
    private final String chainId;
    private final List<DustToken> dustTokens;
    private final String slippage;
    private final String slippageType;
    private final String targetTokenAddress;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DustTokenQuoteParam() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DustTokenQuoteParam copy$default(DustTokenQuoteParam dustTokenQuoteParam, String str, List list, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dustTokenQuoteParam.chainId;
        }
        if ((i & 2) != 0) {
            list = dustTokenQuoteParam.dustTokens;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = dustTokenQuoteParam.slippage;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = dustTokenQuoteParam.slippageType;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = dustTokenQuoteParam.targetTokenAddress;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = dustTokenQuoteParam.userWalletAddress;
        }
        return dustTokenQuoteParam.copy(str, list2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DustToken> component2() {
        return this.dustTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DustTokenQuoteParam copy(@NotNull String str, @NotNull List<DustToken> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new DustTokenQuoteParam(str, list, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DustTokenQuoteParam)) {
            return false;
        }
        DustTokenQuoteParam dustTokenQuoteParam = (DustTokenQuoteParam) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) dustTokenQuoteParam.chainId) && Intrinsics.EZpvd(this.dustTokens, dustTokenQuoteParam.dustTokens) && Intrinsics.EZpvd((Object) this.slippage, (Object) dustTokenQuoteParam.slippage) && Intrinsics.EZpvd((Object) this.slippageType, (Object) dustTokenQuoteParam.slippageType) && Intrinsics.EZpvd((Object) this.targetTokenAddress, (Object) dustTokenQuoteParam.targetTokenAddress) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) dustTokenQuoteParam.userWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DustToken> getDustTokens() {
        return this.dustTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageType() {
        return this.slippageType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTokenAddress() {
        return this.targetTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.chainId.hashCode() * 31) + this.dustTokens.hashCode()) * 31) + this.slippage.hashCode()) * 31) + this.slippageType.hashCode()) * 31) + this.targetTokenAddress.hashCode()) * 31) + this.userWalletAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DustTokenQuoteParam(chainId=" + this.chainId + ", dustTokens=" + this.dustTokens + ", slippage=" + this.slippage + ", slippageType=" + this.slippageType + ", targetTokenAddress=" + this.targetTokenAddress + ", userWalletAddress=" + this.userWalletAddress + ")";
    }

    public DustTokenQuoteParam(@NotNull String str, @NotNull List<DustToken> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainId = str;
        this.dustTokens = list;
        this.slippage = str2;
        this.slippageType = str3;
        this.targetTokenAddress = str4;
        this.userWalletAddress = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:8)) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.dex.api.bean.sa_small_assets.DustToken>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.dex.api.bean.sa_small_assets.DustTokenQuoteParam.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DustTokenQuoteParam(String str, List list, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
