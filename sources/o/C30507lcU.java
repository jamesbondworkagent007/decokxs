package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.autosell.data.TPSLConfigItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30507lcU {
    public static final AdvancedAutoSellStrategy KWHzl(@NotNull TPSLConfigItem tPSLConfigItem) {
        Intrinsics.checkNotNullParameter(tPSLConfigItem, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(tPSLConfigItem.getChangeScale()));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Double.valueOf(tPSLConfigItem.getSellScale()));
        int sellType = tPSLConfigItem.getSellType();
        if (sellType == 1) {
            return new AdvancedAutoSellStrategy.TakeProfit(strGEmmrt, strGEmmrt2, true, tPSLConfigItem.getRuleName(), tPSLConfigItem.getRuleDesc(), tPSLConfigItem.getId());
        }
        if (sellType == 2) {
            return new AdvancedAutoSellStrategy.StopLoss("-" + strGEmmrt, strGEmmrt2, true, tPSLConfigItem.getRuleName(), tPSLConfigItem.getRuleDesc(), tPSLConfigItem.getId());
        }
        throw new java.lang.UnsupportedOperationException("Unsupported sellType: " + tPSLConfigItem.getSellType());
    }

    public static final java.util.List<AdvancedAutoSellStrategy> EZpvd(@NotNull java.util.List<TPSLConfigItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((TPSLConfigItem) it.next()));
        }
        return arrayList;
    }
}
