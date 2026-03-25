package com.okinc.business.dex.trade.copytrading.home.data;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradeStrategyNumResponse {
    public static final int $stable = 0;
    private final int maxActiveStrategyCount;
    private final int totalCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Illegal instructions before constructor call */
    public CopyTradeStrategyNumResponse() {
        int i = 0;
        this(i, i, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CopyTradeStrategyNumResponse copy$default(CopyTradeStrategyNumResponse copyTradeStrategyNumResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = copyTradeStrategyNumResponse.totalCount;
        }
        if ((i3 & 2) != 0) {
            i2 = copyTradeStrategyNumResponse.maxActiveStrategyCount;
        }
        return copyTradeStrategyNumResponse.copy(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.maxActiveStrategyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyTradeStrategyNumResponse copy(int i, int i2) {
        return new CopyTradeStrategyNumResponse(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopyTradeStrategyNumResponse)) {
            return false;
        }
        CopyTradeStrategyNumResponse copyTradeStrategyNumResponse = (CopyTradeStrategyNumResponse) obj;
        return this.totalCount == copyTradeStrategyNumResponse.totalCount && this.maxActiveStrategyCount == copyTradeStrategyNumResponse.maxActiveStrategyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxActiveStrategyCount() {
        return this.maxActiveStrategyCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.totalCount) * 31) + Integer.hashCode(this.maxActiveStrategyCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyTradeStrategyNumResponse(totalCount=" + this.totalCount + ", maxActiveStrategyCount=" + this.maxActiveStrategyCount + ")";
    }

    public CopyTradeStrategyNumResponse(int i, int i2) {
        this.totalCount = i;
        this.maxActiveStrategyCount = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(int, int):void (m)] (LINE:299) call: com.okinc.business.dex.trade.copytrading.home.data.CopyTradeStrategyNumResponse.<init>(int, int):void type: THIS */
    public /* synthetic */ CopyTradeStrategyNumResponse(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
