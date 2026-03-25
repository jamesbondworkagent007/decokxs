package o;

import com.okinc.planet.biz_plugin.future.data.FilteredOrderPoints;
import com.okinc.planet.biz_plugin.future.data.FilteringStatistics;
import com.okinc.tradeshare.api.TradeHisPositionHisOrderPlanetBean;
import com.okinc.tradeshare.api.TradeTickerChartEntry;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tBN {
    public static final tBN AEQbTJ = new tBN();

    private tBN() {
    }

    public final long KWHzl(@NotNull TradeTickerChartEntry tradeTickerChartEntry) {
        Intrinsics.checkNotNullParameter(tradeTickerChartEntry, "");
        return C33129mqd.valueOf(tradeTickerChartEntry.getTimestamp());
    }

    public final long AEQbTJ(@NotNull TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean) {
        Intrinsics.checkNotNullParameter(tradeHisPositionHisOrderPlanetBean, "");
        return C33129mqd.valueOf(tradeHisPositionHisOrderPlanetBean.getTimestamp());
    }

    public final boolean OLrzqt(@NotNull TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean) {
        Intrinsics.checkNotNullParameter(tradeHisPositionHisOrderPlanetBean, "");
        return C59449zhJ.gEmmrt(tradeHisPositionHisOrderPlanetBean.getSide(), "buy", true);
    }

    public final boolean EZpvd(@NotNull TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean) {
        Intrinsics.checkNotNullParameter(tradeHisPositionHisOrderPlanetBean, "");
        return C59449zhJ.gEmmrt(tradeHisPositionHisOrderPlanetBean.getSide(), "sell", true);
    }

    public final FilteredOrderPoints EZpvd(@NotNull java.util.List<TradeTickerChartEntry> list, @NotNull java.util.List<TradeHisPositionHisOrderPlanetBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        if (list.isEmpty() || list2.isEmpty()) {
            return new FilteredOrderPoints(yDY.AhwBna(), yDY.AhwBna());
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator());
        java.util.List<TradeHisPositionHisOrderPlanetBean> listEZpvd2 = CollectionsKt___CollectionsKt.EZpvd(list2, new ActionBar());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        long jKWHzl = KWHzl((TradeTickerChartEntry) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd));
        TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean = null;
        TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean2 = null;
        for (TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean3 : listEZpvd2) {
            if (AEQbTJ(tradeHisPositionHisOrderPlanetBean3) >= jKWHzl) {
                break;
            }
            if (OLrzqt(tradeHisPositionHisOrderPlanetBean3)) {
                tradeHisPositionHisOrderPlanetBean2 = tradeHisPositionHisOrderPlanetBean3;
            }
            if (EZpvd(tradeHisPositionHisOrderPlanetBean3)) {
                tradeHisPositionHisOrderPlanetBean = tradeHisPositionHisOrderPlanetBean3;
            }
        }
        if (tradeHisPositionHisOrderPlanetBean2 != null) {
            arrayList.add(tradeHisPositionHisOrderPlanetBean2);
        }
        if (tradeHisPositionHisOrderPlanetBean != null) {
            arrayList2.add(tradeHisPositionHisOrderPlanetBean);
        }
        int size = listEZpvd.size();
        int i = 0;
        while (i < size) {
            long jKWHzl2 = KWHzl((TradeTickerChartEntry) listEZpvd.get(i));
            long jKWHzl3 = i < listEZpvd.size() + (-1) ? KWHzl((TradeTickerChartEntry) listEZpvd.get(i + 1)) : Long.MAX_VALUE;
            TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean4 = null;
            TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean5 = null;
            for (TradeHisPositionHisOrderPlanetBean tradeHisPositionHisOrderPlanetBean6 : listEZpvd2) {
                long jAEQbTJ = AEQbTJ(tradeHisPositionHisOrderPlanetBean6);
                if (jAEQbTJ >= jKWHzl2) {
                    if (jAEQbTJ >= jKWHzl3) {
                        break;
                    }
                    if (tradeHisPositionHisOrderPlanetBean4 == null && OLrzqt(tradeHisPositionHisOrderPlanetBean6)) {
                        tradeHisPositionHisOrderPlanetBean4 = tradeHisPositionHisOrderPlanetBean6;
                    }
                    if (tradeHisPositionHisOrderPlanetBean5 == null && EZpvd(tradeHisPositionHisOrderPlanetBean6)) {
                        tradeHisPositionHisOrderPlanetBean5 = tradeHisPositionHisOrderPlanetBean6;
                    }
                    if (tradeHisPositionHisOrderPlanetBean4 != null && tradeHisPositionHisOrderPlanetBean5 != null) {
                        break;
                    }
                }
            }
            if (tradeHisPositionHisOrderPlanetBean4 != null) {
                arrayList.add(tradeHisPositionHisOrderPlanetBean4);
            }
            if (tradeHisPositionHisOrderPlanetBean5 != null) {
                arrayList2.add(tradeHisPositionHisOrderPlanetBean5);
            }
            i++;
        }
        return new FilteredOrderPoints(arrayList, arrayList2);
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            tBN tbn = tBN.AEQbTJ;
            return yET.KWHzl(java.lang.Long.valueOf(tbn.AEQbTJ((TradeHisPositionHisOrderPlanetBean) t)), java.lang.Long.valueOf(tbn.AEQbTJ((TradeHisPositionHisOrderPlanetBean) t2)));
        }
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            tBN tbn = tBN.AEQbTJ;
            return yET.KWHzl(java.lang.Long.valueOf(tbn.KWHzl((TradeTickerChartEntry) t)), java.lang.Long.valueOf(tbn.KWHzl((TradeTickerChartEntry) t2)));
        }
    }

    public final kotlin.Pair<FilteredOrderPoints, FilteringStatistics> AEQbTJ(@NotNull java.util.List<TradeTickerChartEntry> list, @NotNull java.util.List<TradeHisPositionHisOrderPlanetBean> list2) {
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        boolean z = list2 instanceof java.util.Collection;
        int i2 = 0;
        if (z && list2.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = list2.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                if (AEQbTJ.OLrzqt((TradeHisPositionHisOrderPlanetBean) it.next()) && (i3 = i3 + 1) < 0) {
                    yDY.djBIcL();
                }
            }
            i = i3;
        }
        if (!z || !list2.isEmpty()) {
            java.util.Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (AEQbTJ.EZpvd((TradeHisPositionHisOrderPlanetBean) it2.next()) && (i2 = i2 + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        int i4 = i2;
        FilteredOrderPoints filteredOrderPointsEZpvd = EZpvd(list, list2);
        return C56390yDp.OLrzqt(filteredOrderPointsEZpvd, new FilteringStatistics(i, i4, filteredOrderPointsEZpvd.getBuyOrders().size(), filteredOrderPointsEZpvd.getSellOrders().size(), list.size()));
    }
}
