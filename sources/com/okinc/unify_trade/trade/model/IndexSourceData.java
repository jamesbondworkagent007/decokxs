package com.okinc.unify_trade.trade.model;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class IndexSourceData {
    public static final int $stable = 0;
    private final String cupPrice;
    private final String instId;
    private final Pair<Double, String> priceLimit;
    private final String tickerPx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCupPrice() {
        return this.cupPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndex() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndexPrice() {
        return this.tickerPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getPriceLimit, reason: collision with other method in class */
    public final Pair<Double, String> m7146getPriceLimit() {
        return this.priceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotePrice() {
        return this.cupPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickerPx() {
        return this.tickerPx;
    }

    public IndexSourceData(@NotNull String str, @NotNull String str2, @NotNull Pair<Double, String> pair, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.instId = str;
        this.tickerPx = str2;
        this.priceLimit = pair;
        this.cupPrice = str3;
    }

    public final String getPriceLimit() {
        return this.priceLimit.getSecond();
    }

    public final double getPriceLimitNum() {
        return this.priceLimit.getFirst().doubleValue();
    }

    public final String getTradePriceLimitNum() {
        Pair<Double, String> pair = this.priceLimit;
        return C33129mqd.gEmmrt(pair != null ? pair.getFirst() : null);
    }
}
