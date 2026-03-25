package com.okinc.unify_trade.trade.model;

import com.okinc.tradeapi.bean.MarketDataSource;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FutureSourceData extends MarketDataSource {
    public static final int $stable = 8;
    private final String ctType;
    private final String futureAlias;
    private boolean mIsShowLine;
    private boolean mIsShowTitle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIsShowLine() {
        return this.mIsShowLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getIsShowTitle() {
        return this.mIsShowTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsShowLine(boolean z) {
        this.mIsShowLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsShowTitle(boolean z) {
        this.mIsShowTitle = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0044: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (r27v0 kotlin.Pair)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.Double, java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.unify_trade.trade.model.FutureSourceData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ FutureSourceData(String str, String str2, String str3, String str4, String str5, String str6, Pair pair, String str7, String str8, String str9, String str10, String str11, boolean z, boolean z2, boolean z3, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? "" : str6, pair, str7, str8, str9, str10, str11, z, (i & 8192) != 0 ? false : z2, (i & 16384) != 0 ? false : z3, (i & 32768) != 0 ? "" : str12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureSourceData(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, Pair<Double, String> pair, String str7, String str8, String str9, @NotNull String str10, @NotNull String str11, boolean z, boolean z2, boolean z3, @NotNull String str12) {
        super(str, str2, str3, str4, (String) null, (String) null, str5, str6, (Pair) pair, str7, str8, str11, str9, str12, (String) null, (String) null, Boolean.valueOf(z), (Double) null, (Double) null, (Double) null, false, false, (String) null, (String) null, false, false, (String) null, (String) null, 268353568, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.ctType = str10;
        this.futureAlias = str11;
        this.mIsShowTitle = z2;
        this.mIsShowLine = z3;
    }

    public final String getName() {
        return getBizInstTitle();
    }

    public final String getTradeVolume() {
        String volume = getVolume();
        return volume == null ? "" : volume;
    }

    public final String getTradePx() {
        String tickerPrice = getTickerPrice();
        return tickerPrice == null ? "" : tickerPrice;
    }

    public final String getCurrentCurrencyPx() {
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

    public final boolean isPositive() {
        return Intrinsics.EZpvd((Object) this.ctType, (Object) "linear");
    }

    @Override // com.okinc.tradeapi.bean.MarketDataSource
    public Boolean isPositiveContract() {
        return Boolean.valueOf(Intrinsics.EZpvd((Object) this.ctType, (Object) "linear"));
    }

    public final String getFutureAlias() {
        String alias = getAlias();
        return alias == null ? "" : alias;
    }
}
