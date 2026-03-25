package o;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.market.data.model.holder.HolderChartData;
import com.okinc.business.market.data.model.holder.HolderChartItemData;
import com.okinc.business.market.data.model.holder.HolderTopChartItemData;
import com.okinc.business.market.data.model.holder.HoldingItemData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jQz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C26074jQz {
    public static final jQD OLrzqt(@NotNull HolderChartData holderChartData) {
        Intrinsics.checkNotNullParameter(holderChartData, "");
        java.util.List<HolderChartItemData> holderChangeList1Day = holderChartData.getHolderChangeList1Day();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(holderChangeList1Day, 10));
        java.util.Iterator<T> it = holderChangeList1Day.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((HolderChartItemData) it.next()));
        }
        java.util.List<HolderChartItemData> holderChangeList7Day = holderChartData.getHolderChangeList7Day();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(holderChangeList7Day, 10));
        java.util.Iterator<T> it2 = holderChangeList7Day.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AEQbTJ((HolderChartItemData) it2.next()));
        }
        java.util.List<HolderTopChartItemData> top10HolderList = holderChartData.getTop10HolderList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(top10HolderList, 10));
        java.util.Iterator<T> it3 = top10HolderList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AEQbTJ((HolderTopChartItemData) it3.next()));
        }
        java.util.List<HolderTopChartItemData> top50HolderList = holderChartData.getTop50HolderList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(top50HolderList, 10));
        java.util.Iterator<T> it4 = top50HolderList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(AEQbTJ((HolderTopChartItemData) it4.next()));
        }
        java.util.List<HolderTopChartItemData> top100HolderList = holderChartData.getTop100HolderList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(top100HolderList, 10));
        java.util.Iterator<T> it5 = top100HolderList.iterator();
        while (it5.hasNext()) {
            arrayList5.add(AEQbTJ((HolderTopChartItemData) it5.next()));
        }
        java.util.List<HoldingItemData> devHolderList = holderChartData.getDevHolderList();
        java.util.ArrayList arrayList6 = new java.util.ArrayList(C56403yEb.AYXKKw(devHolderList, 10));
        java.util.Iterator<T> it6 = devHolderList.iterator();
        while (it6.hasNext()) {
            arrayList6.add(KWHzl((HoldingItemData) it6.next()));
        }
        java.util.List<HoldingItemData> suspiciousHolderList = holderChartData.getSuspiciousHolderList();
        java.util.ArrayList arrayList7 = new java.util.ArrayList(C56403yEb.AYXKKw(suspiciousHolderList, 10));
        java.util.Iterator<T> it7 = suspiciousHolderList.iterator();
        while (it7.hasNext()) {
            arrayList7.add(KWHzl((HoldingItemData) it7.next()));
        }
        java.util.List<HoldingItemData> suspectedRatTradingHolderList = holderChartData.getSuspectedRatTradingHolderList();
        java.util.ArrayList arrayList8 = new java.util.ArrayList(C56403yEb.AYXKKw(suspectedRatTradingHolderList, 10));
        java.util.Iterator<T> it8 = suspectedRatTradingHolderList.iterator();
        while (it8.hasNext()) {
            arrayList8.add(KWHzl((HoldingItemData) it8.next()));
        }
        java.util.List<HoldingItemData> top100AvgHoldingList = holderChartData.getTop100AvgHoldingList();
        java.util.ArrayList arrayList9 = new java.util.ArrayList(C56403yEb.AYXKKw(top100AvgHoldingList, 10));
        java.util.Iterator<T> it9 = top100AvgHoldingList.iterator();
        while (it9.hasNext()) {
            arrayList9.add(KWHzl((HoldingItemData) it9.next()));
        }
        java.util.List<HoldingItemData> greaterThan10uHoldingList = holderChartData.getGreaterThan10uHoldingList();
        java.util.ArrayList arrayList10 = new java.util.ArrayList(C56403yEb.AYXKKw(greaterThan10uHoldingList, 10));
        java.util.Iterator<T> it10 = greaterThan10uHoldingList.iterator();
        while (it10.hasNext()) {
            arrayList10.add(KWHzl((HoldingItemData) it10.next()));
        }
        java.lang.String totalHolderAmount = holderChartData.getTotalHolderAmount();
        return new jQD(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, totalHolderAmount == null ? "" : totalHolderAmount);
    }

    public static final ChartDataUIItem AEQbTJ(@NotNull HolderChartItemData holderChartItemData) {
        Intrinsics.checkNotNullParameter(holderChartItemData, "");
        java.lang.String holdingTime = holderChartItemData.getHoldingTime();
        java.lang.String str = holdingTime == null ? "" : holdingTime;
        java.lang.String holdersAmount = holderChartItemData.getHoldersAmount();
        return new ChartDataUIItem(str, holdersAmount == null ? "" : holdersAmount, null, 4, null);
    }

    public static final ChartDataUIItem AEQbTJ(@NotNull HolderTopChartItemData holderTopChartItemData) {
        Intrinsics.checkNotNullParameter(holderTopChartItemData, "");
        java.lang.String holdTime = holderTopChartItemData.getHoldTime();
        if (holdTime == null) {
            holdTime = "";
        }
        java.lang.String holdAmount = holderTopChartItemData.getHoldAmount();
        if (holdAmount == null) {
            holdAmount = "";
        }
        java.lang.String holdAmountPercentage = holderTopChartItemData.getHoldAmountPercentage();
        return new ChartDataUIItem(holdTime, holdAmount, holdAmountPercentage != null ? holdAmountPercentage : "");
    }

    public static final ChartDataUIItem KWHzl(@NotNull HoldingItemData holdingItemData) {
        Intrinsics.checkNotNullParameter(holdingItemData, "");
        return new ChartDataUIItem(holdingItemData.getDataTime(), holdingItemData.getDataValue(), null, 4, null);
    }
}
