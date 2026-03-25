package com.okinc.unify_trade.trade.model;

import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WatchMarketData extends MarketDataSource {
    public static final int $stable = 0;
    private final String ctType;
    private final String mLevel;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r49v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r49v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x004c: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r36v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006e: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0097: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a1: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ab: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (r47v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.unify_trade.trade.model.WatchMarketData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ WatchMarketData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair pair, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? null : pair, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (32768 & i) != 0 ? null : str15, (65536 & i) != 0 ? "" : str16, (131072 & i) != 0 ? "" : str17, (262144 & i) != 0 ? "" : str18, (524288 & i) != 0 ? null : str19, str20, (i & 2097152) != 0 ? null : str21);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchMarketData(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, String str9, Pair<Double, String> pair, String str10, String str11, String str12, String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, String str18, String str19, String str20, String str21) {
        super(str, str2, str3, str5, str6, str15, str8, str9, (Pair) pair, str10, str11, str4, str12, (String) null, str13, str7, Boolean.TRUE, (Double) null, (Double) null, (Double) null, Intrinsics.EZpvd((Object) str16, (Object) "1"), Intrinsics.EZpvd((Object) str17, (Object) "1"), str18, str19, false, false, str20, str21, 51249152, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        this.ctType = str14;
        this.mLevel = str15;
    }

    public final String getLeft() {
        String instType = getInstType();
        if (Intrinsics.EZpvd((Object) instType, (Object) "SPOT") || Intrinsics.EZpvd((Object) instType, (Object) "MARGIN")) {
            String baseSymbol = getBaseSymbol();
            return baseSymbol == null ? "" : baseSymbol;
        }
        return getBizInstTitle();
    }

    public final String getRight() {
        String instType = getInstType();
        if (Intrinsics.EZpvd((Object) instType, (Object) "SPOT") || Intrinsics.EZpvd((Object) instType, (Object) "MARGIN")) {
            String displayQuoteSymbol = getDisplayQuoteSymbol();
            if (displayQuoteSymbol != null) {
                return displayQuoteSymbol;
            }
            String quoteSymbol = getQuoteSymbol();
            if (quoteSymbol != null) {
                return quoteSymbol;
            }
        }
        return "";
    }

    public final String getTradeLeverage() {
        String leverage;
        String instType = getInstType();
        return ((Intrinsics.EZpvd((Object) instType, (Object) "SPOT") || Intrinsics.EZpvd((Object) instType, (Object) "MARGIN")) && (leverage = getLeverage()) != null) ? leverage : "";
    }

    public final String getTradeVolume() {
        String volume = getVolume();
        return volume == null ? "" : volume;
    }

    public final boolean isCoin() {
        return Intrinsics.EZpvd((Object) getInstType(), (Object) "COIN");
    }

    public final String getTradeCoinUrl() {
        String coinUrl = getCoinUrl();
        return coinUrl == null ? "" : coinUrl;
    }

    public final String getMarginLeverage() {
        String leverage = getLeverage();
        return leverage == null ? "" : leverage;
    }

    public final String getCoinName() {
        String instId;
        return (!Intrinsics.EZpvd((Object) getInstType(), (Object) "COIN") || (instId = getInstId()) == null) ? "" : instId;
    }

    public final String getFullName() {
        String mSymbolName = getMSymbolName();
        return mSymbolName == null ? "" : mSymbolName;
    }

    @Override // com.okinc.tradeapi.bean.MarketDataSource
    public Boolean isPositiveContract() {
        String str = this.ctType;
        if (str == null) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.EZpvd((Object) str, (Object) "linear"));
    }

    public final String getTickerPx() {
        String tickerPrice = getTickerPrice();
        return tickerPrice == null ? "" : tickerPrice;
    }

    public final String getCupTickerPx() {
        String cupTickerPrice = getCupTickerPrice();
        return cupTickerPrice == null ? "" : cupTickerPrice;
    }

    public final String getTradePriceLimit() {
        String second;
        Pair<Double, String> priceLimit = getPriceLimit();
        return (priceLimit == null || (second = priceLimit.getSecond()) == null) ? "" : second;
    }

    public final String getTradePriceLimitNum() {
        Pair<Double, String> priceLimit = getPriceLimit();
        return C33129mqd.gEmmrt(priceLimit != null ? priceLimit.getFirst() : null);
    }
}
