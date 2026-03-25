package com.okinc.unify_trade.trade.source.search;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class OkBizSearchInfo {
    public static final int $stable = 8;
    private final BizInstrument bizInfo;
    private boolean isWatching;
    private String price;
    private String priceLimit;
    private Double priceLimitNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizInstrument getBizInfo() {
        return this.bizInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceLimit() {
        return this.priceLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getPriceLimitNum() {
        return this.priceLimitNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWatching() {
        return this.isWatching;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceLimit(String str) {
        this.priceLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceLimitNum(Double d) {
        this.priceLimitNum = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWatching(boolean z) {
        this.isWatching = z;
    }

    public OkBizSearchInfo(String str, Double d, String str2, boolean z, @NotNull BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(bizInstrument, "");
        this.priceLimit = str;
        this.priceLimitNum = d;
        this.price = str2;
        this.isWatching = z;
        this.bizInfo = bizInstrument;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (r8v0 java.lang.Double)
  (r9v0 java.lang.String)
  (r10v0 boolean)
  (r11v0 com.okinc.unify_trade.biz.BizInstrument)
 A[MD:(java.lang.String, java.lang.Double, java.lang.String, boolean, com.okinc.unify_trade.biz.BizInstrument):void (m)] (LINE:17) call: com.okinc.unify_trade.trade.source.search.OkBizSearchInfo.<init>(java.lang.String, java.lang.Double, java.lang.String, boolean, com.okinc.unify_trade.biz.BizInstrument):void type: THIS */
    public /* synthetic */ OkBizSearchInfo(String str, Double d, String str2, boolean z, BizInstrument bizInstrument, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, d, str2, z, bizInstrument);
    }
}
