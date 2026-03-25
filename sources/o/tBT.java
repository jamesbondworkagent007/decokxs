package o;

import com.okinc.planet.widget.chart.MarkerSide;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tBT {
    public static final InterfaceC46484tWa AEQbTJ(@NotNull TradeTickerChartEntry tradeTickerChartEntry) {
        Intrinsics.checkNotNullParameter(tradeTickerChartEntry, "");
        long jValueOf = C33129mqd.valueOf(tradeTickerChartEntry.getTimestamp());
        java.lang.Float fFIwbmz = C59443zhD.fIwbmz(tradeTickerChartEntry.getClosePrice());
        return new tVX(jValueOf, java.lang.Float.valueOf(fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f));
    }

    public static final C46487tWd copydefault(@NotNull TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean) {
        Intrinsics.checkNotNullParameter(tradeHisPositionHisOrderPlanetBean, "");
        java.lang.String lowerCase = tradeHisPositionHisOrderPlanetBean.getSide().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        MarkerSide markerSide = (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "sell")) ? MarkerSide.SELL : MarkerSide.BUY;
        long jValueOf = C33129mqd.valueOf(tradeHisPositionHisOrderPlanetBean.getTimestamp());
        java.lang.Float fFIwbmz = C59443zhD.fIwbmz(tradeHisPositionHisOrderPlanetBean.getFillPx());
        return new C46487tWd(jValueOf, java.lang.Float.valueOf(fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f), markerSide);
    }

    public static final java.util.List<InterfaceC46484tWa> OLrzqt(@NotNull java.util.List<TradeTickerChartEntry> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((TradeTickerChartEntry) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<C46487tWd> KWHzl(@NotNull java.util.List<TradeHisPositionHisOrderPlanetBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((TradeHisPositionHisOrderPlanetBean) it.next()));
        }
        return arrayList;
    }
}
