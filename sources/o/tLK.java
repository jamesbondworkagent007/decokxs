package o;

import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlChartDataPoint;
import com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tLK {
    public static final HistoryTotalPnlChartDataPoint OLrzqt(@NotNull HistoryTotalPnlData historyTotalPnlData) {
        Intrinsics.checkNotNullParameter(historyTotalPnlData, "");
        return new HistoryTotalPnlChartDataPoint(C33129mqd.djBIcL(historyTotalPnlData.copydefault()), C33129mqd.valueOf(historyTotalPnlData.AEQbTJ()), historyTotalPnlData.EZpvd(), null);
    }
}
