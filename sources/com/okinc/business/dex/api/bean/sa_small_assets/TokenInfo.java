package com.okinc.business.dex.api.bean.sa_small_assets;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TokenInfo {
    public static final int $stable = 0;
    private final int decimal;
    private final String priceUsd;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfo() {
        this(null, null, null, null, 0, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tokenInfo.tokenContractAddress;
        }
        if ((i2 & 2) != 0) {
            str2 = tokenInfo.tokenSymbol;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = tokenInfo.tokenName;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = tokenInfo.tokenLogoUrl;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            i = tokenInfo.decimal;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = tokenInfo.priceUsd;
        }
        return tokenInfo.copy(str, str6, str7, str8, i3, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.priceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenInfo(str, str2, str3, str4, i, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) tokenInfo.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenInfo.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenInfo.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) tokenInfo.tokenLogoUrl) && this.decimal == tokenInfo.decimal && Intrinsics.EZpvd((Object) this.priceUsd, (Object) tokenInfo.priceUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceUsd() {
        return this.priceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tokenContractAddress.hashCode() * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + Integer.hashCode(this.decimal)) * 31) + this.priceUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfo(tokenContractAddress=" + this.tokenContractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenLogoUrl=" + this.tokenLogoUrl + ", decimal=" + this.decimal + ", priceUsd=" + this.priceUsd + ")";
    }

    public TokenInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tokenContractAddress = str;
        this.tokenSymbol = str2;
        this.tokenName = str3;
        this.tokenLogoUrl = str4;
        this.decimal = i;
        this.priceUsd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:int:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m)] (LINE:54) call: com.okinc.business.dex.api.bean.sa_small_assets.TokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: THIS */
    public /* synthetic */ TokenInfo(String str, String str2, String str3, String str4, int i, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? "" : str5);
    }
}
