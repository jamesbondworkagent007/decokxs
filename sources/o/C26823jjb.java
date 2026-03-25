package o;

import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlChartVos;
import com.okinc.business.invest_biz.data.bean.CandleResultTvlInfo;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.ui.bean.InvestKLineCandleInfo;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jjb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26823jjb {
    @yCM
    public C26823jjb() {
    }

    public final C27398juT copydefault(@NotNull CandleResultTvlInfo candleResultTvlInfo, @NotNull ChartInterval chartInterval) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(candleResultTvlInfo, "");
        Intrinsics.checkNotNullParameter(chartInterval, "");
        java.util.List<CandleResultTvlChartVos> chartVos = candleResultTvlInfo.getChartVos();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(chartVos, 10));
        int i3 = 0;
        for (java.lang.Object obj : chartVos) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            CandleResultTvlChartVos candleResultTvlChartVos = (CandleResultTvlChartVos) obj;
            arrayList.add(new InvestKLineDataPoint(i3, InvestKLineDataPoint.Type.NORMAL, C33129mqd.djBIcL(candleResultTvlChartVos.getTvl()), candleResultTvlChartVos.getTimestamp(), new InvestKLineCandleInfo(candleResultTvlChartVos.getTvl(), java.lang.String.valueOf(candleResultTvlChartVos.getTimestamp()), candleResultTvlChartVos.getLimitValue(), null, 8, null), null, 32, null));
            i3++;
        }
        java.util.Iterator<CandleResultTvlChartVos> it = chartVos.iterator();
        int i4 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getLimitValue() == 1) {
                i = i4;
                break;
            }
            i4++;
        }
        java.util.Iterator<CandleResultTvlChartVos> it2 = chartVos.iterator();
        int i5 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            if (it2.next().getLimitValue() == -1) {
                i2 = i5;
                break;
            }
            i5++;
        }
        CandleResultTvlChartVos candleResultTvlChartVos2 = i == -1 ? null : chartVos.get(i);
        CandleResultTvlChartVos candleResultTvlChartVos3 = i2 == -1 ? null : chartVos.get(i2);
        java.lang.String tvl = candleResultTvlChartVos2 != null ? candleResultTvlChartVos2.getTvl() : null;
        if (tvl == null) {
            tvl = "";
        }
        if (tvl.length() != 0) {
            tvl = C27586jxw.localizeLargeValueStrategy$default(C27586jxw.OLrzqt, C33129mqd.EZpvd(tvl), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 10, null);
        }
        java.lang.String str = tvl;
        java.lang.String tvl2 = candleResultTvlChartVos3 != null ? candleResultTvlChartVos3.getTvl() : null;
        java.lang.String strLocalizeLargeValueStrategy$default = tvl2 != null ? tvl2 : "";
        if (strLocalizeLargeValueStrategy$default.length() != 0) {
            strLocalizeLargeValueStrategy$default = C27586jxw.localizeLargeValueStrategy$default(C27586jxw.OLrzqt, C33129mqd.EZpvd(strLocalizeLargeValueStrategy$default), null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 10, null);
        }
        return new C27398juT(chartInterval, new C23949iPh(C56402yEa.EZpvd(arrayList), yDY.AhwBna(), yDY.AhwBna()), false, null, null, str, i, strLocalizeLargeValueStrategy$default, i2, chartVos.size(), false, false, null, 7196, null);
    }
}
