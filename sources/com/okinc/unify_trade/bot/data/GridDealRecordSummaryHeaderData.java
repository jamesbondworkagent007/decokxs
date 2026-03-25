package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridDealRecordSummaryHeaderData {
    public static final int $stable = 0;
    private final String arbitrageCount;
    private final String averageArbitrage;
    private final String execution;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridDealRecordSummaryHeaderData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridDealRecordSummaryHeaderData copy$default(GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridDealRecordSummaryHeaderData.averageArbitrage;
        }
        if ((i & 2) != 0) {
            str2 = gridDealRecordSummaryHeaderData.execution;
        }
        if ((i & 4) != 0) {
            str3 = gridDealRecordSummaryHeaderData.arbitrageCount;
        }
        return gridDealRecordSummaryHeaderData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.averageArbitrage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.execution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.arbitrageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridDealRecordSummaryHeaderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new GridDealRecordSummaryHeaderData(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridDealRecordSummaryHeaderData)) {
            return false;
        }
        GridDealRecordSummaryHeaderData gridDealRecordSummaryHeaderData = (GridDealRecordSummaryHeaderData) obj;
        return Intrinsics.EZpvd((Object) this.averageArbitrage, (Object) gridDealRecordSummaryHeaderData.averageArbitrage) && Intrinsics.EZpvd((Object) this.execution, (Object) gridDealRecordSummaryHeaderData.execution) && Intrinsics.EZpvd((Object) this.arbitrageCount, (Object) gridDealRecordSummaryHeaderData.arbitrageCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getArbitrageCount() {
        return this.arbitrageCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageArbitrage() {
        return this.averageArbitrage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExecution() {
        return this.execution;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.averageArbitrage.hashCode() * 31) + this.execution.hashCode()) * 31) + this.arbitrageCount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridDealRecordSummaryHeaderData(averageArbitrage=" + this.averageArbitrage + ", execution=" + this.execution + ", arbitrageCount=" + this.arbitrageCount + ")";
    }

    public GridDealRecordSummaryHeaderData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.averageArbitrage = str;
        this.execution = str2;
        this.arbitrageCount = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1187) call: com.okinc.unify_trade.bot.data.GridDealRecordSummaryHeaderData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GridDealRecordSummaryHeaderData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
