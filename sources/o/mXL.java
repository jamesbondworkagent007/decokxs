package o;

import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.dexkline.market.data.model.LiquidityChartData;
import com.okinc.dexkline.market.data.model.LiquidityData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mXL {
    public static final java.util.List<ChartDataUIItem> AEQbTJ(@NotNull LiquidityChartData liquidityChartData) {
        Intrinsics.checkNotNullParameter(liquidityChartData, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<LiquidityData> results = liquidityChartData.getResults();
        if (results != null) {
            for (LiquidityData liquidityData : results) {
                java.lang.String timestamp = liquidityData.getTimestamp();
                java.lang.String str = timestamp == null ? "" : timestamp;
                java.lang.String value = liquidityData.getValue();
                arrayList.add(new ChartDataUIItem(str, value == null ? "" : value, null, 4, null));
            }
        }
        return arrayList;
    }
}
