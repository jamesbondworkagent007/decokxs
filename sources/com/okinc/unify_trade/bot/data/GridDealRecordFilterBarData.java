package com.okinc.unify_trade.bot.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridDealRecordFilterBarData {
    public static final int $stable = 0;
    private final boolean showHover;
    private final String unit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridDealRecordFilterBarData copy$default(GridDealRecordFilterBarData gridDealRecordFilterBarData, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridDealRecordFilterBarData.unit;
        }
        if ((i & 2) != 0) {
            z = gridDealRecordFilterBarData.showHover;
        }
        return gridDealRecordFilterBarData.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.showHover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridDealRecordFilterBarData copy(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridDealRecordFilterBarData(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridDealRecordFilterBarData)) {
            return false;
        }
        GridDealRecordFilterBarData gridDealRecordFilterBarData = (GridDealRecordFilterBarData) obj;
        return Intrinsics.EZpvd((Object) this.unit, (Object) gridDealRecordFilterBarData.unit) && this.showHover == gridDealRecordFilterBarData.showHover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowHover() {
        return this.showHover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.unit.hashCode() * 31) + Boolean.hashCode(this.showHover);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridDealRecordFilterBarData(unit=" + this.unit + ", showHover=" + this.showHover + ")";
    }

    public GridDealRecordFilterBarData(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unit = str;
        this.showHover = z;
    }
}
