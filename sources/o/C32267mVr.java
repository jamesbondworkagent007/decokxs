package o;

import com.okinc.dexkline.market.data.model.MarketBuySellKLinePoint;
import com.okinc.dexkline.market.features.coindetail.ui.label.LabelFilter;
import com.okinc.kline.data.HistoryOrderData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32267mVr {
    public static final HistoryOrderData copydefault(@NotNull MarketBuySellKLinePoint marketBuySellKLinePoint) {
        LabelFilter.TaskDescription taskDescription;
        LabelFilter labelFilterOLrzqt;
        Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
        java.lang.Integer numValueOf = (marketBuySellKLinePoint.AEQbTJ().length() == 0 || (labelFilterOLrzqt = (taskDescription = LabelFilter.Companion).OLrzqt(marketBuySellKLinePoint.AEQbTJ())) == null) ? null : java.lang.Integer.valueOf(taskDescription.EZpvd(labelFilterOLrzqt));
        return new HistoryOrderData(marketBuySellKLinePoint.djBIcL(), marketBuySellKLinePoint.KWHzl(), marketBuySellKLinePoint.EZpvd(), marketBuySellKLinePoint.OLrzqt(), marketBuySellKLinePoint.copydefault(), "(" + marketBuySellKLinePoint.EZpvd() + ")", "(" + marketBuySellKLinePoint.copydefault() + ")", numValueOf, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDGTeJD)), false, false, 1536, null);
    }

    public static final java.util.List<HistoryOrderData> EZpvd(@NotNull java.util.List<MarketBuySellKLinePoint> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((MarketBuySellKLinePoint) it.next()));
        }
        return arrayList;
    }
}
