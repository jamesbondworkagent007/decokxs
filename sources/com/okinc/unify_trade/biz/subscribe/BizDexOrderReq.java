package com.okinc.unify_trade.biz.subscribe;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.biz.StrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BizDexOrderReq {
    public static final int $stable = 8;
    private String chainIndex;
    private boolean hasWs;
    private String instId;
    private String instType;
    private String limit;
    private String ordType;
    private StrategyType originType;
    private boolean supportDex;
    private String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizDexOrderReq() {
        this(null, null, null, null, null, null, false, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasWs() {
        return this.hasWs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimit() {
        return this.limit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StrategyType getOriginType() {
        return this.originType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportDex() {
        return this.supportDex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(String str) {
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasWs(boolean z) {
        this.hasWs = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(String str) {
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLimit(String str) {
        this.limit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginType(@NotNull StrategyType strategyType) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.originType = strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportDex(boolean z) {
        this.supportDex = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    public BizDexOrderReq(String str, String str2, String str3, String str4, String str5, String str6, boolean z, @NotNull StrategyType strategyType, boolean z2) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.instType = str;
        this.instId = str2;
        this.ordType = str3;
        this.tokenAddress = str4;
        this.chainIndex = str5;
        this.limit = str6;
        this.hasWs = z;
        this.originType = strategyType;
        this.supportDex = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0053: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r19v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:com.okinc.biz.StrategyType:?: TERNARY null = ((wrap:int:0x0034: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0038: SGET  A[WRAPPED] (LINE:65) com.okinc.biz.StrategyType.LIMIT com.okinc.biz.StrategyType) : (r17v0 com.okinc.biz.StrategyType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r19v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.StrategyType, boolean):void (m)] (LINE:57) call: com.okinc.unify_trade.biz.subscribe.BizDexOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.StrategyType, boolean):void type: THIS */
    public /* synthetic */ BizDexOrderReq(String str, String str2, String str3, String str4, String str5, String str6, boolean z, StrategyType strategyType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null, (i & 64) != 0 ? true : z, (i & 128) != 0 ? StrategyType.LIMIT : strategyType, (i & 256) != 0 ? false : z2);
    }
}
