package com.okinc.oklive.app.data.model.remote;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TokenToPromote {
    public static final int $stable = 8;

    @SerializedName("cedefiToken")
    private final CedefiToken cedefiToken;

    @SerializedName("cefiToken")
    private final CefiToken cefiToken;

    @SerializedName("chainLogo")
    private final String chainLogo;

    @SerializedName("change1h")
    private final String change1h;

    @SerializedName("currentPrice")
    private final String currentPrice;

    @SerializedName("icons")
    private final List<TokenIcon> icons;

    @SerializedName("isDexListed")
    private final Boolean isDexListed;

    @SerializedName("marketCap")
    private final String marketCap;

    @SerializedName("tokenLogo")
    private final String tokenLogo;

    @SerializedName("tokenName")
    private final String tokenName;

    @SerializedName("tokenSymbol")
    private final String tokenSymbol;

    @SerializedName("tokenType")
    private final Integer tokenType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenToPromote() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.change1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken component2() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken component3() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenIcon> component9() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenToPromote copy(Integer num, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List<TokenIcon> list, String str5, String str6, String str7) {
        return new TokenToPromote(num, cefiToken, cedefiToken, str, str2, bool, str3, str4, list, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenToPromote)) {
            return false;
        }
        TokenToPromote tokenToPromote = (TokenToPromote) obj;
        return Intrinsics.EZpvd(this.tokenType, tokenToPromote.tokenType) && Intrinsics.EZpvd(this.cefiToken, tokenToPromote.cefiToken) && Intrinsics.EZpvd(this.cedefiToken, tokenToPromote.cedefiToken) && Intrinsics.EZpvd((Object) this.tokenName, (Object) tokenToPromote.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) tokenToPromote.tokenSymbol) && Intrinsics.EZpvd(this.isDexListed, tokenToPromote.isDexListed) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) tokenToPromote.tokenLogo) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) tokenToPromote.chainLogo) && Intrinsics.EZpvd(this.icons, tokenToPromote.icons) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) tokenToPromote.currentPrice) && Intrinsics.EZpvd((Object) this.change1h, (Object) tokenToPromote.change1h) && Intrinsics.EZpvd((Object) this.marketCap, (Object) tokenToPromote.marketCap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CedefiToken getCedefiToken() {
        return this.cedefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CefiToken getCefiToken() {
        return this.cefiToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChange1h() {
        return this.change1h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenIcon> getIcons() {
        return this.icons;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
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
    public final Integer getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.tokenType;
        int iHashCode = num == null ? 0 : num.hashCode();
        CefiToken cefiToken = this.cefiToken;
        int iHashCode2 = cefiToken == null ? 0 : cefiToken.hashCode();
        CedefiToken cedefiToken = this.cedefiToken;
        int iHashCode3 = cedefiToken == null ? 0 : cedefiToken.hashCode();
        String str = this.tokenName;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenSymbol;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isDexListed;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str3 = this.tokenLogo;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.chainLogo;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        List<TokenIcon> list = this.icons;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        String str5 = this.currentPrice;
        int iHashCode10 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.change1h;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.marketCap;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isDexListed() {
        return this.isDexListed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenToPromote(tokenType=" + this.tokenType + ", cefiToken=" + this.cefiToken + ", cedefiToken=" + this.cedefiToken + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", isDexListed=" + this.isDexListed + ", tokenLogo=" + this.tokenLogo + ", chainLogo=" + this.chainLogo + ", icons=" + this.icons + ", currentPrice=" + this.currentPrice + ", change1h=" + this.change1h + ", marketCap=" + this.marketCap + ")";
    }

    public TokenToPromote(Integer num, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List<TokenIcon> list, String str5, String str6, String str7) {
        this.tokenType = num;
        this.cefiToken = cefiToken;
        this.cedefiToken = cedefiToken;
        this.tokenName = str;
        this.tokenSymbol = str2;
        this.isDexListed = bool;
        this.tokenLogo = str3;
        this.chainLogo = str4;
        this.icons = list;
        this.currentPrice = str5;
        this.change1h = str6;
        this.marketCap = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:com.okinc.oklive.app.data.model.remote.CefiToken:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.CefiToken) : (r15v0 com.okinc.oklive.app.data.model.remote.CefiToken))
  (wrap:com.okinc.oklive.app.data.model.remote.CedefiToken:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.oklive.app.data.model.remote.CedefiToken) : (r16v0 com.okinc.oklive.app.data.model.remote.CedefiToken))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, com.okinc.oklive.app.data.model.remote.CefiToken, com.okinc.oklive.app.data.model.remote.CedefiToken, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.oklive.app.data.model.remote.TokenIcon>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:174) call: com.okinc.oklive.app.data.model.remote.TokenToPromote.<init>(java.lang.Integer, com.okinc.oklive.app.data.model.remote.CefiToken, com.okinc.oklive.app.data.model.remote.CedefiToken, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenToPromote(Integer num, CefiToken cefiToken, CedefiToken cedefiToken, String str, String str2, Boolean bool, String str3, String str4, List list, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : cefiToken, (i & 4) != 0 ? null : cedefiToken, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) == 0 ? str7 : null);
    }
}
