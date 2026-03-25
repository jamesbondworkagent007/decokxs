package o;

import com.okinc.business.invest_biz.data.bean.response.Points;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23649iEe {
    @yCM
    public C23649iEe() {
    }

    public final iEH EZpvd(@NotNull Points points) {
        Intrinsics.checkNotNullParameter(points, "");
        java.util.List<com.okinc.business.invest_biz.data.bean.response.Point> listOLrzqt = points.KWHzl().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (com.okinc.business.invest_biz.data.bean.response.Point point : listOLrzqt) {
            arrayList.add(new iEG(point.EZpvd(), point.KWHzl(), point.AEQbTJ(), point.OLrzqt()));
        }
        return new iEH(points.copydefault(), points.AEQbTJ(), points.OLrzqt(), points.KWHzl().EZpvd(), arrayList);
    }
}
