package o;

import com.okinc.business.market.bean.CoinQuote;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27994kKz {
    public static final C27994kKz KWHzl = new C27994kKz();

    private C27994kKz() {
    }

    public static /* synthetic */ void adjustResult$default(C27994kKz c27994kKz, java.util.List list, java.util.ArrayList arrayList, int i, java.lang.Boolean bool, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            bool = java.lang.Boolean.FALSE;
        }
        c27994kKz.EZpvd(list, arrayList, i, bool);
    }

    public final void EZpvd(@NotNull java.util.List<? extends qWH> list, @NotNull java.util.ArrayList<java.lang.Object> arrayList, int i, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List<java.lang.Object> listKWHzl = KWHzl(list);
        if (!listKWHzl.isEmpty()) {
            if (listKWHzl.size() > i) {
                arrayList.addAll(listKWHzl.subList(0, i));
                arrayList.add(new C27622jyf());
                return;
            } else {
                arrayList.addAll(listKWHzl);
                if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
                    arrayList.add(new C27622jyf());
                    return;
                }
                return;
            }
        }
        pUU.valueOf("ResultAdjuster", "have no data");
    }

    public final java.util.List<java.lang.Object> AEQbTJ(@NotNull java.util.List<? extends qWH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.Object> listKWHzl = KWHzl(list);
        return listKWHzl.isEmpty() ? yDY.AhwBna() : listKWHzl;
    }

    public final java.util.List<java.lang.Object> KWHzl(java.util.List<? extends qWH> list) {
        java.lang.Object objCopydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (qWH qwh : list) {
            if (qwh instanceof qWC) {
                qWC qwc = (qWC) qwh;
                CoinQuote coinQuoteKWHzl = qwc.KWHzl();
                int length = coinQuoteKWHzl.getInstId().length();
                objCopydefault = coinQuoteKWHzl;
                if (length <= 0) {
                    pUU.valueOf("ResultAdjuster", "BizFavItemVo CoinQuote instId is empty: " + qwc.AhwBna());
                    objCopydefault = null;
                }
            } else if (qwh instanceof qWG) {
                objCopydefault = ((qWG) qwh).copydefault();
            } else {
                pUU.valueOf("ResultAdjuster", "unknow data class: " + qwh.getClass().getSimpleName());
                objCopydefault = null;
            }
            if (objCopydefault != null) {
                arrayList.add(objCopydefault);
            }
        }
        return arrayList;
    }
}
