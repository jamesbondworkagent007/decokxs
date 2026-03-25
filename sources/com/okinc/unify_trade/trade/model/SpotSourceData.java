package com.okinc.unify_trade.trade.model;

import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SpotSourceData extends MarketDataSource {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 kotlin.Pair)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 boolean)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.unify_trade.trade.model.SpotSourceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotSourceData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Pair pair, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, pair, str9, str10, str11, str12, z, str13, str14, str15, (i & 131072) != 0 ? null : str16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotSourceData(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, Pair<Double, String> pair, String str9, String str10, String str11, String str12, boolean z, String str13, String str14, String str15, String str16) {
        super(str, str2, str3, str4, str5, str8, str6, str7, (Pair) pair, str9, str10, (String) null, str11, str12, (String) null, (String) null, Boolean.valueOf(z), (Double) null, (Double) null, (Double) null, false, false, str13, str14, false, false, str15, str16, 54446080, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
    }

    public final String getTradeSymbol() {
        String baseSymbol = getBaseSymbol();
        return baseSymbol == null ? "" : baseSymbol;
    }

    public final String getChargeSymbol() {
        String quoteSymbol = getQuoteSymbol();
        return quoteSymbol == null ? "" : quoteSymbol;
    }

    public final String getLever() {
        String leverage = getLeverage();
        return leverage == null ? "" : leverage;
    }

    public final String getTickerPx() {
        String tickerPrice = getTickerPrice();
        return tickerPrice == null ? "" : tickerPrice;
    }

    public final String getCupTickerPx() {
        String cupTickerPrice = getCupTickerPrice();
        return cupTickerPrice == null ? "" : cupTickerPrice;
    }

    public final String getTradeVolume() {
        String volume = getVolume();
        return volume == null ? "" : volume;
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
