package o;

import com.github.mikephil.charting.charts.CombinedChart;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.okinc.business.market.features.vibes.ui.chart.TrendPosition;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class kBS {
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    public static final TrendPosition EZpvd(@NotNull CombinedChart combinedChart, int i) {
        LineData lineData;
        java.util.List<T> dataSets;
        ILineDataSet iLineDataSet;
        Intrinsics.checkNotNullParameter(combinedChart, "");
        CombinedData combinedData = (CombinedData) combinedChart.getData();
        if (combinedData == null || (lineData = combinedData.getLineData()) == null || (dataSets = lineData.getDataSets()) == 0 || (iLineDataSet = (ILineDataSet) CollectionsKt___CollectionsKt.AkhnZx(dataSets, 0)) == null) {
            return TrendPosition.ABOVE;
        }
        if (i <= 0 || i >= iLineDataSet.getEntryCount()) {
            return TrendPosition.ABOVE;
        }
        if (iLineDataSet.getEntryForIndex(i).getY() >= iLineDataSet.getEntryForIndex(i - 1).getY()) {
            return TrendPosition.ABOVE;
        }
        return TrendPosition.BELOW;
    }
}
