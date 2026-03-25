package com.okinc.unify_trade.biz.subscribe;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xFD;

/* JADX INFO: loaded from: classes12.dex */
public final class DexAssets {
    public static final int $stable = 0;
    private final String averageBuy;
    private final String averageSell;
    private final String balance;
    private final String balanceTag;
    private final String balanceUsd;
    private final String balanceValuation;
    private final String boughtVolume;
    private final String cefiSupport;
    private final String chainIndex;
    private final String chainLogoUrl;
    private final String coinTypeNumber;
    private final String currentProfit;
    private final String currentProfitPercentage;
    private final String decimal;
    private final String isPnlSupported;
    private final String price;
    private final String rawBalance;
    private final String realizedProfit;
    private final String realizedProfitPercentage;
    private final String riskLevel;
    private final String soldVolume;
    private final String spotBalance;
    private final String symbol;
    private final String tokenAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String unrealizedProfit;
    private final String unrealizedProfitPercentage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexAssets() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.balanceValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.isPnlSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.averageBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinTypeNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.rawBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAssets copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        return new DexAssets(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexAssets)) {
            return false;
        }
        DexAssets dexAssets = (DexAssets) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) dexAssets.tokenName) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexAssets.chainIndex) && Intrinsics.EZpvd((Object) this.coinTypeNumber, (Object) dexAssets.coinTypeNumber) && Intrinsics.EZpvd((Object) this.symbol, (Object) dexAssets.symbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexAssets.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) dexAssets.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexAssets.chainLogoUrl) && Intrinsics.EZpvd((Object) this.rawBalance, (Object) dexAssets.rawBalance) && Intrinsics.EZpvd((Object) this.decimal, (Object) dexAssets.decimal) && Intrinsics.EZpvd((Object) this.balance, (Object) dexAssets.balance) && Intrinsics.EZpvd((Object) this.price, (Object) dexAssets.price) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) dexAssets.balanceUsd) && Intrinsics.EZpvd((Object) this.balanceTag, (Object) dexAssets.balanceTag) && Intrinsics.EZpvd((Object) this.balanceValuation, (Object) dexAssets.balanceValuation) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexAssets.riskLevel) && Intrinsics.EZpvd((Object) this.cefiSupport, (Object) dexAssets.cefiSupport) && Intrinsics.EZpvd((Object) this.isPnlSupported, (Object) dexAssets.isPnlSupported) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) dexAssets.currentProfit) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) dexAssets.currentProfitPercentage) && Intrinsics.EZpvd((Object) this.unrealizedProfit, (Object) dexAssets.unrealizedProfit) && Intrinsics.EZpvd((Object) this.unrealizedProfitPercentage, (Object) dexAssets.unrealizedProfitPercentage) && Intrinsics.EZpvd((Object) this.realizedProfit, (Object) dexAssets.realizedProfit) && Intrinsics.EZpvd((Object) this.realizedProfitPercentage, (Object) dexAssets.realizedProfitPercentage) && Intrinsics.EZpvd((Object) this.averageBuy, (Object) dexAssets.averageBuy) && Intrinsics.EZpvd((Object) this.boughtVolume, (Object) dexAssets.boughtVolume) && Intrinsics.EZpvd((Object) this.averageSell, (Object) dexAssets.averageSell) && Intrinsics.EZpvd((Object) this.soldVolume, (Object) dexAssets.soldVolume) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) dexAssets.spotBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageBuy() {
        return this.averageBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageSell() {
        return this.averageSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceTag() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceUsd() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceValuation() {
        return this.balanceValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBoughtVolume() {
        return this.boughtVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiSupport() {
        return this.cefiSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinTypeNumber() {
        return this.coinTypeNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfit() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfitPercentage() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawBalance() {
        return this.rawBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfit() {
        return this.realizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedProfitPercentage() {
        return this.realizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSoldVolume() {
        return this.soldVolume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotBalance() {
        return this.spotBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
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
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedProfit() {
        return this.unrealizedProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnrealizedProfitPercentage() {
        return this.unrealizedProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainIndex;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.coinTypeNumber;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.symbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenAddress;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenLogoUrl;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.chainLogoUrl;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.rawBalance;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.decimal;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.balance;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.price;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.balanceUsd;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.balanceTag;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.balanceValuation;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.riskLevel;
        int iHashCode15 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.cefiSupport;
        int iHashCode16 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.isPnlSupported;
        int iHashCode17 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.currentProfit;
        int iHashCode18 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.currentProfitPercentage;
        int iHashCode19 = str19 == null ? 0 : str19.hashCode();
        String str20 = this.unrealizedProfit;
        int iHashCode20 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.unrealizedProfitPercentage;
        int iHashCode21 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.realizedProfit;
        int iHashCode22 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.realizedProfitPercentage;
        int iHashCode23 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.averageBuy;
        int iHashCode24 = str24 == null ? 0 : str24.hashCode();
        String str25 = this.boughtVolume;
        int iHashCode25 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.averageSell;
        int iHashCode26 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.soldVolume;
        int iHashCode27 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.spotBalance;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (str28 == null ? 0 : str28.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isPnlSupported() {
        return this.isPnlSupported;
    }

    public DexAssets(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28) {
        this.tokenName = str;
        this.chainIndex = str2;
        this.coinTypeNumber = str3;
        this.symbol = str4;
        this.tokenAddress = str5;
        this.tokenLogoUrl = str6;
        this.chainLogoUrl = str7;
        this.rawBalance = str8;
        this.decimal = str9;
        this.balance = str10;
        this.price = str11;
        this.balanceUsd = str12;
        this.balanceTag = str13;
        this.balanceValuation = str14;
        this.riskLevel = str15;
        this.cefiSupport = str16;
        this.isPnlSupported = str17;
        this.currentProfit = str18;
        this.currentProfitPercentage = str19;
        this.unrealizedProfit = str20;
        this.unrealizedProfitPercentage = str21;
        this.realizedProfit = str22;
        this.realizedProfitPercentage = str23;
        this.averageBuy = str24;
        this.boughtVolume = str25;
        this.averageSell = str26;
        this.soldVolume = str27;
        this.spotBalance = str28;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0143: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r58v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r58v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r58v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r58v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r58v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r58v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r58v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r58v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r58v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r58v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r58v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r58v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r58v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r58v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r58v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r58v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r58v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r58v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r58v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r58v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r58v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r58v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r58v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r58v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r58v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r58v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r58v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r58v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:48) call: com.okinc.unify_trade.biz.subscribe.DexAssets.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexAssets(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : str22, (i & 4194304) != 0 ? null : str23, (i & 8388608) != 0 ? null : str24, (i & 16777216) != 0 ? null : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str26, (i & 67108864) != 0 ? null : str27, (i & 134217728) != 0 ? null : str28);
    }

    public String toString() {
        return xFD.Companion.copydefault(this);
    }
}
