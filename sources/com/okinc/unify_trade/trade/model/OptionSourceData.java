package com.okinc.unify_trade.trade.model;

import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class OptionSourceData extends MarketDataSource {
    public static final int $stable = 0;
    private final String optType;
    private final String stk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (r22v0 kotlin.Pair)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 boolean)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.unify_trade.trade.model.OptionSourceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ OptionSourceData(String str, String str2, String str3, String str4, String str5, String str6, Pair pair, String str7, String str8, String str9, String str10, String str11, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, pair, str7, str8, str9, str10, str11, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionSourceData(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Pair<Double, String> pair, String str7, String str8, String str9, @NotNull String str10, @NotNull String str11, boolean z) {
        super(str, str2, str3, str4, (String) null, (String) null, str5, str6, (Pair) pair, str7, str8, (String) null, str9, (String) null, (String) null, (String) null, Boolean.valueOf(z), (Double) null, (Double) null, (Double) null, false, false, (String) null, (String) null, false, false, (String) null, (String) null, 268355616, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.stk = str10;
        this.optType = str11;
    }

    public final String getTitle() {
        return getBizInstTitle();
    }

    public final String getTickerPx() {
        String tickerPrice = getTickerPrice();
        return tickerPrice == null ? "" : tickerPrice;
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
