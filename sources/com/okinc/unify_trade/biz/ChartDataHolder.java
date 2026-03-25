package com.okinc.unify_trade.biz;

import com.github.mikephil.charting.data.Entry;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ChartDataHolder {
    public static final int $stable = 8;
    private final List<Entry> entries;
    private final List<Entry> fallDataSet;
    private final float maxY;
    private final float minY;
    private final List<Entry> riseDataSet;
    private final int yLabelCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.ChartDataHolder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChartDataHolder copy$default(ChartDataHolder chartDataHolder, float f, float f2, List list, List list2, List list3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = chartDataHolder.maxY;
        }
        if ((i2 & 2) != 0) {
            f2 = chartDataHolder.minY;
        }
        float f3 = f2;
        if ((i2 & 4) != 0) {
            list = chartDataHolder.entries;
        }
        List list4 = list;
        if ((i2 & 8) != 0) {
            list2 = chartDataHolder.riseDataSet;
        }
        List list5 = list2;
        if ((i2 & 16) != 0) {
            list3 = chartDataHolder.fallDataSet;
        }
        List list6 = list3;
        if ((i2 & 32) != 0) {
            i = chartDataHolder.yLabelCount;
        }
        return chartDataHolder.copy(f, f3, list4, list5, list6, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.maxY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.minY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> component3() {
        return this.entries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> component4() {
        return this.riseDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> component5() {
        return this.fallDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.yLabelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChartDataHolder copy(float f, float f2, @NotNull List<? extends Entry> list, List<? extends Entry> list2, List<? extends Entry> list3, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ChartDataHolder(f, f2, list, list2, list3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChartDataHolder)) {
            return false;
        }
        ChartDataHolder chartDataHolder = (ChartDataHolder) obj;
        return Float.compare(this.maxY, chartDataHolder.maxY) == 0 && Float.compare(this.minY, chartDataHolder.minY) == 0 && Intrinsics.EZpvd(this.entries, chartDataHolder.entries) && Intrinsics.EZpvd(this.riseDataSet, chartDataHolder.riseDataSet) && Intrinsics.EZpvd(this.fallDataSet, chartDataHolder.fallDataSet) && this.yLabelCount == chartDataHolder.yLabelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> getEntries() {
        return this.entries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> getFallDataSet() {
        return this.fallDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMaxY() {
        return this.maxY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMinY() {
        return this.minY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Entry> getRiseDataSet() {
        return this.riseDataSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getYLabelCount() {
        return this.yLabelCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Float.hashCode(this.maxY);
        int iHashCode2 = Float.hashCode(this.minY);
        int iHashCode3 = this.entries.hashCode();
        List<Entry> list = this.riseDataSet;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<Entry> list2 = this.fallDataSet;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + Integer.hashCode(this.yLabelCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChartDataHolder(maxY=" + this.maxY + ", minY=" + this.minY + ", entries=" + this.entries + ", riseDataSet=" + this.riseDataSet + ", fallDataSet=" + this.fallDataSet + ", yLabelCount=" + this.yLabelCount + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.Entry> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.Entry> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<? extends com.github.mikephil.charting.data.Entry> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChartDataHolder(float f, float f2, @NotNull List<? extends Entry> list, List<? extends Entry> list2, List<? extends Entry> list3, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.maxY = f;
        this.minY = f2;
        this.entries = list;
        this.riseDataSet = list2;
        this.fallDataSet = list3;
        this.yLabelCount = i;
    }
}
