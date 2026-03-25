package o;

import com.okinc.business.market.data.model.MarketBuySellKLinePoint;
import com.okinc.kline.data.HistoryOrderData;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27602jyL {
    public static final HistoryOrderData OLrzqt(@NotNull MarketBuySellKLinePoint marketBuySellKLinePoint) {
        Intrinsics.checkNotNullParameter(marketBuySellKLinePoint, "");
        return new HistoryOrderData(marketBuySellKLinePoint.AhwBna(), marketBuySellKLinePoint.copydefault(), marketBuySellKLinePoint.OLrzqt(), marketBuySellKLinePoint.KWHzl(), marketBuySellKLinePoint.EZpvd(), "(" + marketBuySellKLinePoint.OLrzqt() + ")", "(" + marketBuySellKLinePoint.EZpvd() + ")", marketBuySellKLinePoint.AEQbTJ().length() == 0 ? null : C25628jAl.copydefault(marketBuySellKLinePoint.AEQbTJ()), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DcMfJKDGTeJD)), false, false, 1536, null);
    }

    public static final java.util.List<HistoryOrderData> EZpvd(@NotNull java.util.List<MarketBuySellKLinePoint> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((MarketBuySellKLinePoint) it.next()));
        }
        return arrayList;
    }
}
