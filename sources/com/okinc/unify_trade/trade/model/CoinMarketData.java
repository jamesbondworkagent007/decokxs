package com.okinc.unify_trade.trade.model;

import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class CoinMarketData extends MarketDataSource {
    public static final int $stable = 8;
    private String showPrice;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 java.lang.String)
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x001a: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r18v0 kotlin.Pair))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (r20v0 java.lang.String)
  (r21v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:8) call: com.okinc.unify_trade.trade.model.CoinMarketData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CoinMarketData(String str, String str2, String str3, String str4, Pair pair, String str5, String str6, boolean z, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, str4, (i & 16) != 0 ? null : pair, (i & 32) != 0 ? null : str5, str6, z, (i & 256) != 0 ? "" : str7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMarketData(@NotNull String str, @NotNull String str2, String str3, String str4, Pair<Double, String> pair, String str5, @NotNull String str6, boolean z, @NotNull String str7) {
        super(str, str2, (String) null, str4, (String) null, (String) null, (String) null, (String) null, (Pair) pair, str5, (String) null, (String) null, (String) null, str7, str6, str3, Boolean.valueOf(z), (Double) null, (Double) null, (Double) null, false, false, (String) null, (String) null, false, false, (String) null, (String) null, 268311796, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
    }

    public final String getUrl() {
        String coinUrl = getCoinUrl();
        return coinUrl == null ? "" : coinUrl;
    }

    public final String getSymbol() {
        String instId = getInstId();
        return instId == null ? "" : instId;
    }

    public final String getSymbolName() {
        String mSymbolName = getMSymbolName();
        return mSymbolName == null ? "" : mSymbolName;
    }

    public final String getShowPrice() {
        String tickerPrice = getTickerPrice();
        return tickerPrice == null ? "" : tickerPrice;
    }

    /* JADX DEBUG: Possible override for method com.okinc.tradeapi.bean.MarketDataSource.getPriceLimit()Lkotlin/Pair; */
    public final String getPriceLimit() {
        String second;
        Pair<Double, String> priceLimit = getPriceLimit();
        return (priceLimit == null || (second = priceLimit.getSecond()) == null) ? "" : second;
    }

    public final String getTradePriceLimitNum() {
        Pair<Double, String> priceLimit = getPriceLimit();
        return C33129mqd.gEmmrt(priceLimit != null ? priceLimit.getFirst() : null);
    }
}
