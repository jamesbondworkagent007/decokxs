package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridDealRecordArbitrageRecordHeaderData {
    public static final int $stable = 0;
    private final String gridProfit;
    private final int gridProfitTextColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridDealRecordArbitrageRecordHeaderData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridDealRecordArbitrageRecordHeaderData copy$default(GridDealRecordArbitrageRecordHeaderData gridDealRecordArbitrageRecordHeaderData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gridDealRecordArbitrageRecordHeaderData.gridProfit;
        }
        if ((i2 & 2) != 0) {
            i = gridDealRecordArbitrageRecordHeaderData.gridProfitTextColor;
        }
        return gridDealRecordArbitrageRecordHeaderData.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.gridProfitTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridDealRecordArbitrageRecordHeaderData copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridDealRecordArbitrageRecordHeaderData(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridDealRecordArbitrageRecordHeaderData)) {
            return false;
        }
        GridDealRecordArbitrageRecordHeaderData gridDealRecordArbitrageRecordHeaderData = (GridDealRecordArbitrageRecordHeaderData) obj;
        return Intrinsics.EZpvd((Object) this.gridProfit, (Object) gridDealRecordArbitrageRecordHeaderData.gridProfit) && this.gridProfitTextColor == gridDealRecordArbitrageRecordHeaderData.gridProfitTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getGridProfitTextColor() {
        return this.gridProfitTextColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.gridProfit.hashCode() * 31) + Integer.hashCode(this.gridProfitTextColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridDealRecordArbitrageRecordHeaderData(gridProfit=" + this.gridProfit + ", gridProfitTextColor=" + this.gridProfitTextColor + ")";
    }

    public GridDealRecordArbitrageRecordHeaderData(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gridProfit = str;
        this.gridProfitTextColor = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
 A[MD:(java.lang.String, int):void (m)] (LINE:1194) call: com.okinc.unify_trade.bot.data.GridDealRecordArbitrageRecordHeaderData.<init>(java.lang.String, int):void type: THIS */
    public /* synthetic */ GridDealRecordArbitrageRecordHeaderData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
