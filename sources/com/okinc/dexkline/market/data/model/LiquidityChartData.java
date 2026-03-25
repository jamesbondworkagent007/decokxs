package com.okinc.dexkline.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class LiquidityChartData {
    public static final int $stable = 8;
    private final List<LiquidityData> results;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityChartData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.market.data.model.LiquidityChartData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityChartData copy$default(LiquidityChartData liquidityChartData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liquidityChartData.results;
        }
        return liquidityChartData.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LiquidityData> component1() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityChartData copy(List<LiquidityData> list) {
        return new LiquidityChartData(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiquidityChartData) && Intrinsics.EZpvd(this.results, ((LiquidityChartData) obj).results);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LiquidityData> getResults() {
        return this.results;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<LiquidityData> list = this.results;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityChartData(results=" + this.results + ")";
    }

    public LiquidityChartData(List<LiquidityData> list) {
        this.results = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.dexkline.market.data.model.LiquidityData>):void (m)] (LINE:6) call: com.okinc.dexkline.market.data.model.LiquidityChartData.<init>(java.util.List):void type: THIS */
    public /* synthetic */ LiquidityChartData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
