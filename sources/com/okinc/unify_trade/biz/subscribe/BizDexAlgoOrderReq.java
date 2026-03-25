package com.okinc.unify_trade.biz.subscribe;

import com.okinc.biz.StrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BizDexAlgoOrderReq {
    public static final int $stable = 8;
    private String chainIndex;
    private boolean hasWs;
    private String limit;
    private String ordType;
    private StrategyType originType;
    private boolean supportDex;
    private String tokenAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizDexAlgoOrderReq() {
        this(null, null, null, null, false, null, false, 127, null);
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

    public BizDexAlgoOrderReq(String str, String str2, String str3, String str4, boolean z, @NotNull StrategyType strategyType, boolean z2) {
        Intrinsics.checkNotNullParameter(strategyType, "");
        this.ordType = str;
        this.tokenAddress = str2;
        this.chainIndex = str3;
        this.limit = str4;
        this.hasWs = z;
        this.originType = strategyType;
        this.supportDex = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:com.okinc.biz.StrategyType:0x0028: TERNARY null = ((wrap:int:0x0022: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.biz.StrategyType:0x0026: SGET  A[WRAPPED] (LINE:76) com.okinc.biz.StrategyType.LIMIT com.okinc.biz.StrategyType) : (r11v0 com.okinc.biz.StrategyType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r12v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.StrategyType, boolean):void (m)] (LINE:70) call: com.okinc.unify_trade.biz.subscribe.BizDexAlgoOrderReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.biz.StrategyType, boolean):void type: THIS */
    public /* synthetic */ BizDexAlgoOrderReq(String str, String str2, String str3, String str4, boolean z, StrategyType strategyType, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? true : z, (i & 32) != 0 ? StrategyType.LIMIT : strategyType, (i & 64) != 0 ? false : z2);
    }
}
