package o;

import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWL {
    public static final qWL copydefault = new qWL();

    private qWL() {
    }

    public final java.util.List<WatchListData> copydefault(@NotNull java.util.List<WatchListData> list, @NotNull java.util.List<WatchListData> list2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        int i = 0;
        if (z) {
            if (list2.size() < list.size()) {
                return list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(list2);
            java.lang.String strOLrzqt = qWJ.OLrzqt(list.get(0));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i2 = 0;
            for (java.lang.Object obj : arrayList) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                java.lang.Integer numValueOf = Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) qWJ.OLrzqt((WatchListData) obj)) ? java.lang.Integer.valueOf(i2) : null;
                if (numValueOf != null) {
                    arrayList2.add(numValueOf);
                }
                i2++;
            }
            if (!arrayList2.isEmpty()) {
                for (java.lang.Object obj2 : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    WatchListData watchListData = (WatchListData) obj2;
                    int iIntValue = (i < 0 || i >= arrayList.size()) ? -1 : ((java.lang.Number) arrayList2.get(i)).intValue();
                    if (iIntValue >= 0) {
                        arrayList.set(iIntValue, watchListData);
                    }
                    i++;
                }
            }
            return arrayList;
        }
        if (list2.size() < list.size()) {
            return list;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.addAll(list2);
        for (java.lang.Object obj3 : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            arrayList3.set(i, (WatchListData) obj3);
            i++;
        }
        return arrayList3;
    }
}
